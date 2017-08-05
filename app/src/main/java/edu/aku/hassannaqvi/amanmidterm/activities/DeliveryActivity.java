package edu.aku.hassannaqvi.amanmidterm.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class DeliveryActivity extends AppCompatActivity {

    private static final String TAG = DeliveryActivity.class.getSimpleName();


    @BindView(R.id.d01)
    RadioGroup d01;
    @BindView(R.id.d01a)
    RadioButton d01a;
    @BindView(R.id.d01b)
    RadioButton d01b;
    @BindView(R.id.d01c)
    RadioButton d01c;
    @BindView(R.id.d02)
    DatePickerInputEditText d02;
    @BindView(R.id.d03)
    RadioGroup d03;
    @BindView(R.id.d03a)
    RadioButton d03a;
    @BindView(R.id.d03b)
    RadioButton d03b;
    @BindView(R.id.d03f)
    RadioButton d03f;
    @BindView(R.id.d0388)
    RadioButton d0388;
    @BindView(R.id.d0388x)
    EditText d0388x;
    /*@BindView(R.id.d04)
    RadioGroup d04;*/
    @BindView(R.id.d04a)
    CheckBox d04a;
    @BindView(R.id.d04b)
    CheckBox d04b;
    @BindView(R.id.d04c)
    CheckBox d04c;
    @BindView(R.id.d04d)
    CheckBox d04d;
    @BindView(R.id.d04e)
    CheckBox d04e;
    @BindView(R.id.d04f)
    CheckBox d04f;
    @BindView(R.id.d0488)
    CheckBox d0488;
    @BindView(R.id.d0488x)
    EditText d0488x;
    @BindView(R.id.d05)
    RadioGroup d05;
    @BindView(R.id.d05a)
    RadioButton d05a;
    @BindView(R.id.d05b)
    RadioButton d05b;
    @BindView(R.id.d05c)
    RadioButton d05c;

    String dateToday;
    String maxDate2Years;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        ButterKnife.bind(this);

        dateToday = new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis());
        maxDate2Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((AppMain.MILLISECONDS_IN_YEAR) * 2));

        d02.setManager(getSupportFragmentManager());
        d02.setMaxDate(dateToday);
        d02.setMinDate(maxDate2Years);


        d0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    d0388x.setVisibility(View.VISIBLE);
                } else {
                    d0388x.setVisibility(View.GONE);
                    d0388x.setText(null);
                }
            }
        });

        d0488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    d0488x.setVisibility(View.VISIBLE);
                } else {
                    d0488x.setVisibility(View.GONE);
                    d0488x.setText(null);
                }
            }
        });

        d04f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (d04f.isChecked()) {

                    d04a.setEnabled(false);
                    d04a.setChecked(false);
                    d04b.setEnabled(false);
                    d04b.setChecked(false);
                    d04c.setEnabled(false);
                    d04c.setChecked(false);
                    d04d.setEnabled(false);
                    d04d.setChecked(false);
                    d04e.setEnabled(false);
                    d04e.setChecked(false);
                    d0488.setEnabled(false);
                    d0488.setChecked(false);
                    d0488x.setText(null);
                } else {
                    d04a.setEnabled(true);
                    d04b.setEnabled(true);
                    d04c.setEnabled(true);
                    d04d.setEnabled(true);
                    d04e.setEnabled(true);
                    d0488.setEnabled(true);

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
        /*Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);*/
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
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, PostpartumCareActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateDelivery();

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

        JSONObject s5b = new JSONObject();

        s5b.put("d01", d01a.isChecked() ? "1" : d01b.isChecked() ? "2" : d01c.isChecked() ? "3" : "0");
        s5b.put("d02", d02.getText().toString());

        // Radio Group
        s5b.put("d03", d03a.isChecked() ? "1" : d03b.isChecked() ? "2" : d03f.isChecked() ? "5" : d0388.isChecked() ? "88" : "0");
        // Edit Text
        s5b.put("d0388x", d0388x.getText().toString());

        s5b.put("d04a", d04a.isChecked() ? "1" : "0");
        s5b.put("d04b", d04b.isChecked() ? "2" : "0");
        s5b.put("d04c", d04c.isChecked() ? "3" : "0");
        s5b.put("d04d", d04d.isChecked() ? "4" : "0");
        s5b.put("d04e", d04e.isChecked() ? "5" : "0");
        s5b.put("d04f", d04f.isChecked() ? "6" : "0");
        s5b.put("d0488", d0488.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("d0488x", d0488x.getText().toString());

        // Radio Group
        s5b.put("d05", d05a.isChecked() ? "1" : d05b.isChecked() ? "2" : d05c.isChecked() ? "3" : "0");

        AppMain.outcome = d01.indexOfChild(findViewById(d01.getCheckedRadioButtonId())) + 1;

        AppMain.fc.setDelivery(String.valueOf(s5b));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (d01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d01), Toast.LENGTH_LONG).show();
            d01c.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "d01: This data is Required!");
            return false;
        } else {
            d01c.setError(null);
        }

        if (d02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d02), Toast.LENGTH_LONG).show();
            d02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "d02: This data is Required!");
            return false;
        } else {
            d02.setError(null);
        }


        // RadioGroup
        if (d03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d03), Toast.LENGTH_LONG).show();
            d0388.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "d03: This data is Required!");
            return false;
        } else {
            d0388.setError(null);
        }

        // Others / EditText Q 5.30
        if (d0388.isChecked() && d0388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d03) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            d0388x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "d0388: This data is Required!");
            return false;
        } else {
            d0388x.setError(null);
        }

        if (!(d04a.isChecked() || d04b.isChecked() || d04c.isChecked() || d04d.isChecked() || d04e.isChecked()
                || d04f.isChecked() || d0488.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d04), Toast.LENGTH_LONG).show();
            d0488.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "d04: This data is Required!");
            return false;
        } else {
            d0488.setError(null);
        }

        //if (d0488.isChecked()) {
            if (d0488.isChecked() && d0488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.d04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                d0488x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "d0488: This data is Required!");
                return false;
            } else {
                d0488x.setError(null);
            }

        //}
        // ===================== Q 5.38 ===========================
        // RadioGroup
        if (d05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d05), Toast.LENGTH_LONG).show();
            d05c.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "d05: This data is Required!");
            return false;
        } else {
            d05c.setError(null);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
