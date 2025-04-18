package androidx.room;

import android.content.ContentValues;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.appevents.UserDataStore;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f21209c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object[] f21210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1(String str, int i2, ContentValues contentValues, String str2, Object[] objArr) {
        super(1);
        this.f21207a = str;
        this.f21208b = i2;
        this.f21209c = contentValues;
        this.d = str2;
        this.f21210f = objArr;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
        p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        return Integer.valueOf(supportSQLiteDatabase.S(this.f21207a, this.f21208b, this.f21209c, this.d, this.f21210f));
    }
}
