package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
public final class LabelKt {
    public static final void a(boolean z2, TooltipState tooltipState, MutableInteractionSource mutableInteractionSource, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-627258109);
        if ((i2 & 6) == 0) {
            i3 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? g2.I(tooltipState) : g2.w(tooltipState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(mutableInteractionSource) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else if (z2) {
            boolean z3 = false;
            boolean z4 = (i3 & 896) == 256;
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && g2.w(tooltipState))) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object u2 = g2.u();
            if (z5 || u2 == Composer.Companion.f13690a) {
                u2 = new LabelKt$HandleInteractions$1$1(mutableInteractionSource, tooltipState, null);
                g2.o(u2);
            }
            EffectsKt.f(mutableInteractionSource, (p) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LabelKt$HandleInteractions$2(z2, tooltipState, mutableInteractionSource, i2);
        }
    }
}
