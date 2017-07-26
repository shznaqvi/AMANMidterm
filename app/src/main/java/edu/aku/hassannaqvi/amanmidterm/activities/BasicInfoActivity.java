package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.contract.FormsContract;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;
import edu.aku.hassannaqvi.amanmidterm.core.TypefaceUtil;

public class BasicInfoActivity extends Activity {

    private static final String TAG = BasicInfoActivity.class.getSimpleName();
    // District Spinner (used in LoginActivity)
    public static ArrayList<String> labels;
    public static ArrayList<String> values;

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.txtbi3)
    TextView txtbi3;
    @BindView(R.id.bi4)
    EditText bi4;
    @BindView(R.id.bi5)
    EditText bi5;
    @BindView(R.id.childName)
    CheckBox childName;
    @BindView(R.id.child_name)
    TextView child_name;
    @BindView(R.id.bi8)
    EditText bi8;
    @BindView(R.id.bi9)
    EditText bi9;
    @BindView(R.id.bi10)
    RadioGroup bi10;
    @BindView(R.id.bi10a)
    RadioButton bi10a;
    @BindView(R.id.bi10b)
    RadioButton bi10b;
    @BindView(R.id.bi10c)
    RadioButton bi10c;
    @BindView(R.id.bi10d)
    RadioButton bi10d;
    @BindView(R.id.bi10e)
    RadioButton bi10e;
    @BindView(R.id.bi10x)
    RadioButton bi10x;
    @BindView(R.id.bi10x96)
    EditText bi10x96;
    @BindView(R.id.bi11)
    EditText bi11;
    @BindView(R.id.bi12)
    RadioGroup bi12;
    @BindView(R.id.bi12a)
    RadioButton bi12a;
    @BindView(R.id.bi12b)
    RadioButton bi12b;
    @BindView(R.id.bi12c)
    RadioButton bi12c;
    @BindView(R.id.bi12d)
    RadioButton bi12d;
    @BindView(R.id.bi12e)
    RadioButton bi12e;
    @BindView(R.id.bi12f)
    RadioButton bi12f;
    @BindView(R.id.bi12g)
    RadioButton bi12g;
    @BindView(R.id.bi12x)
    RadioButton bi12x;
    @BindView(R.id.bi12x96)
    EditText bi12x96;
    @BindView(R.id.bi13)
    EditText bi13;
    @BindView(R.id.fldGrpbi6)
    LinearLayout fldGrpbi6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
        ButterKnife.bind(this);
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/JameelNooriNastaleeq.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

        labels = new ArrayList<String>();
//        labels.add("K. Abdullah");
//        labels.add("Quetta");
//        labels.add("Pishin");
//        labels.add("J & Bara");
//        labels.add("Town 1 & 2");
//        labels.add("Town 3 & 4");
//        labels.add("K Zone 1");
//        labels.add("K Zone 2");
//        labels.add("K Zone 3");
//        labels.add("Sukkur");
//        labels.add("Larkhana");
//        labels.add("Rawalpindi");
//        labels.add("Lahore");
//        labels.add("Multan");
        labels.add("K. Abdullah");
        labels.add("Quetta");
        labels.add("Pishin");
        labels.add("Mardan/Swabi");
        labels.add("Town 1 & 2");
        labels.add("Town 3 & 4");
        labels.add("K Zone 1");
        labels.add("K Zone 2");
        labels.add("K Zone 3");
        labels.add("Sukkur");
        labels.add("Larkhana");
        labels.add("Rawalpindi");
        labels.add("Lahore");
        labels.add("Multan");

        values = new ArrayList<String>();
//        values.add("11");
//        values.add("12");
//        values.add("13");
//        values.add("21");
//        values.add("22");
//        values.add("23");
//        values.add("31");
//        values.add("32");
//        values.add("33");
//        values.add("34");
//        values.add("35");
//        values.add("41");
//        values.add("42");
//        values.add("43");
        values.add("11");
        values.add("12");
        values.add("13");
        values.add("21");
        values.add("22");
        values.add("23");
        values.add("31");
        values.add("32");
        values.add("33");
        values.add("41");
        values.add("42");
        values.add("91");
        values.add("92");
        values.add("93");

        txtbi3.setText(getString(R.string.bi3) + ": " + labels.get(values.indexOf(String.valueOf(AppMain.majorArea))));
        childName.setEnabled(false);


        childName.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpbi6.setVisibility(View.VISIBLE);
                } else {
                    fldGrpbi6.setVisibility(View.GONE);
                }
            }
        });
        bi10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (bi10x.isChecked()) {
                    bi10x96.setVisibility(View.VISIBLE);
                } else {
                    bi10x96.setVisibility(View.GONE);
                    bi10x96.setText(null);
                }
            }
        });

        bi12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (bi12x.isChecked()) {
                    bi12x96.setVisibility(View.VISIBLE);
                } else {
                    bi12x96.setVisibility(View.GONE);
                    bi12x96.setText(null);
                }
            }
        });

    }

    public void submitSecA(View v) throws JSONException {
        Toast.makeText(this, "Processing Section A", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Socio-Economic Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, SocioEconomicActivity.class);
                AppMain.chTotal = Integer.valueOf(bi13.getText().toString()) - 1; // exclude index child
                startActivity(intent);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void endForm(View v) throws JSONException {
        Toast.makeText(this, "Processing Basic Information", Toast.LENGTH_SHORT).show();

        SaveDraft();
        if (UpdateDB()) {
            Toast.makeText(this, "Starting Closing Section", Toast.LENGTH_SHORT).show();
            Intent endSec = new Intent(this, EndingActivity.class);
            endSec.putExtra("complete", false);
            startActivity(endSec);
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean UpdateDB() {
        Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);

        rowId = null;
        rowId = db.addForm(AppMain.fc);

        AppMain.fc.setID(String.valueOf(rowId));

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            AppMain.fc.setID(
                    (AppMain.fc.getDeviceID() + AppMain.fc.getID()));
            Toast.makeText(this, "Current Form No: " + AppMain.fc.getID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
        AppMain.fc = new FormsContract();
        AppMain.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        AppMain.fc.setFormDate(dtToday);
        AppMain.fc.setUserName(AppMain.username);
        AppMain.fc.setMajorArea(String.valueOf(AppMain.majorArea));
        AppMain.fc.setPrimaryUnit(bi4.getText().toString());
        AppMain.fc.setHouseHold(bi5.getText().toString());
        //AppMain.fc.setchildName(childName.isChecked() ? "1" : "2");

        JSONObject sA = new JSONObject();

        sA.put("bi8", bi8.getText().toString());
        sA.put("bi9", bi9.getText().toString());
        switch (bi10.getCheckedRadioButtonId()) {
            case R.id.bi10a:
                sA.put("bi10", "1");
                break;
            case R.id.bi10b:
                sA.put("bi10", "2");
                break;
            case R.id.bi10c:
                sA.put("bi10", "3");
                break;
            case R.id.bi10d:
                sA.put("bi10", "4");
                break;
            case R.id.bi10e:
                sA.put("bi10", "5");
                break;
            case R.id.bi10x:
                sA.put("bi10", "96");
                break;
            default:
                sA.put("bi10", "default");
        }
        sA.put("bi10x96", bi10x96.getText().toString());
        sA.put("bi11", bi11.getText().toString());
        switch (bi12.getCheckedRadioButtonId()) {
            case R.id.bi12a:
                sA.put("bi12", "1");
                break;
            case R.id.bi12b:
                sA.put("bi12", "2");
                break;
            case R.id.bi12c:
                sA.put("bi12", "3");
                break;
            case R.id.bi12d:
                sA.put("bi12", "4");
                break;
            case R.id.bi12e:
                sA.put("bi12", "5");
                break;
            case R.id.bi12f:
                sA.put("bi12", "6");
                break;
            case R.id.bi12g:
                sA.put("bi12", "7");
                break;
            case R.id.bi12x:
                sA.put("bi12", "96");
                break;
            default:
                sA.put("bi12", "default");
        }
        sA.put("bi12x96", bi12x96.getText().toString());
        sA.put("bi13", bi13.getText().toString());

        AppMain.fc.setBasicInfo(String.valueOf(sA));
        setGPS();

        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

        //Toast.makeText(sA.this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }

    private boolean ValidateForm() {
        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();


        if (bi4.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi4), Toast.LENGTH_LONG).show();
            bi4.setError("This data is Required!");
            Log.i(TAG, "bi4: This data is Required!");
            return false;
        } else {
            bi4.setError(null);
        }

        if (bi4.getText().toString().length() < 5) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.bi4), Toast.LENGTH_LONG).show();
            bi4.setError("This data is invalid!");
            Log.i(TAG, "bi4: This data is invalid!");
            return false;
        } else {
            bi4.setError(null);
        }


        if (bi5.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi5), Toast.LENGTH_LONG).show();
            bi5.setError("This data is Required!");
            Log.i(TAG, "bi5: This data is Required!");
            return false;
        } else {
            bi5.setError(null);
        }

        if (bi5.getText().toString().length() < 5 || !bi5.getText().toString().contains("-")) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.bi5), Toast.LENGTH_LONG).show();
            bi5.setError("This data is invalid!");
            Log.i(TAG, "bi5: This data is invalid!");
            return false;
        } else {
            bi5.setError(null);
        }

        if (childName.isChecked()) {


            if (bi8.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi8), Toast.LENGTH_LONG).show();
                bi8.setError("This data is Required!");
                Log.i(TAG, "bi8: This data is Required!");
                return false;
            } else {
                bi8.setError(null);
            }

            if (bi9.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi9), Toast.LENGTH_LONG).show();
                bi9.setError("This data is Required!");
                Log.i(TAG, "bi9: This data is Required!");
                return false;
            } else {
                bi9.setError(null);
            }

            if (bi10.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi10), Toast.LENGTH_LONG).show();
                bi10x.setError("This data is Required!");
                Log.i(TAG, "bi10: This data is Required!");
                return false;
            } else if (bi10x.isChecked() && bi10x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi10), Toast.LENGTH_LONG).show();
                bi10x96.setError("Other is Required!");
                Log.i(TAG, "bi10: Other is Required!");

                bi10x.setError(null);
                return false;
            } else {
                bi10x96.setError(null);
            }

            if (bi11.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi11), Toast.LENGTH_LONG).show();
                bi11.setError("This data is Required!");
                Log.i(TAG, "bi11: This data is Required!");
                return false;
            } else if (Integer.valueOf(bi11.getText().toString()) < 15) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.bi11), Toast.LENGTH_LONG).show();
                bi11.setError("This data is Invalid!");
                Log.i(TAG, "bi11: This data is Invalid!");
                return false;
            } else {
                bi11.setError(null);
            }

            if (bi12.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi12), Toast.LENGTH_LONG).show();
                bi12x.setError("This data is Required!");
                Log.i(TAG, "bi12: This data is Required!");
                return false;
            } else if (bi12x.isChecked() && bi12x96.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi12), Toast.LENGTH_LONG).show();
                bi12x96.setError("Other is Required!");
                Log.i(TAG, "bi12: Other is Required!");

                bi12x.setError(null);
                return false;
            } else {
                bi12x96.setError(null);
            }
            if (bi13.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bi13), Toast.LENGTH_LONG).show();
                bi13.setError("This data is Required!");
                Log.i(TAG, "bi13: This data is Required!");
                return false;
            } else if (Integer.valueOf(bi13.getText().toString()) == 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.bi13), Toast.LENGTH_LONG).show();
                bi13.setError("This data is invalid!");
                Log.i(TAG, "bi13: This data is invalid!");
                return false;
            } else {
                bi13.setError(null);
            }
        }
        return true;
    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        // CONVERTING GPS TIMESTAMP TO DATETIME FORMAT
        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        AppMain.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
        AppMain.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
        AppMain.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
        AppMain.fc.setGpsTime(date); // Timestamp is converted to date above

        Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
    }
}
