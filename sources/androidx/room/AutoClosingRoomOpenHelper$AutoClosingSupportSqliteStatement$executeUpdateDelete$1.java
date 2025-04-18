package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1 f21219a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteStatement supportSQLiteStatement = (SupportSQLiteStatement) obj;
        p0.a.s(supportSQLiteStatement, "obj");
        return Integer.valueOf(supportSQLiteStatement.k());
    }
}
