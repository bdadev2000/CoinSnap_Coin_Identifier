package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.glority.android.picturexx.splash.R;
import com.glority.base.composables.ComposableExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnBoardingScreenPage2.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$OnBoardingScreenPage2Kt {
    public static final ComposableSingletons$OnBoardingScreenPage2Kt INSTANCE = new ComposableSingletons$OnBoardingScreenPage2Kt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f122lambda1 = ComposableLambdaKt.composableLambdaInstance(-786768403, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage2Kt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-786768403, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage2Kt.lambda-1.<anonymous> (OnBoardingScreenPage2.kt:129)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_title, composer, 0), wrapContentHeight$default, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(44), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(50), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200112, 6, 129488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f123lambda2 = ComposableLambdaKt.composableLambdaInstance(1514276452, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage2Kt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1514276452, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage2Kt.lambda-2.<anonymous> (OnBoardingScreenPage2.kt:155)");
            }
            OnBoardingScreenPage2Kt.access$Page2GradingCard1(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1000L, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f124lambda3 = ComposableLambdaKt.composableLambdaInstance(861443307, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage2Kt$lambda-3$1
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
                ComposerKt.traceEventStart(861443307, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage2Kt.lambda-3.<anonymous> (OnBoardingScreenPage2.kt:543)");
            }
            OnBoardingScreenPage2Kt.OnboardingPage2(Modifier.INSTANCE, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage2Kt$lambda-3$1.1
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
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7821getLambda1$splash_release() {
        return f122lambda1;
    }

    /* renamed from: getLambda-2$splash_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7822getLambda2$splash_release() {
        return f123lambda2;
    }

    /* renamed from: getLambda-3$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7823getLambda3$splash_release() {
        return f124lambda3;
    }
}
