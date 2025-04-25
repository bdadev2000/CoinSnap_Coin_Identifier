package com.glority.billing.agent;

import android.util.Log;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.glority.billing.play.BillingAgent;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.PaymentType;
import com.glority.billing.repository.BillingRepository;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.network.model.Resource;
import com.purchase.generatedAPI.kotlinAPI.model.Price;
import com.purchase.generatedAPI.kotlinAPI.purchase.VerifyMessage;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$myVerifyOrder$1", f = "MyBillingAgent.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class MyBillingAgent$myVerifyOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Purchase $purchase;
    Object L$0;
    int label;
    final /* synthetic */ MyBillingAgent this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBillingAgent$myVerifyOrder$1(Purchase purchase, MyBillingAgent myBillingAgent, Continuation<? super MyBillingAgent$myVerifyOrder$1> continuation) {
        super(2, continuation);
        this.$purchase = purchase;
        this.this$0 = myBillingAgent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBillingAgent$myVerifyOrder$1(this.$purchase, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBillingAgent$myVerifyOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, com.purchase.generatedAPI.kotlinAPI.model.Price] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, com.purchase.generatedAPI.kotlinAPI.model.Price] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingAgent billingAgent;
        boolean isInAppBilling;
        String priceCurrencyCode;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
        String priceCurrencyCode2;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3;
        Map<String, ProductDetails> productDetailsMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<String> products = this.$purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            String str = (String) CollectionsKt.firstOrNull((List) products);
            String str2 = "";
            if (str == null) {
                str = "";
            }
            billingAgent = this.this$0.billingAgent;
            ProductDetails productDetails = (billingAgent == null || (productDetailsMap = billingAgent.getProductDetailsMap()) == null) ? null : productDetailsMap.get(str);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            isInAppBilling = this.this$0.isInAppBilling();
            if (isInAppBilling) {
                objectRef2.element = (productDetails == null || (oneTimePurchaseOfferDetails3 = productDetails.getOneTimePurchaseOfferDetails()) == null) ? 0 : Boxing.boxLong(oneTimePurchaseOfferDetails3.getPriceAmountMicros());
                ?? price = new Price(0, 1, null);
                if (productDetails != null && (oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails()) != null && (priceCurrencyCode2 = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) != null) {
                    str2 = priceCurrencyCode2;
                }
                price.setCurrency(str2);
                if (productDetails != null && (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) != null) {
                    r10 = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                }
                price.setAmount(new BigDecimal(String.valueOf(r10 / 1000000.0d)));
                objectRef.element = price;
            } else {
                ProductDetails.PricingPhase pricingPhase = (productDetails == null || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null || (subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails)) == null || (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null) ? null : (ProductDetails.PricingPhase) CollectionsKt.firstOrNull((List) pricingPhaseList);
                objectRef2.element = pricingPhase != null ? Boxing.boxLong(pricingPhase.getPriceAmountMicros()) : 0;
                ?? price2 = new Price(0, 1, null);
                if (pricingPhase != null && (priceCurrencyCode = pricingPhase.getPriceCurrencyCode()) != null) {
                    str2 = priceCurrencyCode;
                }
                price2.setCurrency(str2);
                price2.setAmount(new BigDecimal(String.valueOf((pricingPhase != null ? pricingPhase.getPriceAmountMicros() : 0L) / 1000000.0d)));
                objectRef.element = price2;
            }
            Log.d("MyBillingAgent", "myVerifyOrder - Price: " + objectRef.element);
            BillingRepository billingRepository = BillingRepository.INSTANCE;
            PaymentType paymentType = PaymentType.GOOGLE_PLAY;
            DeviceType deviceType = DeviceType.ANDROID;
            Price price3 = (Price) objectRef.element;
            String str3 = MyBillingAgent.mFirebaseAppInstanceId;
            String str4 = MyBillingAgent.mFirebaseSessionId;
            String originalJson = this.$purchase.getOriginalJson();
            Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
            String str5 = str;
            Resource<VerifyMessage> verifyOrder = billingRepository.verifyOrder(paymentType, deviceType, str5, price3, str3, str4, 1, originalJson);
            Purchase purchase = this.$purchase;
            MyBillingAgent myBillingAgent = this.this$0;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            MyBillingAgent$myVerifyOrder$1$3$1 myBillingAgent$myVerifyOrder$1$3$1 = new MyBillingAgent$myVerifyOrder$1$3$1(verifyOrder, purchase, str5, objectRef2, objectRef, myBillingAgent, null);
            this.L$0 = verifyOrder;
            this.label = 1;
            if (BuildersKt.withContext(main, myBillingAgent$myVerifyOrder$1$3$1, this) == coroutine_suspended) {
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
