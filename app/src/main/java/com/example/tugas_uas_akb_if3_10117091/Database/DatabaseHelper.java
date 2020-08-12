package com.example.tugas_uas_akb_if3_10117091.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/** NIM : 10117091
 * Nama : Dida Handian
 * Kelas : IF-3
 * Tanggal : 10-08-2020
 **/

public class DatabaseHelper extends SQLiteOpenHelper {
    //InnerClass, untuk mengatur artibut seperti Nama Tabel, nama-nama kolom dan Query
    static abstract class MyColumns implements BaseColumns {
        //Menentukan Nama Table dan Kolom
        static final String NamaTabel = "tempatWisata";
        public static String id = "id";
        public static String nama = "nama";
        public static String alamat = "alamat";
        public static String waktubuka = "waktubuka";
        public static String deskripsi = "deskripsi";
        public static String foto = "foto";
        public static String lang = "lang";
        public static String leng = "leng";
    }

    private static final String NamaDatabse = "dma.db";
    private static final int VersiDatabase = 1;

    //Query yang digunakan untuk membuat Tabel
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE "+ MyColumns.NamaTabel+
            "("+MyColumns.id+" TEXT PRIMARY KEY, "+MyColumns.nama+" TEXT NOT NULL, "+MyColumns.alamat+
            " TEXT NOT NULL, "+MyColumns.waktubuka+" TEXT NOT NULL, "+MyColumns.deskripsi+
            " TEXT NOT NULL, "+MyColumns.foto+" BLOB NOT NULL, "+MyColumns.lang+" TEXT NOT NULL, "+MyColumns.leng+" TEXT NOT NULL)";

    //Query yang digunakan untuk mengupgrade Tabel
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS "+ MyColumns.NamaTabel;


    public void save(TourPlace tp){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(MyColumns .id, tp.getId());
        values.put(MyColumns.nama, tp.getNama());
        values.put(MyColumns.alamat, tp.getAlamat());
        values.put(MyColumns.waktubuka, tp.getWaktuBuka());
        values.put(MyColumns.deskripsi, tp.getDeskripsi());
        values.put(MyColumns.foto, tp.getFoto());
        values.put(MyColumns.lang, tp.getLang());
        values.put(MyColumns.leng, tp.getLeng());

        db.insert(MyColumns.NamaTabel, null, values);
        db.close();
    }

    public DatabaseHelper(Context context) {
        super(context, NamaDatabse, null, VersiDatabase);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }


}
