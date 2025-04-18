package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@ExperimentalMaterial3Api
/* loaded from: classes4.dex */
public final class TopAppBarDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f12606a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f12607b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f12608c;
    public static final float d;
    public static final float e;

    static {
        float f2 = TopAppBarSmallTokens.f13591a;
        f12606a = f2;
        f12607b = f2;
        f12608c = TopAppBarMediumTokens.f13585a;
        d = f2;
        e = TopAppBarLargeTokens.f13582a;
    }

    public static TopAppBarColors a(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        TopAppBarColors topAppBarColors = a2.f8507a0;
        if (topAppBarColors != null) {
            return topAppBarColors;
        }
        ColorSchemeKeyTokens colorSchemeKeyTokens = TopAppBarSmallCenteredTokens.f13588a;
        TopAppBarColors topAppBarColors2 = new TopAppBarColors(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13283s), ColorSchemeKt.e(a2, TopAppBarSmallCenteredTokens.f13590c), ColorSchemeKt.e(a2, TopAppBarSmallCenteredTokens.f13589b), ColorSchemeKt.e(a2, TopAppBarSmallCenteredTokens.f13588a), ColorSchemeKt.e(a2, TopAppBarSmallCenteredTokens.d));
        a2.f8507a0 = topAppBarColors2;
        return topAppBarColors2;
    }

    public static WindowInsets b(Composer composer) {
        return WindowInsetsKt.d(SystemBarsDefaultInsets_androidKt.a(composer), WindowInsetsSides.e | 16);
    }

    public static TopAppBarColors c(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        TopAppBarColors topAppBarColors = a2.f8511c0;
        if (topAppBarColors != null) {
            return topAppBarColors;
        }
        float f2 = TopAppBarLargeTokens.f13582a;
        TopAppBarColors topAppBarColors2 = new TopAppBarColors(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13283s), ColorSchemeKt.e(a2, TopAppBarSmallTokens.e), ColorSchemeKt.e(a2, TopAppBarLargeTokens.d), ColorSchemeKt.e(a2, TopAppBarLargeTokens.f13583b), ColorSchemeKt.e(a2, TopAppBarLargeTokens.e));
        a2.f8511c0 = topAppBarColors2;
        return topAppBarColors2;
    }

    public static TopAppBarColors d(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        TopAppBarColors topAppBarColors = a2.f8509b0;
        if (topAppBarColors != null) {
            return topAppBarColors;
        }
        float f2 = TopAppBarMediumTokens.f13585a;
        TopAppBarColors topAppBarColors2 = new TopAppBarColors(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13283s), ColorSchemeKt.e(a2, TopAppBarSmallTokens.e), ColorSchemeKt.e(a2, TopAppBarMediumTokens.d), ColorSchemeKt.e(a2, TopAppBarMediumTokens.f13586b), ColorSchemeKt.e(a2, TopAppBarMediumTokens.e));
        a2.f8509b0 = topAppBarColors2;
        return topAppBarColors2;
    }

    public static TopAppBarColors e(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        TopAppBarColors topAppBarColors = a2.Z;
        if (topAppBarColors != null) {
            return topAppBarColors;
        }
        float f2 = TopAppBarSmallTokens.f13591a;
        TopAppBarColors topAppBarColors2 = new TopAppBarColors(ColorSchemeKt.e(a2, ColorSchemeKeyTokens.f13283s), ColorSchemeKt.e(a2, TopAppBarSmallTokens.e), ColorSchemeKt.e(a2, TopAppBarSmallTokens.d), ColorSchemeKt.e(a2, TopAppBarSmallTokens.f13592b), ColorSchemeKt.e(a2, TopAppBarSmallTokens.f13594f));
        a2.Z = topAppBarColors2;
        return topAppBarColors2;
    }
}
