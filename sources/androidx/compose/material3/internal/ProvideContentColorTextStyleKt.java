package androidx.compose.material3.internal;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.text.TextStyle;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
public final class ProvideContentColorTextStyleKt {
    public static final void a(long j2, TextStyle textStyle, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-716124955);
        if ((i2 & 6) == 0) {
            i3 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = TextKt.f12204a;
            CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(j2, ContentColorKt.f8654a), dynamicProvidableCompositionLocal.c(((TextStyle) g2.K(dynamicProvidableCompositionLocal)).e(textStyle))}, pVar, g2, ((i3 >> 3) & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ProvideContentColorTextStyleKt$ProvideContentColorTextStyle$1(j2, textStyle, pVar, i2);
        }
    }
}
