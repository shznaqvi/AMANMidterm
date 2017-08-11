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
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;

public class IYCFActivity extends Activity {

    private static final String TAG = IYCFActivity.class.getSimpleName();
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
    @BindView(R.id.iy0499)
    RadioButton iy0499;
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
    @BindView(R.id.iy0799)
    RadioButton iy0799;
    @BindView(R.id.iy07aa)
    EditText iy07aa;
    @BindView(R.id.iy07bb)
    EditText iy07bb;
    @BindView(R.id.iy07cc)
    EditText iy07cc;
    @BindView(R.id.iy08a)
    CheckBox iy08a;
    @BindView(R.id.iy08b)
    CheckBox iy08b;
    @BindView(R.id.iy08c)
    CheckBox iy08c;
    @BindView(R.id.iy08d)
    CheckBox iy08d;
    @BindView(R.id.iy08e)
    CheckBox iy08e;
    @BindView(R.id.iy0888)
    CheckBox iy0888;
    @BindView(R.id.iy08x)
    EditText iy08x;
    @BindView(R.id.iy09)
    RadioGroup iy09;
    @BindView(R.id.iy09a)
    RadioButton iy09a;
    @BindView(R.id.iy09b)
    RadioButton iy09b;
    @BindView(R.id.iy010)
    RadioGroup iy010;
    @BindView(R.id.iy010a)
    RadioButton iy010a;
    @BindView(R.id.iy010b)
    RadioButton iy010b;
    @BindView(R.id.iy010c)
    RadioButton iy010c;
    @BindView(R.id.iy010d)
    RadioButton iy010d;
    @BindView(R.id.iy010e)
    RadioButton iy010e;
    @BindView(R.id.iy010f)
    RadioButton iy010f;
    @BindView(R.id.iy01088)
    RadioButton iy01088;
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
    @BindView(R.id.iy01399)
    RadioButton iy01399;
    @BindView(R.id.iy014)
    RadioGroup iy014;
    @BindView(R.id.iy014a)
    RadioButton iy014a;
    @BindView(R.id.iy014b)
    RadioButton iy014b;
    @BindView(R.id.iy01499)
    RadioButton iy01499;
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
    @BindView(R.id.fldGrpiy016)
    LinearLayout fldGrpiy016;
    @BindView(R.id.fldGrpiy017)
    LinearLayout fldGrpiy017;
    @BindView(R.id.fldGrpiy08)
    LinearLayout fldGrpiy08;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iycf);
        ButterKnife.bind(this);

        iy04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (iy04a.isChecked()) {
                    fldGrpiy04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpiy04.setVisibility(View.GONE);
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
                    iy06d.setText(null);
                    iy07.clearCheck();
                    iy07aa.setText(null);
                    iy07bb.setText(null);
                    iy07cc.setText(null);
                    iy08a.setChecked(false);
                    iy08b.setChecked(false);
                    iy08c.setChecked(false);
                    iy08d.setChecked(false);
                    iy08e.setChecked(false);
                    iy0888.setChecked(false);
                    iy08x.setText(null);


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
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (iy07a.isChecked()) {
                    fldGrpiy08.setVisibility(View.VISIBLE);
                    fldGrpiy07.setVisibility(View.GONE);
                    iy07aa.setText(null);
                    iy07bb.setText(null);
                    iy07cc.setText(null);
                } else {
                    fldGrpiy08.setVisibility(View.GONE);
                    iy08a.setChecked(false);
                    iy08b.setChecked(false);
                    iy08c.setChecked(false);
                    iy08d.setChecked(false);
                    iy08e.setChecked(false);
                    iy0888.setChecked(false);
                    iy08x.setText(null);
                    fldGrpiy07.setVisibility(View.VISIBLE);
                }
            }
        });

        iy0888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
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
                    fldGrpiy016.setVisibility(View.GONE);
                    iy017d.setText(null);
                    iy017m.setText(null);
                    iy01788.setChecked(false);
                    iy018d.setText(null);
                    iy018m.setText(null);
                    iy01888.setChecked(false);
                } else {
                    fldGrpiy016.setVisibility(View.VISIBLE);
                    iy016m.setVisibility(View.VISIBLE);

                }
            }
        });

        iy01788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpiy017.setVisibility(View.GONE);
                    iy017d.setVisibility(View.GONE);
                    iy017d.setText(null);
                    iy017m.setText(null);
                    iy017m.setVisibility(View.GONE);
                    iy018m.setText(null);
                    iy018d.setText(null);
                    iy01888.setChecked(false);
                } else {
                    fldGrpiy017.setVisibility(View.VISIBLE);
                    iy017d.setVisibility(View.VISIBLE);
                    iy017m.setVisibility(View.VISIBLE);
                }
            }
        });

        iy01888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    iy018m.setVisibility(View.GONE);
                    iy018d.setVisibility(View.GONE);
                    iy018m.setText(null);
                    iy018d.setText(null);
                } else {
                    iy018m.setVisibility(View.VISIBLE);
                    iy018d.setVisibility(View.VISIBLE);
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
        /*Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("check", false);
        startActivity(endSec);*/
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */

        AppMain.endActivity(this, this);

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

                        startActivity(new Intent(this, ChildVaccinationActivity.class));
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

        int updcount = db.updateIycf();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean ValidateForm() {

        if (iy01.getText().toString().isEmpty() || iy01.getText().toString() == null) {
            iy01.setError(getString(R.string.txterr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy01), Toast.LENGTH_LONG).show();
            Log.d(TAG, "iy01 : empty");
            iy01.requestFocus();
            return false;
        } else {
            iy01.setError(null);
        }

        if (iy02.getCheckedRadioButtonId() == -1) {
            iy02a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy02), Toast.LENGTH_LONG).show();
            iy02a.requestFocus();
            Log.d(TAG, "iy02a: empty ");
            return false;
        } else {
            iy02a.setError(null);
        }


        if (iy03m.getText().toString().isEmpty() || iy03m.getText().toString() == null) {
            iy03m.setError(getString(R.string.txterr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy03), Toast.LENGTH_LONG).show();
            Log.d(TAG, "iy03m: empty ");
            iy03m.requestFocus();
            return false;
        } else {
            iy03m.setError(null);
        }


        /*if (iy03d.getText().toString().isEmpty() || iy03d.getText().toString() == null) {
            iy03d.setError(getString(R.string.txterr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy03), Toast.LENGTH_LONG).show();
            Log.d(TAG, "iy03d: empty ");
            iy03d.requestFocus();
            return false;
        } else {
            iy03d.setError(null);
        }*/

        if (!iy03m.getText().toString().isEmpty() && iy03m.getText().toString() != null) {

            if (Integer.parseInt(iy03m.getText().toString()) < 0 || Integer.parseInt(iy03m.getText().toString()) > 23) {
                iy03m.setError("Age in months must be between 0 - 23");
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy03), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy03m: invalid ");
                iy03m.requestFocus();
                return false;
            } else {
                iy03m.setError(null);
            }

        }

        /*if (!iy03d.getText().toString().isEmpty() && iy03d.getText().toString() != null) {

            if (Integer.parseInt(iy03d.getText().toString()) < 0 || Integer.parseInt(iy03d.getText().toString()) > 30) {
                iy03d.setError("Age in days must be between 0 - 30");
                iy03d.requestFocus();
                return false;
            } else {
                iy03d.setError(null);
            }

        }
*/

        if (iy04.getCheckedRadioButtonId() == -1) {
            iy04a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy04), Toast.LENGTH_LONG).show();
            Log.d(TAG, "iy04: this data is required ");
            iy04a.requestFocus();
            return false;
        } else {
            iy04a.setError(null);
        }


        if (iy04a.isChecked()) {

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
                Log.d(TAG, "iy05: empty ");
                iy05a.requestFocus();
                return false;
            } else {
                iy05a.setError(null);
            }


            if (iy0588.isChecked()) {
                if (iy05x.getText().toString().isEmpty() || iy05x.getText().toString() == null) {
                    iy05x.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy05x: empty ");
                    iy05x.requestFocus();
                    return false;
                } else {
                    iy05x.setError(null);
                }
            }

            if (iy06d.getText().toString().isEmpty() || iy06d.getText().toString() == null) {
                iy06d.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy06d), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy06d: empty ");
                iy06d.requestFocus();
                return false;
            } else {
                iy06d.setError(null);
            }

            if (!iy06d.getText().toString().isEmpty() && iy06d.getText().toString() != null) {

                if (Integer.parseInt(iy06d.getText().toString()) < 0 || Integer.parseInt(iy06d.getText().toString()) > 28) {
                    iy06d.setError("Must be between 0 - 28");
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy06d), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy06d: invalid ");
                    return false;
                } else {
                    iy06d.setError(null);
                }

            }

            if (iy07.getCheckedRadioButtonId() == -1) {
                iy07a.setError(getString(R.string.rdoerr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy07), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy07a: empty ");
                iy07a.requestFocus();
                return false;
            } else {
                iy07a.setError(null);
            }

            if (iy07b.isChecked()) {

                if (iy07aa.getText().toString().isEmpty() || iy07aa.getText().toString() == null) {
                    iy07aa.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy07a), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy07aa: empty ");
                    iy07aa.requestFocus();
                    return false;
                } else {
                    iy07aa.setError(null);
                }
            } else {

                if (!(iy08a.isChecked() || iy08b.isChecked() || iy08c.isChecked() || iy08d.isChecked() || iy0888.isChecked())) {
                    iy08a.setError(getString(R.string.rdoerr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy08), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy08a: this data is required ");
                    iy08a.requestFocus();
                    return false;
                } else {
                    iy08a.setError(null);
                }

                if (iy0888.isChecked()) {

                    if (iy08x.getText().toString().isEmpty() || iy08x.getText().toString() == null) {
                        iy08x.setError(getString(R.string.txterr));
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                        Log.d(TAG, "iy08x: empty ");
                        iy08x.requestFocus();
                        return false;
                    } else {
                        iy08x.setError(null);
                    }

                }
            }

        }


        if (iy09.getCheckedRadioButtonId() == -1) {
            iy09a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy09), Toast.LENGTH_LONG).show();
            Log.d(TAG, "iy09: this data is required");
            iy09a.requestFocus();
            return false;
        } else {
            iy09a.setError(null);
        }


        if (iy09a.isChecked()) {

            if (iy010.getCheckedRadioButtonId() == -1) {
                iy010a.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy010), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy010: this data is required ");
                iy010a.requestFocus();
                return false;
            } else {
                iy010a.setError(null);
            }


            if (iy01088.isChecked()) {

                if (iy010x.getText().toString().isEmpty() || iy010x.getText().toString() == null) {
                    iy010x.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy010x: empty ");
                    iy010x.requestFocus();
                    return false;
                } else {
                    iy010x.setError(null);
                }

            }

            if (iy011d.getText().toString().isEmpty() || iy011d.getText().toString() == null) {
                iy011d.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy011d), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy011d: empty ");
                iy011d.requestFocus();
                return false;
            } else {
                iy011d.setError(null);
            }

            if (iy011w.getText().toString().isEmpty() || iy011w.getText().toString() == null) {
                iy011w.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy011w), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy011w: empty ");
                iy011w.requestFocus();
                return false;
            } else {
                iy011w.setError(null);
            }

            if (!iy011d.getText().toString().isEmpty() && iy011d.getText().toString() != null) {


                if (Integer.parseInt(iy011d.getText().toString()) < 0 || Integer.parseInt(iy011d.getText().toString()) > 6) {
                    iy011d.setError("Must be between 0 - 6");
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy011d), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy011d: invalid ");
                    iy011d.requestFocus();
                    return false;
                } else {
                    iy011d.setError(null);
                }

            }


            if (!iy011w.getText().toString().isEmpty() && iy011w.getText().toString() != null) {


                if (Integer.parseInt(iy011w.getText().toString()) < 0 || Integer.parseInt(iy011w.getText().toString()) > 4) {
                    iy011w.setError("Must be between 0 - 4");
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy011w), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy011w: invalid ");
                    iy011w.requestFocus();
                    return false;
                } else {
                    iy011w.setError(null);
                }

            }

        }

        if (!iy01299.isChecked()) {

            if (iy012h.getText().toString().isEmpty()) {
                iy012h.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy012h), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy012h: empty ");
                iy012h.requestFocus();
                return false;
            } else {
                iy012h.setError(null);
            }

            if (iy012d.getText().toString().isEmpty() || iy012d.getText().toString() == null) {
                iy012d.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy012d), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy012d: empty ");
                iy012d.requestFocus();
                return false;
            } else {
                iy012d.setError(null);
            }
        } else {
            iy012h.setText(null);
            iy012d.setText(null);
        }

        if (!iy012d.getText().toString().isEmpty() && iy012d.getText().toString() != null) {

            if (Integer.parseInt(iy012d.getText().toString()) < 0 || Integer.parseInt(iy012d.getText().toString()) > 29) {
                iy012d.setError("Must be between 0 - 29");
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy012d), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy012d: invalid ");
                iy012d.requestFocus();
                return false;
            } else {
                iy012d.setError(null);
            }

        }


        if (!iy012h.getText().toString().isEmpty() && iy012h.getText().toString() != null) {

            if (Integer.parseInt(iy012h.getText().toString()) < 0 || Integer.parseInt(iy012h.getText().toString()) > 23) {
                iy012h.setError("Must be between 0 - 23");
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy012h), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy012h: invalid ");
                iy012h.requestFocus();
                return false;
            } else {
                iy012h.setError(null);
            }

        }

        if (iy013.getCheckedRadioButtonId() == -1) {
            iy013a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy013), Toast.LENGTH_LONG).show();
            Log.d(TAG, "iy013a: this data is required ");
            iy013a.requestFocus();
            return false;
        } else {
            iy013a.setError(null);
        }


        if (iy014.getCheckedRadioButtonId() == -1) {
            iy014a.setError(getString(R.string.rdoerr));
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy014), Toast.LENGTH_LONG).show();
            Log.d(TAG, "iy014: this data is required");
            iy014a.requestFocus();
            return false;
        } else {
            iy014a.setError(null);
        }


        if (iy014a.isChecked()) {

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
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy015), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy015: this data is required");
                iy015a.requestFocus();
                return false;
            } else {
                iy015a.setError(null);
            }

            if (iy01588.isChecked()) {
                if (iy015x.getText().toString().isEmpty() || iy015x.getText().toString() == null) {
                    iy015x.setError(getString(R.string.txterr));
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy015x: empty ");
                    iy015x.requestFocus();
                    return false;
                } else {
                    iy015x.setError(null);
                }

            }

        }

        if (!iy01677.isChecked()) {
            if (iy016m.getText().toString().isEmpty() || iy016m.getText().toString() == null) {
                iy016m.setError(getString(R.string.txterr));
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.iy016m), Toast.LENGTH_LONG).show();
                Log.d(TAG, "iy016m: empty ");
                iy016m.requestFocus();
                return false;
            } else {
                iy016m.setError(null);
            }

            if (!iy016m.getText().toString().isEmpty() && iy016m.getText().toString() != null) {

                if (Integer.parseInt(iy016m.getText().toString()) < 0 || Integer.parseInt(iy016m.getText().toString()) > 23) {
                    iy016m.setError("Must be between 0 - 23");
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy016m), Toast.LENGTH_LONG).show();
                    Log.d(TAG, "iy016m: invalid ");
                    iy016m.requestFocus();
                    return false;
                } else {
                    iy016m.setError(null);
                }

            }

            if (!iy01788.isChecked()) {

                if (iy017d.getText().toString().isEmpty() || iy017d.getText().toString() == null
                        && iy017m.getText().toString().isEmpty() || iy017m.getText().toString() == null) {
                    iy017d.setError(getString(R.string.txterr));
                    iy017m.setError(getString(R.string.txterr));
                    Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy017d), Toast.LENGTH_LONG).show();
                    iy017d.requestFocus();
                    return false;
                } else {
                    iy017d.setError(null);
                    iy017m.setError(null);
                }

                if (Integer.valueOf(iy017d.getText().toString().isEmpty() ? "0" : iy017d.getText().toString()) == 0
                        && Integer.valueOf(iy017m.getText().toString().isEmpty() ? "0" : iy017m.getText().toString()) == 0) {
                    Toast.makeText(this, "ERROR(invalid)" + getString(R.string.iy017) + " - " + getString(R.string.iy017m), Toast.LENGTH_SHORT).show();
                    iy017d.setError("Days and months can not be zero..");
                    iy017m.setError("Days and months can not be zero..");

                    Log.i(TAG, "iy017: Both can not be zero");
                    return false;
                } else {
                    iy017d.setError(null);
                    iy017m.setError(null);
                }

                if (!iy017d.getText().toString().isEmpty() && iy017d.getText().toString() != null) {

                    if (Integer.parseInt(iy017d.getText().toString()) < 0 || Integer.parseInt(iy017d.getText().toString()) > 29) {
                        iy017d.setError("Must be between 0 - 29");
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy017d), Toast.LENGTH_LONG).show();
                        Log.d(TAG, "iy017d: invalid ");
                        iy017d.requestFocus();
                        return false;
                    } else {
                        iy017d.setError(null);
                    }

                }

                if (!iy017m.getText().toString().isEmpty() && iy017m.getText().toString() != null) {

                    if (Integer.parseInt(iy017m.getText().toString()) < 0 || Integer.parseInt(iy017m.getText().toString()) > 23) {
                        iy017m.setError("Must be between 0 - 23");
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy017m), Toast.LENGTH_LONG).show();
                        Log.d(TAG, "iy017m: invalid ");
                        iy017m.requestFocus();
                        return false;
                    } else {
                        iy017m.setError(null);
                    }

                }

                if (!iy01888.isChecked()) {
                    if (iy018d.getText().toString().isEmpty() || iy018d.getText().toString() == null
                            && iy018m.getText().toString().isEmpty() || iy018m.getText().toString() == null) {
                        iy018d.setError(getString(R.string.txterr));
                        iy018m.setError(getString(R.string.txterr));
                        Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.iy018d), Toast.LENGTH_LONG).show();
                        iy018d.requestFocus();
                        return false;
                    } else {
                        iy018d.setError(null);
                        iy018m.setError(null);
                    }

                    if (!iy018d.getText().toString().isEmpty() && iy018d.getText().toString() != null) {

                        if (Integer.parseInt(iy018d.getText().toString()) < 0 || Integer.parseInt(iy018d.getText().toString()) > 29) {
                            iy018d.setError("Must be between 0 - 29");
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy018d), Toast.LENGTH_LONG).show();
                            Log.d(TAG, "iy018d: invalid ");
                            iy018d.requestFocus();
                            return false;
                        } else {
                            iy018d.setError(null);
                        }

                    }

                    if (!iy018m.getText().toString().isEmpty() && iy018m.getText().toString() != null) {

                        if (Integer.parseInt(iy018m.getText().toString()) < 0 || Integer.parseInt(iy018m.getText().toString()) > 11) {
                            iy018m.setError("Must be between 0 - 11");
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.iy018m), Toast.LENGTH_LONG).show();
                            Log.d(TAG, "iy018m: invalid ");
                            iy018m.requestFocus();
                            return false;
                        } else {
                            iy018m.setError(null);
                        }

                        if (Integer.valueOf(iy018d.getText().toString().isEmpty() ? "0" : iy018d.getText().toString()) == 0
                                && Integer.valueOf(iy018m.getText().toString().isEmpty() ? "0" : iy018m.getText().toString()) == 0) {
                            Toast.makeText(this, "ERROR(invalid)" + getString(R.string.iy018) + " - " + getString(R.string.iy03m), Toast.LENGTH_SHORT).show();
                            iy018d.setError("Days and months can not be zero..");
                            iy018m.setError("Days and months can not be zero..");

                            Log.i(TAG, "iy018: Both can not be zero");
                            return false;
                        } else {
                            iy018d.setError(null);
                            iy018m.setError(null);
                        }

                    }


                }
            }
        }

        return true;
    }


    private boolean SaveDraft() throws JSONException {

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        JSONObject js = new JSONObject();

        js.put("iy01", iy01.getText().toString());
        js.put("iy02", iy02a.isChecked() ? "1" : iy02b.isChecked() ? "2" : "0");
        js.put("iy03m", iy03m.getText().toString());
        js.put("iy03d", iy03d.getText().toString());
        js.put("iy04", iy04a.isChecked() ? "1" : iy04b.isChecked() ? "2" : iy0499.isChecked() ? "99" : "0");

        js.put("iy05a", iy05a.isChecked() ? "1" : "0");
        js.put("iy05b", iy05b.isChecked() ? "2" : "0");
        js.put("iy05c", iy05c.isChecked() ? "3" : "0");
        js.put("iy05d", iy05d.isChecked() ? "4" : "0");
        js.put("iy05e", iy05e.isChecked() ? "5" : "0");
        js.put("iy05f", iy05f.isChecked() ? "6" : "0");
        js.put("iy05g", iy05g.isChecked() ? "7" : "0");
        js.put("iy05h", iy05h.isChecked() ? "8" : "0");
        js.put("iy05i", iy05i.isChecked() ? "9" : "0");
        js.put("iy05j", iy05j.isChecked() ? "10" : "0");
        js.put("iy0588", iy0588.isChecked() ? "88" : "0");
        js.put("iy0588x", iy05x.getText().toString());

        js.put("iy06d", iy06d.getText().toString());

        js.put("iy07", iy07a.isChecked() ? "1" : iy07b.isChecked() ? "2" : iy0799.isChecked() ? "99" : "0");

        js.put("iy07aa", iy07aa.getText().toString());
        js.put("iy07bb", iy07bb.getText().toString());
        js.put("iy07cc", iy07cc.getText().toString());


        js.put("iy08a", iy08a.isChecked() ? "1" : "0");
        js.put("iy08b", iy08b.isChecked() ? "2" : "0");
        js.put("iy08c", iy08c.isChecked() ? "3" : "0");
        js.put("iy08d", iy08d.isChecked() ? "4" : "0");
        js.put("iy08e", iy08e.isChecked() ? "5" : "0");
        js.put("iy0888", iy0888.isChecked() ? "8" : "0");
        js.put("iy0888x", iy08x.getText().toString());

        js.put("iy09", iy09a.isChecked() ? "1" : iy09b.isChecked() ? "2" : "0");

        js.put("iy010", iy010a.isChecked() ? "1" : iy010b.isChecked() ? "2" : iy010c.isChecked() ? "3" : iy010d.isChecked() ? "4"
                : iy010e.isChecked() ? "5" : iy010f.isChecked() ? "6" : iy01088.isChecked() ? "88" : "0");
        js.put("iy01088x", iy010x.getText().toString());

        js.put("iy011d", iy011d.getText().toString());
        js.put("iy011w", iy011w.getText().toString());
        js.put("iy012h", iy012h.getText().toString());
        js.put("iy012d", iy012d.getText().toString());
        js.put("iy01299", iy01299.isChecked() ? "99" : "0");

        js.put("iy013", iy013a.isChecked() ? "1" : iy013b.isChecked() ? "2" : iy01399.isChecked() ? "99" : "0");

        js.put("iy014", iy014a.isChecked() ? "1" : iy014b.isChecked() ? "2" : iy01499.isChecked() ? "99" : "0");

        js.put("iy015a", iy015a.isChecked() ? "1" : "0");
        js.put("iy015b", iy015b.isChecked() ? "2" : "0");
        js.put("iy015c", iy015c.isChecked() ? "3" : "0");
        js.put("iy015d", iy015d.isChecked() ? "4" : "0");
        js.put("iy015e", iy015e.isChecked() ? "5" : "0");
        js.put("iy015f", iy015f.isChecked() ? "6" : "0");
        js.put("iy015g", iy015g.isChecked() ? "7" : "0");
        js.put("iy015h", iy015h.isChecked() ? "8" : "0");
        js.put("iy015i", iy015i.isChecked() ? "9" : "0");
        js.put("iy01588", iy01588.isChecked() ? "88" : "0");
        js.put("iy01588x", iy015x.getText().toString());

        js.put("iy016m", iy016m.getText().toString());
        js.put("iy01677", iy01677.isChecked() ? "77" : "0");

        js.put("iy017d", iy017d.getText().toString());
        js.put("iy017m", iy017m.getText().toString());
        js.put("iy01766", iy01788.isChecked() ? "66" : "0");

        js.put("iy018d", iy018d.getText().toString());
        js.put("iy018m", iy018m.getText().toString());
        js.put("iy01866", iy01888.isChecked() ? "66" : "0");


        AppMain.fc.setIycf(String.valueOf(js));

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}