package edu.aku.hassannaqvi.amanmidterm.contract;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class CommunityWorkerContract {

    private static final String TAG = "FollowUps_CONTRACT";
    String ID;
    String achwcode;
    String achwname;
    String paracode;
    String paraname;
    String hhto;
    String hhfrom;


    public CommunityWorkerContract() {
        // Default Constructor
    }

    public CommunityWorkerContract(List<CommunityWorkerContract> l,int pos) {
        this.ID = l.get(pos).getID();
        this.achwcode = l.get(pos).getAchwcode();
        this.achwname = l.get(pos).getAchwname();
        this.paracode = l.get(pos).getParacode();
        this.paraname = l.get(pos).getParaname();
        this.hhto = l.get(pos).getHhto();
        this.hhfrom = l.get(pos).getHhfrom();
    }

    public CommunityWorkerContract Sync(JSONObject jsonObject) throws JSONException {
        this.achwcode= jsonObject.getString(communityWorker.COLUMN_ACHWCODE);
        this.achwname= jsonObject.getString(communityWorker.COLUMN_ACHWNAME);
        this.paracode= jsonObject.getString(communityWorker.COLUMN_PARACODE);
        this.paraname= jsonObject.getString(communityWorker.COLUMN_PARANAME);
        this.hhto= jsonObject.getString(communityWorker.COLUMN_HHTO);
        this.hhfrom= jsonObject.getString(communityWorker.COLUMN_HHFROM);

        return this;

    }

    public CommunityWorkerContract HydratePara(Cursor cursor) {
        this.paracode = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_PARACODE));
        this.paraname = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_PARANAME));
        return this;
    }

    public CommunityWorkerContract HydrateACHW(Cursor cursor) {
        this.paracode = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_PARACODE));
        this.paraname = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_PARANAME));
        this.achwcode = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_ACHWCODE));
        this.achwname = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_ACHWNAME));
        this.hhto = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_HHTO));
        this.hhfrom = cursor.getString(cursor.getColumnIndex(communityWorker.COLUMN_HHFROM));
        return this;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAchwcode() {
        return achwcode;
    }

    public void setAchwcode(String achwcode) {
        this.achwcode = achwcode;
    }

    public String getAchwname() {
        return achwname;
    }

    public void setAchwname(String achwname) {
        this.achwname = achwname;
    }

    public String getParacode() {
        return paracode;
    }

    public void setParacode(String paracode) {
        this.paracode = paracode;
    }

    public String getParaname() {
        return paraname;
    }

    public void setParaname(String paraname) {
        this.paraname = paraname;
    }

    public String getHhto() {
        return hhto;
    }

    public void setHhto(String hhto) {
        this.hhto = hhto;
    }

    public String getHhfrom() {
        return hhfrom;
    }

    public void setHhfrom(String hhfrom) {
        this.hhfrom = hhfrom;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(communityWorker.COLUMN_ID, this.ID == null ? JSONObject.NULL : this.ID);
        json.put(communityWorker.COLUMN_ACHWCODE, this.achwcode == null ? JSONObject.NULL : this.achwcode);
        json.put(communityWorker.COLUMN_ACHWNAME, this.achwname == null ? JSONObject.NULL : this.achwname);
        json.put(communityWorker.COLUMN_PARACODE, this.paracode == null ? JSONObject.NULL : this.paracode);
        json.put(communityWorker.COLUMN_PARANAME, this.paraname == null ? JSONObject.NULL : this.paraname);
        json.put(communityWorker.COLUMN_HHTO, this.hhto == null ? JSONObject.NULL : this.hhto);
        json.put(communityWorker.COLUMN_HHFROM, this.hhfrom == null ? JSONObject.NULL : this.hhfrom);

        return json;
    }


    public static abstract class communityWorker  implements BaseColumns {

        public static final String TABLE_NAME = "chws";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_ACHWCODE = "achwcode";
        public static final String COLUMN_ACHWNAME = "achwname";
        public static final String COLUMN_PARACODE = "paracode";
        public static final String COLUMN_PARANAME = "paraname";
        public static final String COLUMN_HHTO = "hhto";
        public static final String COLUMN_HHFROM = "hhfrom";


        public static final String _URI = "getchws.php";
    }
}