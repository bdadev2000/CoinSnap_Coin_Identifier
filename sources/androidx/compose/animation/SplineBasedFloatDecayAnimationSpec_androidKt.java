package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
public final class SplineBasedFloatDecayAnimationSpec_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1972a = ViewConfiguration.getScrollFriction();

    public static final DecayAnimationSpec a(Composer composer) {
        Density density = (Density) composer.K(CompositionLocalsKt.f16434f);
        boolean b2 = composer.b(density.getDensity());
        Object u2 = composer.u();
        if (b2 || u2 == Composer.Companion.f13690a) {
            u2 = DecayAnimationSpecKt.c(new SplineBasedFloatDecayAnimationSpec(density));
            composer.o(u2);
        }
        return (DecayAnimationSpec) u2;
    }
}
