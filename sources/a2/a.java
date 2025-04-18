package a2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import v1.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.f47b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i10 = this.a;
        Object obj = this.f47b;
        switch (i10) {
            case 0:
                z1.i query = (z1.i) obj;
                Intrinsics.checkNotNullParameter(query, "$query");
                Intrinsics.checkNotNull(sQLiteQuery);
                query.g(new b0(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                Function4 tmp0 = (Function4) obj;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
