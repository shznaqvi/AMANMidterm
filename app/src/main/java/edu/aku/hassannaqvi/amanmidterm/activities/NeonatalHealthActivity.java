package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;
import edu.aku.hassannaqvi.amanmidterm.R;

public class NeonatalHealthActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neonatal_health);
        ButterKnife.bind(this);


    }


}
