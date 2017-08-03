package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
    @BindView(R.id.fldGrpcs02)
    LinearLayout fldGrpcs02;
    @BindView(R.id.cs02a)
    EditText cs02a;
    @BindView(R.id.cs02b)
    EditText cs02b;
    @BindView(R.id.cs02c)
    EditText cs02c;
    @BindView(R.id.cs0288)
    CheckBox cs0288;
    @BindView(R.id.cs03)
    RadioGroup cs03;
    @BindView(R.id.cs03a)
    RadioButton cs03a;
    @BindView(R.id.cs03b)
    RadioButton cs03b;
    @BindView(R.id.cs03c)
    RadioButton cs03c;
    @BindView(R.id.cs0388)
    RadioButton cs0388;
    @BindView(R.id.cs0388x)
    EditText cs0388x;
    @BindView(R.id.cs04a)
    CheckBox cs04a;
    @BindView(R.id.cs04b)
    CheckBox cs04b;
    @BindView(R.id.cs04c)
    CheckBox cs04c;
    @BindView(R.id.cs04d)
    CheckBox cs04d;
    @BindView(R.id.cs04e)
    CheckBox cs04e;
    @BindView(R.id.cs04f)
    CheckBox cs04f;
    @BindView(R.id.cs04g)
    CheckBox cs04g;
    @BindView(R.id.cs04h)
    CheckBox cs04h;
    @BindView(R.id.cs04i)
    CheckBox cs04i;
    @BindView(R.id.cs04j)
    CheckBox cs04j;
    @BindView(R.id.cs04k)
    CheckBox cs04k;
    @BindView(R.id.cs04l)
    CheckBox cs04l;
    @BindView(R.id.cs0488)
    CheckBox cs0488;
    @BindView(R.id.cs0488x)
    EditText cs0488x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counseling_sessions);
        ButterKnife.bind(this);


        cs0288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cs0288.isChecked()) {
                    cs02a.setText(null);
                    cs02b.setText(null);
                    cs02c.setText(null);
                    cs02a.setEnabled(false);
                    cs02b.setEnabled(false);
                    cs02c.setEnabled(false);
                    fldGrpcs02.setVisibility(View.GONE);
                } else {
                    cs02a.setEnabled(true);
                    cs02b.setEnabled(true);
                    cs02c.setEnabled(true);
                    cs0288.setChecked(false);
                    fldGrpcs02.setVisibility(View.VISIBLE);
                }
            }
        });

        // =================== Q03 Others ====================

        cs0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cs0388x.setVisibility(View.VISIBLE);
                } else {
                    cs0388x.setVisibility(View.GONE);
                    cs0388x.setText(null);
                }
            }
        });

        // =================== Q04 Others ====================

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

        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCs = new JSONObject();

        sCs.put("cs01", cs01a.isChecked() ? "1" : cs01b.isChecked() ? "2" : "0");
        sCs.put("cs02a", cs02a.getText().toString());
        sCs.put("cs02b", cs02b.getText().toString());
        sCs.put("cs02c", cs02c.getText().toString());
        sCs.put("cs0288", cs0288.isChecked() ? "1" : "0");
        sCs.put("cs03", cs03a.isChecked() ? "1" : cs03b.isChecked() ? "2" : cs03c.isChecked() ? "3" : cs0388.isChecked() ? "88" : "0");
        sCs.put("cs0388x", cs0388x.getText().toString());
        sCs.put("cs04a", cs04a.isChecked() ? "1" : "0");
        sCs.put("cs04b", cs04b.isChecked() ? "1" : "0");
        sCs.put("cs04c", cs04c.isChecked() ? "1" : "0");
        sCs.put("cs04d", cs04d.isChecked() ? "1" : "0");
        sCs.put("cs04e", cs04e.isChecked() ? "1" : "0");
        sCs.put("cs04f", cs04f.isChecked() ? "1" : "0");
        sCs.put("cs04g", cs04g.isChecked() ? "1" : "0");
        sCs.put("cs04h", cs04h.isChecked() ? "1" : "0");
        sCs.put("cs04i", cs04i.isChecked() ? "1" : "0");
        sCs.put("cs04j", cs04j.isChecked() ? "1" : "0");
        sCs.put("cs04k", cs04k.isChecked() ? "1" : "0");
        sCs.put("cs04l", cs04l.isChecked() ? "1" : "0");
        sCs.put("cs0488", cs0488.isChecked() ? "1" : "0");
        sCs.put("cs0488x", cs0488x.getText().toString());

        AppMain.fc.setCounsellingSession(String.valueOf(sCs));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section M", Toast.LENGTH_SHORT).show();


        //=================== cs01 ==============
        if (cs01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs01), Toast.LENGTH_SHORT).show();
            cs01b.setError("This data is Required!");
            Log.i(TAG, "b09: This Data is Required!");
            return false;
        } else {
            cs01b.setError(null);
        }

        //=================== cs02 ==============
        if ((cs02a.getText().toString().isEmpty() || cs02b.getText().toString().isEmpty() || cs02c.getText().toString().isEmpty()) && !cs0288.isChecked()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.pc06), Toast.LENGTH_SHORT).show();
            cs0288.setError("This data is Required!");

            Log.i(TAG, "pc06: This data is Required!");
            return false;
        } else {
            cs0288.setError(null);
        }

        if (!cs0288.isChecked()) {
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

                Log.i(TAG, "pc06b: Range is 0 to 11 weeks");
                return false;
            } else {
                cs02b.setError(null);
            }

            if (Integer.valueOf(cs02a.getText().toString().isEmpty() ? "0" : cs02a.getText().toString()) == 0
                    && Integer.valueOf(cs02b.getText().toString().isEmpty() ? "0" : cs02b.getText().toString()) == 0
                    && Integer.valueOf(cs02c.getText().toString().isEmpty() ? "0" : cs02c.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid)" + getString(R.string.cs02), Toast.LENGTH_SHORT).show();
                cs02a.setError("Days, months and year can not be zero..");
                cs02b.setError("Days, months and yearcan not be zero..");
                cs02c.setError("Days, months and year can not be zero..");

                Log.i(TAG, "bib16: can not be zero");
                return false;
            } else {
                cs02a.setError(null);
                cs02b.setError(null);
                cs02c.setError(null);
            }
        }
        //=================== cs03==============
        if (cs03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs03), Toast.LENGTH_SHORT).show();
            cs0388.setError("This data is Required!");
            Log.i(TAG, "cs03: This Data is Required!");
            return false;
        } else {
            cs0388.setError(null);
        }

        //=================== others ==============
        if (cs0388.isChecked() && cs0388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs03) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            cs0388x.setError("This data is Required!");
            Log.i(TAG, "cs0388x: This Data is Required!");
            return false;
        } else {
            cs0388x.setError(null);
        }

        // ====================== cs04 ===================
        if (!(cs04a.isChecked() || cs04b.isChecked() || cs04c.isChecked() || cs04d.isChecked()
                || cs04e.isChecked() || cs04f.isChecked() || cs04g.isChecked() || cs04h.isChecked() || cs04i.isChecked() || cs04j.isChecked()
                || cs04k.isChecked() || cs04l.isChecked() || cs0488.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cs04), Toast.LENGTH_LONG).show();
            cs0488.setError("This data is Required!");    // Set Error on last check box
            Log.i(TAG, "b2516: This data is Required!");
            return false;
        } else {
            cs0488.setError(null);
        }

        //=================== others ==============
        if (cs0488.isChecked() && cs0488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cs04) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            cs0488x.setError("This data is Required!");
            Log.i(TAG, "cs0388x: This Data is Required!");
            return false;
        } else {
            cs0488x.setError(null);
        }

        return true;

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

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}