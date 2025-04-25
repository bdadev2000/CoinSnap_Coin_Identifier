package com.glority.billing.play;

import com.android.billingclient.api.BillingResult;
import com.glority.billing.play.BillingManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingUpdatesListenerWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.play.BillingUpdatesListenerWrapper$onBillingSetupFinished$1", f = "BillingUpdatesListenerWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BillingUpdatesListenerWrapper$onBillingSetupFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BillingResult $billingResult;
    final /* synthetic */ boolean $success;
    int label;
    final /* synthetic */ BillingUpdatesListenerWrapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingUpdatesListenerWrapper$onBillingSetupFinished$1(BillingUpdatesListenerWrapper billingUpdatesListenerWrapper, boolean z, BillingResult billingResult, Continuation<? super BillingUpdatesListenerWrapper$onBillingSetupFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = billingUpdatesListenerWrapper;
        this.$success = z;
        this.$billingResult = billingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingUpdatesListenerWrapper$onBillingSetupFinished$1(this.this$0, this.$success, this.$billingResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingUpdatesListenerWrapper$onBillingSetupFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingManager.BillingUpdatesListener billingUpdatesListener;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            billingUpdatesListener = this.this$0.billingUpdatesListener;
            billingUpdatesListener.onBillingSetupFinished(this.$success, this.$billingResult);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
