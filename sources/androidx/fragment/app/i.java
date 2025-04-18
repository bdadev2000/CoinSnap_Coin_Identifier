package androidx.fragment.app;

import android.transition.Transition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1644c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1645d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c2 operation, j0.e signal, boolean z10, boolean z11) {
        super(operation, signal);
        Object exitTransition;
        boolean z12;
        Object obj;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        b2 b2Var = operation.a;
        b2 b2Var2 = b2.VISIBLE;
        Fragment fragment = operation.f1596c;
        if (b2Var == b2Var2) {
            if (z10) {
                exitTransition = fragment.getReenterTransition();
            } else {
                exitTransition = fragment.getEnterTransition();
            }
        } else if (z10) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        this.f1644c = exitTransition;
        if (operation.a == b2Var2) {
            if (z10) {
                z12 = fragment.getAllowReturnTransitionOverlap();
            } else {
                z12 = fragment.getAllowEnterTransitionOverlap();
            }
        } else {
            z12 = true;
        }
        this.f1645d = z12;
        if (z11) {
            if (z10) {
                obj = fragment.getSharedElementReturnTransition();
            } else {
                obj = fragment.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.f1646e = obj;
    }

    public final u1 c() {
        boolean z10;
        Object obj = this.f1644c;
        u1 d10 = d(obj);
        Object obj2 = this.f1646e;
        u1 d11 = d(obj2);
        if (d10 != null && d11 != null && d10 != d11) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (d10 == null) {
                return d11;
            }
            return d10;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.f1596c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final u1 d(Object obj) {
        if (obj == null) {
            return null;
        }
        s1 s1Var = n1.a;
        if (obj instanceof Transition) {
            return s1Var;
        }
        u1 u1Var = n1.f1697b;
        if (u1Var != null && u1Var.e(obj)) {
            return u1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.f1596c + " is not a valid framework Transition or AndroidX Transition");
    }
}
