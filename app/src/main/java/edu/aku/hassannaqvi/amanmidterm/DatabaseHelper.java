package edu.aku.hassannaqvi.amanmidterm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import edu.aku.hassannaqvi.amanmidterm.FormsContract.FormsTable;
import edu.aku.hassannaqvi.amanmidterm.UsersContract.UsersTable;

/**
 * Created by hassan.naqvi on 10/29/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersTable.TABLE_NAME + "("
            + UsersTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_NAME_USERNAME + " TEXT,"
            + UsersTable.COLUMN_NAME_PASSWORD + " TEXT );";
    public static final String DATABASE_NAME = "amanchp.db";
    public static final String DB_NAME = "amanchp_copy.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormsContract.FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_NAME_PROJECTNAME + " TEXT,"
            + FormsTable.COLUMN_NAME_SURVEYTYPE + " TEXT,"
            + FormsTable.COLUMN_NAME_USERNAME + " TEXT,"
            + FormsTable.ID + " TEXT,"
            + FormsTable.COLUMN_NAME_UID + " TEXT,"
            + FormsTable.COLUMN_NAME_FORMDATE + " TEXT,"
            + FormsTable.COLUMN_NAME_MAJORAREA + " TEXT,"
            + FormsTable.COLUMN_NAME_HFACILITY + " TEXT,"
            + FormsTable.COLUMN_NAME_MINORAREA + " TEXT,"
            + FormsTable.COLUMN_NAME_PRIMARYUNIT + " TEXT,"
            + FormsTable.COLUMN_NAME_SECONDARYUNIT + " TEXT,"
            + FormsTable.COLUMN_NAME_HOUSEHOLD + " TEXT,"
            + FormsTable.COLUMN_NAME_CHILDID + " TEXT,"
            + FormsTable.COLUMN_NAME_CHILDNAME + " TEXT,"
            + FormsTable.COLUMN_NAME_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_NAME_TAGID + " TEXT,"
            + FormsTable.COLUMN_NAME_ANTENATALCARE + " TEXT,"
            + FormsTable.COLUMN_NAME_BASICINFO + " TEXT,"
            + FormsTable.COLUMN_NAME_BIRTHSDEATHS + " TEXT,"
            + FormsTable.COLUMN_NAME_CHILDHEALTH + " TEXT,"
            + FormsTable.COLUMN_NAME_CHILDMORBIDITY + " TEXT,"
            + FormsTable.COLUMN_NAME_CHILDVACCINATION + " TEXT,"
            + FormsTable.COLUMN_NAME_DELIVERY + " TEXT,"
            + FormsTable.COLUMN_NAME_IMMUNIZATION + " TEXT,"
            + FormsTable.COLUMN_NAME_INDEXCHILD + " TEXT,"
            + FormsTable.COLUMN_NAME_KAP + " TEXT,"
            + FormsTable.COLUMN_NAME_LABINFO + " TEXT,"
            + FormsTable.COLUMN_NAME_IYCF + " TEXT,"
            + FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH + " TEXT,"
            + FormsTable.COLUMN_NAME_NEONATALHEALTH + " TEXT,"
            + FormsTable.COLUMN_NAME_POSTPARTUMCARE + " TEXT,"
            + FormsTable.COLUMN_NAME_SOCIOECONOMIC + " TEXT,"
            + FormsTable.COLUMN_NAME_GPSLAT + " TEXT,"
            + FormsTable.COLUMN_NAME_GPSLNG + " TEXT,"
            + FormsTable.COLUMN_NAME_GPSTIME + " TEXT,"
            + FormsTable.COLUMN_NAME_GPSACC + " TEXT,"
            + FormsTable.COLUMN_NAME_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_NAME_SYNCED + " TEXT,"
            + FormsTable.COLUMN_NAME_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_DELETE_FORMS = "DROP TABLE IF EXISTS " + FormsContract.FormsTable.TABLE_NAME;
    private static final String SQL_DELETE_USERS = "DROP TABLE IF EXISTS " + UsersTable.TABLE_NAME;

    public static String DB_FORM_ID;
    public static String DB_IMS_ID;


    private final String TAG = "DatabaseHelper";
    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_USERS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_USERS);

        onCreate(db);
    }

    public Long addForm(FormsContract fc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_PROJECTNAME, fc.getProjectName());
        values.put(FormsTable.COLUMN_NAME_SURVEYTYPE, fc.getSurveyType());
        values.put(FormsTable.COLUMN_NAME_USERNAME, fc.getUserName());
        values.put(FormsTable.ID, fc.getID());
        values.put(FormsTable.COLUMN_NAME_UID, fc.getUID());
        values.put(FormsTable.COLUMN_NAME_FORMDATE, fc.getFormDate());
        values.put(FormsTable.COLUMN_NAME_MAJORAREA, fc.getMajorArea());
        values.put(FormsTable.COLUMN_NAME_HFACILITY, fc.gethFacility());
        values.put(FormsTable.COLUMN_NAME_MINORAREA, fc.getMinorArea());
        values.put(FormsTable.COLUMN_NAME_PRIMARYUNIT, fc.getProjectName());
        values.put(FormsTable.COLUMN_NAME_SECONDARYUNIT, fc.getSecondaryUnit());
        values.put(FormsTable.COLUMN_NAME_HOUSEHOLD, fc.getHouseHold());
        values.put(FormsTable.COLUMN_NAME_CHILDID, fc.getChildId());
        values.put(FormsTable.COLUMN_NAME_CHILDNAME, fc.getchildName());
        values.put(FormsTable.COLUMN_NAME_ISTATUS, fc.getiStatus());
        values.put(FormsTable.COLUMN_NAME_TAGID, fc.getTagId());
        values.put(FormsTable.COLUMN_NAME_ANTENATALCARE, fc.getAntenatalCare());
        values.put(FormsTable.COLUMN_NAME_BASICINFO, fc.getBasicInfo());
        values.put(FormsTable.COLUMN_NAME_BIRTHSDEATHS, fc.getBirthsDeaths());
        values.put(FormsTable.COLUMN_NAME_CHILDHEALTH, fc.getChildHealth());
        values.put(FormsTable.COLUMN_NAME_CHILDMORBIDITY, fc.getChildMorbidity());
        values.put(FormsTable.COLUMN_NAME_CHILDVACCINATION, fc.getChildVaccination());
        values.put(FormsTable.COLUMN_NAME_DELIVERY, fc.getDelivery());
        values.put(FormsTable.COLUMN_NAME_IMMUNIZATION, fc.getImmunization());
        values.put(FormsTable.COLUMN_NAME_INDEXCHILD, fc.getIndexChild());
        values.put(FormsTable.COLUMN_NAME_KAP, fc.getKap());
        values.put(FormsTable.COLUMN_NAME_LABINFO, fc.getLabInfo());
        values.put(FormsTable.COLUMN_NAME_IYCF, fc.getIycf());
        values.put(FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH, fc.getMaternalMentalHealth());
        values.put(FormsTable.COLUMN_NAME_NEONATALHEALTH, fc.getNeonatalHealth());
        values.put(FormsTable.COLUMN_NAME_POSTPARTUMCARE, fc.getPostpartumCare());
        values.put(FormsTable.COLUMN_NAME_SOCIOECONOMIC, fc.getSocioEconomic());
        values.put(FormsTable.COLUMN_NAME_GPSLAT, fc.getGpsLat());
        values.put(FormsTable.COLUMN_NAME_GPSLNG, fc.getGpsLng());
        values.put(FormsTable.COLUMN_NAME_GPSTIME, fc.getGpsTime());
        values.put(FormsTable.COLUMN_NAME_GPSACC, fc.getGpsAcc());
        values.put(FormsTable.COLUMN_NAME_DEVICEID, fc.getDeviceID());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        DB_FORM_ID = String.valueOf(newRowId);
        return newRowId;
    }

    public int updateFormID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_UID, edu.aku.hassannaqvi.amanmidterm.AppMain.fc.getUID());

// Which row to update, based on the ID
        String selection = FormsTable.ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(edu.aku.hassannaqvi.amanmidterm.AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public void updateForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_NAME_SYNCED, true);
        values.put(FormsTable.COLUMN_NAME_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsContract.FormsTable.ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsTable.COLUMN_NAME_PROJECTNAME,
                FormsTable.COLUMN_NAME_SURVEYTYPE,
                FormsTable.COLUMN_NAME_USERNAME,
                FormsTable.ID,
                FormsTable.COLUMN_NAME_UID,
                FormsTable.COLUMN_NAME_FORMDATE,
                FormsTable.COLUMN_NAME_MAJORAREA,
                FormsTable.COLUMN_NAME_HFACILITY,
                FormsTable.COLUMN_NAME_MINORAREA,
                FormsTable.COLUMN_NAME_PRIMARYUNIT,
                FormsTable.COLUMN_NAME_SECONDARYUNIT,
                FormsTable.COLUMN_NAME_HOUSEHOLD,
                FormsTable.COLUMN_NAME_CHILDID,
                FormsTable.COLUMN_NAME_CHILDNAME,
                FormsTable.COLUMN_NAME_ISTATUS,
                FormsTable.COLUMN_NAME_TAGID,
                FormsTable.COLUMN_NAME_ANTENATALCARE,
                FormsTable.COLUMN_NAME_BASICINFO,
                FormsTable.COLUMN_NAME_BIRTHSDEATHS,
                FormsTable.COLUMN_NAME_CHILDHEALTH,
                FormsTable.COLUMN_NAME_CHILDMORBIDITY,
                FormsTable.COLUMN_NAME_CHILDVACCINATION,
                FormsTable.COLUMN_NAME_DELIVERY,
                FormsTable.COLUMN_NAME_IMMUNIZATION,
                FormsTable.COLUMN_NAME_INDEXCHILD,
                FormsTable.COLUMN_NAME_KAP,
                FormsTable.COLUMN_NAME_LABINFO,
                FormsTable.COLUMN_NAME_IYCF,
                FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH,
                FormsTable.COLUMN_NAME_NEONATALHEALTH,
                FormsTable.COLUMN_NAME_POSTPARTUMCARE,
                FormsTable.COLUMN_NAME_SOCIOECONOMIC,
                FormsTable.COLUMN_NAME_GPSLAT,
                FormsTable.COLUMN_NAME_GPSLNG,
                FormsTable.COLUMN_NAME_GPSTIME,
                FormsTable.COLUMN_NAME_GPSACC,
                FormsTable.COLUMN_NAME_DEVICEID,
                FormsTable.COLUMN_NAME_SYNCED,
                FormsTable.COLUMN_NAME_SYNCED_DATE

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsTable.COLUMN_NAME_PROJECTNAME,
                FormsTable.COLUMN_NAME_SURVEYTYPE,
                FormsTable.COLUMN_NAME_USERNAME,
                FormsTable.ID,
                FormsTable.COLUMN_NAME_UID,
                FormsTable.COLUMN_NAME_FORMDATE,
                FormsTable.COLUMN_NAME_MAJORAREA,
                FormsTable.COLUMN_NAME_HFACILITY,
                FormsTable.COLUMN_NAME_MINORAREA,
                FormsTable.COLUMN_NAME_PRIMARYUNIT,
                FormsTable.COLUMN_NAME_SECONDARYUNIT,
                FormsTable.COLUMN_NAME_HOUSEHOLD,
                FormsTable.COLUMN_NAME_CHILDID,
                FormsTable.COLUMN_NAME_CHILDNAME,
                FormsTable.COLUMN_NAME_ISTATUS,
                FormsTable.COLUMN_NAME_TAGID,
                FormsTable.COLUMN_NAME_ANTENATALCARE,
                FormsTable.COLUMN_NAME_BASICINFO,
                FormsTable.COLUMN_NAME_BIRTHSDEATHS,
                FormsTable.COLUMN_NAME_CHILDHEALTH,
                FormsTable.COLUMN_NAME_CHILDMORBIDITY,
                FormsTable.COLUMN_NAME_CHILDVACCINATION,
                FormsTable.COLUMN_NAME_DELIVERY,
                FormsTable.COLUMN_NAME_IMMUNIZATION,
                FormsTable.COLUMN_NAME_INDEXCHILD,
                FormsTable.COLUMN_NAME_KAP,
                FormsTable.COLUMN_NAME_LABINFO,
                FormsTable.COLUMN_NAME_IYCF,
                FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH,
                FormsTable.COLUMN_NAME_NEONATALHEALTH,
                FormsTable.COLUMN_NAME_POSTPARTUMCARE,
                FormsTable.COLUMN_NAME_SOCIOECONOMIC,
                FormsTable.COLUMN_NAME_GPSLAT,
                FormsTable.COLUMN_NAME_GPSLNG,
                FormsTable.COLUMN_NAME_GPSTIME,
                FormsTable.COLUMN_NAME_GPSACC,
                FormsTable.COLUMN_NAME_DEVICEID,
                FormsTable.COLUMN_NAME_SYNCED,
                FormsTable.COLUMN_NAME_SYNCED_DATE
        };
        String whereClause = FormsTable.COLUMN_NAME_SYNCED + " is null OR " + FormsTable.COLUMN_NAME_SYNCED + " = ''";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getTodayForms() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsTable.ID
        };

        String whereClause = FormsTable.COLUMN_NAME_FORMDATE + " LIKE ?";
        String[] whereArgs = {spDateT};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.FormsTable.ID + " ASC";

        Collection<FormsContract> formList = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                formList.add(fc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }


        // return contact list
        return formList;
    }

    public int updateEnd() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
//        values.put(FormsTable.COLUMN_MNA7, AppMain.fc.getiStatus());


        // Which row to update, based on the ID
        String selection = FormsTable.ID + " = ?";
        String[] selectionArgs = {String.valueOf(edu.aku.hassannaqvi.amanmidterm.AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public void addUser(UsersContract userscontract) {
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(UsersTable.COLUMN_NAME_USERNAME, userscontract.getUserName());
            values.put(UsersTable.COLUMN_NAME_PASSWORD, userscontract.getPassword());
            db.insert(UsersTable.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");


                ContentValues values = new ContentValues();

                values.put(UsersTable.COLUMN_NAME_USERNAME, userName);
                values.put(UsersTable.COLUMN_NAME_PASSWORD, password);
                db.insert(UsersTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + UsersTable.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    UsersContract user = new UsersContract();
                    user.setId(cursor.getInt(0));
                    user.setUserName(cursor.getString(1));
                    user.setPassword(cursor.getString(2));
                    userList.add(user);
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }

    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersTable.TABLE_NAME + " WHERE " + UsersTable.COLUMN_NAME_USERNAME + "=? AND " + UsersTable.COLUMN_NAME_PASSWORD + "=?", new String[]{username, password});
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    public int updateSocioEco() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_SOCIOECONOMIC, AppMain.fc.getSocioEconomic());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateChildVacc() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_CHILDVACCINATION, AppMain.fc.getChildVaccination());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateAntenatalCare() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_ANTENATALCARE, AppMain.fc.getAntenatalCare());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateDelivery() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_DELIVERY, AppMain.fc.getDelivery());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updatePostpartumCare() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_POSTPARTUMCARE, AppMain.fc.getPostpartumCare());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateNeonatalHealth() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_NEONATALHEALTH, AppMain.fc.getNeonatalHealth());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateChildMorbidity() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_CHILDMORBIDITY, AppMain.fc.getChildMorbidity());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateMaternalMentalHealth() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_MATERNALMENTALHEALTH, AppMain.fc.getMaternalMentalHealth());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateBirthsDeaths() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_NAME_BIRTHSDEATHS, AppMain.fc.getBirthsDeaths());

// Which row to update, based on the ID
        String selection = " id = " + AppMain.fc.getID();
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }



}