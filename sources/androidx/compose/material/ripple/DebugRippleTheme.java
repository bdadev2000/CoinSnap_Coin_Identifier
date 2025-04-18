package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@Immutable
/* loaded from: classes4.dex */
final class DebugRippleTheme implements RippleTheme {

    /* renamed from: a, reason: collision with root package name */
    public static final DebugRippleTheme f7399a = new Object();

    @Override // androidx.compose.material.ripple.RippleTheme
    public final long a(Composer composer) {
        composer.J(2042140174);
        long j2 = Color.f14957b;
        ColorKt.i(j2);
        composer.D();
        return j2;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public final RippleAlpha b(Composer composer) {
        composer.J(-1629816343);
        RippleAlpha rippleAlpha = ((double) ColorKt.i(Color.f14957b)) > 0.5d ? RippleThemeKt.f7466b : RippleThemeKt.f7467c;
        composer.D();
        return rippleAlpha;
    }
}
