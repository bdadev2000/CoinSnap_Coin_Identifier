package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnBoardingScreenPage2.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1", f = "OnBoardingScreenPage2.kt", i = {}, l = {168, 170}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $card2ZoomAnim$delegate;
    final /* synthetic */ MutableState<Boolean> $coinCardAnim$delegate;
    final /* synthetic */ MutableState<Boolean> $referencePriceCardAnim$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1> continuation) {
        super(2, continuation);
        this.$coinCardAnim$delegate = mutableState;
        this.$referencePriceCardAnim$delegate = mutableState2;
        this.$card2ZoomAnim$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1(this.$coinCardAnim$delegate, this.$referencePriceCardAnim$delegate, this.$card2ZoomAnim$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean OnboardingPage2$lambda$4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OnboardingPage2$lambda$4 = OnBoardingScreenPage2Kt.OnboardingPage2$lambda$4(this.$coinCardAnim$delegate);
            if (OnboardingPage2$lambda$4) {
                this.label = 1;
                if (DelayKt.delay(1800L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OnBoardingScreenPage2Kt.OnboardingPage2$lambda$18$lambda$15(this.$card2ZoomAnim$delegate, true);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        OnBoardingScreenPage2Kt.OnboardingPage2$lambda$8(this.$referencePriceCardAnim$delegate, true);
        this.label = 2;
        if (DelayKt.delay(1000L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        OnBoardingScreenPage2Kt.OnboardingPage2$lambda$18$lambda$15(this.$card2ZoomAnim$delegate, true);
        return Unit.INSTANCE;
    }
}
