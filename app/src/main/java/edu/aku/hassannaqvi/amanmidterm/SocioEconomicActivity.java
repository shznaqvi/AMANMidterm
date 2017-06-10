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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SocioEconomicActivity extends Activity {

    private static final String TAG = SocioEconomicActivity.class.getSimpleName();

    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.se01a)
    RadioGroup se01a;
    @BindView(R.id.se01a01)
    RadioButton se01a01;
    @BindView(R.id.se01a02)
    RadioButton se01a02;
    @BindView(R.id.se01a03)
    RadioButton se01a03;
    @BindView(R.id.se01a88)
    RadioButton se01a88;
    @BindView(R.id.se01a88x)
    EditText se01a88x;
    @BindView(R.id.se01b)
    RadioGroup se01b;
    @BindView(R.id.se01b01)
    RadioButton se01b01;
    @BindView(R.id.se01b02)
    RadioButton se01b02;
    @BindView(R.id.se01b03)
    RadioButton se01b03;
    @BindView(R.id.se01b04)
    RadioButton se01b04;
    @BindView(R.id.se01b05)
    RadioButton se01b05;
    @BindView(R.id.se01b88)
    RadioButton se01b88;
    @BindView(R.id.se01b88x)
    EditText se01b88x;
    @BindView(R.id.se01c)
    RadioGroup se01c;
    @BindView(R.id.se01c01)
    RadioButton se01c01;
    @BindView(R.id.se01c02)
    RadioButton se01c02;
    @BindView(R.id.se01c03)
    RadioButton se01c03;
    @BindView(R.id.se01c04)
    RadioButton se01c04;
    @BindView(R.id.se01c05)
    RadioButton se01c05;
    @BindView(R.id.se01c06)
    RadioButton se01c06;
    @BindView(R.id.se01c88)
    RadioButton se01c88;
    @BindView(R.id.se01c88x)
    EditText se01c88x;
    @BindView(R.id.se02)
    RadioGroup se02;
    @BindView(R.id.se0201)
    RadioButton se0201;
    @BindView(R.id.se0202)
    RadioButton se0202;
    @BindView(R.id.se0203)
    RadioButton se0203;
    @BindView(R.id.se0288)
    RadioButton se0288;
    @BindView(R.id.se0288x)
    EditText se0288x;
    @BindView(R.id.fldGrpse03)
    LinearLayout fldGrpse03;
    @BindView(R.id.se03)
    EditText se03;
    @BindView(R.id.se0399)
    CheckBox se0399;
    @BindView(R.id.se04)
    EditText se04;
    @BindView(R.id.se05)
    RadioGroup se05;
    @BindView(R.id.se0501)
    RadioButton se0501;
    @BindView(R.id.se0502)
    RadioButton se0502;
    @BindView(R.id.se0503)
    RadioButton se0503;
    @BindView(R.id.se0504)
    RadioButton se0504;
    @BindView(R.id.se0505)
    RadioButton se0505;
    @BindView(R.id.se0506)
    RadioButton se0506;
    @BindView(R.id.se0588)
    RadioButton se0588;
    @BindView(R.id.se0588x)
    EditText se0588x;
    @BindView(R.id.fldGrpse06)
    LinearLayout fldGrpse06;
    @BindView(R.id.se06)
    RadioGroup se06;
    @BindView(R.id.se0601)
    RadioButton se0601;
    @BindView(R.id.se0602)
    RadioButton se0602;
    @BindView(R.id.se0603)
    RadioButton se0603;
    @BindView(R.id.se0604)
    RadioButton se0604;
    @BindView(R.id.se0605)
    RadioButton se0605;
    @BindView(R.id.se0606)
    RadioButton se0606;
    @BindView(R.id.se0688)
    RadioButton se0688;
    @BindView(R.id.se0688x)
    EditText se0688x;
    @BindView(R.id.se07)
    RadioGroup se07;
    @BindView(R.id.se0701)
    RadioButton se0701;
    @BindView(R.id.se0702)
    RadioButton se0702;
    @BindView(R.id.se0703)
    RadioButton se0703;
    @BindView(R.id.se0704)
    RadioButton se0704;
    @BindView(R.id.se0788)
    RadioButton se0788;
    @BindView(R.id.se0788x)
    EditText se0788x;
    @BindView(R.id.se08)
    RadioGroup se08;
    @BindView(R.id.se0801)
    RadioButton se0801;
    @BindView(R.id.se0802)
    RadioButton se0802;
    @BindView(R.id.se0803)
    RadioButton se0803;
    @BindView(R.id.se0888)
    RadioButton se0888;
    @BindView(R.id.se0888x)
    EditText se0888x;
    @BindView(R.id.se09)
    RadioGroup se09;
    @BindView(R.id.se0901)
    RadioButton se0901;
    @BindView(R.id.se0902)
    RadioButton se0902;
    @BindView(R.id.se0903)
    RadioButton se0903;
    @BindView(R.id.se0904)
    RadioButton se0904;
    @BindView(R.id.se0905)
    RadioButton se0905;
    @BindView(R.id.se0988)
    RadioButton se0988;
    @BindView(R.id.se0988x)
    EditText se0988x;
    @BindView(R.id.se10)
    RadioGroup se10;
    @BindView(R.id.se1001)
    RadioButton se1001;
    @BindView(R.id.se1002)
    RadioButton se1002;
    @BindView(R.id.se1003)
    RadioButton se1003;
    @BindView(R.id.se1004)
    RadioButton se1004;
    @BindView(R.id.se1005)
    RadioButton se1005;
    @BindView(R.id.se1006)
    RadioButton se1006;
    @BindView(R.id.se1088)
    RadioButton se1088;
    @BindView(R.id.se1088x)
    EditText se1088x;
    @BindView(R.id.se1101)
    EditText se1101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socio_economic);
        ButterKnife.bind(this);

        //  ============================= Q 8.01 Others ==============================
        se10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se1088.getId()) {

                    se1088x.setVisibility(View.VISIBLE);
                    se1088x.requestFocus();

                } else {

                    se1088x.setVisibility(View.GONE);
                    se1088x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(a) Others ==============================
        se01a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se01a88.getId()) {

                    se01a88x.setVisibility(View.VISIBLE);
                    se01a88x.requestFocus();

                } else {

                    se01a88x.setVisibility(View.GONE);
                    se01a88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(b) Others ==============================
        se01b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se01b88.getId()) {

                    se01b88x.setVisibility(View.VISIBLE);
                    se01b88x.requestFocus();

                } else {

                    se01b88x.setVisibility(View.GONE);
                    se01b88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(c) Others ==============================
        se01c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se01c88.getId()) {

                    se01c88x.setVisibility(View.VISIBLE);
                    se01c88x.requestFocus();

                } else {

                    se01c88x.setVisibility(View.GONE);
                    se01c88x.setText(null);
                }
            }
        });

        se05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0588.getId()) {

                    se0588x.setVisibility(View.VISIBLE);
                    se0588x.requestFocus();

                } else {

                    se0588x.setVisibility(View.GONE);
                    se0588x.setText(null);
                }
            }
        });

        //  ============================= Q 8.06 Others ==============================
        se06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0688.getId()) {

                    se0688x.setVisibility(View.VISIBLE);
                    se0688x.requestFocus();

                } else {

                    se0688x.setVisibility(View.GONE);
                    se0688x.setText(null);
                }
            }
        });

        //  ============================= Q 8.07 Others ==============================
        se07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0788.getId()) {

                    se0788x.setVisibility(View.VISIBLE);
                    se0788x.requestFocus();

                } else {

                    se0788x.setVisibility(View.GONE);
                    se0788x.setText(null);
                }
            }
        });

        //  ============================= Q 8.08 Others ==============================
        se08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0888.getId()) {

                    se0888x.setVisibility(View.VISIBLE);
                    se0888x.requestFocus();

                } else {

                    se0888x.setVisibility(View.GONE);
                    se0888x.setText(null);
                }
            }
        });

        //  ============================= Q 8.14 Others ==============================
        se09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0988.getId()) {

                    se0988x.setVisibility(View.VISIBLE);
                    se0988x.requestFocus();

                } else {

                    se0988x.setVisibility(View.GONE);
                    se0988x.setText(null);
                }
            }
        });

        //  ============================= Q 8.14 Others ==============================
        se10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se1088.getId()) {

                    se1088x.setVisibility(View.VISIBLE);
                    se1088x.requestFocus();

                } else {

                    se1088x.setVisibility(View.GONE);
                    se1088x.setText(null);
                }
            }
        });

        se02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (se0202.isChecked()) {
                    fldGrpse03.setVisibility(View.VISIBLE);
                } else {
                    fldGrpse03.setVisibility(View.GONE);
                    se03.setText(null);
                    se0399.setChecked(false);
                }
            }
        });

        se0399.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    se03.setVisibility(View.GONE);
                    se03.setText(null);
                } else {
                    se03.setVisibility(View.VISIBLE);
                }
            }
        });

        se05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (se0501.isChecked() || se0502.isChecked()) {
                    fldGrpse06.setVisibility(View.GONE);
                    se06.clearCheck();
                    se0688x.setText(null);
                } else {
                    fldGrpse06.setVisibility(View.VISIBLE);
                }
            }
        });

        se0288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    se0288x.setVisibility(View.VISIBLE);
                } else {
                    se0288x.setVisibility(View.GONE);
                    se0288x.setText(null);
                }
            }
        });


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
        endSec.putExtra("check", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                if (SaveDraft()) {

                    if (UpdateDB()) {
                        Toast.makeText(this, "Saving Form", Toast.LENGTH_SHORT).show();

                        finish();

                        startActivity(new Intent(this, AntenatalCareActivity.class));
                    } else {
                        Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        /*int updcount = db.updateSocioEco();

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

    private boolean SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject socioeco = new JSONObject();


        socioeco.put("se01a", se01a01.isChecked() ? "1" : se01a02.isChecked() ? "2" : se01a03.isChecked() ? "3"
                : se01a88.isChecked() ? "88" : "0");
        socioeco.put("se01a88x", se01a88x.getText().toString());
        socioeco.put("se01b", se01b01.isChecked() ? "1" : se01b02.isChecked() ? "2" : se01b03.isChecked() ? "3"
                : se01b04.isChecked() ? "4" : se01b05.isChecked() ? "5" : se01b88.isChecked() ? "88" : "0");
        socioeco.put("se01b88x", se01b88x.getText().toString());
        socioeco.put("se01c", se01c01.isChecked() ? "1" : se01c02.isChecked() ? "2" : se01c03.isChecked() ? "3"
                : se01c04.isChecked() ? "4" : se01c05.isChecked() ? "5" : se01c06.isChecked() ? "6"
                : se01b88.isChecked() ? "88" : "0");
        socioeco.put("se01c88x", se01b88x.getText().toString());
        socioeco.put("se02", se0201.isChecked() ? "1" : se0202.isChecked() ? "2" : se0203.isChecked() ? "3" : "0");
        socioeco.put("se03", se03.getText().toString());
        socioeco.put("se0399", se0399.isChecked() ? "99" : "0");
        socioeco.put("se04", se04.getText().toString());
        socioeco.put("se05", se0501.isChecked() ? "1" : se0502.isChecked() ? "2" : se0503.isChecked() ? "3"
                : se0504.isChecked() ? "4" : se0505.isChecked() ? "5" : se0506.isChecked() ? "6" : se0588.isChecked() ? "88" : "0");
        socioeco.put("se0588x", se0588x.getText().toString());
        socioeco.put("se06", se0601.isChecked() ? "1" : se0602.isChecked() ? "2" : se0603.isChecked() ? "3"
                : se0604.isChecked() ? "4" : se0605.isChecked() ? "5" : se0606.isChecked() ? "6" : se0688.isChecked() ? "88" : "0");
        socioeco.put("se0688x", se0688x.getText().toString());
        socioeco.put("se07", se0701.isChecked() ? "1" : se0702.isChecked() ? "2" : se0703.isChecked() ? "3"
                : se0704.isChecked() ? "4" : se0788.isChecked() ? "88" : "0");
        socioeco.put("se0788x", se0788x.getText().toString());
        socioeco.put("se08", se0801.isChecked() ? "1" : se0802.isChecked() ? "2" : se0803.isChecked() ? "3"
                : se0888.isChecked() ? "88" : "0");
        socioeco.put("se0888x", se0888x.getText().toString());
        socioeco.put("se09", se0901.isChecked() ? "1" : se0902.isChecked() ? "2" : se0903.isChecked() ? "3"
                : se0904.isChecked() ? "4" : se0905.isChecked() ? "5" : se0688.isChecked() ? "88" : "0");
        socioeco.put("se0988x", se0988x.getText().toString());
        socioeco.put("se10", se1001.isChecked() ? "1" : se1002.isChecked() ? "2" : se1003.isChecked() ? "3"
                : se1004.isChecked() ? "4" : se1005.isChecked() ? "5" : se1006.isChecked() ? "6"
                : se1088.isChecked() ? "88" : "0");
        socioeco.put("se1088x", se1088x.getText().toString());
        socioeco.put("se11", se1101.getText().toString());


        //AppMain.fc.setSocioEconomic(String.valueOf(socioeco));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        return true;
    }

    private boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ============ Q 8.01 =======================
        // RadioGroup
        if (se01a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01), Toast.LENGTH_LONG).show();
            se01a88.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se01a: This data is Required!");
            return false;
        } else {
            se01a88.setError(null);
        }

        // Others / EditText Q 8.01
        if (se01a88.isChecked() && se01a88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se01a88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se01: This data is Required!");
            return false;
        } else {
            se01a88x.setError(null);
        }

        // ============ Q 8.02(a) =======================
        // RadioGroup
        if (se01b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01b), Toast.LENGTH_LONG).show();
            se01b88.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se01b: This data is Required!");
            return false;
        } else {
            se01b88.setError(null);
        }

        // Others / EditText Q 8.02 (a)
        if (se01b88.isChecked() && se01b88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01b) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se01b88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se01b: This data is Required!");
            return false;
        } else {
            se01b88x.setError(null);
        }

        // ============ Q 8.02(b) =======================
        // RadioGroup
        if (se01c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01c), Toast.LENGTH_LONG).show();
            se01c88.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se01c: This data is Required!");
            return false;
        } else {
            se01c88.setError(null);
        }

        // Others / EditText Q 8.02 (b)
        if (se01c88.isChecked() && se01c88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01c) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se01c88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se01c: This data is Required!");
            return false;
        } else {
            se01c88x.setError(null);
        }

        // ============ Q 8.02(c) =======================
        // RadioGroup
        if (se02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02), Toast.LENGTH_LONG).show();
            se0288.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se02: This data is Required!");
            return false;
        } else {
            se0288.setError(null);
        }

        // Others / EditText Q 8.02 (c)
        if (se0288.isChecked() && se0288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0288x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se02c: This data is Required!");
            return false;
        } else {
            se0288x.setError(null);
        }

        if (se0202.isChecked()) {
            // ============ Q 8.03 =======================
            // RadioGroup
            if (se03.getText().toString().isEmpty() && !se0399.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.se03), Toast.LENGTH_LONG).show();
                se03.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "se03: This data is Required!");
                return false;
            } else {
                se03.setError(null);
            }

            if (!se0399.isChecked()) {
                if (Integer.valueOf(se03.getText().toString().isEmpty() ? "0" : se03.getText().toString()) == 0) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.se03), Toast.LENGTH_LONG).show();
                    se03.setError("Zero is not allowed!");    // Set Error on last radio button

                    Log.i(TAG, "se03: Zero is not allowed!");
                    return false;
                } else {
                    se03.setError(null);
                }
            }
        }
        // ============== Q 8.04 =================
        if (se04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se04.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se04: This data is Required!");
            return false;
        } else {
            se04.setError(null);
        }

        if ((Integer.parseInt(se04.getText().toString()) < 1) || (Integer.parseInt(se04.getText().toString()) > 20)) {
            Toast.makeText(this, "Range is 0 - 20 Rooms", Toast.LENGTH_LONG).show();
            se04.setError("Range is 0 - 20 Rooms.. Check Again");// Set Error on last radio button
            return false;

        } else {
            se04.setError(null);
        }
        // ============ Q 8.05 =======================
        // RadioGroup
        if (se05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se05), Toast.LENGTH_LONG).show();
            se0588.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se05: This data is Required!");
            return false;
        } else {
            se0588.setError(null);
        }

        if (se0588.isChecked() && se0588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se05) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0588x.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se0588x: This data is Required!");
            return false;
        } else {
            se0588x.setError(null);
        }


        if (!(se0501.isChecked() || se0502.isChecked())) {
            // ============ Q 8.06 =======================
            // RadioGroup
            if (se06.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.se06), Toast.LENGTH_LONG).show();
                se0688.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "se06: This data is Required!");
                return false;
            } else {
                se0688.setError(null);
            }

            // Others / EditText Q 8.06
            if (se0688.isChecked() && se0688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.se06) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                se0688x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "se06: This data is Required!");
                return false;
            } else {
                se0688x.setError(null);
            }
        }
        if (se07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se07), Toast.LENGTH_LONG).show();
            se0788.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se08: This data is Required!");
            return false;
        } else {
            se0788.setError(null);
        }

        // Others / EditText Q 8.06
        if (se0788.isChecked() && se0788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se07) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0788x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se07: This data is Required!");
            return false;
        } else {
            se0788x.setError(null);
        }

        // ============ Q 8.08 =======================
        // RadioGroup
        if (se08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se08), Toast.LENGTH_LONG).show();
            se0888.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se08: This data is Required!");
            return false;
        } else {
            se0888.setError(null);
        }

        // Others / EditText Q 8.08
        if (se0888.isChecked() && se0888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se08) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0888x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se08: This data is Required!");
            return false;
        } else {
            se0888x.setError(null);
        }

        // ======================== Q 8.14 ==================
        if (se09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se09), Toast.LENGTH_LONG).show();
            se0988.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se14: This data is Required!");
            return false;
        } else {
            se0988.setError(null);
        }
        // =================== Edit Text / Q 8.14 Others =================
        if (se0988.isChecked() && se0988x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se09) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0988x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se09: This data is Required!");
            return false;
        } else {
            se0988x.setError(null);
        }

        // ============ Q 8.15 =======================
        // RadioGroup
        if (se10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se10), Toast.LENGTH_LONG).show();
            se1088.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se15: This data is Required!");
            return false;
        } else {
            se1088.setError(null);
        }

        // =================== Edit Text / Q 8.14 Others =================
        if (se1088.isChecked() && se1088x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se10) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se1088x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se10: This data is Required!");
            return false;
        } else {
            se1088x.setError(null);
        }

        // ============ Q 8.15 =======================
        // RadioGroup
        if (se1101.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se11), Toast.LENGTH_LONG).show();
            se1101.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se11: This data is Required!");
            return false;
        } else {
            se1101.setError(null);
        }



        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}