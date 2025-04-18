package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.y;

/* loaded from: classes4.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 extends y {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 f21197a = new y(SupportSQLiteDatabase.class, "maximumSize", "getMaximumSize()J", 0);

    @Override // kotlin.jvm.internal.y, x0.l
    public final Object get(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).R());
    }
}
