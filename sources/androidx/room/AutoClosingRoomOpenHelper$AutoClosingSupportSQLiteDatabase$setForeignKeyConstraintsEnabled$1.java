package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.appevents.UserDataStore;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21203a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1(boolean z2) {
        super(1);
        this.f21203a = z2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
        p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        supportSQLiteDatabase.P(this.f21203a);
        return null;
    }
}
