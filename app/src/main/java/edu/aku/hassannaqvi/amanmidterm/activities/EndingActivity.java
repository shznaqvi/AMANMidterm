package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;

public class EndingActivity extends Activity {

    private static final String TAG = ChildHealthActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.iStatus)
    RadioGroup mna7;
    @BindView(R.id.mna7a)
    RadioButton mna7a;
    @BindView(R.id.mna7b)
    RadioButton mna7b;
    @BindView(R.id.mna7c)
    RadioButton mna7c;
    @BindView(R.id.mna7d)
    RadioButton mna7d;
    @BindView(R.id.mna7e)
    RadioButton mna7e;
    @BindView(R.id.mna7f)
    RadioButton mna7f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("complete");
        if (check) {
            mna7a.setEnabled(true);
            mna7b.setEnabled(false);
            mna7c.setEnabled(false);
            mna7d.setEnabled(false);
            mna7e.setEnabled(false);
            mna7f.setEnabled(false);


        } else {
            //fldGrpmn0823Reason.setVisibility(View.GONE);
            mna7a.setEnabled(false);
            mna7b.setEnabled(true);
            mna7c.setEnabled(true);
            mna7d.setEnabled(true);
            mna7e.setEnabled(true);
            mna7f.setEnabled(true);


        }




    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing Closing Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                finish();

                Toast.makeText(this, "Closing Form!", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, MainActivity.class);
                //  AppMain.childName = "TEST";
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);


        int updcount = db.updateEnd();
        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        AppMain.fc.setiStatus(mna7a.isChecked() ? "1" : mna7b.isChecked() ? "2" : mna7c.isChecked() ? "3" : mna7d.isChecked() ? "4" : mna7e.isChecked() ? "5" : mna7f.isChecked() ? "6" : "0");

    }

    private boolean ValidateForm() {
        Toast.makeText(this, "Validating Closing Section", Toast.LENGTH_SHORT).show();

        if (mna7.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(not selected): " + getResources().getResourceTypeName(R.string.iStatus), Toast.LENGTH_LONG).show();
            mna7d.setError("This data is Required!");
            Log.i(TAG, "mna7: This data is Required!");
            return false;
        } else {
            mna7d.setError(null);
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}