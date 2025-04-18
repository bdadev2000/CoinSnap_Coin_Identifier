package b1;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public interface h1 extends h0.j {
    public static final /* synthetic */ int n8 = 0;

    o N(r1 r1Var);

    void a(CancellationException cancellationException);

    q0 g0(q0.l lVar);

    h1 getParent();

    boolean isActive();

    boolean isCancelled();

    CancellationException n();

    boolean start();

    Object v(h0.g gVar);

    q0 y(boolean z2, boolean z3, q0.l lVar);
}
