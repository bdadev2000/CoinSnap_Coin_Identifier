package com.glority.billing.agent;

import com.android.billingclient.api.Purchase;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.billing.PurchaseLogEvent;
import com.glority.billing.agent.MyBillingAgent;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.billing.utils.PaddingData;
import com.glority.billing.utils.PaymentUtils;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.purchase.generatedAPI.kotlinAPI.purchase.RestoreMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$myRestoreOrder$1$1$1", f = "MyBillingAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class MyBillingAgent$myRestoreOrder$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ Resource<RestoreMessage> $resource;
    int label;
    final /* synthetic */ MyBillingAgent this$0;

    /* compiled from: MyBillingAgent.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBillingAgent$myRestoreOrder$1$1$1(Resource<RestoreMessage> resource, Purchase purchase, MyBillingAgent myBillingAgent, Continuation<? super MyBillingAgent$myRestoreOrder$1$1$1> continuation) {
        super(2, continuation);
        this.$resource = resource;
        this.$purchase = purchase;
        this.this$0 = myBillingAgent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBillingAgent$myRestoreOrder$1$1$1(this.$resource, this.$purchase, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBillingAgent$myRestoreOrder$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MyBillingAgent.MyBillingAgentListener myBillingAgentListener;
        RestorePolicy restorePolicy;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = WhenMappings.$EnumSwitchMapping$0[this.$resource.getStatus().ordinal()];
        if (i == 1) {
            List<String> products = this.$purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_RESTORE_VERIFY, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("name", "succeed"))).post();
            myBillingAgentListener = this.this$0.myListener;
            if (myBillingAgentListener != null) {
                Purchase purchase = this.$purchase;
                Status status = this.$resource.getStatus();
                RestoreMessage data = this.$resource.getData();
                String appData = data != null ? data.getAppData() : null;
                restorePolicy = this.this$0.restorePolicy;
                myBillingAgentListener.myRestoreOrderSuccess(purchase, true, status, appData, restorePolicy);
            }
            PaymentUtils.INSTANCE.purchaseRemove(new PaddingData(this.$purchase, false, 2, null));
        } else if (i == 2) {
            this.this$0.restoreErrorDeal(this.$resource.getException(), this.$purchase);
        }
        return Unit.INSTANCE;
    }
}
