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
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChildMorbidityActivity extends Activity {

    private static final String TAG = ChildMorbidityActivity.class.getSimpleName();

    @BindView(R.id.cm01a)
    CheckBox cm01a;
    @BindView(R.id.cm01b)
    CheckBox cm01b;
    @BindView(R.id.cm01c)
    CheckBox cm01c;
    @BindView(R.id.cm01d)
    CheckBox cm01d;
    @BindView(R.id.cm01e)
    CheckBox cm01e;
    @BindView(R.id.cm01f)
    CheckBox cm01f;
    @BindView(R.id.cm01g)
    CheckBox cm01g;
    @BindView(R.id.cm01h)
    CheckBox cm01h;
    @BindView(R.id.cm0177)
    CheckBox cm0177;
    @BindView(R.id.cm0188)
    CheckBox cm0188;
    @BindView(R.id.cm0188x)
    EditText cm0188x;
    @BindView(R.id.fldGrpcm02)
    LinearLayout fldGrpcm02;
    @BindView(R.id.cm02)
    RadioGroup cm02;
    @BindView(R.id.cm02a)
    RadioButton cm02a;
    @BindView(R.id.cm02b)
    RadioButton cm02b;
    @BindView(R.id.fldGrpcm03)
    LinearLayout fldGrpcm03;
    @BindView(R.id.cm03a)
    CheckBox cm03a;
    @BindView(R.id.cm03b)
    CheckBox cm03b;
    @BindView(R.id.cm03c)
    CheckBox cm03c;
    @BindView(R.id.cm03d)
    CheckBox cm03d;
    @BindView(R.id.cm03e)
    CheckBox cm03e;
    @BindView(R.id.cm03f)
    CheckBox cm03f;
    @BindView(R.id.cm03g)
    CheckBox cm03g;
    @BindView(R.id.cm03h)
    CheckBox cm03h;
    @BindView(R.id.cm0388)
    CheckBox cm0388;
    @BindView(R.id.cm0388x)
    EditText cm0388x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_morbidity);
        ButterKnife.bind(this);

        cm0177.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcm02.setVisibility(View.GONE);
                    cm01a.setChecked(false);
                    cm01b.setChecked(false);
                    cm01c.setChecked(false);
                    cm01d.setChecked(false);
                    cm01e.setChecked(false);
                    cm01f.setChecked(false);
                    cm01g.setChecked(false);
                    cm01h.setChecked(false);
                    cm0188.setChecked(false);
                    cm0188x.setText(null);
                    cm02.clearCheck();
                    cm03a.setChecked(false);
                    cm03b.setChecked(false);
                    cm03c.setChecked(false);
                    cm03d.setChecked(false);
                    cm03e.setChecked(false);
                    cm03f.setChecked(false);
                    cm03g.setChecked(false);
                    cm03h.setChecked(false);
                    cm0388.setChecked(false);
                } else {
                    fldGrpcm02.setVisibility(View.VISIBLE);
                }
            }
        });

        cm0188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cm0188x.setVisibility(View.VISIBLE);
                } else {
                    cm0188x.setVisibility(View.GONE);
                    cm0188x.setText(null);
                }
            }
        });

        cm02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cm02a.isChecked()) {
                    fldGrpcm03.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcm03.setVisibility(View.GONE);
                    cm03a.setChecked(false);
                    cm03b.setChecked(false);
                    cm03c.setChecked(false);
                    cm03d.setChecked(false);
                    cm03e.setChecked(false);
                    cm03f.setChecked(false);
                    cm03g.setChecked(false);
                    cm03h.setChecked(false);
                    cm0388.setChecked(false);
                }
            }
        });

        cm0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cm0388x.setVisibility(View.VISIBLE);
                } else {
                    cm0388x.setVisibility(View.GONE);
                    cm0388x.setText(null);
                }
            }
        });



    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {

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

                //Intent secNext = new Intent(this, Section5cActivity.class);
                //secNext.putExtra("check", false);
                //startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
       /* if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        /*int updcount = db.updateS5b();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        */
        return false;
        //}

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject scm = new JSONObject();

        scm.put("cm01a", cm01a.isChecked() ? "1" : "0");
        scm.put("cm01b", cm01b.isChecked() ? "1" : "0");
        scm.put("cm01c", cm01c.isChecked() ? "1" : "0");
        scm.put("cm01d", cm01d.isChecked() ? "1" : "0");
        scm.put("cm01e", cm01e.isChecked() ? "1" : "0");
        scm.put("cm01f", cm01f.isChecked() ? "1" : "0");
        scm.put("cm01g", cm01g.isChecked() ? "1" : "0");
        scm.put("cm01h", cm01h.isChecked() ? "1" : "0");
        scm.put("cm0177", cm0177.isChecked() ? "77" : "0");
        scm.put("cm0188", cm0188.isChecked() ? "88" : "0");
        scm.put("cm0188x", cm0188x.getText().toString());
        scm.put("cm02", cm02a.isChecked() ? "1" : cm02b.isChecked() ? "2" : "0");
        scm.put("cm03a", cm03a.isChecked() ? "1" : "0");
        scm.put("cm03b", cm03b.isChecked() ? "1" : "0");
        scm.put("cm03c", cm03c.isChecked() ? "1" : "0");
        scm.put("cm03d", cm03d.isChecked() ? "1" : "0");
        scm.put("cm03e", cm03e.isChecked() ? "1" : "0");
        scm.put("cm03f", cm03f.isChecked() ? "1" : "0");
        scm.put("cm03g", cm03g.isChecked() ? "1" : "0");
        scm.put("cm03h", cm03h.isChecked() ? "1" : "0");
        scm.put("cm0388", cm0388.isChecked() ? "88" : "0");
        scm.put("cm0388x", cm0388x.getText().toString());


        //AppMain.fc.setROW_S5b(String.valueOf(s5b));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }


    private boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (!(cm01a.isChecked() && cm01b.isChecked() && cm01c.isChecked() && cm01d.isChecked() && cm01e.isChecked()
                && cm01f.isChecked() && cm01g.isChecked() && cm01h.isChecked() && cm0177.isChecked() && cm0188.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm01), Toast.LENGTH_LONG).show();
            cm0188.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "cm01: This data is Required!");
            return false;
        } else {
            cm0188.setError(null);
        }

        if (cm0188.isChecked() && cm0188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm01) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            cm0188x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "cm0188x: This data is Required!");
            return false;
        } else {
            cm0188x.setError(null);
        }

        if (!cm0177.isChecked()) {
            if (cm02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm02), Toast.LENGTH_LONG).show();
                cm02b.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "cm02: This data is Required!");
                return false;
            } else {
                cm02b.setError(null);
            }

            if (cm02a.isChecked()) {
                if (!(cm03a.isChecked() && cm03b.isChecked() && cm03c.isChecked() && cm03d.isChecked() && cm03e.isChecked()
                        && cm03f.isChecked() && cm03g.isChecked() && cm03h.isChecked() && cm0388.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm03), Toast.LENGTH_LONG).show();
                    cm0388.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "cm03: This data is Required!");
                    return false;
                } else {
                    cm0388.setError(null);
                }

                if (cm0388.isChecked() && cm0388x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cm03) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    cm0388x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "cm0388x: This data is Required!");
                    return false;
                } else {
                    cm0388x.setError(null);
                }
            }
        }

        return true;
    }



}
