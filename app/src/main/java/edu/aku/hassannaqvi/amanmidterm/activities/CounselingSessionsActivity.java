package edu.aku.hassannaqvi.amanmidterm.activities;

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
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;

public class CounselingSessionsActivity extends Activity {

    private static final String TAG = CounselingSessionsActivity.class.getSimpleName();

    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.cs01)
    RadioGroup cs01;
    @BindView(R.id.cs01a)
    RadioButton cs01a;
    @BindView(R.id.cs01b)
    RadioButton cs01b;
    @BindView(R.id.fldGrpcs01)
    LinearLayout fldGrpcs01;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.fldGrpcs02)
    LinearLayout fldGrpcs02;
    @BindView(R.id.cs02a)
    EditText cs02a;
    @BindView(R.id.cs02b)
    EditText cs02b;
    @BindView(R.id.cs02c)
    EditText cs02c;
    @BindView(R.id.cs03)
    RadioGroup cs03;
    @BindView(R.id.cs03a)
    RadioButton cs03a;
    @BindView(R.id.cs03b)
    RadioButton cs03b;
    @BindView(R.id.cs03c)
    RadioButton cs03c;
    @BindView(R.id.cs03d)
    RadioButton cs03d;
    @BindView(R.id.cs04a)
    CheckBox cs04a;
    @BindView(R.id.cs04b)
    CheckBox cs04b;
    @BindView(R.id.cs04c)
    CheckBox cs04c;
    @BindView(R.id.cs0488)
    CheckBox cs0488;
    @BindView(R.id.cs0488x)
    EditText cs0488x;
    @BindView(R.id.cs05a)
    CheckBox cs05a;
    @BindView(R.id.cs05b)
    CheckBox cs05b;
    @BindView(R.id.cs05c)
    CheckBox cs05c;
    @BindView(R.id.cs05d)
    CheckBox cs05d;
    @BindView(R.id.cs05e)
    CheckBox cs05e;
    @BindView(R.id.cs05f)
    CheckBox cs05f;
    @BindView(R.id.cs05g)
    CheckBox cs05g;
    @BindView(R.id.cs05h)
    CheckBox cs05h;
    @BindView(R.id.cs05i)
    CheckBox cs05i;
    @BindView(R.id.cs05j)
    CheckBox cs05j;
    @BindView(R.id.cs05k)
    CheckBox cs05k;
    @BindView(R.id.cs05l)
    CheckBox cs05l;
    @BindView(R.id.cs0588)
    CheckBox cs0588;
    @BindView(R.id.cs0588x)
    EditText cs0588x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counseling_sessions);
        ButterKnife.bind(this);


        cs01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cs01a.isChecked()) {
                    fldGrpcs01.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcs01.setVisibility(View.GONE);
                    cs02a.setText(null);
                    cs02b.setText(null);
                    cs02c.setText(null);
                    cs03.clearCheck();
                    cs04a.setChecked(false);
                    cs04b.setChecked(false);
                    cs04c.setChecked(false);
                    cs0488.setChecked(false);
                    cs0488x.setText(null);
                    cs05a.setChecked(false);
                    cs05b.setChecked(false);
                    cs05c.setChecked(false);
                    cs05d.setChecked(false);
                    cs05e.setChecked(false);
                    cs05f.setChecked(false);
                    cs05g.setChecked(false);
                    cs05h.setChecked(false);
                    cs05i.setChecked(false);
                    cs05j.setChecked(false);
                    cs05k.setChecked(false);
                    cs05l.setChecked(false);
                    cs0588.setChecked(false);
                    cs0588x.setText(null);
                }
            }
        });


        // =================== Q03 Others ====================

        cs0488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cs0488x.setVisibility(View.VISIBLE);
                } else {
                    cs0488x.setVisibility(View.GONE);
                    cs0488x.setText(null);
                }
            }
        });

        // =================== Q04 Others ====================

        cs0588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cs0588x.setVisibility(View.VISIBLE);
                } else {
                    cs0588x.setVisibility(View.GONE);
                    cs0588x.setText(null);
                }
            }
        });
    }

    @OnClick(R.id.btn_Continue)
    void onBtnNextClick() {
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", true);
                startActivity(endSec);

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

        /*finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);*/
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

        AppMain.endActivity(this, this);

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateCounsellingSession();
        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCs = new JSONObject();

        sCs.put("cs01", cs01a.isChecked() ? "1" : cs01b.isChecked() ? "2" : "0");
        sCs.put("cs02a", cs02a.getText().toString());
        sCs.put("cs02b", cs02b.getText().toString());
        sCs.put("cs02c", cs02c.getText().toString());
        sCs.put("cs03", cs03a.isChecked() ? "1" : cs03b.isChecked() ? "2" : cs03c.isChecked() ? "3" : cs03d.isChecked() ? "4" : "0");
        sCs.put("cs04a", cs04a.isChecked() ? "1" : "0");
        sCs.put("cs04b", cs04b.isChecked() ? "2" : "0");
        sCs.put("cs04c", cs04c.isChecked() ? "3" : "0");
        sCs.put("cs0488", cs0488.isChecked() ? "88" : "0");
        sCs.put("cs0488x", cs0488x.getText().toString());
        sCs.put("cs05a", cs05a.isChecked() ? "1" : "0");
        sCs.put("cs05b", cs05b.isChecked() ? "2" : "0");
        sCs.put("cs05c", cs05c.isChecked() ? "3" : "0");
        sCs.put("cs05d", cs05d.isChecked() ? "4" : "0");
        sCs.put("cs05e", cs05e.isChecked() ? "5" : "0");
        sCs.put("cs05f", cs05f.isChecked() ? "6" : "0");
        sCs.put("cs05g", cs05g.isChecked() ? "7" : "0");
        sCs.put("cs05h", cs05h.isChecked() ? "8" : "0");
        sCs.put("cs05i", cs05i.isChecked() ? "9" : "0");
        sCs.put("cs05j", cs05j.isChecked() ? "10" : "0");
        sCs.put("cs05k", cs05k.isChecked() ? "11" : "0");
        sCs.put("cs05l", cs05l.isChecked() ? "12" : "0");
        sCs.put("cs0588", cs0588.isChecked() ? "88" : "0");
        sCs.put("cs0588x", cs0588x.getText().toString());

        AppMain.fc.setCounsellingSession(String.valueOf(sCs));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section M", Toast.LENGTH_SHORT).show();


        //=================== cs01 ==============
        if (cs01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs01), Toast.LENGTH_SHORT).show();
            cs01b.setError("This data is Required!");
            Log.i(TAG, "cs01: This Data is Required!");
            return false;
        } else {
            cs01b.setError(null);
        }

        if (cs01a.isChecked()) {
            //=================== cs02 ==============
            if ((cs02a.getText().toString().isEmpty() || cs02b.getText().toString().isEmpty() || cs02c.getText().toString().isEmpty())) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.pc06), Toast.LENGTH_SHORT).show();
                cs02c.setError("This data is Required!");

                Log.i(TAG, "cs02: This data is Required!");
                return false;
            } else {
                cs02c.setError(null);
            }


            //if (!cs0288.isChecked()) {

                if (Integer.valueOf(cs02a.getText().toString().isEmpty() ? "0" : cs02a.getText().toString()) == 0
                        && Integer.valueOf(cs02b.getText().toString().isEmpty() ? "0" : cs02b.getText().toString()) == 0
                        && Integer.valueOf(cs02c.getText().toString().isEmpty() ? "0" : cs02c.getText().toString()) == 0) {
                    Toast.makeText(this, "ERROR(invalid)" + getString(R.string.cs02), Toast.LENGTH_SHORT).show();
                    cs02a.setError("Days, months and year can not be zero..");
                    cs02b.setError("Days, months and year can not be zero..");
                    cs02c.setError("Days, months and year can not be zero..");

                    Log.i(TAG, "cs02: can not be zero");
                    return false;
                } else {
                    cs02a.setError(null);
                    cs02b.setError(null);
                    cs02c.setError(null);
                }


                if (Integer.valueOf(cs02a.getText().toString().isEmpty() ? "0" : cs02a.getText().toString()) < 0
                        || Integer.valueOf(cs02a.getText().toString().isEmpty() ? "0" : cs02a.getText().toString()) > 29) {
                    Toast.makeText(this, "ERROR(invalid)" + getString(R.string.pc06) + " - " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                    cs02a.setError("Range is 0 to 29 days");

                    Log.i(TAG, "cs02a: Range is 0 to 29 days");
                    return false;
                } else {
                    cs02a.setError(null);
                }

                if (Integer.valueOf(cs02b.getText().toString().isEmpty() ? "0" : cs02b.getText().toString()) < 0
                        || Integer.valueOf(cs02b.getText().toString().isEmpty() ? "0" : cs02b.getText().toString()) > 44) {
                    Toast.makeText(this, "ERROR(invalid)" + getString(R.string.pc06) + " - " + getString(R.string.month), Toast.LENGTH_SHORT).show();
                    cs02b.setError("Range is 0 to 11 weeks");

                    Log.i(TAG, "cs02b: Range is 0 to 11 weeks");
                    return false;
                } else {
                    cs02b.setError(null);
                }

            if (cs03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs03), Toast.LENGTH_SHORT).show();
                cs03d.setError("This data is Required!");
                Log.i(TAG, "cs03: This Data is Required!");
                return false;
            } else {
                cs03d.setError(null);
            }


            //}

            //=================== cs04==============
            if (!(cs04a.isChecked() || cs04b.isChecked() || cs04c.isChecked() || cs0488.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs04), Toast.LENGTH_SHORT).show();
                cs0488.setError("This data is Required!");
                Log.i(TAG, "cs04: This Data is Required!");
                return false;
            } else {
                cs0488.setError(null);
            }

            //=================== others ==============
            if (cs0488.isChecked() && cs0488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs04) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                cs0488x.setError("This data is Required!");
                Log.i(TAG, "cs0488x: This Data is Required!");
                return false;
            } else {
                cs0488x.setError(null);
            }

            // ====================== cs05 ===================
            if (!(cs05a.isChecked() || cs05b.isChecked() || cs05c.isChecked() || cs05d.isChecked()
                    || cs05e.isChecked() || cs05f.isChecked() || cs05g.isChecked() || cs05h.isChecked() || cs05i.isChecked() || cs05j.isChecked()
                    || cs05k.isChecked() || cs05l.isChecked() || cs0588.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cs05), Toast.LENGTH_LONG).show();
                cs0588.setError("This data is Required!");    // Set Error on last check box
                Log.i(TAG, "b2516: This data is Required!");
                return false;
            } else {
                cs0588.setError(null);
            }

            //=================== others ==============
            if (cs0588.isChecked() && cs0588x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs05) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                cs0588x.setError("This data is Required!");
                Log.i(TAG, "cs0488x: This Data is Required!");
                return false;
            } else {
                cs0588x.setError(null);
            }
        }
        return true;

    }



    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}