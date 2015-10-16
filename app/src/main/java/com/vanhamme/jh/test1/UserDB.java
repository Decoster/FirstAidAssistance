package com.vanhamme.jh.test1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by JHVANHAMME on 15/10/2015.
 * UserDB, allows you to insert, modify, suppress users.
 */
public class UserDB {

    private static final int VERSION_BDD = 1;
    private static final String NAME_BDD = "faa.db";
    private static final String TABLE_USERS = "table_users";

    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_LOGIN = "LOGIN";
    private static final int NUM_COL_LOGIN = 1;
    private static final String COL_PASSWORD = "PASSWORD";
    private static final int NUM_COL_PASSWORD = 2;

    private SQLiteDatabase db;

    private SQLiteInternal mySQLiteInternal;

    public UserDB(Context context){
        //DB & table creation.
        mySQLiteInternal = new SQLiteInternal(context, NAME_BDD, null, VERSION_BDD);
    }

    public void open(){
        //Open DB for writing.
        db = mySQLiteInternal.getWritableDatabase();
    }

    public void close(){
        db.close();
    }

    public SQLiteDatabase getBDD(){
        return db;
    }

    public long insertUser(User user){
        //+- ContentValues (like a HashMap)
        ContentValues values = new ContentValues();
        values.put(COL_LOGIN, user.getLogin());
        values.put(COL_PASSWORD, user.getPassword());

        return db.insert(TABLE_USERS, null, values);
    }

    public int updateUser(int id, User user){
        ContentValues values = new ContentValues();
        values.put(COL_LOGIN, user.getLogin());
        values.put(COL_PASSWORD, user.getPassword());
        return db.update(TABLE_USERS, values, COL_ID + " = " +id, null);
    }

    public int removeLivreWithID(int id){
        return db.delete(TABLE_USERS, COL_ID + " = " +id, null);
    }

    public User getUserByLogin(String login){
        Cursor c = db.query(TABLE_USERS, new String[] {COL_ID, COL_LOGIN, COL_PASSWORD}, COL_LOGIN + " = \"" + login +"\"", null, null, null, null);
        return cursorToUser(c);
    }

    private User cursorToUser(Cursor c){
        //Not found.
        if (c.getCount() == 0)
            return null;

        //Found;
        c.moveToFirst();
        User user = new User();
        user.setId(c.getInt(NUM_COL_ID));
        user.setLogin(c.getString(NUM_COL_LOGIN));
        user.setPassword(c.getString(NUM_COL_PASSWORD));
        c.close();

        return user;
    }
}
