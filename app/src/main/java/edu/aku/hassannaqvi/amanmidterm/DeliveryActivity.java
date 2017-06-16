package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static edu.aku.hassannaqvi.amanmidterm.R.string.d03;

public class DeliveryActivity extends Activity {

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
    RadioGroup d02;
    @BindView(R.id.d02a)
    RadioButton d02a;
    @BindView(R.id.d02b)
    RadioButton d02b;
    @BindView(R.id.d02f)
    RadioButton d02f;
    @BindView(R.id.d0288)
    RadioButton d0288;
    @BindView(R.id.d0288x)
    EditText d0288x;
    @BindView(R.id.d03a)
    CheckBox d03a;
    @BindView(R.id.d03b)
    CheckBox d03b;
    @BindView(R.id.d03c)
    CheckBox d03c;
    @BindView(R.id.d03d)
    CheckBox d03d;
    @BindView(R.id.d03e)
    CheckBox d03e;
    @BindView(R.id.d03f)
    CheckBox d03f;
    @BindView(R.id.d0388)
    CheckBox d0388;
    @BindView(R.id.d0388x)
    EditText d0388x;
    @BindView(R.id.d04)
    RadioGroup d04;
    @BindView(R.id.d04a)
    RadioButton d04a;
    @BindView(R.id.d04b)
    RadioButton d04b;
    @BindView(R.id.d04c)
    RadioButton d04c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        ButterKnife.bind(this);

        d0288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    d0288x.setVisibility(View.VISIBLE);
                } else {
                    d0288x.setVisibility(View.GONE);
                    d0288x.setText(null);
                }
            }
        });

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

        d03f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (d03f.isChecked()) {

                    d03a.setEnabled(false);
                    d03a.setChecked(false);
                    d03b.setEnabled(false);
                    d03b.setChecked(false);
                    d03c.setEnabled(false);
                    d03c.setChecked(false);
                    d03d.setEnabled(false);
                    d03d.setChecked(false);
                    d03e.setEnabled(false);
                    d03e.setChecked(false);
                    d0388.setEnabled(false);
                    d0388.setChecked(false);
                    d0388x.setText(null);
                } else {
                    d03a.setEnabled(true);
                    d03b.setEnabled(true);
                    d03c.setEnabled(true);
                    d03d.setEnabled(true);
                    d03e.setEnabled(true);
                    d0388.setEnabled(true);

                }
            }
        });


    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
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

        /*int updcount = db.updateDelivery();

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

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject s5b = new JSONObject();

        s5b.put("d01", d01a.isChecked() ? "1" : d01b.isChecked() ? "2" : d01c.isChecked() ? "3" : "0");

        // Radio Group
        s5b.put("d02", d02a.isChecked() ? "1" : d02b.isChecked() ? "2" : d02f.isChecked() ? "5" : d0288.isChecked() ? "88" : "0");
        // Edit Text
        s5b.put("d0288x", d0288x.getText().toString());

        s5b.put("d03", d03a.isChecked() ? "1" : d03b.isChecked() ? "2" : d03c.isChecked() ? "3"
                : d03d.isChecked() ? "4" : d03e.isChecked() ? "5" : d0388.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("d0388x", d0388x.getText().toString());

        // Radio Group
        s5b.put("d04", d04a.isChecked() ? "1" : d04b.isChecked() ? "2" : d04c.isChecked() ? "3" : "0");

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


        // RadioGroup
        if (d02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d02), Toast.LENGTH_LONG).show();
            d0288.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "d02: This data is Required!");
            return false;
        } else {
            d0288.setError(null);
        }

        // Others / EditText Q 5.30
        if (d0288.isChecked() && d0288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d02) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            d0288x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "d0288: This data is Required!");
            return false;
        } else {
            d0288x.setError(null);
        }

        if (!(d03a.isChecked() || d03b.isChecked() || d03c.isChecked() || d03d.isChecked() || d03e.isChecked()
                || d03f.isChecked() || d0388.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(d03), Toast.LENGTH_LONG).show();
            d0388.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "d0388: This data is Required!");
            return false;
        } else {
            d0388.setError(null);
        }

        if (d0388.isChecked()) {
            if (d0388.isChecked() && d0388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(d03) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                d0388x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "d0388: This data is Required!");
                return false;
            } else {
                d0388x.setError(null);
            }

        }
        // ===================== Q 5.38 ===========================
        // RadioGroup
        if (d04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.d04), Toast.LENGTH_LONG).show();
            d04c.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "d04: This data is Required!");
            return false;
        } else {
            d04c.setError(null);
        }

        return true;
    }

}
