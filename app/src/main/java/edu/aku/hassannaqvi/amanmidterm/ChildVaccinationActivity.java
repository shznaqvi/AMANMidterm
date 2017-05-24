package edu.aku.hassannaqvi.amanmidterm;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChildVaccinationActivity extends Activity {
    private static final String TAG = ChildVaccinationActivity.class.getSimpleName();

    @BindView(R.id.activity_section_c)
    ScrollView activitySectionC;
    @BindView(R.id.cre01)
    RadioGroup cre01;
    @BindView(R.id.cre0101)
    RadioButton cre0101;
    @BindView(R.id.cre0102)
    RadioButton cre0102;
    @BindView(R.id.fldGrpcre01)
    LinearLayout fldGrpcre01;
    @BindView(R.id.cre01a)
    RadioGroup cre01a;
    @BindView(R.id.cre01a01)
    RadioButton cre01a01;
    @BindView(R.id.cre01a02)
    RadioButton cre01a02;
    @BindView(R.id.fldGrpBcgM)
    LinearLayout fldGrpBcgM;
    @BindView(R.id.cre0201b)
    RadioGroup cre0201b;
    @BindView(R.id.cre0201b01)
    RadioButton cre0201b01;
    @BindView(R.id.cre0201b02)
    RadioButton cre0201b02;
    @BindView(R.id.fldGrpBcg)
    LinearLayout fldGrpBcg;
    @BindView(R.id.cre0201a)
    RadioGroup cre0201a;
    @BindView(R.id.cre0201a01)
    RadioButton cre0201a01;
    @BindView(R.id.cre0201a02)
    RadioButton cre0201a02;
    @BindView(R.id.fldGrpPolioM)
    LinearLayout fldGrpPolioM;
    @BindView(R.id.cre0202b)
    RadioGroup cre0202b;
    @BindView(R.id.cre0202b01)
    RadioButton cre0202b01;
    @BindView(R.id.cre0202b02)
    RadioButton cre0202b02;
    @BindView(R.id.fldGrpPolio)
    LinearLayout fldGrpPolio;
    @BindView(R.id.cre0202a)
    RadioGroup cre0202a;
    @BindView(R.id.cre0202a01)
    RadioButton cre0202a01;
    @BindView(R.id.cre0202a02)
    RadioButton cre0202a02;
    @BindView(R.id.fldGrpPenta1M)
    LinearLayout fldGrpPenta1M;
    @BindView(R.id.cre0301b)
    RadioGroup cre0301b;
    @BindView(R.id.cre0301b01)
    RadioButton cre0301b01;
    @BindView(R.id.cre0301b02)
    RadioButton cre0301b02;
    @BindView(R.id.fldGrpPenta1)
    LinearLayout fldGrpPenta1;
    @BindView(R.id.cre0301a)
    RadioGroup cre0301a;
    @BindView(R.id.cre0301a01)
    RadioButton cre0301a01;
    @BindView(R.id.cre0301a02)
    RadioButton cre0301a02;
    @BindView(R.id.fldGrppcv1M)
    LinearLayout fldGrppcv1M;
    @BindView(R.id.cre0302b)
    RadioGroup cre0302b;
    @BindView(R.id.cre0302b01)
    RadioButton cre0302b01;
    @BindView(R.id.cre0302b02)
    RadioButton cre0302b02;
    @BindView(R.id.fldGrppcv1)
    LinearLayout fldGrppcv1;
    @BindView(R.id.cre0302a)
    RadioGroup cre0302a;
    @BindView(R.id.cre0302a01)
    RadioButton cre0302a01;
    @BindView(R.id.cre0302a02)
    RadioButton cre0302a02;
    @BindView(R.id.fldGrpopv1M)
    LinearLayout fldGrpopv1M;
    @BindView(R.id.cre0303b)
    RadioGroup cre0303b;
    @BindView(R.id.cre0303b01)
    RadioButton cre0303b01;
    @BindView(R.id.cre0303b02)
    RadioButton cre0303b02;
    @BindView(R.id.fldGrpopv1)
    LinearLayout fldGrpopv1;
    @BindView(R.id.cre0303a)
    RadioGroup cre0303a;
    @BindView(R.id.cre0303a01)
    RadioButton cre0303a01;
    @BindView(R.id.cre0303a02)
    RadioButton cre0303a02;
    @BindView(R.id.fldGrppenta2M)
    LinearLayout fldGrppenta2M;
    @BindView(R.id.cre0401b)
    RadioGroup cre0401b;
    @BindView(R.id.cre0401b01)
    RadioButton cre0401b01;
    @BindView(R.id.cre0401b02)
    RadioButton cre0401b02;
    @BindView(R.id.fldGrppenta2)
    LinearLayout fldGrppenta2;
    @BindView(R.id.cre0401a)
    RadioGroup cre0401a;
    @BindView(R.id.cre0401a01)
    RadioButton cre0401a01;
    @BindView(R.id.cre0401a02)
    RadioButton cre0401a02;
    @BindView(R.id.fldGrppcv2M)
    LinearLayout fldGrppcv2M;
    @BindView(R.id.cre0402b)
    RadioGroup cre0402b;
    @BindView(R.id.cre0402b01)
    RadioButton cre0402b01;
    @BindView(R.id.cre0402b02)
    RadioButton cre0402b02;
    @BindView(R.id.fldGrppcv2)
    LinearLayout fldGrppcv2;
    @BindView(R.id.cre0402a)
    RadioGroup cre0402a;
    @BindView(R.id.cre0402a01)
    RadioButton cre0402a01;
    @BindView(R.id.cre0402a02)
    RadioButton cre0402a02;
    @BindView(R.id.fldGrpopv2M)
    LinearLayout fldGrpopv2M;
    @BindView(R.id.cre0403b)
    RadioGroup cre0403b;
    @BindView(R.id.cre0403b01)
    RadioButton cre0403b01;
    @BindView(R.id.cre0403b02)
    RadioButton cre0403b02;
    @BindView(R.id.fldGrpopv2)
    LinearLayout fldGrpopv2;
    @BindView(R.id.cre0403a)
    RadioGroup cre0403a;
    @BindView(R.id.cre0403a01)
    RadioButton cre0403a01;
    @BindView(R.id.cre0403a02)
    RadioButton cre0403a02;
    @BindView(R.id.fldGrpPenta3M)
    LinearLayout fldGrpPenta3M;
    @BindView(R.id.cre0501b)
    RadioGroup cre0501b;
    @BindView(R.id.cre0501b01)
    RadioButton cre0501b01;
    @BindView(R.id.cre0501b02)
    RadioButton cre0501b02;
    @BindView(R.id.fldGrpenta3)
    LinearLayout fldGrpenta3;
    @BindView(R.id.cre0501a)
    RadioGroup cre0501a;
    @BindView(R.id.cre0501a01)
    RadioButton cre0501a01;
    @BindView(R.id.cre0501a02)
    RadioButton cre0501a02;
    @BindView(R.id.fldGrppcv3M)
    LinearLayout fldGrppcv3M;
    @BindView(R.id.cre0502b)
    RadioGroup cre0502b;
    @BindView(R.id.cre0502b01)
    RadioButton cre0502b01;
    @BindView(R.id.cre0502b02)
    RadioButton cre0502b02;
    @BindView(R.id.fldGrppcv3)
    LinearLayout fldGrppcv3;
    @BindView(R.id.cre0502a)
    RadioGroup cre0502a;
    @BindView(R.id.cre0502a01)
    RadioButton cre0502a01;
    @BindView(R.id.cre0502a02)
    RadioButton cre0502a02;
    @BindView(R.id.fldGrpopv3M)
    LinearLayout fldGrpopv3M;
    @BindView(R.id.cre0503b)
    RadioGroup cre0503b;
    @BindView(R.id.cre0503b01)
    RadioButton cre0503b01;
    @BindView(R.id.cre0503b02)
    RadioButton cre0503b02;
    @BindView(R.id.fldGrpopv3)
    LinearLayout fldGrpopv3;
    @BindView(R.id.cre0503a)
    RadioGroup cre0503a;
    @BindView(R.id.cre0503a01)
    RadioButton cre0503a01;
    @BindView(R.id.cre0503a02)
    RadioButton cre0503a02;
    @BindView(R.id.fldGrpipvM)
    LinearLayout fldGrpipvM;
    @BindView(R.id.cre0504b)
    RadioGroup cre0504b;
    @BindView(R.id.cre0504b01)
    RadioButton cre0504b01;
    @BindView(R.id.cre0504b02)
    RadioButton cre0504b02;
    @BindView(R.id.fldGrpipv)
    LinearLayout fldGrpipv;
    @BindView(R.id.cre0504a)
    RadioGroup cre0504a;
    @BindView(R.id.cre0504a01)
    RadioButton cre0504a01;
    @BindView(R.id.cre0504a02)
    RadioButton cre0504a02;
    @BindView(R.id.fldGrpVitaminAM)
    LinearLayout fldGrpVitaminAM;
    @BindView(R.id.cre0601b)
    RadioGroup cre0601b;
    @BindView(R.id.cre0601b01)
    RadioButton cre0601b01;
    @BindView(R.id.cre0601b02)
    RadioButton cre0601b02;
    @BindView(R.id.fldGrpVitaminA)
    LinearLayout fldGrpVitaminA;
    @BindView(R.id.cre0601a)
    RadioGroup cre0601a;
    @BindView(R.id.cre0601a01)
    RadioButton cre0601a01;
    @BindView(R.id.cre0601a02)
    RadioButton cre0601a02;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_vaccination);
        ButterKnife.bind(this);

        cre01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cre0101.isChecked()) {
                    fldGrpcre01.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcre01.setVisibility(View.GONE);
                    cre01a.clearCheck();
                    cre0201a.clearCheck();
                    cre0201b.clearCheck();
                    cre0202a.clearCheck();
                    cre0202b.clearCheck();
                    cre0301a.clearCheck();
                    cre0301b.clearCheck();
                    cre0302a.clearCheck();
                    cre0302b.clearCheck();
                    cre0303a.clearCheck();
                    cre0303b.clearCheck();
                    cre0401a.clearCheck();
                    cre0401b.clearCheck();
                    cre0402a.clearCheck();
                    cre0402b.clearCheck();
                    cre0403a.clearCheck();
                    cre0403b.clearCheck();
                    cre0501a.clearCheck();
                    cre0501b.clearCheck();
                    cre0502a.clearCheck();
                    cre0502b.clearCheck();
                    cre0503a.clearCheck();
                    cre0503b.clearCheck();
                    cre0504a.clearCheck();
                    cre0504b.clearCheck();
                    cre0601a.clearCheck();
                    cre0601b.clearCheck();

                }
            }
        });

        cre01a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cre01a01.isChecked()) {
                    fldGrpBcg.setVisibility(View.VISIBLE);
                    fldGrpBcgM.setVisibility(View.GONE);
                    cre0201b.clearCheck();
                    cre0202b.clearCheck();
                    fldGrpPolio.setVisibility(View.VISIBLE);
                    fldGrpPolioM.setVisibility(View.GONE);
                    cre0301b.clearCheck();
                    cre0302b.clearCheck();
                    cre0303b.clearCheck();
                    fldGrpPenta1.setVisibility(View.VISIBLE);
                    fldGrpPenta1M.setVisibility(View.GONE);
                    cre0401b.clearCheck();
                    cre0402b.clearCheck();
                    cre0403b.clearCheck();
                    fldGrppcv1.setVisibility(View.VISIBLE);
                    fldGrppcv1M.setVisibility(View.GONE);
                    cre0501b.clearCheck();
                    cre0502b.clearCheck();
                    cre0503b.clearCheck();
                    fldGrpopv1.setVisibility(View.VISIBLE);
                    fldGrpopv1M.setVisibility(View.GONE);
                    cre0601b.clearCheck();
                    fldGrppenta2.setVisibility(View.VISIBLE);
                    fldGrppenta2M.setVisibility(View.GONE);
                    fldGrppcv2.setVisibility(View.VISIBLE);
                    fldGrppcv2M.setVisibility(View.GONE);
                    fldGrpopv2.setVisibility(View.VISIBLE);
                    fldGrpopv2M.setVisibility(View.GONE);
                    fldGrpenta3.setVisibility(View.VISIBLE);
                    fldGrpPenta3M.setVisibility(View.GONE);
                    fldGrppcv3.setVisibility(View.VISIBLE);
                    fldGrppcv3M.setVisibility(View.GONE);
                    fldGrpopv3.setVisibility(View.VISIBLE);
                    fldGrpopv3M.setVisibility(View.GONE);
                    fldGrpipv.setVisibility(View.VISIBLE);
                    fldGrpipvM.setVisibility(View.GONE);
                    fldGrpVitaminA.setVisibility(View.VISIBLE);
                    fldGrpVitaminAM.setVisibility(View.GONE);
                } else {
                    fldGrpBcg.setVisibility(View.GONE);
                    fldGrpBcgM.setVisibility(View.VISIBLE);
                    cre0201a.clearCheck();
                    fldGrpPolio.setVisibility(View.GONE);
                    fldGrpPolioM.setVisibility(View.VISIBLE);
                    cre0202a.clearCheck();
                    fldGrpPenta1.setVisibility(View.GONE);
                    fldGrpPenta1M.setVisibility(View.VISIBLE);
                    cre0301a.clearCheck();
                    fldGrppcv1.setVisibility(View.GONE);
                    fldGrppcv1M.setVisibility(View.VISIBLE);
                    cre0302a.clearCheck();
                    fldGrpopv1.setVisibility(View.GONE);
                    fldGrpopv1M.setVisibility(View.VISIBLE);
                    cre0303a.clearCheck();
                    fldGrppenta2.setVisibility(View.GONE);
                    fldGrppenta2M.setVisibility(View.VISIBLE);
                    cre0401a.clearCheck();
                    fldGrppcv2.setVisibility(View.GONE);
                    fldGrppcv2M.setVisibility(View.VISIBLE);
                    cre0402a.clearCheck();
                    fldGrpopv2.setVisibility(View.GONE);
                    fldGrpopv2M.setVisibility(View.VISIBLE);
                    cre0403a.clearCheck();
                    fldGrpenta3.setVisibility(View.GONE);
                    fldGrpPenta3M.setVisibility(View.VISIBLE);
                    cre0501a.clearCheck();
                    fldGrppcv3.setVisibility(View.GONE);
                    fldGrppcv3M.setVisibility(View.VISIBLE);
                    cre0502a.clearCheck();
                    fldGrpopv3.setVisibility(View.GONE);
                    fldGrpopv3M.setVisibility(View.VISIBLE);
                    cre0503a.clearCheck();
                    fldGrpipv.setVisibility(View.GONE);
                    fldGrpipvM.setVisibility(View.VISIBLE);
                    cre0504a.clearCheck();
                    fldGrpVitaminA.setVisibility(View.GONE);
                    fldGrpVitaminAM.setVisibility(View.VISIBLE);
                    cre0601a.clearCheck();
                }
            }
        });


    }

    public void submitSecC(View v) throws JSONException {
        Toast.makeText(this, "Processing Section C", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Section C", Toast.LENGTH_SHORT).show();
                Intent secC = new Intent(this, ChildHealthActivity.class);
                startActivity(secC);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSC();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        JSONObject sc = new JSONObject();

        sc.put("cre01", cre0101.isChecked() ? "1" : cre0102.isChecked() ? "2" : "0");
        sc.put("cre01a", cre01a01.isChecked() ? "1" : cre01a02.isChecked() ? "2" : "0");
        // BCG At Birth
        sc.put("cre0201a", cre0201a01.isChecked() ? "1" : cre0201a02.isChecked() ? "2" : "0");
        sc.put("cre0201b", cre0201b01.isChecked() ? "1" : cre0201b02.isChecked() ? "2" : "0");
        //Polio At Birth
        sc.put("cre0202a", cre0202a01.isChecked() ? "1" : cre0202a02.isChecked() ? "2" : "0");
        sc.put("cre0202b", cre0202b01.isChecked() ? "1" : cre0202b02.isChecked() ? "2" : "0");
        // Penta 1 at 6 weeks
        sc.put("cre0301a", cre0301a01.isChecked() ? "1" : cre0301a02.isChecked() ? "2" : "0");
        sc.put("cre0301b", cre0301b01.isChecked() ? "1" : cre0301b02.isChecked() ? "2" : "0");
        //PCV 1 at 6 weeks
        sc.put("cre0302a", cre0302a01.isChecked() ? "1" : cre0302a02.isChecked() ? "2" : "0");
        sc.put("cre0302b", cre0302b01.isChecked() ? "1" : cre0302b02.isChecked() ? "2" : "0");
        // OPV 1 at 6 weeks
        sc.put("cre0303a", cre0303a01.isChecked() ? "1" : cre0303a02.isChecked() ? "2" : "0");
        sc.put("cre0303b", cre0303b01.isChecked() ? "1" : cre0303b02.isChecked() ? "2" : "0");
        // Penta 2 at 10 weeks
        sc.put("cre0401a", cre0401a01.isChecked() ? "1" : cre0401a02.isChecked() ? "2" : "0");
        sc.put("cre0401b", cre0401b01.isChecked() ? "1" : cre0401b02.isChecked() ? "2" : "0");
        // PCV 2 at 6 weeks
        sc.put("cre0402a", cre0402a01.isChecked() ? "1" : cre0402a02.isChecked() ? "2" : "0");
        sc.put("cre0402b", cre0402b01.isChecked() ? "1" : cre0402b02.isChecked() ? "2" : "0");
        // OPV 2 at 6 weeks
        sc.put("cre0403a", cre0403a01.isChecked() ? "1" : cre0403a02.isChecked() ? "2" : "0");
        sc.put("cre0403b", cre0403b01.isChecked() ? "1" : cre0403b02.isChecked() ? "2" : "0");
        // Penta 3 at 14 weeks
        sc.put("cre0501a", cre0501a01.isChecked() ? "1" : cre0501a02.isChecked() ? "2" : "0");
        sc.put("cre0501b", cre0501b01.isChecked() ? "1" : cre0501b02.isChecked() ? "2" : "0");
        // PCV 3 at 14 weeks
        sc.put("cre0502a", cre0502a01.isChecked() ? "1" : cre0502a02.isChecked() ? "2" : "0");
        sc.put("cre0502b", cre0502b01.isChecked() ? "1" : cre0502b02.isChecked() ? "2" : "0");
        // OPV 3 at 14 weeks
        sc.put("cre0503a", cre0503a01.isChecked() ? "1" : cre0503a02.isChecked() ? "2" : "0");
        sc.put("cre0503b", cre0503b01.isChecked() ? "1" : cre0503b02.isChecked() ? "2" : "0");
        // IPV at 14 weeks
        sc.put("cre0504a", cre0504a01.isChecked() ? "1" : cre0504a02.isChecked() ? "2" : "0");
        sc.put("cre0504b", cre0504b01.isChecked() ? "1" : cre0504b02.isChecked() ? "2" : "0");

        sc.put("cre601a", cre0601a01.isChecked() ? "1" : cre0601a02.isChecked() ? "2" : "0");
        sc.put("cre0601b", cre0601b01.isChecked() ? "1" : cre0601b02.isChecked() ? "2" : "0");

        AppMain.fc.setChildVaccination(String.valueOf(sc));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {

        Toast.makeText(this, "Validating Section C", Toast.LENGTH_SHORT).show();

        //============ Q 1 ==========
        if (cre01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre01), Toast.LENGTH_SHORT).show();
            cre0102.setError("This data is Required!");
            Log.i(TAG, "cre01: This data is Required!");
            return false;
        } else {
            cre0102.setError(null);
        }

        if (cre0101.isChecked()) {
            //============ Q 1a ==========
            if (cre01a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre01a), Toast.LENGTH_SHORT).show();
                cre01a02.setError("This data is Required!");
                Log.i(TAG, "cre01a: This data is Required!");
                return false;
            } else {
                cre01a02.setError(null);
            }

            if (cre01a01.isChecked()) {
                //============ BCG / Card Present ==========
                if (cre0201a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02bcg), Toast.LENGTH_SHORT).show();
                    cre0201a02.setError("This data is Required!");
                    Log.i(TAG, "cre0201a: This data is Required!");
                    return false;
                } else {
                    cre0201a02.setError(null);
                }

                //============ Polio 0 / Card Present ==========
                if (cre0202a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02polio), Toast.LENGTH_SHORT).show();
                    cre0202a02.setError("This data is Required!");
                    Log.i(TAG, "cre0202a: This data is Required!");
                    return false;
                } else {
                    cre0202a02.setError(null);
                }

                //============ Penta 1 / Card Present ==========
                if (cre0301a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03penta), Toast.LENGTH_SHORT).show();
                    cre0301a02.setError("This data is Required!");
                    Log.i(TAG, "cre0301a: This data is Required!");
                    return false;
                } else {
                    cre0301a02.setError(null);
                }

                //============ PCV 1 / Card Present ==========
                if (cre0302a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03pcv), Toast.LENGTH_SHORT).show();
                    cre0302a02.setError("This data is Required!");
                    Log.i(TAG, "cre0302a: This data is Required!");
                    return false;
                } else {
                    cre0302a02.setError(null);
                }

                //============ OPV 1 / Card Present ==========
                if (cre0303a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03opv), Toast.LENGTH_SHORT).show();
                    cre0303a02.setError("This data is Required!");
                    Log.i(TAG, "cre0303a: This data is Required!");
                    return false;
                } else {
                    cre0303a02.setError(null);
                }

                //============ Penta 2 / Card Present ==========
                if (cre0401a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04penta), Toast.LENGTH_SHORT).show();
                    cre0401a02.setError("This data is Required!");
                    Log.i(TAG, "cre0401a: This data is Required!");
                    return false;
                } else {
                    cre0401a02.setError(null);
                }

                //============ PCV 2 / Card Present ==========
                if (cre0402a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04pcv), Toast.LENGTH_SHORT).show();
                    cre0402a02.setError("This data is Required!");
                    Log.i(TAG, "cre0402a: This data is Required!");
                    return false;
                } else {
                    cre0402a02.setError(null);
                }

                //============ OPV 2 / Card Present ==========
                if (cre0403a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04opv), Toast.LENGTH_SHORT).show();
                    cre0403a02.setError("This data is Required!");
                    Log.i(TAG, "cre0403a: This data is Required!");
                    return false;
                } else {
                    cre0403a02.setError(null);
                }

                //============ Penta 3 / Card Present ==========
                if (cre0501a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05penta), Toast.LENGTH_SHORT).show();
                    cre0501a02.setError("This data is Required!");
                    Log.i(TAG, "cre0501a: This data is Required!");
                    return false;
                } else {
                    cre0501a02.setError(null);
                }

                //============ PCV 3 / Card Present ==========
                if (cre0502a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05pcv), Toast.LENGTH_SHORT).show();
                    cre0502a02.setError("This data is Required!");
                    Log.i(TAG, "cre0502a: This data is Required!");
                    return false;
                } else {
                    cre0502a02.setError(null);
                }


                //============ OPV 3 / Card Present ==========
                if (cre0503a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05opv), Toast.LENGTH_SHORT).show();
                    cre0503a02.setError("This data is Required!");
                    Log.i(TAG, "cre0503a: This data is Required!");
                    return false;
                } else {
                    cre0503a02.setError(null);
                }

                //============ IPV / Card Present ==========
                if (cre0504a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05ipv), Toast.LENGTH_SHORT).show();
                    cre0504a02.setError("This data is Required!");
                    Log.i(TAG, "cre0504a: This data is Required!");
                    return false;
                } else {
                    cre0504a02.setError(null);
                }

                //============ Vitamin / Card Present ==========
                if (cre0601a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre06Vitamin), Toast.LENGTH_SHORT).show();
                    cre0601a02.setError("This data is Required!");
                    Log.i(TAG, "cre0601a: This data is Required!");
                    return false;
                } else {
                    cre0601a02.setError(null);
                }

            } else {
                //============ BCG / Mother ==========
                if (cre0201b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02bcg), Toast.LENGTH_SHORT).show();
                    cre0201b02.setError("This data is Required!");
                    Log.i(TAG, "cre0201b: This data is Required!");
                    return false;
                } else {
                    cre0201b02.setError(null);
                }

                //============ Polio 0 / Mother ==========
                if (cre0202b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02polio), Toast.LENGTH_SHORT).show();
                    cre0202b02.setError("This data is Required!");
                    Log.i(TAG, "cre0202b: This data is Required!");
                    return false;
                } else {
                    cre0202b02.setError(null);
                }

                //============ Penta 1 / Mother ==========
                if (cre0301b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03penta), Toast.LENGTH_SHORT).show();
                    cre0301b02.setError("This data is Required!");
                    Log.i(TAG, "cre0301b: This data is Required!");
                    return false;
                } else {
                    cre0301b02.setError(null);
                }

                //============ PCV 1 / Mother ==========
                if (cre0302b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03pcv), Toast.LENGTH_SHORT).show();
                    cre0302b02.setError("This data is Required!");
                    Log.i(TAG, "cre0302b: This data is Required!");
                    return false;
                } else {
                    cre0302b02.setError(null);
                }

                //============ OPV 1 / Mother ==========
                if (cre0303b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03opv), Toast.LENGTH_SHORT).show();
                    cre0303b02.setError("This data is Required!");
                    Log.i(TAG, "cre0303b: This data is Required!");
                    return false;
                } else {
                    cre0303b02.setError(null);
                }

                //============ Penta 2 / Mother ==========
                if (cre0401b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04penta), Toast.LENGTH_SHORT).show();
                    cre0401b02.setError("This data is Required!");
                    Log.i(TAG, "cre0401b: This data is Required!");
                    return false;
                } else {
                    cre0401b02.setError(null);
                }

                //============ PCV 2 / Mother ==========
                if (cre0402b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04pcv), Toast.LENGTH_SHORT).show();
                    cre0402b02.setError("This data is Required!");
                    Log.i(TAG, "cre0402b: This data is Required!");
                    return false;
                } else {
                    cre0402b02.setError(null);
                }

                //============ OPV 2 / Mother ==========
                if (cre0403b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04opv), Toast.LENGTH_SHORT).show();
                    cre0403b02.setError("This data is Required!");
                    Log.i(TAG, "cre0403b: This data is Required!");
                    return false;
                } else {
                    cre0403b02.setError(null);
                }

                //============ Penta 3 / Mother ==========
                if (cre0501b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05penta), Toast.LENGTH_SHORT).show();
                    cre0501b02.setError("This data is Required!");
                    Log.i(TAG, "cre0501b: This data is Required!");
                    return false;
                } else {
                    cre0501b02.setError(null);
                }

                //============ PCV / Mother ==========
                if (cre0502b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05pcv), Toast.LENGTH_SHORT).show();
                    cre0502b02.setError("This data is Required!");
                    Log.i(TAG, "cre0502b: This data is Required!");
                    return false;
                } else {
                    cre0502b02.setError(null);
                }


                //============ OPV 3 / Mother ==========
                if (cre0503b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05opv), Toast.LENGTH_SHORT).show();
                    cre0503b02.setError("This data is Required!");
                    Log.i(TAG, "cre0503b: This data is Required!");
                    return false;
                } else {
                    cre0503b02.setError(null);
                }

                //============ IPV / Mother ==========
                if (cre0504b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05ipv), Toast.LENGTH_SHORT).show();
                    cre0504b02.setError("This data is Required!");
                    Log.i(TAG, "cre0504b: This data is Required!");
                    return false;
                } else {
                    cre0504b02.setError(null);
                }

                //============ Vitamin A / Mother ==========
                if (cre0601b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre06Vitamin), Toast.LENGTH_SHORT).show();
                    cre0601b02.setError("This data is Required!");
                    Log.i(TAG, "cre0601b: This data is Required!");
                    return false;
                } else {
                    cre0601b02.setError(null);
                }
            }
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back Button NOT Allowed!", Toast.LENGTH_SHORT).show();

    }
}
