package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

public class ChildHealthActivity extends Activity {

    @BindView(R.id.activity_section_d)
    ScrollView activitySectionD;
    @BindView(R.id.iy01)
    EditText iy01;
    @BindView(R.id.iy02)
    RadioGroup iy02;
    @BindView(R.id.iy02a)
    RadioButton iy02a;
    @BindView(R.id.iy02b)
    RadioButton iy02b;
    @BindView(R.id.iy03m)
    EditText iy03m;
    @BindView(R.id.iy03d)
    EditText iy03d;
    @BindView(R.id.iy04)
    RadioGroup iy04;
    @BindView(R.id.iy04a)
    RadioButton iy04a;
    @BindView(R.id.iy04b)
    RadioButton iy04b;
    @BindView(R.id.iy04c)
    RadioButton iy04c;
    @BindView(R.id.iy05a)
    CheckBox iy05a;
    @BindView(R.id.iy05b)
    CheckBox iy05b;
    @BindView(R.id.iy05c)
    CheckBox iy05c;
    @BindView(R.id.iy05d)
    CheckBox iy05d;
    @BindView(R.id.iy05e)
    CheckBox iy05e;
    @BindView(R.id.iy05f)
    CheckBox iy05f;
    @BindView(R.id.iy05g)
    CheckBox iy05g;
    @BindView(R.id.iy05h)
    CheckBox iy05h;
    @BindView(R.id.iy05i)
    CheckBox iy05i;
    @BindView(R.id.iy05j)
    CheckBox iy05j;
    @BindView(R.id.iy0588)
    CheckBox iy0588;
    @BindView(R.id.iy05x)
    EditText iy05x;
    @BindView(R.id.iy06d)
    EditText iy06d;
    @BindView(R.id.iy07)
    RadioGroup iy07;
    @BindView(R.id.iy07a)
    RadioButton iy07a;
    @BindView(R.id.iy07b)
    RadioButton iy07b;
    @BindView(R.id.iy07c)
    RadioButton iy07c;
    @BindView(R.id.iy07aa)
    EditText iy07aa;
    @BindView(R.id.iy07bb)
    EditText iy07bb;
    @BindView(R.id.iy07cc)
    EditText iy07cc;
    @BindView(R.id.iy08)
    RadioGroup iy08;
    @BindView(R.id.iy08a)
    RadioButton iy08a;
    @BindView(R.id.iy08b)
    RadioButton iy08b;
    @BindView(R.id.iy08c)
    RadioButton iy08c;
    @BindView(R.id.iy08d)
    RadioButton iy08d;
    @BindView(R.id.iy08e)
    RadioButton iy08e;
    @BindView(R.id.iy0888)
    RadioButton iy0888;
    @BindView(R.id.iy08x)
    EditText iy08x;
    @BindView(R.id.iy09)
    RadioGroup iy09;
    @BindView(R.id.iy09a)
    RadioButton iy09a;
    @BindView(R.id.iy09b)
    RadioButton iy09b;
    @BindView(R.id.iy010a)
    CheckBox iy010a;
    @BindView(R.id.iy010b)
    CheckBox iy010b;
    @BindView(R.id.iy010c)
    CheckBox iy010c;
    @BindView(R.id.iy010d)
    CheckBox iy010d;
    @BindView(R.id.iy010e)
    CheckBox iy010e;
    @BindView(R.id.iy010f)
    CheckBox iy010f;
    @BindView(R.id.iy01088)
    CheckBox iy01088;
    @BindView(R.id.iy010x)
    EditText iy010x;
    @BindView(R.id.iy011d)
    EditText iy011d;
    @BindView(R.id.iy011w)
    EditText iy011w;
    @BindView(R.id.iy012h)
    EditText iy012h;
    @BindView(R.id.iy012d)
    EditText iy012d;
    @BindView(R.id.iy01299)
    CheckBox iy01299;
    @BindView(R.id.iy013)
    RadioGroup iy013;
    @BindView(R.id.iy013a)
    RadioButton iy013a;
    @BindView(R.id.iy013b)
    RadioButton iy013b;
    @BindView(R.id.iy013c)
    RadioButton iy013c;
    @BindView(R.id.iy014)
    RadioGroup iy014;
    @BindView(R.id.iy014a)
    RadioButton iy014a;
    @BindView(R.id.iy014b)
    RadioButton iy014b;
    @BindView(R.id.iy014c)
    RadioButton iy014c;
    @BindView(R.id.iy015a)
    CheckBox iy015a;
    @BindView(R.id.iy015b)
    CheckBox iy015b;
    @BindView(R.id.iy015c)
    CheckBox iy015c;
    @BindView(R.id.iy015d)
    CheckBox iy015d;
    @BindView(R.id.iy015e)
    CheckBox iy015e;
    @BindView(R.id.iy015f)
    CheckBox iy015f;
    @BindView(R.id.iy015g)
    CheckBox iy015g;
    @BindView(R.id.iy015h)
    CheckBox iy015h;
    @BindView(R.id.iy015i)
    CheckBox iy015i;
    @BindView(R.id.iy01588)
    CheckBox iy01588;
    @BindView(R.id.iy015x)
    EditText iy015x;
    @BindView(R.id.iy016m)
    EditText iy016m;
    @BindView(R.id.iy01677)
    CheckBox iy01677;
    @BindView(R.id.iy017d)
    EditText iy017d;
    @BindView(R.id.iy017m)
    EditText iy017m;
    @BindView(R.id.iy01788)
    CheckBox iy01788;
    @BindView(R.id.iy018d)
    EditText iy018d;
    @BindView(R.id.iy018m)
    EditText iy018m;
    @BindView(R.id.iy01888)
    CheckBox iy01888;

    @BindView(R.id.fldGrpiy04)
    LinearLayout fldGrpiy04;

    @BindView(R.id.fldGrpiy05koth)
    LinearLayout fldGrpiy05koth;

    @BindView(R.id.fldGrpiy07)
    LinearLayout fldGrpiy07;

    @BindView(R.id.fldGrpiy08foth)
    LinearLayout fldGrpiy08foth;

    @BindView(R.id.fldGrpiy09)
    LinearLayout fldGrpiy09;

    @BindView(R.id.fldGrpiy010goth)
    LinearLayout fldGrpiy010goth;

    @BindView(R.id.fldGrpiy015joth)
    LinearLayout fldGrpiy015joth;

    @BindView(R.id.fldGrpiy014)
    LinearLayout fldGrpiy014;


    int rdo_iy02;
    String var_iy02 = "";

    int rdo_iy04;
    String var_iy04 = "";

    int rdo_iy07;
    String var_iy07;

    int rdo_iy08;
    String var_iy08;

    int rdo_iy09;
    String var_iy09;


    int rdo_iy013;
    String var_iy013;

    int rdo_iy014;
    String var_iy014;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_health);
        ButterKnife.bind(this);

        iy04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (iy04a.isChecked()) {
                    fldGrpiy04.setVisibility(View.VISIBLE);
                } else {

                    iy05a.setChecked(false);
                    iy05b.setChecked(false);
                    iy05c.setChecked(false);
                    iy05d.setChecked(false);
                    iy05e.setChecked(false);
                    iy05f.setChecked(false);
                    iy05g.setChecked(false);
                    iy05h.setChecked(false);
                    iy05i.setChecked(false);
                    iy05j.setChecked(false);
                    iy0588.setChecked(false);

                    iy015x.setText(null);

                    iy016m.setText(null);
                    iy01677.setChecked(false);

                    iy017d.setText(null);
                    iy017m.setText(null);
                    iy01788.setChecked(false);

                    iy018d.setText(null);
                    iy018m.setText(null);
                    iy01888.setChecked(false);

                    fldGrpiy04.setVisibility(View.GONE);
                }
            }
        });


        iy0588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy0588.isChecked()) {
                    fldGrpiy05koth.setVisibility(View.VISIBLE);
                    iy0588.requestFocus();
                } else {
                    iy05x.setText(null);
                    fldGrpiy05koth.setVisibility(View.GONE);
                }
            }
        });


        iy07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (iy07b.isChecked()) {
                    fldGrpiy07.setVisibility(View.VISIBLE);
                    fldGrpiy08foth.setVisibility(View.GONE);
                    iy07aa.requestFocus();
                } else {

                    iy08.clearCheck();

                    iy07aa.setText(null);
                    iy07bb.setText(null);
                    iy07cc.setText(null);

                    fldGrpiy07.setVisibility(View.GONE);
                    fldGrpiy08foth.setVisibility(View.GONE);
                }
            }
        });


        iy08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (iy0888.isChecked()) {
                    fldGrpiy08foth.setVisibility(View.VISIBLE);
                    iy08x.requestFocus();
                } else {
                    iy08x.setText(null);
                    fldGrpiy08foth.setVisibility(View.GONE);
                }
            }
        });


        iy09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (iy09a.isChecked()) {
                    fldGrpiy09.setVisibility(View.VISIBLE);
                } else {

                    iy010a.setChecked(false);
                    iy010b.setChecked(false);
                    iy010c.setChecked(false);
                    iy010d.setChecked(false);
                    iy010e.setChecked(false);
                    iy010f.setChecked(false);
                    iy01088.setChecked(false);

                    iy010x.setText(null);

                    fldGrpiy09.setVisibility(View.GONE);
                }
            }
        });


        iy01088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy01088.isChecked()) {
                    fldGrpiy010goth.setVisibility(View.VISIBLE);
                    iy010x.requestFocus();
                } else {
                    iy010x.setText(null);
                    fldGrpiy010goth.setVisibility(View.GONE);
                }
            }
        });


        iy01299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy01299.isChecked()) {
                    iy012h.setText(null);
                    iy012d.setText(null);

                    iy012h.setEnabled(false);
                    iy012d.setEnabled(false);
                } else {
                    iy012h.setEnabled(true);
                    iy012d.setEnabled(true);

                    iy012h.requestFocus();
                }
            }
        });


        iy014.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (iy014a.isChecked()) {
                    fldGrpiy014.setVisibility(View.VISIBLE);
                    iy015a.requestFocus();
                } else {

                    iy015a.setChecked(false);
                    iy015b.setChecked(false);
                    iy015c.setChecked(false);
                    iy015d.setChecked(false);
                    iy015e.setChecked(false);
                    iy015f.setChecked(false);
                    iy015g.setChecked(false);
                    iy015h.setChecked(false);
                    iy015i.setChecked(false);
                    iy01588.setChecked(false);

                    iy015x.setText(null);

                    fldGrpiy014.setVisibility(View.GONE);
                }
            }
        });


        iy01588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy01588.isChecked()) {
                    fldGrpiy015joth.setVisibility(View.VISIBLE);
                    iy015x.requestFocus();
                } else {
                    iy015x.setText(null);
                    fldGrpiy015joth.setVisibility(View.GONE);
                }
            }
        });


        iy01588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy01588.isChecked()) {
                    fldGrpiy015joth.setVisibility(View.VISIBLE);
                    iy015x.requestFocus();
                } else {
                    iy015x.setText(null);
                    fldGrpiy015joth.setVisibility(View.GONE);
                }
            }
        });


        iy01677.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy01677.isChecked()) {
                    iy016m.setText(null);
                    iy016m.setEnabled(false);
                } else {
                    iy016m.setEnabled(true);
                    iy016m.requestFocus();
                }
            }
        });


        iy01788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy01788.isChecked()) {
                    iy017d.setText(null);
                    iy017m.setText(null);

                    iy017d.setEnabled(false);
                    iy017m.setEnabled(false);
                } else {
                    iy017d.setEnabled(true);
                    iy017m.setEnabled(true);
                }
            }
        });


        iy01888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (iy01888.isChecked()) {
                    iy018d.setText(null);
                    iy018m.setText(null);

                    iy018d.setEnabled(false);
                    iy018m.setEnabled(false);
                } else {
                    iy018d.setEnabled(true);
                    iy018m.setEnabled(true);
                }
            }
        });

        iy01299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    iy012d.setVisibility(View.GONE);
                    iy012d.setText(null);
                    iy012h.setVisibility(View.GONE);
                    iy012h.setText(null);
                } else {
                    iy012d.setVisibility(View.VISIBLE);
                    iy012h.setVisibility(View.VISIBLE);
                }
            }
        });

        iy01677.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    iy016m.setVisibility(View.GONE);
                    iy016m.setText(null);
                } else {
                    iy016m.setVisibility(View.VISIBLE);
                }
            }
        });

        iy01788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    iy017d.setVisibility(View.GONE);
                    iy017m.setVisibility(View.GONE);
                    iy017d.setText(null);
                    iy017m.setText(null);

                } else {
                    iy017d.setVisibility(View.VISIBLE);
                    iy017m.setVisibility(View.VISIBLE);
                }
            }
        });

        iy01888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    iy018d.setVisibility(View.GONE);
                    iy018m.setVisibility(View.GONE);
                    iy018d.setText(null);
                    iy018m.setText(null);

                } else {
                    iy018d.setVisibility(View.VISIBLE);
                    iy018m.setVisibility(View.VISIBLE);
                }
            }
        });





    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
       /* if (formValidation()) {
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
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, ChildVaccinationActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        //db.updateSD();

        return true;
    }


    private boolean ValidateForm() {

        if (iy01.getText().toString().isEmpty() || iy01.getText().toString() == null) {
            iy01.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy01), Toast.LENGTH_LONG).show();
            iy01.requestFocus();
            return false;
        } else {
            iy01.setError(null);
        }

        rdo_iy02 = iy02.getCheckedRadioButtonId();

        switch (rdo_iy02) {
            case R.id.iy02a:
                var_iy02 = "1";
                break;
            case R.id.iy02b:
                var_iy02 = "2";
                break;
        }

        if (rdo_iy02 == -1) {
            iy02a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy02), Toast.LENGTH_LONG).show();
            iy02a.requestFocus();
            return false;
        } else {
            iy02a.setError(null);
        }


        if (iy03m.getText().toString().isEmpty() || iy03m.getText().toString() == null) {
            iy03m.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy03), Toast.LENGTH_LONG).show();
            iy03m.requestFocus();
            return false;
        } else {
            iy03m.setError(null);
        }


        if (iy03d.getText().toString().isEmpty() || iy03d.getText().toString() == null) {
            iy03d.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy03), Toast.LENGTH_LONG).show();
            iy03d.requestFocus();
            return false;
        } else {
            iy03d.setError(null);
        }


        rdo_iy04 = iy04.getCheckedRadioButtonId();

        switch (rdo_iy04) {
            case R.id.iy04a:
                var_iy04 = "1";
                break;
            case R.id.iy04b:
                var_iy04 = "2";
                break;
            case R.id.iy04c:
                var_iy04 = "88";
                break;
        }


        if (rdo_iy04 == -1) {
            iy04a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy04), Toast.LENGTH_LONG).show();
            iy04a.requestFocus();
            return false;
        } else {
            iy04a.setError(null);
        }


        if (var_iy04 == "1") {

            if (!iy05a.isChecked()
                    && !iy05b.isChecked()
                    && !iy05c.isChecked()
                    && !iy05d.isChecked()
                    && !iy05e.isChecked()
                    && !iy05f.isChecked()
                    && !iy05g.isChecked()
                    && !iy05h.isChecked()
                    && !iy05i.isChecked()
                    && !iy05j.isChecked()
                    && !iy0588.isChecked()) {
                iy05a.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy05), Toast.LENGTH_LONG).show();
                iy05a.requestFocus();
                return false;
            } else {
                iy05a.setError(null);
            }


            if (iy0588.isChecked()) {
                if (iy05x.getText().toString().isEmpty() || iy05x.getText().toString() == null) {
                    iy05x.setError(getString(R.string.txterr));
                    Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    iy05x.requestFocus();
                    return false;
                } else {
                    iy05x.setError(null);
                }
            }


            if (iy06d.getText().toString().isEmpty() || iy06d.getText().toString() == null) {
                iy06d.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy06d), Toast.LENGTH_LONG).show();
                iy06d.requestFocus();
                return false;
            } else {
                iy06d.setError(null);
            }


            rdo_iy07 = iy07.getCheckedRadioButtonId();

            switch (rdo_iy07) {
                case R.id.iy07a:
                    var_iy07 = "1";
                    break;
                case R.id.iy07b:
                    var_iy07 = "2";
                    break;
            }

            if (rdo_iy07 == -1) {
                iy07a.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy07), Toast.LENGTH_LONG).show();
                iy07a.requestFocus();
                return false;
            } else {
                iy07a.setError(null);
            }


            if (var_iy07 == "2") {

                if (iy07aa.getText().toString().isEmpty() || iy07aa.getText().toString() == null) {
                    iy07aa.setError(getString(R.string.txterr));
                    Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy07a), Toast.LENGTH_LONG).show();
                    iy07aa.requestFocus();
                    return false;
                } else {
                    iy07aa.setError(null);
                }


                rdo_iy08 = iy08.getCheckedRadioButtonId();

                switch (rdo_iy08) {
                    case R.id.iy08a:
                        var_iy08 = "1";
                        break;
                    case R.id.iy08b:
                        var_iy08 = "2";
                        break;
                    case R.id.iy08c:
                        var_iy08 = "3";
                        break;
                    case R.id.iy08d:
                        var_iy08 = "4";
                        break;
                    case R.id.iy08e:
                        var_iy08 = "5";
                        break;
                    case R.id.iy0888:
                        var_iy08 = "6";
                        break;
                }

                if (rdo_iy08 == -1) {
                    iy08a.setError(getString(R.string.rdoerr));
                    Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy08), Toast.LENGTH_LONG).show();
                    iy08a.requestFocus();
                    return false;
                } else {
                    iy08a.setError(null);
                }


                if (var_iy08 == "6") {

                    if (iy08x.getText().toString().isEmpty() || iy08x.getText().toString() == null) {
                        iy08x.setError(getString(R.string.txterr));
                        Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                        iy08x.requestFocus();
                        return false;
                    } else {
                        iy08x.setError(null);
                    }

                }


            }


        }


        rdo_iy09 = iy09.getCheckedRadioButtonId();

        switch (rdo_iy09) {
            case R.id.iy09a:
                var_iy09 = "1";
                break;
            case R.id.iy09b:
                var_iy09 = "2";
                break;
        }

        if (rdo_iy09 == -1) {
            iy09a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy09), Toast.LENGTH_LONG).show();
            iy09a.requestFocus();
            return false;
        } else {
            iy09a.setError(null);
        }


        if (var_iy09 == "1") {

            if (!iy010a.isChecked()
                    && !iy010b.isChecked()
                    && !iy010c.isChecked()
                    && !iy010d.isChecked()
                    && !iy010e.isChecked()
                    && !iy010f.isChecked()
                    && !iy01088.isChecked()) {
                iy010a.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy010), Toast.LENGTH_LONG).show();
                iy010a.requestFocus();
                return false;
            } else {
                iy010a.setError(null);
            }


            if (iy01088.isChecked()) {

                if (iy010x.getText().toString().isEmpty() || iy010x.getText().toString() == null) {
                    iy010x.setError(getString(R.string.txterr));
                    Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    iy010x.requestFocus();
                    return false;
                } else {
                    iy010x.setError(null);
                }

            }

        }


        if (var_iy09 == "1") {

            if (iy011d.getText().toString().isEmpty() || iy011d.getText().toString() == null) {
                iy011d.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy011d), Toast.LENGTH_LONG).show();
                iy011d.requestFocus();
                return false;
            } else {
                iy011d.setError(null);
            }

            if (iy011w.getText().toString().isEmpty() || iy011w.getText().toString() == null) {
                iy011w.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy011w), Toast.LENGTH_LONG).show();
                iy011w.requestFocus();
                return false;
            } else {
                iy011w.setError(null);
            }

        }


        if (iy01299.isChecked() == false) {

            if (iy012h.getText().toString().isEmpty() || iy012h.getText().toString() == null) {
                iy012h.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy012h), Toast.LENGTH_LONG).show();
                iy012h.requestFocus();
                return false;
            } else {
                iy012h.setError(null);
            }

            if (iy012d.getText().toString().isEmpty() || iy012d.getText().toString() == null) {
                iy012d.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy012d), Toast.LENGTH_LONG).show();
                iy012d.requestFocus();
                return false;
            } else {
                iy012d.setError(null);
            }
        } else {
            iy012h.setText(null);
            iy012d.setText(null);
        }


        rdo_iy013 = iy013.getCheckedRadioButtonId();

        switch (rdo_iy013) {
            case R.id.iy013a:
                var_iy013 = "1";
                break;
            case R.id.iy013b:
                var_iy013 = "2";
                break;
            case R.id.iy013c:
                var_iy013 = "88";
                break;
        }

        if (rdo_iy013 == -1) {
            iy013a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy013), Toast.LENGTH_LONG).show();
            iy013a.requestFocus();
            return false;
        } else {
            iy013a.setError(null);
        }


        rdo_iy014 = iy014.getCheckedRadioButtonId();

        if (rdo_iy014 == -1) {
            iy014a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy014), Toast.LENGTH_LONG).show();
            iy014a.requestFocus();
            return false;
        } else {
            iy014a.setError(null);
        }

        switch (rdo_iy014) {
            case R.id.iy014a:
                var_iy014 = "1";
                break;
            case R.id.iy014b:
                var_iy014 = "2";
                break;
            case R.id.iy014c:
                var_iy014 = "88";
                break;
        }

        if (var_iy014 == "1") {

            if (!iy015a.isChecked()
                    && !iy015b.isChecked()
                    && !iy015c.isChecked()
                    && !iy015d.isChecked()
                    && !iy015e.isChecked()
                    && !iy015f.isChecked()
                    && !iy015g.isChecked()
                    && !iy015h.isChecked()
                    && !iy015i.isChecked()
                    && !iy01588.isChecked()) {
                iy015a.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy015), Toast.LENGTH_LONG).show();
                iy015a.requestFocus();
                return false;
            } else {
                iy015a.setError(null);
            }

        }


        if (iy01588.isChecked()) {
            if (iy015x.getText().toString().isEmpty() || iy015x.getText().toString() == null) {
                iy015x.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                iy015x.requestFocus();
                return false;
            } else {
                iy015x.setError(null);
            }

        }


        if (iy016m.getText().toString().isEmpty() || iy016m.getText().toString() == null) {
            iy016m.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy016m), Toast.LENGTH_LONG).show();
            iy016m.requestFocus();
            return false;
        } else {
            iy016m.setError(null);
        }

        if (iy01677.getText().toString().isEmpty() || iy01677.getText().toString() == null) {
            iy01677.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy01677), Toast.LENGTH_LONG).show();
            iy01677.requestFocus();
            return false;
        } else {
            iy01677.setError(null);
        }

        if (!iy01788.isChecked()) {

            if (iy017d.getText().toString().isEmpty() || iy017d.getText().toString() == null) {
                iy017d.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy017d), Toast.LENGTH_LONG).show();
                iy017d.requestFocus();
                return false;
            } else {
                iy017d.setError(null);
            }

            if (iy017m.getText().toString().isEmpty() || iy017m.getText().toString() == null) {
                iy017m.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy017m), Toast.LENGTH_LONG).show();
                iy017m.requestFocus();
                return false;
            } else {
                iy017m.setError(null);
            }

        } else {
            iy017d.setText(null);
            iy017m.setText(null);
        }


        if (!iy01888.isChecked()) {
            if (iy018d.getText().toString().isEmpty() || iy018d.getText().toString() == null) {
                iy018d.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy018d), Toast.LENGTH_LONG).show();
                iy018d.requestFocus();
                return false;
            } else {
                iy018d.setError(null);
            }

            if (iy018m.getText().toString().isEmpty() || iy018m.getText().toString() == null) {
                iy018m.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy018m), Toast.LENGTH_LONG).show();
                iy018m.requestFocus();
                return false;
            } else {
                iy018m.setError(null);
            }
        } else {
            iy018d.setText(null);
            iy018m.setText(null);
        }

        if (!iy03m.getText().toString().isEmpty() && iy03m.getText().toString() != null) {

            if (Integer.parseInt(iy03m.getText().toString()) < 0 || Integer.parseInt(iy03m.getText().toString()) > 11) {
                iy03m.setError("Age in months must be between 0 - 11");
                iy03m.requestFocus();
                return false;
            } else {
                iy03m.setError(null);
            }

        }


        if (!iy03d.getText().toString().isEmpty() && iy03d.getText().toString() != null) {

            if (Integer.parseInt(iy03d.getText().toString()) < 0 || Integer.parseInt(iy03d.getText().toString()) > 30) {
                iy03d.setError("Age in days must be between 0 - 30");
                iy03d.requestFocus();
                return false;
            } else {
                iy03d.setError(null);
            }

        }


        if (!iy06d.getText().toString().isEmpty() && iy06d.getText().toString() != null) {

            if (Integer.parseInt(iy06d.getText().toString()) < 0 || Integer.parseInt(iy06d.getText().toString()) > 28) {
                iy06d.setError("Must be between 0 - 28");
                return false;
            } else {
                iy06d.setError(null);
            }

        }


        if (!iy011d.getText().toString().isEmpty() && iy011d.getText().toString() != null) {


            if (Integer.parseInt(iy011d.getText().toString()) < 0 || Integer.parseInt(iy011d.getText().toString()) > 30) {
                iy011d.setError("Must be between 0 - 30");
                iy011d.requestFocus();
                return false;
            } else {
                iy011d.setError(null);
            }

        }


        if (!iy011w.getText().toString().isEmpty() && iy011w.getText().toString() != null) {


            if (Integer.parseInt(iy011w.getText().toString()) < 0 || Integer.parseInt(iy011w.getText().toString()) > 4) {
                iy011w.setError("Must be between 0 - 4");
                iy011w.requestFocus();
                return false;
            } else {
                iy011w.setError(null);
            }

        }


        if (!iy012d.getText().toString().isEmpty() && iy012d.getText().toString() != null) {

            if (Integer.parseInt(iy012d.getText().toString()) < 0 || Integer.parseInt(iy012d.getText().toString()) > 30) {
                iy012d.setError("Must be between 0 - 30");
                iy012d.requestFocus();
                return false;
            } else {
                iy012d.setError(null);
            }

        }


        if (!iy012h.getText().toString().isEmpty() && iy012h.getText().toString() != null) {

            if (Integer.parseInt(iy012h.getText().toString()) < 0 || Integer.parseInt(iy012h.getText().toString()) > 24) {
                iy012h.setError("Must be between 0 - 24");
                iy012h.requestFocus();
                return false;
            } else {
                iy012h.setError(null);
            }

        }


        if (!iy016m.getText().toString().isEmpty() && iy016m.getText().toString() != null) {

            if (Integer.parseInt(iy016m.getText().toString()) < 0 || Integer.parseInt(iy016m.getText().toString()) > 11) {
                iy016m.setError("Must be between 0 - 11");
                iy016m.requestFocus();
                return false;
            } else {
                iy016m.setError(null);
            }

        }


        if (!iy017d.getText().toString().isEmpty() && iy017d.getText().toString() != null) {

            if (Integer.parseInt(iy017d.getText().toString()) < 0 || Integer.parseInt(iy017d.getText().toString()) > 30) {
                iy017d.setError("Must be between 0 - 30");
                iy017d.requestFocus();
                return false;
            } else {
                iy017d.setError(null);
            }

        }


        if (iy017m.getText().toString() != "" && iy017m.getText().toString() != null) {

            if (Integer.parseInt(iy017m.getText().toString()) < 0 || Integer.parseInt(iy017m.getText().toString()) > 11) {
                iy017m.setError("Must be between 0 - 11");
                iy017m.requestFocus();
                return false;
            } else {
                iy017m.setError(null);
            }

        }


        if (iy018d.getText().toString() != "" && iy018d.getText().toString() != null) {

            if (Integer.parseInt(iy018d.getText().toString()) < 0 || Integer.parseInt(iy018d.getText().toString()) > 30) {
                iy018d.setError("Must be between 0 - 30");
                iy018d.requestFocus();
                return false;
            } else {
                iy018d.setError(null);
            }

        }


        if (iy018m.getText().toString() != "" && iy018m.getText().toString() != null) {

            if (Integer.parseInt(iy018m.getText().toString()) < 0 || Integer.parseInt(iy018m.getText().toString()) > 11) {
                iy018m.setError("Must be between 0 - 11");
                iy018m.requestFocus();
                return false;
            } else {
                iy018m.setError(null);
            }

        }

        return true;
    }


    private boolean SaveDraft() throws JSONException {

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        JSONObject js = new JSONObject();

        js.put("iy01", iy01.getText().toString());
        js.put("iy01", iy01.getText().toString());
        rdo_iy02 = iy02.getCheckedRadioButtonId();

        switch (rdo_iy02) {
            case R.id.iy02a:
                var_iy02 = "1";
                break;
            case R.id.iy02b:
                var_iy02 = "2";
                break;
        }

        js.put("iy02", var_iy02);
        js.put("iy03m", iy03m.getText().toString());
        js.put("iy03d", iy03d.getText().toString());

        rdo_iy04 = iy04.getCheckedRadioButtonId();

        switch (rdo_iy04) {
            case R.id.iy04a:
                var_iy04 = "1";
                break;
            case R.id.iy04b:
                var_iy04 = "2";
                break;
            case R.id.iy04c:
                var_iy04 = "88";
                break;
        }

        js.put("iy04", var_iy04);

        js.put("iy05a", iy05a.isChecked() ? "1" : "2");
        js.put("iy05b", iy05b.isChecked() ? "1" : "2");
        js.put("iy05c", iy05c.isChecked() ? "1" : "2");
        js.put("iy05d", iy05d.isChecked() ? "1" : "2");
        js.put("iy05e", iy05e.isChecked() ? "1" : "2");
        js.put("iy05f", iy05f.isChecked() ? "1" : "2");
        js.put("iy05g", iy05g.isChecked() ? "1" : "2");
        js.put("iy05h", iy05h.isChecked() ? "1" : "2");
        js.put("iy05i", iy05i.isChecked() ? "1" : "2");
        js.put("iy05j", iy05j.isChecked() ? "1" : "2");
        js.put("iy0588", iy0588.isChecked() ? "1" : "2");


        js.put("iy05x", iy05x.getText().toString());

        js.put("iy06d", iy06d.getText().toString());

        rdo_iy07 = iy07.getCheckedRadioButtonId();

        switch (rdo_iy07) {
            case R.id.iy07a:
                var_iy07 = "1";
                break;
            case R.id.iy07b:
                var_iy07 = "2";
                break;
            case R.id.iy07c:
                var_iy07 = "88";
                break;
        }

        js.put("iy07", var_iy07);

        js.put("iy07aa", iy07aa.getText().toString());
        js.put("iy07bb", iy07bb.getText().toString());
        js.put("iy07cc", iy07cc.getText().toString());


        js.put("iy08a", iy08a.isChecked() ? "1" : "2");
        js.put("iy08b", iy08b.isChecked() ? "1" : "2");
        js.put("iy08c", iy08c.isChecked() ? "1" : "2");
        js.put("iy08d", iy08d.isChecked() ? "1" : "2");
        js.put("iy08e", iy08e.isChecked() ? "1" : "2");
        js.put("iy0888", iy0888.isChecked() ? "1" : "2");


        js.put("iy08x", iy08x.getText().toString());

        rdo_iy09 = iy09.getCheckedRadioButtonId();

        switch (rdo_iy09) {
            case R.id.iy09a:
                var_iy09 = "1";
                break;
            case R.id.iy09b:
                var_iy09 = "2";
                break;
        }

        js.put("iy09", var_iy09);

        js.put("iy010a", iy010a.isChecked() ? "1" : "2");
        js.put("iy010b", iy010b.isChecked() ? "1" : "2");
        js.put("iy010c", iy010c.isChecked() ? "1" : "2");
        js.put("iy010d", iy010d.isChecked() ? "1" : "2");
        js.put("iy010e", iy010e.isChecked() ? "1" : "2");
        js.put("iy010f", iy010f.isChecked() ? "1" : "2");
        js.put("iy01088", iy01088.isChecked() ? "1" : "2");

        js.put("iy010x", iy010x.getText().toString());


        js.put("iy011d", iy011d.getText().toString());
        js.put("iy011w", iy011w.getText().toString());
        js.put("iy012h", iy012h.getText().toString());
        js.put("iy012d", iy012d.getText().toString());
        js.put("iy01299", iy01299.isChecked() ? "88" : "");

        rdo_iy013 = iy013.getCheckedRadioButtonId();

        switch (rdo_iy013) {
            case R.id.iy013a:
                var_iy013 = "1";
                break;
            case R.id.iy013b:
                var_iy013 = "2";
                break;
            case R.id.iy013c:
                var_iy013 = "88";
                break;
        }

        js.put("iy013", var_iy013);


        rdo_iy014 = iy014.getCheckedRadioButtonId();

        switch (rdo_iy014) {
            case R.id.iy014a:
                var_iy014 = "1";
                break;
            case R.id.iy014b:
                var_iy014 = "2";
                break;
            case R.id.iy014c:
                var_iy014 = "88";
                break;
        }

        js.put("iy014", var_iy014);

        js.put("iy015a", iy015a.isChecked() ? "1" : "2");
        js.put("iy015b", iy015b.isChecked() ? "1" : "2");
        js.put("iy015c", iy015c.isChecked() ? "1" : "2");
        js.put("iy015d", iy015d.isChecked() ? "1" : "2");
        js.put("iy015e", iy015e.isChecked() ? "1" : "2");
        js.put("iy015f", iy015f.isChecked() ? "1" : "2");
        js.put("iy015g", iy015g.isChecked() ? "1" : "2");
        js.put("iy015h", iy015h.isChecked() ? "1" : "2");
        js.put("iy015i", iy015i.isChecked() ? "1" : "2");
        js.put("iy01588", iy01588.isChecked() ? "1" : "2");


        js.put("iy015x", iy015x.getText().toString());

        js.put("iy016m", iy016m.getText().toString());
        js.put("iy01677", iy01677.getText().toString());

        js.put("iy017d", iy017d.getText().toString());
        js.put("iy017m", iy017m.getText().toString());
        js.put("iy01788", iy01788.isChecked() ? "88" : "");

        js.put("iy018d", iy018d.getText().toString());
        js.put("iy018m", iy018m.getText().toString());
        js.put("iy01888", iy01888.isChecked() ? "88" : "");

        return true;
    }
}