package edu.aku.hassannaqvi.amanmidterm.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.amanmidterm.R;
import edu.aku.hassannaqvi.amanmidterm.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.amanmidterm.core.AppMain;
import edu.aku.hassannaqvi.amanmidterm.get.GetUsers;
import edu.aku.hassannaqvi.amanmidterm.sync.SyncForms;
import edu.aku.hassannaqvi.amanmidterm.sync.SyncIMs;

public class MainActivity extends Activity {

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.recordSummary)
    TextView recordSummary;
    @BindView(R.id.psuNo)
    EditText psuNo;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";
    private String rSumText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // Reset working variables
        AppMain.childName = "Test";
        //AppMain.chCount = 0;
        AppMain.chTotal = 0;

        if (AppMain.admin) {
            adminsec.setVisibility(View.VISIBLE);
        } else {
            adminsec.setVisibility(View.GONE);
        }

        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        ImageView img = new ImageView(getApplicationContext());
        img.setImageResource(R.drawable.tagimg);
        img.setPadding(0,15,0,15);
        builder.setCustomTitle(img);

        final EditText input = new EditText(MainActivity.this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                if (!m_Text.equals("")) {
                    editor.putString("tagName", m_Text);
                    editor.commit();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        if (sharedPref.getString("tagName", null) == "" || sharedPref.getString("tagName", null) == null) {
            builder.show();
        }


     /*   DatabaseHelper db = new DatabaseHelper(this);
        Collection<FormsContract> todaysForms = new ArrayList<>();

        todaysForms = db.getTodayForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";
        rSumText += "=======================";
        rSumText += "\r\n\r\n";
        rSumText += "Total Forms Today: " + todaysForms.size();
        rSumText += "\r\n";
        rSumText += "    Forms List: \r\n";
        String iStatus = "";
        for (FormsContract fc : todaysForms) {

            switch (fc.getiStatus()) {
                case "1":
                    iStatus = "Complete";
                    break;
                case "2":
                    iStatus = "House Locked";
                    break;
                case "3":
                    iStatus = "Refused";
                    break;
                case "4":
                    iStatus = "Refused";
                    break;
            }

            rSumText += fc.getPrimaryUnit() + " " + fc.getHouseHold() + " " + iStatus;
            rSumText += "\r\n";

        }

        rSumText += "--------------------------------------------------\r\n";
        if (AppMain.admin) {
            adminsec.setVisibility(View.VISIBLE);
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Update: " + syncPref.getString("LastUpdate", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Synced(DB): " + syncPref.getString("LastSyncDB", "Never Synced");
            rSumText += "\r\n";
        }
        recordSummary.setText(rSumText);
*/

    }

    public void CheckPSU(View v) {
        if (!psuNo.getText().toString().isEmpty()) {

            psuNo.setError(null);

            Intent Flist = new Intent(this, FormsList.class);
            Flist.putExtra("psu_no", psuNo.getText().toString());
            startActivity(Flist);
        } else {
            Toast.makeText(this, "Error(Empty): Data Required", Toast.LENGTH_SHORT).show();
            psuNo.setError("Error(Empty): Data Required");
        }
    }

    public void openForm(View v) {
        if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null) {
            Intent oF = new Intent(MainActivity.this, AmanInfoActivity.class);
            startActivity(oF);
        } else {

            builder = new AlertDialog.Builder(MainActivity.this);
            ImageView img = new ImageView(getApplicationContext());
            img.setImageResource(R.drawable.tagimg);
            img.setPadding(0,15,0,15);
            builder.setCustomTitle(img);

            final EditText input = new EditText(MainActivity.this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    m_Text = input.getText().toString();
                    if (!m_Text.equals("")) {
                        editor.putString("tagName", m_Text);
                        editor.commit();

                        Intent oF = new Intent(MainActivity.this, AmanInfoActivity.class);
                        startActivity(oF);
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
        }
    }

    public void openA(View v) {
        Intent iA = new Intent(this, AmanInfoActivity.class);
        startActivity(iA);
    }

    public void openB(View v) {
        Intent iB = new Intent(this, SocioEconomicActivity.class);
        startActivity(iB);
    }

    public void openC(View v) {
        Intent iC = new Intent(this, AntenatalCareActivity.class);
        startActivity(iC);
    }

    public void openD(View v) {
        Intent iD = new Intent(this, DeliveryActivity.class);
        startActivity(iD);
    }

    public void openE(View v) {
        //Intent iD = new Intent(this, KAPActivity.class);
        Intent iD = new Intent(this, PostpartumCareActivity.class);
        startActivity(iD);
    }

    public void openF(View v) {
        //Intent iD = new Intent(this, SocioEconomicActivity.class);
        Intent iD = new Intent(this, IYCFActivity.class);
        startActivity(iD);
    }

    public void openIM(View v) {
        Intent iIM = new Intent(this, ChildVaccinationActivity.class);
        startActivity(iIM);
    }

    public void openG(View v) {
        Intent iG = new Intent(this, ChildMorbidityActivity.class);
        startActivity(iG);
    }

    public void openH(View v) {
        Intent iH = new Intent(this, MaternalMentalHealthActivity.class);
        startActivity(iH);
    }

    public void openI(View v) {
        Intent iI = new Intent(this, BirthsDeathsActivity.class);
        startActivity(iI);
    }

    public void openJ(View v) {
        Intent iI = new Intent(this, CounselingSessionsActivity.class);
        startActivity(iI);
    }

    public void openEnd(View v) {
        Intent iEnd = new Intent(this, EndingActivity.class);
        startActivity(iEnd);
    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    /*public void CheckCluster(View v) {
        Intent cluster_list = new Intent(getApplicationContext(), FormsList.class);
        cluster_list.putExtra("clusterno", clusterNo.getText().toString());
        startActivity(cluster_list);

    }*/
    public void syncServer(View view) {

        String formsUrl = AppMain._HOST_URL + "pssp/api/forms.php";
        String imsUrl = AppMain._HOST_URL + "pssp/api/ims.php";

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute();

            Toast.makeText(getApplicationContext(), "Syncing IMs", Toast.LENGTH_SHORT).show();
            new SyncIMs(this).execute();
            Toast.makeText(getApplicationContext(), "Syncing IMs", Toast.LENGTH_SHORT).show();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {
        if (isNetworkAvailable()) {


            GetUsers gu = new GetUsers(this);
            Toast.makeText(getApplicationContext(), "Syncing Users", Toast.LENGTH_SHORT).show();
            gu.execute();


            SharedPreferences syncPref = getSharedPreferences("SyncInfo(DOWN)", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastSyncDevice ", dtToday);

            editor.apply();

        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private boolean isHostAvailable() {

        if (isNetworkAvailable()) {
            try {
                SocketAddress sockaddr = new InetSocketAddress(AppMain._IP, AppMain._PORT);
                // Create an unbound socket
                Socket sock = new Socket();

                // This method will block no more than timeoutMs.
                // If the timeout occurs, SocketTimeoutException is thrown.
                int timeoutMs = 2000;   // 2 seconds
                sock.connect(sockaddr, timeoutMs);
                return true;
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "Server Not Available for Update", Toast.LENGTH_SHORT).show();
                return false;
            }

        } else {
            Toast.makeText(getApplicationContext(), "Network not available for Update", Toast.LENGTH_SHORT).show();
            return false;

        }
    }


}
