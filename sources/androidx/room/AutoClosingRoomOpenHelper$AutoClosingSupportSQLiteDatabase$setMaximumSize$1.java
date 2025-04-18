package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.appevents.UserDataStore;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f21206a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1(long j2) {
        super(1);
        this.f21206a = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
        p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        return Long.valueOf(supportSQLiteDatabase.r(this.f21206a));
    }
}
