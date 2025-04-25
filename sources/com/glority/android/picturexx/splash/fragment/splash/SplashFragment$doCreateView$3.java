package com.glority.android.picturexx.splash.fragment.splash;

import androidx.lifecycle.FlowLiveDataConversions;
import com.glority.android.livebus.LiveBus;
import com.glority.base.livebus.LiveBusKeyRefs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SplashFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doCreateView$3", f = "SplashFragment.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class SplashFragment$doCreateView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$doCreateView$3(SplashFragment splashFragment, Continuation<? super SplashFragment$doCreateView$3> continuation) {
        super(2, continuation);
        this.this$0 = splashFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashFragment$doCreateView$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashFragment$doCreateView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(FlowLiveDataConversions.asFlow(LiveBus.INSTANCE.get(LiveBusKeyRefs.INSTANCE.getAGREE_AGREEMENT_KEY_REF()))));
            final SplashFragment splashFragment = this.this$0;
            this.label = 1;
            if (distinctUntilChanged.collect(new FlowCollector() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$doCreateView$3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                    Object doAfterAgreement;
                    if (Intrinsics.areEqual(obj2, Boxing.boxBoolean(true))) {
                        doAfterAgreement = SplashFragment.this.doAfterAgreement(continuation);
                        return doAfterAgreement == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doAfterAgreement : Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
