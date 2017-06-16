package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
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

public class ChildMorbidityActivity extends Activity {

    private static final String TAG = ChildMorbidityActivity.class.getSimpleName();

    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.cm01)
    EditText cm01;
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
    @BindView(R.id.cm08)
    RadioGroup cm08;
    @BindView(R.id.cm08a)
    RadioButton cm08a;
    @BindView(R.id.cm08b)
    RadioButton cm08b;
    @BindView(R.id.cm08c)
    RadioButton cm08c;
    @BindView(R.id.cm08d)
    RadioButton cm08d;
    @BindView(R.id.cm08e)
    RadioButton cm08e;
    @BindView(R.id.cm0888)
    RadioButton cm0888;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_morbidity);
        ButterKnife.bind(this);

        cm0577.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcm06.setVisibility(View.GONE);
                    cm05a.setChecked(false);
                    cm05b.setChecked(false);
                    cm05c.setChecked(false);
                    cm05d.setChecked(false);
                    cm05e.setChecked(false);
                    cm05f.setChecked(false);
                    cm05g.setChecked(false);
                    cm05h.setChecked(false);
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
                    cm08.clearCheck();
                    cm0888x.setText(null);
                    cm09.clearCheck();
                } else {
                    fldGrpcm06.setVisibility(View.VISIBLE);
                }
            }
        });

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
                    cm08.clearCheck();
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

                finish();

                Intent secNext = new Intent(this, MaternalMentalHealthActivity.class);
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
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        /*int updcount = db.updateChildMorbidity();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();

        return false;
        }

*/
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject scm = new JSONObject();

        scm.put("cm01", cm01.getText().toString());
        scm.put("cm02", cm02.getText().toString());
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
        scm.put("cm08", cm08a.isChecked() ? "1" : cm08b.isChecked() ? "2" : cm08c.isChecked() ? "3"
                : cm08d.isChecked() ? "4" : cm08e.isChecked() ? "2" : cm0888.isChecked() ? "88" : "0");
        scm.put("cm0888x", cm0888x.getText().toString());
        scm.put("cm09", cm09a.isChecked() ? "1" : cm09b.isChecked() ? "2" : cm0977.isChecked() ? "3" : "0");

        AppMain.fc.setChildMorbidity(String.valueOf(scm));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }


    private boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (cm01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm01), Toast.LENGTH_LONG).show();
            cm01.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "cm01: This data is Required!");
            return false;
        } else {
            cm01.setError(null);
        }

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

                if (cm08.getCheckedRadioButtonId() == -1) {
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

        return true;
    }



}
