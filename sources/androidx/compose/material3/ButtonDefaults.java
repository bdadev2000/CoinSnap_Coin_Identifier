package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred
/* loaded from: classes.dex */
public final class ButtonDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f8037a;

    /* renamed from: b, reason: collision with root package name */
    public static final PaddingValuesImpl f8038b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f8039c;
    public static final float d;
    public static final float e;

    static {
        float f2 = 24;
        float f3 = 8;
        f8037a = new PaddingValuesImpl(f2, f3, f2, f3);
        float f4 = 16;
        new PaddingValuesImpl(f4, f3, f2, f3);
        float f5 = 12;
        f8038b = new PaddingValuesImpl(f5, f3, f5, f3);
        new PaddingValuesImpl(f5, f3, f4, f3);
        f8039c = 58;
        d = 40;
        float f6 = FilledButtonTokens.f13348a;
        e = f3;
    }

    public static ButtonColors a(long j2, Composer composer) {
        long j3 = Color.f14962i;
        return b(MaterialTheme.a(composer)).a(j2, j3, j3, j3);
    }

    public static ButtonColors b(ColorScheme colorScheme) {
        ButtonColors buttonColors = colorScheme.K;
        if (buttonColors != null) {
            return buttonColors;
        }
        float f2 = FilledButtonTokens.f13348a;
        ButtonColors buttonColors2 = new ButtonColors(ColorSchemeKt.e(colorScheme, ColorSchemeKeyTokens.f13278n), ColorSchemeKt.e(colorScheme, FilledButtonTokens.f13353h), Color.b(ColorSchemeKt.e(colorScheme, FilledButtonTokens.f13350c), 0.12f), Color.b(ColorSchemeKt.e(colorScheme, FilledButtonTokens.e), 0.38f));
        colorScheme.K = buttonColors2;
        return buttonColors2;
    }

    public static ButtonColors c(ColorScheme colorScheme) {
        ButtonColors buttonColors = colorScheme.N;
        if (buttonColors != null) {
            return buttonColors;
        }
        long j2 = Color.f14961h;
        float f2 = OutlinedButtonTokens.f13455a;
        ButtonColors buttonColors2 = new ButtonColors(j2, ColorSchemeKt.e(colorScheme, ColorSchemeKeyTokens.f13278n), j2, Color.b(ColorSchemeKt.e(colorScheme, ColorSchemeKeyTokens.f13273i), 0.38f));
        colorScheme.N = buttonColors2;
        return buttonColors2;
    }

    public static ButtonColors d(ColorScheme colorScheme) {
        ButtonColors buttonColors = colorScheme.O;
        if (buttonColors != null) {
            return buttonColors;
        }
        long j2 = Color.f14961h;
        ButtonColors buttonColors2 = new ButtonColors(j2, ColorSchemeKt.e(colorScheme, ColorSchemeKeyTokens.f13278n), j2, Color.b(ColorSchemeKt.e(colorScheme, ColorSchemeKeyTokens.f13273i), 0.38f));
        colorScheme.O = buttonColors2;
        return buttonColors2;
    }

    public static ButtonColors e(long j2, long j3, Composer composer, int i2) {
        if ((i2 & 1) != 0) {
            j2 = Color.f14962i;
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = Color.f14962i;
        }
        return d(MaterialTheme.a(composer)).a(j4, j3, (i2 & 4) != 0 ? Color.f14962i : 0L, (i2 & 8) != 0 ? Color.f14962i : 0L);
    }
}
