package edu.aku.hassannaqvi.amanmidterm.contract;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class SectionIMsContract {

    private static final String TAG = "Section7_CONTRACT";

    private final String projectName = "AMAN CHP 2016-17";
    //private final String surveyType = "Eligibility";
    private String _ID = "";
    private String _UID = "";
    //   private String UUID = "";
    private String childName = "";
    private String user = ""; // Interviewer

    private String s7 = "";


    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";


    public SectionIMsContract() {
    }

    public static String getTAG() {
        return TAG;
    }

    public SectionIMsContract sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(Section7Table._ID);
        this._UID = jsonObject.getString(Section7Table.COLUMN_UID);
        //  this.UUID = jsonObject.getString(Section7Table.COLUMN_UUID);
        this.user = jsonObject.getString(Section7Table.COLUMN_USER);
        this.childName = jsonObject.getString(Section7Table.COLUMN_CHILDNAME);
        this.s7 = jsonObject.getString(Section7Table.COLUMN_S7);
        this.gpsLat = jsonObject.getString(Section7Table.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(Section7Table.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(Section7Table.COLUMN_GPSDT);
        this.gpsAcc = jsonObject.getString(Section7Table.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(Section7Table.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(Section7Table.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(Section7Table.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(Section7Table.COLUMN_SYNCED_DATE);


        return this;
    }

    public SectionIMsContract hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(Section7Table._ID));
        this._UID = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_UID));
        //   this.UUID = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_UUID));
        this.user = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_USER));
        this.childName = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_CHILDNAME));
        this.s7 = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_S7));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_GPSDT));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_DEVICETAGID));
        this.synced = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(Section7Table.COLUMN_SYNCED_DATE));

        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

/*
    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
*/

    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getS7() {
        return s7;
    }

    public void setS7(String s7) {
        this.s7 = s7;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(Section7Table.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(Section7Table._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Section7Table.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
        //  json.put(Section7Table.COLUMN_UUID, this.UUID == null ? JSONObject.NULL : this.UUID);
        json.put(Section7Table.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(Section7Table.COLUMN_CHILDNAME, this.childName == null ? JSONObject.NULL : this.childName);
//        json.put(Section7Table.COLUMN_S7, this.s7 == null ? JSONObject.NULL : this.s7);

        try {
        if (!this.s7.equals("")) {
            json.put(Section7Table.COLUMN_S7, new JSONObject(this.s7));
        }
        } catch (Exception e) {

        }

        json.put(Section7Table.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(Section7Table.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(Section7Table.COLUMN_GPSDT, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(Section7Table.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(Section7Table.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(Section7Table.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(Section7Table.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(Section7Table.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);

        return json;
    }

    public static abstract class Section7Table implements BaseColumns {

        public static final String URI = "syncims.php";
        public static final String TABLE_NAME = "ims";

        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN_UID = "_uid";
        //   public static final String COLUMN_UUID = "uuid";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_CHILDNAME = "childname";
        public static final String COLUMN_S7 = "s7";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSDT = "gpsdt";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

    }

}