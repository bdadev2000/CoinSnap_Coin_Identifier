package androidx.room;

import android.content.ContentValues;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.appevents.UserDataStore;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentValues f21192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1(String str, int i2, ContentValues contentValues) {
        super(1);
        this.f21190a = str;
        this.f21191b = i2;
        this.f21192c = contentValues;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
        p0.a.s(supportSQLiteDatabase, UserDataStore.DATE_OF_BIRTH);
        return Long.valueOf(supportSQLiteDatabase.X(this.f21190a, this.f21191b, this.f21192c));
    }
}
