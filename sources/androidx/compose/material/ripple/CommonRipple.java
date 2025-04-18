package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;

@Stable
@d0.a
/* loaded from: classes.dex */
public final class CommonRipple extends Ripple {
    @Override // androidx.compose.material.ripple.Ripple
    public final RippleIndicationInstance c(InteractionSource interactionSource, boolean z2, float f2, MutableState mutableState, MutableState mutableState2, Composer composer, int i2) {
        composer.J(-1768051227);
        boolean z3 = ((((i2 & 14) ^ 6) > 4 && composer.I(interactionSource)) || (i2 & 6) == 4) | ((((458752 & i2) ^ 196608) > 131072 && composer.I(this)) || (i2 & 196608) == 131072);
        Object u2 = composer.u();
        if (z3 || u2 == Composer.Companion.f13690a) {
            u2 = new CommonRippleIndicationInstance(z2, f2, mutableState, mutableState2);
            composer.o(u2);
        }
        CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) u2;
        composer.D();
        return commonRippleIndicationInstance;
    }
}
