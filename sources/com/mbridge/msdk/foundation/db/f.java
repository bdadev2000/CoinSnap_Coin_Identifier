package com.mbridge.msdk.foundation.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private a f15497a;

    /* loaded from: classes3.dex */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str, int i9) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i9);
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库： name :" + str + "  " + i9);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库创建了");
            }
            f.this.a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
            f.this.a(sQLiteDatabase, i9, i10);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库升级了");
            }
            f.this.b(sQLiteDatabase, i9, i10);
        }
    }

    public f(Context context) {
        this.f15497a = new a(context, a(), b());
    }

    public abstract String a();

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i9, int i10);

    public abstract int b();

    public abstract void b(SQLiteDatabase sQLiteDatabase, int i9, int i10);

    public final SQLiteDatabase c() {
        return this.f15497a.getReadableDatabase();
    }

    public final synchronized SQLiteDatabase d() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f15497a.getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }
}
