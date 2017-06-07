package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.ButterKnife;

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
