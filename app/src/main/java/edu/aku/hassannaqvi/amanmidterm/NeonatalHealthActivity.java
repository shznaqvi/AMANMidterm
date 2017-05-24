package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

public class NeonatalHealthActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neonatal_health);
        ButterKnife.bind(this);


    }


}
