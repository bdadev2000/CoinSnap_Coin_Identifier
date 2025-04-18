package g;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import coil.compose.ContentPainterElement;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g.w r25, java.lang.String r26, androidx.compose.ui.Modifier r27, q0.l r28, q0.l r29, androidx.compose.ui.Alignment r30, androidx.compose.ui.layout.ContentScale r31, float r32, androidx.compose.ui.graphics.ColorFilter r33, int r34, boolean r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a(g.w, java.lang.String, androidx.compose.ui.Modifier, q0.l, q0.l, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Modifier modifier, t tVar, String str, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, boolean z2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(777774312);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.I(tVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.I(str) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= g2.I(alignment) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= g2.I(contentScale) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= g2.b(f2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= g2.I(colorFilter) ? 1048576 : Opcodes.ASM8;
        }
        if ((29360128 & i2) == 0) {
            i3 |= g2.a(z2) ? 8388608 : 4194304;
        }
        if ((i3 & 23967451) == 4793490 && g2.i()) {
            g2.A();
        } else {
            r.e eVar = j0.f30546b;
            Modifier b2 = str != null ? SemanticsModifierKt.b(modifier, false, new h0(str)) : modifier;
            if (z2) {
                b2 = ClipKt.b(b2);
            }
            Modifier T0 = b2.T0(new ContentPainterElement(tVar, alignment, contentScale, f2, colorFilter));
            d dVar = d.f30524a;
            g2.t(544976794);
            int i4 = g2.P;
            Modifier c2 = ComposedModifierKt.c(g2, T0);
            PersistentCompositionLocalMap Q = g2.Q();
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            g2.t(1405779621);
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(new b(aVar, 0));
            } else {
                g2.n();
            }
            Updater.b(g2, dVar, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            q0.p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                android.support.v4.media.d.x(i4, g2, i4, pVar);
            }
            g2.V(true);
            g2.V(false);
            g2.V(false);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new e(modifier, tVar, str, alignment, contentScale, f2, colorFilter, z2, i2);
        }
    }
}
