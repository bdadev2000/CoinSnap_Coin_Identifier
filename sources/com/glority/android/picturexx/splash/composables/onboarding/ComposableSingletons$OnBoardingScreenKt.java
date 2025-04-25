package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: OnBoardingScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$OnBoardingScreenKt {
    public static final ComposableSingletons$OnBoardingScreenKt INSTANCE = new ComposableSingletons$OnBoardingScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f116lambda1 = ComposableLambdaKt.composableLambdaInstance(-1217743337, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1217743337, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenKt.lambda-1.<anonymous> (OnBoardingScreen.kt:218)");
            }
            OnBoardingScreenKt.OnBoardingScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenKt$lambda-1$1.1
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
    public final Function2<Composer, Integer, Unit> m7815getLambda1$splash_release() {
        return f116lambda1;
    }
}
