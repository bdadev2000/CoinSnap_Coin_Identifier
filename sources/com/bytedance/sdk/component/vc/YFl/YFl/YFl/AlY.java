package com.bytedance.sdk.component.vc.YFl.YFl.YFl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.vc.YFl.qsH;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AlY extends SQLiteOpenHelper {
    final Context YFl;

    public AlY(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.YFl = context;
    }

    private void Sg(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> tN = tN(sQLiteDatabase);
        if (tN != null && tN.size() > 0) {
            Iterator<String> it = tN.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }
    }

    private void YFl(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl.Sg(qsH.DSW().AlY().Sg()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.AlY.tN(qsH.DSW().AlY().YFl()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.DSW.tN(qsH.DSW().AlY().AlY()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.vc.YFl(qsH.DSW().AlY().wN()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.vc.YFl.vc.vc.Sg());
    }

    private ArrayList<String> tN(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            YFl(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 > i11) {
                Sg(sQLiteDatabase);
                YFl(sQLiteDatabase);
            } else {
                YFl(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
