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

public class PostpartumCareActivity extends Activity {

    private static final String TAG = PostpartumCareActivity.class.getSimpleName();

    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.pc01)
    RadioGroup pc01;
    @BindView(R.id.pc01a)
    RadioButton pc01a;
    @BindView(R.id.pc01b)
    RadioButton pc01b;
    @BindView(R.id.fldGrppc02)
    LinearLayout fldGrppc02;
    @BindView(R.id.pc02a)
    CheckBox pc02a;
    @BindView(R.id.pc02b)
    CheckBox pc02b;
    @BindView(R.id.pc02c)
    CheckBox pc02c;
    @BindView(R.id.pc02d)
    CheckBox pc02d;
    @BindView(R.id.pc02e)
    CheckBox pc02e;
    @BindView(R.id.pc02f)
    CheckBox pc02f;
    @BindView(R.id.pc0288)
    CheckBox pc0288;
    @BindView(R.id.pc0288x)
    EditText pc0288x;
    @BindView(R.id.pc03)
    RadioGroup pc03;
    @BindView(R.id.pc03a)
    RadioButton pc03a;
    @BindView(R.id.pc03b)
    RadioButton pc03b;
    @BindView(R.id.fldGrppc04)
    LinearLayout fldGrppc04;
    @BindView(R.id.pc04a)
    EditText pc04a;
    @BindView(R.id.pc04b)
    EditText pc04b;
    @BindView(R.id.pc04c)
    EditText pc04c;
    @BindView(R.id.fldGrppc05)
    LinearLayout fldGrppc05;
    @BindView(R.id.pc05a)
    CheckBox pc05a;
    @BindView(R.id.pc05b)
    CheckBox pc05b;
    @BindView(R.id.pc05c)
    CheckBox pc05c;
    @BindView(R.id.pc05d)
    CheckBox pc05d;
    @BindView(R.id.pc05e)
    CheckBox pc05e;
    @BindView(R.id.pc0588)
    CheckBox pc0588;
    @BindView(R.id.pc0588x)
    EditText pc0588x;
    @BindView(R.id.pc06a)
    EditText pc06a;
    @BindView(R.id.pc06b)
    EditText pc06b;
    @BindView(R.id.pc0699)
    CheckBox pc0699;
    @BindView(R.id.fldGrppc07)
    LinearLayout fldGrppc07;
    @BindView(R.id.pc07a)
    RadioGroup pc07a;
    @BindView(R.id.pc07a01)
    RadioButton pc07a01;
    @BindView(R.id.pc07a02)
    RadioButton pc07a02;
    @BindView(R.id.pc07b)
    RadioGroup pc07b;
    @BindView(R.id.pc07b01)
    RadioButton pc07b01;
    @BindView(R.id.pc07b02)
    RadioButton pc07b02;
    @BindView(R.id.pc07c)
    RadioGroup pc07c;
    @BindView(R.id.pc07c01)
    RadioButton pc07c01;
    @BindView(R.id.pc07c02)
    RadioButton pc07c02;
    @BindView(R.id.pc07d)
    RadioGroup pc07d;
    @BindView(R.id.pc07d01)
    RadioButton pc07d01;
    @BindView(R.id.pc07d02)
    RadioButton pc07d02;
    @BindView(R.id.pc07e)
    RadioGroup pc07e;
    @BindView(R.id.pc07e01)
    RadioButton pc07e01;
    @BindView(R.id.pc07e02)
    RadioButton pc07e02;
    @BindView(R.id.pc08)
    RadioGroup pc08;
    @BindView(R.id.pc08a)
    RadioButton pc08a;
    @BindView(R.id.pc08b)
    RadioButton pc08b;
    @BindView(R.id.fldGrppc09)
    LinearLayout fldGrppc09;
    @BindView(R.id.pc09a)
    CheckBox pc09a;
    @BindView(R.id.pc09b)
    CheckBox pc09b;
    @BindView(R.id.pc09c)
    CheckBox pc09c;
    @BindView(R.id.pc09d)
    CheckBox pc09d;
    @BindView(R.id.pc09e)
    CheckBox pc09e;
    @BindView(R.id.pc09f)
    CheckBox pc09f;
    @BindView(R.id.pc09g)
    CheckBox pc09g;
    @BindView(R.id.pc09h)
    CheckBox pc09h;
    @BindView(R.id.pc09i)
    CheckBox pc09i;
    @BindView(R.id.pc0988)
    CheckBox pc0988;
    @BindView(R.id.pc0988x)
    EditText pc0988x;
    @BindView(R.id.pc10)
    RadioGroup pc10;
    @BindView(R.id.pc10a)
    RadioButton pc10a;
    @BindView(R.id.pc10b)
    RadioButton pc10b;
    @BindView(R.id.fldGrppc11)
    LinearLayout fldGrppc11;
    @BindView(R.id.pc11a)
    EditText pc11a;
    @BindView(R.id.pc11b)
    EditText pc11b;
    @BindView(R.id.pc11c)
    EditText pc11c;
    @BindView(R.id.fldGrppc12)
    LinearLayout fldGrppc12;
    @BindView(R.id.pc12a)
    CheckBox pc12a;
    @BindView(R.id.pc12b)
    CheckBox pc12b;
    @BindView(R.id.pc12c)
    CheckBox pc12c;
    @BindView(R.id.pc12d)
    CheckBox pc12d;
    @BindView(R.id.pc12e)
    CheckBox pc12e;
    @BindView(R.id.pc1288)
    CheckBox pc1288;
    @BindView(R.id.pc1288x)
    EditText pc1288x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postpartum_care);
        ButterKnife.bind(this);

        pc01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (pc01a.isChecked()) {
                    fldGrppc02.setVisibility(View.VISIBLE);
                } else {
                    fldGrppc02.setVisibility(View.GONE);
                    pc02a.setChecked(false);
                    pc02b.setChecked(false);
                    pc02c.setChecked(false);
                    pc02d.setChecked(false);
                    pc02e.setChecked(false);
                    pc0288.setChecked(false);
                    pc0288x.setText(null);
                    pc03.clearCheck();
                    pc04a.setText(null);
                    pc04b.setText(null);
                    pc04c.setText(null);
                    pc05a.setChecked(false);
                    pc05b.setChecked(false);
                    pc05c.setChecked(false);
                    pc05d.setChecked(false);
                    pc05e.setChecked(false);
                    pc0588.setChecked(false);
                    pc0588x.setText(null);
                }
            }
        });

        pc0288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    pc0288x.setVisibility(View.VISIBLE);
                } else {
                    pc0288x.setVisibility(View.GONE);
                }
            }
        });

        pc0588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    pc0588x.setVisibility(View.VISIBLE);
                } else {
                    pc0588x.setVisibility(View.GONE);
                    pc0588x.setText(null);
                }
            }
        });

        pc03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (pc03a.isChecked()) {
                    fldGrppc05.setVisibility(View.VISIBLE);
                    fldGrppc04.setVisibility(View.GONE);
                    pc04a.setText(null);
                    pc04b.setText(null);
                    pc04c.setText(null);
                } else {
                    fldGrppc04.setVisibility(View.VISIBLE);
                    fldGrppc05.setVisibility(View.GONE);
                    pc05a.setChecked(false);
                    pc05b.setChecked(false);
                    pc05c.setChecked(false);
                    pc05d.setChecked(false);
                    pc05e.setChecked(false);
                    pc0588.setChecked(false);
                    pc0588x.setText(null);
                }
            }
        });

        pc0699.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    pc06a.setVisibility(View.GONE);
                    pc06b.setVisibility(View.GONE);
                    pc06a.setText(null);
                    pc06b.setText(null);
                    fldGrppc07.setVisibility(View.GONE);
                    pc07a.clearCheck();
                    pc07b.clearCheck();
                    pc07c.clearCheck();
                    pc07d.clearCheck();
                    pc07e.clearCheck();
                    //pc07f.setChecked(false);
                } else {
                    pc06a.setVisibility(View.VISIBLE);
                    pc06b.setVisibility(View.VISIBLE);
                    fldGrppc07.setVisibility(View.VISIBLE);
                }
            }
        });

        /*pc07f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    pc07a.setChecked(false);
                    pc07b.setChecked(false);
                    pc07c.setChecked(false);
                    pc07d.setChecked(false);
                    pc07e.setChecked(false);
                }
            }
        });*/

        pc08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (pc08a.isChecked()) {
                    fldGrppc09.setVisibility(View.VISIBLE);

                } else {
                    fldGrppc09.setVisibility(View.GONE);
                    pc09a.setChecked(false);
                    pc09b.setChecked(false);
                    pc09c.setChecked(false);
                    pc09d.setChecked(false);
                    pc09e.setChecked(false);
                    pc09f.setChecked(false);
                    pc09g.setChecked(false);
                    pc09h.setChecked(false);
                    pc09i.setChecked(false);
                    pc0988.setChecked(false);
                    pc0988x.setText(null);
                    pc10.clearCheck();
                    pc11a.setText(null);
                    pc11b.setText(null);
                    pc11c.setText(null);
                    pc12a.setChecked(false);
                    pc12b.setChecked(false);
                    pc12c.setChecked(false);
                    pc12d.setChecked(false);
                    pc12e.setChecked(false);
                    pc1288.setChecked(false);
                    pc1288x.setText(null);

                }
            }
        });

        pc10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (pc10a.isChecked()) {
                    fldGrppc11.setVisibility(View.GONE);
                    pc11a.setText(null);
                    pc11b.setText(null);
                    pc11c.setText(null);
                    fldGrppc12.setVisibility(View.VISIBLE);
                } else {
                    fldGrppc11.setVisibility(View.VISIBLE);
                    fldGrppc12.setVisibility(View.GONE);
                    pc12a.setChecked(false);
                    pc12b.setChecked(false);
                    pc12c.setChecked(false);
                    pc12d.setChecked(false);
                    pc12e.setChecked(false);
                    pc1288.setChecked(false);
                    pc1288x.setText(null);
                }
            }
        });

        pc1288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    pc1288x.setVisibility(View.VISIBLE);
                } else {
                    pc1288x.setVisibility(View.GONE);
                    pc1288x.setText(null);
                }
            }
        });

        pc0988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    pc0988x.setVisibility(View.VISIBLE);
                } else {
                    pc0988x.setVisibility(View.GONE);
                    pc0988x.setText(null);
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

                if (AppMain.outcome == 1) {
                    Intent secNext = new Intent(this, IYCFActivity.class);
                    secNext.putExtra("check", false);
                    startActivity(secNext);
                } else if (AppMain.chTotal > 0) {
                    Intent secNext = new Intent(this, ChildMorbidityActivity.class);
                    secNext.putExtra("check", false);
                    startActivity(secNext);
                } else {
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
        /*Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
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

        int updcount = db.updatePostpartumCare();

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

        JSONObject spc = new JSONObject();

        spc.put("pc01", pc01a.isChecked() ? "1" : pc01b.isChecked() ? "2" : "0");

        // Radio Group
        spc.put("pc02a", pc02a.isChecked() ? "1" : "0");
        spc.put("pc02b", pc02b.isChecked() ? "2" : "0");
        spc.put("pc02c", pc02c.isChecked() ? "3" : "0");
        spc.put("pc02d", pc02d.isChecked() ? "4" : "0");
        spc.put("pc02e", pc02e.isChecked() ? "5" : "0");
        spc.put("pc02f", pc02f.isChecked() ? "6" : "0");
        spc.put("pc0288", pc0288.isChecked() ? "88" : "0");

        // Edit Text
        spc.put("pc0288x", pc0288x.getText().toString());

        spc.put("pc03", pc03a.isChecked() ? "1" : pc03b.isChecked() ? "2" : "0");

        //Edit Text
        spc.put("pc04a", pc04a.getText().toString());
        spc.put("pc04b", pc04b.getText().toString());
        spc.put("pc04c", pc04c.getText().toString());

        // Radio Group
        spc.put("pc05a", pc05a.isChecked() ? "1" : "0");
        spc.put("pc05b", pc05b.isChecked() ? "2" : "0");
        spc.put("pc05c", pc05c.isChecked() ? "3" : "0");
        spc.put("pc05d", pc05d.isChecked() ? "4" : "0");
        spc.put("pc05e", pc05e.isChecked() ? "5" : "0");
        spc.put("pc0588", pc0588.isChecked() ? "88" : "0");
        spc.put("pc0588x", pc0588x.getText().toString());
        spc.put("pc06a", pc06a.getText().toString());
        spc.put("pc06b", pc06b.getText().toString());
        spc.put("pc0699", pc0699.isChecked() ? "99" : "0");
        spc.put("pc07a", pc07a01.isChecked() ? "1" : pc07a02.isChecked() ? "2" : "0");
        spc.put("pc07b", pc07b01.isChecked() ? "1" : pc07b02.isChecked() ? "2" : "0");
        spc.put("pc07c", pc07c01.isChecked() ? "1" : pc07c02.isChecked() ? "2" : "0");
        spc.put("pc07d", pc07d01.isChecked() ? "1" : pc07d02.isChecked() ? "2" : "0");
        spc.put("pc07e", pc07e01.isChecked() ? "1" : pc07e02.isChecked() ? "2" : "0");
        spc.put("pc08", pc08a.isChecked() ? "1" : pc08b.isChecked() ? "2" : "0");
        spc.put("pc09a", pc09a.isChecked() ? "1" : "0");
        spc.put("pc09b", pc09b.isChecked() ? "2" : "0");
        spc.put("pc09c", pc09c.isChecked() ? "3" : "0");
        spc.put("pc09d", pc09d.isChecked() ? "4" : "0");
        spc.put("pc09e", pc09e.isChecked() ? "5" : "0");
        spc.put("pc09f", pc09f.isChecked() ? "6" : "0");
        spc.put("pc09g", pc09g.isChecked() ? "7" : "0");
        spc.put("pc09h", pc09h.isChecked() ? "8" : "0");
        spc.put("pc09i", pc09i.isChecked() ? "9" : "0");
        spc.put("pc0988", pc0988.isChecked() ? "88" : "0");
        spc.put("pc0988x", pc0988x.getText().toString());
        spc.put("pc10", pc10a.isChecked() ? "1" : pc10b.isChecked() ? "2" : "0");
        spc.put("pc11a", pc11a.getText().toString());
        spc.put("pc11b", pc11b.getText().toString());
        spc.put("pc11c", pc11c.getText().toString());
        spc.put("pc12a", pc12a.isChecked() ? "1" : "0");
        spc.put("pc12b", pc12b.isChecked() ? "2" : "0");
        spc.put("pc12c", pc12c.isChecked() ? "3" : "0");
        spc.put("pc12d", pc12d.isChecked() ? "4" : "0");
        spc.put("pc12e", pc12e.isChecked() ? "5" : "0");
        spc.put("pc1288", pc1288.isChecked() ? "88" : "0");
        spc.put("pc1288x", pc1288x.getText().toString());

        AppMain.fc.setPostpartumCare(String.valueOf(spc));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }


    private boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (pc01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc01), Toast.LENGTH_LONG).show();
            pc01b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "pc01: This data is Required!");
            return false;
        } else {
            pc01b.setError(null);
        }

        if (pc01a.isChecked()) {
            // RadioGroup
            if (!(pc02a.isChecked() || pc02b.isChecked() || pc02c.isChecked() || pc02d.isChecked()
                    || pc02e.isChecked() || pc02f.isChecked() || pc0288.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc02), Toast.LENGTH_LONG).show();
                pc0288.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "pc02: This data is Required!");
                return false;
            } else {
                pc0288.setError(null);
            }

            // Others / EditText Q 5.30
            if (pc0288.isChecked() && pc0288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc02) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                pc0288x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "pc0288x: This data is Required!");
                return false;
            } else {
                pc0288x.setError(null);
            }

            if (pc03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc03), Toast.LENGTH_LONG).show();
                pc03b.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "pc03: This data is Required!");
                return false;
            } else {
                pc03b.setError(null);
            }


            if (pc03a.isChecked()) {
                if (!(pc05a.isChecked() || pc05b.isChecked() || pc05c.isChecked() || pc05d.isChecked() || pc05e.isChecked()
                        || pc0588.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc05), Toast.LENGTH_LONG).show();
                    pc0588.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "pc05: This data is Required!");
                    return false;
                } else {
                    pc0588.setError(null);
                }


                if (pc0588.isChecked() && pc0588x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc05) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    pc0588x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "pc0588x: This data is Required!");
                    return false;
                } else {
                    pc0588x.setError(null);
                }

            }
            //}

            if (pc03b.isChecked()) {
                if (pc04a.getText().toString().isEmpty() && pc04b.getText().toString().isEmpty() && pc04c.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc04), Toast.LENGTH_LONG).show();
                    pc04a.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "pc04: This data is Required!");
                } else {
                    pc04a.setError(null);
                }

            }
        }



        // ===================== Q 5.38 ===========================
        // RadioGroup
        if ((pc06a.getText().toString().isEmpty() || pc06b.getText().toString().isEmpty()) && !pc0699.isChecked()) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.pc06), Toast.LENGTH_SHORT).show();
            pc0699.setError("This data is Required!");

            Log.i(TAG, "pc06: This data is Required!");
            return false;
        } else {
            pc0699.setError(null);
        }

        if (!pc0699.isChecked()) {
            if (Integer.valueOf(pc06a.getText().toString().isEmpty() ? "0" : pc06a.getText().toString()) < 0
                    || Integer.valueOf(pc06a.getText().toString().isEmpty() ? "0" : pc06a.getText().toString()) > 6) {
                Toast.makeText(this, "ERROR(invalid)" + getString(R.string.pc06) + " - " + getString(R.string.days), Toast.LENGTH_SHORT).show();
                pc06a.setError("Range is 0 to 6 days");

                Log.i(TAG, "pc06a: Range is 0 to 6 days");
                return false;
            } else {
                pc06a.setError(null);
            }

            if (Integer.valueOf(pc06b.getText().toString().isEmpty() ? "0" : pc06b.getText().toString()) < 0
                    || Integer.valueOf(pc06b.getText().toString().isEmpty() ? "0" : pc06b.getText().toString()) > 44) {
                Toast.makeText(this, "ERROR(invalid)" + getString(R.string.pc06) + " - " + getString(R.string.month), Toast.LENGTH_SHORT).show();
                pc06b.setError("Range is 0 to 44 weeks");

                Log.i(TAG, "pc06b: Range is 0 to 44 weeks");
                return false;
            } else {
                pc06b.setError(null);
            }

            if (pc07a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc07a), Toast.LENGTH_LONG).show();
                pc07a01.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "pc07a: This data is Required!");
                return false;
            } else {
                pc07a01.setError(null);
            }

            if (pc07b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc07b), Toast.LENGTH_LONG).show();
                pc07b01.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "pc07b: This data is Required!");
                return false;
            } else {
                pc07b01.setError(null);
            }

            if (pc07c.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc07c), Toast.LENGTH_LONG).show();
                pc07c01.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "pc07c: This data is Required!");
                return false;
            } else {
                pc07c01.setError(null);
            }

            if (pc07d.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc07d), Toast.LENGTH_LONG).show();
                pc07d01.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "pc07d: This data is Required!");
                return false;
            } else {
                pc07d01.setError(null);
            }

            if (pc07e.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc07e), Toast.LENGTH_LONG).show();
                pc07e01.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "pc07e: This data is Required!");
                return false;
            } else {
                pc07e01.setError(null);
            }

        }

        if (pc08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc08), Toast.LENGTH_LONG).show();
            pc08b.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "pc08: This data is Required!");
            return false;
        } else {
            pc08b.setError(null);
        }

        if (pc08a.isChecked()) {
            if (!(pc09a.isChecked() || pc09b.isChecked() || pc09c.isChecked() || pc09d.isChecked() || pc09e.isChecked()
                    || pc09f.isChecked() || pc09g.isChecked() || pc09h.isChecked() || pc09i.isChecked() || pc0988.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc09), Toast.LENGTH_LONG).show();
                pc0988.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "pc09: This data is Required!");
                return false;
            } else {
                pc0988.setError(null);
            }

            if (pc0988.isChecked() && pc0988x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc09) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                pc0988x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "pc0988x: This data is Required!");
                return false;
            } else {
                pc0988x.setError(null);
            }


            if (pc10.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc10), Toast.LENGTH_LONG).show();
                pc10b.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "pc10: This data is Required!");
                return false;
            } else {
                pc10b.setError(null);
            }



            if (pc10a.isChecked()) {
                if (!(pc12a.isChecked() || pc12b.isChecked() || pc12c.isChecked() || pc12d.isChecked() || pc12e.isChecked()
                        || pc1288.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc12), Toast.LENGTH_LONG).show();
                    pc1288.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "pc12: This data is Required!");
                    return false;
                } else {
                    pc1288.setError(null);
                }

                if (pc1288.isChecked() && pc1288x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc12) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    pc1288x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "pc1288x: This data is Required!");
                    return false;
                } else {
                    pc1288x.setError(null);
                }
            } else {
                if (pc11a.getText().toString().isEmpty() && pc11b.getText().toString().isEmpty()
                        && pc11c.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pc11), Toast.LENGTH_LONG).show();
                    pc11a.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "pc11: This data is Required!");
                    return false;
                } else {
                    pc11a.setError(null);
                }
            }



        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }





}
