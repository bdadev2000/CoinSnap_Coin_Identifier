package androidx.compose.runtime;

import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.runtime.Composer;
import b1.a0;
import b1.h1;
import b1.k1;
import g1.f;
import h0.m;
import java.util.Arrays;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class EffectsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DisposableEffectScope f13797a = new Object();

    public static final void a(ActivityResultRegistry activityResultRegistry, String str, Object obj, l lVar, Composer composer) {
        boolean I = composer.I(activityResultRegistry) | composer.I(str) | composer.I(obj);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new DisposableEffectImpl(lVar);
            composer.o(u2);
        }
    }

    public static final void b(Object obj, Object obj2, l lVar, Composer composer) {
        boolean I = composer.I(obj) | composer.I(obj2);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new DisposableEffectImpl(lVar);
            composer.o(u2);
        }
    }

    public static final void c(Object obj, l lVar, Composer composer) {
        boolean I = composer.I(obj);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new DisposableEffectImpl(lVar);
            composer.o(u2);
        }
    }

    public static final void d(Object[] objArr, l lVar, Composer composer) {
        boolean z2 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z2 |= composer.I(obj);
        }
        Object u2 = composer.u();
        if (z2 || u2 == Composer.Companion.f13690a) {
            composer.o(new DisposableEffectImpl(lVar));
        }
    }

    public static final void e(Object obj, Object obj2, p pVar, Composer composer) {
        h0.l l2 = composer.l();
        boolean I = composer.I(obj) | composer.I(obj2);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new LaunchedEffectImpl(l2, pVar);
            composer.o(u2);
        }
    }

    public static final void f(Object obj, p pVar, Composer composer) {
        h0.l l2 = composer.l();
        boolean I = composer.I(obj);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new LaunchedEffectImpl(l2, pVar);
            composer.o(u2);
        }
    }

    public static final f g(Composer composer) {
        m mVar = m.f30726a;
        a0 a0Var = a0.f22285b;
        h0.l l2 = composer.l();
        return p0.a.c(l2.u(new k1((h1) l2.i(a0Var))).u(mVar));
    }
}
