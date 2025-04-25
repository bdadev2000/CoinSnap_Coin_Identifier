package com.glority.android.picturexx.splash.fragment.splash;

import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.component.generatedAPI.kotlinAPI.user.InitialiseMessage;
import com.glority.network.model.Resource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.splash.fragment.splash.SplashFragment$addSubscriptions$1", f = "SplashFragment.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SplashFragment$addSubscriptions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<Resource<InitialiseMessage>> $initialiseMessageFlow;
    final /* synthetic */ long $start;
    int label;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$addSubscriptions$1(Flow<Resource<InitialiseMessage>> flow, SplashFragment splashFragment, long j, Continuation<? super SplashFragment$addSubscriptions$1> continuation) {
        super(2, continuation);
        this.$initialiseMessageFlow = flow;
        this.this$0 = splashFragment;
        this.$start = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashFragment$addSubscriptions$1(this.$initialiseMessageFlow, this.this$0, this.$start, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashFragment$addSubscriptions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Resource<InitialiseMessage>> flow = this.$initialiseMessageFlow;
            final SplashFragment splashFragment = this.this$0;
            final long j = this.$start;
            this.label = 1;
            if (flow.collect(new FlowCollector() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment$addSubscriptions$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Resource<InitialiseMessage>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Resource<InitialiseMessage> resource, Continuation<? super Unit> continuation) {
                    ResponseUtil responseUtil = ResponseUtil.INSTANCE;
                    final SplashFragment splashFragment2 = SplashFragment.this;
                    final long j2 = j;
                    responseUtil.handleResult(resource, new DefaultResponseHandler<InitialiseMessage>() { // from class: com.glority.android.picturexx.splash.fragment.splash.SplashFragment.addSubscriptions.1.1.1
                        @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
                        public void success(InitialiseMessage data) {
                            super.success((C01021) data);
                            SplashFragment.this.doAfterInitialiseSuccess(data, j2);
                        }

                        @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
                        public void error(Throwable e) {
                            super.error(e);
                            SplashFragment.this.doAfterInitialiseFailed(e, j2);
                        }
                    });
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
