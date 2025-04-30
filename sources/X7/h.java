package X7;

import Q7.M;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes3.dex */
public abstract class h extends M {

    /* renamed from: d, reason: collision with root package name */
    public final c f3732d;

    public h(int i9, int i10, String str, long j7) {
        this.f3732d = new c(i9, i10, str, j7);
    }

    @Override // Q7.AbstractC0251t
    public final void j(w7.k kVar, Runnable runnable) {
        c cVar = this.f3732d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3720j;
        cVar.b(runnable, k.f3740g, false);
    }
}
