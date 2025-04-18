package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ProgressIndicatorDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10604a = ProgressIndicatorTokens.f13494c;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10605b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10606c = 1;
    public static final int d = 1;
    public static final float e = ProgressIndicatorTokens.f13493b;

    /* renamed from: f, reason: collision with root package name */
    public static final float f10607f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f10608g;

    static {
        float f2 = ProgressIndicatorTokens.f13492a;
        f10607f = f2;
        f10608g = f2;
    }

    public static long a(Composer composer) {
        float f2 = ProgressIndicatorTokens.f13492a;
        return ColorSchemeKt.f(ColorSchemeKeyTokens.f13278n, composer);
    }

    public static long b(Composer composer) {
        float f2 = ProgressIndicatorTokens.f13492a;
        return ColorSchemeKt.f(ColorSchemeKeyTokens.f13278n, composer);
    }

    public static long c(Composer composer) {
        float f2 = ProgressIndicatorTokens.f13492a;
        return ColorSchemeKt.f(ColorSchemeKeyTokens.f13282r, composer);
    }
}
