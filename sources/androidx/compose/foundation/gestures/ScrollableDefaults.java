package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ScrollableDefaults {
    public static DefaultFlingBehavior a(Composer composer) {
        DecayAnimationSpec a2 = SplineBasedFloatDecayAnimationSpec_androidKt.a(composer);
        boolean I = composer.I(a2);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new DefaultFlingBehavior(a2);
            composer.o(u2);
        }
        return (DefaultFlingBehavior) u2;
    }
}
