package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* loaded from: classes.dex */
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor A(SupportSQLiteQuery supportSQLiteQuery) {
            p0.a.s(supportSQLiteQuery, "query");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void C(Locale locale) {
            p0.a.s(locale, "locale");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void K(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final SupportSQLiteStatement M(String str) {
            p0.a.s(str, "sql");
            return new AutoClosingSupportSqliteStatement(str, null);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean O() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void P(boolean z2) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long R() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1.f21197a;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final int S(String str, int i2, ContentValues contentValues, String str2, Object[] objArr) {
            p0.a.s(str, "table");
            p0.a.s(contentValues, "values");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean V() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.f21213a;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor W(String str) {
            p0.a.s(str, "query");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long X(String str, int i2, ContentValues contentValues) {
            p0.a.s(str, "table");
            p0.a.s(contentValues, "values");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final int b(String str, String str2, Object[] objArr) {
            p0.a.s(str, "table");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean c0() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void d() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean d0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void e0(int i2) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final List f() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void f0(long j2) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void g(String str) {
            p0.a.s(str, "sql");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long getPageSize() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1.f21199a;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final String getPath() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final int getVersion() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1.f21211a;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean isOpen() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean j() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor l(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
            p0.a.s(supportSQLiteQuery, "query");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void m() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void p(String str, Object[] objArr) {
            p0.a.s(str, "sql");
            p0.a.s(objArr, "bindArgs");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void q() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long r(long j2) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean w() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void x() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean z(int i2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {

        /* renamed from: a, reason: collision with root package name */
        public final String f21214a;

        /* renamed from: b, reason: collision with root package name */
        public final AutoCloser f21215b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f21216c;

        public AutoClosingSupportSqliteStatement(String str, AutoCloser autoCloser) {
            p0.a.s(str, "sql");
            p0.a.s(autoCloser, "autoCloser");
            this.f21214a = str;
            this.f21215b = autoCloser;
            this.f21216c = new ArrayList();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long I() {
            return ((Number) a(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1.f21218a)).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long J() {
            return ((Number) a(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1.f21220a)).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void L(int i2, String str) {
            p0.a.s(str, "value");
            c(i2, str);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void Q(int i2, long j2) {
            c(i2, Long.valueOf(j2));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void T(int i2, byte[] bArr) {
            c(i2, bArr);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void Z(double d, int i2) {
            c(i2, Double.valueOf(d));
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(q0.l r1) {
            /*
                r0 = this;
                androidx.room.AutoCloser r1 = r0.f21215b
                r1.getClass()
                r1 = 0
                throw r1     // Catch: java.lang.Throwable -> L7
            L7:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.a(q0.l):java.lang.Object");
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void a0(int i2) {
            c(i2, null);
        }

        public final void c(int i2, Object obj) {
            int size;
            int i3 = i2 - 1;
            ArrayList arrayList = this.f21216c;
            if (i3 >= arrayList.size() && (size = arrayList.size()) <= i3) {
                while (true) {
                    arrayList.add(null);
                    if (size == i3) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            arrayList.set(i3, obj);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final void execute() {
            a(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1.f21217a);
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final int k() {
            return ((Number) a(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1.f21219a)).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final String t() {
            return (String) a(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1.f21221a);
        }
    }

    /* loaded from: classes.dex */
    public static final class KeepAliveCursor implements Cursor {

        /* renamed from: a, reason: collision with root package name */
        public final Cursor f21222a;

        /* renamed from: b, reason: collision with root package name */
        public final AutoCloser f21223b;

        public KeepAliveCursor(Cursor cursor, AutoCloser autoCloser) {
            p0.a.s(cursor, "delegate");
            p0.a.s(autoCloser, "autoCloser");
            this.f21222a = cursor;
            this.f21223b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f21222a.close();
            this.f21223b.a();
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
            this.f21222a.copyStringToBuffer(i2, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public final void deactivate() {
            this.f21222a.deactivate();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i2) {
            return this.f21222a.getBlob(i2);
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.f21222a.getColumnCount();
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            return this.f21222a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            return this.f21222a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i2) {
            return this.f21222a.getColumnName(i2);
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            return this.f21222a.getColumnNames();
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.f21222a.getCount();
        }

        @Override // android.database.Cursor
        public final double getDouble(int i2) {
            return this.f21222a.getDouble(i2);
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            return this.f21222a.getExtras();
        }

        @Override // android.database.Cursor
        public final float getFloat(int i2) {
            return this.f21222a.getFloat(i2);
        }

        @Override // android.database.Cursor
        public final int getInt(int i2) {
            return this.f21222a.getInt(i2);
        }

        @Override // android.database.Cursor
        public final long getLong(int i2) {
            return this.f21222a.getLong(i2);
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            Cursor cursor = this.f21222a;
            p0.a.s(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            p0.a.r(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @Override // android.database.Cursor
        public final List getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.a(this.f21222a);
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.f21222a.getPosition();
        }

        @Override // android.database.Cursor
        public final short getShort(int i2) {
            return this.f21222a.getShort(i2);
        }

        @Override // android.database.Cursor
        public final String getString(int i2) {
            return this.f21222a.getString(i2);
        }

        @Override // android.database.Cursor
        public final int getType(int i2) {
            return this.f21222a.getType(i2);
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.f21222a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.f21222a.isAfterLast();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.f21222a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.f21222a.isClosed();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.f21222a.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.f21222a.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i2) {
            return this.f21222a.isNull(i2);
        }

        @Override // android.database.Cursor
        public final boolean move(int i2) {
            return this.f21222a.move(i2);
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.f21222a.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.f21222a.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.f21222a.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i2) {
            return this.f21222a.moveToPosition(i2);
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.f21222a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            this.f21222a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f21222a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public final boolean requery() {
            return this.f21222a.requery();
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            return this.f21222a.respond(bundle);
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle bundle) {
            p0.a.s(bundle, "extras");
            Cursor cursor = this.f21222a;
            p0.a.s(cursor, "cursor");
            cursor.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f21222a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public final void setNotificationUris(ContentResolver contentResolver, List list) {
            p0.a.s(contentResolver, "cr");
            p0.a.s(list, "uris");
            SupportSQLiteCompat.Api29Impl.b(this.f21222a, contentResolver, list);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            this.f21222a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f21222a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase U() {
        throw null;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final SupportSQLiteOpenHelper a() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        throw null;
    }
}
