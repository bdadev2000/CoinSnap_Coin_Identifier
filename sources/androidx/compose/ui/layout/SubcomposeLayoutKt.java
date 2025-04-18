package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class SubcomposeLayoutKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SubcomposeLayoutKt$ReusedSlotId$1 f15841a = new Object();

    public static final void a(Modifier modifier, p pVar, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-1298353104);
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
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = new SubcomposeLayoutState(NoOpSubcomposeSlotReusePolicy.f15815a);
                g2.o(u2);
            }
            int i6 = i4 << 3;
            b((SubcomposeLayoutState) u2, modifier, pVar, g2, (i6 & 112) | (i6 & 896), 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SubcomposeLayoutKt$SubcomposeLayout$2(modifier, pVar, i2, i3);
        }
    }

    public static final void b(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, p pVar, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-511989831);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (g2.w(subcomposeLayoutState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.I(modifier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i4 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            int i6 = g2.P;
            CompositionContext F = g2.F();
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            PersistentCompositionLocalMap Q = g2.Q();
            a a2 = LayoutNode.Companion.a();
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(a2);
            } else {
                g2.n();
            }
            Updater.b(g2, subcomposeLayoutState, subcomposeLayoutState.f15852c);
            Updater.b(g2, F, subcomposeLayoutState.d);
            Updater.b(g2, pVar, subcomposeLayoutState.e);
            ComposeUiNode.h8.getClass();
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar2);
            }
            g2.V(true);
            if (g2.i()) {
                g2.J(-26502501);
                g2.V(false);
            } else {
                g2.J(-26580342);
                boolean w = g2.w(subcomposeLayoutState);
                Object u2 = g2.u();
                if (w || u2 == Composer.Companion.f13690a) {
                    u2 = new SubcomposeLayoutKt$SubcomposeLayout$4$1(subcomposeLayoutState);
                    g2.o(u2);
                }
                g2.L((a) u2);
                g2.V(false);
            }
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SubcomposeLayoutKt$SubcomposeLayout$5(subcomposeLayoutState, modifier2, pVar, i2, i3);
        }
    }
}
