package com.glority.billing.play;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.glority.billing.play.BillingManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class BillingAgent implements BillingManager.BillingUpdatesListener {
    private static final String TAG = "BillingAgent";
    private final BillingManager billingManager;
    private final BillingAgentListener listener;
    private final Map<String, ProductDetails> productDetailsMap = new HashMap();
    private final List<String> productList;
    private final String productType;
    private boolean restore;

    /* loaded from: classes6.dex */
    public interface BillingAgentListener {
        void onBillingSetupFinished(boolean z, BillingResult billingResult, List<ProductDetails> list);

        void onConsumeResponse(BillingResult billingResult, String str);

        void onPurchaseError(int i, String str, boolean z);

        void onPurchaseSuccess(List<Purchase> list, boolean z);
    }

    /* loaded from: classes6.dex */
    public static class BillingAgentListenerAdapter implements BillingAgentListener {
        @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
        public void onBillingSetupFinished(boolean z, BillingResult billingResult, List<ProductDetails> list) {
        }

        @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
        public void onConsumeResponse(BillingResult billingResult, String str) {
        }

        @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
        public void onPurchaseError(int i, String str, boolean z) {
        }

        @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
        public void onPurchaseSuccess(List<Purchase> list, boolean z) {
        }
    }

    public BillingAgent(Context context, String str, List<String> list, Lifecycle lifecycle, BillingAgentListener billingAgentListener) {
        this.productType = str;
        this.productList = list;
        this.listener = billingAgentListener;
        this.billingManager = new BillingManager(context, lifecycle, this);
    }

    public void purchase(Activity activity, ProductDetails productDetails, String str, int i, String str2) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        String str3 = null;
        String str4 = "inapp".equals(this.productType) ? null : str;
        if ("subs".equals(this.productType) && (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) != null && subscriptionOfferDetails.size() > 0) {
            str3 = subscriptionOfferDetails.get(0).getOfferToken();
        }
        this.billingManager.initiatePurchaseFlow(activity, productDetails, str3, str4, i, str2, this.productType);
    }

    public void restore() {
        this.restore = true;
        this.billingManager.queryPurchases();
    }

    public void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.billingManager.queryPurchaseHistoryAsync(str, purchaseHistoryResponseListener);
    }

    public void consumeAsync(String str, String str2) {
        this.billingManager.consumeAsync(str, str2);
    }

    public Map<String, ProductDetails> getProductDetailsMap() {
        return this.productDetailsMap;
    }

    public void destroy() {
        this.billingManager.destroy();
    }

    @Override // com.glority.billing.play.BillingManager.BillingUpdatesListener
    public void onBillingSetupFinished(boolean z, BillingResult billingResult) {
        if (z) {
            queryProductDetailsAsync(this.productList);
        } else {
            this.listener.onBillingSetupFinished(false, billingResult, null);
        }
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult billingResult, String str) {
        this.listener.onConsumeResponse(billingResult, str);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        String str = TAG;
        Log.d(str, "onPurchasesUpdated");
        if (billingResult == null) {
            Log.e(str, "onPurchasesUpdated: null BillingResult");
            this.restore = false;
            return;
        }
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Log.d(str, "onPurchasesUpdated: " + responseCode + ",  " + debugMessage);
        if (responseCode == 0) {
            this.listener.onPurchaseSuccess(list, this.restore);
        } else {
            this.listener.onPurchaseError(responseCode, debugMessage, this.restore);
        }
        this.restore = false;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
        if (billingResult == null) {
            Log.d(TAG, "onProductDetailsResponse() billingResult is null");
            this.listener.onBillingSetupFinished(false, null, null);
            return;
        }
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 0) {
            Log.d(TAG, "onProductDetailsResponse() fail. Error code: " + responseCode);
            this.listener.onBillingSetupFinished(false, billingResult, null);
            return;
        }
        String str = TAG;
        Log.d(str, "onProductDetailsResponse() success.");
        if (list != null && !list.isEmpty()) {
            for (ProductDetails productDetails : list) {
                Log.d(TAG, productDetails.toString());
                this.productDetailsMap.put(productDetails.getProductId(), productDetails);
            }
        } else {
            Log.d(str, "onProductDetailsResponse() empty productDetailsList.");
        }
        this.listener.onBillingSetupFinished(true, billingResult, list);
    }

    private void queryProductDetailsAsync(List<String> list) {
        Log.d(TAG, "queryProductDetailsAsync() got subscriptions and inApp ProductDetails lists for: " + (System.currentTimeMillis() - System.currentTimeMillis()) + "ms");
        this.billingManager.queryProductDetailsAsync(this.productType, list);
    }
}
