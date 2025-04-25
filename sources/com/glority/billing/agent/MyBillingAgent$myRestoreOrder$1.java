package com.glority.billing.agent;

import com.android.billingclient.api.Purchase;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.PaymentType;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.billing.repository.BillingRepository;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.network.model.Resource;
import com.purchase.generatedAPI.kotlinAPI.purchase.RestoreMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$myRestoreOrder$1", f = "MyBillingAgent.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class MyBillingAgent$myRestoreOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Purchase $purchase;
    Object L$0;
    int label;
    final /* synthetic */ MyBillingAgent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBillingAgent$myRestoreOrder$1(Purchase purchase, MyBillingAgent myBillingAgent, Continuation<? super MyBillingAgent$myRestoreOrder$1> continuation) {
        super(2, continuation);
        this.$purchase = purchase;
        this.this$0 = myBillingAgent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBillingAgent$myRestoreOrder$1(this.$purchase, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBillingAgent$myRestoreOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RestorePolicy restorePolicy;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BillingRepository billingRepository = BillingRepository.INSTANCE;
                PaymentType paymentType = PaymentType.GOOGLE_PLAY;
                DeviceType deviceType = DeviceType.ANDROID;
                String originalJson = this.$purchase.getOriginalJson();
                Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
                restorePolicy = this.this$0.restorePolicy;
                Resource<RestoreMessage> restore = billingRepository.restore(paymentType, deviceType, originalJson, restorePolicy);
                Purchase purchase = this.$purchase;
                MyBillingAgent myBillingAgent = this.this$0;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                MyBillingAgent$myRestoreOrder$1$1$1 myBillingAgent$myRestoreOrder$1$1$1 = new MyBillingAgent$myRestoreOrder$1$1$1(restore, purchase, myBillingAgent, null);
                this.L$0 = restore;
                this.label = 1;
                if (BuildersKt.withContext(main, myBillingAgent$myRestoreOrder$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable th) {
            this.this$0.restoreErrorDeal(th, this.$purchase);
        }
        return Unit.INSTANCE;
    }
}
