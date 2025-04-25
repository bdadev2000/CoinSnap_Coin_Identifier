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
/* compiled from: OnBoardingScreenPage3.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$Page3CoinCard$2$1", f = "OnBoardingScreenPage3.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage3Kt$Page3CoinCard$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $coinCardVisibilityAnim$delegate;
    final /* synthetic */ MutableState<Boolean> $goldCoinVisibilityAnim$delegate;
    final /* synthetic */ Function0<Unit> $onAnimationFinish;
    final /* synthetic */ MutableState<Boolean> $silverCoinVisibilityAnim$delegate;
    final /* synthetic */ MutableState<Boolean> $transitionAnimationState$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingScreenPage3Kt$Page3CoinCard$2$1(Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super OnBoardingScreenPage3Kt$Page3CoinCard$2$1> continuation) {
        super(2, continuation);
        this.$onAnimationFinish = function0;
        this.$coinCardVisibilityAnim$delegate = mutableState;
        this.$goldCoinVisibilityAnim$delegate = mutableState2;
        this.$silverCoinVisibilityAnim$delegate = mutableState3;
        this.$transitionAnimationState$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnBoardingScreenPage3Kt$Page3CoinCard$2$1(this.$onAnimationFinish, this.$coinCardVisibilityAnim$delegate, this.$goldCoinVisibilityAnim$delegate, this.$silverCoinVisibilityAnim$delegate, this.$transitionAnimationState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnBoardingScreenPage3Kt$Page3CoinCard$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OnBoardingScreenPage3Kt.Page3CoinCard$lambda$9(this.$coinCardVisibilityAnim$delegate, true);
            OnBoardingScreenPage3Kt.Page3CoinCard$lambda$12(this.$goldCoinVisibilityAnim$delegate, true);
            OnBoardingScreenPage3Kt.Page3CoinCard$lambda$15(this.$silverCoinVisibilityAnim$delegate, true);
            OnBoardingScreenPage3Kt.Page3CoinCard$lambda$18(this.$transitionAnimationState$delegate, true);
            this.label = 1;
            if (DelayKt.delay(2600L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$onAnimationFinish.invoke();
        return Unit.INSTANCE;
    }
}
