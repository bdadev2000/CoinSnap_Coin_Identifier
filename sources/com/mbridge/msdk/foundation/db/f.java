package com.mbridge.msdk.foundation.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class f {
    private a a;

    /* loaded from: classes4.dex */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str, int i10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库： name :" + str + "  " + i10);
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
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            f.this.a(sQLiteDatabase, i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (MBridgeConstans.DEBUG) {
                ad.a("DatabaseOpenHelper", "数据库升级了");
            }
            f.this.b(sQLiteDatabase, i10, i11);
        }
    }

    public f(Context context) {
        this.a = new a(context, a(), b());
    }

    public abstract String a();

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public abstract int b();

    public abstract void b(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public final SQLiteDatabase c() {
        return this.a.getReadableDatabase();
    }

    public final synchronized SQLiteDatabase d() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.a.getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }
}
