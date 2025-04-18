package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SuggestionChipDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11614a = SuggestionChipTokens.f13533a;

    public static ChipColors a(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        ChipColors chipColors = a2.V;
        if (chipColors != null) {
            return chipColors;
        }
        long e = ColorSchemeKt.e(a2, SuggestionChipTokens.f13535c);
        long e2 = ColorSchemeKt.e(a2, SuggestionChipTokens.f13545o);
        long e3 = ColorSchemeKt.e(a2, SuggestionChipTokens.f13549s);
        long j2 = Color.f14962i;
        ChipColors chipColors2 = new ChipColors(e, e2, e3, j2, Color.b(ColorSchemeKt.e(a2, SuggestionChipTokens.e), AssistChipTokens.f13201g), Color.b(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13273i), 0.38f), Color.b(ColorSchemeKt.e(a2, AssistChipTokens.f13212r), AssistChipTokens.f13213s), j2);
        a2.V = chipColors2;
        return chipColors2;
    }

    public static ChipElevation b() {
        return new ChipElevation(SuggestionChipTokens.d, SuggestionChipTokens.f13539i, SuggestionChipTokens.f13537g, SuggestionChipTokens.f13538h, SuggestionChipTokens.f13534b, SuggestionChipTokens.f13536f);
    }

    public static ChipColors c(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        float f2 = ChipKt.f8252a;
        ChipColors chipColors = a2.U;
        if (chipColors != null) {
            return chipColors;
        }
        long j2 = Color.f14961h;
        long e = ColorSchemeKt.e(a2, SuggestionChipTokens.f13545o);
        long e2 = ColorSchemeKt.e(a2, SuggestionChipTokens.f13549s);
        long j3 = Color.f14962i;
        ChipColors chipColors2 = new ChipColors(j2, e, e2, j3, j2, Color.b(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13273i), 0.38f), Color.b(ColorSchemeKt.e(a2, SuggestionChipTokens.f13547q), SuggestionChipTokens.f13548r), j3);
        a2.U = chipColors2;
        return chipColors2;
    }

    public static ChipElevation d() {
        float f2 = SuggestionChipTokens.f13540j;
        return new ChipElevation(f2, f2, f2, f2, SuggestionChipTokens.f13534b, f2);
    }
}
