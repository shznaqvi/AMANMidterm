package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;
import edu.aku.hassannaqvi.amanmidterm.R;


public class ChildHealthActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_health);
        ButterKnife.bind(this);


    }
}


