package com.glority.billing.play;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class BillingManager implements PurchasesUpdatedListener, LifecycleObserver {
    public static final int BILLING_MANAGER_NOT_INITIALIZED = -1;
    private static final String TAG = "BillingManager";
    private final Lifecycle lifecycle;
    private BillingClient mBillingClient;
    private final BillingUpdatesListener mBillingUpdatesListener;
    private boolean mIsServiceConnected;
    private Set<String> mTokensToBeConsumed;
    private int mBillingClientResponseCode = -1;
    private final AtomicInteger purchaseCount = new AtomicInteger();

    /* loaded from: classes6.dex */
    public interface BillingUpdatesListener extends ProductDetailsResponseListener, PurchasesUpdatedListener, ConsumeResponseListener {
        void onBillingSetupFinished(boolean z, BillingResult billingResult);
    }

    public BillingManager(Context context, Lifecycle lifecycle, BillingUpdatesListener billingUpdatesListener) {
        String str = TAG;
        Log.d(str, "Creating Billing client.");
        this.mBillingUpdatesListener = new BillingUpdatesListenerWrapper(billingUpdatesListener);
        this.mBillingClient = BillingClient.newBuilder(context).enablePendingPurchases().setListener(this).build();
        this.lifecycle = lifecycle;
        lifecycle.addObserver(this);
        Log.d(str, "Starting setup.");
        startServiceConnection(new Runnable() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                BillingManager.this.lambda$new$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.mBillingUpdatesListener.onBillingSetupFinished(true, null);
        Log.d(TAG, "Setup successful. Querying inventory.");
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        if (isPurchaseActive()) {
            this.purchaseCount.decrementAndGet();
            Log.e(TAG, "onPurchasesUpdated");
            this.mBillingUpdatesListener.onPurchasesUpdated(billingResult, list);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        Log.e(TAG, "onDestroy");
        this.lifecycle.removeObserver(this);
    }

    private boolean isPurchaseActive() {
        if (this.purchaseCount.get() < 0) {
            this.purchaseCount.set(0);
        }
        return this.purchaseCount.get() > 0;
    }

    private void launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        this.purchaseCount.incrementAndGet();
        this.mBillingClient.launchBillingFlow(activity, billingFlowParams);
    }

    public void initiatePurchaseFlow(final Activity activity, final ProductDetails productDetails, final String str, final String str2, final int i, final String str3, final String str4) {
        executeServiceRequest(new Runnable() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BillingManager.this.lambda$initiatePurchaseFlow$2(str2, str3, productDetails, str, activity, str4, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiatePurchaseFlow$2(final String str, final String str2, final ProductDetails productDetails, final String str3, final Activity activity, String str4, final int i) {
        if (!isReady()) {
            Log.d(TAG, "initiatePurchaseFlow failed because billing client is not ready");
            return;
        }
        String str5 = TAG;
        Log.d(str5, "Launching in-app purchase flow. Replace old productId? " + (str != null));
        Log.d(str5, "Launching in-app purchase flow. userId:  " + str2);
        if (TextUtils.isEmpty(str)) {
            BillingFlowParams.ProductDetailsParams.Builder newBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
            newBuilder.setProductDetails(productDetails);
            if (!TextUtils.isEmpty(str3)) {
                newBuilder.setOfferToken(str3);
            }
            BillingFlowParams.ProductDetailsParams build = newBuilder.build();
            ArrayList arrayList = new ArrayList();
            arrayList.add(build);
            launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).setObfuscatedAccountId(str2).build());
            return;
        }
        this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str4).build(), new PurchasesResponseListener() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingManager.this.lambda$initiatePurchaseFlow$1(str, productDetails, str3, i, str2, activity, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiatePurchaseFlow$1(String str, ProductDetails productDetails, String str2, int i, String str3, Activity activity, BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.getProducts().contains(str) && purchase.getPurchaseState() == 1) {
                    BillingFlowParams.ProductDetailsParams.Builder newBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
                    newBuilder.setProductDetails(productDetails);
                    if (!TextUtils.isEmpty(str2)) {
                        newBuilder.setOfferToken(str2);
                    }
                    BillingFlowParams.ProductDetailsParams build = newBuilder.build();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(build);
                    launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).setSubscriptionUpdateParams(BillingFlowParams.SubscriptionUpdateParams.newBuilder().setOldPurchaseToken(purchase.getPurchaseToken()).setSubscriptionReplacementMode(i).build()).setObfuscatedAccountId(str3).build());
                    return;
                }
            }
            return;
        }
        this.mBillingUpdatesListener.onBillingSetupFinished(false, billingResult);
    }

    public void destroy() {
        Log.d(TAG, "Destroying the manager.");
        this.purchaseCount.set(0);
        if (isReady()) {
            this.mBillingClient.endConnection();
            this.mBillingClient = null;
        }
    }

    public void queryProductDetailsAsync(final String str, final List<String> list) {
        executeServiceRequest(new Runnable() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                BillingManager.this.lambda$queryProductDetailsAsync$3(list, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryProductDetailsAsync$3(List list, String str) {
        if (!isReady()) {
            Log.d(TAG, "queryProductDetailsAsync failed because billing client is not ready");
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(str).build());
        }
        this.mBillingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), this.mBillingUpdatesListener);
    }

    public void queryPurchaseHistoryAsync(final String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        executeServiceRequest(new Runnable() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                BillingManager.this.lambda$queryPurchaseHistoryAsync$4(str, purchaseHistoryResponseListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryPurchaseHistoryAsync$4(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            Log.d(TAG, "queryPurchaseHistoryAsync failed because billing client is not ready");
        } else {
            this.mBillingClient.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), purchaseHistoryResponseListener);
        }
    }

    public void consumeAsync(final String str, String str2) {
        Set<String> set = this.mTokensToBeConsumed;
        if (set == null) {
            this.mTokensToBeConsumed = new HashSet();
        } else if (set.contains(str)) {
            Log.d(TAG, "Token was already scheduled to be consumed - skipping...");
            return;
        }
        this.mTokensToBeConsumed.add(str);
        executeServiceRequest(new Runnable() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BillingManager.this.lambda$consumeAsync$5(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$consumeAsync$5(String str) {
        if (!isReady()) {
            Log.d(TAG, "consumeAsync failed because billing client is not ready");
        } else {
            this.mBillingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str).build(), this.mBillingUpdatesListener);
        }
    }

    public int getBillingClientResponseCode() {
        return this.mBillingClientResponseCode;
    }

    public boolean isReady() {
        BillingClient billingClient = this.mBillingClient;
        return billingClient != null && billingClient.isReady();
    }

    private void onQueryPurchasesFinished(BillingResult billingResult, List<Purchase> list) {
        if (!isReady() || billingResult.getResponseCode() != 0) {
            Log.w(TAG, "Billing client was not ready or result code (" + billingResult.getResponseCode() + ") was bad - quitting");
        } else {
            Log.d(TAG, "Query inventory was successful.");
        }
        this.mBillingUpdatesListener.onPurchasesUpdated(billingResult, list);
    }

    public boolean areSubscriptionsSupported() {
        if (!isReady()) {
            Log.d(TAG, "areSubscriptionsSupported() failed because billing client is not ready");
            return false;
        }
        BillingResult isFeatureSupported = this.mBillingClient.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS);
        if (isFeatureSupported == null) {
            Log.w(TAG, "areSubscriptionsSupported(): call mBillingClient.isFeatureSupported return null");
            return false;
        }
        int responseCode = isFeatureSupported.getResponseCode();
        if (responseCode == 0) {
            return true;
        }
        Log.w(TAG, "areSubscriptionsSupported() got an error response: " + responseCode);
        return false;
    }

    public void queryPurchases() {
        executeServiceRequest(new Runnable() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BillingManager.this.lambda$queryPurchases$8();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryPurchases$8() {
        if (!isReady()) {
            Log.d(TAG, "queryPurchases() failed because billing client is not ready");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda4
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingManager.this.lambda$queryPurchases$7(currentTimeMillis, billingResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryPurchases$7(final long j, final BillingResult billingResult, final List list) {
        String str = TAG;
        Log.d(str, "Querying purchases elapsed time: " + (System.currentTimeMillis() - j) + "ms");
        if (!areSubscriptionsSupported()) {
            if (billingResult.getResponseCode() == 0) {
                Log.d(str, "Skipped subscription purchases query since they are not supported");
            } else {
                Log.w(str, "queryPurchases() got an error response code: " + billingResult.getResponseCode());
            }
            onQueryPurchasesFinished(billingResult, list);
            return;
        }
        this.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new PurchasesResponseListener() { // from class: com.glority.billing.play.BillingManager$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult2, List list2) {
                BillingManager.this.lambda$queryPurchases$6(j, billingResult, list, billingResult2, list2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryPurchases$6(long j, BillingResult billingResult, List list, BillingResult billingResult2, List list2) {
        String str = TAG;
        Log.d(str, "Querying purchases and subscriptions elapsed time: " + (System.currentTimeMillis() - j) + "ms");
        Log.d(str, "Querying subscriptions result code: " + billingResult2.getResponseCode() + " res: " + list2.size());
        ArrayList arrayList = new ArrayList();
        if (billingResult2.getResponseCode() == 0 && billingResult.getResponseCode() == 0) {
            arrayList.addAll(list);
            arrayList.addAll(list2);
        } else {
            if (billingResult.getResponseCode() != 0) {
                Log.e(str, "Got an error response trying to query in-app purchases");
            } else {
                billingResult = billingResult2;
            }
            if (billingResult2.getResponseCode() != 0) {
                Log.e(str, "Got an error response trying to query subscriptions");
            }
            billingResult2 = billingResult;
        }
        onQueryPurchasesFinished(billingResult2, arrayList);
    }

    public void startServiceConnection(final Runnable runnable) {
        BillingClient billingClient = this.mBillingClient;
        if (billingClient == null) {
            Log.d(TAG, "startServiceConnection() failed because billingClient is null");
        } else {
            billingClient.startConnection(new BillingClientStateListener() { // from class: com.glority.billing.play.BillingManager.1
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(BillingResult billingResult) {
                    if (billingResult == null) {
                        Log.e(BillingManager.TAG, "onBillingSetupFinished: null BillingResult");
                        BillingManager.this.mBillingUpdatesListener.onBillingSetupFinished(false, null);
                        return;
                    }
                    int responseCode = billingResult.getResponseCode();
                    Log.d(BillingManager.TAG, "Setup finished: " + responseCode + ",  " + billingResult.getDebugMessage());
                    if (responseCode == 0) {
                        BillingManager.this.mIsServiceConnected = true;
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    } else {
                        BillingManager.this.mBillingUpdatesListener.onBillingSetupFinished(false, billingResult);
                    }
                    BillingManager.this.mBillingClientResponseCode = responseCode;
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    BillingManager.this.mIsServiceConnected = false;
                    Log.d(BillingManager.TAG, "onBillingServiceDisconnected...");
                }
            });
        }
    }

    private void executeServiceRequest(Runnable runnable) {
        if (this.mIsServiceConnected) {
            runnable.run();
        } else {
            startServiceConnection(runnable);
        }
    }
}
