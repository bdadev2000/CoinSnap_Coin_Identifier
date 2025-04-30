package Q7;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Q7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0235c extends AbstractC0233a {

    /* renamed from: f, reason: collision with root package name */
    public final Thread f2555f;

    /* renamed from: g, reason: collision with root package name */
    public final L f2556g;

    public C0235c(w7.k kVar, Thread thread, L l) {
        super(kVar, true);
        this.f2555f = thread;
        this.f2556g = l;
    }

    @Override // Q7.d0
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f2555f;
        if (!G7.j.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
