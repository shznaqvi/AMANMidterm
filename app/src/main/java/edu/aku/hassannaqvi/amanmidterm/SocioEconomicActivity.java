package edu.aku.hassannaqvi.amanmidterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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


public class SocioEconomicActivity extends Activity {

    private static final String TAG = SocioEconomicActivity.class.getSimpleName();

    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.se01)
    RadioGroup se01;
    @BindView(R.id.se0101)
    RadioButton se0101;
    @BindView(R.id.se0102)
    RadioButton se0102;
    @BindView(R.id.se0103)
    RadioButton se0103;
    @BindView(R.id.se0104)
    RadioButton se0104;
    @BindView(R.id.se0105)
    RadioButton se0105;
    @BindView(R.id.se0106)
    RadioButton se0106;
    @BindView(R.id.se0188)
    RadioButton se0188;
    @BindView(R.id.se0188x)
    EditText se0188x;
    @BindView(R.id.se02a)
    RadioGroup se02a;
    @BindView(R.id.se02a01)
    RadioButton se02a01;
    @BindView(R.id.se02a02)
    RadioButton se02a02;
    @BindView(R.id.se02a03)
    RadioButton se02a03;
    @BindView(R.id.se02a04)
    RadioButton se02a04;
    @BindView(R.id.se02a05)
    RadioButton se02a05;
    @BindView(R.id.se02a06)
    RadioButton se02a06;
    @BindView(R.id.se02a07)
    RadioButton se02a07;
    @BindView(R.id.se02a08)
    RadioButton se02a08;
    @BindView(R.id.se02a88)
    RadioButton se02a88;
    @BindView(R.id.se02a88x)
    EditText se02a88x;
    @BindView(R.id.se02b)
    RadioGroup se02b;
    @BindView(R.id.se02b01)
    RadioButton se02b01;
    @BindView(R.id.se02b02)
    RadioButton se02b02;
    @BindView(R.id.se02b03)
    RadioButton se02b03;
    @BindView(R.id.se02b04)
    RadioButton se02b04;
    @BindView(R.id.se02b05)
    RadioButton se02b05;
    @BindView(R.id.se02b06)
    RadioButton se02b06;
    @BindView(R.id.se02b07)
    RadioButton se02b07;
    @BindView(R.id.se02b08)
    RadioButton se02b08;
    @BindView(R.id.se02b09)
    RadioButton se02b09;
    @BindView(R.id.se02b10)
    RadioButton se02b10;
    @BindView(R.id.se02b11)
    RadioButton se02b11;
    @BindView(R.id.se02b88)
    RadioButton se02b88;
    @BindView(R.id.se02b88x)
    EditText se02b88x;
    @BindView(R.id.se02c)
    RadioGroup se02c;
    @BindView(R.id.se02c01)
    RadioButton se02c01;
    @BindView(R.id.se02c02)
    RadioButton se02c02;
    @BindView(R.id.se02c03)
    RadioButton se02c03;
    @BindView(R.id.se02c04)
    RadioButton se02c04;
    @BindView(R.id.se02c05)
    RadioButton se02c05;
    @BindView(R.id.se02c06)
    RadioButton se02c06;
    @BindView(R.id.se02c07)
    RadioButton se02c07;
    @BindView(R.id.se02c08)
    RadioButton se02c08;
    @BindView(R.id.se02c09)
    RadioButton se02c09;
    @BindView(R.id.se02c88)
    RadioButton se02c88;
    @BindView(R.id.se02c88x)
    EditText se02c88x;
    @BindView(R.id.se03)
    RadioGroup se03;
    @BindView(R.id.se0301)
    RadioButton se0301;
    @BindView(R.id.se0302)
    RadioButton se0302;
    @BindView(R.id.se0303)
    RadioButton se0303;
    @BindView(R.id.se04)
    EditText se04;
    @BindView(R.id.se05)
    RadioGroup se05;
    @BindView(R.id.se0501)
    RadioButton se0501;
    @BindView(R.id.se0502)
    RadioButton se0502;
    @BindView(R.id.se06)
    RadioGroup se06;
    @BindView(R.id.se0601)
    RadioButton se0601;
    @BindView(R.id.se0602)
    RadioButton se0602;
    @BindView(R.id.se0603)
    RadioButton se0603;
    @BindView(R.id.se0604)
    RadioButton se0604;
    @BindView(R.id.se0605)
    RadioButton se0605;
    @BindView(R.id.se0606)
    RadioButton se0606;
    @BindView(R.id.se0607)
    RadioButton se0607;
    @BindView(R.id.se0608)
    RadioButton se0608;
    @BindView(R.id.se0609)
    RadioButton se0609;
    @BindView(R.id.se0610)
    RadioButton se0610;
    @BindView(R.id.se0611)
    RadioButton se0611;
    @BindView(R.id.se0688)
    RadioButton se0688;
    @BindView(R.id.se0688x)
    EditText se0688x;
    @BindView(R.id.se07)
    RadioGroup se07;
    @BindView(R.id.se0701)
    RadioButton se0701;
    @BindView(R.id.se0702)
    RadioButton se0702;
    @BindView(R.id.se0703)
    RadioButton se0703;
    @BindView(R.id.se0704)
    RadioButton se0704;
    @BindView(R.id.se0705)
    RadioButton se0705;
    @BindView(R.id.se0706)
    RadioButton se0706;
    @BindView(R.id.se0707)
    RadioButton se0707;
    @BindView(R.id.se0708)
    RadioButton se0708;
    @BindView(R.id.se0709)
    RadioButton se0709;
    @BindView(R.id.se0710)
    RadioButton se0710;
    @BindView(R.id.se0711)
    RadioButton se0711;
    @BindView(R.id.se0712)
    RadioButton se0712;
    @BindView(R.id.se0713)
    RadioButton se0713;
    @BindView(R.id.se0714)
    RadioButton se0714;
    @BindView(R.id.se0715)
    RadioButton se0715;
    @BindView(R.id.se0788)
    RadioButton se0788;
    @BindView(R.id.se0788x)
    EditText se0788x;
    @BindView(R.id.se08)
    RadioGroup se08;
    @BindView(R.id.se0801)
    RadioButton se0801;
    @BindView(R.id.se0802)
    RadioButton se0802;
    @BindView(R.id.se0803)
    RadioButton se0803;
    @BindView(R.id.se0804)
    RadioButton se0804;
    @BindView(R.id.se0805)
    RadioButton se0805;
    @BindView(R.id.se0806)
    RadioButton se0806;
    @BindView(R.id.se0807)
    RadioButton se0807;
    @BindView(R.id.se0808)
    RadioButton se0808;
    @BindView(R.id.se0809)
    RadioButton se0809;
    @BindView(R.id.se0810)
    RadioButton se0810;
    @BindView(R.id.se0811)
    RadioButton se0811;
    @BindView(R.id.se0812)
    RadioButton se0812;
    @BindView(R.id.se0813)
    RadioButton se0813;
    @BindView(R.id.se0814)
    RadioButton se0814;
    @BindView(R.id.se0815)
    RadioButton se0815;
    @BindView(R.id.se0888)
    RadioButton se0888;
    @BindView(R.id.se0888x)
    EditText se0888x;
    @BindView(R.id.se09)
    RadioGroup se09;
    @BindView(R.id.se0901)
    RadioButton se0901;
    @BindView(R.id.se0902)
    RadioButton se0902;
    @BindView(R.id.fldGrpse10)
    LinearLayout fldGrpse10;
    @BindView(R.id.se10)
    EditText se10;
    @BindView(R.id.se11)
    RadioGroup se11;
    @BindView(R.id.se1101)
    RadioButton se1101;
    @BindView(R.id.se1102)
    RadioButton se1102;
    @BindView(R.id.se1103)
    RadioButton se1103;
    @BindView(R.id.se1104)
    RadioButton se1104;
    @BindView(R.id.se12)
    RadioGroup se12;
    @BindView(R.id.se1201)
    RadioButton se1201;
    @BindView(R.id.se1202)
    RadioButton se1202;
    @BindView(R.id.se1301)
    CheckBox se1301;
    @BindView(R.id.se1302)
    CheckBox se1302;
    @BindView(R.id.se1303)
    CheckBox se1303;
    @BindView(R.id.se1304)
    CheckBox se1304;
    @BindView(R.id.se1305)
    CheckBox se1305;
    @BindView(R.id.se1306)
    CheckBox se1306;
    @BindView(R.id.se1388)
    CheckBox se1388;
    @BindView(R.id.se1388x)
    EditText se1388x;
    @BindView(R.id.se14)
    RadioGroup se14;
    @BindView(R.id.se1401)
    RadioButton se1401;
    @BindView(R.id.se1402)
    RadioButton se1402;
    @BindView(R.id.se1403)
    RadioButton se1403;
    @BindView(R.id.se1404)
    RadioButton se1404;
    @BindView(R.id.se1405)
    RadioButton se1405;
    @BindView(R.id.se1406)
    RadioButton se1406;
    @BindView(R.id.se1407)
    RadioButton se1407;
    @BindView(R.id.se1408)
    RadioButton se1408;
    @BindView(R.id.se1409)
    RadioButton se1409;
    @BindView(R.id.se1410)
    RadioButton se1410;
    @BindView(R.id.se1411)
    RadioButton se1411;
    @BindView(R.id.se1488)
    RadioButton se1488;
    @BindView(R.id.se1488x)
    EditText se1488x;
    @BindView(R.id.se15)
    RadioGroup se15;
    @BindView(R.id.se1501)
    RadioButton se1501;
    @BindView(R.id.se1502)
    RadioButton se1502;
    @BindView(R.id.fldGrpse16)
    LinearLayout fldGrpse16;
    @BindView(R.id.se16)
    EditText se16;
    @BindView(R.id.se17)
    RadioGroup se17;
    @BindView(R.id.se1701)
    RadioButton se1701;
    @BindView(R.id.se1702)
    RadioButton se1702;
    @BindView(R.id.se18)
    RadioGroup se18;
    @BindView(R.id.se1801)
    RadioButton se1801;
    @BindView(R.id.se1802)
    RadioButton se1802;
    @BindView(R.id.se19)
    RadioGroup se19;
    @BindView(R.id.se1901)
    RadioButton se1901;
    @BindView(R.id.se1902)
    RadioButton se1902;
    @BindView(R.id.se20)
    RadioGroup se20;
    @BindView(R.id.se2001)
    RadioButton se2001;
    @BindView(R.id.se2002)
    RadioButton se2002;
    @BindView(R.id.fldGrpse21)
    LinearLayout fldGrpse21;
    @BindView(R.id.se2101)
    EditText se2101;
    @BindView(R.id.se2102)
    EditText se2102;
    //    @BindView(R.id.se21)
//    RadioGroup se21;
    @BindView(R.id.se2199)
    CheckBox se2199;
    @BindView(R.id.se2201)
    EditText se2201;
    @BindView(R.id.se2202)
    EditText se2202;
    @BindView(R.id.se2203)
    EditText se2203;
    @BindView(R.id.se2204)
    EditText se2204;
    @BindView(R.id.se2205)
    EditText se2205;
    @BindView(R.id.se2206)
    EditText se2206;
    @BindView(R.id.se2207)
    EditText se2207;
    @BindView(R.id.se2208)
    EditText se2208;
    @BindView(R.id.se2209)
    EditText se2209;
    @BindView(R.id.se2210)
    EditText se2210;
    @BindView(R.id.se2211)
    EditText se2211;
    @BindView(R.id.se2212)
    EditText se2212;
    @BindView(R.id.se2213)
    EditText se2213;
    @BindView(R.id.se2214)
    EditText se2214;
    @BindView(R.id.se2215)
    EditText se2215;
    @BindView(R.id.se2216)
    EditText se2216;
    @BindView(R.id.se2217)
    EditText se2217;
    @BindView(R.id.se2218)
    EditText se2218;
    @BindView(R.id.se2219)
    EditText se2219;
    @BindView(R.id.se2220)
    EditText se2220;
    @BindView(R.id.fldGrpse12)
    LinearLayout fldGrpse12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socio_economic);
        ButterKnife.bind(this);


        // ============== 8.12 ============

        se12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (se1201.isChecked()) {
                    fldGrpse12.setVisibility(View.VISIBLE);
                } else {
                    fldGrpse12.setVisibility(View.GONE);
                    se1301.setChecked(false);
                    se1302.setChecked(false);
                    se1303.setChecked(false);
                    se1304.setChecked(false);
                    se1305.setChecked(false);
                    se1306.setChecked(false);
                    se1388.setChecked(false);
                    se1388x.setText(null);
                }
            }
        });


        // ============= Q 8.09 Skip Pattern =================

        se09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (se0901.isChecked()) {
                    fldGrpse10.setVisibility(View.VISIBLE);

                } else {
                    fldGrpse10.setVisibility(View.GONE);
                    se10.setText(null);
                    se11.clearCheck();
                }
            }
        });

        // ============= Q 8.15 Skip Pattern =================

        se15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (se1501.isChecked()) {
                    fldGrpse16.setVisibility(View.VISIBLE);

                } else {
                    fldGrpse16.setVisibility(View.GONE);
                    se16.setText(null);

                }
            }
        });

        // ============= Q 8.20 Skip Pattern =================

        se20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (se2001.isChecked()) {
                    fldGrpse21.setVisibility(View.VISIBLE);

                } else {
                    fldGrpse21.setVisibility(View.GONE);
                    se2101.setText(null);
                    se2102.setText(null);
//                    se21.clearCheck();
                    se2199.setChecked(false);
                }
            }
        });

        se2199.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                se2101.setText(null);
                se2102.setText(null);
                if (isChecked) {
                    se2101.setVisibility(View.GONE);
                    se2102.setVisibility(View.GONE);
                } else {
                    se2101.setVisibility(View.VISIBLE);
                    se2102.setVisibility(View.VISIBLE);
                }
            }
        });


        //  ============================= Q 8.01 Others ==============================
        se01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0188.getId()) {

                    se0188x.setVisibility(View.VISIBLE);
                    se0188x.requestFocus();

                } else {

                    se0188x.setVisibility(View.GONE);
                    se0188x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(a) Others ==============================
        se02a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se02a88.getId()) {

                    se02a88x.setVisibility(View.VISIBLE);
                    se02a88x.requestFocus();

                } else {

                    se02a88x.setVisibility(View.GONE);
                    se02a88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(b) Others ==============================
        se02b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se02b88.getId()) {

                    se02b88x.setVisibility(View.VISIBLE);
                    se02b88x.requestFocus();

                } else {

                    se02b88x.setVisibility(View.GONE);
                    se02b88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(c) Others ==============================
        se02c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se02c88.getId()) {

                    se02c88x.setVisibility(View.VISIBLE);
                    se02c88x.requestFocus();

                } else {

                    se02c88x.setVisibility(View.GONE);
                    se02c88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.06 Others ==============================
        se06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0688.getId()) {

                    se0688x.setVisibility(View.VISIBLE);
                    se0688x.requestFocus();

                } else {

                    se0688x.setVisibility(View.GONE);
                    se0688x.setText(null);
                }
            }
        });

        //  ============================= Q 8.07 Others ==============================
        se07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0788.getId()) {

                    se0788x.setVisibility(View.VISIBLE);
                    se0788x.requestFocus();

                } else {

                    se0788x.setVisibility(View.GONE);
                    se0788x.setText(null);
                }
            }
        });

        //  ============================= Q 8.08 Others ==============================
        se08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se0888.getId()) {

                    se0888x.setVisibility(View.VISIBLE);
                    se0888x.requestFocus();

                } else {

                    se0888x.setVisibility(View.GONE);
                    se0888x.setText(null);
                }
            }
        });

        //  =========================== Q 8.13 Others ================================
        se1388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    se1388x.setVisibility(View.VISIBLE);
                    se1388x.requestFocus();
                } else {
                    se1388x.setVisibility(View.GONE);
                    se1388x.setText(null);

                }
            }
        });

        //  ============================= Q 8.14 Others ==============================
        se14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == se1488.getId()) {

                    se1488x.setVisibility(View.VISIBLE);
                    se1488x.requestFocus();

                } else {

                    se1488x.setVisibility(View.GONE);
                    se1488x.setText(null);
                }
            }
        });


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
       /* if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("check", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                if (SaveDraft()) {

                    if (UpdateDB()) {
                        Toast.makeText(this, "Saving Form", Toast.LENGTH_SHORT).show();

                        finish();

                        startActivity(new Intent(this, AntenatalCareActivity.class));
                    } else {
                        Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSocioEco();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject socioeco = new JSONObject();

        socioeco.put("se01", se0101.isChecked() ? "1" : se0102.isChecked() ? "2" : se0103.isChecked() ? "3"
                : se0104.isChecked() ? "4" : se0105.isChecked() ? "5" : se0106.isChecked() ? "6"
                : se0188.isChecked() ? "88" : "0");
        socioeco.put("se0188x", se0188x.getText().toString());
        socioeco.put("se02a", se02a01.isChecked() ? "1" : se02a02.isChecked() ? "2" : se02a03.isChecked() ? "3"
                : se02a04.isChecked() ? "4" : se02a05.isChecked() ? "5" : se02a06.isChecked() ? "6"
                : se02a07.isChecked() ? "7" : se02a08.isChecked() ? "8" : se02a88.isChecked() ? "88" : "0");
        socioeco.put("se02a88x", se02a88x.getText().toString());
        socioeco.put("se02b", se02b01.isChecked() ? "1" : se02b02.isChecked() ? "2" : se02b03.isChecked() ? "3"
                : se02b04.isChecked() ? "4" : se02b05.isChecked() ? "5" : se02b06.isChecked() ? "6"
                : se02b07.isChecked() ? "7" : se02b08.isChecked() ? "8" : se02b09.isChecked() ? "9"
                : se02b10.isChecked() ? "10" : se02b11.isChecked() ? "11" : se02b88.isChecked() ? "88" : "0");
        socioeco.put("se02b88x", se02b88x.getText().toString());
        socioeco.put("se02c", se02c01.isChecked() ? "1" : se02c02.isChecked() ? "2" : se02c03.isChecked() ? "3"
                : se02c04.isChecked() ? "4" : se02c05.isChecked() ? "5" : se02c06.isChecked() ? "6"
                : se02c07.isChecked() ? "7" : se02c08.isChecked() ? "8" : se02c09.isChecked() ? "9"
                : se02b88.isChecked() ? "88" : "0");
        socioeco.put("se02c88x", se02b88x.getText().toString());
        socioeco.put("se03", se0301.isChecked() ? "1" : se0302.isChecked() ? "2" : se0303.isChecked() ? "3" : "0");
        socioeco.put("se04", se04.getText().toString());
        socioeco.put("se05", se0501.isChecked() ? "1" : se0502.isChecked() ? "2" : "0");
        socioeco.put("se06", se0601.isChecked() ? "1" : se0602.isChecked() ? "2" : se0603.isChecked() ? "3"
                : se0604.isChecked() ? "4" : se0605.isChecked() ? "5" : se0606.isChecked() ? "6"
                : se0607.isChecked() ? "7" : se0608.isChecked() ? "8" : se0609.isChecked() ? "9"
                : se0610.isChecked() ? "10" : se0611.isChecked() ? "11" : se0688.isChecked() ? "88" : "0");
        socioeco.put("se0688x", se0688x.getText().toString());
        socioeco.put("se07", se0701.isChecked() ? "1" : se0702.isChecked() ? "2" : se0703.isChecked() ? "3"
                : se0704.isChecked() ? "4" : se0705.isChecked() ? "5" : se0706.isChecked() ? "6"
                : se0707.isChecked() ? "7" : se0708.isChecked() ? "8" : se0709.isChecked() ? "9"
                : se0710.isChecked() ? "10" : se0711.isChecked() ? "11" : se0712.isChecked() ? "12"
                : se0713.isChecked() ? "13" : se0714.isChecked() ? "14" : se0715.isChecked() ? "15"
                : se0788.isChecked() ? "88" : "0");
        socioeco.put("se0788x", se0788x.getText().toString());
        socioeco.put("se08", se0801.isChecked() ? "1" : se0802.isChecked() ? "2" : se0803.isChecked() ? "3"
                : se0804.isChecked() ? "4" : se0805.isChecked() ? "5" : se0806.isChecked() ? "6"
                : se0807.isChecked() ? "7" : se0808.isChecked() ? "8" : se0809.isChecked() ? "9"
                : se0810.isChecked() ? "10" : se0811.isChecked() ? "11" : se0812.isChecked() ? "12"
                : se0813.isChecked() ? "13" : se0814.isChecked() ? "14" : se0815.isChecked() ? "15"
                : se0888.isChecked() ? "88" : "0");
        socioeco.put("se0888x", se0888x.getText().toString());
        socioeco.put("se09", se0901.isChecked() ? "1" : se0902.isChecked() ? "2" : "0");
        socioeco.put("se10", se10.getText().toString());
        socioeco.put("se11", se1101.isChecked() ? "1" : se1102.isChecked() ? "2" : se1103.isChecked() ? "3"
                : se1104.isChecked() ? "4" : "0");
        socioeco.put("se12", se1201.isChecked() ? "1" : se1202.isChecked() ? "2" : "0");
        socioeco.put("se1301", se1301.isChecked() ? "1" : "0");
        socioeco.put("se1302", se1302.isChecked() ? "2" : "0");
        socioeco.put("se1303", se1303.isChecked() ? "3" : "0");
        socioeco.put("se1304", se1304.isChecked() ? "4" : "0");
        socioeco.put("se1305", se1305.isChecked() ? "5" : "0");
        socioeco.put("se1306", se1306.isChecked() ? "6" : "0");
        socioeco.put("se1388", se1388.isChecked() ? "88" : "0");
        socioeco.put("se1388x", se1388x.getText().toString());
        socioeco.put("se14", se1401.isChecked() ? "1" : se1402.isChecked() ? "2" : se1403.isChecked() ? "3"
                : se1404.isChecked() ? "4" : se1405.isChecked() ? "5" : se1406.isChecked() ? "6"
                : se1407.isChecked() ? "7" : se1408.isChecked() ? "8" : se1409.isChecked() ? "9"
                : se1410.isChecked() ? "10" : se1411.isChecked() ? "11" : se1488.isChecked() ? "88" : "0");
        socioeco.put("se1488x", se1488x.getText().toString());
        socioeco.put("se15", se1501.isChecked() ? "1" : se1502.isChecked() ? "2" : "0");
        socioeco.put("se16", se16.getText().toString());
        socioeco.put("se17", se1701.isChecked() ? "1" : se1702.isChecked() ? "2" : "0");
        socioeco.put("se18", se1801.isChecked() ? "1" : se1802.isChecked() ? "2" : "0");
        socioeco.put("se19", se1901.isChecked() ? "1" : se1902.isChecked() ? "2" : "0");
        socioeco.put("se20", se2001.isChecked() ? "1" : se2002.isChecked() ? "2" : "0");
        socioeco.put("se2101", se2101.getText().toString());
        socioeco.put("se2102", se2102.getText().toString());
        socioeco.put("se2199", se2199.isChecked() ? "99" : "0");
        socioeco.put("se2201", se2201.getText().toString());
        socioeco.put("se2202", se2202.getText().toString());
        socioeco.put("se2203", se2203.getText().toString());
        socioeco.put("se2204", se2204.getText().toString());
        socioeco.put("se2205", se2205.getText().toString());
        socioeco.put("se2206", se2206.getText().toString());
        socioeco.put("se2207", se2207.getText().toString());
        socioeco.put("se2208", se2208.getText().toString());
        socioeco.put("se2209", se2209.getText().toString());
        socioeco.put("se2210", se2210.getText().toString());
        socioeco.put("se2211", se2211.getText().toString());
        socioeco.put("se2212", se2212.getText().toString());
        socioeco.put("se2213", se2213.getText().toString());
        socioeco.put("se2214", se2214.getText().toString());
        socioeco.put("se2215", se2215.getText().toString());
        socioeco.put("se2216", se2216.getText().toString());
        socioeco.put("se2217", se2217.getText().toString());
        socioeco.put("se2218", se2218.getText().toString());
        socioeco.put("se2219", se2219.getText().toString());
        socioeco.put("se2220", se2220.getText().toString());


        AppMain.fc.setSocioEconomic(String.valueOf(socioeco));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        return true;
    }

    private boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ============ Q 8.01 =======================
        // RadioGroup
        if (se01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01), Toast.LENGTH_LONG).show();
            se0188.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se01: This data is Required!");
            return false;
        } else {
            se0188.setError(null);
        }

        // Others / EditText Q 8.01
        if (se0188.isChecked() && se0188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se01) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0188x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se01: This data is Required!");
            return false;
        } else {
            se0188x.setError(null);
        }

        // ============ Q 8.02(a) =======================
        // RadioGroup
        if (se02a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02a), Toast.LENGTH_LONG).show();
            se02a88.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se02a: This data is Required!");
            return false;
        } else {
            se02a88.setError(null);
        }

        // Others / EditText Q 8.02 (a)
        if (se02a88.isChecked() && se02a88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02a) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se02a88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se02a: This data is Required!");
            return false;
        } else {
            se02a88x.setError(null);
        }

        // ============ Q 8.02(b) =======================
        // RadioGroup
        if (se02b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02b), Toast.LENGTH_LONG).show();
            se02b88.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se02b: This data is Required!");
            return false;
        } else {
            se02b88.setError(null);
        }

        // Others / EditText Q 8.02 (b)
        if (se02b88.isChecked() && se02b88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02b) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se02b88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se02b: This data is Required!");
            return false;
        } else {
            se02b88x.setError(null);
        }

        // ============ Q 8.02(c) =======================
        // RadioGroup
        if (se02c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02c), Toast.LENGTH_LONG).show();
            se02c88.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se02c: This data is Required!");
            return false;
        } else {
            se02c88.setError(null);
        }

        // Others / EditText Q 8.02 (c)
        if (se02c88.isChecked() && se02c88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se02c) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se02c88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se02c: This data is Required!");
            return false;
        } else {
            se02c88x.setError(null);
        }

        // ============ Q 8.03 =======================
        // RadioGroup
        if (se03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se03), Toast.LENGTH_LONG).show();
            se0303.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se03: This data is Required!");
            return false;
        } else {
            se0303.setError(null);
        }

        // ============== Q 8.04 =================
        if (se04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se04.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se04: This data is Required!");
            return false;
        } else {
            se04.setError(null);
        }

        if ((Integer.parseInt(se04.getText().toString()) < 1) || (Integer.parseInt(se04.getText().toString()) > 20)) {
            Toast.makeText(this, "Range is 0 - 20 Rooms", Toast.LENGTH_LONG).show();
            se04.setError("Range is 0 - 20 Rooms.. Check Again");// Set Error on last radio button
            return false;

        } else {
            se04.setError(null);
        }
        // ============ Q 8.05 =======================
        // RadioGroup
        if (se05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se05), Toast.LENGTH_LONG).show();
            se0502.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se05: This data is Required!");
            return false;
        } else {
            se0502.setError(null);
        }

        // ============ Q 8.06 =======================
        // RadioGroup
        if (se06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se06), Toast.LENGTH_LONG).show();
            se0688.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se06: This data is Required!");
            return false;
        } else {
            se0688.setError(null);
        }

        // Others / EditText Q 8.06
        if (se0688.isChecked() && se0688x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se06) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0688x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se06: This data is Required!");
            return false;
        } else {
            se0688x.setError(null);
        }
        if (se07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se07), Toast.LENGTH_LONG).show();
            se0788.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se08: This data is Required!");
            return false;
        } else {
            se0788.setError(null);
        }

        // ============ Q 8.08 =======================
        // RadioGroup
        if (se08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se08), Toast.LENGTH_LONG).show();
            se0888.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se08: This data is Required!");
            return false;
        } else {
            se0888.setError(null);
        }

        // Others / EditText Q 8.08
        if (se0888.isChecked() && se0888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se08) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se0888x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se08: This data is Required!");
            return false;
        } else {
            se0888x.setError(null);
        }

        // ============ Q 8.09 =======================
        // RadioGroup
        if (se09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se09), Toast.LENGTH_LONG).show();
            se0902.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se09: This data is Required!");
            return false;
        } else {
            se0902.setError(null);
        }

        // ============ Q 8.09 to 8.11 Skip Check =======================

        if (se0901.isChecked()) {
            if (se10.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.se10) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                se10.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "se10: This data is Required!");
                return false;
            } else {
                se10.setError(null);
            }

            if ((Integer.parseInt(se10.getText().toString()) < 1) || (Integer.parseInt(se10.getText().toString()) > 180)) {
                Toast.makeText(this, "Range is 1 - 180 Minutes", Toast.LENGTH_LONG).show();
                se10.setError("Range is 1 - 180 Minutes.. Check Again");// Set Error on last radio button
                return false;

            } else {
                se10.setError(null);
            }

            if (se11.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.se11), Toast.LENGTH_LONG).show();
                se1104.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "se11: This data is Required!");
                return false;
            } else {
                se1104.setError(null);
            }


        }

        // ======================== Q 8.12 ==================
        if (se12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se12) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se1202.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se12: This data is Required!");
            return false;
        } else {
            se1202.setError(null);
        }

        // ==================== Q 8.13 =========================
        if (se1201.isChecked()) {
            if (!(se1301.isChecked() || se1302.isChecked() || se1303.isChecked() || se1304.isChecked()
                    || se1304.isChecked() || se1305.isChecked() || se1306.isChecked() || se1388.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.se13), Toast.LENGTH_LONG).show();
                se1388.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "se13: This data is Required!");
                return false;
            } else {
                se1388.setError(null);
            }
        }

        // =================== Edit Text / Q 8.13 Others =================
        if (se1388.isChecked() && se1388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se13), Toast.LENGTH_LONG).show();
            se1388x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se13: This data is Required!");
            return false;
        } else {
            se1388x.setError(null);
        }

        // ======================== Q 8.14 ==================
        if (se14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se14) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            se1488.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se14: This data is Required!");
            return false;
        } else {
            se1488.setError(null);
        }
        // =================== Edit Text / Q 8.14 Others =================
        if (se1488.isChecked() && se1488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se14), Toast.LENGTH_LONG).show();
            se1488x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "se14: This data is Required!");
            return false;
        } else {
            se1488x.setError(null);
        }

        // ============ Q 8.15 =======================
        // RadioGroup
        if (se15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se15), Toast.LENGTH_LONG).show();
            se1502.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se15: This data is Required!");
            return false;
        } else {
            se1502.setError(null);
        }

        // ============= Skip Check Q 8.15 ===============

        if (se1501.isChecked()) {
            if (se16.getText().toString().isEmpty()) {
                Toast.makeText(this, "Empty(Require): " + getString(R.string.se16), Toast.LENGTH_LONG).show();
                se16.setError("This data is required!");
                return false;

            } else {
                se16.setError(null);
            }
            if ((Integer.parseInt(se16.getText().toString()) < 1) || (Integer.parseInt(se16.getText().toString()) > 180)) {
                Toast.makeText(this, "Range is 1 - 180", Toast.LENGTH_LONG).show();
                se16.setError("Range is 1 - 180 .. Check Again");// Set Error on last radio button
                Log.d(TAG, "ValidateForm: 0816 not selected");
                return false;

            } else {
                se16.setError(null);
            }

        } else {
            se16.setError(null);
        }

        // ============ Q 8.17 =======================
        // RadioGroup
        if (se17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se17), Toast.LENGTH_LONG).show();
            se1702.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se17: This data is Required!");
            return false;
        } else {
            se1702.setError(null);
        }

        // ============ Q 8.18 =======================
        // RadioGroup
        if (se18.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se18), Toast.LENGTH_LONG).show();
            se1802.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se18: This data is Required!");
            return false;
        } else {
            se1802.setError(null);
        }

        // ============ Q 8.19 =======================
        // RadioGroup
        if (se19.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se19), Toast.LENGTH_LONG).show();
            se1902.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se19: This data is Required!");
            return false;
        } else {
            se1902.setError(null);
        }

        // ============ Q 8.20 =======================
        // RadioGroup
        if (se20.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se20), Toast.LENGTH_LONG).show();
            se2002.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "se20: This data is Required!");
            return false;
        } else {
            se2002.setError(null);
        }

        // =========== Skip Check Q 8.20 =============

        if (se2001.isChecked()) {
            if (!(se2199.isChecked())) {
                if (se2101.getText().toString().isEmpty() && se2102.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.se21), Toast.LENGTH_LONG).show();
                    se2199.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "se21: This data is Required!");
                    return false;
                } else {
                    se2199.setError(null);
                }
                if (!se2101.getText().toString().isEmpty()) {
                    if ((Integer.parseInt(se2101.getText().toString()) < 1) || (Integer.parseInt(se2101.getText().toString()) > 999)) {
                        Toast.makeText(this, "Range is 0 - 999 acre", Toast.LENGTH_LONG).show();
                        se2101.setError("Range is 0 - 999 .. Check Again");// Set Error on last radio button
                        return false;

                    } else {
                        se2101.setError(null);
                    }
                }
                if (!se2102.getText().toString().isEmpty()) {
                    if ((Integer.parseInt(se2102.getText().toString()) < 1) || (Integer.parseInt(se2102.getText().toString()) > 999)) {
                        Toast.makeText(this, "Range is 0 - 999 ", Toast.LENGTH_LONG).show();
                        se2102.setError("Range is 0 - 999 .. Check Again");// Set Error on last radio button
                        return false;

                    } else {
                        se2102.setError(null);
                    }
                }
            }
        }

        if (se2201.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2201), Toast.LENGTH_LONG).show();
            se2201.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2201: This data is Required!");
            return false;
        } else {
            se2201.setError(null);
        }

        if (se2202.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2202), Toast.LENGTH_LONG).show();
            se2202.setError("This data is Required! or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2202: This data is Required!");
            return false;
        } else {
            se2202.setError(null);
        }

        if (se2203.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2203), Toast.LENGTH_LONG).show();
            se2203.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2203: This data is Required!");
            return false;
        } else {
            se2203.setError(null);
        }

        if (se2204.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2204), Toast.LENGTH_LONG).show();
            se2204.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2204: This data is Required!");
            return false;
        } else {
            se2204.setError(null);
        }

        if (se2205.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2205), Toast.LENGTH_LONG).show();
            se2205.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2205: This data is Required!");
            return false;
        } else {
            se2205.setError(null);
        }

        if (se2206.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2206), Toast.LENGTH_LONG).show();
            se2206.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2206: This data is Required!");
            return false;
        } else {
            se2206.setError(null);
        }

        if (se2207.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2207), Toast.LENGTH_LONG).show();
            se2207.setError("This data is Required! Or type 'none'");    // Set Error on last radio button

            Log.i(TAG, "se2207: This data is Required!");
            return false;
        } else {
            se2207.setError(null);
        }

        if (se2208.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2208), Toast.LENGTH_LONG).show();
            se2208.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2208: This data is Required!");
            return false;
        } else {
            se2208.setError(null);
        }

        if (se2209.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2209), Toast.LENGTH_LONG).show();
            se2209.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2209: This data is Required!");
            return false;
        } else {
            se2209.setError(null);
        }

        if (se2210.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2210), Toast.LENGTH_LONG).show();
            se2210.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2210: This data is Required!");
            return false;
        } else {
            se2210.setError(null);
        }

        if (se2211.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2211), Toast.LENGTH_LONG).show();
            se2211.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2211: This data is Required!");
            return false;
        } else {
            se2211.setError(null);
        }

        if (se2212.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2212), Toast.LENGTH_LONG).show();
            se2212.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2212: This data is Required!");
            return false;
        } else {
            se2212.setError(null);
        }

        if (se2213.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2213), Toast.LENGTH_LONG).show();
            se2213.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2213: This data is Required!");
            return false;
        } else {
            se2213.setError(null);
        }

        if (se2214.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2214), Toast.LENGTH_LONG).show();
            se2214.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2214: This data is Required!");
            return false;
        } else {
            se2214.setError(null);
        }

        if (se2215.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2215), Toast.LENGTH_LONG).show();
            se2215.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2215: This data is Required!");
            return false;
        } else {
            se2215.setError(null);
        }

        if (se2216.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2216), Toast.LENGTH_LONG).show();
            se2216.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2216: This data is Required!");
            return false;
        } else {
            se2216.setError(null);
        }

        if (se2217.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2217), Toast.LENGTH_LONG).show();
            se2217.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2217: This data is Required!");
            return false;
        } else {
            se2217.setError(null);
        }

        if (se2218.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2218), Toast.LENGTH_LONG).show();
            se2218.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2218: This data is Required!");
            return false;
        } else {
            se2218.setError(null);
        }

        if (se2219.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2219), Toast.LENGTH_LONG).show();
            se2219.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2219: This data is Required!");
            return false;
        } else {
            se2219.setError(null);
        }

        if (se2220.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.se2220), Toast.LENGTH_LONG).show();
            se2220.setError("This data is Required! Or Place 0");    // Set Error on last radio button

            Log.i(TAG, "se2220: This data is Required!");
            return false;
        } else {
            se2220.setError(null);
        }


        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}