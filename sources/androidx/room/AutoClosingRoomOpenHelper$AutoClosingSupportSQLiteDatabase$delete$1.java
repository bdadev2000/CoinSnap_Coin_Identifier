package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.appevents.UserDataStore;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object[] f21185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1(String str, String str2, Object[] objArr) {
        super(1);
        this.f21183a = str;
        this.f21184b = str2;
        this.f21185c = objArr;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
        p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        return Integer.valueOf(supportSQLiteDatabase.b(this.f21183a, this.f21184b, this.f21185c));
    }
}
