package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MaternalMentalHealthActivity extends Activity {

    @BindView(R.id.ms01)
    RadioGroup ms01;
    @BindView(R.id.ms01a)
    RadioButton ms01a;
    @BindView(R.id.ms01b)
    RadioButton ms01b;
    @BindView(R.id.ms02)
    RadioGroup ms02;
    @BindView(R.id.ms02a)
    RadioButton ms02a;
    @BindView(R.id.ms02b)
    RadioButton ms02b;
    @BindView(R.id.ms03)
    RadioGroup ms03;
    @BindView(R.id.ms03a)
    RadioButton ms03a;
    @BindView(R.id.ms03b)
    RadioButton ms03b;
    @BindView(R.id.ms04)
    RadioGroup ms04;
    @BindView(R.id.ms04a)
    RadioButton ms04a;
    @BindView(R.id.ms04b)
    RadioButton ms04b;
    @BindView(R.id.lbl_ms05)
    TextView lblMs05;
    @BindView(R.id.ms05)
    RadioGroup ms05;
    @BindView(R.id.ms05a)
    RadioButton ms05a;
    @BindView(R.id.ms05b)
    RadioButton ms05b;
    @BindView(R.id.lbl_ms06)
    TextView lblMs06;
    @BindView(R.id.ms06)
    RadioGroup ms06;
    @BindView(R.id.ms06a)
    RadioButton ms06a;
    @BindView(R.id.ms06b)
    RadioButton ms06b;
    @BindView(R.id.lbl_ms07)
    TextView lblMs07;
    @BindView(R.id.ms07)
    RadioGroup ms07;
    @BindView(R.id.ms07a)
    RadioButton ms07a;
    @BindView(R.id.ms07b)
    RadioButton ms07b;
    @BindView(R.id.lbl_ms08)
    TextView lblMs08;
    @BindView(R.id.ms08)
    RadioGroup ms08;
    @BindView(R.id.ms08a)
    RadioButton ms08a;
    @BindView(R.id.ms08b)
    RadioButton ms08b;
    @BindView(R.id.lbl_ms09)
    TextView lblMs09;
    @BindView(R.id.ms09)
    RadioGroup ms09;
    @BindView(R.id.ms09a)
    RadioButton ms09a;
    @BindView(R.id.ms09b)
    RadioButton ms09b;
    @BindView(R.id.lbl_ms10)
    TextView lblMs10;
    @BindView(R.id.ms10)
    RadioGroup ms10;
    @BindView(R.id.ms10a)
    RadioButton ms10a;
    @BindView(R.id.ms10b)
    RadioButton ms10b;
    @BindView(R.id.lbl_ms11)
    TextView lblMs11;
    @BindView(R.id.ms11)
    RadioGroup ms11;
    @BindView(R.id.ms11a)
    RadioButton ms11a;
    @BindView(R.id.ms11b)
    RadioButton ms11b;
    @BindView(R.id.lbl_ms12)
    TextView lblMs12;
    @BindView(R.id.ms12)
    RadioGroup ms12;
    @BindView(R.id.ms12a)
    RadioButton ms12a;
    @BindView(R.id.ms12b)
    RadioButton ms12b;
    @BindView(R.id.lbl_ms13)
    TextView lblMs13;
    @BindView(R.id.ms13)
    RadioGroup ms13;
    @BindView(R.id.ms13a)
    RadioButton ms13a;
    @BindView(R.id.ms13b)
    RadioButton ms13b;
    @BindView(R.id.lbl_ms14)
    TextView lblMs14;
    @BindView(R.id.ms14)
    RadioGroup ms14;
    @BindView(R.id.ms14a)
    RadioButton ms14a;
    @BindView(R.id.ms14b)
    RadioButton ms14b;
    @BindView(R.id.lbl_ms15)
    TextView lblMs15;
    @BindView(R.id.ms15)
    RadioGroup ms15;
    @BindView(R.id.ms15a)
    RadioButton ms15a;
    @BindView(R.id.ms15b)
    RadioButton ms15b;
    @BindView(R.id.lbl_ms16)
    TextView lblMs16;
    @BindView(R.id.ms16)
    RadioGroup ms16;
    @BindView(R.id.ms16a)
    RadioButton ms16a;
    @BindView(R.id.ms16b)
    RadioButton ms16b;
    @BindView(R.id.lbl_ms17)
    TextView lblMs17;
    @BindView(R.id.ms17)
    RadioGroup ms17;
    @BindView(R.id.ms17a)
    RadioButton ms17a;
    @BindView(R.id.ms17b)
    RadioButton ms17b;
    @BindView(R.id.lbl_ms18)
    TextView lblMs18;
    @BindView(R.id.ms18)
    RadioGroup ms18;
    @BindView(R.id.ms18a)
    RadioButton ms18a;
    @BindView(R.id.ms18b)
    RadioButton ms18b;
    @BindView(R.id.lbl_ms19)
    TextView lblMs19;
    @BindView(R.id.ms19)
    RadioGroup ms19;
    @BindView(R.id.ms19a)
    RadioButton ms19a;
    @BindView(R.id.ms19b)
    RadioButton ms19b;
    @BindView(R.id.lbl_ms20)
    TextView lblMs20;
    @BindView(R.id.ms20)
    RadioGroup ms20;
    @BindView(R.id.ms20a)
    RadioButton ms20a;
    @BindView(R.id.ms20b)
    RadioButton ms20b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maternal_mental_health);
        ButterKnife.bind(this);
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


    @OnClick(R.id.btnNext)
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

                Intent secNext = new Intent(this, BirthsDeathsActivity.class);
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




    private boolean SaveDraft() throws JSONException {

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        JSONObject js = new JSONObject();

        js.put("ms01", ms01a.isChecked() ? "1" : ms01b.isChecked() ? "2" : "0");
        js.put("ms02", ms02a.isChecked() ? "1" : ms02b.isChecked() ? "2" : "0");
        js.put("ms03", ms03a.isChecked() ? "1" : ms03b.isChecked() ? "2" : "0");
        js.put("ms04", ms04a.isChecked() ? "1" : ms04b.isChecked() ? "2" : "0");
        js.put("ms05", ms05a.isChecked() ? "1" : ms05b.isChecked() ? "2" : "0");
        js.put("ms06", ms06a.isChecked() ? "1" : ms06b.isChecked() ? "2" : "0");
        js.put("ms07", ms07a.isChecked() ? "1" : ms07b.isChecked() ? "2" : "0");
        js.put("ms08", ms08a.isChecked() ? "1" : ms08b.isChecked() ? "2" : "0");
        js.put("ms09", ms09a.isChecked() ? "1" : ms09b.isChecked() ? "2" : "0");
        js.put("ms10", ms10a.isChecked() ? "1" : ms10b.isChecked() ? "2" : "0");
        js.put("ms11", ms11a.isChecked() ? "1" : ms11b.isChecked() ? "2" : "0");
        js.put("ms12", ms12a.isChecked() ? "1" : ms12b.isChecked() ? "2" : "0");
        js.put("ms13", ms13a.isChecked() ? "1" : ms13b.isChecked() ? "2" : "0");
        js.put("ms14", ms14a.isChecked() ? "1" : ms14b.isChecked() ? "2" : "0");
        js.put("ms15", ms15a.isChecked() ? "1" : ms15b.isChecked() ? "2" : "0");
        js.put("ms16", ms16a.isChecked() ? "1" : ms16b.isChecked() ? "2" : "0");
        js.put("ms17", ms17a.isChecked() ? "1" : ms17b.isChecked() ? "2" : "0");
        js.put("ms18", ms18a.isChecked() ? "1" : ms18b.isChecked() ? "2" : "0");
        js.put("ms19", ms19a.isChecked() ? "1" : ms19b.isChecked() ? "2" : "0");
        js.put("ms20", ms20a.isChecked() ? "1" : ms20b.isChecked() ? "2" : "0");

        return true;
    }


    private boolean ValidateForm() {


        if (ms01.getCheckedRadioButtonId() == -1) {
            ms01a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms01), Toast.LENGTH_LONG).show();
            ms01a.requestFocus();
            return false;
        } else {
            ms01a.setError(null);
        }


        if (ms02.getCheckedRadioButtonId() == -1) {
            ms02a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms02), Toast.LENGTH_LONG).show();
            ms02a.requestFocus();
            return false;
        } else {
            ms02a.setError(null);
        }

        if (ms03.getCheckedRadioButtonId() == -1) {
            ms03a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms03), Toast.LENGTH_LONG).show();
            ms03a.requestFocus();
            return false;
        } else {
            ms03a.setError(null);
        }

        if (ms04.getCheckedRadioButtonId() == -1) {
            ms04a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms04), Toast.LENGTH_LONG).show();
            ms04a.requestFocus();
            return false;
        } else {
            ms04a.setError(null);
        }


        if (ms05.getCheckedRadioButtonId() == -1) {
            ms05a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms05), Toast.LENGTH_LONG).show();
            ms05a.requestFocus();
            return false;
        } else {
            ms05a.setError(null);
        }


        if (ms06.getCheckedRadioButtonId() == -1) {
            ms06a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms06), Toast.LENGTH_LONG).show();
            ms06a.requestFocus();
            return false;
        } else {
            ms06a.setError(null);
        }


        if (ms07.getCheckedRadioButtonId() == -1) {
            ms07a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms07), Toast.LENGTH_LONG).show();
            ms07a.requestFocus();
            return false;
        } else {
            ms07a.setError(null);
        }


        if (ms08.getCheckedRadioButtonId() == -1) {
            ms08a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms08), Toast.LENGTH_LONG).show();
            ms08a.requestFocus();
            return false;
        } else {
            ms08a.setError(null);
        }


        if (ms09.getCheckedRadioButtonId() == -1) {
            ms09a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms09), Toast.LENGTH_LONG).show();
            ms09a.requestFocus();
            return false;
        } else {
            ms09a.setError(null);
        }


        if (ms10.getCheckedRadioButtonId() == -1) {
            ms10a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms10), Toast.LENGTH_LONG).show();
            ms10a.requestFocus();
            return false;
        } else {
            ms10a.setError(null);
        }

        if (ms11.getCheckedRadioButtonId() == -1) {
            ms11a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms11), Toast.LENGTH_LONG).show();
            ms11a.requestFocus();
            return false;
        } else {
            ms11a.setError(null);
        }


        if (ms12.getCheckedRadioButtonId() == -1) {
            ms12a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms12), Toast.LENGTH_LONG).show();
            ms12a.requestFocus();
            return false;
        } else {
            ms12a.setError(null);
        }


        if (ms13.getCheckedRadioButtonId() == -1) {
            ms13a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms13), Toast.LENGTH_LONG).show();
            ms13a.requestFocus();
            return false;
        } else {
            ms13a.setError(null);
        }


        if (ms14.getCheckedRadioButtonId() == -1) {
            ms14a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms14), Toast.LENGTH_LONG).show();
            ms14a.requestFocus();
            return false;
        } else {
            ms14a.setError(null);
        }


        if (ms15.getCheckedRadioButtonId() == -1) {
            ms15a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms15), Toast.LENGTH_LONG).show();
            ms15a.requestFocus();
            return false;
        } else {
            ms15a.setError(null);
        }


        if (ms16.getCheckedRadioButtonId() == -1) {
            ms16a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms16), Toast.LENGTH_LONG).show();
            ms16a.requestFocus();
            return false;
        } else {
            ms16a.setError(null);
        }

        if (ms17.getCheckedRadioButtonId() == -1) {
            ms17a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms17), Toast.LENGTH_LONG).show();
            ms17a.requestFocus();
            return false;
        } else {
            ms17a.setError(null);
        }

        if (ms18.getCheckedRadioButtonId() == -1) {
            ms18a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms18), Toast.LENGTH_LONG).show();
            ms18a.requestFocus();
            return false;
        } else {
            ms18a.setError(null);
        }

        if (ms19.getCheckedRadioButtonId() == -1) {
            ms19a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms19), Toast.LENGTH_LONG).show();
            ms19a.requestFocus();
            return false;
        } else {
            ms19a.setError(null);
        }

        if (ms20.getCheckedRadioButtonId() == -1) {
            ms20a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms20), Toast.LENGTH_LONG).show();
            ms20a.requestFocus();
            return false;
        } else {
            ms20a.setError(null);
        }


        return true;
    }
}