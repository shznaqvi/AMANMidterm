package edu.aku.hassannaqvi.amanmidterm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class BirthsDeathsActivity extends AppCompatActivity {

    private static final String TAG = BirthsDeathsActivity.class.getSimpleName();
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @BindView(R.id.bd01s)
    EditText bd01s;
    @BindView(R.id.fldGrpbd01)
    LinearLayout fldGrpbd01;
    @BindView(R.id.bd01dod1)
    DatePickerInputEditText bd01dod1;
    @BindView(R.id.bd01dod2)
    DatePickerInputEditText bd01dod2;
    @BindView(R.id.bd02s)
    EditText bd02s;
    @BindView(R.id.fldGrpbd02)
    LinearLayout fldGrpbd02;
    @BindView(R.id.bd02dod1)
    DatePickerInputEditText bd02dod1;
    @BindView(R.id.bd02dod2)
    DatePickerInputEditText bd02dod2;
    @BindView(R.id.bd03s)
    EditText bd03s;
    @BindView(R.id.fldGrpbd03)
    LinearLayout fldGrpbd03;
    @BindView(R.id.bd03dob1)
    DatePickerInputEditText bd03dob1;
    @BindView(R.id.bd03dob2)
    DatePickerInputEditText bd03dob2;
    @BindView(R.id.bd03dob3)
    DatePickerInputEditText bd03dob3;
    @BindView(R.id.bd04s)
    EditText bd04s;
    @BindView(R.id.fldGrpbd04)
    LinearLayout fldGrpbd04;
    @BindView(R.id.bd04dob1)
    DatePickerInputEditText bd04dob1;
    @BindView(R.id.bd04dod1)
    DatePickerInputEditText bd04dod1;
    @BindView(R.id.bd04dob2)
    DatePickerInputEditText bd04dob2;
    @BindView(R.id.bd04dod2)
    DatePickerInputEditText bd04dod2;
    @BindView(R.id.bd05s)
    EditText bd05s;
    @BindView(R.id.fldGrpbd05)
    LinearLayout fldGrpbd05;
    @BindView(R.id.bd05dob1)
    DatePickerInputEditText bd05dob1;
    @BindView(R.id.bd05dod1)
    DatePickerInputEditText bd05dod1;
    @BindView(R.id.fldGrpbd05dob2)
    LinearLayout fldGrpbd05dob2;
    @BindView(R.id.bd05dob2)
    DatePickerInputEditText bd05dob2;
    @BindView(R.id.bd05dod2)
    DatePickerInputEditText bd05dod2;
    @BindView(R.id.bd06s)
    EditText bd06s;
    @BindView(R.id.fldGrpbd06)
    LinearLayout fldGrpbd06;
    @BindView(R.id.bd06dob1)
    DatePickerInputEditText bd06dob1;
    @BindView(R.id.bd06dod1)
    DatePickerInputEditText bd06dod1;
    @BindView(R.id.fldGrpbd06dob2)
    LinearLayout fldGrpbd06dob2;
    @BindView(R.id.bd06dob2)
    DatePickerInputEditText bd06dob2;
    @BindView(R.id.bd06dod2)
    DatePickerInputEditText bd06dod2;
    @BindView(R.id.bd07s)
    EditText bd07s;
    @BindView(R.id.fldGrpbd07)
    LinearLayout fldGrpbd07;
    @BindView(R.id.bd07dob1)
    DatePickerInputEditText bd07dob1;
    @BindView(R.id.bd07dod1)
    DatePickerInputEditText bd07dod1;
    @BindView(R.id.fldGrpbd07dob2)
    LinearLayout fldGrpbd07dob2;
    @BindView(R.id.bd07dob2)
    DatePickerInputEditText bd07dob2;
    @BindView(R.id.bd07dod2)
    DatePickerInputEditText bd07dod2;
    @BindView(R.id.bd08s)
    EditText bd08s;
    @BindView(R.id.fldGrpbd08)
    LinearLayout fldGrpbd08;
    @BindView(R.id.bd08dob1)
    DatePickerInputEditText bd08dob1;
    @BindView(R.id.bd08dod1)
    DatePickerInputEditText bd08dod1;
    @BindView(R.id.fldGrpbd08dob2)
    LinearLayout fldGrpbd08dob2;
    @BindView(R.id.bd08dob2)
    DatePickerInputEditText bd08dob2;
    @BindView(R.id.bd08dod2)
    DatePickerInputEditText bd08dod2;
    @BindView(R.id.fldGrpbd04dob2)
    LinearLayout fldGrpbd04dob2;
    String dateToday;
    String maxDateyear;
    String maxDate5Years;
    String maxDate49Years;
    String maxDate15Years;
    Calendar now = Calendar.getInstance();
    @BindViews({R.id.bd01dod1, R.id.bd01dod2, R.id.bd02dod1, R.id.bd02dod2, R.id.bd03dob1, R.id.bd03dob2, R.id.bd03dob3,
            R.id.bd04dob1, R.id.bd04dob2, R.id.bd04dod1, R.id.bd04dod2, R.id.bd05dob1, R.id.bd05dob2, R.id.bd05dod1,
            R.id.bd05dod2, R.id.bd06dob1, R.id.bd06dob2, R.id.bd06dod1, R.id.bd06dod2, R.id.bd07dob1, R.id.bd07dob2,
            R.id.bd07dod1, R.id.bd07dod2, R.id.bd08dob1, R.id.bd08dob2, R.id.bd08dod1, R.id.bd08dod2})
    List<DatePickerInputEditText> bddates;

    @BindViews({R.id.bd01dod1, R.id.bd01dod2, R.id.bd02dod1, R.id.bd02dod2,
            R.id.bd04dod1, R.id.bd04dod2, R.id.bd05dod1,
            R.id.bd05dod2, R.id.bd06dod1, R.id.bd06dod2,
            R.id.bd07dod1, R.id.bd07dod2, R.id.bd08dod1, R.id.bd08dod2})
    List<DatePickerInputEditText> bddateofDeath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_births_deaths);
        ButterKnife.bind(this);

        //dateToday = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        maxDateyear = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_YEAR));
        maxDate5Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_5Years));
        maxDate49Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_49Years));
        maxDate15Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_15Years));

        for (DatePickerInputEditText de : bddates) {
            de.setManager(getSupportFragmentManager());
            de.setMaxDate(dateToday);
            de.setMinDate(maxDateyear);

        }


        bd07dob1.setMinDate(maxDate5Years);
        bd07dob1.setMaxDate(maxDateyear);
        bd07dob2.setMinDate(maxDate5Years);
        bd07dob2.setMaxDate(maxDateyear);
        bd08dob1.setMaxDate(maxDate15Years);
        bd08dob1.setMinDate(maxDate49Years);
        bd08dob2.setMaxDate(maxDate15Years);
        bd08dob2.setMinDate(maxDate49Years);
        bd08dod1.setMaxDate(dateToday);
        bd08dod1.setMinDate(maxDateyear);
        bd08dod2.setMaxDate(dateToday);
        bd08dod2.setMinDate(maxDateyear);

        bd04dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                bd04dod1.setMinDate(bd04dob1.getText().toString());
                Calendar cal = getCalendarDate(bd04dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 7);
                bd04dod1.setMaxDate(sdf.format(cal.getTime()));
                bd04dod1.setEnabled(true);


            }
        });

        bd04dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                bd04dod2.setMinDate(bd04dob2.getText().toString());
                Calendar cal = getCalendarDate(bd04dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 7);
                bd04dod2.setMaxDate(sdf.format(cal.getTime()));
                bd04dod2.setEnabled(true);


            }
        });

        bd05dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(bd05dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 8);
                bd05dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 20);
                bd05dod1.setMaxDate(sdf.format(cal.getTime()));
                bd05dod1.setEnabled(true);

            }
        });

        bd05dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(bd05dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 8);
                bd05dod2.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 20);
                bd05dod2.setMaxDate(sdf.format(cal.getTime()));
                bd05dod2.setEnabled(true);

            }
        });

        bd06dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(bd06dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                bd06dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                bd06dod1.setMaxDate(sdf.format(cal.getTime()));
                bd06dod1.setEnabled(true);

            }
        });


        bd06dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(bd06dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                bd06dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                bd06dod1.setMaxDate(sdf.format(cal.getTime()));
                bd06dod1.setEnabled(true);

            }
        });

        bd06dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(bd06dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                bd06dod2.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                bd06dod2.setMaxDate(sdf.format(cal.getTime()));
                bd06dod2.setEnabled(true);

            }
        });

        bd07dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                bd07dod1.setMinDate(maxDateyear);
                bd07dod1.setEnabled(true);

            }
        });

        bd01dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd01dod1.onFocusChange(v, true);
            }
        });

        bd01dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd01dod2.onFocusChange(v, true);
            }
        });

        bd02dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd02dod1.onFocusChange(v, true);
            }
        });

        bd02dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd02dod2.onFocusChange(v, true);
            }
        });

        bd03dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd03dob1.onFocusChange(v, true);
            }
        });

        bd03dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd03dob2.onFocusChange(v, true);
            }
        });

        bd03dob3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd03dob3.onFocusChange(v, true);
            }
        });

        bd04dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd04dob1.onFocusChange(v, true);
            }
        });


        bd04dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd04dob2.onFocusChange(v, true);
            }
        });

        bd04dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd04dod1.onFocusChange(v, true);

            }
        });

        bd04dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd04dod2.onFocusChange(v, true);
            }
        });

        bd05dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd05dob1.onFocusChange(v, true);
            }
        });

        bd05dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd05dob2.onFocusChange(v, true);
            }
        });

        bd05dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd05dod1.onFocusChange(v, true);
            }
        });

        bd05dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd05dod2.onFocusChange(v, true);
            }
        });

        bd06dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd06dob1.onFocusChange(v, true);
            }
        });

        bd06dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd06dob2.onFocusChange(v, true);
            }
        });

        bd06dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd06dod1.onFocusChange(v, true);
            }
        });

        bd06dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd06dod2.onFocusChange(v, true);
            }
        });

        bd07dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd07dob1.onFocusChange(v, true);
            }
        });

        bd07dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd07dob2.onFocusChange(v, true);
            }
        });

        bd07dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd07dod1.onFocusChange(v, true);
            }
        });

        bd07dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd07dod2.onFocusChange(v, true);
            }
        });

        bd08dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd08dob1.onFocusChange(v, true);
            }
        });

        bd08dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd08dob2.onFocusChange(v, true);
            }
        });

        bd08dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd08dod1.onFocusChange(v, true);
            }
        });

        bd08dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd08dod2.onFocusChange(v, true);
            }
        });


    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", true);
                startActivity(endSec);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        /*if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
*/
        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
            /*} else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sm = new JSONObject();
        JSONObject sn = new JSONObject();

        sn.put("bd01s", bd01s.getText().toString());
        sn.put("bd01dod1", bd01dod1.getText().toString());
        sn.put("bd01dod2", bd01dod2.getText().toString());
        sn.put("bd02s", bd02s.getText().toString());
        sn.put("bd02dod1", bd02dod1.getText().toString());
        sn.put("bd02dod2", bd02dod2.getText().toString());

        sn.put("bd03s", bd03s.getText().toString());
        sn.put("bd03dob1", bd03dob1.getText().toString());
        sn.put("bd03dob2", bd03dob2.getText().toString());
        sn.put("bd03dob3", bd03dob3.getText().toString());

        sn.put("bd04s", bd04s.getText().toString());
        sn.put("bd04dob1", bd04dob1.getText().toString());
        sn.put("bd04dob2", bd04dob2.getText().toString());
        sn.put("bd04dod1", bd04dod1.getText().toString());
        sn.put("bd04dod2", bd04dod2.getText().toString());

        sn.put("bd05s", bd05s.getText().toString());
        sn.put("bd05dob1", bd05dob1.getText().toString());
        sn.put("bd05dob2", bd05dob2.getText().toString());
        sn.put("bd05dod1", bd05dod1.getText().toString());
        sn.put("bd05dod2", bd05dod2.getText().toString());

        sn.put("bd06s", bd06s.getText().toString());
        sn.put("bd06dob1", bd06dob1.getText().toString());
        sn.put("bd06dob2", bd06dob2.getText().toString());
        sn.put("bd06dod1", bd06dod1.getText().toString());
        sn.put("bd06dod2", bd06dod2.getText().toString());
        sn.put("bd07s", bd07s.getText().toString());
        sn.put("bd07dob1", bd07dob1.getText().toString());
        sn.put("bd07dob2", bd07dob2.getText().toString());
        sn.put("bd07dod1", bd07dod1.getText().toString());
        sn.put("bd07dod2", bd07dod2.getText().toString());
        sn.put("bd08s", bd08s.getText().toString());
        sn.put("bd08dob1", bd08dob1.getText().toString());
        sn.put("bd08dob2", bd08dob2.getText().toString());
        sn.put("bd08dod1", bd08dod1.getText().toString());
        sn.put("bd08dod2", bd08dod2.getText().toString());


        //AppMain.fc.setsN(String.valueOf(sn));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section M", Toast.LENGTH_SHORT).show();

        //======================== Q 1 ==========================

        if (bd01s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd01), Toast.LENGTH_SHORT).show();
            bd01s.setError("This data is Required!");
            Log.i(TAG, "bd01s: This data is Required!");
            return false;
        } else {
            bd01s.setError(null);
        }

        if (Integer.parseInt(bd01s.getText().toString().isEmpty() ? "0" : bd01s.getText().toString()) == 1) {
            if (bd01dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd01), Toast.LENGTH_SHORT).show();
                bd01dod1.setError("This data is Required!");
                Log.i(TAG, "bd01dod1: This data is Required!");
                return false;
            } else {
                bd01dod1.setError(null);
            }
        }

        if (Integer.parseInt(bd01s.getText().toString().isEmpty() ? "0" : bd01s.getText().toString()) == 2) {
            if (bd01dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd01), Toast.LENGTH_SHORT).show();
                bd01dod2.setError("This data is Required!");
                Log.i(TAG, "bd01dod2: This data is Required!");
                return false;
            } else {
                bd01dod2.setError(null);
            }
        }

        //======================== Q 2 ==========================

        if (bd02s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd02), Toast.LENGTH_SHORT).show();
            bd02s.setError("This data is Required!");
            Log.i(TAG, "bd02s: This data is Required!");
            return false;
        } else {
            bd02s.setError(null);
        }
        if (Integer.valueOf(bd02s.getText().toString()) == 1) {
            if (bd02dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd02), Toast.LENGTH_SHORT).show();
                bd02dod1.setError("This data is Required!");
                Log.i(TAG, "bd02dod1: This data is Required!");
                return false;
            } else {
                bd02dod1.setError(null);
            }
        }

        if (Integer.valueOf(bd02s.getText().toString()) == 2) {
            if (bd02dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd02), Toast.LENGTH_SHORT).show();
                bd02dod2.setError("This data is Required!");
                Log.i(TAG, "bd02dod2: This data is Required!");
                return false;
            } else {
                bd02dod2.setError(null);
            }
        }

        //======================== Q 3 ==========================

        if (bd03s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd03), Toast.LENGTH_SHORT).show();
            bd03s.setError("This data is Required!");
            Log.i(TAG, "bd03s: This data is Required!");
            return false;
        } else {
            bd03s.setError(null);
        }

        if (Integer.valueOf(bd03s.getText().toString()) == 1) {
            if (bd03dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd03), Toast.LENGTH_SHORT).show();
                bd03dob1.setError("This data is Required!");
                Log.i(TAG, "bd03dob1: This data is Required!");
                return false;
            } else {
                bd03dob1.setError(null);
            }
        }

        if (Integer.valueOf(bd03s.getText().toString()) == 2) {
            if (bd03dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd03), Toast.LENGTH_SHORT).show();
                bd03dob2.setError("This data is Required!");
                Log.i(TAG, "bd03dob2: This data is Required!");
                return false;
            } else {
                bd03dob2.setError(null);
            }
        }

        if (Integer.valueOf(bd03s.getText().toString()) == 3) {
            if (bd03dob3.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd03), Toast.LENGTH_SHORT).show();
                bd03dob3.setError("This data is Required!");
                Log.i(TAG, "bd03dob3: This data is Required!");
                return false;
            } else {
                bd03dob3.setError(null);
            }
        }

        //================ Q4============

        if (bd04s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd04), Toast.LENGTH_SHORT).show();
            bd04s.setError("This data is Required!");
            Log.i(TAG, "bd04s: This data is Required!");
            return false;
        } else {
            bd04s.setError(null);
        }

        if (Integer.valueOf(bd04s.getText().toString()) == 1) {
            if (bd04dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd04), Toast.LENGTH_SHORT).show();
                bd04dob1.setError("This data is Required!");
                Log.i(TAG, "bd04dob1: This data is Required!");
                return false;
            } else {
                bd04dob1.setError(null);
            }

            if (bd04dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd04), Toast.LENGTH_SHORT).show();
                bd04dod1.setError("This data is Required!");
                Log.i(TAG, "bd04dod1: This data is Required!");
                return false;
            } else {
                bd04dod1.setError(null);
            }
        }

        if (Integer.valueOf(bd04s.getText().toString()) == 2) {
            if (bd04dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd04), Toast.LENGTH_SHORT).show();
                bd04dob2.setError("This data is Required!");
                Log.i(TAG, "bd04dob2: This data is Required!");
                return false;
            } else {
                bd04dob2.setError(null);
            }

            if (bd04dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd04), Toast.LENGTH_SHORT).show();
                bd04dod2.setError("This data is Required!");
                Log.i(TAG, "bd04dod2: This data is Required!");
                return false;
            } else {
                bd04dod2.setError(null);
            }
        }


        //================ Q5============

        if (bd05s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd05), Toast.LENGTH_SHORT).show();
            bd05s.setError("This data is Required!");
            Log.i(TAG, "bd05s: This data is Required!");
            return false;
        } else {
            bd05s.setError(null);
        }

        if (Integer.valueOf(bd05s.getText().toString()) == 1) {
            if (bd05dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd05), Toast.LENGTH_SHORT).show();
                bd05dob1.setError("This data is Required!");
                Log.i(TAG, "bd05dob1: This data is Required!");
                return false;
            } else {
                bd05dob1.setError(null);
            }

            if (bd05dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd05), Toast.LENGTH_SHORT).show();
                bd05dod1.setError("This data is Required!");
                Log.i(TAG, "bd05dod1: This data is Required!");
                return false;
            } else {
                bd05dod1.setError(null);
            }
        }

        if (Integer.valueOf(bd05s.getText().toString()) == 2) {
            if (bd05dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd05), Toast.LENGTH_SHORT).show();
                bd05dob2.setError("This data is Required!");
                Log.i(TAG, "bd05dob2: This data is Required!");
                return false;
            } else {
                bd05dob2.setError(null);
            }

            if (bd05dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd05), Toast.LENGTH_SHORT).show();
                bd05dod2.setError("This data is Required!");
                Log.i(TAG, "bd05dod2: This data is Required!");
                return false;
            } else {
                bd05dod2.setError(null);
            }
        }

        //================ Q6============

        if (bd06s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd06), Toast.LENGTH_SHORT).show();
            bd06s.setError("This data is Required!");
            Log.i(TAG, "bd06s: This data is Required!");
            return false;
        } else {
            bd06s.setError(null);
        }

        if (Integer.valueOf(bd06s.getText().toString()) == 1) {
            if (bd04dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd06), Toast.LENGTH_SHORT).show();
                bd06dob1.setError("This data is Required!");
                Log.i(TAG, "bd06dob1: This data is Required!");
                return false;
            } else {
                bd06dob1.setError(null);
            }

            if (bd06dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd06), Toast.LENGTH_SHORT).show();
                bd06dod1.setError("This data is Required!");
                Log.i(TAG, "bd06dod1: This data is Required!");
                return false;
            } else {
                bd06dod1.setError(null);
            }
        }

        if (Integer.valueOf(bd06s.getText().toString()) == 2) {
            if (bd06dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd06), Toast.LENGTH_SHORT).show();
                bd06dob2.setError("This data is Required!");
                Log.i(TAG, "bd06dob2: This data is Required!");
                return false;
            } else {
                bd06dob2.setError(null);
            }

            if (bd06dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd06), Toast.LENGTH_SHORT).show();
                bd06dod2.setError("This data is Required!");
                Log.i(TAG, "bd06dod2: This data is Required!");
                return false;
            } else {
                bd06dod2.setError(null);
            }
        }

        //================ Q7============

        if (bd07s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd07), Toast.LENGTH_SHORT).show();
            bd07s.setError("This data is Required!");
            Log.i(TAG, "bd07s: This data is Required!");
            return false;
        } else {
            bd07s.setError(null);
        }

        if (Integer.valueOf(bd07s.getText().toString()) == 1) {
            if (bd07dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd07), Toast.LENGTH_SHORT).show();
                bd07dob1.setError("This data is Required!");
                Log.i(TAG, "bd07dob1: This data is Required!");
                return false;
            } else {
                bd07dob1.setError(null);
            }

            if (bd07dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd07), Toast.LENGTH_SHORT).show();
                bd07dod1.setError("This data is Required!");
                Log.i(TAG, "bd07dod1: This data is Required!");
                return false;
            } else {
                bd07dod1.setError(null);
            }
        }

        if (Integer.valueOf(bd07s.getText().toString()) == 2) {
            if (bd07dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd07), Toast.LENGTH_SHORT).show();
                bd07dob2.setError("This data is Required!");
                Log.i(TAG, "bd07dob2: This data is Required!");
                return false;
            } else {
                bd07dob2.setError(null);
            }

            if (bd07dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd07), Toast.LENGTH_SHORT).show();
                bd07dod2.setError("This data is Required!");
                Log.i(TAG, "bd07dod2: This data is Required!");
                return false;
            } else {
                bd07dod2.setError(null);
            }
        }

        //================ Q8============

        if (bd08s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd08), Toast.LENGTH_SHORT).show();
            bd08s.setError("This data is Required!");
            Log.i(TAG, "bd01s: This data is Required!");
            return false;
        } else {
            bd08s.setError(null);
        }

        if (Integer.valueOf(bd08s.getText().toString()) == 1) {
            if (bd08dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd08), Toast.LENGTH_SHORT).show();
                bd08dob1.setError("This data is Required!");
                Log.i(TAG, "bd08dob1: This data is Required!");
                return false;
            } else {
                bd08dob1.setError(null);
            }

            if (bd08dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd08), Toast.LENGTH_SHORT).show();
                bd08dod1.setError("This data is Required!");
                Log.i(TAG, "bd08dod1: This data is Required!");
                return false;
            } else {
                bd08dod1.setError(null);
            }
        }

        if (Integer.valueOf(bd08s.getText().toString()) == 2) {
            if (bd08dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd08), Toast.LENGTH_SHORT).show();
                bd08dob2.setError("This data is Required!");
                Log.i(TAG, "bd08dob2: This data is Required!");
                return false;
            } else {
                bd08dob2.setError(null);
            }

            if (bd08dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bd08), Toast.LENGTH_SHORT).show();
                bd08dod2.setError("This data is Required!");
                Log.i(TAG, "bd08dod2: This data is Required!");
                return false;
            } else {
                bd08dod2.setError(null);
            }
        }


        return true;

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);
/*
//        int updcount = db.updateSM();
        int updcount = db.updateSM() == 1 ?
                (db.updateSN() == 1 ? 1 : db.updateSN()) : db.updateSM();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
         */
        return true;
    }
    // }

    public Calendar getCalendarDate(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = sdf.parse(value);
            calendar.setTime(date);
            return calendar;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar;
    }




}
