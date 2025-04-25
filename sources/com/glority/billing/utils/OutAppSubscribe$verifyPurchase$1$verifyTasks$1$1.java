package com.glority.billing.utils;

import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.glority.billing.agent.MyBillingAgent;
import com.glority.billing.play.BillingSync;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.PaymentType;
import com.glority.billing.repository.BillingRepository;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.network.model.Resource;
import com.purchase.generatedAPI.kotlinAPI.model.Price;
import com.purchase.generatedAPI.kotlinAPI.purchase.VerifyMessage;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OutAppSubscribe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/glority/network/model/Resource;", "Lcom/purchase/generatedAPI/kotlinAPI/purchase/VerifyMessage;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.utils.OutAppSubscribe$verifyPurchase$1$verifyTasks$1$1", f = "OutAppSubscribe.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class OutAppSubscribe$verifyPurchase$1$verifyTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Resource<? extends VerifyMessage>>, Object> {
    final /* synthetic */ Purchase $it;
    final /* synthetic */ String $productId;
    int label;
    final /* synthetic */ OutAppSubscribe this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutAppSubscribe$verifyPurchase$1$verifyTasks$1$1(OutAppSubscribe outAppSubscribe, String str, Purchase purchase, Continuation<? super OutAppSubscribe$verifyPurchase$1$verifyTasks$1$1> continuation) {
        super(2, continuation);
        this.this$0 = outAppSubscribe;
        this.$productId = str;
        this.$it = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OutAppSubscribe$verifyPurchase$1$verifyTasks$1$1(this.this$0, this.$productId, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Resource<? extends VerifyMessage>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Resource<VerifyMessage>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Resource<VerifyMessage>> continuation) {
        return ((OutAppSubscribe$verifyPurchase$1$verifyTasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingSync billingClient;
        String str;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            billingClient = this.this$0.getBillingClient();
            this.label = 1;
            obj = billingClient.queryProductDetail("subs", this.$productId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ProductDetails productDetails = (ProductDetails) obj;
        ProductDetails.PricingPhase pricingPhase = (productDetails == null || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null || (subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails)) == null || (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null) ? null : (ProductDetails.PricingPhase) CollectionsKt.firstOrNull((List) pricingPhaseList);
        Price price = new Price(0, 1, null);
        if (pricingPhase == null || (str = pricingPhase.getPriceCurrencyCode()) == null) {
            str = "";
        }
        price.setCurrency(str);
        price.setAmount(new BigDecimal(String.valueOf((pricingPhase != null ? pricingPhase.getPriceAmountMicros() : 0L) / 1000000.0d)));
        BillingRepository billingRepository = BillingRepository.INSTANCE;
        PaymentType paymentType = PaymentType.GOOGLE_PLAY;
        DeviceType deviceType = DeviceType.ANDROID;
        String str2 = this.$productId;
        String firebaseAppInstanceId = MyBillingAgent.INSTANCE.getFirebaseAppInstanceId();
        String firebaseSessionId = MyBillingAgent.INSTANCE.getFirebaseSessionId();
        String originalJson = this.$it.getOriginalJson();
        Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
        return billingRepository.verifyOrder(paymentType, deviceType, str2, price, firebaseAppInstanceId, firebaseSessionId, 1, originalJson);
    }
}
