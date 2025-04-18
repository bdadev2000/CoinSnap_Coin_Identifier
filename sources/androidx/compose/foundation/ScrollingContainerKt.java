package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public final class ScrollingContainerKt {
    public static final Modifier a(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, Composer composer, int i2) {
        OverscrollEffect overscrollEffect;
        BringIntoViewSpec bringIntoViewSpec2 = (i2 & 64) != 0 ? null : bringIntoViewSpec;
        Context context = (Context) composer.K(AndroidCompositionLocals_androidKt.f16325b);
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.K(OverscrollConfiguration_androidKt.f2838a);
        if (overscrollConfiguration != null) {
            composer.J(1586021609);
            boolean I = composer.I(context) | composer.I(overscrollConfiguration);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.o(u2);
            }
            composer.D();
            overscrollEffect = (AndroidEdgeEffectOverscrollEffect) u2;
        } else {
            composer.J(1586120933);
            composer.D();
            overscrollEffect = NoOpOverscrollEffect.f2835a;
        }
        Orientation orientation2 = Orientation.f3394a;
        Modifier T0 = modifier.T0(orientation == orientation2 ? ClipScrollableContainerKt.f2659c : ClipScrollableContainerKt.f2658b).T0(overscrollEffect.c());
        boolean z4 = !z3;
        if (((LayoutDirection) composer.K(CompositionLocalsKt.f16440l)) == LayoutDirection.f17495b && orientation != orientation2) {
            z4 = z3;
        }
        return ScrollableKt.b(T0, scrollableState, orientation, overscrollEffect, z2, z4, flingBehavior, mutableInteractionSource, bringIntoViewSpec2);
    }
}
