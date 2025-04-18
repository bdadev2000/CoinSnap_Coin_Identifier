package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes2.dex */
public final class MaterialThemeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f9712a = new CompositionLocal(MaterialThemeKt$LocalUsingExpressiveTheme$1.f9713a);

    public static final void a(ColorScheme colorScheme, Shapes shapes, Typography typography, p pVar, Composer composer, int i2, int i3) {
        ColorScheme colorScheme2;
        int i4;
        Shapes shapes2;
        Typography typography2;
        Shapes shapes3;
        Typography b2;
        boolean d;
        Object u2;
        int i5;
        int i6;
        int i7;
        ComposerImpl g2 = composer.g(-2127166334);
        if ((i2 & 6) == 0) {
            if ((i3 & 1) == 0) {
                colorScheme2 = colorScheme;
                if (g2.I(colorScheme2)) {
                    i7 = 4;
                    i4 = i7 | i2;
                }
            } else {
                colorScheme2 = colorScheme;
            }
            i7 = 2;
            i4 = i7 | i2;
        } else {
            colorScheme2 = colorScheme;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                shapes2 = shapes;
                if (g2.I(shapes2)) {
                    i6 = 32;
                    i4 |= i6;
                }
            } else {
                shapes2 = shapes;
            }
            i6 = 16;
            i4 |= i6;
        } else {
            shapes2 = shapes;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                typography2 = typography;
                if (g2.I(typography2)) {
                    i5 = 256;
                    i4 |= i5;
                }
            } else {
                typography2 = typography;
            }
            i5 = 128;
            i4 |= i5;
        } else {
            typography2 = typography;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 1171) == 1170 && g2.i()) {
            g2.A();
            shapes3 = shapes2;
            b2 = typography2;
        } else {
            g2.u0();
            if ((i2 & 1) == 0 || g2.e0()) {
                if ((i3 & 1) != 0) {
                    colorScheme2 = MaterialTheme.a(g2);
                }
                shapes3 = (i3 & 2) != 0 ? (Shapes) g2.K(ShapesKt.f11185a) : shapes2;
                if ((i3 & 4) != 0) {
                    b2 = MaterialTheme.b(g2);
                    g2.W();
                    Indication a2 = RippleKt.a(false, 0.0f, 0L, g2, 0, 7);
                    long j2 = colorScheme2.f8506a;
                    d = g2.d(j2);
                    u2 = g2.u();
                    if (!d || u2 == Composer.Companion.f13690a) {
                        u2 = new TextSelectionColors(j2, Color.b(j2, 0.4f));
                        g2.o(u2);
                    }
                    CompositionLocalKt.b(new ProvidedValue[]{ColorSchemeKt.f8552a.c(colorScheme2), IndicationKt.f2752a.c(a2), RippleThemeKt.f7465a.c(CompatRippleTheme.f8556a), ShapesKt.f11185a.c(shapes3), TextSelectionColorsKt.f7360a.c((TextSelectionColors) u2), TypographyKt.f12631a.c(b2)}, ComposableLambdaKt.c(-1066563262, new MaterialThemeKt$MaterialTheme$1(b2, pVar), g2), g2, 56);
                }
            } else {
                g2.A();
                shapes3 = shapes2;
            }
            b2 = typography2;
            g2.W();
            Indication a22 = RippleKt.a(false, 0.0f, 0L, g2, 0, 7);
            long j22 = colorScheme2.f8506a;
            d = g2.d(j22);
            u2 = g2.u();
            if (!d) {
            }
            u2 = new TextSelectionColors(j22, Color.b(j22, 0.4f));
            g2.o(u2);
            CompositionLocalKt.b(new ProvidedValue[]{ColorSchemeKt.f8552a.c(colorScheme2), IndicationKt.f2752a.c(a22), RippleThemeKt.f7465a.c(CompatRippleTheme.f8556a), ShapesKt.f11185a.c(shapes3), TextSelectionColorsKt.f7360a.c((TextSelectionColors) u2), TypographyKt.f12631a.c(b2)}, ComposableLambdaKt.c(-1066563262, new MaterialThemeKt$MaterialTheme$1(b2, pVar), g2), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new MaterialThemeKt$MaterialTheme$2(colorScheme2, shapes3, b2, pVar, i2, i3);
        }
    }
}
