package v1;

import android.database.Cursor;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends z1.b {

    /* renamed from: b, reason: collision with root package name */
    public j f25887b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f25888c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25889d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j configuration, g0 delegate, String identityHash, String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f25887b = configuration;
        this.f25888c = delegate;
        this.f25889d = identityHash;
        this.f25890e = legacyHash;
    }

    @Override // z1.b
    public final void b(a2.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(db2, "db");
    }

    @Override // z1.b
    public final void c(a2.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor O = db2.O("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            Cursor cursor = O;
            boolean z10 = false;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) == 0) {
                    z10 = true;
                }
            }
            CloseableKt.closeFinally(O, null);
            g0 g0Var = this.f25888c;
            g0Var.createAllTables(db2);
            if (!z10) {
                h0 onValidateSchema = g0Var.onValidateSchema(db2);
                if (!onValidateSchema.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f25884b);
                }
            }
            g(db2);
            g0Var.onCreate(db2);
        } finally {
        }
    }

    @Override // z1.b
    public final void d(a2.c db2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(db2, "db");
        f(db2, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    @Override // z1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(a2.c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r7.O(r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> L9d
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L9d
            r3 = 0
            if (r2 == 0) goto L25
            int r1 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r3
        L26:
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            v1.g0 r0 = r6.f25888c
            if (r1 == 0) goto L73
            hi.e r1 = new hi.e
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r7.K(r1)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r4 = r1
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch: java.lang.Throwable -> L6c
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L49
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L6c
            goto L4a
        L49:
            r3 = r2
        L4a:
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            java.lang.String r1 = r6.f25889d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r4 != 0) goto L81
            java.lang.String r4 = r6.f25890e
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r4 == 0) goto L5e
            goto L81
        L5e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r2 = ", found: "
            java.lang.String r0 = eb.j.l(r0, r1, r2, r3)
            r7.<init>(r0)
            throw r7
        L6c:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L6e
        L6e:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r7)
            throw r0
        L73:
            v1.h0 r1 = r0.onValidateSchema(r7)
            boolean r3 = r1.a
            if (r3 == 0) goto L87
            r0.onPostMigrate(r7)
            r6.g(r7)
        L81:
            r0.onOpen(r7)
            r6.f25887b = r2
            return
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f25884b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L9d:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9f
        L9f:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i0.e(a2.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        if (r10 <= r15) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0078, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        if (r10 < r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[ORIG_RETURN, RETURN] */
    @Override // z1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(a2.c r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i0.f(a2.c, int, int):void");
    }

    public final void g(a2.c cVar) {
        cVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String hash = this.f25889d;
        Intrinsics.checkNotNullParameter(hash, "hash");
        cVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
    }
}
