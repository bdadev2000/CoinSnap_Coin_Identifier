package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.appevents.UserDataStore;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21186a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1(String str) {
        super(1);
        this.f21186a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
        p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        supportSQLiteDatabase.g(this.f21186a);
        return null;
    }
}
