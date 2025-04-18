package a2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z1.j;

/* loaded from: classes.dex */
public final class c implements z1.a {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f49c = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f50b;

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f50b = delegate;
    }

    @Override // z1.a
    public final void A() {
        this.f50b.beginTransaction();
    }

    @Override // z1.a
    public final List B() {
        return this.f50b.getAttachedDbs();
    }

    @Override // z1.a
    public final void C(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f50b.execSQL(sql);
    }

    @Override // z1.a
    public final void F() {
        this.f50b.setTransactionSuccessful();
    }

    @Override // z1.a
    public final void G(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f50b.execSQL(sql, bindArgs);
    }

    @Override // z1.a
    public final void H() {
        this.f50b.beginTransactionNonExclusive();
    }

    @Override // z1.a
    public final Cursor I(z1.i query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f50b;
        String sql = query.d();
        String[] selectionArgs = f49c;
        Intrinsics.checkNotNull(cancellationSignal);
        a cursorFactory = new a(query, 0);
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, null, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // z1.a
    public final void J() {
        this.f50b.endTransaction();
    }

    @Override // z1.a
    public final Cursor K(z1.i query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Cursor rawQueryWithFactory = this.f50b.rawQueryWithFactory(new a(new b(query), 1), query.d(), f49c, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // z1.a
    public final j N(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f50b.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new i(compileStatement);
    }

    @Override // z1.a
    public final Cursor O(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return K(new hi.e(query));
    }

    @Override // z1.a
    public final boolean Q() {
        return this.f50b.inTransaction();
    }

    @Override // z1.a
    public final boolean R() {
        SQLiteDatabase sQLiteDatabase = this.f50b;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f50b.close();
    }

    @Override // z1.a
    public final boolean isOpen() {
        return this.f50b.isOpen();
    }

    @Override // z1.a
    public final String z() {
        return this.f50b.getPath();
    }
}
