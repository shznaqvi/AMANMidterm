package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
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
    @BindView(R.id.bib01)
    EditText bib01;
    @BindView(R.id.bib02)
    RadioGroup bib02;
    @BindView(R.id.fldGrpbi01)
    LinearLayout fldGrpbi01;
    @BindView(R.id.bib0201)
    RadioButton bib0201;
    @BindView(R.id.bib0202)
    RadioButton bib0202;
    @BindView(R.id.bib03)
    EditText bib03;
    @BindView(R.id.bib06)
    EditText bib06;
    @BindView(R.id.bib07)
    EditText bib07;
    @BindView(R.id.bib0801)
    EditText bib0801;
    @BindView(R.id.bib0802)
    EditText bib0802;
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

                } else {
                    fldGrpbi01.setVisibility(View.GONE);
                    bib01.setText(null);
                    bib02.clearCheck();
                    bib03.setText(null);
                    bib06.setText(null);
                    bib07.setText(null);
                    bib0801.setText(null);
                    bib0802.setText(null);
                    bic01.setText(null);
                    bic02.setText(null);
                    bic03.setText(null);
                    bic04.setText(null);
                    bic05.setText(null);
                }
            }
        });

    }

    public void submitSecA(View v) throws JSONException {
        Toast.makeText(this, "Processing Section A", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            //     SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Socio-Economic Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, SocioEconomicActivity.class);
                //    AppMain.chTotal = Integer.valueOf(mna13.getText().toString()) - 1; // exclude index child
                startActivity(intent);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void endForm(View v) throws JSONException {
        Toast.makeText(this, "Processing Basic Information", Toast.LENGTH_SHORT).show();

        // SaveDraft();
        if (UpdateDB()) {
            Toast.makeText(this, "Starting Closing Section", Toast.LENGTH_SHORT).show();
            Intent endSec = new Intent(this, EndingActivity.class);
            endSec.putExtra("complete", false);
            startActivity(endSec);
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        JSONObject sa = new JSONObject();

        sa.put("biuc", biuc.getText().toString());
        sa.put("biPara", biPara.getText().toString());
        sa.put("biACHW", biACHW.getText().toString());
        sa.put("biuc", biHH.getText().toString());
        sa.put("bi01", bi0101.isChecked() ? "1" : bi0102.isChecked() ? "2" : "0");
        sa.put("bib01", bib01.getText().toString());
        sa.put("bib02", bib0201.isChecked() ? "1" : bib0202.isChecked() ? "2" : "0");
        sa.put("bib03", bib03.getText().toString());
        sa.put("bib06", bib06.getText().toString());
        sa.put("bib07", bib07.getText().toString());
        sa.put("bib0801", bib0801.getText().toString());
        sa.put("bib0802", bib0802.getText().toString());
        sa.put("bic01", bic01.getText().toString());
        sa.put("bic02", bic02.getText().toString());
        sa.put("bic03", bic03.getText().toString());
        sa.put("bic04", bic04.getText().toString());
        sa.put("bic05", bic05.getText().toString());

        //    AppMain.fc.setBasicInfo(String.valueOf(sA));
        //  setGPS();

        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

        //Toast.makeText(sA.this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        //Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

       /* rowId = null;
        rowId = db.addForm(AppMain.fc);

        AppMain.fc.setID(String.valueOf(rowId));

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            /*AppMain.fc.setFUID(
                    (AppMain.fc.getDeviceID() + AppMain.fc.getID()));
            Toast.makeText(this, "Current Form No: " + AppMain.fc.getFUID(), Toast.LENGTH_SHORT).show();*/
        return true;
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

            if (Integer.parseInt(bib03.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.age), Toast.LENGTH_SHORT).show();
                bib03.setError("Invalid: Data cannot be Zero");
                Log.i(TAG, "bib03: Invalid data is 0");
                return false;
            } else {
                bib03.setError(null);
            }

            if (bib06.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib06), Toast.LENGTH_LONG).show();
                bib06.setError("This data is Required!");
                Log.i(TAG, "bib06: This data is Required!");
                return false;
            } else {
                bib06.setError(null);
            }

            if (bib07.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib07), Toast.LENGTH_LONG).show();
                bib07.setError("This data is Required!");
                Log.i(TAG, "bib07: This data is Required!");
                return false;
            } else {
                bib07.setError(null);
            }

            if (bib0801.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib08) + getString(R.string.year), Toast.LENGTH_LONG).show();
                bib0801.setError("This data is Required!");
                Log.i(TAG, "bib08: This data is Required!");
                return false;
            } else {
                bib0801.setError(null);
            }

            if (bib0802.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bib08) + getString(R.string.months), Toast.LENGTH_LONG).show();
                bib0802.setError("This data is Required!");
                Log.i(TAG, "bib08: This data is Required!");
                return false;
            } else {
                bib0802.setError(null);
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

            if (bic05.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bic05), Toast.LENGTH_LONG).show();
                bic05.setError("This data is Required!");
                Log.i(TAG, "bic05: This data is Required!");
                return false;
            } else {
                bic05.setError(null);
            }

        }
        return true;
    }


}

