package com.glority.billing.play;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.glority.billing.play.BillingManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: BillingUpdatesListenerWrapper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/billing/play/BillingUpdatesListenerWrapper;", "Lcom/glority/billing/play/BillingManager$BillingUpdatesListener;", "billingUpdatesListener", "<init>", "(Lcom/glority/billing/play/BillingManager$BillingUpdatesListener;)V", "onProductDetailsResponse", "", "p0", "Lcom/android/billingclient/api/BillingResult;", "p1", "", "Lcom/android/billingclient/api/ProductDetails;", "onPurchasesUpdated", "", "Lcom/android/billingclient/api/Purchase;", "onConsumeResponse", "", "onBillingSetupFinished", "success", "", "billingResult", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class BillingUpdatesListenerWrapper implements BillingManager.BillingUpdatesListener {
    private final BillingManager.BillingUpdatesListener billingUpdatesListener;

    public BillingUpdatesListenerWrapper(BillingManager.BillingUpdatesListener billingUpdatesListener) {
        Intrinsics.checkNotNullParameter(billingUpdatesListener, "billingUpdatesListener");
        this.billingUpdatesListener = billingUpdatesListener;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult p0, List<ProductDetails> p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new BillingUpdatesListenerWrapper$onProductDetailsResponse$1(this, p0, p1, null), 3, null);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult p0, List<Purchase> p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new BillingUpdatesListenerWrapper$onPurchasesUpdated$1(this, p0, p1, null), 3, null);
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new BillingUpdatesListenerWrapper$onConsumeResponse$1(this, p0, p1, null), 3, null);
    }

    @Override // com.glority.billing.play.BillingManager.BillingUpdatesListener
    public void onBillingSetupFinished(boolean success, BillingResult billingResult) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new BillingUpdatesListenerWrapper$onBillingSetupFinished$1(this, success, billingResult, null), 3, null);
    }
}
