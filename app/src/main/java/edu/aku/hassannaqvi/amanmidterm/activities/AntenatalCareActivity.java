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
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;
import edu.aku.hassannaqvi.amanmidterm.R;


public class AntenatalCareActivity extends Activity {
    private static final String TAG = AntenatalCareActivity.class.getSimpleName();
    @BindView(R.id.anc01)
    RadioGroup anc01;
    @BindView(R.id.anc01a)
    RadioButton anc01a;
    @BindView(R.id.anc01b)
    RadioButton anc01b;
    @BindView(R.id.anc01aa)
    EditText anc01aa;
    @BindView(R.id.anc02)
    EditText anc02;
    @BindView(R.id.anc03a)
    CheckBox anc03a;
    @BindView(R.id.anc03b)
    CheckBox anc03b;
    @BindView(R.id.anc03c)
    CheckBox anc03c;
    @BindView(R.id.anc03d)
    CheckBox anc03d;
    @BindView(R.id.anc03e)
    CheckBox anc03e;
    @BindView(R.id.anc03f)
    CheckBox anc03f;
    @BindView(R.id.anc0388)
    CheckBox anc0388;
    @BindView(R.id.anc03x)
    EditText anc03x;
    @BindView(R.id.anc04)
    RadioGroup anc04;
    @BindView(R.id.anc04a)
    RadioButton anc04a;
    @BindView(R.id.anc04b)
    RadioButton anc04b;
    @BindView(R.id.anc05d)
    EditText anc05d;
    @BindView(R.id.anc0599)
    CheckBox anc0599;
    @BindView(R.id.anc06)
    RadioGroup anc06;
    @BindView(R.id.anc06a)
    RadioButton anc06a;
    @BindView(R.id.anc06b)
    RadioButton anc06b;
    @BindView(R.id.anc0699)
    RadioButton anc0699;
    @BindView(R.id.anc07)
    RadioGroup anc07;
    @BindView(R.id.anc07a)
    RadioButton anc07a;
    @BindView(R.id.anc07b)
    RadioButton anc07b;
    @BindView(R.id.anc07c)
    RadioButton anc07c;
    @BindView(R.id.anc07d)
    RadioButton anc07d;
    @BindView(R.id.anc0788)
    RadioButton anc0788;
    @BindView(R.id.anc0799)
    RadioButton anc0799;
    @BindView(R.id.anc07x)
    EditText anc07x;
    @BindView(R.id.anc08)
    RadioGroup anc08;
    @BindView(R.id.anc08a)
    RadioButton anc08a;
    @BindView(R.id.anc08b)
    RadioButton anc08b;
    @BindView(R.id.anc09)
    EditText anc09;
    @BindView(R.id.anc011a)
    CheckBox anc011a;
    @BindView(R.id.anc011b)
    CheckBox anc011b;
    @BindView(R.id.anc011c)
    CheckBox anc011c;
    @BindView(R.id.anc011d)
    CheckBox anc011d;
    @BindView(R.id.anc011e)
    CheckBox anc011e;
    @BindView(R.id.anc011f)
    CheckBox anc011f;
    @BindView(R.id.anc01188)
    CheckBox anc01188;
    @BindView(R.id.anc011x)
    EditText anc011x;
    @BindView(R.id.anc012)
    RadioGroup anc012;
    @BindView(R.id.anc012a)
    RadioButton anc012a;
    @BindView(R.id.anc012b)
    RadioButton anc012b;
    @BindView(R.id.anc01299)
    RadioButton anc01299;
    @BindView(R.id.anc013)
    EditText anc013;
    @BindView(R.id.anc01399)
    CheckBox anc01399;
    @BindView(R.id.anc014)
    RadioGroup anc014;
    @BindView(R.id.anc014a)
    RadioButton anc014a;
    @BindView(R.id.anc014b)
    RadioButton anc014b;
    @BindView(R.id.anc015)
    RadioGroup anc015;
    @BindView(R.id.anc015a)
    RadioButton anc015a;
    @BindView(R.id.anc015b)
    RadioButton anc015b;
    @BindView(R.id.anc015c)
    RadioButton anc015c;
    @BindView(R.id.anc015d)
    RadioButton anc015d;
    @BindView(R.id.anc015e)
    RadioButton anc015e;
    @BindView(R.id.anc015f)
    RadioButton anc015f;
    @BindView(R.id.anc01588)
    RadioButton anc01588;
    @BindView(R.id.anc015x)
    EditText anc015x;
    @BindView(R.id.fldGrpanc01)
    LinearLayout fldGrpanc01;
    @BindView(R.id.fldGrpanc03x)
    LinearLayout fldGrpanc03x;
    @BindView(R.id.fldGrpanc04)
    LinearLayout fldGrpanc04;
    @BindView(R.id.fldGrp06)
    LinearLayout fldGrp06;
    @BindView(R.id.fldGrpanc07)
    LinearLayout fldGrpanc07;
    @BindView(R.id.fldGrpanc09)
    LinearLayout fldGrpanc09;
    @BindView(R.id.fldGrpanc011x)
    LinearLayout fldGrpanc011x;
    @BindView(R.id.fldGrp012)
    LinearLayout fldGrp012;
    @BindView(R.id.fldGrp014)
    LinearLayout fldGrp014;
    @BindView(R.id.fldGrpanc015x)
    LinearLayout fldGrpanc015x;
    @BindView(R.id.fldGrpanc09a)
    LinearLayout fldGrpanc09a;
    @BindView(R.id.fldGrpanc03)
    LinearLayout fldGrpanc03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antenatal_care);
        ButterKnife.bind(this);

        anc01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc01b.isChecked()) {
                    fldGrpanc01.setVisibility(View.VISIBLE);
                    fldGrpanc03.setVisibility(View.GONE);
                    anc02.setText(null);
                    anc03a.setChecked(false);
                    anc03b.setChecked(false);
                    anc03c.setChecked(false);
                    anc03d.setChecked(false);
                    anc03e.setChecked(false);
                    anc03f.setChecked(false);
                    anc0388.setChecked(false);

                } else {
                    anc01aa.setText(null);
                    fldGrpanc01.setVisibility(View.GONE);
                    fldGrpanc03.setVisibility(View.VISIBLE);

                }
            }
        });


        anc0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (anc0388.isChecked()) {
                    fldGrpanc03x.setVisibility(View.VISIBLE);
                    anc03x.requestFocus();
                } else {
                    anc03x.setText(null);
                    fldGrpanc03x.setVisibility(View.GONE);
                }
            }
        });


        anc04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc04a.isChecked()) {
                    fldGrpanc04.setVisibility(View.VISIBLE);
                    anc05d.requestFocus();
                } else {
                    anc05d.setText(null);
                    fldGrpanc04.setVisibility(View.GONE);
                }
            }
        });


        anc0599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (anc0599.isChecked()) {
                    anc05d.setText(null);
                    anc05d.setEnabled(false);
                } else {
                    anc05d.setEnabled(true);
                    anc05d.requestFocus();
                }
            }
        });


        anc06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc06a.isChecked()) {
                    fldGrp06.setVisibility(View.VISIBLE);
                } else {
                    anc07.clearCheck();
                    fldGrp06.setVisibility(View.GONE);
                    //fldGrpanc07.setVisibility(View.GONE);
                }
            }
        });


        anc07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc0788.isChecked()) {
                    fldGrpanc07.setVisibility(View.VISIBLE);
                    anc07x.requestFocus();
                } else {
                    anc07x.setText(null);
                    fldGrpanc07.setVisibility(View.GONE);
                }
            }
        });


        anc08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc08b.isChecked()) {
                    fldGrpanc09a.setVisibility(View.GONE);
                    fldGrpanc09.setVisibility(View.VISIBLE);
                    anc09.requestFocus();
                } else {
                    anc09.setText(null);
                    fldGrpanc09a.setVisibility(View.VISIBLE);
                    fldGrpanc09.setVisibility(View.GONE);
                }
            }
        });


        anc01188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (anc01188.isChecked()) {
                    fldGrpanc011x.setVisibility(View.VISIBLE);
                    anc011x.requestFocus();
                } else {
                    anc011x.setText(null);
                    fldGrpanc011x.setVisibility(View.GONE);
                }
            }
        });


        anc012.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc012a.isChecked()) {
                    fldGrp012.setVisibility(View.VISIBLE);
                    anc013.requestFocus();
                } else {
                    anc013.setText(null);
                    fldGrp012.setVisibility(View.GONE);
                }
            }
        });


        anc01399.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (anc01399.isChecked()) {
                    anc013.setEnabled(true);
                    anc013.requestFocus();
                } else {
                    anc013.setText(null);
                    anc013.setEnabled(false);
                }
            }
        });


        anc014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc014a.isChecked()) {
                    fldGrp014.setVisibility(View.VISIBLE);
                    anc015a.requestFocus();
                } else {
                    anc015.clearCheck();
                    fldGrp014.setVisibility(View.GONE);
                }
            }
        });


        anc015.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (anc01588.isChecked()) {
                    fldGrpanc015x.setVisibility(View.VISIBLE);
                    anc015x.requestFocus();
                } else {
                    anc015x.setText(null);
                    fldGrpanc015x.setVisibility(View.GONE);
                }
            }
        });

        anc0599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    anc05d.setVisibility(View.GONE);
                    anc05d.setText(null);
                } else {
                    anc05d.setVisibility(View.VISIBLE);
                }
            }
        });

        anc01399.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    anc013.setVisibility(View.GONE);
                    anc013.setText(null);
                } else {
                    anc013.setVisibility(View.VISIBLE);
                }
            }
        });


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
        endSec.putExtra("check", false);
        startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

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

                        startActivity(new Intent(this, DeliveryActivity.class));
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

        int updcount = db.updateAntenatalCare();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean SaveDraft() throws JSONException {

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        JSONObject js = new JSONObject();

        js.put("anc01", anc01a.isChecked() ? "1" : anc01b.isChecked() ? "2" : "0");
        js.put("anc01aa", anc01aa.getText().toString());
        js.put("anc02", anc02.getText().toString());

        js.put("anc03a", anc03a.isChecked() ? "1" : "2");
        js.put("anc03b", anc03b.isChecked() ? "1" : "2");
        js.put("anc03c", anc03c.isChecked() ? "1" : "2");
        js.put("anc03d", anc03d.isChecked() ? "1" : "2");
        js.put("anc03e", anc03e.isChecked() ? "1" : "2");
        js.put("anc03f", anc03f.isChecked() ? "1" : "2");
        js.put("anc0388", anc0388.isChecked() ? "1" : "2");

        js.put("anc03x", anc03x.getText().toString());


        js.put("anc04", anc04a.isChecked() ? "1" : anc04b.isChecked() ? "2" : "0");

        js.put("anc05d", anc05d.getText().toString());
        js.put("anc0599", anc0599.isChecked() ? "1" : "2");

        js.put("anc06", anc06a.isChecked() ? "1" : anc06b.isChecked() ? "2" : anc0699.isChecked() ? "99" : "0");

        js.put("anc07", anc07a.isChecked() ? "1" : anc07b.isChecked() ? "2" : anc07c.isChecked() ? "3" : anc07d.isChecked() ? "4" : anc0788.isChecked() ? "88" : anc0699.isChecked() ? "99" : "0");
        js.put("anc07x", anc07x.getText().toString());
        js.put("anc08", anc08a.isChecked() ? "1" : anc08b.isChecked() ? "2" : "0");


        js.put("anc09", anc09.getText().toString());
        js.put("anc011a", anc011a.isChecked() ? "1" : "2");
        js.put("anc011b", anc011b.isChecked() ? "1" : "2");
        js.put("anc011c", anc011c.isChecked() ? "1" : "2");
        js.put("anc011d", anc011d.isChecked() ? "1" : "2");
        js.put("anc011e", anc011e.isChecked() ? "1" : "2");
        js.put("anc011f", anc011f.isChecked() ? "1" : "2");
        js.put("anc01188", anc01188.isChecked() ? "1" : "2");
        js.put("anc011x", anc011x.getText().toString());


        js.put("anc012", anc012a.isChecked() ? "1" : anc012b.isChecked() ? "2" : anc01299.isChecked() ? "99" : "0");

        js.put("anc013", anc013.getText().toString());
        js.put("anc01399", anc01399.isChecked() ? "1" : "2");


        js.put("anc014", anc014a.isChecked() ? "1" : anc014b.isChecked() ? "2" : "0");
        js.put("anc015", anc015a.isChecked() ? "1" : anc015b.isChecked() ? "2" : anc015c.isChecked() ? "3" : anc015d.isChecked() ? "4" : anc015e.isChecked() ? "5" : anc015f.isChecked() ? "6" : anc01588.isChecked() ? "88" : "0");
        js.put("anc015x", anc015x.getText().toString());

        AppMain.fc.setAntenatalCare(String.valueOf(js));


        return true;
    }

    private boolean ValidateForm() {

        //  getRadioButtonValues();

        if (anc01.getCheckedRadioButtonId() == -1) {
            anc01a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc01), Toast.LENGTH_LONG).show();
            Log.d(TAG, "anc01: this data is required ");
            anc01a.requestFocus();
            return false;
        } else {
            anc01a.setError(null);
        }


        if (anc01b.isChecked()) {
            if (anc01aa.getText().toString().isEmpty() || anc01aa.getText().toString() == null) {
                anc01aa.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc01a), Toast.LENGTH_LONG).show();
                Log.d(TAG, "anc01aa: empty");
                anc01aa.requestFocus();
                return false;
            } else {
                anc01aa.setError(null);
            }


        } else if (anc01a.isChecked()) {

            if (anc02.getText().toString().isEmpty() || anc02.getText().toString() == null) {
                anc02.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc02), Toast.LENGTH_LONG).show();
                Log.d(TAG, "anc01: empty ");
                anc02.requestFocus();
                return false;
            } else {
                anc02.setError(null);
            }

            if ((Integer.valueOf(anc02.getText().toString()) < 1)
                    || (Integer.valueOf(anc02.getText().toString()) > 10)) {
                Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.anc02), Toast.LENGTH_LONG).show();
                anc02.setError("Range is 1-10");
                Log.i(TAG, "anc02: Range is 1-10");
                return false;
            } else {
                anc02.setError(null);
            }

            if (!anc03a.isChecked()
                    && !anc03b.isChecked()
                    && !anc03c.isChecked()
                    && !anc03d.isChecked()
                    && !anc03e.isChecked()
                    && !anc03f.isChecked()
                    && !anc0388.isChecked()) {
                anc03a.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc03), Toast.LENGTH_LONG).show();
                Log.d(TAG, "anc03: this data is required ");
                anc03a.requestFocus();
                return false;
            } else {
                anc03a.setError(null);
            }

            if (anc0388.isChecked()) {

                if (anc03x.getText().toString().isEmpty() || anc03x.getText().toString() == null) {
                    anc03x.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "anc03x: empty ");
                    anc03x.requestFocus();
                    return false;
                } else {
                    anc03x.setError(null);
                }

            }

        }


        if (anc04.getCheckedRadioButtonId() == -1) {
            anc04a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc04), Toast.LENGTH_LONG).show();
            Log.d(TAG, "anc04: this data is required ");
            anc04a.requestFocus();
            return false;
        } else {
            anc04a.setError(null);
        }


        if (anc04a.isChecked()) {

            if ((anc05d.getText().toString().isEmpty() || anc05d.getText().toString() == null) && !anc0599.isChecked()) {
                    anc05d.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc05), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "anc05d: empty");
                    anc05d.requestFocus();
                    return false;
                } else {
                    anc05d.setError(null);
                }

            if (!anc0599.isChecked()) {
                if (Integer.valueOf(anc05d.getText().toString().isEmpty() ? "" : anc05d.getText().toString()) < 1
                        || Integer.valueOf(anc05d.getText().toString().isEmpty() ? "" : anc05d.getText().toString()) > 29) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.anc05), Toast.LENGTH_LONG).show();
                    anc05d.setError("Range is 1 to 29 days");
                    Log.d(TAG, "anc05d: Range is 1 to 29 days");
                    anc05d.requestFocus();
                } else {
                    anc05d.setError(null);
                }

            }
        }


        if (anc06.getCheckedRadioButtonId() == -1) {
            anc06a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc06), Toast.LENGTH_LONG).show();
            Log.d(TAG, "anc06a: this data is required ");
            anc06a.requestFocus();
            return false;
        } else {
            anc06a.setError(null);
        }


        if (anc06a.isChecked()) {

            if (anc07.getCheckedRadioButtonId() == -1) {
                anc07a.setError(getString(R.string.rdoerr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc07), Toast.LENGTH_LONG).show();
                Log.d(TAG, "anc07a: this data is required ");
                anc07a.requestFocus();
                return false;
            } else {
                anc07a.setError(null);
            }


            if (anc0788.isChecked()) {
                if (anc07x.getText().toString().isEmpty() || anc07x.getText().toString() == null) {
                    anc07x.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "anc07x: empty ");
                    anc07x.requestFocus();
                    return false;
                } else {
                    anc07x.setError(null);
                }
            }


            if (anc08.getCheckedRadioButtonId() == -1) {
                anc08a.setError(getString(R.string.rdoerr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc08), Toast.LENGTH_LONG).show();
                Log.d(TAG, "anc08a: this data is required ");
                anc08a.requestFocus();
                return false;
            } else {
                anc08a.setError(null);
            }


            if (anc08b.isChecked()) {

                if (anc09.getText().toString().isEmpty() || anc09.getText().toString() == null) {
                    anc09.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc09), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "anc09: empty");
                    anc09.requestFocus();
                    return false;
                } else {
                    anc09.setError(null);
                }

            } else if (anc08a.isChecked()) {
                if (!anc011a.isChecked()
                        && !anc011b.isChecked()
                        && !anc011c.isChecked()
                        && !anc011d.isChecked()
                        && !anc011e.isChecked()
                        && !anc011f.isChecked()
                        && !anc01188.isChecked()) {
                    anc011a.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc011), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "anc011: this data is required ");
                    anc011a.requestFocus();
                    return false;
                } else {
                    anc011a.setError(null);
                }

                if (anc01188.isChecked()) {

                    if (anc011x.getText().toString().isEmpty() || anc011x.getText().toString() == null) {
                        anc011x.setError(getString(R.string.txterr));
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                        Log.d(TAG, "anc011x: empty ");
                        anc011x.requestFocus();
                        return false;
                    } else {
                        anc011x.setError(null);
                    }
                }
            }
        }


        if (anc012.getCheckedRadioButtonId() == -1) {
            anc012a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc012), Toast.LENGTH_LONG).show();
            Log.d(TAG, "anc012a: this data is required ");
            anc012a.requestFocus();
            return false;
        } else {
            anc012a.setError(null);
        }


        if (anc012a.isChecked()) {

            if ((anc013.getText().toString().isEmpty() || anc013.getText().toString() == null) && !anc01399.isChecked()) {
                    anc013.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc013), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "anc013: empty");
                    anc013.requestFocus();
                    return false;
                } else {
                    anc013.setError(null);
                }

            if (!anc01399.isChecked()) {
                if (Integer.valueOf(anc013.getText().toString().isEmpty() ? "" : anc013.getText().toString()) < 1
                        || Integer.valueOf(anc013.getText().toString().isEmpty() ? "" : anc013.getText().toString()) > 9) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.anc013), Toast.LENGTH_LONG).show();
                    anc013.setError("Range is 1 to 9 times");
                    Log.d(TAG, "anc013: Range is 1 to 9 times");
                    anc013.requestFocus();
                } else {
                    anc013.setError(null);
                }
            }

        }


        if (anc014.getCheckedRadioButtonId() == -1) {
            anc014a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc014), Toast.LENGTH_LONG).show();
            Log.d(TAG, "anc014a: this data is required ");
            anc014a.requestFocus();
            return false;
        } else {
            anc014a.setError(null);
        }


        if (anc014a.isChecked()) {

            if (anc015.getCheckedRadioButtonId() == -1) {
                anc015a.setError(getString(R.string.rdoerr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.anc015), Toast.LENGTH_LONG).show();
                Log.d(TAG, "anc015a: this data is required ");
                anc015a.requestFocus();
                return false;
            } else {
                anc015a.setError(null);
            }

            if (anc01588.isChecked()) {

                if (anc015x.getText().toString().isEmpty() || anc015x.getText().toString() == null) {
                    anc015x.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "anc015x : empty ");
                    anc015x.requestFocus();
                    return false;
                } else {
                    anc015x.setError(null);
                }

            }


        }


        return true;
    }
}