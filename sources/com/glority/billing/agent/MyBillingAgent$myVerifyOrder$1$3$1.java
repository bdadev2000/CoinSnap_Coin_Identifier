package com.glority.billing.agent;

import com.android.billingclient.api.Purchase;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.adjust.GetAdjustEventNameBySkuRequest;
import com.glority.android.core.route.adjust.SendPlayStoreSubscriptionRequest;
import com.glority.android.core.route.adjust.SendTrackEventRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.DeviceInfo;
import com.glority.billing.PurchaseLogEvent;
import com.glority.billing.agent.MyBillingAgent;
import com.glority.billing.utils.PaddingData;
import com.glority.billing.utils.PaymentUtils;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.purchase.generatedAPI.kotlinAPI.model.Price;
import com.purchase.generatedAPI.kotlinAPI.purchase.VerifyMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$myVerifyOrder$1$3$1", f = "MyBillingAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class MyBillingAgent$myVerifyOrder$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentSku;
    final /* synthetic */ Ref.ObjectRef<Price> $price;
    final /* synthetic */ Ref.ObjectRef<Long> $priceAmountMicros;
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ Resource<VerifyMessage> $resource;
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
    public MyBillingAgent$myVerifyOrder$1$3$1(Resource<VerifyMessage> resource, Purchase purchase, String str, Ref.ObjectRef<Long> objectRef, Ref.ObjectRef<Price> objectRef2, MyBillingAgent myBillingAgent, Continuation<? super MyBillingAgent$myVerifyOrder$1$3$1> continuation) {
        super(2, continuation);
        this.$resource = resource;
        this.$purchase = purchase;
        this.$currentSku = str;
        this.$priceAmountMicros = objectRef;
        this.$price = objectRef2;
        this.this$0 = myBillingAgent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBillingAgent$myVerifyOrder$1$3$1(this.$resource, this.$purchase, this.$currentSku, this.$priceAmountMicros, this.$price, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBillingAgent$myVerifyOrder$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean isInAppBilling;
        MyBillingAgent.MyBillingAgentListener myBillingAgentListener;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = WhenMappings.$EnumSwitchMapping$0[this.$resource.getStatus().ordinal()];
        if (i == 1) {
            Pair pair = TuplesKt.to("name", "succeed");
            List<String> products = this.$purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_BUY_VERIFY, LogEventArgumentsKt.logEventBundleOf(pair, TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)))).post();
            new SendTrackEventRequest(MyBillingAgent.ADJUST_PURCHASE_EVENT, null, null, null, 14, null).post();
            if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ADJUST_NEED_SEND_SKU_PAYED"), "true")) {
                String result = new GetAdjustEventNameBySkuRequest(this.$currentSku).toResult();
                if (result == null) {
                    result = this.$currentSku;
                }
                new SendTrackEventRequest(result, null, null, null, 14, null).post();
            }
            if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ADJUST_OFFLINE_TRACKING"), "true")) {
                Long l = this.$priceAmountMicros.element;
                long longValue = l != null ? l.longValue() : 0L;
                String currency = this.$price.element.getCurrency();
                String str = this.$currentSku;
                String orderId = this.$purchase.getOrderId();
                if (orderId == null) {
                    orderId = "";
                }
                String signature = this.$purchase.getSignature();
                Intrinsics.checkNotNullExpressionValue(signature, "getSignature(...)");
                String purchaseToken = this.$purchase.getPurchaseToken();
                Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
                new SendPlayStoreSubscriptionRequest(longValue, currency, str, orderId, signature, purchaseToken, this.$purchase.getPurchaseTime()).post();
                new LogEventRequest("adjust_offline_tracking", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", DeviceInfo.INSTANCE.getId()))).post();
            }
            isInAppBilling = this.this$0.isInAppBilling();
            if (isInAppBilling) {
                MyBillingAgent myBillingAgent = this.this$0;
                String purchaseToken2 = this.$purchase.getPurchaseToken();
                Intrinsics.checkNotNullExpressionValue(purchaseToken2, "getPurchaseToken(...)");
                myBillingAgent.consumeAsync(purchaseToken2, null);
            }
            myBillingAgentListener = this.this$0.myListener;
            if (myBillingAgentListener != null) {
                Purchase purchase = this.$purchase;
                Status status = this.$resource.getStatus();
                VerifyMessage data = this.$resource.getData();
                myBillingAgentListener.myPurchaseSuccess(purchase, false, status, data != null ? data.getAppData() : null);
            }
            PaymentUtils.INSTANCE.purchaseRemove(new PaddingData(this.$purchase, false, 2, null));
        } else if (i == 2) {
            this.this$0.verifyOrderErrorDeal(this.$resource, this.$purchase);
        }
        return Unit.INSTANCE;
    }
}
