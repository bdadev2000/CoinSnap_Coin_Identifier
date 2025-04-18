package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicInteger;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class StateObjectImpl implements StateObject {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInt f14633a = new AtomicInteger(0);

    public final boolean t(int i2) {
        return (i2 & this.f14633a.get()) != 0;
    }

    public final void v(int i2) {
        AtomicInt atomicInt;
        int i3;
        do {
            atomicInt = this.f14633a;
            i3 = atomicInt.get();
            if ((i3 & i2) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i3, i3 | i2));
    }
}
