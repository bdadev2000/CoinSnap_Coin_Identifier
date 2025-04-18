package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1 f21217a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteStatement supportSQLiteStatement = (SupportSQLiteStatement) obj;
        p0.a.s(supportSQLiteStatement, "statement");
        supportSQLiteStatement.execute();
        return null;
    }
}
