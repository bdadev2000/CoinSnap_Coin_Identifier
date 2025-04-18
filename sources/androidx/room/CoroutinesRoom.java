package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import b1.b1;
import b1.f0;
import h0.g;
import h0.l;
import java.util.concurrent.Callable;

@RestrictTo
/* loaded from: classes3.dex */
public final class CoroutinesRoom {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final Object a(RoomDatabase roomDatabase, CancellationSignal cancellationSignal, Callable callable, g gVar) {
        l a2;
        if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
            return callable.call();
        }
        TransactionElement transactionElement = (TransactionElement) gVar.getContext().i(TransactionElement.f21390c);
        if (transactionElement == null || (a2 = transactionElement.f21391a) == null) {
            a2 = CoroutinesRoomKt.a(roomDatabase);
        }
        b1.l lVar = new b1.l(1, f0.r(gVar));
        lVar.p();
        lVar.z(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, kotlin.jvm.internal.e.v(b1.f22288a, a2, 0, new CoroutinesRoom$Companion$execute$4$job$1(callable, lVar, null), 2)));
        Object o2 = lVar.o();
        i0.a aVar = i0.a.f30806a;
        return o2;
    }
}
