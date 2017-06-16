package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.ButterKnife;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.R;

public class ImmunizationActivity extends Activity {

    private static final String TAG = KAPActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immunisation);
        ButterKnife.bind(this);
        AppMain.chCount++;


    }

    public void submitSecIM(View v) throws JSONException {

    }

    private boolean UpdateDG() {

        return false;
    }

    private void SaveDraft() throws JSONException {


    }


    private boolean ValidateForm() {
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Button NOT Allowed!", Toast.LENGTH_SHORT).show();

    }
}
