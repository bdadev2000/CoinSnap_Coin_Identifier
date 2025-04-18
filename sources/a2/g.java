package a2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f60j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f61b;

    /* renamed from: c, reason: collision with root package name */
    public final kc.c f62c;

    /* renamed from: d, reason: collision with root package name */
    public final z1.b f63d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f64f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f65g;

    /* renamed from: h, reason: collision with root package name */
    public final b2.a f66h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f67i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final kc.c dbRef, final z1.b callback, boolean z10) {
        super(context, str, null, callback.a, new DatabaseErrorHandler() { // from class: a2.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                z1.b callback2 = z1.b.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                kc.c dbRef2 = dbRef;
                Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                int i10 = g.f60j;
                Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                c db2 = com.facebook.b.I(dbRef2, dbObj);
                callback2.getClass();
                Intrinsics.checkNotNullParameter(db2, "db");
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
                if (!db2.isOpen()) {
                    String z11 = db2.z();
                    if (z11 != null) {
                        z1.b.a(z11);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = db2.B();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db2.close();
                    } catch (IOException unused2) {
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            z1.b.a((String) obj);
                        }
                    } else {
                        String z12 = db2.z();
                        if (z12 != null) {
                            z1.b.a(z12);
                        }
                    }
                }
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f61b = context;
        this.f62c = dbRef;
        this.f63d = callback;
        this.f64f = z10;
        if (str == null) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this.f66h = new b2.a(context.getCacheDir(), str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        b2.a aVar = this.f66h;
        try {
            aVar.a(aVar.a);
            super.close();
            this.f62c.f20640c = null;
            this.f67i = false;
        } finally {
            aVar.b();
        }
    }

    public final z1.a d(boolean z10) {
        boolean z11;
        b2.a aVar = this.f66h;
        try {
            if (!this.f67i && getDatabaseName() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11);
            this.f65g = false;
            SQLiteDatabase k10 = k(z10);
            if (this.f65g) {
                close();
                return d(z10);
            }
            return g(k10);
        } finally {
            aVar.b();
        }
    }

    public final c g(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return com.facebook.b.I(this.f62c, sqLiteDatabase);
    }

    public final SQLiteDatabase j(boolean z10) {
        if (z10) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase k(boolean z10) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.f67i;
        Context context = this.f61b;
        if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return j(z10);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return j(z10);
            } catch (Throwable th2) {
                super.close();
                if (th2 instanceof e) {
                    e eVar = th2;
                    int ordinal = eVar.f52b.ordinal();
                    Throwable th3 = eVar.f53c;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (!(th3 instanceof SQLiteException)) {
                            throw th3;
                        }
                    } else {
                        throw th3;
                    }
                } else if (th2 instanceof SQLiteException) {
                    if (databaseName == null || !this.f64f) {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return j(z10);
                } catch (e e2) {
                    throw e2.f53c;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean z10 = this.f65g;
        z1.b bVar = this.f63d;
        if (!z10 && bVar.a != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            bVar.b(g(db2));
        } catch (Throwable th2) {
            throw new e(f.ON_CONFIGURE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f63d.c(g(sqLiteDatabase));
        } catch (Throwable th2) {
            throw new e(f.ON_CREATE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.f65g = true;
        try {
            this.f63d.d(g(db2), i10, i11);
        } catch (Throwable th2) {
            throw new e(f.ON_DOWNGRADE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (!this.f65g) {
            try {
                this.f63d.e(g(db2));
            } catch (Throwable th2) {
                throw new e(f.ON_OPEN, th2);
            }
        }
        this.f67i = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f65g = true;
        try {
            this.f63d.f(g(sqLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new e(f.ON_UPGRADE, th2);
        }
    }
}
