package com.bytedance.sdk.openadsdk.rkt.YFl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.YoT;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class YFl extends SQLiteOpenHelper {
    private static volatile YFl Sg;
    final Context YFl;

    private YFl(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.YFl = context;
    }

    public static SQLiteDatabase Sg() {
        try {
            YFl tN = tN();
            if (tN == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = tN.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase YFl() {
        try {
            YFl tN = tN();
            if (tN == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = tN.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    private static YFl tN() {
        if (Sg == null) {
            synchronized (YFl.class) {
                if (Sg == null) {
                    Sg = new YFl(com.bytedance.sdk.openadsdk.rkt.YFl.YFl());
                }
            }
        }
        return Sg;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th2) {
            Log.e("MonitorSQLiteOpenHelper", th2.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 > i11) {
                YFl(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            } else {
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private ArrayList<String> Sg(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
            }
        } catch (Exception e2) {
            YoT.YFl("MonitorSQLiteOpenHelper", e2.getMessage());
        }
        return arrayList;
    }

    private void YFl(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> Sg2 = Sg(sQLiteDatabase);
        if (Sg2 == null || Sg2.size() <= 0) {
            return;
        }
        Iterator<String> it = Sg2.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }
}
