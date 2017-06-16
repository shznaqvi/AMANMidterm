package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.contract.FormsContract;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;

import static android.content.ContentValues.TAG;

public class AmanInfoActivity extends Activity {

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.biuc)
    EditText biuc;
    @BindView(R.id.biPara)
    EditText biPara;
    @BindView(R.id.biACHW)
    EditText biACHW;
    @BindView(R.id.biHH)
    EditText biHH;
    @BindView(R.id.bi01)
    RadioGroup bi01;
    @BindView(R.id.bi0101)
    RadioButton bi0101;
    @BindView(R.id.bi0102)
    RadioButton bi0102;
    @BindView(R.id.fldGrpbi01)
    LinearLayout fldGrpbi01;
    @BindView(R.id.bib01)
    EditText bib01;
    @BindView(R.id.bib02)
    RadioGroup bib02;
    @BindView(R.id.bib0201)
    RadioButton bib0201;
    @BindView(R.id.bib0202)
    RadioButton bib0202;
    @BindView(R.id.bib03)
    EditText bib03;
    @BindView(R.id.bib04)
    EditText bib04;
    @BindView(R.id.bib05)
    EditText bib05;
    @BindView(R.id.bib06)
    EditText bib06;
    @BindView(R.id.bib07)
    RadioGroup bib07;
    @BindView(R.id.bib0701)
    RadioButton bib0701;
    @BindView(R.id.bib0702)
    RadioButton bib0702;
    @BindView(R.id.bib08)
    EditText bib08;
    @BindView(R.id.bib09)
    EditText bib09;
    @BindView(R.id.bib10)
    EditText bib10;
    @BindView(R.id.bib11)
    EditText bib11;
    @BindView(R.id.bib12)
    RadioGroup bib12;
    @BindView(R.id.bib1201)
    RadioButton bib1201;
    @BindView(R.id.bib1202)
    RadioButton bib1202;
    @BindView(R.id.bib13)
    EditText bib13;
    @BindView(R.id.bib14)
    EditText bib14;
    @BindView(R.id.bib15)
    EditText bib15;
    @BindView(R.id.bib1601)
    EditText bib1601;
    @BindView(R.id.bib1602)
    EditText bib1602;
    @BindView(R.id.bic01)
    EditText bic01;
    @BindView(R.id.bic02)
    EditText bic02;
    @BindView(R.id.bic03)
    EditText bic03;
    @BindView(R.id.bic04)
    EditText bic04;
    @BindView(R.id.bic05)
    EditText bic05;
    @BindView(R.id.btnNext)
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aman_info);
        ButterKnife.bind(this);


        ///================ Q3 Skip pattern================

        bi01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (bi0101.isChecked()) {
                    fldGrpbi01.setVisibility(View.VISIBLE);
                    btnNext.setVisibility(View.VISIBLE);
                } else {
                    fldGrpbi01.setVisibility(View.GONE);
                    btnNext.setVisibility(View.GONE);
                    bib01.setText(null);
                    bib02.clearCheck();
                    bib03.setText(null);
                    bib04.setText(null);
                    bib05.setText(null);
                    bib06.setText(null);
                    bib07.clearCheck();
                    bib08.setText(null);
                    bib09.setText(null);
                    bib10.setText(null);
                    bib11.setText(null);
                    bib12.clearCheck();
                    bib13.setText(null);
                    bib14.setText(null);
                    bib15.setText(null);
                    bib1601.setText(null);
                    bib1602.setText(null);
                    bic01.setText(null);
                    bic02.setText(null);
                    bic03.setText(null);
                    bic04.setText(null);
                    bic05.setText(null);
                }
            }
        });

    }


    @OnClick(R.id.btnNext)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, SocioEconomicActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("check", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        AppMain.fc = new FormsContract();

        JSONObject sa = new JSONObject();

        sa.put("biuc", biuc.getText().toString());
        sa.put("biPara", biPara.getText().toString());
        sa.put("biACHW", biACHW.getText().toString());
        sa.put("biHH", biHH.getText().toString());
        sa.put("bi01", bi0101.isChecked() ? "1" : bi0102.isChecked() ? "2" : "0");
        sa.put("bib01", bib01.getText().toString());
        sa.put("bib02", bib0201.isChecked() ? "1" : bib0202.isChecked() ? "2" : "0");
        sa.put("bib03", bib03.getText().toString());
        sa.put("bib04", bib04.getText().toString());
        sa.put("bib05", bib05.getText().toString());
        sa.put("bib06", bib06.getText().toString());
        sa.put("bib07", bib0701.isChecked() ? "1" : bib0702.isChecked() ? "2" : "0");
        sa.put("bib08", bib08.getText().toString());
        sa.put("bib09", bib09.getText().toString());
        sa.put("bib10", bib10.getText().toString());
        sa.put("bib11", bib11.getText().toString());
        sa.put("bib12", bib1201.isChecked() ? "1" : bib1202.isChecked() ? "2" : "0");
        sa.put("bib13", bib13.getText().toString());
        sa.put("bib14", bib14.getText().toString());
        sa.put("bib15", bib15.getText().toString());
        sa.put("bib1601", bib1601.getText().toString());
        sa.put("bib1602", bib1602.getText().toString());
        sa.put("bic01", bic01.getText().toString());
        sa.put("bic02", bic02.getText().toString());
        sa.put("bic03", bic03.getText().toString());
        sa.put("bic04", bic04.getText().toString());
        sa.put("bic05", bic05.getText().toString());

        AppMain.fc.setBasicInfo(String.valueOf(sa));
        setGPS();

        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();


    }

    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = db.addForm(AppMain.fc);

        AppMain.fc.setID(String.valueOf(rowId));

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            AppMain.fc.setUID(
                    (AppMain.fc.getDeviceID() + AppMain.fc.getID()));
            db.updateFormID();
            Toast.makeText(this, "Current Form No: " + AppMain.fc.getUID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        // CONVERTING GPS TIMESTAMP TO DATETIME FORMAT
        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        AppMain.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
        AppMain.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
        AppMain.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
        AppMain.fc.setGpsTime(date); // Timestamp is converted to date above

        Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();

        if (biuc.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.biuc), Toast.LENGTH_LONG).show();
            biuc.setError("This data is Required!");
            Log.i(TAG, "biuc: This data is Required!");
            return false;
        } else {
            biuc.setError(null);
        }

        if (biPara.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.biPara), Toast.LENGTH_LONG).show();
            biPara.setError("This data is Required!");
            Log.i(TAG, "biPara: This data is Required!");
            return false;
        } else {
            biPara.setError(null);
        }

        if (biACHW.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.biACHW), Toast.LENGTH_LONG).show();
            biACHW.setError("This data is Required!");
            Log.i(TAG, "biACHW: This data is Required!");
            return false;
        } else {
            biACHW.setError(null);
        }

        if (biHH.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.biHH), Toast.LENGTH_LONG).show();
            biHH.setError("This data is Required!");
            Log.i(TAG, "biHH: This data is Required!");
            return false;
        } else {
            biHH.setError(null);
        }

        if (bi01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi01), Toast.LENGTH_LONG).show();
            bi0102.setError("This data is Required!");
            Log.i(TAG, "bi01: This data is Required!");
            return false;
        } else {
            bi0102.setError(null);
        }

        if (bi0101.isChecked()) {

            if (bib01.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib01), Toast.LENGTH_LONG).show();
                bib01.setError("This data is Required!");
                Log.i(TAG, "bib01: This data is Required!");
                return false;
            } else {
                bib01.setError(null);
            }

            if (bib02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.sex), Toast.LENGTH_LONG).show();
                bib0202.setError("This data is Required!");
                Log.i(TAG, "bib02: This data is Required!");
                return false;
            } else {
                bib0202.setError(null);
            }

            if (bib03.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.age), Toast.LENGTH_LONG).show();
                bib03.setError("This data is Required!");
                Log.i(TAG, "bib03: This data is Required!");
                return false;
            } else {
                bib03.setError(null);
            }

            if (Integer.valueOf(bib03.getText().toString()) < 15 || Integer.valueOf(bib03.getText().toString()) > 99) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.age), Toast.LENGTH_SHORT).show();
                bib03.setError("Invalid: Range is 15 - 99 years");
                Log.i(TAG, "bib03: Range is 15 - 99 years");
                return false;
            } else {
                bib03.setError(null);
            }
            if (bib04.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib04), Toast.LENGTH_LONG).show();
                bib04.setError("This data is Required!");
                Log.i(TAG, "bib04: This data is Required!");
                return false;
            } else {
                bib04.setError(null);
            }

            if ((Integer.valueOf(bib04.getText().toString()) < 0)
                    || (Integer.valueOf(bib04.getText().toString()) > 16)) {
                Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.bib04), Toast.LENGTH_LONG).show();
                bib04.setError("Range is 1-16");
                Log.i(TAG, "bib04: Range is 1-16");
                return false;
            } else {
                bib04.setError(null);
            }

            if (bib05.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib05), Toast.LENGTH_LONG).show();
                bib05.setError("This data is Required!");
                Log.i(TAG, "bib05: This data is Required!");
                return false;
            } else {
                bib05.setError(null);
            }


            if (bib06.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib06), Toast.LENGTH_LONG).show();
                bib06.setError("This data is Required!");
                Log.i(TAG, "bib06: This data is Required!");
                return false;
            } else {
                bib06.setError(null);
            }

            if (bib07.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.sex), Toast.LENGTH_LONG).show();
                bib0702.setError("This data is Required!");
                Log.i(TAG, "bib07: This data is Required!");
                return false;
            } else {
                bib0702.setError(null);
            }

            if (bib08.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.age), Toast.LENGTH_LONG).show();
                bib08.setError("This data is Required!");
                Log.i(TAG, "bib08: This data is Required!");
                return false;
            } else {
                bib08.setError(null);
            }

            if (Integer.valueOf(bib08.getText().toString()) < 15 || Integer.valueOf(bib08.getText().toString()) > 99) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.age), Toast.LENGTH_SHORT).show();
                bib08.setError("Invalid: Range is 15 - 99 years");
                Log.i(TAG, "bib08: Range is 15 - 99 years");
                return false;
            } else {
                bib08.setError(null);
            }

            if (bib09.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib09), Toast.LENGTH_LONG).show();
                bib09.setError("This data is Required!");
                Log.i(TAG, "bib09: This data is Required!");
                return false;
            } else {
                bib09.setError(null);
            }

            if (Integer.valueOf(bib09.getText().toString()) < 0 || Integer.valueOf(bib09.getText().toString()) > 16) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.bib09), Toast.LENGTH_SHORT).show();
                bib09.setError("Invalid: Range is 0 - 16");
                Log.i(TAG, "bib09: Range is 0 - 16 ");
                return false;
            } else {
                bib09.setError(null);
            }

            if (bib10.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib10), Toast.LENGTH_LONG).show();
                bib10.setError("This data is Required!");
                Log.i(TAG, "bib10: This data is Required!");
                return false;
            } else {
                bib10.setError(null);
            }

            if (bib11.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib11), Toast.LENGTH_LONG).show();
                bib11.setError("This data is Required!");
                Log.i(TAG, "bib11: This data is Required!");
                return false;
            } else {
                bib11.setError(null);
            }

            if (bib12.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.sex), Toast.LENGTH_LONG).show();
                bib1202.setError("This data is Required!");
                Log.i(TAG, "bib12: This data is Required!");
                return false;
            } else {
                bib1202.setError(null);
            }

            if (bib13.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.age), Toast.LENGTH_LONG).show();
                bib13.setError("This data is Required!");
                Log.i(TAG, "bib13: This data is Required!");
                return false;
            } else {
                bib13.setError(null);
            }

            if (Integer.valueOf(bib13.getText().toString()) < 15 || Integer.valueOf(bib13.getText().toString()) > 99) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.age), Toast.LENGTH_SHORT).show();
                bib13.setError("Invalid: Range is 15 - 99 years");
                Log.i(TAG, "bib13: Range is 15 - 99 years");
                return false;
            } else {
                bib13.setError(null);
            }
            if (bib14.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib14), Toast.LENGTH_LONG).show();
                bib14.setError("This data is Required!");
                Log.i(TAG, "bib14: This data is Required!");
                return false;
            } else {
                bib14.setError(null);
            }

            if (Integer.valueOf(bib14.getText().toString()) < 0 || Integer.valueOf(bib14.getText().toString()) > 16) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.bib14), Toast.LENGTH_SHORT).show();
                bib14.setError("Invalid: Range is 0 - 16");
                Log.i(TAG, "bib14: Range is 0 - 16 ");
                return false;
            } else {
                bib14.setError(null);
            }

            if (bib15.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib16), Toast.LENGTH_LONG).show();
                bib15.setError("This data is Required!");
                Log.i(TAG, "bib15: This data is Required!");
                return false;
            } else {
                bib15.setError(null);
            }

            if (bib1601.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib16) + " - " + getString(R.string.year), Toast.LENGTH_LONG).show();
                bib1601.setError("This data is Required!");
                Log.i(TAG, "bib1601: This data is Required!");
                return false;
            } else {
                bib1601.setError(null);
            }

            if (bib1602.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib16) + " - " + getString(R.string.months), Toast.LENGTH_LONG).show();
                bib1602.setError("This data is Required!");
                Log.i(TAG, "bib1602: This data is Required!");
                return false;
            } else {
                bib1602.setError(null);
            }

            if (Integer.valueOf(bib1601.getText().toString().isEmpty() ? "0" : bib1601.getText().toString()) == 0
                    && Integer.valueOf(bib1602.getText().toString().isEmpty() ? "0" : bib1602.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid)" + getString(R.string.bib16) + " - " + getString(R.string.iy03m), Toast.LENGTH_SHORT).show();
                bib1601.setError("Days and months can not be zero..");
                bib1602.setError("Days and months can not be zero..");

                Log.i(TAG, "bib16: Both can not be zero");
                return false;
            } else {
                bib1601.setError(null);
                bib1602.setError(null);
            }

            if ((Integer.valueOf(bib1602.getText().toString()) < 1)
                    || (Integer.valueOf(bib1602.getText().toString()) > 11)) {
                Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.months), Toast.LENGTH_LONG).show();
                bib1602.setError("Range is 1-11");
                Log.i(TAG, "b09: Range is 1-11");
                return false;
            } else {
                bib1602.setError(null);
            }

            if (bic01.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bic01), Toast.LENGTH_LONG).show();
                bic01.setError("This data is Required!");
                Log.i(TAG, "bic01: This data is Required!");
                return false;
            } else {
                bic01.setError(null);
            }

            if (bic02.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.male), Toast.LENGTH_LONG).show();
                bic02.setError("This data is Required!");
                Log.i(TAG, "bic02: This data is Required!");
                return false;
            } else {
                bic02.setError(null);
            }

            if (bic03.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.female), Toast.LENGTH_LONG).show();
                bic03.setError("This data is Required!");
                Log.i(TAG, "bic03: This data is Required!");
                return false;
            } else {
                bic03.setError(null);
            }

            if (bic04.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bic04), Toast.LENGTH_LONG).show();
                bic04.setError("This data is Required!");
                Log.i(TAG, "bic04: This data is Required!");
                return false;
            } else {
                bic04.setError(null);
            }

            if ((Integer.valueOf(bic04.getText().toString()))
                    > Integer.valueOf(bic03.getText().toString())) {
                Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.bic04), Toast.LENGTH_SHORT).show();
                bic03.setError("Can not be greater than total women!");

                Log.i(TAG, "bic03: Can not be greater than total women");
                return false;
            } else {
                bic03.setError(null);
            }

            if (bic05.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bic05), Toast.LENGTH_LONG).show();
                bic05.setError("This data is Required!");
                Log.i(TAG, "bic05: This data is Required!");
                return false;
            } else {
                bic05.setError(null);
            }

            if ((Integer.valueOf(bic02.getText().toString()) + Integer.valueOf(bic03.getText().toString()))
                    > Integer.valueOf(bic01.getText().toString())) {
                Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.bic01), Toast.LENGTH_SHORT).show();
                bic01.setError("Can not be greater than total members!");

                Log.i(TAG, "bic01: Can not be greater than total members");
                return false;
            } else {
                bic01.setError(null);
            }



        }
        return true;
    }


}

