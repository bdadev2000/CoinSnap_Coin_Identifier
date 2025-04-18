package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {

    /* renamed from: a, reason: collision with root package name */
    public final SupportSQLiteStatement f21319a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f21320b;

    /* renamed from: c, reason: collision with root package name */
    public final RoomDatabase.QueryCallback f21321c;
    public final ArrayList d;

    public QueryInterceptorStatement(SupportSQLiteStatement supportSQLiteStatement, String str, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        p0.a.s(supportSQLiteStatement, "delegate");
        p0.a.s(str, "sqlStatement");
        p0.a.s(executor, "queryCallbackExecutor");
        p0.a.s(queryCallback, "queryCallback");
        this.f21319a = supportSQLiteStatement;
        this.f21320b = executor;
        this.f21321c = queryCallback;
        this.d = new ArrayList();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long I() {
        this.f21320b.execute(new f(this, 2));
        return this.f21319a.I();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long J() {
        this.f21320b.execute(new f(this, 4));
        return this.f21319a.J();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void L(int i2, String str) {
        p0.a.s(str, "value");
        a(i2, str);
        this.f21319a.L(i2, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Q(int i2, long j2) {
        a(i2, Long.valueOf(j2));
        this.f21319a.Q(i2, j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void T(int i2, byte[] bArr) {
        a(i2, bArr);
        this.f21319a.T(i2, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void Z(double d, int i2) {
        a(i2, Double.valueOf(d));
        this.f21319a.Z(d, i2);
    }

    public final void a(int i2, Object obj) {
        int i3 = i2 - 1;
        ArrayList arrayList = this.d;
        if (i3 >= arrayList.size()) {
            int size = (i3 - arrayList.size()) + 1;
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(null);
            }
        }
        arrayList.set(i3, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void a0(int i2) {
        a(i2, null);
        this.f21319a.a0(i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21319a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        this.f21320b.execute(new f(this, 1));
        this.f21319a.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int k() {
        this.f21320b.execute(new f(this, 0));
        return this.f21319a.k();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final String t() {
        this.f21320b.execute(new f(this, 3));
        return this.f21319a.t();
    }
}
