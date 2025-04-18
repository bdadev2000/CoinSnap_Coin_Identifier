package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1 f21218a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteStatement supportSQLiteStatement = (SupportSQLiteStatement) obj;
        p0.a.s(supportSQLiteStatement, "obj");
        return Long.valueOf(supportSQLiteStatement.I());
    }
}
