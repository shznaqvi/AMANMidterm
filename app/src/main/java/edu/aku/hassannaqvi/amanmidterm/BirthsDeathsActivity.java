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

    @BindView(R.id.crn01s)
    EditText crn01s;
    @BindView(R.id.fldGrpcrn01)
    LinearLayout fldGrpcrn01;
    @BindView(R.id.crn01dod1)
    DatePickerInputEditText crn01dod1;
    @BindView(R.id.crn01dod2)
    DatePickerInputEditText crn01dod2;
    @BindView(R.id.crn02s)
    EditText crn02s;
    @BindView(R.id.fldGrpcrn02)
    LinearLayout fldGrpcrn02;
    @BindView(R.id.crn02dod1)
    DatePickerInputEditText crn02dod1;
    @BindView(R.id.crn02dod2)
    DatePickerInputEditText crn02dod2;
    @BindView(R.id.crn03s)
    EditText crn03s;
    @BindView(R.id.fldGrpcrn03)
    LinearLayout fldGrpcrn03;
    @BindView(R.id.crn03dob1)
    DatePickerInputEditText crn03dob1;
    @BindView(R.id.crn03dob2)
    DatePickerInputEditText crn03dob2;
    @BindView(R.id.crn03dob3)
    DatePickerInputEditText crn03dob3;
    @BindView(R.id.crn04s)
    EditText crn04s;
    @BindView(R.id.fldGrpcrn04)
    LinearLayout fldGrpcrn04;
    @BindView(R.id.crn04dob1)
    DatePickerInputEditText crn04dob1;
    @BindView(R.id.crn04dod1)
    DatePickerInputEditText crn04dod1;
    @BindView(R.id.crn04dob2)
    DatePickerInputEditText crn04dob2;
    @BindView(R.id.crn04dod2)
    DatePickerInputEditText crn04dod2;
    @BindView(R.id.crn05s)
    EditText crn05s;
    @BindView(R.id.fldGrpcrn05)
    LinearLayout fldGrpcrn05;
    @BindView(R.id.crn05dob1)
    DatePickerInputEditText crn05dob1;
    @BindView(R.id.crn05dod1)
    DatePickerInputEditText crn05dod1;
    @BindView(R.id.fldGrpcrn05dob2)
    LinearLayout fldGrpcrn05dob2;
    @BindView(R.id.crn05dob2)
    DatePickerInputEditText crn05dob2;
    @BindView(R.id.crn05dod2)
    DatePickerInputEditText crn05dod2;
    @BindView(R.id.crn06s)
    EditText crn06s;
    @BindView(R.id.fldGrpcrn06)
    LinearLayout fldGrpcrn06;
    @BindView(R.id.crn06dob1)
    DatePickerInputEditText crn06dob1;
    @BindView(R.id.crn06dod1)
    DatePickerInputEditText crn06dod1;
    @BindView(R.id.fldGrpcrn06dob2)
    LinearLayout fldGrpcrn06dob2;
    @BindView(R.id.crn06dob2)
    DatePickerInputEditText crn06dob2;
    @BindView(R.id.crn06dod2)
    DatePickerInputEditText crn06dod2;
    @BindView(R.id.crn07s)
    EditText crn07s;
    @BindView(R.id.fldGrpcrn07)
    LinearLayout fldGrpcrn07;
    @BindView(R.id.crn07dob1)
    DatePickerInputEditText crn07dob1;
    @BindView(R.id.crn07dod1)
    DatePickerInputEditText crn07dod1;
    @BindView(R.id.fldGrpcrn07dob2)
    LinearLayout fldGrpcrn07dob2;
    @BindView(R.id.crn07dob2)
    DatePickerInputEditText crn07dob2;
    @BindView(R.id.crn07dod2)
    DatePickerInputEditText crn07dod2;
    @BindView(R.id.crn08s)
    EditText crn08s;
    @BindView(R.id.fldGrpcrn08)
    LinearLayout fldGrpcrn08;
    @BindView(R.id.crn08dob1)
    DatePickerInputEditText crn08dob1;
    @BindView(R.id.crn08dod1)
    DatePickerInputEditText crn08dod1;
    @BindView(R.id.fldGrpcrn08dob2)
    LinearLayout fldGrpcrn08dob2;
    @BindView(R.id.crn08dob2)
    DatePickerInputEditText crn08dob2;
    @BindView(R.id.crn08dod2)
    DatePickerInputEditText crn08dod2;
    @BindView(R.id.fldGrpcrn04dob2)
    LinearLayout fldGrpcrn04dob2;
    String dateToday;
    String maxDateyear;
    String maxDate5Years;
    String maxDate49Years;
    String maxDate15Years;
    Calendar now = Calendar.getInstance();
    @BindViews({R.id.crn01dod1, R.id.crn01dod2, R.id.crn02dod1, R.id.crn02dod2, R.id.crn03dob1, R.id.crn03dob2, R.id.crn03dob3,
            R.id.crn04dob1, R.id.crn04dob2, R.id.crn04dod1, R.id.crn04dod2, R.id.crn05dob1, R.id.crn05dob2, R.id.crn05dod1,
            R.id.crn05dod2, R.id.crn06dob1, R.id.crn06dob2, R.id.crn06dod1, R.id.crn06dod2, R.id.crn07dob1, R.id.crn07dob2,
            R.id.crn07dod1, R.id.crn07dod2, R.id.crn08dob1, R.id.crn08dob2, R.id.crn08dod1, R.id.crn08dod2})
    List<DatePickerInputEditText> crndates;

    @BindViews({R.id.crn01dod1, R.id.crn01dod2, R.id.crn02dod1, R.id.crn02dod2,
            R.id.crn04dod1, R.id.crn04dod2, R.id.crn05dod1,
            R.id.crn05dod2, R.id.crn06dod1, R.id.crn06dod2,
            R.id.crn07dod1, R.id.crn07dod2, R.id.crn08dod1, R.id.crn08dod2})
    List<DatePickerInputEditText> crndateofDeath;


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

        for (DatePickerInputEditText de : crndates) {
            de.setManager(getSupportFragmentManager());
            de.setMaxDate(dateToday);
            de.setMinDate(maxDateyear);

        }


        crn07dob1.setMinDate(maxDate5Years);
        crn07dob1.setMaxDate(maxDateyear);
        crn07dob2.setMinDate(maxDate5Years);
        crn07dob2.setMaxDate(maxDateyear);
        crn08dob1.setMaxDate(maxDate15Years);
        crn08dob1.setMinDate(maxDate49Years);
        crn08dob2.setMaxDate(maxDate15Years);
        crn08dob2.setMinDate(maxDate49Years);
        crn08dod1.setMaxDate(dateToday);
        crn08dod1.setMinDate(maxDateyear);
        crn08dod2.setMaxDate(dateToday);
        crn08dod2.setMinDate(maxDateyear);

        crn04dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                crn04dod1.setMinDate(crn04dob1.getText().toString());
                Calendar cal = getCalendarDate(crn04dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 7);
                crn04dod1.setMaxDate(sdf.format(cal.getTime()));
                crn04dod1.setEnabled(true);


            }
        });

        crn04dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                crn04dod2.setMinDate(crn04dob2.getText().toString());
                Calendar cal = getCalendarDate(crn04dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 7);
                crn04dod2.setMaxDate(sdf.format(cal.getTime()));
                crn04dod2.setEnabled(true);


            }
        });

        crn05dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn05dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 8);
                crn05dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 20);
                crn05dod1.setMaxDate(sdf.format(cal.getTime()));
                crn05dod1.setEnabled(true);

            }
        });

        crn05dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn05dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 8);
                crn05dod2.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 20);
                crn05dod2.setMaxDate(sdf.format(cal.getTime()));
                crn05dod2.setEnabled(true);

            }
        });

        crn06dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn06dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                crn06dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                crn06dod1.setMaxDate(sdf.format(cal.getTime()));
                crn06dod1.setEnabled(true);

            }
        });


        crn06dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn06dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                crn06dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                crn06dod1.setMaxDate(sdf.format(cal.getTime()));
                crn06dod1.setEnabled(true);

            }
        });

        crn06dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn06dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                crn06dod2.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                crn06dod2.setMaxDate(sdf.format(cal.getTime()));
                crn06dod2.setEnabled(true);

            }
        });

        crn07dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                crn07dod1.setMinDate(maxDateyear);
                crn07dod1.setEnabled(true);

            }
        });

        crn01dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn01dod1.onFocusChange(v, true);
            }
        });

        crn01dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn01dod2.onFocusChange(v, true);
            }
        });

        crn02dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn02dod1.onFocusChange(v, true);
            }
        });

        crn02dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn02dod2.onFocusChange(v, true);
            }
        });

        crn03dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn03dob1.onFocusChange(v, true);
            }
        });

        crn03dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn03dob2.onFocusChange(v, true);
            }
        });

        crn03dob3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn03dob3.onFocusChange(v, true);
            }
        });

        crn04dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn04dob1.onFocusChange(v, true);
            }
        });


        crn04dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn04dob2.onFocusChange(v, true);
            }
        });

        crn04dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn04dod1.onFocusChange(v, true);

            }
        });

        crn04dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn04dod2.onFocusChange(v, true);
            }
        });

        crn05dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn05dob1.onFocusChange(v, true);
            }
        });

        crn05dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn05dob2.onFocusChange(v, true);
            }
        });

        crn05dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn05dod1.onFocusChange(v, true);
            }
        });

        crn05dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn05dod2.onFocusChange(v, true);
            }
        });

        crn06dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn06dob1.onFocusChange(v, true);
            }
        });

        crn06dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn06dob2.onFocusChange(v, true);
            }
        });

        crn06dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn06dod1.onFocusChange(v, true);
            }
        });

        crn06dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn06dod2.onFocusChange(v, true);
            }
        });

        crn07dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn07dob1.onFocusChange(v, true);
            }
        });

        crn07dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn07dob2.onFocusChange(v, true);
            }
        });

        crn07dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn07dod1.onFocusChange(v, true);
            }
        });

        crn07dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn07dod2.onFocusChange(v, true);
            }
        });

        crn08dob1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn08dob1.onFocusChange(v, true);
            }
        });

        crn08dob2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn08dob2.onFocusChange(v, true);
            }
        });

        crn08dod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn08dod1.onFocusChange(v, true);
            }
        });

        crn08dod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crn08dod2.onFocusChange(v, true);
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

                startActivity(new Intent(this, EndingActivity.class));
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

        sn.put("crn01s", crn01s.getText().toString());
        sn.put("crn01dod1", crn01dod1.getText().toString());
        sn.put("crn01dod2", crn01dod2.getText().toString());
        sn.put("crn02s", crn02s.getText().toString());
        sn.put("crn02dod1", crn02dod1.getText().toString());
        sn.put("crn02dod2", crn02dod2.getText().toString());

        sn.put("crn03s", crn03s.getText().toString());
        sn.put("crn03dob1", crn03dob1.getText().toString());
        sn.put("crn03dob2", crn03dob2.getText().toString());
        sn.put("crn03dob3", crn03dob3.getText().toString());

        sn.put("crn04s", crn04s.getText().toString());
        sn.put("crn04dob1", crn04dob1.getText().toString());
        sn.put("crn04dob2", crn04dob2.getText().toString());
        sn.put("crn04dod1", crn04dod1.getText().toString());
        sn.put("crn04dod2", crn04dod2.getText().toString());

        sn.put("crn05s", crn05s.getText().toString());
        sn.put("crn05dob1", crn05dob1.getText().toString());
        sn.put("crn05dob2", crn05dob2.getText().toString());
        sn.put("crn05dod1", crn05dod1.getText().toString());
        sn.put("crn05dod2", crn05dod2.getText().toString());

        sn.put("crn06s", crn06s.getText().toString());
        sn.put("crn06dob1", crn06dob1.getText().toString());
        sn.put("crn06dob2", crn06dob2.getText().toString());
        sn.put("crn06dod1", crn06dod1.getText().toString());
        sn.put("crn06dod2", crn06dod2.getText().toString());
        sn.put("crn07s", crn07s.getText().toString());
        sn.put("crn07dob1", crn07dob1.getText().toString());
        sn.put("crn07dob2", crn07dob2.getText().toString());
        sn.put("crn07dod1", crn07dod1.getText().toString());
        sn.put("crn07dod2", crn07dod2.getText().toString());
        sn.put("crn08s", crn08s.getText().toString());
        sn.put("crn08dob1", crn08dob1.getText().toString());
        sn.put("crn08dob2", crn08dob2.getText().toString());
        sn.put("crn08dod1", crn08dod1.getText().toString());
        sn.put("crn08dod2", crn08dod2.getText().toString());


        //AppMain.fc.setsN(String.valueOf(sn));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section M", Toast.LENGTH_SHORT).show();

        //======================== Q 1 ==========================

        if (crn01s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn01), Toast.LENGTH_SHORT).show();
            crn01s.setError("This data is Required!");
            Log.i(TAG, "crn01s: This data is Required!");
            return false;
        } else {
            crn01s.setError(null);
        }

        if (Integer.parseInt(crn01s.getText().toString().isEmpty() ? "0" : crn01s.getText().toString()) == 1) {
            if (crn01dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn01), Toast.LENGTH_SHORT).show();
                crn01dod1.setError("This data is Required!");
                Log.i(TAG, "crn01dod1: This data is Required!");
                return false;
            } else {
                crn01dod1.setError(null);
            }
        }

        if (Integer.parseInt(crn01s.getText().toString().isEmpty() ? "0" : crn01s.getText().toString()) == 2) {
            if (crn01dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn01), Toast.LENGTH_SHORT).show();
                crn01dod2.setError("This data is Required!");
                Log.i(TAG, "crn01dod2: This data is Required!");
                return false;
            } else {
                crn01dod2.setError(null);
            }
        }

        //======================== Q 2 ==========================

        if (crn02s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn02), Toast.LENGTH_SHORT).show();
            crn02s.setError("This data is Required!");
            Log.i(TAG, "crn02s: This data is Required!");
            return false;
        } else {
            crn02s.setError(null);
        }
        if (Integer.valueOf(crn02s.getText().toString()) == 1) {
            if (crn02dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn02), Toast.LENGTH_SHORT).show();
                crn02dod1.setError("This data is Required!");
                Log.i(TAG, "crn02dod1: This data is Required!");
                return false;
            } else {
                crn02dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn02s.getText().toString()) == 2) {
            if (crn02dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn02), Toast.LENGTH_SHORT).show();
                crn02dod2.setError("This data is Required!");
                Log.i(TAG, "crn02dod2: This data is Required!");
                return false;
            } else {
                crn02dod2.setError(null);
            }
        }

        //======================== Q 3 ==========================

        if (crn03s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
            crn03s.setError("This data is Required!");
            Log.i(TAG, "crn03s: This data is Required!");
            return false;
        } else {
            crn03s.setError(null);
        }

        if (Integer.valueOf(crn03s.getText().toString()) == 1) {
            if (crn03dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
                crn03dob1.setError("This data is Required!");
                Log.i(TAG, "crn03dob1: This data is Required!");
                return false;
            } else {
                crn03dob1.setError(null);
            }
        }

        if (Integer.valueOf(crn03s.getText().toString()) == 2) {
            if (crn03dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
                crn03dob2.setError("This data is Required!");
                Log.i(TAG, "crn03dob2: This data is Required!");
                return false;
            } else {
                crn03dob2.setError(null);
            }
        }

        if (Integer.valueOf(crn03s.getText().toString()) == 3) {
            if (crn03dob3.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
                crn03dob3.setError("This data is Required!");
                Log.i(TAG, "crn03dob3: This data is Required!");
                return false;
            } else {
                crn03dob3.setError(null);
            }
        }

        //================ Q4============

        if (crn04s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
            crn04s.setError("This data is Required!");
            Log.i(TAG, "crn04s: This data is Required!");
            return false;
        } else {
            crn04s.setError(null);
        }

        if (Integer.valueOf(crn04s.getText().toString()) == 1) {
            if (crn04dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dob1.setError("This data is Required!");
                Log.i(TAG, "crn04dob1: This data is Required!");
                return false;
            } else {
                crn04dob1.setError(null);
            }

            if (crn04dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dod1.setError("This data is Required!");
                Log.i(TAG, "crn04dod1: This data is Required!");
                return false;
            } else {
                crn04dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn04s.getText().toString()) == 2) {
            if (crn04dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dob2.setError("This data is Required!");
                Log.i(TAG, "crn04dob2: This data is Required!");
                return false;
            } else {
                crn04dob2.setError(null);
            }

            if (crn04dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dod2.setError("This data is Required!");
                Log.i(TAG, "crn04dod2: This data is Required!");
                return false;
            } else {
                crn04dod2.setError(null);
            }
        }


        //================ Q5============

        if (crn05s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
            crn05s.setError("This data is Required!");
            Log.i(TAG, "crn05s: This data is Required!");
            return false;
        } else {
            crn05s.setError(null);
        }

        if (Integer.valueOf(crn05s.getText().toString()) == 1) {
            if (crn05dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dob1.setError("This data is Required!");
                Log.i(TAG, "crn05dob1: This data is Required!");
                return false;
            } else {
                crn05dob1.setError(null);
            }

            if (crn05dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dod1.setError("This data is Required!");
                Log.i(TAG, "crn05dod1: This data is Required!");
                return false;
            } else {
                crn05dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn05s.getText().toString()) == 2) {
            if (crn05dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dob2.setError("This data is Required!");
                Log.i(TAG, "crn05dob2: This data is Required!");
                return false;
            } else {
                crn05dob2.setError(null);
            }

            if (crn05dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dod2.setError("This data is Required!");
                Log.i(TAG, "crn05dod2: This data is Required!");
                return false;
            } else {
                crn05dod2.setError(null);
            }
        }

        //================ Q6============

        if (crn06s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
            crn06s.setError("This data is Required!");
            Log.i(TAG, "crn06s: This data is Required!");
            return false;
        } else {
            crn06s.setError(null);
        }

        if (Integer.valueOf(crn06s.getText().toString()) == 1) {
            if (crn04dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dob1.setError("This data is Required!");
                Log.i(TAG, "crn06dob1: This data is Required!");
                return false;
            } else {
                crn06dob1.setError(null);
            }

            if (crn06dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dod1.setError("This data is Required!");
                Log.i(TAG, "crn06dod1: This data is Required!");
                return false;
            } else {
                crn06dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn06s.getText().toString()) == 2) {
            if (crn06dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dob2.setError("This data is Required!");
                Log.i(TAG, "crn06dob2: This data is Required!");
                return false;
            } else {
                crn06dob2.setError(null);
            }

            if (crn06dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dod2.setError("This data is Required!");
                Log.i(TAG, "crn06dod2: This data is Required!");
                return false;
            } else {
                crn06dod2.setError(null);
            }
        }

        //================ Q7============

        if (crn07s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
            crn07s.setError("This data is Required!");
            Log.i(TAG, "crn07s: This data is Required!");
            return false;
        } else {
            crn07s.setError(null);
        }

        if (Integer.valueOf(crn07s.getText().toString()) == 1) {
            if (crn07dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dob1.setError("This data is Required!");
                Log.i(TAG, "crn07dob1: This data is Required!");
                return false;
            } else {
                crn07dob1.setError(null);
            }

            if (crn07dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dod1.setError("This data is Required!");
                Log.i(TAG, "crn07dod1: This data is Required!");
                return false;
            } else {
                crn07dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn07s.getText().toString()) == 2) {
            if (crn07dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dob2.setError("This data is Required!");
                Log.i(TAG, "crn07dob2: This data is Required!");
                return false;
            } else {
                crn07dob2.setError(null);
            }

            if (crn07dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dod2.setError("This data is Required!");
                Log.i(TAG, "crn07dod2: This data is Required!");
                return false;
            } else {
                crn07dod2.setError(null);
            }
        }

        //================ Q8============

        if (crn08s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
            crn08s.setError("This data is Required!");
            Log.i(TAG, "crn01s: This data is Required!");
            return false;
        } else {
            crn08s.setError(null);
        }

        if (Integer.valueOf(crn08s.getText().toString()) == 1) {
            if (crn08dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dob1.setError("This data is Required!");
                Log.i(TAG, "crn08dob1: This data is Required!");
                return false;
            } else {
                crn08dob1.setError(null);
            }

            if (crn08dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dod1.setError("This data is Required!");
                Log.i(TAG, "crn08dod1: This data is Required!");
                return false;
            } else {
                crn08dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn08s.getText().toString()) == 2) {
            if (crn08dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dob2.setError("This data is Required!");
                Log.i(TAG, "crn08dob2: This data is Required!");
                return false;
            } else {
                crn08dob2.setError(null);
            }

            if (crn08dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dod2.setError("This data is Required!");
                Log.i(TAG, "crn08dod2: This data is Required!");
                return false;
            } else {
                crn08dod2.setError(null);
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
        return false;
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
