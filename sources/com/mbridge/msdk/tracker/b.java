package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* loaded from: classes4.dex */
final class b extends SQLiteOpenHelper {
    private final String a;

    public b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.a, this.a));
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "create table error", e2);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f15378b, this.a));
            sQLiteDatabase.execSQL(String.format(i.a, this.a));
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "downgrade table error", e2);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f15378b, this.a));
            sQLiteDatabase.execSQL(String.format(i.a, this.a));
        } catch (Exception e2) {
            if (a.a) {
                Log.e("TrackManager", "upgrade table error", e2);
            }
        }
    }
}
