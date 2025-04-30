package I0;

import D0.l;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {
    public final b[] b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1399c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1400d;

    public d(Context context, String str, b[] bVarArr, l lVar) {
        super(context, str, null, lVar.b, new c(lVar, bVarArr));
        this.f1399c = lVar;
        this.b = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.f1397c) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    public final synchronized b b() {
        this.f1400d = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (this.f1400d) {
            close();
            return b();
        }
        return a(this.b, writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.b[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.b, sQLiteDatabase);
        this.f1399c.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r7) {
        /*
            r6 = this;
            r0 = 1
            I0.b[] r1 = r6.b
            I0.b r7 = a(r1, r7)
            D0.l r1 = r6.f1399c
            r1.getClass()
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r7.n(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = r0
            goto L24
        L21:
            r7 = move-exception
            goto L73
        L23:
            r3 = r4
        L24:
            r2.close()
            java.lang.Object r2 = r1.f627d
            E1.c r2 = (E1.c) r2
            r2.getClass()
            E1.c.q(r7)
            if (r3 != 0) goto L52
            D0.k r3 = E1.c.A(r7)
            boolean r5 = r3.f624c
            if (r5 == 0) goto L3c
            goto L52
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L52:
            r1.i(r7)
            int r7 = androidx.work.impl.WorkDatabase_Impl.f5219s
            java.lang.Object r7 = r2.f972c
            androidx.work.impl.WorkDatabase_Impl r7 = (androidx.work.impl.WorkDatabase_Impl) r7
            java.util.List r1 = r7.f620g
            if (r1 == 0) goto L72
            int r1 = r1.size()
        L63:
            if (r4 >= r1) goto L72
            java.util.List r2 = r7.f620g
            java.lang.Object r2 = r2.get(r4)
            V0.f r2 = (V0.f) r2
            r2.getClass()
            int r4 = r4 + r0
            goto L63
        L72:
            return
        L73:
            r2.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        this.f1400d = true;
        this.f1399c.g(a(this.b, sQLiteDatabase), i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0068  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r12) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        this.f1400d = true;
        this.f1399c.g(a(this.b, sQLiteDatabase), i9, i10);
    }
}
