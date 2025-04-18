package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class RoomDatabase$beginTransaction$1 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        p0.a.s((SupportSQLiteDatabase) obj, "it");
        RoomDatabase.access$internalBeginTransaction(null);
        return null;
    }
}
