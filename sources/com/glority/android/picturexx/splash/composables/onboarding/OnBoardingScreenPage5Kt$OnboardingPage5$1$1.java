package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.runtime.MutableState;
import com.google.android.exoplayer2.SimpleExoPlayer;
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
/* compiled from: OnBoardingScreenPage5.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OnboardingPage5$1$1", f = "OnBoardingScreenPage5.kt", i = {}, l = {80, 82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage5Kt$OnboardingPage5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $animStart$delegate;
    final /* synthetic */ MutableState<HonorPage> $currentPage$delegate;
    final /* synthetic */ Function0<Unit> $onAnimationFinish;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingScreenPage5Kt$OnboardingPage5$1$1(Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<HonorPage> mutableState2, Continuation<? super OnBoardingScreenPage5Kt$OnboardingPage5$1$1> continuation) {
        super(2, continuation);
        this.$onAnimationFinish = function0;
        this.$animStart$delegate = mutableState;
        this.$currentPage$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnBoardingScreenPage5Kt$OnboardingPage5$1$1(this.$onAnimationFinish, this.$animStart$delegate, this.$currentPage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnBoardingScreenPage5Kt$OnboardingPage5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean OnboardingPage5$lambda$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OnboardingPage5$lambda$1 = OnBoardingScreenPage5Kt.OnboardingPage5$lambda$1(this.$animStart$delegate);
            if (!OnboardingPage5$lambda$1) {
                OnBoardingScreenPage5Kt.OnboardingPage5$lambda$2(this.$animStart$delegate, true);
                this.label = 1;
                if (DelayKt.delay(4000L, this) == coroutine_suspended) {
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
            this.$onAnimationFinish.invoke();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.$currentPage$delegate.setValue(HonorPage.Honor_hint);
        this.label = 2;
        if (DelayKt.delay(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.$onAnimationFinish.invoke();
        return Unit.INSTANCE;
    }
}
