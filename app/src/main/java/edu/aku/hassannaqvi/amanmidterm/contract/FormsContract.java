package edu.aku.hassannaqvi.amanmidterm.contract;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by hassan.naqvi on 10/25/2016.
 */

public class FormsContract {

    private final String projectName = "AMAN CHP 2016-17";
    private final String surveyType = "SN";
    private String userName = "";
    private String ID = "";
    private String UID = "";
    private String formDate = ""; // Date
    private String majorArea = "0000"; // Region or District
    private String hFacility = ""; // HF
    private String minorArea = ""; // District or Tehsil
    private String primaryUnit = ""; // Cluster - Block - PSU
    private String secondaryUnit = ""; // LHW - CHW
    private String houseHold = ""; // HH no.
    private String childId = ""; // Index Child ID
    private String childName = ""; // Child Name
    private String iStatus = ""; // Form Status
    private String deviceTag = "";
    private String antenatalCare = "";
    private String basicInfo = "";
    private String birthsDeaths = "";
    private String childHealth = "";
    private String childMorbidity = "";
    private String childVaccination = "";
    private String delivery = "";
    private String immunization = "";
    private String indexChild = "";
    private String kap = "";
    private String labInfo = "";
    private String iycf = "";
    private String maternalMentalHealth = "";
    private String neonatalHealth = "";
    private String postpartumCare = "";
    private String socioEconomic = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String appVer = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }

    public FormsContract sync(JSONObject jsonObject) throws JSONException {
        this.userName = jsonObject.getString(FormsTable.COLUMN_NAME_USERNAME);
        this.ID = jsonObject.getString(FormsTable.ID);
        this.UID = jsonObject.getString(FormsTable.COLUMN_NAME_UID);
        this.formDate = jsonObject.getString(FormsTable.COLUMN_NAME_FORMDATE);
        this.majorArea = jsonObject.getString(FormsTable.COLUMN_NAME_MAJORAREA);
        this.hFacility = jsonObject.getString(FormsTable.COLUMN_NAME_HFACILITY);
        this.minorArea = jsonObject.getString(FormsTable.COLUMN_NAME_MINORAREA);
        this.primaryUnit = jsonObject.getString(FormsTable.COLUMN_NAME_PRIMARYUNIT);
        this.secondaryUnit = jsonObject.getString(FormsTable.COLUMN_NAME_SECONDARYUNIT);
        this.houseHold = jsonObject.getString(FormsTable.COLUMN_NAME_HOUSEHOLD);
        this.childId = jsonObject.getString(FormsTable.COLUMN_NAME_CHILDID);
        this.childName = jsonObject.getString(FormsTable.COLUMN_NAME_CHILDNAME);
        this.iStatus = jsonObject.getString(FormsTable.COLUMN_NAME_ISTATUS);
        this.deviceTag = jsonObject.getString(FormsTable.COLUMN_NAME_DEVICETAG);
        this.antenatalCare = jsonObject.getString(FormsTable.COLUMN_NAME_ANTENATALCARE);
        this.basicInfo = jsonObject.getString(FormsTable.COLUMN_NAME_BASICINFO);
        this.birthsDeaths = jsonObject.getString(FormsTable.COLUMN_NAME_BIRTHSDEATHS);
        this.childHealth = jsonObject.getString(FormsTable.COLUMN_NAME_CHILDHEALTH);
        this.childMorbidity = jsonObject.getString(FormsTable.COLUMN_NAME_CHILDMORBIDITY);
        this.childVaccination = jsonObject.getString(FormsTable.COLUMN_NAME_CHILDVACCINATION);
        this.delivery = jsonObject.getString(FormsTable.COLUMN_NAME_DELIVERY);
        this.immunization = jsonObject.getString(FormsTable.COLUMN_NAME_IMMUNIZATION);
        this.indexChild = jsonObject.getString(FormsTable.COLUMN_NAME_INDEXCHILD);
        this.kap = jsonObject.getString(FormsTable.COLUMN_NAME_KAP);
        this.labInfo = jsonObject.getString(FormsTable.COLUMN_NAME_LABINFO);
        this.iycf = jsonObject.getString(FormsTable.COLUMN_NAME_IYCF);
        this.maternalMentalHealth = jsonObject.getString(FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH);
        this.neonatalHealth = jsonObject.getString(FormsTable.COLUMN_NAME_NEONATALHEALTH);
        this.postpartumCare = jsonObject.getString(FormsTable.COLUMN_NAME_POSTPARTUMCARE);
        this.socioEconomic = jsonObject.getString(FormsTable.COLUMN_NAME_SOCIOECONOMIC);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_NAME_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_NAME_GPSLNG);
        this.gpsTime = jsonObject.getString(FormsTable.COLUMN_NAME_GPSTIME);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_NAME_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_NAME_DEVICEID);
        //this.appVer = jsonObject.getString(FormsTable.COLUMN_NAME_APPVERSION);

        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getMajorArea() {
        return majorArea;
    }

    public void setMajorArea(String majorArea) {
        this.majorArea = majorArea;
    }

    public String gethFacility() {
        return hFacility;
    }

    public void sethFacility(String hFacility) {
        this.hFacility = hFacility;
    }

    public String getMinorArea() {
        return minorArea;
    }

    public void setMinorArea(String minorArea) {
        this.minorArea = minorArea;
    }

    public String getPrimaryUnit() {
        return primaryUnit;
    }

    public void setPrimaryUnit(String primaryUnit) {
        this.primaryUnit = primaryUnit;
    }

    public String getSecondaryUnit() {
        return secondaryUnit;
    }

    public void setSecondaryUnit(String secondaryUnit) {
        this.secondaryUnit = secondaryUnit;
    }

    public String getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(String houseHold) {
        this.houseHold = houseHold;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getchildName() {
        return childName;
    }

    public void setchildName(String childName) {
        this.childName = childName;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAntenatalCare() {
        return antenatalCare;
    }

    public void setAntenatalCare(String antenatalCare) {
        this.antenatalCare = antenatalCare;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }

    public String getBirthsDeaths() {
        return birthsDeaths;
    }

    public void setBirthsDeaths(String birthsDeaths) {
        this.birthsDeaths = birthsDeaths;
    }

    public String getChildHealth() {
        return childHealth;
    }

    public void setChildHealth(String childHealth) {
        this.childHealth = childHealth;
    }

    public String getChildMorbidity() {
        return childMorbidity;
    }

    public void setChildMorbidity(String childMorbidity) {
        this.childMorbidity = childMorbidity;
    }

    public String getChildVaccination() {
        return childVaccination;
    }

    public void setChildVaccination(String childVaccination) {
        this.childVaccination = childVaccination;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getImmunization() {
        return immunization;
    }

    public void setImmunization(String immunization) {
        this.immunization = immunization;
    }

    public String getIndexChild() {
        return indexChild;
    }

    public void setIndexChild(String indexChild) {
        this.indexChild = indexChild;
    }

    public String getKap() {
        return kap;
    }

    public void setKap(String kap) {
        this.kap = kap;
    }

    public String getLabInfo() {
        return labInfo;
    }

    public void setLabInfo(String labInfo) {
        this.labInfo = labInfo;
    }

    public String getIycf() {
        return iycf;
    }

    public void setIycf(String iycf) {
        this.iycf = iycf;
    }

    public String getMaternalMentalHealth() {
        return maternalMentalHealth;
    }

    public void setMaternalMentalHealth(String maternalMentalHealth) {
        this.maternalMentalHealth = maternalMentalHealth;
    }

    public String getNeonatalHealth() {
        return neonatalHealth;
    }

    public void setNeonatalHealth(String neonatalHealth) {
        this.neonatalHealth = neonatalHealth;
    }

    public String getPostpartumCare() {
        return postpartumCare;
    }

    public void setPostpartumCare(String postpartumCare) {
        this.postpartumCare = postpartumCare;
    }

    public String getSocioEconomic() {
        return socioEconomic;
    }

    public void setSocioEconomic(String socioEconomic) {
        this.socioEconomic = socioEconomic;
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

    public String getAppVer() {
        return appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
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

    public FormsContract hydrate(Cursor cursor) {
        this.userName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_USERNAME));
        this.ID = cursor.getString(cursor.getColumnIndex(FormsTable.ID));
        this.UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_FORMDATE));
        this.majorArea = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_MAJORAREA));
        this.hFacility = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_HFACILITY));
        this.minorArea = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_MINORAREA));
        this.primaryUnit = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_PRIMARYUNIT));
        this.secondaryUnit = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_SECONDARYUNIT));
        this.houseHold = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_HOUSEHOLD));
        this.childId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_CHILDID));
        this.childName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_CHILDNAME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_ISTATUS));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_DEVICETAG));
        this.antenatalCare = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_ANTENATALCARE));
        this.basicInfo = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_BASICINFO));
        this.birthsDeaths = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_BIRTHSDEATHS));
        this.childHealth = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_CHILDHEALTH));
        this.childMorbidity = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_CHILDMORBIDITY));
        this.childVaccination = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_CHILDVACCINATION));
        this.delivery = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_DELIVERY));
        this.immunization = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_IMMUNIZATION));
        this.indexChild = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_INDEXCHILD));
        this.kap = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_KAP));
        this.labInfo = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_LABINFO));
        this.iycf = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_IYCF));
        this.maternalMentalHealth = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH));
        this.neonatalHealth = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_NEONATALHEALTH));
        this.postpartumCare = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_POSTPARTUMCARE));
        this.socioEconomic = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_SOCIOECONOMIC));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_GPSLNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_GPSTIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_DEVICEID));
        //this.appVer = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_APPVERSION));

        return this;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_NAME_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FormsTable.COLUMN_NAME_SURVEYTYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(FormsTable.COLUMN_NAME_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
        json.put(FormsTable.ID, this.ID == null ? JSONObject.NULL : this.ID);
        json.put(FormsTable.COLUMN_NAME_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(FormsTable.COLUMN_NAME_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(FormsTable.COLUMN_NAME_MAJORAREA, this.majorArea == null ? JSONObject.NULL : this.majorArea);
        json.put(FormsTable.COLUMN_NAME_HFACILITY, this.hFacility == null ? JSONObject.NULL : this.hFacility);
        json.put(FormsTable.COLUMN_NAME_MINORAREA, this.minorArea == null ? JSONObject.NULL : this.minorArea);
        json.put(FormsTable.COLUMN_NAME_PRIMARYUNIT, this.primaryUnit == null ? JSONObject.NULL : this.primaryUnit);
        json.put(FormsTable.COLUMN_NAME_SECONDARYUNIT, this.secondaryUnit == null ? JSONObject.NULL : this.secondaryUnit);
        json.put(FormsTable.COLUMN_NAME_HOUSEHOLD, this.houseHold == null ? JSONObject.NULL : this.houseHold);
        json.put(FormsTable.COLUMN_NAME_CHILDID, this.childId == null ? JSONObject.NULL : this.childId);
        json.put(FormsTable.COLUMN_NAME_CHILDNAME, this.childName == null ? JSONObject.NULL : this.childName);
        json.put(FormsTable.COLUMN_NAME_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
        json.put(FormsTable.COLUMN_NAME_DEVICETAG, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);

        json.put(FormsTable.COLUMN_NAME_ANTENATALCARE, this.antenatalCare == null ? JSONObject.NULL : new JSONObject(this.antenatalCare));
        json.put(FormsTable.COLUMN_NAME_BASICINFO, this.basicInfo == null ? JSONObject.NULL : new JSONObject(this.basicInfo));
        json.put(FormsTable.COLUMN_NAME_BIRTHSDEATHS, this.birthsDeaths == null ? JSONObject.NULL : new JSONObject(this.birthsDeaths));
        json.put(FormsTable.COLUMN_NAME_CHILDHEALTH, this.childHealth == null ? JSONObject.NULL : new JSONObject(this.childHealth));
        json.put(FormsTable.COLUMN_NAME_CHILDMORBIDITY, this.childMorbidity == null ? JSONObject.NULL : new JSONObject(this.childMorbidity));
        json.put(FormsTable.COLUMN_NAME_CHILDVACCINATION, this.childVaccination == null ? JSONObject.NULL : new JSONObject(this.childVaccination));
        json.put(FormsTable.COLUMN_NAME_DELIVERY, this.delivery == null ? JSONObject.NULL : new JSONObject(this.delivery));
        json.put(FormsTable.COLUMN_NAME_IMMUNIZATION, this.immunization == null ? JSONObject.NULL : new JSONObject(this.immunization));
        json.put(FormsTable.COLUMN_NAME_INDEXCHILD, this.indexChild == null ? JSONObject.NULL : new JSONObject(this.indexChild));
        json.put(FormsTable.COLUMN_NAME_KAP, this.kap == null ? JSONObject.NULL : new JSONObject(this.kap));
        json.put(FormsTable.COLUMN_NAME_LABINFO, this.labInfo == null ? JSONObject.NULL : new JSONObject(this.labInfo));
        json.put(FormsTable.COLUMN_NAME_IYCF, this.iycf == null ? JSONObject.NULL : new JSONObject(this.iycf));
        json.put(FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH, this.maternalMentalHealth == null ? JSONObject.NULL : new JSONObject(this.maternalMentalHealth));
        json.put(FormsTable.COLUMN_NAME_NEONATALHEALTH, this.neonatalHealth == null ? JSONObject.NULL : new JSONObject(this.neonatalHealth));
        json.put(FormsTable.COLUMN_NAME_POSTPARTUMCARE, this.postpartumCare == null ? JSONObject.NULL : new JSONObject(this.postpartumCare));
        json.put(FormsTable.COLUMN_NAME_SOCIOECONOMIC, this.socioEconomic == null ? JSONObject.NULL : new JSONObject(this.socioEconomic));
        json.put(FormsTable.COLUMN_NAME_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_NAME_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_NAME_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(FormsTable.COLUMN_NAME_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_NAME_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        //json.put(FormsTable.COLUMN_NAME_APPVERSION, this.appVer == null ? JSONObject.NULL : this.appVer);
        json.put(FormsTable.COLUMN_NAME_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FormsTable.COLUMN_NAME_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


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

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String URI = "/syncforms.php";

        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";

        public static final String COLUMN_NAME_PROJECTNAME = "projectname";
        public static final String COLUMN_NAME_SURVEYTYPE = "surveytype";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String ID = "id";
        public static final String COLUMN_NAME_UID = "uid";
        public static final String COLUMN_NAME_FORMDATE = "formdate";
        public static final String COLUMN_NAME_MAJORAREA = "majorarea";
        public static final String COLUMN_NAME_HFACILITY = "hfacility";
        public static final String COLUMN_NAME_MINORAREA = "minorarea";
        public static final String COLUMN_NAME_PRIMARYUNIT = "primaryunit";
        public static final String COLUMN_NAME_SECONDARYUNIT = "secondaryunit";
        public static final String COLUMN_NAME_HOUSEHOLD = "household";
        public static final String COLUMN_NAME_CHILDID = "childid";
        public static final String COLUMN_NAME_CHILDNAME = "childname";
        public static final String COLUMN_NAME_ISTATUS = "istatus";
        public static final String COLUMN_NAME_DEVICETAG = "tagid";
        public static final String COLUMN_NAME_ANTENATALCARE = "antenatalcare";
        public static final String COLUMN_NAME_BASICINFO = "basicinfo";
        public static final String COLUMN_NAME_BIRTHSDEATHS = "birthsdeaths";
        public static final String COLUMN_NAME_CHILDHEALTH = "childhealth";
        public static final String COLUMN_NAME_CHILDMORBIDITY = "childmorbidity";
        public static final String COLUMN_NAME_CHILDVACCINATION = "childvaccination";
        public static final String COLUMN_NAME_DELIVERY = "delivery";
        public static final String COLUMN_NAME_IMMUNIZATION = "immunization";
        public static final String COLUMN_NAME_INDEXCHILD = "indexchild";
        public static final String COLUMN_NAME_KAP = "kap";
        public static final String COLUMN_NAME_LABINFO = "labinfo";
        public static final String COLUMN_NAME_IYCF = "iycf";
        public static final String COLUMN_NAME_MATERNALMENTALHEALTH = "maternalmentalhealth";
        public static final String COLUMN_NAME_NEONATALHEALTH = "neonatalhealth";
        public static final String COLUMN_NAME_POSTPARTUMCARE = "postpartumcare";
        public static final String COLUMN_NAME_SOCIOECONOMIC = "socioeconomic";
        public static final String COLUMN_NAME_GPSLAT = "gpslat";
        public static final String COLUMN_NAME_GPSLNG = "gpslng";
        public static final String COLUMN_NAME_GPSTIME = "gpstime";
        public static final String COLUMN_NAME_GPSACC = "gpsacc";
        public static final String COLUMN_NAME_DEVICEID = "deviceid";
        //public static final String COLUMN_NAME_APPVERSION = "appver";
        public static final String COLUMN_NAME_SYNCED = "synced";
        public static final String COLUMN_NAME_SYNCED_DATE = "synced_date";


    }
    }


