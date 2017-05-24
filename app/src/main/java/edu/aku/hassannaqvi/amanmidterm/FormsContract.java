package edu.aku.hassannaqvi.amanmidterm;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by hassan.naqvi on 10/25/2016.
 */

public class FormsContract {

    private final String projectName = "Sero 2016-17";
    private final String surveyType = "SN";
    public String Round = "2";
    private String _ID = "";
    private String FUID = "";
    private String formDateTime = ""; // Date
    private String mna2 = "0000"; // DC name
    private String mna3 = ""; // District
    private String mna4 = ""; // PSU
    private String mna5 = ""; // HH no.
    private String childName = ""; // Index Child Name
    private String motherName = ""; // Index Child Name
    private String mna6a = ""; // Name Confirmation
    private String iStatus = ""; // Form Status
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    // MODULES
    private String antenatalCare = "";
    private String basicInfo = "";
    private String childHealth = "";
    private String childMorbidity = "";
    private String childVaccination = "";
    private String delivery = "";
    private String immunization = "";
    private String indexChild = "";
    private String kap = "";
    private String labInfo = "";
    private String neonatalHealth = "";
    private String postpartumCare = "";
    private String socioEconomic = "";



    public FormsContract() {
    }

    public FormsContract(String formDateTime, String mna5, String iStatus) {
        this.formDateTime = formDateTime;
        this.mna5 = mna5;
        this.iStatus = iStatus;
    }

    public FormsContract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(singleForm._ID);
        this.FUID = jsonObject.getString(singleForm.COLUMN_FUID);
        this.formDateTime = jsonObject.getString(singleForm.COLUMN_MNA1);
        this.mna2 = jsonObject.getString(singleForm.COLUMN_MNA2);
        this.mna3 = jsonObject.getString(singleForm.COLUMN_MNA3);
        this.mna4 = jsonObject.getString(singleForm.COLUMN_MNA4);
        this.mna5 = jsonObject.getString(singleForm.COLUMN_MNA5);
        this.childName = jsonObject.getString(singleForm.COLUMN_MNA6);
        this.mna6a = jsonObject.getString(singleForm.COLUMN_MNA6A);
        this.iStatus = jsonObject.getString(singleForm.COLUMN_MNA7);
        this.basicInfo = jsonObject.getString(singleForm.COLUMN_SA);
        this.indexChild = jsonObject.getString(singleForm.COLUMN_SB);
        this.childVaccination = jsonObject.getString(singleForm.COLUMN_SC);
        this.childHealth = jsonObject.getString(singleForm.COLUMN_SD);
        this.kap = jsonObject.getString(singleForm.COLUMN_SE);
        this.socioEconomic = jsonObject.getString(singleForm.COLUMN_SF);
        this.labInfo = jsonObject.getString(singleForm.COLUMN_SG);
        this.gpsLat = jsonObject.getString(singleForm.COLUMN_GPS_LAT);
        this.gpsLng = jsonObject.getString(singleForm.COLUMN_GPS_LNG);
        this.gpsTime = jsonObject.getString(singleForm.COLUMN_GPS_TIME);
        this.gpsAcc = jsonObject.getString(singleForm.COLUMN_GPS_ACC);
        this.deviceID = jsonObject.getString(singleForm.COLUMN_DEVICE_ID);
        this.synced = jsonObject.getString(singleForm.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(singleForm.COLUMN_SYNCED_DATE);
        this.Round = jsonObject.getString(singleForm.COLUMN_NAME_ROUND);

        return this;
    }

    public FormsContract hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleForm._ID));
        this.FUID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_FUID));
        this.formDateTime = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA1));
        this.mna2 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA2));
        this.mna3 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA3));
        this.mna4 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA4));
        this.mna5 = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA5));
        this.childName = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA6));
        this.mna6a = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA6A));
        this.iStatus = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MNA7));
        this.basicInfo = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SA));
        this.indexChild = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SB));
        this.childVaccination = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SC));
        this.childHealth = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SD));
        this.kap = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SE));
        this.socioEconomic = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SF));
        this.labInfo = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SG));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_LAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_LNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_TIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPS_ACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_DEVICE_ID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED_DATE));
        this.Round = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_ROUND));

        return this;
    }

    public String getID() {
        return _ID;
    }

    public void setID(String _ID) {
        this._ID = _ID;
    }

    public String getFUID() {
        return FUID;
    }

    public void setFUID(String FUID) {
        this.FUID = FUID;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String getFormDateTime() {
        return formDateTime;
    }

    public void setFormDateTime(String formDateTime) {
        this.formDateTime = formDateTime;
    }

    public String getMna2() {
        return mna2;
    }

    public void setMna2(String mna2) {
        this.mna2 = mna2;
    }

    public String getMna3() {
        return mna3;
    }

    public void setMna3(String mna3) {
        this.mna3 = mna3;
    }

    public String getMna4() {
        return mna4;
    }

    public void setMna4(String mna4) {
        this.mna4 = mna4;
    }

    public String getMna5() {
        return mna5;
    }

    public void setMna5(String mna5) {
        this.mna5 = mna5;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getMna6a() {
        return mna6a;
    }

    public void setMna6a(String mna6a) {
        this.mna6a = mna6a;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getBasicInfo() {
        return this.basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }

    public String getIndexChild() {

        return indexChild;
    }

    public void setIndexChild(String indexChild) {
        this.indexChild = indexChild;
    }

    public String getChildVaccination() {
        return childVaccination;
    }

    public void setChildVaccination(String childVaccination) {
        this.childVaccination = childVaccination;
    }

    public String getChildHealth() {
        return childHealth;
    }

    public void setChildHealth(String childHealth) {
        this.childHealth = childHealth;
    }

    public String getKap() {
        return kap;
    }

    public void setKap(String kap) {
        this.kap = kap;
    }

    public String getSocioEconomic() {
        return socioEconomic;
    }

    public void setSocioEconomic(String socioEconomic) {
        this.socioEconomic = socioEconomic;
    }

    public String getLabInfo() {
        return labInfo;
    }

    public void setLabInfo(String labInfo) {
        this.labInfo = labInfo;
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

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
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

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncedDate() {
        return synced_date;
    }

    public void setSyncedDate(String synced_date) {
        this.synced_date = synced_date;
    }

    public String getRound() {
        return Round;
    }

    public void setRound(String round) {
        Round = round;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleForm._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(singleForm.COLUMN_FUID, this.FUID == null ? JSONObject.NULL : this.FUID);
        json.put(singleForm.COLUMN_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(singleForm.COLUMN_SURVEY_TYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(singleForm.COLUMN_DEVICE_ID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleForm.COLUMN_GPS_LAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleForm.COLUMN_GPS_LNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleForm.COLUMN_GPS_TIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(singleForm.COLUMN_GPS_ACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleForm.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleForm.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);
        json.put(singleForm.COLUMN_MNA1, this.formDateTime == null ? JSONObject.NULL : this.formDateTime);
        json.put(singleForm.COLUMN_MNA2, this.mna2 == null ? JSONObject.NULL : this.mna2);
        json.put(singleForm.COLUMN_MNA3, this.mna3 == null ? JSONObject.NULL : this.mna3);
        json.put(singleForm.COLUMN_MNA4, this.mna4 == null ? JSONObject.NULL : this.mna4);
        json.put(singleForm.COLUMN_MNA5, this.mna5 == null ? JSONObject.NULL : this.mna5);
        json.put(singleForm.COLUMN_MNA6, this.childName == null ? JSONObject.NULL : this.childName);
        json.put(singleForm.COLUMN_MNA6A, this.mna6a == null ? JSONObject.NULL : this.mna6a);
        json.put(singleForm.COLUMN_MNA7, this.iStatus == null ? JSONObject.NULL : this.iStatus);


/*        json = jsonMerge(json, new JSONObject(this.basicInfo));
        json = jsonMerge(json, new JSONObject(this.indexChild));
        json = jsonMerge(json, new JSONObject(this.childVaccination));
        json = jsonMerge(json, new JSONObject(this.childHealth));
        json = jsonMerge(json, new JSONObject(this.kap));
        json = jsonMerge(json, new JSONObject(this.socioEconomic));
        json = jsonMerge(json, new JSONObject(this.labInfo));*/

        json.put(singleForm.COLUMN_SA, this.basicInfo == null ? JSONObject.NULL : this.basicInfo);
        json.put(singleForm.COLUMN_SB, this.indexChild == null ? JSONObject.NULL : this.indexChild);
        json.put(singleForm.COLUMN_SB, this.indexChild == null ? JSONObject.NULL : this.indexChild);
        json.put(singleForm.COLUMN_SC, this.childVaccination == null ? JSONObject.NULL : this.childVaccination);
        json.put(singleForm.COLUMN_SD, this.childHealth == null ? JSONObject.NULL : this.childHealth);
        json.put(singleForm.COLUMN_SE, this.kap == null ? JSONObject.NULL : this.kap);
        json.put(singleForm.COLUMN_SF, this.socioEconomic == null ? JSONObject.NULL : this.socioEconomic);
        json.put(singleForm.COLUMN_SG, this.labInfo == null ? JSONObject.NULL : this.labInfo);

        json.put(singleForm.COLUMN_NAME_ROUND, this.Round);

        return json;
    }

    public JSONObject jsonMerge(JSONObject o1, JSONObject o2) throws JSONException {

        JSONObject jm = new JSONObject();

        //I assume that your two JSONObjects are o1 and o2
        JSONObject mergedObj = new JSONObject();

        Iterator i1 = o1.keys();
        Iterator i2 = o2.keys();
        String tmp_key;
        while (i1.hasNext()) {
            tmp_key = (String) i1.next();
            mergedObj.put(tmp_key, o1.get(tmp_key));
        }
        while (i2.hasNext()) {
            tmp_key = (String) i2.next();
            mergedObj.put(tmp_key, o2.get(tmp_key));
        }

        return mergedObj;
    }

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "id";
        public static final String COLUMN_FUID = "fuid";
        public static final String COLUMN_PROJECT_NAME = "projectname";
        public static final String COLUMN_SURVEY_TYPE = "surveytype";
        public static final String COLUMN_DEVICE_ID = "deviceid";
        public static final String COLUMN_GPS_LAT = "gpslat";
        public static final String COLUMN_GPS_LNG = "gpslng";
        public static final String COLUMN_GPS_ACC = "gpsacc";
        public static final String COLUMN_GPS_TIME = "gpstime";
        public static final String COLUMN_SYNCED = "sync";
        public static final String COLUMN_SYNCED_DATE = "sync_date";
        public static final String COLUMN_MNA1 = "formDateTime";
        public static final String COLUMN_MNA2 = "mna2";
        public static final String COLUMN_MNA3 = "mna3";
        public static final String COLUMN_MNA4 = "mna4";
        public static final String COLUMN_MNA5 = "mna5";
        public static final String COLUMN_MNA6 = "childName";
        public static final String COLUMN_MNA6A = "mna6a";
        public static final String COLUMN_MNA7 = "iStatus";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SB = "sb";
        public static final String COLUMN_SC = "sc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";

        public static final String COLUMN_NAME_ROUND = "round";
    }
}


