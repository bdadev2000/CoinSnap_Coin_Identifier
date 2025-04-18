package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import d0.b0;
import h0.g;
import q0.p;

/* loaded from: classes3.dex */
public final class RepeatOnLifecycleKt {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, p pVar, g gVar) {
        Object J;
        if (state == Lifecycle.State.f19988b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        Lifecycle.State b2 = lifecycle.b();
        Lifecycle.State state2 = Lifecycle.State.f19987a;
        b0 b0Var = b0.f30125a;
        return (b2 != state2 && (J = p0.a.J(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), gVar)) == i0.a.f30806a) ? J : b0Var;
    }
}
