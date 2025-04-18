package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import q0.q;

/* loaded from: classes2.dex */
public final class LookaheadScopeKt {
    public static final void a(q qVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1078066484);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(qVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = new Object();
                g2.o(u2);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) u2;
            LookaheadScopeKt$LookaheadScope$1 lookaheadScopeKt$LookaheadScope$1 = LookaheadScopeKt$LookaheadScope$1.f15795a;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(lookaheadScopeKt$LookaheadScope$1);
            } else {
                g2.n();
            }
            Updater.a(g2, LookaheadScopeKt$LookaheadScope$2$1.f15796a);
            Updater.b(g2, lookaheadScopeImpl, LookaheadScopeKt$LookaheadScope$2$2.f15797a);
            qVar.invoke(lookaheadScopeImpl, g2, Integer.valueOf((i3 << 3) & 112));
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LookaheadScopeKt$LookaheadScope$4(qVar, i2);
        }
    }
}
