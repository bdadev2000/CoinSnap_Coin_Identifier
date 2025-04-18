package b1;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public final class g extends a {
    public final Thread d;

    /* renamed from: f, reason: collision with root package name */
    public final y0 f22319f;

    public g(h0.l lVar, Thread thread, y0 y0Var) {
        super(lVar, true);
        this.d = thread;
        this.f22319f = y0Var;
    }

    @Override // b1.r1
    public final void p(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (p0.a.g(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
