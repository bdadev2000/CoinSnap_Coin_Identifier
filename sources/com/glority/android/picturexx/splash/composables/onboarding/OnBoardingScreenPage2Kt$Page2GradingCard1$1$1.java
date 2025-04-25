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
@DebugMetadata(c = "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$Page2GradingCard1$1$1", f = "OnBoardingScreenPage2.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage2Kt$Page2GradingCard1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $animationDelay;
    final /* synthetic */ MutableState<Boolean> $arkAnimStart$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingScreenPage2Kt$Page2GradingCard1$1$1(long j, MutableState<Boolean> mutableState, Continuation<? super OnBoardingScreenPage2Kt$Page2GradingCard1$1$1> continuation) {
        super(2, continuation);
        this.$animationDelay = j;
        this.$arkAnimStart$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnBoardingScreenPage2Kt$Page2GradingCard1$1$1(this.$animationDelay, this.$arkAnimStart$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnBoardingScreenPage2Kt$Page2GradingCard1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(this.$animationDelay, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        OnBoardingScreenPage2Kt.Page2GradingCard1$lambda$28(this.$arkAnimStart$delegate, true);
        return Unit.INSTANCE;
    }
}
