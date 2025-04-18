package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f21465b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f21466c = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f21467a;

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Api30Impl {
        @DoNotInline
        public final void a(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String str, @Nullable Object[] objArr) {
            p0.a.s(sQLiteDatabase, "sQLiteDatabase");
            p0.a.s(str, "sql");
            sQLiteDatabase.execPerConnectionSQL(str, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        p0.a.s(sQLiteDatabase, "delegate");
        this.f21467a = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor A(SupportSQLiteQuery supportSQLiteQuery) {
        p0.a.s(supportSQLiteQuery, "query");
        Cursor rawQueryWithFactory = this.f21467a.rawQueryWithFactory(new a(new FrameworkSQLiteDatabase$query$cursorFactory$1(supportSQLiteQuery), 1), supportSQLiteQuery.a(), f21466c, null);
        p0.a.r(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void C(Locale locale) {
        p0.a.s(locale, "locale");
        this.f21467a.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void K(int i2) {
        this.f21467a.setVersion(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement M(String str) {
        p0.a.s(str, "sql");
        SQLiteStatement compileStatement = this.f21467a.compileStatement(str);
        p0.a.r(compileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean O() {
        return this.f21467a.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void P(boolean z2) {
        SQLiteDatabase sQLiteDatabase = this.f21467a;
        p0.a.s(sQLiteDatabase, "sQLiteDatabase");
        sQLiteDatabase.setForeignKeyConstraintsEnabled(z2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long R() {
        return this.f21467a.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int S(String str, int i2, ContentValues contentValues, String str2, Object[] objArr) {
        p0.a.s(str, "table");
        p0.a.s(contentValues, "values");
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f21465b[i2]);
        sb.append(str);
        sb.append(" SET ");
        int i3 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i3 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i3] = contentValues.get(str3);
            sb.append("=?");
            i3++;
        }
        if (objArr != null) {
            for (int i4 = size; i4 < length; i4++) {
                objArr2[i4] = objArr[i4 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement M = M(sb2);
        SimpleSQLiteQuery.Companion.a(M, objArr2);
        return ((FrameworkSQLiteStatement) M).f21492b.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean V() {
        return this.f21467a.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor W(String str) {
        p0.a.s(str, "query");
        return A(new SimpleSQLiteQuery(str));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long X(String str, int i2, ContentValues contentValues) {
        p0.a.s(str, "table");
        p0.a.s(contentValues, "values");
        return this.f21467a.insertWithOnConflict(str, null, contentValues, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int b(String str, String str2, Object[] objArr) {
        p0.a.s(str, "table");
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str);
        if (str2 != null && str2.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement M = M(sb2);
        SimpleSQLiteQuery.Companion.a(M, objArr);
        return ((FrameworkSQLiteStatement) M).f21492b.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean c0() {
        return this.f21467a.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21467a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void d() {
        this.f21467a.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean d0() {
        SQLiteDatabase sQLiteDatabase = this.f21467a;
        p0.a.s(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void e0(int i2) {
        this.f21467a.setMaxSqlCacheSize(i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List f() {
        return this.f21467a.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void f0(long j2) {
        this.f21467a.setPageSize(j2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void g(String str) {
        p0.a.s(str, "sql");
        this.f21467a.execSQL(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.f21467a.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        return this.f21467a.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.f21467a.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.f21467a.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean j() {
        return this.f21467a.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor l(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        p0.a.s(supportSQLiteQuery, "query");
        String a2 = supportSQLiteQuery.a();
        String[] strArr = f21466c;
        p0.a.p(cancellationSignal);
        a aVar = new a(supportSQLiteQuery, 0);
        SQLiteDatabase sQLiteDatabase = this.f21467a;
        p0.a.s(sQLiteDatabase, "sQLiteDatabase");
        p0.a.s(a2, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, a2, strArr, null, cancellationSignal);
        p0.a.r(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void m() {
        this.f21467a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void p(String str, Object[] objArr) {
        p0.a.s(str, "sql");
        p0.a.s(objArr, "bindArgs");
        this.f21467a.execSQL(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void q() {
        this.f21467a.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long r(long j2) {
        SQLiteDatabase sQLiteDatabase = this.f21467a;
        sQLiteDatabase.setMaximumSize(j2);
        return sQLiteDatabase.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean w() {
        return this.f21467a.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void x() {
        this.f21467a.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean z(int i2) {
        return this.f21467a.needUpgrade(i2);
    }
}
