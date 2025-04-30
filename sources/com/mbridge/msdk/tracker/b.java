package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* loaded from: classes3.dex */
final class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private final String f18099a;

    public b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f18099a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.f18118a, this.f18099a));
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "create table error", e4);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.b, this.f18099a));
            sQLiteDatabase.execSQL(String.format(i.f18118a, this.f18099a));
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "downgrade table error", e4);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.b, this.f18099a));
            sQLiteDatabase.execSQL(String.format(i.f18118a, this.f18099a));
        } catch (Exception e4) {
            if (a.f18098a) {
                Log.e("TrackManager", "upgrade table error", e4);
            }
        }
    }
}
