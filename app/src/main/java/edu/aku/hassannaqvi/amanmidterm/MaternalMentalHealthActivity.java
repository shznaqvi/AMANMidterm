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

    int rdo_mn01;
    String var_mn01;

    int rdo_mn02;
    String var_mn02;

    int rdo_mn03;
    String var_mn03;

    int rdo_mn04;
    String var_mn04;

    int rdo_mn05;
    String var_mn05;

    int rdo_mn06;
    String var_mn06;

    int rdo_mn07;
    String var_mn07;

    int rdo_mn08;
    String var_mn08;

    int rdo_mn09;
    String var_mn09;

    int rdo_mn010;
    String var_mn010;

    int rdo_mn011;
    String var_mn011;

    int rdo_mn012;
    String var_mn012;

    int rdo_mn013;
    String var_mn013;

    int rdo_mn014;
    String var_mn014;

    int rdo_mn015;
    String var_mn015;

    int rdo_mn016;
    String var_mn016;

    int rdo_mn017;
    String var_mn017;

    int rdo_mn018;
    String var_mn018;

    int rdo_mn019;
    String var_mn019;

    int rdo_mn020;
    String var_mn020;


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

        rdo_mn01 = ms01.getCheckedRadioButtonId();

        switch (rdo_mn01) {
            case R.id.ms01a:
                var_mn01 = "1";
                break;
            case R.id.ms01b:
                var_mn01 = "2";
                break;
        }

        rdo_mn02 = ms02.getCheckedRadioButtonId();

        switch (rdo_mn02) {
            case R.id.ms02a:
                var_mn02 = "1";
                break;
            case R.id.ms02b:
                var_mn02 = "2";
                break;
        }

        rdo_mn03 = ms03.getCheckedRadioButtonId();

        switch (rdo_mn03) {
            case R.id.ms03a:
                var_mn03 = "1";
                break;
            case R.id.ms03b:
                var_mn03 = "2";
                break;
        }


        rdo_mn04 = ms04.getCheckedRadioButtonId();

        switch (rdo_mn04) {
            case R.id.ms04a:
                var_mn04 = "1";
                break;
            case R.id.ms04b:
                var_mn04 = "2";
                break;
        }


        rdo_mn05 = ms05.getCheckedRadioButtonId();

        switch (rdo_mn05) {
            case R.id.ms05a:
                var_mn05 = "1";
                break;
            case R.id.ms05b:
                var_mn05 = "2";
                break;
        }


        rdo_mn06 = ms06.getCheckedRadioButtonId();

        switch (rdo_mn06) {
            case R.id.ms06a:
                var_mn06 = "1";
                break;
            case R.id.ms06b:
                var_mn06 = "2";
                break;
        }


        rdo_mn07 = ms07.getCheckedRadioButtonId();

        switch (rdo_mn07) {
            case R.id.ms07a:
                var_mn07 = "1";
                break;
            case R.id.ms07b:
                var_mn07 = "2";
                break;
        }


        rdo_mn08 = ms08.getCheckedRadioButtonId();

        switch (rdo_mn08) {
            case R.id.ms08a:
                var_mn08 = "1";
                break;
            case R.id.ms08b:
                var_mn08 = "2";
                break;
        }


        rdo_mn09 = ms09.getCheckedRadioButtonId();

        switch (rdo_mn09) {
            case R.id.ms09a:
                var_mn09 = "1";
                break;
            case R.id.ms09b:
                var_mn09 = "2";
                break;
        }


        rdo_mn010 = ms10.getCheckedRadioButtonId();

        switch (rdo_mn010) {
            case R.id.ms10a:
                var_mn010 = "1";
                break;
            case R.id.ms10b:
                var_mn010 = "2";
                break;
        }


        rdo_mn011 = ms11.getCheckedRadioButtonId();

        switch (rdo_mn011) {
            case R.id.ms11a:
                var_mn011 = "1";
                break;
            case R.id.ms11b:
                var_mn011 = "2";
                break;
        }


        rdo_mn012 = ms12.getCheckedRadioButtonId();

        switch (rdo_mn012) {
            case R.id.ms12a:
                var_mn012 = "1";
                break;
            case R.id.ms12b:
                var_mn012 = "2";
                break;
        }


        rdo_mn013 = ms13.getCheckedRadioButtonId();

        switch (rdo_mn013) {
            case R.id.ms13a:
                var_mn013 = "1";
                break;
            case R.id.ms13b:
                var_mn013 = "2";
                break;
        }


        rdo_mn014 = ms14.getCheckedRadioButtonId();

        switch (rdo_mn014) {
            case R.id.ms14a:
                var_mn014 = "1";
                break;
            case R.id.ms14b:
                var_mn014 = "2";
                break;
        }


        rdo_mn015 = ms15.getCheckedRadioButtonId();

        switch (rdo_mn015) {
            case R.id.ms15a:
                var_mn015 = "1";
                break;
            case R.id.ms15b:
                var_mn015 = "2";
                break;
        }


        rdo_mn016 = ms16.getCheckedRadioButtonId();

        switch (rdo_mn016) {
            case R.id.ms16a:
                var_mn016 = "1";
                break;
            case R.id.ms16b:
                var_mn016 = "2";
                break;
        }


        rdo_mn017 = ms17.getCheckedRadioButtonId();

        switch (rdo_mn017) {
            case R.id.ms17a:
                var_mn017 = "1";
                break;
            case R.id.ms17b:
                var_mn017 = "2";
                break;
        }


        rdo_mn018 = ms18.getCheckedRadioButtonId();

        switch (rdo_mn018) {
            case R.id.ms18a:
                var_mn018 = "1";
                break;
            case R.id.ms18b:
                var_mn018 = "2";
                break;
        }


        rdo_mn019 = ms19.getCheckedRadioButtonId();

        switch (rdo_mn019) {
            case R.id.ms19a:
                var_mn019 = "1";
                break;
            case R.id.ms19b:
                var_mn019 = "2";
                break;
        }


        rdo_mn020 = ms20.getCheckedRadioButtonId();

        switch (rdo_mn020) {
            case R.id.ms20a:
                var_mn020 = "1";
                break;
            case R.id.ms20b:
                var_mn020 = "2";
                break;
        }


        js.put("ms01", var_mn01);
        js.put("ms02", var_mn02);
        js.put("ms03", var_mn03);
        js.put("ms04", var_mn04);
        js.put("ms05", var_mn05);
        js.put("ms06", var_mn06);
        js.put("ms07", var_mn07);
        js.put("ms08", var_mn08);
        js.put("ms09", var_mn09);
        js.put("ms10", var_mn010);
        js.put("ms11", var_mn011);
        js.put("ms12", var_mn012);
        js.put("ms13", var_mn013);
        js.put("ms14", var_mn014);
        js.put("ms15", var_mn015);
        js.put("ms16", var_mn016);
        js.put("ms17", var_mn017);
        js.put("ms18", var_mn018);
        js.put("ms19", var_mn019);
        js.put("ms20", var_mn020);

        return true;
    }


    private boolean ValidateForm() {

        rdo_mn01 = ms01.getCheckedRadioButtonId();

        switch (rdo_mn01) {
            case R.id.ms01a:
                var_mn01 = "1";
                break;
            case R.id.ms01b:
                var_mn01 = "2";
                break;
        }

        if (rdo_mn01 == -1) {
            ms01a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms01), Toast.LENGTH_LONG).show();
            ms01a.requestFocus();
            return false;
        } else {
            ms01a.setError(null);
        }


        rdo_mn02 = ms02.getCheckedRadioButtonId();

        switch (rdo_mn02) {
            case R.id.ms02a:
                var_mn02 = "1";
                break;
            case R.id.ms02b:
                var_mn02 = "2";
                break;
        }

        if (rdo_mn02 == -1) {
            ms02a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms02), Toast.LENGTH_LONG).show();
            ms02a.requestFocus();
            return false;
        } else {
            ms02a.setError(null);
        }


        rdo_mn03 = ms03.getCheckedRadioButtonId();

        switch (rdo_mn03) {
            case R.id.ms03a:
                var_mn03 = "1";
                break;
            case R.id.ms03b:
                var_mn03 = "2";
                break;
        }

        if (rdo_mn03 == -1) {
            ms03a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms03), Toast.LENGTH_LONG).show();
            ms03a.requestFocus();
            return false;
        } else {
            ms03a.setError(null);
        }


        rdo_mn04 = ms04.getCheckedRadioButtonId();

        switch (rdo_mn04) {
            case R.id.ms04a:
                var_mn04 = "1";
                break;
            case R.id.ms04b:
                var_mn04 = "2";
                break;
        }

        if (rdo_mn04 == -1) {
            ms04a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms04), Toast.LENGTH_LONG).show();
            ms04a.requestFocus();
            return false;
        } else {
            ms04a.setError(null);
        }


        rdo_mn05 = ms05.getCheckedRadioButtonId();

        switch (rdo_mn05) {
            case R.id.ms05a:
                var_mn05 = "1";
                break;
            case R.id.ms05b:
                var_mn05 = "2";
                break;
        }

        if (rdo_mn05 == -1) {
            ms05a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms05), Toast.LENGTH_LONG).show();
            ms05a.requestFocus();
            return false;
        } else {
            ms05a.setError(null);
        }


        rdo_mn06 = ms06.getCheckedRadioButtonId();

        switch (rdo_mn06) {
            case R.id.ms06a:
                var_mn06 = "1";
                break;
            case R.id.ms06b:
                var_mn06 = "2";
                break;
        }

        if (rdo_mn06 == -1) {
            ms06a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms06), Toast.LENGTH_LONG).show();
            ms06a.requestFocus();
            return false;
        } else {
            ms06a.setError(null);
        }


        rdo_mn07 = ms07.getCheckedRadioButtonId();

        switch (rdo_mn07) {
            case R.id.ms07a:
                var_mn07 = "1";
                break;
            case R.id.ms07b:
                var_mn07 = "2";
                break;
        }

        if (rdo_mn07 == -1) {
            ms07a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms07), Toast.LENGTH_LONG).show();
            ms07a.requestFocus();
            return false;
        } else {
            ms07a.setError(null);
        }


        rdo_mn08 = ms08.getCheckedRadioButtonId();

        switch (rdo_mn08) {
            case R.id.ms08a:
                var_mn08 = "1";
                break;
            case R.id.ms08b:
                var_mn08 = "2";
                break;
        }

        if (rdo_mn08 == -1) {
            ms08a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms08), Toast.LENGTH_LONG).show();
            ms08a.requestFocus();
            return false;
        } else {
            ms08a.setError(null);
        }


        rdo_mn09 = ms09.getCheckedRadioButtonId();

        switch (rdo_mn09) {
            case R.id.ms09a:
                var_mn09 = "1";
                break;
            case R.id.ms09b:
                var_mn09 = "2";
                break;
        }

        if (rdo_mn09 == -1) {
            ms09a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms09), Toast.LENGTH_LONG).show();
            ms09a.requestFocus();
            return false;
        } else {
            ms09a.setError(null);
        }


        rdo_mn010 = ms10.getCheckedRadioButtonId();

        switch (rdo_mn010) {
            case R.id.ms10a:
                var_mn010 = "1";
                break;
            case R.id.ms10b:
                var_mn010 = "2";
                break;
        }

        if (rdo_mn010 == -1) {
            ms10a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms10), Toast.LENGTH_LONG).show();
            ms10a.requestFocus();
            return false;
        } else {
            ms10a.setError(null);
        }


        rdo_mn011 = ms11.getCheckedRadioButtonId();

        switch (rdo_mn011) {
            case R.id.ms11a:
                var_mn011 = "1";
                break;
            case R.id.ms11b:
                var_mn011 = "2";
                break;
        }

        if (rdo_mn011 == -1) {
            ms11a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms11), Toast.LENGTH_LONG).show();
            ms11a.requestFocus();
            return false;
        } else {
            ms11a.setError(null);
        }


        rdo_mn012 = ms12.getCheckedRadioButtonId();

        switch (rdo_mn012) {
            case R.id.ms12a:
                var_mn012 = "1";
                break;
            case R.id.ms12b:
                var_mn012 = "2";
                break;
        }

        if (rdo_mn012 == -1) {
            ms12a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms12), Toast.LENGTH_LONG).show();
            ms12a.requestFocus();
            return false;
        } else {
            ms12a.setError(null);
        }


        rdo_mn013 = ms13.getCheckedRadioButtonId();

        switch (rdo_mn013) {
            case R.id.ms13a:
                var_mn013 = "1";
                break;
            case R.id.ms13b:
                var_mn013 = "2";
                break;
        }

        if (rdo_mn013 == -1) {
            ms13a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms13), Toast.LENGTH_LONG).show();
            ms13a.requestFocus();
            return false;
        } else {
            ms13a.setError(null);
        }


        rdo_mn014 = ms14.getCheckedRadioButtonId();

        switch (rdo_mn014) {
            case R.id.ms14a:
                var_mn014 = "1";
                break;
            case R.id.ms14b:
                var_mn014 = "2";
                break;
        }

        if (rdo_mn014 == -1) {
            ms14a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms14), Toast.LENGTH_LONG).show();
            ms14a.requestFocus();
            return false;
        } else {
            ms14a.setError(null);
        }


        rdo_mn015 = ms15.getCheckedRadioButtonId();

        switch (rdo_mn015) {
            case R.id.ms15a:
                var_mn015 = "1";
                break;
            case R.id.ms15b:
                var_mn015 = "2";
                break;
        }

        if (rdo_mn015 == -1) {
            ms15a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms15), Toast.LENGTH_LONG).show();
            ms15a.requestFocus();
            return false;
        } else {
            ms15a.setError(null);
        }


        rdo_mn016 = ms16.getCheckedRadioButtonId();

        switch (rdo_mn016) {
            case R.id.ms16a:
                var_mn016 = "1";
                break;
            case R.id.ms16b:
                var_mn016 = "2";
                break;
        }

        if (rdo_mn016 == -1) {
            ms16a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms16), Toast.LENGTH_LONG).show();
            ms16a.requestFocus();
            return false;
        } else {
            ms16a.setError(null);
        }


        rdo_mn017 = ms17.getCheckedRadioButtonId();

        switch (rdo_mn017) {
            case R.id.ms17a:
                var_mn017 = "1";
                break;
            case R.id.ms17b:
                var_mn017 = "2";
                break;
        }

        if (rdo_mn017 == -1) {
            ms17a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms17), Toast.LENGTH_LONG).show();
            ms17a.requestFocus();
            return false;
        } else {
            ms17a.setError(null);
        }


        rdo_mn018 = ms18.getCheckedRadioButtonId();

        switch (rdo_mn018) {
            case R.id.ms18a:
                var_mn018 = "1";
                break;
            case R.id.ms18b:
                var_mn018 = "2";
                break;
        }

        if (rdo_mn018 == -1) {
            ms18a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms18), Toast.LENGTH_LONG).show();
            ms18a.requestFocus();
            return false;
        } else {
            ms18a.setError(null);
        }


        rdo_mn019 = ms19.getCheckedRadioButtonId();

        switch (rdo_mn019) {
            case R.id.ms19a:
                var_mn019 = "1";
                break;
            case R.id.ms19b:
                var_mn019 = "2";
                break;
        }

        if (rdo_mn019 == -1) {
            ms19a.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "ERROR(empty): " + getString(R.string.ms19), Toast.LENGTH_LONG).show();
            ms19a.requestFocus();
            return false;
        } else {
            ms19a.setError(null);
        }


        rdo_mn020 = ms20.getCheckedRadioButtonId();

        switch (rdo_mn020) {
            case R.id.ms20a:
                var_mn020 = "1";
                break;
            case R.id.ms20b:
                var_mn020 = "2";
                break;
        }

        if (rdo_mn020 == -1) {
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