package edu.aku.hassannaqvi.amanmidterm.contract;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class IMsContract {

    private static final String TAG = "IM_CONTRACT";

    private final String projectName = "AMAN CHP 2016-17";
    //private final String surveyType = "Eligibility";
    private String _ID = "";
    private String _UID = "";
    private String UUID = "";
    private String childName = "";
    private String user = ""; // Interviewer

    private String sCM = "";


    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";


    public IMsContract() {
    }

    public static String getTAG() {
        return TAG;
    }

    public IMsContract sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(singleIm.COLUMN__ID);
        this._UID = jsonObject.getString(singleIm.COLUMN__UID);
        this.UUID = jsonObject.getString(singleIm.COLUMN_UUID);
        this.user = jsonObject.getString(singleIm.COLUMN_USER);
        this.childName = jsonObject.getString(singleIm.COLUMN_CHILDNAME);
        this.sCM = jsonObject.getString(singleIm.COLUMN_SCM);
        this.gpsLat = jsonObject.getString(singleIm.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(singleIm.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(singleIm.COLUMN_GPSDT);
        this.gpsAcc = jsonObject.getString(singleIm.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(singleIm.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(singleIm.COLUMN_DEVICETAGID);
        this.synced = jsonObject.getString(singleIm.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(singleIm.COLUMN_SYNCED_DATE);


        return this;
    }

    public IMsContract hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN__ID));
        this._UID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN__UID));
        this.UUID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_UUID));
        this.user = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_USER));
        this.childName = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_CHILDNAME));
        this.sCM = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_SCM));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSDT));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_DEVICETAGID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleIm.COLUMN_SYNCED_DATE));

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

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

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

    public String getsCM() {
        return sCM;
    }

    public void setsCM(String sCM) {
        this.sCM = sCM;
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

        json.put(singleIm.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(singleIm.COLUMN__ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleIm.COLUMN__UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(singleIm.COLUMN_UUID, this.UUID == null ? JSONObject.NULL : this.UUID);
        json.put(singleIm.COLUMN_USER, this.user == null ? JSONObject.NULL : this.user);
        json.put(singleIm.COLUMN_CHILDNAME, this.childName == null ? JSONObject.NULL : this.childName);
        json.put(singleIm.COLUMN_SCM, this.sCM == null ? JSONObject.NULL : this.sCM);
        json.put(singleIm.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleIm.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleIm.COLUMN_GPSDT, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(singleIm.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleIm.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleIm.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(singleIm.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleIm.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);

        return json;
    }

    public static abstract class singleIm implements BaseColumns {

        public static final String TABLE_NAME = "ims";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN__ID = "_id ";
        public static final String COLUMN__UID = "_uid ";
        public static final String COLUMN_UUID = "uuid ";
        public static final String COLUMN_USER = "user";
        public static final String COLUMN_CHILDNAME = "childname ";
        public static final String COLUMN_SCM = "scm ";
        public static final String COLUMN_GPSLAT = "gpslat ";
        public static final String COLUMN_GPSLNG = "gpslng ";
        public static final String COLUMN_GPSDT = "gpsdt ";
        public static final String COLUMN_GPSACC = "gpsacc ";
        public static final String COLUMN_DEVICEID = "deviceid ";
        public static final String COLUMN_DEVICETAGID = "devicetagid ";
        public static final String COLUMN_SYNCED = "synced ";
        public static final String COLUMN_SYNCED_DATE = "synced_date ";
        public static final String URI = "/syncforms.php";
        public static final String _ID = "id";
        public static final String COLUMN_CHID = "CHID";
        public static final String COLUMN_UID = "UID";
        public static final String COLUMN_IM = "IM";

    }

}