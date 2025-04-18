package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.jvm.internal.r;
import p0.a;

/* loaded from: classes4.dex */
public final class ComposableLambdaKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14482a = new Object();

    public static final int a(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final ComposableLambdaImpl b(Composer composer, int i2, r rVar) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.y(Integer.rotateLeft(i2, 1), f14482a);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            composableLambdaImpl = new ComposableLambdaImpl(i2, rVar, true);
            composer.o(composableLambdaImpl);
        } else {
            a.q(u2, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) u2;
            composableLambdaImpl.J(rVar);
        }
        composer.G();
        return composableLambdaImpl;
    }

    public static final ComposableLambdaImpl c(int i2, r rVar, Composer composer) {
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = new ComposableLambdaImpl(i2, rVar, true);
            composer.o(u2);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) u2;
        composableLambdaImpl.J(rVar);
        return composableLambdaImpl;
    }

    public static final boolean d(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.b() || a.g(recomposeScope, recomposeScope2) || a.g(recomposeScopeImpl.f13870c, ((RecomposeScopeImpl) recomposeScope2).f13870c)) {
                }
            }
            return false;
        }
        return true;
    }
}
