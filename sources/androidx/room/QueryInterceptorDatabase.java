package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import b1.f0;
import e0.t;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {

    /* renamed from: a, reason: collision with root package name */
    public final SupportSQLiteDatabase f21315a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f21316b;

    /* renamed from: c, reason: collision with root package name */
    public final RoomDatabase.QueryCallback f21317c;

    public QueryInterceptorDatabase(SupportSQLiteDatabase supportSQLiteDatabase, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        p0.a.s(supportSQLiteDatabase, "delegate");
        p0.a.s(executor, "queryCallbackExecutor");
        p0.a.s(queryCallback, "queryCallback");
        this.f21315a = supportSQLiteDatabase;
        this.f21316b = executor;
        this.f21317c = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor A(SupportSQLiteQuery supportSQLiteQuery) {
        p0.a.s(supportSQLiteQuery, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.c(queryInterceptorProgram);
        this.f21316b.execute(new c(this, supportSQLiteQuery, queryInterceptorProgram, 1));
        return this.f21315a.A(supportSQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void C(Locale locale) {
        p0.a.s(locale, "locale");
        this.f21315a.C(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void K(int i2) {
        this.f21315a.K(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement M(String str) {
        p0.a.s(str, "sql");
        return new QueryInterceptorStatement(this.f21315a.M(str), str, this.f21316b, this.f21317c);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean O() {
        return this.f21315a.O();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void P(boolean z2) {
        this.f21315a.P(z2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long R() {
        return this.f21315a.R();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int S(String str, int i2, ContentValues contentValues, String str2, Object[] objArr) {
        p0.a.s(str, "table");
        p0.a.s(contentValues, "values");
        return this.f21315a.S(str, i2, contentValues, str2, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean V() {
        return this.f21315a.V();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor W(String str) {
        p0.a.s(str, "query");
        this.f21316b.execute(new d(this, str, 0));
        return this.f21315a.W(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long X(String str, int i2, ContentValues contentValues) {
        p0.a.s(str, "table");
        p0.a.s(contentValues, "values");
        return this.f21315a.X(str, i2, contentValues);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int b(String str, String str2, Object[] objArr) {
        p0.a.s(str, "table");
        return this.f21315a.b(str, str2, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean c0() {
        return this.f21315a.c0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21315a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void d() {
        this.f21316b.execute(new b(this, 2));
        this.f21315a.d();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean d0() {
        return this.f21315a.d0();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void e0(int i2) {
        this.f21315a.e0(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List f() {
        return this.f21315a.f();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void f0(long j2) {
        this.f21315a.f0(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void g(String str) {
        p0.a.s(str, "sql");
        this.f21316b.execute(new d(this, str, 1));
        this.f21315a.g(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.f21315a.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.f21315a.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.f21315a.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.f21315a.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean j() {
        return this.f21315a.j();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor l(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        p0.a.s(supportSQLiteQuery, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.c(queryInterceptorProgram);
        this.f21316b.execute(new c(this, supportSQLiteQuery, queryInterceptorProgram, 0));
        return this.f21315a.A(supportSQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void m() {
        this.f21316b.execute(new b(this, 1));
        this.f21315a.m();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void p(String str, Object[] objArr) {
        p0.a.s(str, "sql");
        p0.a.s(objArr, "bindArgs");
        f0.c cVar = new f0.c();
        t.u0(cVar, objArr);
        f0.c e = f0.e(cVar);
        this.f21316b.execute(new e(this, 0, str, e));
        this.f21315a.p(str, e.toArray(new Object[0]));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void q() {
        this.f21316b.execute(new b(this, 0));
        this.f21315a.q();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long r(long j2) {
        return this.f21315a.r(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean w() {
        return this.f21315a.w();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void x() {
        this.f21316b.execute(new b(this, 3));
        this.f21315a.x();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean z(int i2) {
        return this.f21315a.z(i2);
    }
}
