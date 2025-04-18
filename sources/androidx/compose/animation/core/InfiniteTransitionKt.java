package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import q0.l;

/* loaded from: classes2.dex */
public final class InfiniteTransitionKt {
    public static final InfiniteTransition.TransitionAnimationState a(InfiniteTransition infiniteTransition, float f2, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer) {
        return b(infiniteTransition, Float.valueOf(0.0f), Float.valueOf(f2), VectorConvertersKt.f2340a, infiniteRepeatableSpec, "FloatAnimation", composer, 33208, 0);
    }

    public static final InfiniteTransition.TransitionAnimationState b(InfiniteTransition infiniteTransition, Number number, Number number2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = new InfiniteTransition.TransitionAnimationState(number, number2, twoWayConverter, infiniteRepeatableSpec);
            composer.o(u2);
        }
        InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) u2;
        boolean z2 = ((((i2 & 112) ^ 48) > 32 && composer.w(number)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.w(number2)) || (i2 & 384) == 256) | ((((57344 & i2) ^ 24576) > 16384 && composer.w(infiniteRepeatableSpec)) || (i2 & 24576) == 16384);
        Object u3 = composer.u();
        if (z2 || u3 == composer$Companion$Empty$1) {
            u3 = new InfiniteTransitionKt$animateValue$1$1(number, transitionAnimationState, number2, infiniteRepeatableSpec);
            composer.o(u3);
        }
        composer.L((q0.a) u3);
        boolean w = composer.w(infiniteTransition);
        Object u4 = composer.u();
        if (w || u4 == composer$Companion$Empty$1) {
            u4 = new InfiniteTransitionKt$animateValue$2$1(infiniteTransition, transitionAnimationState);
            composer.o(u4);
        }
        EffectsKt.c(transitionAnimationState, (l) u4, composer);
        return transitionAnimationState;
    }

    public static final InfiniteTransition c(Composer composer) {
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = new InfiniteTransition();
            composer.o(u2);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) u2;
        infiniteTransition.a(composer, 0);
        return infiniteTransition;
    }
}
