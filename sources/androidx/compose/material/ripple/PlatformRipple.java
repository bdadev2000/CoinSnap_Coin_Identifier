package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

@Stable
@d0.a
/* loaded from: classes4.dex */
public final class PlatformRipple extends Ripple {
    @Override // androidx.compose.material.ripple.Ripple
    public final RippleIndicationInstance c(InteractionSource interactionSource, boolean z2, float f2, MutableState mutableState, MutableState mutableState2, Composer composer, int i2) {
        composer.J(331259447);
        ViewGroup b2 = Ripple_androidKt.b((View) composer.K(AndroidCompositionLocals_androidKt.f16327f));
        boolean I = ((((i2 & 14) ^ 6) > 4 && composer.I(interactionSource)) || (i2 & 6) == 4) | ((((458752 & i2) ^ 196608) > 131072 && composer.I(this)) || (i2 & 196608) == 131072) | composer.I(b2);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new AndroidRippleIndicationInstance(z2, f2, mutableState, mutableState2, b2);
            composer.o(u2);
        }
        AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) u2;
        composer.D();
        return androidRippleIndicationInstance;
    }
}
