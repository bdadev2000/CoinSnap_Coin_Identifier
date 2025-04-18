package b1;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class p0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Future f22361a;

    public p0(ScheduledFuture scheduledFuture) {
        this.f22361a = scheduledFuture;
    }

    @Override // b1.q0
    public final void dispose() {
        this.f22361a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f22361a + ']';
    }
}
