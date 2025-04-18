package b1;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class w1 extends h0.a implements h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final w1 f22388b = new h0.a(a0.f22285b);

    @Override // b1.h1
    public final o N(r1 r1Var) {
        return x1.f22395a;
    }

    @Override // b1.h1
    public final void a(CancellationException cancellationException) {
    }

    @Override // b1.h1
    public final q0 g0(q0.l lVar) {
        return x1.f22395a;
    }

    @Override // b1.h1
    public final h1 getParent() {
        return null;
    }

    @Override // b1.h1
    public final boolean isActive() {
        return true;
    }

    @Override // b1.h1
    public final boolean isCancelled() {
        return false;
    }

    @Override // b1.h1
    public final CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // b1.h1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // b1.h1
    public final Object v(h0.g gVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // b1.h1
    public final q0 y(boolean z2, boolean z3, q0.l lVar) {
        return x1.f22395a;
    }
}
