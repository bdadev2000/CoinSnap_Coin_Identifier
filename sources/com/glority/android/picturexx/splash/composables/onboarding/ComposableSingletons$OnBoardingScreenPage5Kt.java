package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnBoardingScreenPage5.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$OnBoardingScreenPage5Kt {
    public static final ComposableSingletons$OnBoardingScreenPage5Kt INSTANCE = new ComposableSingletons$OnBoardingScreenPage5Kt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f149lambda1 = ComposableLambdaKt.composableLambdaInstance(1317584800, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage5Kt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1317584800, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage5Kt.lambda-1.<anonymous> (OnBoardingScreenPage5.kt:130)");
            }
            OnBoardingScreenPage5Kt.access$HonorBanner1(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f150lambda2 = ComposableLambdaKt.composableLambdaInstance(-2098215387, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage5Kt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098215387, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage5Kt.lambda-2.<anonymous> (OnBoardingScreenPage5.kt:342)");
            }
            OnBoardingScreenPage5Kt.OnboardingPage5(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage5Kt$lambda-2$1.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$splash_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7848getLambda1$splash_release() {
        return f149lambda1;
    }

    /* renamed from: getLambda-2$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7849getLambda2$splash_release() {
        return f150lambda2;
    }
}
