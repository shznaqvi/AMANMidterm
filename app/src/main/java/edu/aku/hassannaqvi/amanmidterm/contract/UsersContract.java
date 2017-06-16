package edu.aku.hassannaqvi.amanmidterm.contract;

import android.provider.BaseColumns;

/**
 * Created by hassan.naqvi on 4/27/2016.
 */
public class UsersContract {
    private static final String TAG = "Users_CONTRACT";
    Long id;
    String username;
    String password;

    public UsersContract() {
        // Default Constructor
    }

    public UsersContract(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public Long getUserID() {
        return this.id;
    }

    public void setId(int id) {
        this.id = Long.valueOf(id);
    }

    public String getUserName() {
        return this.username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static abstract class UsersTable implements BaseColumns {

        public static final String URI = "/getusers.php";

        public static final String TABLE_NAME = "users";
        public static final String _ID = "id";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_PASSWORD = "password";


    }
}