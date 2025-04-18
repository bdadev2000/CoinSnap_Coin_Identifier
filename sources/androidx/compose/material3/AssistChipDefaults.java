package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred
/* loaded from: classes.dex */
public final class AssistChipDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7882a = AssistChipTokens.f13197a;

    public static ChipColors a(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        ChipColors chipColors = a2.S;
        if (chipColors != null) {
            return chipColors;
        }
        long j2 = Color.f14961h;
        long e = ColorSchemeKt.e(a2, AssistChipTokens.f13210p);
        ColorSchemeKeyTokens colorSchemeKeyTokens = AssistChipTokens.f13214t;
        long e2 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        long e3 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        long b2 = Color.b(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13273i), 0.38f);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = AssistChipTokens.f13212r;
        long e4 = ColorSchemeKt.e(a2, colorSchemeKeyTokens2);
        float f2 = AssistChipTokens.f13213s;
        ChipColors chipColors2 = new ChipColors(j2, e, e2, e3, j2, b2, Color.b(e4, f2), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), f2));
        a2.S = chipColors2;
        return chipColors2;
    }

    public static ChipElevation b() {
        float f2 = AssistChipTokens.f13205k;
        return new ChipElevation(f2, f2, f2, f2, AssistChipTokens.f13198b, f2);
    }

    public static ChipColors c(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        ChipColors chipColors = a2.T;
        if (chipColors != null) {
            return chipColors;
        }
        long e = ColorSchemeKt.e(a2, AssistChipTokens.f13199c);
        long e2 = ColorSchemeKt.e(a2, AssistChipTokens.f13210p);
        ColorSchemeKeyTokens colorSchemeKeyTokens = AssistChipTokens.f13214t;
        long e3 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        long e4 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        long b2 = Color.b(ColorSchemeKt.e(a2, AssistChipTokens.e), AssistChipTokens.f13201g);
        long b3 = Color.b(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13273i), 0.38f);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = AssistChipTokens.f13212r;
        long e5 = ColorSchemeKt.e(a2, colorSchemeKeyTokens2);
        float f2 = AssistChipTokens.f13213s;
        ChipColors chipColors2 = new ChipColors(e, e2, e3, e4, b2, b3, Color.b(e5, f2), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens2), f2));
        a2.T = chipColors2;
        return chipColors2;
    }

    public static ChipElevation d() {
        return new ChipElevation(AssistChipTokens.d, AssistChipTokens.f13204j, AssistChipTokens.f13202h, AssistChipTokens.f13203i, AssistChipTokens.f13198b, AssistChipTokens.f13200f);
    }
}
