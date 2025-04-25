package com.glority.android.picturexx.splash.fragment.splash;

import com.glority.android.picturexx.splash.vm.main.SplashViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doAfterAgreement$2", f = "SplashFragment.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SplashFragment$doAfterAgreement$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$doAfterAgreement$2(SplashFragment splashFragment, Continuation<? super SplashFragment$doAfterAgreement$2> continuation) {
        super(2, continuation);
        this.this$0 = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashFragment$doAfterAgreement$2 splashFragment$doAfterAgreement$2 = new SplashFragment$doAfterAgreement$2(this.this$0, continuation);
        splashFragment$doAfterAgreement$2.L$0 = obj;
        return splashFragment$doAfterAgreement$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashFragment$doAfterAgreement$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        SplashViewModel vm;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new SplashFragment$doAfterAgreement$2$queryHasActiveSubscribedRequestDefer$1(this.this$0, null), 3, null);
            this.label = 1;
            obj = async$default.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        vm = this.this$0.getVm();
        vm.setHasActiveSubscription(booleanValue);
        return Unit.INSTANCE;
    }
}
