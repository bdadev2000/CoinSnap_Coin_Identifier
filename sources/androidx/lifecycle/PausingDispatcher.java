package androidx.lifecycle;

import b1.o0;
import b1.z;
import c1.e;
import g1.u;
import h0.l;

/* loaded from: classes4.dex */
public final class PausingDispatcher extends z {

    /* renamed from: c, reason: collision with root package name */
    public final DispatchQueue f20047c = new DispatchQueue();

    @Override // b1.z
    public final void h0(l lVar, Runnable runnable) {
        p0.a.s(lVar, "context");
        p0.a.s(runnable, "block");
        DispatchQueue dispatchQueue = this.f20047c;
        dispatchQueue.getClass();
        h1.d dVar = o0.f22355a;
        e eVar = ((e) u.f30639a).f22411g;
        if (!eVar.j0(lVar)) {
            if (!(dispatchQueue.f19958b || !dispatchQueue.f19957a)) {
                if (!dispatchQueue.d.offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
                dispatchQueue.a();
                return;
            }
        }
        eVar.h0(lVar, new androidx.core.content.res.a(3, dispatchQueue, runnable));
    }

    @Override // b1.z
    public final boolean j0(l lVar) {
        p0.a.s(lVar, "context");
        h1.d dVar = o0.f22355a;
        if (((e) u.f30639a).f22411g.j0(lVar)) {
            return true;
        }
        DispatchQueue dispatchQueue = this.f20047c;
        return !(dispatchQueue.f19958b || !dispatchQueue.f19957a);
    }
}
