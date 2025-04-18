package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes4.dex */
public final class LazyLayoutBeyondBoundsModifierLocalKt {
    public static final Modifier a(Modifier modifier, LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z2, LayoutDirection layoutDirection, Orientation orientation, boolean z3, Composer composer, int i2) {
        if (!z3) {
            composer.J(-1890658823);
            composer.D();
            return modifier;
        }
        composer.J(-1890632411);
        boolean z4 = ((((i2 & 112) ^ 48) > 32 && composer.I(lazyLayoutBeyondBoundsState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.I(lazyLayoutBeyondBoundsInfo)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.a(z2)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.I(layoutDirection)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ 196608) > 131072 && composer.I(orientation)) || (i2 & 196608) == 131072);
        Object u2 = composer.u();
        if (z4 || u2 == Composer.Companion.f13690a) {
            u2 = new LazyLayoutBeyondBoundsModifierLocal(lazyLayoutBeyondBoundsState, lazyLayoutBeyondBoundsInfo, z2, layoutDirection, orientation);
            composer.o(u2);
        }
        Modifier T0 = modifier.T0((LazyLayoutBeyondBoundsModifierLocal) u2);
        composer.D();
        return T0;
    }
}
