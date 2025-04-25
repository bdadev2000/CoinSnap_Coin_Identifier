package com.glority.billing.play;

import android.content.Context;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingSync.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J \u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/billing/play/BillingSync;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "client", "Lcom/android/billingclient/api/BillingClient;", "connect", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchases", "Lkotlin/Pair;", "", "Lcom/android/billingclient/api/Purchase;", "productType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchasesHistory", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "onPurchasesUpdated", "", "p0", "Lcom/android/billingclient/api/BillingResult;", "p1", "queryProductDetail", "Lcom/android/billingclient/api/ProductDetails;", "productId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class BillingSync implements PurchasesUpdatedListener {
    private final BillingClient client;

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult p0, List<Purchase> p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    public BillingSync(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BillingClient build = BillingClient.newBuilder(context).setListener(this).enablePendingPurchases().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.client = build;
    }

    public final Object connect(Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        this.client.startConnection(new BillingClientStateListener() { // from class: com.glority.billing.play.BillingSync$connect$2$1
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

    public final Object queryPurchases(String str, Continuation<? super Pair<Boolean, ? extends List<Purchase>>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.client.queryPurchasesAsync(build, new PurchasesResponseListener() { // from class: com.glority.billing.play.BillingSync$queryPurchases$2$1
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public void onQueryPurchasesResponse(BillingResult p0, List<Purchase> p1) {
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
        this.client.queryPurchaseHistoryAsync(build, new PurchaseHistoryResponseListener() { // from class: com.glority.billing.play.BillingSync$queryPurchasesHistory$2$1
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult p0, List<PurchaseHistoryRecord> list) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                try {
                    Continuation<Pair<Boolean, ? extends List<PurchaseHistoryRecord>>> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    Boolean valueOf = Boolean.valueOf(p0.getResponseCode() == 0);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    continuation2.resumeWith(Result.m8274constructorimpl(new Pair(valueOf, list)));
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
        this.client.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: com.glority.billing.play.BillingSync$queryProductDetail$2$1
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
}
