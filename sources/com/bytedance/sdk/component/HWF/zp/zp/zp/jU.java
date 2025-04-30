package com.bytedance.sdk.component.HWF.zp.zp.zp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.HWF.zp.ku;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class jU extends SQLiteOpenHelper {
    final Context zp;

    public jU(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zp = context;
    }

    private ArrayList<String> KS(SQLiteDatabase sQLiteDatabase) {
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

    private void lMd(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> KS = KS(sQLiteDatabase);
        if (KS != null && KS.size() > 0) {
            Iterator<String> it = KS.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
            }
        }
    }

    private void zp(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp.lMd(ku.QR().jU().lMd()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.HWF.zp.zp.zp.zp.jU.KS(ku.QR().jU().zp()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.HWF.zp.zp.zp.zp.QR.KS(ku.QR().jU().jU()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.HWF.zp.zp.zp.zp.HWF.zp(ku.QR().jU().COT()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.HWF.zp.HWF.HWF.lMd());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            zp(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        try {
            if (i9 > i10) {
                lMd(sQLiteDatabase);
                zp(sQLiteDatabase);
            } else {
                zp(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
