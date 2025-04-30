package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482q extends AbstractC0471k {
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4768c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4769d;

    public C0482q(L0 l02, boolean z8, boolean z9) {
        super(l02);
        Object exitTransition;
        boolean z10;
        Object obj;
        int i9 = l02.f4666a;
        Fragment fragment = l02.f4667c;
        if (i9 == 2) {
            if (z8) {
                exitTransition = fragment.getReenterTransition();
            } else {
                exitTransition = fragment.getEnterTransition();
            }
        } else if (z8) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        this.b = exitTransition;
        if (l02.f4666a == 2) {
            if (z8) {
                z10 = fragment.getAllowReturnTransitionOverlap();
            } else {
                z10 = fragment.getAllowEnterTransitionOverlap();
            }
        } else {
            z10 = true;
        }
        this.f4768c = z10;
        if (z9) {
            if (z8) {
                obj = fragment.getSharedElementReturnTransition();
            } else {
                obj = fragment.getSharedElementEnterTransition();
            }
        } else {
            obj = null;
        }
        this.f4769d = obj;
    }

    public final G0 b() {
        Object obj = this.b;
        G0 c9 = c(obj);
        Object obj2 = this.f4769d;
        G0 c10 = c(obj2);
        if (c9 != null && c10 != null && c9 != c10) {
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f4731a.f4667c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }
        if (c9 == null) {
            return c10;
        }
        return c9;
    }

    public final G0 c(Object obj) {
        if (obj == null) {
            return null;
        }
        E0 e02 = z0.f4814a;
        if (obj instanceof Transition) {
            return e02;
        }
        G0 g02 = z0.b;
        if (g02 != null && g02.g(obj)) {
            return g02;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f4731a.f4667c + " is not a valid framework Transition or AndroidX Transition");
    }
}
