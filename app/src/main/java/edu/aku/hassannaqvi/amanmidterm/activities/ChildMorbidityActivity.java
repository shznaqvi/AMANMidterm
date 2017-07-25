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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.contract.IMsContract;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;

public class ChildMorbidityActivity extends Activity {

    private static final String TAG = ChildMorbidityActivity.class.getSimpleName();

    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.count)
    TextView count;
    @BindView(R.id.cm02)
    EditText cm02;
    @BindView(R.id.cm03)
    RadioGroup cm03;
    @BindView(R.id.cm03a)
    RadioButton cm03a;
    @BindView(R.id.cm03b)
    RadioButton cm03b;
    @BindView(R.id.cm04)
    EditText cm04;
    @BindView(R.id.cm05a)
    CheckBox cm05a;
    @BindView(R.id.cm05b)
    CheckBox cm05b;
    @BindView(R.id.cm05c)
    CheckBox cm05c;
    @BindView(R.id.cm05d)
    CheckBox cm05d;
    @BindView(R.id.cm05e)
    CheckBox cm05e;
    @BindView(R.id.cm05f)
    CheckBox cm05f;
    @BindView(R.id.cm05g)
    CheckBox cm05g;
    @BindView(R.id.cm05h)
    CheckBox cm05h;
    @BindView(R.id.cm0577)
    CheckBox cm0577;
    @BindView(R.id.cm0588)
    CheckBox cm0588;
    @BindView(R.id.cm0588x)
    EditText cm0588x;
    @BindView(R.id.fldGrpcm06)
    LinearLayout fldGrpcm06;
    @BindView(R.id.cm06)
    RadioGroup cm06;
    @BindView(R.id.cm06a)
    RadioButton cm06a;
    @BindView(R.id.cm06b)
    RadioButton cm06b;
    @BindView(R.id.fldGrpcm07)
    LinearLayout fldGrpcm07;
    @BindView(R.id.cm07a)
    CheckBox cm07a;
    @BindView(R.id.cm07b)
    CheckBox cm07b;
    @BindView(R.id.cm07c)
    CheckBox cm07c;
    @BindView(R.id.cm07d)
    CheckBox cm07d;
    @BindView(R.id.cm07e)
    CheckBox cm07e;
    @BindView(R.id.cm07f)
    CheckBox cm07f;
    @BindView(R.id.cm07g)
    CheckBox cm07g;
    @BindView(R.id.cm07h)
    CheckBox cm07h;
    @BindView(R.id.cm0788)
    CheckBox cm0788;
    @BindView(R.id.cm0788x)
    EditText cm0788x;
    @BindView(R.id.cm08a)
    CheckBox cm08a;
    @BindView(R.id.cm08b)
    CheckBox cm08b;
    @BindView(R.id.cm08c)
    CheckBox cm08c;
    @BindView(R.id.cm08d)
    CheckBox cm08d;
    @BindView(R.id.cm08e)
    CheckBox cm08e;
    @BindView(R.id.cm0888)
    CheckBox cm0888;
    @BindView(R.id.cm0888x)
    EditText cm0888x;
    @BindView(R.id.cm09)
    RadioGroup cm09;
    @BindView(R.id.cm09a)
    RadioButton cm09a;
    @BindView(R.id.cm09b)
    RadioButton cm09b;
    @BindView(R.id.cm0977)
    RadioButton cm0977;
    @BindView(R.id.fldGrpcm09)
    LinearLayout fldGrpcm09;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_morbidity);
        ButterKnife.bind(this);

        count.setText("Child: " + AppMain.chCount + " out of " + AppMain.chTotal);

        cm0588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cm0588x.setVisibility(View.VISIBLE);
                } else {
                    cm0588x.setVisibility(View.GONE);
                    cm0588x.setText(null);
                }
            }
        });

        cm06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cm06a.isChecked()) {
                    fldGrpcm07.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcm07.setVisibility(View.GONE);
                    cm07a.setChecked(false);
                    cm07b.setChecked(false);
                    cm07c.setChecked(false);
                    cm07d.setChecked(false);
                    cm07e.setChecked(false);
                    cm07f.setChecked(false);
                    cm07g.setChecked(false);
                    cm07h.setChecked(false);
                    cm0788.setChecked(false);
                    cm08a.setChecked(false);
                    cm08b.setChecked(false);
                    cm08c.setChecked(false);
                    cm08d.setChecked(false);
                    cm08e.setChecked(false);
                    cm0888x.setText(null);
                    cm09.clearCheck();
                }
            }
        });

        cm0788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cm0788x.setVisibility(View.VISIBLE);
                } else {
                    cm0788x.setVisibility(View.GONE);
                    cm0788x.setText(null);
                }
            }
        });

        cm0888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cm0888x.setVisibility(View.VISIBLE);
                } else {
                    cm0888x.setVisibility(View.GONE);
                    cm0888x.setText(null);
                }
            }
        });

        cm0577.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcm06.setVisibility(View.GONE);
                    cm05a.setEnabled(false);
                    cm05a.setChecked(false);
                    cm05b.setEnabled(false);
                    cm05b.setChecked(false);
                    cm05c.setEnabled(false);
                    cm05c.setChecked(false);
                    cm05d.setEnabled(false);
                    cm05d.setChecked(false);
                    cm05e.setEnabled(false);
                    cm05e.setChecked(false);
                    cm05f.setEnabled(false);
                    cm05f.setChecked(false);
                    cm05g.setEnabled(false);
                    cm05g.setChecked(false);
                    cm05h.setEnabled(false);
                    cm05h.setChecked(false);
                    cm0588.setEnabled(false);
                    cm0588.setChecked(false);
                    cm0588x.setText(null);
                    cm06.clearCheck();
                    cm07a.setChecked(false);
                    cm07b.setChecked(false);
                    cm07c.setChecked(false);
                    cm07d.setChecked(false);
                    cm07e.setChecked(false);
                    cm07f.setChecked(false);
                    cm07g.setChecked(false);
                    cm07h.setChecked(false);
                    cm0788.setChecked(false);
                    cm0788x.setText(null);
                    cm08a.setChecked(false);
                    cm08b.setChecked(false);
                    cm08c.setChecked(false);
                    cm08d.setChecked(false);
                    cm08e.setChecked(false);
                    cm0888x.setText(null);
                    cm09.clearCheck();
                } else {
                    fldGrpcm06.setVisibility(View.VISIBLE);
                    cm05a.setEnabled(true);
                    cm05b.setEnabled(true);
                    cm05c.setEnabled(true);
                    cm05d.setEnabled(true);
                    cm05e.setEnabled(true);
                    cm05f.setEnabled(true);
                    cm05g.setEnabled(true);
                    cm05h.setEnabled(true);
                    cm0588.setEnabled(true);

                }
            }
        });

        cm05b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcm09.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcm09.setVisibility(View.GONE);
                    cm09.clearCheck();
                }
            }
        });


    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                if (AppMain.chCount < AppMain.chTotal) {
                    Intent intent = new Intent(this, ChildMorbidityActivity.class);
                    AppMain.chCount++;
                    startActivity(intent);
                    //count.setText("Child: " + MainApp.mm + "out of " + MainApp.totalChild);
                } else {
                    finish();

                    Intent secNext = new Intent(this, MaternalMentalHealthActivity.class);
                    secNext.putExtra("check", false);
                    startActivity(secNext);
                }


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }
    }


    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = db.addIM(AppMain.im);

        AppMain.im.set_ID(String.valueOf(rowId));

        if (rowId > -1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            AppMain.im.set_UID(
                    (AppMain.fc.getDeviceID() + AppMain.im.get_ID()));
            db.updateChildID();
            //Toast.makeText(this, "Current Form No: " + AppMain.fc.getUID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        AppMain.im = new IMsContract();

        AppMain.im.setDevicetagID(sharedPref.getString("tagName", null));
        AppMain.im.setUser(AppMain.fc.getUserName());
        AppMain.im.setUUID(AppMain.fc.getUID());
        AppMain.im.setDeviceID(AppMain.fc.getDeviceID());

        AppMain.im.setChildName(cm02.getText().toString());

        JSONObject scm = new JSONObject();

        scm.put("cm01", AppMain.chTotal);
        //scm.put("cm02", cm02.getText().toString());
        scm.put("cm03", cm03a.isChecked() ? "1" : cm03b.isChecked() ? "2" : "0");
        scm.put("cm04", cm04.getText().toString());
        scm.put("cm05a", cm05a.isChecked() ? "1" : "0");
        scm.put("cm05b", cm05b.isChecked() ? "1" : "0");
        scm.put("cm05c", cm05c.isChecked() ? "1" : "0");
        scm.put("cm05d", cm05d.isChecked() ? "1" : "0");
        scm.put("cm05e", cm05e.isChecked() ? "1" : "0");
        scm.put("cm05f", cm05f.isChecked() ? "1" : "0");
        scm.put("cm05g", cm05g.isChecked() ? "1" : "0");
        scm.put("cm05h", cm05h.isChecked() ? "1" : "0");
        scm.put("cm0577", cm0577.isChecked() ? "77" : "0");
        scm.put("cm0588", cm0588.isChecked() ? "88" : "0");
        scm.put("cm0588x", cm0588x.getText().toString());
        scm.put("cm06", cm06a.isChecked() ? "1" : cm06b.isChecked() ? "2" : "0");
        scm.put("cm07a", cm07a.isChecked() ? "1" : "0");
        scm.put("cm07b", cm07b.isChecked() ? "1" : "0");
        scm.put("cm07c", cm07c.isChecked() ? "1" : "0");
        scm.put("cm07d", cm07d.isChecked() ? "1" : "0");
        scm.put("cm07e", cm07e.isChecked() ? "1" : "0");
        scm.put("cm07f", cm07f.isChecked() ? "1" : "0");
        scm.put("cm07g", cm07g.isChecked() ? "1" : "0");
        scm.put("cm07h", cm07h.isChecked() ? "1" : "0");
        scm.put("cm0788", cm0788.isChecked() ? "88" : "0");
        scm.put("cm0788x", cm0788x.getText().toString());
        scm.put("cm08a", cm08a.isChecked() ? "1" : "0");
        scm.put("cm08b", cm08b.isChecked() ? "2" : "0");
        scm.put("cm08c", cm08c.isChecked() ? "3" : "0");
        scm.put("cm08d", cm08d.isChecked() ? "4" : "0");
        scm.put("cm08e", cm08e.isChecked() ? "5" : "0");
        scm.put("cm0888", cm0888.isChecked() ? "88" : "0");
        scm.put("cm0888x", cm0888x.getText().toString());
        scm.put("cm09", cm09a.isChecked() ? "1" : cm09b.isChecked() ? "2" : cm0977.isChecked() ? "3" : "0");

        AppMain.im.setsCM(String.valueOf(scm));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        setGPS();

    }


    private boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        /*if (cm01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm01), Toast.LENGTH_LONG).show();
            cm01.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "cm01: This data is Required!");
            return false;
        } else {
            cm01.setError(null);
        }*/

        if (cm02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm02), Toast.LENGTH_LONG).show();
            cm02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "cm02: This data is Required!");
            return false;
        } else {
            cm02.setError(null);
        }

        if (cm03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm03), Toast.LENGTH_LONG).show();
            cm03b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "cm03: This data is Required!");
            return false;
        } else {
            cm03b.setError(null);
        }

        if (cm04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm04), Toast.LENGTH_LONG).show();
            cm04.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "cm04: This data is Required!");
            return false;
        } else {
            cm04.setError(null);
        }

        if (Integer.valueOf(cm04.getText().toString()) < 0 || Integer.valueOf(cm04.getText().toString()) > 59) {
            Toast.makeText(this, "ERROR(range): " + getString(R.string.cm04), Toast.LENGTH_LONG).show();
            cm04.setError("Range is 0 to 59 months");    // Set Error on last radio button

            Log.i(TAG, "cm04: Range is 0 to 59 months");
            return false;
        } else {
            cm04.setError(null);
        }


        if (!(cm05a.isChecked() || cm05b.isChecked() || cm05c.isChecked() || cm05d.isChecked() || cm05e.isChecked()
                || cm05f.isChecked() || cm05g.isChecked() || cm05h.isChecked() || cm0577.isChecked() || cm0588.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm05), Toast.LENGTH_LONG).show();
            cm0588.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "cm05: This data is Required!");
            return false;
        } else {
            cm0588.setError(null);
        }

        if (cm0588.isChecked() && cm0588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm05) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            cm0588x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "cm0588x: This data is Required!");
            return false;
        } else {
            cm0588x.setError(null);
        }

        if (!cm0577.isChecked()) {
            if (cm06.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm06), Toast.LENGTH_LONG).show();
                cm06b.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "cm06: This data is Required!");
                return false;
            } else {
                cm06b.setError(null);
            }

            if (cm06a.isChecked()) {
                if (!(cm07a.isChecked() || cm07b.isChecked() || cm07c.isChecked() || cm07d.isChecked() || cm07e.isChecked()
                        || cm07f.isChecked() || cm07g.isChecked() || cm07h.isChecked() || cm0788.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm07), Toast.LENGTH_LONG).show();
                    cm0788.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "cm07: This data is Required!");
                    return false;
                } else {
                    cm0788.setError(null);
                }

                if (cm0788.isChecked() && cm0788x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm07) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    cm0788x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "cm0788x: This data is Required!");
                    return false;
                } else {
                    cm0788x.setError(null);
                }

                if (!(cm08a.isChecked() || cm08b.isChecked() || cm08c.isChecked() || cm08d.isChecked() || cm08e.isChecked()
                        || cm0888.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm08), Toast.LENGTH_LONG).show();
                    cm0888.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "cm08: This data is Required!");
                    return false;
                } else {
                    cm0888.setError(null);
                }

                if (cm0888.isChecked() && cm0888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm08) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    cm0888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "cm0888x: This data is Required!");
                    return false;
                } else {
                    cm0888x.setError(null);
                }

                if (cm05b.isChecked()) {
                    if (cm09.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm09), Toast.LENGTH_LONG).show();
                        cm0977.setError("This data is Required!");    // Set Error on last radio button

                        Log.i(TAG, "cm09: This data is Required!");
                        return false;
                    } else {
                        cm0977.setError(null);
                    }
                }
                
            }
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
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



}
