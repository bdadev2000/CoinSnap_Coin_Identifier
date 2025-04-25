package com.glority.base.utils;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.VipLevel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GoogleBillingQuery.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u000e\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J*\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J \u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0087@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/glority/base/utils/GoogleBillingQuery;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "<init>", "()V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "onPurchasesUpdated", "", "p0", "Lcom/android/billingclient/api/BillingResult;", "p1", "", "Lcom/android/billingclient/api/Purchase;", "connect", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acknowledgePurchase", "purchaseToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchases", "Lkotlin/Pair;", "productType", "queryPurchasesHistory", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "queryProductDetail", "Lcom/android/billingclient/api/ProductDetails;", "productId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "querySkuDetail", "Lcom/android/billingclient/api/SkuDetails;", "skuType", LogEventArguments.ARG_SKU, "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class GoogleBillingQuery implements PurchasesUpdatedListener {
    private final BillingClient billingClient;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult p0, List<Purchase> p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    public GoogleBillingQuery() {
        BillingClient build = BillingClient.newBuilder(AppContext.INSTANCE.peekContext()).setListener(this).enablePendingPurchases().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.billingClient = build;
    }

    public final Object connect(Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        this.billingClient.startConnection(new BillingClientStateListener() { // from class: com.glority.base.utils.GoogleBillingQuery$connect$2$1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                try {
                    Continuation<Boolean> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8274constructorimpl(Boolean.valueOf(p0.getResponseCode() == 0)));
                } catch (Throwable unused) {
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object acknowledgePurchase(String str, Continuation<? super BillingResult> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        AcknowledgePurchaseParams.Builder purchaseToken = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str);
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "setPurchaseToken(...)");
        this.billingClient.acknowledgePurchase(purchaseToken.build(), new AcknowledgePurchaseResponseListener() { // from class: com.glority.base.utils.GoogleBillingQuery$acknowledgePurchase$2$1
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                try {
                    Continuation<BillingResult> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8274constructorimpl(result));
                } catch (Throwable unused) {
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object queryPurchases(String str, Continuation<? super Pair<Boolean, ? extends List<Purchase>>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.billingClient.queryPurchasesAsync(build, new PurchasesResponseListener() { // from class: com.glority.base.utils.GoogleBillingQuery$queryPurchases$2$1
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult p0, List<Purchase> p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                try {
                    Continuation<Pair<Boolean, ? extends List<Purchase>>> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8274constructorimpl(new Pair(Boolean.valueOf(p0.getResponseCode() == 0), p1)));
                } catch (Throwable unused) {
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object queryPurchasesHistory(String str, Continuation<? super Pair<Boolean, ? extends List<PurchaseHistoryRecord>>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        QueryPurchaseHistoryParams build = QueryPurchaseHistoryParams.newBuilder().setProductType(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.billingClient.queryPurchaseHistoryAsync(build, new PurchaseHistoryResponseListener() { // from class: com.glority.base.utils.GoogleBillingQuery$queryPurchasesHistory$2$1
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult p0, List<PurchaseHistoryRecord> list) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                try {
                    Continuation<Pair<Boolean, ? extends List<PurchaseHistoryRecord>>> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8274constructorimpl(new Pair(Boolean.valueOf(p0.getResponseCode() == 0), list)));
                } catch (Throwable unused) {
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object queryProductDetail(String str, String str2, Continuation<? super ProductDetails> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(CollectionsKt.listOf(QueryProductDetailsParams.Product.newBuilder().setProductId(str2).setProductType(str).build())).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: com.glority.base.utils.GoogleBillingQuery$queryProductDetail$2$1
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult p0, List<ProductDetails> p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                try {
                    Continuation<ProductDetails> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8274constructorimpl(CollectionsKt.firstOrNull((List) p1)));
                } catch (Throwable unused) {
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Deprecated(message = "use queryProductDetail instead")
    public final Object querySkuDetail(String str, String str2, Continuation<? super SkuDetails> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setSkusList(CollectionsKt.listOf(str2)).setType(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.billingClient.querySkuDetailsAsync(build, new SkuDetailsResponseListener() { // from class: com.glority.base.utils.GoogleBillingQuery$querySkuDetail$2$1
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public final void onSkuDetailsResponse(BillingResult p0, List<SkuDetails> list) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                try {
                    Continuation<SkuDetails> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8274constructorimpl(list != null ? (SkuDetails) CollectionsKt.firstOrNull((List) list) : null));
                } catch (Throwable unused) {
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* compiled from: GoogleBillingQuery.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/base/utils/GoogleBillingQuery$Companion;", "", "<init>", "()V", "toVip", "Lcom/glority/component/generatedAPI/kotlinAPI/vip/VipInfo;", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "userId", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VipInfo toVip(Purchase purchase, long userId) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            VipInfo vipInfo = new VipInfo(0, 1, null);
            vipInfo.setVip(true);
            vipInfo.setUserId(userId);
            vipInfo.setStartAt(new Date(purchase.getPurchaseTime()));
            ArrayList<String> skus = purchase.getSkus();
            Intrinsics.checkNotNullExpressionValue(skus, "getSkus(...)");
            String str = (String) CollectionsKt.firstOrNull((List) skus);
            if (str == null) {
                str = "";
            }
            vipInfo.setSku(str);
            String str2 = str;
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) Args.year, false, 2, (Object) null)) {
                Date startAt = vipInfo.getStartAt();
                Intrinsics.checkNotNull(startAt);
                vipInfo.setExpiredAt(new Date(startAt.getTime() + 31536000000L));
            } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "month", false, 2, (Object) null)) {
                Date startAt2 = vipInfo.getStartAt();
                Intrinsics.checkNotNull(startAt2);
                vipInfo.setExpiredAt(new Date(startAt2.getTime() + 2678400000L));
            } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "week", false, 2, (Object) null)) {
                Date startAt3 = vipInfo.getStartAt();
                Intrinsics.checkNotNull(startAt3);
                vipInfo.setExpiredAt(new Date(startAt3.getTime() + 604800000));
            }
            vipInfo.setTrial(false);
            vipInfo.setVipLevel(VipLevel.PLATINUM);
            return vipInfo;
        }
    }
}
