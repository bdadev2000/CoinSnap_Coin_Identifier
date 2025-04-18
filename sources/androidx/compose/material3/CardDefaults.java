package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@StabilityInferred
/* loaded from: classes4.dex */
public final class CardDefaults {
    public static CardColors a(long j2, Composer composer) {
        long c2 = ColorSchemeKt.c(j2, composer);
        long j3 = Color.f14962i;
        long b2 = Color.b(c2, 0.38f);
        CardColors e = e(MaterialTheme.a(composer));
        long j4 = j2 != 16 ? j2 : e.f8114a;
        if (c2 == 16) {
            c2 = e.f8115b;
        }
        long j5 = c2;
        if (j3 == 16) {
            j3 = e.f8116c;
        }
        long j6 = j3;
        if (b2 == 16) {
            b2 = e.d;
        }
        return new CardColors(j4, j5, j6, b2);
    }

    public static CardElevation b(float f2, int i2) {
        if ((i2 & 1) != 0) {
            f2 = FilledCardTokens.f13355a;
        }
        return new CardElevation(f2, (i2 & 2) != 0 ? FilledCardTokens.f13361i : 0.0f, (i2 & 4) != 0 ? FilledCardTokens.f13359g : 0.0f, (i2 & 8) != 0 ? FilledCardTokens.f13360h : 0.0f, (i2 & 16) != 0 ? FilledCardTokens.f13358f : 0.0f, (i2 & 32) != 0 ? FilledCardTokens.d : 0.0f);
    }

    public static CardColors c(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        CardColors cardColors = a2.Q;
        if (cardColors != null) {
            return cardColors;
        }
        float f2 = ElevatedCardTokens.f13325a;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.w;
        long e = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        long b2 = ColorSchemeKt.b(a2, ColorSchemeKt.e(a2, colorSchemeKeyTokens));
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ElevatedCardTokens.f13327c;
        CardColors cardColors2 = new CardColors(e, b2, ColorKt.g(Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), ElevatedCardTokens.e), ColorSchemeKt.e(a2, colorSchemeKeyTokens2)), Color.b(ColorSchemeKt.b(a2, ColorSchemeKt.e(a2, colorSchemeKeyTokens)), 0.38f));
        a2.Q = cardColors2;
        return cardColors2;
    }

    public static CardElevation d() {
        return new CardElevation(ElevatedCardTokens.f13325a, ElevatedCardTokens.f13331i, ElevatedCardTokens.f13329g, ElevatedCardTokens.f13330h, ElevatedCardTokens.f13328f, ElevatedCardTokens.d);
    }

    public static CardColors e(ColorScheme colorScheme) {
        CardColors cardColors = colorScheme.P;
        if (cardColors != null) {
            return cardColors;
        }
        float f2 = FilledCardTokens.f13355a;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f13286v;
        CardColors cardColors2 = new CardColors(ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens), ColorSchemeKt.b(colorScheme, ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens)), ColorKt.g(Color.b(ColorSchemeKt.e(colorScheme, FilledCardTokens.f13357c), FilledCardTokens.e), ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens)), Color.b(ColorSchemeKt.b(colorScheme, ColorSchemeKt.e(colorScheme, colorSchemeKeyTokens)), 0.38f));
        colorScheme.P = cardColors2;
        return cardColors2;
    }

    public static BorderStroke f(boolean z2, Composer composer, int i2) {
        long g2;
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if (z2) {
            composer.J(-134409770);
            g2 = ColorSchemeKt.f(OutlinedCardTokens.f13459f, composer);
            composer.D();
        } else {
            composer.J(-134330379);
            long b2 = Color.b(ColorSchemeKt.f(OutlinedCardTokens.d, composer), 0.12f);
            float f2 = ElevatedCardTokens.f13325a;
            g2 = ColorKt.g(b2, ColorSchemeKt.f(ColorSchemeKeyTokens.w, composer));
            composer.D();
        }
        boolean d = composer.d(g2);
        Object u2 = composer.u();
        if (d || u2 == Composer.Companion.f13690a) {
            u2 = BorderStrokeKt.a(g2, OutlinedCardTokens.f13460g);
            composer.o(u2);
        }
        return (BorderStroke) u2;
    }

    public static CardColors g(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        CardColors cardColors = a2.R;
        if (cardColors != null) {
            return cardColors;
        }
        float f2 = OutlinedCardTokens.f13456a;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f13283s;
        CardColors cardColors2 = new CardColors(ColorSchemeKt.e(a2, colorSchemeKeyTokens), ColorSchemeKt.b(a2, ColorSchemeKt.e(a2, colorSchemeKeyTokens)), ColorSchemeKt.e(a2, colorSchemeKeyTokens), Color.b(ColorSchemeKt.b(a2, ColorSchemeKt.e(a2, colorSchemeKeyTokens)), 0.38f));
        a2.R = cardColors2;
        return cardColors2;
    }

    public static CardElevation h() {
        float f2 = OutlinedCardTokens.f13456a;
        return new CardElevation(f2, f2, f2, f2, OutlinedCardTokens.e, OutlinedCardTokens.f13458c);
    }
}
