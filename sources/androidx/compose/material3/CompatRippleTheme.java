package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes.dex */
public final class CompatRippleTheme implements RippleTheme {

    /* renamed from: a, reason: collision with root package name */
    public static final CompatRippleTheme f8556a = new Object();

    @Override // androidx.compose.material.ripple.RippleTheme
    public final long a(Composer composer) {
        composer.J(-1844533201);
        long j2 = ((Color) composer.K(ContentColorKt.f8654a)).f14964a;
        composer.D();
        return j2;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public final RippleAlpha b(Composer composer) {
        composer.J(-290975286);
        RippleAlpha rippleAlpha = RippleDefaults.f10782a;
        composer.D();
        return rippleAlpha;
    }
}
