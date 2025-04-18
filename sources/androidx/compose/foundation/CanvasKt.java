package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import q0.l;

/* loaded from: classes3.dex */
public final class CanvasKt {
    public static final void a(Modifier modifier, l lVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(lVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            SpacerKt.a(DrawModifierKt.b(modifier, lVar), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CanvasKt$Canvas$1(modifier, lVar, i2);
        }
    }
}
