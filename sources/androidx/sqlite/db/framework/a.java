package androidx.sqlite.db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import q0.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21494b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f21493a = i2;
        this.f21494b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i2 = this.f21493a;
        Object obj = this.f21494b;
        switch (i2) {
            case 0:
                SupportSQLiteQuery supportSQLiteQuery = (SupportSQLiteQuery) obj;
                p0.a.s(supportSQLiteQuery, "$query");
                p0.a.p(sQLiteQuery);
                supportSQLiteQuery.c(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                r rVar = (r) obj;
                p0.a.s(rVar, "$tmp0");
                return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
