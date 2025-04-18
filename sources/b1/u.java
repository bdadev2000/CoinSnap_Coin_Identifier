package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22377b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f22378a;

    public u(boolean z2, Throwable th) {
        this.f22378a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f22378a + ']';
    }
}
