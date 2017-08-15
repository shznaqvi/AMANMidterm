package edu.aku.hassannaqvi.amanmidterm.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.core.DatabaseHelper;

public class ChildVaccinationActivity extends Activity {
    private static final String TAG = ChildVaccinationActivity.class.getSimpleName();

    @BindView(R.id.activity_section_c)
    ScrollView activitySectionC;
    @BindView(R.id.cv01)
    RadioGroup cv01;
    @BindView(R.id.cv01a)
    RadioButton cv01a;
    @BindView(R.id.cv01b)
    RadioButton cv01b;
    @BindView(R.id.fldGrpcv02)
    LinearLayout fldGrpcv02;
    @BindView(R.id.cv02a)
    EditText cv02a;
    @BindView(R.id.cv0299)
    CheckBox cv0299;
    @BindView(R.id.cv03)
    RadioGroup cv03;
    @BindView(R.id.cv03a)
    RadioButton cv03a;
    @BindView(R.id.cv03b)
    RadioButton cv03b;
    @BindView(R.id.fldGrpcv04)
    LinearLayout fldGrpcv04;
    @BindView(R.id.cv04)
    RadioGroup cv04;
    @BindView(R.id.cv04a)
    RadioButton cv04a;
    @BindView(R.id.cv04b)
    RadioButton cv04b;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.fldGrpBcgM)
    LinearLayout fldGrpBcgM;
    @BindView(R.id.bcgM)
    RadioGroup bcgM;
    @BindView(R.id.bcgMa)
    RadioButton bcgMa;
    @BindView(R.id.bcgMb)
    RadioButton bcgMb;
    @BindView(R.id.fldGrpBcgCard)
    LinearLayout fldGrpBcgCard;
    @BindView(R.id.bcgC)
    RadioGroup bcgC;
    @BindView(R.id.bcgCa)
    RadioButton bcgCa;
    @BindView(R.id.bcgCb)
    RadioButton bcgCb;
    @BindView(R.id.fldGrpOpv0M)
    LinearLayout fldGrpOpv0M;
    @BindView(R.id.opv0M)
    RadioGroup opv0M;
    @BindView(R.id.opv0Ma)
    RadioButton opv0Ma;
    @BindView(R.id.opv0Mb)
    RadioButton opv0Mb;
    @BindView(R.id.fldGrpOpv0Card)
    LinearLayout fldGrpOpv0Card;
    @BindView(R.id.opv0C)
    RadioGroup opv0C;
    @BindView(R.id.opv0Ca)
    RadioButton opv0Ca;
    @BindView(R.id.opv0Cb)
    RadioButton opv0Cb;
    @BindView(R.id.fldGrpOpv1M)
    LinearLayout fldGrpOpv1M;
    @BindView(R.id.opv1M)
    RadioGroup opv1M;
    @BindView(R.id.opv1Ma)
    RadioButton opv1Ma;
    @BindView(R.id.opv1Mb)
    RadioButton opv1Mb;
    @BindView(R.id.fldGrpOpv1Card)
    LinearLayout fldGrpOpv1Card;
    @BindView(R.id.opv1C)
    RadioGroup opv1C;
    @BindView(R.id.opv1Ca)
    RadioButton opv1Ca;
    @BindView(R.id.opv1Cb)
    RadioButton opv1Cb;
    @BindView(R.id.fldGrpPenta1M)
    LinearLayout fldGrpPenta1M;
    @BindView(R.id.penta1M)
    RadioGroup penta1M;
    @BindView(R.id.penta1Ma)
    RadioButton penta1Ma;
    @BindView(R.id.penta1Mb)
    RadioButton penta1Mb;
    @BindView(R.id.fldGrpPenta1C)
    LinearLayout fldGrpPenta1C;
    @BindView(R.id.penta1C)
    RadioGroup penta1C;
    @BindView(R.id.penta1Ca)
    RadioButton penta1Ca;
    @BindView(R.id.penta1Cb)
    RadioButton penta1Cb;
    @BindView(R.id.fldGrpPneumo1M)
    LinearLayout fldGrpPneumo1M;
    @BindView(R.id.pneumo1M)
    RadioGroup pneumo1M;
    @BindView(R.id.pneumo1Ma)
    RadioButton pneumo1Ma;
    @BindView(R.id.pneumo1Mb)
    RadioButton pneumo1Mb;
    @BindView(R.id.fldGrpPneumo1C)
    LinearLayout fldGrpPneumo1C;
    @BindView(R.id.pneumo1C)
    RadioGroup pneumo1C;
    @BindView(R.id.pneumo1Ca)
    RadioButton pneumo1Ca;
    @BindView(R.id.pneumo1Cb)
    RadioButton pneumo1Cb;
    @BindView(R.id.fldGrpOpv2M)
    LinearLayout fldGrpOpv2M;
    @BindView(R.id.opv2M)
    RadioGroup opv2M;
    @BindView(R.id.opv2Ma)
    RadioButton opv2Ma;
    @BindView(R.id.opv2Mb)
    RadioButton opv2Mb;
    @BindView(R.id.fldGrpOpv2C)
    LinearLayout fldGrpOpv2C;
    @BindView(R.id.opv2C)
    RadioGroup opv2C;
    @BindView(R.id.opv2Ca)
    RadioButton opv2Ca;
    @BindView(R.id.opv2Cb)
    RadioButton opv2Cb;
    @BindView(R.id.fldGrpPenta2M)
    LinearLayout fldGrpPenta2M;
    @BindView(R.id.penta2M)
    RadioGroup penta2M;
    @BindView(R.id.penta2Ma)
    RadioButton penta2Ma;
    @BindView(R.id.penta2Mb)
    RadioButton penta2Mb;
    @BindView(R.id.fldGrpPenta2C)
    LinearLayout fldGrpPenta2C;
    @BindView(R.id.penta2C)
    RadioGroup penta2C;
    @BindView(R.id.penta2Ca)
    RadioButton penta2Ca;
    @BindView(R.id.penta2Cb)
    RadioButton penta2Cb;
    @BindView(R.id.fldGrpPneumo2M)
    LinearLayout fldGrpPneumo2M;
    @BindView(R.id.pneumo2M)
    RadioGroup pneumo2M;
    @BindView(R.id.pneumo2Ma)
    RadioButton pneumo2Ma;
    @BindView(R.id.pneumo2Mb)
    RadioButton pneumo2Mb;
    @BindView(R.id.fldGrpPneumo2C)
    LinearLayout fldGrpPneumo2C;
    @BindView(R.id.pneumo2C)
    RadioGroup pneumo2C;
    @BindView(R.id.pneumo2Ca)
    RadioButton pneumo2Ca;
    @BindView(R.id.pneumo2Cb)
    RadioButton pneumo2Cb;
    @BindView(R.id.fldGrpOpv3M)
    LinearLayout fldGrpOpv3M;
    @BindView(R.id.opv3M)
    RadioGroup opv3M;
    @BindView(R.id.opv3Ma)
    RadioButton opv3Ma;
    @BindView(R.id.opv3Mb)
    RadioButton opv3Mb;
    @BindView(R.id.fldGrOpv3C)
    LinearLayout fldGrOpv3C;
    @BindView(R.id.opv3C)
    RadioGroup opv3C;
    @BindView(R.id.opv3Ca)
    RadioButton opv3Ca;
    @BindView(R.id.opv3Cb)
    RadioButton opv3Cb;
    @BindView(R.id.fldGrpPenta3M)
    LinearLayout fldGrpPenta3M;
    @BindView(R.id.penta3M)
    RadioGroup penta3M;
    @BindView(R.id.penta3Ma)
    RadioButton penta3Ma;
    @BindView(R.id.penta3Mb)
    RadioButton penta3Mb;
    @BindView(R.id.fldGrpPenta3C)
    LinearLayout fldGrpPenta3C;
    @BindView(R.id.penta3C)
    RadioGroup penta3C;
    @BindView(R.id.penta3Ca)
    RadioButton penta3Ca;
    @BindView(R.id.penta3Cb)
    RadioButton penta3Cb;
    @BindView(R.id.fldGrpPneumo3M)
    LinearLayout fldGrpPneumo3M;
    @BindView(R.id.pneumo3M)
    RadioGroup pneumo3M;
    @BindView(R.id.pneumo3Ma)
    RadioButton pneumo3Ma;
    @BindView(R.id.pneumo3Mb)
    RadioButton pneumo3Mb;
    @BindView(R.id.fldGrpPneumo3C)
    LinearLayout fldGrpPneumo3C;
    @BindView(R.id.pneumo3C)
    RadioGroup pneumo3C;
    @BindView(R.id.pneumo3Ca)
    RadioButton pneumo3Ca;
    @BindView(R.id.pneumo3Cb)
    RadioButton pneumo3Cb;
    @BindView(R.id.fldGrpipvM)
    LinearLayout fldGrpipvM;
    @BindView(R.id.ipvM)
    RadioGroup ipvM;
    @BindView(R.id.ipvMa)
    RadioButton ipvMa;
    @BindView(R.id.ipvMb)
    RadioButton ipvMb;
    @BindView(R.id.fldGrpipvC)
    LinearLayout fldGrpipvC;
    @BindView(R.id.ipvC)
    RadioGroup ipvC;
    @BindView(R.id.ipvCa)
    RadioButton ipvCa;
    @BindView(R.id.ipvCb)
    RadioButton ipvCb;
    @BindView(R.id.fldGrpMeasles1M)
    LinearLayout fldGrpMeasles1M;
    @BindView(R.id.measles1M)
    RadioGroup measles1M;
    @BindView(R.id.measles1Ma)
    RadioButton measles1Ma;
    @BindView(R.id.measles1Mb)
    RadioButton measles1Mb;
    @BindView(R.id.fldGrpMeasles1C)
    LinearLayout fldGrpMeasles1C;
    @BindView(R.id.measles1C)
    RadioGroup measles1C;
    @BindView(R.id.measles1Ca)
    RadioButton measles1Ca;
    @BindView(R.id.measles1Cb)
    RadioButton measles1Cb;
    @BindView(R.id.fldGrpMeasles2M)
    LinearLayout fldGrpMeasles2M;
    @BindView(R.id.measles2M)
    RadioGroup measles2M;
    @BindView(R.id.measles2Ma)
    RadioButton measles2Ma;
    @BindView(R.id.measles2Mb)
    RadioButton measles2Mb;
    @BindView(R.id.fldGrpMeasles2C)
    LinearLayout fldGrpMeasles2C;
    @BindView(R.id.measles2C)
    RadioGroup measles2C;
    @BindView(R.id.measles2Ca)
    RadioButton measles2Ca;
    @BindView(R.id.measles2Cb)
    RadioButton measles2Cb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_vaccination);
        ButterKnife.bind(this);

        cv01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cv01a.isChecked()) {
                    fldGrpcv02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcv02.setVisibility(View.GONE);
                    cv02a.setText(null);
                    cv0299.setChecked(false);
                }
            }
        });

        cv0299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cv02a.setVisibility(View.GONE);
                    cv02a.setText(null);
                } else {
                    cv02a.setVisibility(View.VISIBLE);
                }
            }
        });

        cv03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cv03a.isChecked()) {
                    fldGrpcv04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcv04.setVisibility(View.GONE);
                    cv04.clearCheck();
                    bcgM.clearCheck();
                    bcgC.clearCheck();
                    opv0C.clearCheck();
                    opv0M.clearCheck();
                    opv1C.clearCheck();
                    opv1M.clearCheck();
                    penta1C.clearCheck();
                    penta1M.clearCheck();
                    pneumo1C.clearCheck();
                    pneumo1M.clearCheck();
                    opv2C.clearCheck();
                    opv2M.clearCheck();
                    penta2C.clearCheck();
                    penta2M.clearCheck();
                    pneumo2C.clearCheck();
                    pneumo2M.clearCheck();
                    opv3C.clearCheck();
                    opv3M.clearCheck();
                    penta3C.clearCheck();
                    penta3M.clearCheck();
                    pneumo3C.clearCheck();
                    pneumo3M.clearCheck();
                    ipvC.clearCheck();
                    ipvM.clearCheck();
                    measles1C.clearCheck();
                    measles1M.clearCheck();
                    measles2C.clearCheck();
                    measles2M.clearCheck();

                }
            }
        });

        cv04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cv04a.isChecked()) {
                    fldGrpBcgCard.setVisibility(View.VISIBLE);
                    fldGrpBcgM.setVisibility(View.GONE);
                    bcgM.clearCheck();
                    opv0M.clearCheck();
                    fldGrpOpv0Card.setVisibility(View.VISIBLE);
                    fldGrpOpv0M.setVisibility(View.GONE);
                    fldGrpOpv1Card.setVisibility(View.VISIBLE);
                    fldGrpOpv1M.setVisibility(View.GONE);
                    opv1M.clearCheck();
                    fldGrpPenta1C.setVisibility(View.VISIBLE);
                    fldGrpPenta1M.setVisibility(View.GONE);
                    penta1M.clearCheck();
                    fldGrpPneumo1C.setVisibility(View.VISIBLE);
                    fldGrpPneumo1M.setVisibility(View.GONE);
                    pneumo1M.clearCheck();
                    fldGrpOpv2C.setVisibility(View.VISIBLE);
                    fldGrpOpv2M.setVisibility(View.GONE);
                    opv2M.clearCheck();
                    fldGrpPenta2C.setVisibility(View.VISIBLE);
                    fldGrpPenta2M.setVisibility(View.GONE);
                    penta2M.clearCheck();
                    fldGrpPneumo2C.setVisibility(View.VISIBLE);
                    fldGrpPneumo2M.setVisibility(View.GONE);
                    pneumo2M.clearCheck();
                    fldGrOpv3C.setVisibility(View.VISIBLE);
                    fldGrpOpv3M.setVisibility(View.GONE);
                    opv3M.clearCheck();
                    fldGrpPenta3C.setVisibility(View.VISIBLE);
                    fldGrpPenta3M.setVisibility(View.GONE);
                    penta3M.clearCheck();
                    fldGrpPneumo3C.setVisibility(View.VISIBLE);
                    fldGrpPneumo3M.setVisibility(View.GONE);
                    pneumo3M.clearCheck();
                    fldGrpipvC.setVisibility(View.VISIBLE);
                    fldGrpipvM.setVisibility(View.GONE);
                    ipvM.clearCheck();
                    fldGrpMeasles1C.setVisibility(View.VISIBLE);
                    fldGrpMeasles1M.setVisibility(View.GONE);
                    measles1M.clearCheck();
                    fldGrpMeasles2C.setVisibility(View.VISIBLE);
                    fldGrpMeasles2M.setVisibility(View.GONE);
                    measles2M.clearCheck();


                } else {
                    fldGrpBcgCard.setVisibility(View.GONE);
                    fldGrpBcgM.setVisibility(View.VISIBLE);
                    bcgC.clearCheck();
                    opv0C.clearCheck();
                    fldGrpOpv0Card.setVisibility(View.GONE);
                    fldGrpOpv0M.setVisibility(View.VISIBLE);
                    fldGrpOpv1Card.setVisibility(View.GONE);
                    fldGrpOpv1M.setVisibility(View.VISIBLE);
                    opv1C.clearCheck();
                    fldGrpPenta1C.setVisibility(View.GONE);
                    fldGrpPenta1M.setVisibility(View.VISIBLE);
                    penta1C.clearCheck();
                    fldGrpPneumo1C.setVisibility(View.GONE);
                    fldGrpPneumo1M.setVisibility(View.VISIBLE);
                    pneumo1C.clearCheck();
                    fldGrpOpv2C.setVisibility(View.GONE);
                    fldGrpOpv2M.setVisibility(View.VISIBLE);
                    opv2C.clearCheck();
                    fldGrpPenta2C.setVisibility(View.GONE);
                    fldGrpPenta2M.setVisibility(View.VISIBLE);
                    penta2C.clearCheck();
                    fldGrpPneumo2C.setVisibility(View.GONE);
                    fldGrpPneumo2M.setVisibility(View.VISIBLE);
                    pneumo2C.clearCheck();
                    fldGrOpv3C.setVisibility(View.GONE);
                    fldGrpOpv3M.setVisibility(View.VISIBLE);
                    opv3C.clearCheck();
                    fldGrpPenta3C.setVisibility(View.GONE);
                    fldGrpPenta3M.setVisibility(View.VISIBLE);
                    penta3C.clearCheck();
                    fldGrpPneumo3C.setVisibility(View.GONE);
                    fldGrpPneumo3M.setVisibility(View.VISIBLE);
                    pneumo3C.clearCheck();
                    fldGrpipvC.setVisibility(View.GONE);
                    fldGrpipvM.setVisibility(View.VISIBLE);
                    ipvC.clearCheck();
                    fldGrpMeasles1C.setVisibility(View.GONE);
                    fldGrpMeasles1M.setVisibility(View.VISIBLE);
                    measles1C.clearCheck();
                    fldGrpMeasles2C.setVisibility(View.GONE);
                    fldGrpMeasles2M.setVisibility(View.VISIBLE);
                    measles2C.clearCheck();

                }
            }
        });


    }

    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
//        if (formValidation()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        /*Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("check", false);
        startActivity(endSec);*/
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

        AppMain.endActivity(this, this);

    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                if (AppMain.chTotal > 0) {

                    Intent secNext = new Intent(this, ChildMorbidityActivity.class);
                    secNext.putExtra("check", false);
                    startActivity(secNext);
                } else {
                    Intent secNext = new Intent(this, MaternalMentalHealthActivity.class);
                    secNext.putExtra("check", false);
                    startActivity(secNext);
                }
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateChildVacc();

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

        sc.put("cv01", cv01a.isChecked() ? "1" : cv01b.isChecked() ? "2" : "0");
        sc.put("cv02a", cv02a.getText().toString());
        sc.put("cv0299", cv0299.isChecked() ? "99" : "0");
        sc.put("cv03", cv03a.isChecked() ? "1" : cv03b.isChecked() ? "2" : "0");
        sc.put("cv04", cv04a.isChecked() ? "1" : cv04b.isChecked() ? "2" : "0");
        sc.put("bcgC", bcgCa.isChecked() ? "1" : bcgCb.isChecked() ? "2" : "0");
        sc.put("bcgM", bcgMa.isChecked() ? "1" : bcgMb.isChecked() ? "2" : "0");
        sc.put("opv0C", opv0Ca.isChecked() ? "1" : opv0Cb.isChecked() ? "2" : "0");
        sc.put("opv0M", opv0Ma.isChecked() ? "1" : opv0Mb.isChecked() ? "2" : "0");
        sc.put("opv1C", opv1Ca.isChecked() ? "1" : opv1Cb.isChecked() ? "2" : "0");
        sc.put("opv1M", opv1Ma.isChecked() ? "1" : opv1Mb.isChecked() ? "2" : "0");
        sc.put("penta1C", penta1Ca.isChecked() ? "1" : penta1Cb.isChecked() ? "2" : "0");
        sc.put("penta1M", penta1Ma.isChecked() ? "1" : penta1Mb.isChecked() ? "2" : "0");
        sc.put("pneumo1C", pneumo1Ca.isChecked() ? "1" : pneumo1Cb.isChecked() ? "2" : "0");
        sc.put("pneumo1M", pneumo1Ma.isChecked() ? "1" : pneumo1Mb.isChecked() ? "2" : "0");
        sc.put("opv2C", opv2Ca.isChecked() ? "1" : opv2Cb.isChecked() ? "2" : "0");
        sc.put("opv2M", opv2Ma.isChecked() ? "1" : opv2Mb.isChecked() ? "2" : "0");
        sc.put("penta2C", penta2Ca.isChecked() ? "1" : penta2Cb.isChecked() ? "2" : "0");
        sc.put("penta2M", penta2Ma.isChecked() ? "1" : penta2Mb.isChecked() ? "2" : "0");
        sc.put("pneumo2C", pneumo2Ca.isChecked() ? "1" : pneumo2Cb.isChecked() ? "2" : "0");
        sc.put("pneumo2M", pneumo2Ma.isChecked() ? "1" : pneumo2Mb.isChecked() ? "2" : "0");
        sc.put("opv3C", opv3Ca.isChecked() ? "1" : opv3Cb.isChecked() ? "2" : "0");
        sc.put("opv3M", opv3Ma.isChecked() ? "1" : opv3Mb.isChecked() ? "2" : "0");
        sc.put("penta3C", penta3Ca.isChecked() ? "1" : penta3Cb.isChecked() ? "2" : "0");
        sc.put("penta3M", penta3Ma.isChecked() ? "1" : penta3Mb.isChecked() ? "2" : "0");
        sc.put("pneumo3C", pneumo3Ca.isChecked() ? "1" : pneumo3Cb.isChecked() ? "2" : "0");
        sc.put("pneumo3M", pneumo3Ma.isChecked() ? "1" : pneumo3Mb.isChecked() ? "2" : "0");
        sc.put("ipvC", ipvCa.isChecked() ? "1" : ipvCb.isChecked() ? "2" : "0");
        sc.put("ipvM", ipvMa.isChecked() ? "1" : ipvMb.isChecked() ? "2" : "0");
        sc.put("measles1C", measles1Ca.isChecked() ? "1" : measles1Cb.isChecked() ? "2" : "0");
        sc.put("measles1M", measles1Ma.isChecked() ? "1" : measles1Mb.isChecked() ? "2" : "0");

        sc.put("measles2C", measles2Ca.isChecked() ? "1" : measles2Cb.isChecked() ? "2" : "0");
        sc.put("measles2M", measles2Ma.isChecked() ? "1" : measles2Mb.isChecked() ? "2" : "0");

        AppMain.fc.setChildVaccination(String.valueOf(sc));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    private boolean formValidation() {

        Toast.makeText(this, "Validating Section C", Toast.LENGTH_SHORT).show();
        //============= Q1================
        if (cv01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cv01), Toast.LENGTH_SHORT).show();
            cv01b.setError("This data is Required!");
            Log.i(TAG, "cv01: This data is Required!");
            return false;
        } else {
            cv01b.setError(null);
        }

        if (cv01a.isChecked()) {
            if (cv02a.getText().toString().isEmpty() && !cv0299.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cv02), Toast.LENGTH_SHORT).show();
                cv02a.setError("This data is Required!");
                Log.i(TAG, "cv02: This data is Required!");
                return false;
            } else {
                cv02a.setError(null);
            }

            if (!cv0299.isChecked()) {
                if (Double.parseDouble(cv02a.getText().toString()) == 0) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.cv02a), Toast.LENGTH_SHORT).show();
                    cv02a.setError("Invalid: Data cannot be Zero");
                    Log.i(TAG, "cv02a: Invalid data is 0");
                    return false;
                } else {
                    cv02a.setError(null);
                    if (Double.parseDouble(cv02a.getText().toString()) < 0.9 || Double.parseDouble(cv02a.getText().toString()) > 6.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.cv02a), Toast.LENGTH_SHORT).show();
                        cv02a.setError("Invalid: Range is 0.9 - 6.0");
                        Log.i(TAG, "cv02a: Invalid Range is 0.9 - 6.0 kg");
                        return false;
                    } else {
                        cv02a.setError(null);
                    }
                }
            }
        }


        //============ Q 3 ==========
        if (cv03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cv03), Toast.LENGTH_SHORT).show();
            cv03b.setError("This data is Required!");
            Log.i(TAG, "cv03: This data is Required!");
            return false;
        } else {
            cv03b.setError(null);
        }

        if (cv03a.isChecked()) {
            //============ Q 1a ==========
            if (cv04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cv04), Toast.LENGTH_SHORT).show();
                cv04b.setError("This data is Required!");
                Log.i(TAG, "cv04: This data is Required!");
                return false;
            } else {
                cv04b.setError(null);
            }

            if (cv04a.isChecked()) {
                //============ BCG / Card Present ==========
                if (bcgC.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
                    bcgCb.setError("This data is Required!");
                    Log.i(TAG, "bcgC: This data is Required!");
                    return false;
                } else {
                    bcgCb.setError(null);
                }

                //============ Polio 0 / Card Present ==========
                if (opv0C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
                    opv0Cb.setError("This data is Required!");
                    Log.i(TAG, "opv0C: This data is Required!");
                    return false;
                } else {
                    opv0Cb.setError(null);
                }

                //============ Penta 1 / Card Present ==========
                if (opv1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
                    opv1Cb.setError("This data is Required!");
                    Log.i(TAG, "opv1C: This data is Required!");
                    return false;
                } else {
                    opv1Cb.setError(null);
                }

                //============ PCV 1 / Card Present ==========
                if (penta1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
                    penta1Ca.setError("This data is Required!");
                    Log.i(TAG, "penta1C: This data is Required!");
                    return false;
                } else {
                    penta1Cb.setError(null);
                }

                //============ OPV 1 / Card Present ==========
                if (pneumo1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo1), Toast.LENGTH_SHORT).show();
                    pneumo1Cb.setError("This data is Required!");
                    Log.i(TAG, "pneumo1C: This data is Required!");
                    return false;
                } else {
                    pneumo1Cb.setError(null);
                }

                //============ Penta 2 / Card Present ==========
                if (opv2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
                    opv2Cb.setError("This data is Required!");
                    Log.i(TAG, "opv2: This data is Required!");
                    return false;
                } else {
                    opv2Cb.setError(null);
                }

                //============ PCV 2 / Card Present ==========

                if (penta2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
                    penta2Cb.setError("This data is Required!");
                    Log.i(TAG, "penta2C: This data is Required!");
                    return false;
                } else {
                    penta2Cb.setError(null);
                }
                //============ OPV 2 / Card Present ==========
                if (pneumo2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo2), Toast.LENGTH_SHORT).show();
                    pneumo2Cb.setError("This data is Required!");
                    Log.i(TAG, "pneumo2C: This data is Required!");
                    return false;
                } else {
                    pneumo2Cb.setError(null);
                }

                //============ Penta 3 / Card Present ==========
                if (opv3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
                    opv3Cb.setError("This data is Required!");
                    Log.i(TAG, "opv3C: This data is Required!");
                    return false;
                } else {
                    opv3Cb.setError(null);
                }



                //============ Penta 3 / Card Present ==========
                if (penta3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
                    penta3Cb.setError("This data is Required!");
                    Log.i(TAG, "penta3C: This data is Required!");
                    return false;
                } else {
                    penta3Cb.setError(null);
                }

                //============ PCV 3 / Card Present ==========

                if (pneumo3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo3), Toast.LENGTH_SHORT).show();
                    pneumo3Cb.setError("This data is Required!");
                    Log.i(TAG, "pneumo3C: This data is Required!");
                    return false;
                } else {
                    pneumo3Cb.setError(null);
                }
                //============ OPV 3 / Card Present ==========
                if (ipvC.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
                    ipvCb.setError("This data is Required!");
                    Log.i(TAG, "ipvC: This data is Required!");
                    return false;
                } else {
                    ipvCb.setError(null);
                }

                //============ IPV / Card Present ==========
                if (measles1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
                    measles1Cb.setError("This data is Required!");
                    Log.i(TAG, "measles1C: This data is Required!");
                    return false;
                } else {
                    measles1Cb.setError(null);
                }

                //============ Vitamin / Card Present ==========
                if (measles2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
                    measles2Cb.setError("This data is Required!");
                    Log.i(TAG, "measles2C: This data is Required!");
                    return false;
                } else {
                    measles2Cb.setError(null);
                }

            } else {
                //============ BCG / Card Present ==========
                if (bcgM.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
                    bcgMb.setError("This data is Required!");
                    Log.i(TAG, "bcgM: This data is Required!");
                    return false;
                } else {
                    bcgMb.setError(null);
                }

                //============ Polio 0 / Card Present ==========
                if (opv0M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
                    opv0Mb.setError("This data is Required!");
                    Log.i(TAG, "opv0M: This data is Required!");
                    return false;
                } else {
                    opv0Mb.setError(null);
                }

                //============ Penta 1 / Card Present ==========
                if (opv1M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
                    opv1Mb.setError("This data is Required!");
                    Log.i(TAG, "opv1M: This data is Required!");
                    return false;
                } else {
                    opv1Mb.setError(null);
                }

                //============ PCV 1 / Card Present ==========
                if (penta1M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
                    penta1Ma.setError("This data is Required!");
                    Log.i(TAG, "penta1M: This data is Required!");
                    return false;
                } else {
                    penta1Mb.setError(null);
                }

                //============ OPV 1 / Card Present ==========
                if (pneumo1M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo1), Toast.LENGTH_SHORT).show();
                    pneumo1Mb.setError("This data is Required!");
                    Log.i(TAG, "pneumo1M: This data is Required!");
                    return false;
                } else {
                    pneumo1Mb.setError(null);
                }

                //============ Penta 2 / Card Present ==========
                if (opv2M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
                    opv2Mb.setError("This data is Required!");
                    Log.i(TAG, "opv2: This data is Required!");
                    return false;
                } else {
                    opv2Mb.setError(null);
                }

                //============ PCV 2 / Card Present ==========

                if (penta2M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
                    penta2Mb.setError("This data is Required!");
                    Log.i(TAG, "penta2C: This data is Required!");
                    return false;
                } else {
                    penta2Mb.setError(null);
                }
                //============ OPV 2 / Card Present ==========
                if (pneumo2M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo2), Toast.LENGTH_SHORT).show();
                    pneumo2Mb.setError("This data is Required!");
                    Log.i(TAG, "pneumo2C: This data is Required!");
                    return false;
                } else {
                    pneumo2Mb.setError(null);
                }

                //============ Penta 3 / Card Present ==========
                if (opv3M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
                    opv3Mb.setError("This data is Required!");
                    Log.i(TAG, "opv3C: This data is Required!");
                    return false;
                } else {
                    opv3Mb.setError(null);
                }


                //============ Penta 3 / Card Present ==========
                if (penta3M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
                    penta3Mb.setError("This data is Required!");
                    Log.i(TAG, "penta3C: This data is Required!");
                    return false;
                } else {
                    penta3Mb.setError(null);
                }

                //============ PCV 3 / Card Present ==========

                if (pneumo3M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo3), Toast.LENGTH_SHORT).show();
                    pneumo3Mb.setError("This data is Required!");
                    Log.i(TAG, "pneumo3C: This data is Required!");
                    return false;
                } else {
                    pneumo3Mb.setError(null);
                }
                //============ OPV 3 / Card Present ==========
                if (ipvM.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
                    ipvMb.setError("This data is Required!");
                    Log.i(TAG, "ipvC: This data is Required!");
                    return false;
                } else {
                    ipvMb.setError(null);
                }

                //============ IPV / Card Present ==========
                if (measles1M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
                    measles1Mb.setError("This data is Required!");
                    Log.i(TAG, "measles1C: This data is Required!");
                    return false;
                } else {
                    measles1Mb.setError(null);
                }

                //============ Vitamin / Card Present ==========
                if (measles2M.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
                    measles2Mb.setError("This data is Required!");
                    Log.i(TAG, "measles2C: This data is Required!");
                    return false;
                } else {
                    measles2Mb.setError(null);
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
