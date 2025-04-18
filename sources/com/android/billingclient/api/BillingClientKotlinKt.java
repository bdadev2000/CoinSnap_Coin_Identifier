package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import b1.r;
import b1.s;
import h0.g;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public final class BillingClientKotlinKt {
    @RecentlyNullable
    public static final Object acknowledgePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$acknowledgePurchase$2
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                a.p(billingResult);
                ((s) r.this).Z(billingResult);
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    public static final Object consumePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull ConsumeParams consumeParams, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$consumePurchase$2
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str) {
                a.p(billingResult);
                ((s) r.this).Z(new ConsumeResult(billingResult, str));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    public static final Object createAlternativeBillingOnlyReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new AlternativeBillingOnlyReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$createAlternativeBillingOnlyReportingDetails$2
            @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
            public final void onAlternativeBillingOnlyTokenResponse(BillingResult billingResult, @Nullable AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
                a.p(billingResult);
                ((s) r.this).Z(new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    public static final Object isAlternativeBillingOnlyAvailable(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.isAlternativeBillingOnlyAvailableAsync(new AlternativeBillingOnlyAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$isAlternativeBillingOnlyAvailable$2
            @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
            public final void onAlternativeBillingOnlyAvailabilityResponse(BillingResult billingResult) {
                a.p(billingResult);
                ((s) r.this).Z(billingResult);
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    public static final Object queryProductDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryProductDetailsParams queryProductDetailsParams, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$queryProductDetails$2
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
                a.p(billingResult);
                ((s) r.this).Z(new ProductDetailsResult(billingResult, list));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    public static final Object queryPurchaseHistory(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryPurchaseHistoryParams queryPurchaseHistoryParams, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.queryPurchaseHistoryAsync(queryPurchaseHistoryParams, new PurchaseHistoryResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$queryPurchaseHistory$4
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list) {
                a.p(billingResult);
                ((s) r.this).Z(new PurchaseHistoryResult(billingResult, list));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    public static final Object queryPurchasesAsync(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryPurchasesParams queryPurchasesParams, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.queryPurchasesAsync(queryPurchasesParams, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$queryPurchasesAsync$4
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                a.p(billingResult);
                a.p(list);
                ((s) r.this).Z(new PurchasesResult(billingResult, list));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    @d0.a
    public static final Object querySkuDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull SkuDetailsParams skuDetailsParams, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.querySkuDetailsAsync(skuDetailsParams, new SkuDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$querySkuDetails$2
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public final void onSkuDetailsResponse(BillingResult billingResult, @Nullable List<SkuDetails> list) {
                a.p(billingResult);
                ((s) r.this).Z(new SkuDetailsResult(billingResult, list));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    @d0.a
    public static final Object queryPurchaseHistory(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull String str, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$queryPurchaseHistory$2
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list) {
                a.p(billingResult);
                ((s) r.this).Z(new PurchaseHistoryResult(billingResult, list));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    @RecentlyNullable
    @d0.a
    public static final Object queryPurchasesAsync(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull String str, @RecentlyNonNull g gVar) {
        final s b2 = a.b();
        billingClient.queryPurchasesAsync(str, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$queryPurchasesAsync$2
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                a.p(billingResult);
                a.p(list);
                ((s) r.this).Z(new PurchasesResult(billingResult, list));
            }
        });
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }
}
