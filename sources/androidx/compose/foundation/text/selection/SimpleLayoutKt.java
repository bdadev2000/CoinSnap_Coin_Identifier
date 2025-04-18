package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import q0.p;

/* loaded from: classes3.dex */
public final class SimpleLayoutKt {
    public static final void a(Modifier modifier, p pVar, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-2105228848);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            SimpleLayoutKt$SimpleLayout$1 simpleLayoutKt$SimpleLayout$1 = SimpleLayoutKt$SimpleLayout$1.f7290a;
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            int i7 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, simpleLayoutKt$SimpleLayout$1, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar2);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            d.y((i7 >> 6) & 14, pVar, g2, true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SimpleLayoutKt$SimpleLayout$2(modifier, pVar, i2, i3);
        }
    }
}
