package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class RoomDatabase$endTransaction$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f21342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$endTransaction$1(RoomDatabase roomDatabase) {
        super(1);
        this.f21342a = roomDatabase;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        p0.a.s((SupportSQLiteDatabase) obj, "it");
        this.f21342a.a();
        return null;
    }
}
