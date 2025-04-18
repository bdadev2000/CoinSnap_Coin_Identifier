package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.o;
import q0.l;

/* loaded from: classes3.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 extends o implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 f21189a = new o(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
        p0.a.s(supportSQLiteDatabase, "p0");
        return Boolean.valueOf(supportSQLiteDatabase.c0());
    }
}
