package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnBoardingScreenPage1.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1", f = "OnBoardingScreenPage1.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $animDisplayTime;
    final /* synthetic */ int $animDuration;
    final /* synthetic */ MutableState<Boolean> $coinCardAnim$delegate;
    final /* synthetic */ Function0<Unit> $onAnimationFinish;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1(int i, int i2, Function0<Unit> function0, MutableState<Boolean> mutableState, Continuation<? super OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1> continuation) {
        super(2, continuation);
        this.$animDuration = i;
        this.$animDisplayTime = i2;
        this.$onAnimationFinish = function0;
        this.$coinCardAnim$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1(this.$animDuration, this.$animDisplayTime, this.$onAnimationFinish, this.$coinCardAnim$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean OnboardingPage1$lambda$4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OnboardingPage1$lambda$4 = OnBoardingScreenPage1Kt.OnboardingPage1$lambda$4(this.$coinCardAnim$delegate);
            if (OnboardingPage1$lambda$4) {
                this.label = 1;
                if (DelayKt.delay((this.$animDuration * 3) + this.$animDisplayTime, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onAnimationFinish.invoke();
        return Unit.INSTANCE;
    }
}
