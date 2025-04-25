package com.glority.billing.agent;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.glority.android.base.billing.R;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.exception.AppException;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.billing.PurchaseLogEvent;
import com.glority.billing.play.BillingAgent;
import com.glority.billing.play.BillingSync;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.billing.utils.PaddingData;
import com.glority.billing.utils.PaymentUtils;
import com.glority.network.exception.APIException;
import com.glority.network.exception.NetworkException;
import com.glority.network.exception.RequestFailException;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.purchase.generatedAPI.kotlinAPI.purchase.VerifyMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0002:;B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0013J2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001e\u001a\u00020\u0015J\u001a\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020#H\u0002J\u001a\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0016\u001a\u00020#H\u0002J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020#J\u001e\u0010(\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0016\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020-H\u0002J \u0010.\u001a\u00020\u00152\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020#\u0018\u0001002\u0006\u0010\u0014\u001a\u00020-H\u0016J\"\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020-H\u0016J*\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020-2\b\u00106\u001a\u0004\u0018\u0001072\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u000100H\u0016J\u001c\u00109\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u0001072\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/glority/billing/agent/MyBillingAgent;", "Lcom/glority/billing/play/BillingAgent$BillingAgentListener;", "context", "Landroid/content/Context;", "skuType", "", "skuList", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "myListener", "Lcom/glority/billing/agent/MyBillingAgent$MyBillingAgentListener;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Landroidx/lifecycle/Lifecycle;Lcom/glority/billing/agent/MyBillingAgent$MyBillingAgentListener;)V", "billingAgent", "Lcom/glority/billing/play/BillingAgent;", "tryNum", "", "restorePolicy", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;", "restore", "", FirebaseAnalytics.Event.PURCHASE, "activity", "Landroid/app/Activity;", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "oldProductId", "replacementMode", "userId", "destroy", "consumeAsync", "purchaseToken", "developerPayload", "myRestoreOrder", "Lcom/android/billingclient/api/Purchase;", "restoreErrorDeal", "exception", "", "myVerifyOrder", "verifyOrderErrorDeal", "resource", "Lcom/glority/network/model/Resource;", "Lcom/purchase/generatedAPI/kotlinAPI/purchase/VerifyMessage;", "isInAppBilling", "", "onPurchaseSuccess", "purchases", "", "onPurchaseError", "errorCode", LogEventArguments.ARG_MESSAGE, "onBillingSetupFinished", "success", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "productList", "onConsumeResponse", "MyBillingAgentListener", "Companion", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class MyBillingAgent implements BillingAgent.BillingAgentListener {
    public static final String ADJUST_PURCHASE_EVENT = "todaypay";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String mFirebaseAppInstanceId;
    private static String mFirebaseSessionId;
    private BillingAgent billingAgent;
    private MyBillingAgentListener myListener;
    private RestorePolicy restorePolicy;
    private int tryNum;

    @JvmStatic
    public static final String getFirebaseAppInstanceId() {
        return INSTANCE.getFirebaseAppInstanceId();
    }

    @JvmStatic
    public static final String getFirebaseSessionId() {
        return INSTANCE.getFirebaseSessionId();
    }

    @JvmStatic
    public static final void hasSubscribed(Context context, Function2<? super Exception, ? super Boolean, Unit> function2) {
        INSTANCE.hasSubscribed(context, function2);
    }

    @JvmStatic
    public static final boolean isEmptyList(List<?> list) {
        return INSTANCE.isEmptyList(list);
    }

    @JvmStatic
    public static final void setFirebaseAppInstanceId(String str) {
        INSTANCE.setFirebaseAppInstanceId(str);
    }

    @JvmStatic
    public static final void setFirebaseSessionId(String str) {
        INSTANCE.setFirebaseSessionId(str);
    }

    public MyBillingAgent(Context context, String str, List<String> skuList, Lifecycle lifecycle, MyBillingAgentListener myBillingAgentListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(skuList, "skuList");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.tryNum = 3;
        this.restorePolicy = RestorePolicy.Default;
        this.myListener = myBillingAgentListener;
        this.billingAgent = new BillingAgent(context, str, skuList, lifecycle, this);
    }

    public static /* synthetic */ void restore$default(MyBillingAgent myBillingAgent, RestorePolicy restorePolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            restorePolicy = RestorePolicy.Default;
        }
        myBillingAgent.restore(restorePolicy);
    }

    public final void restore(RestorePolicy restorePolicy) {
        Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
        new LogEventRequest(PurchaseLogEvent.PURCHASE_RESTORE, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "start"))).post();
        this.restorePolicy = restorePolicy;
        BillingAgent billingAgent = this.billingAgent;
        if (billingAgent != null) {
            billingAgent.restore();
        }
    }

    public final void purchase(Activity activity, ProductDetails productDetails, String oldProductId, int replacementMode, String userId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        BillingAgent billingAgent = this.billingAgent;
        if (billingAgent != null) {
            billingAgent.purchase(activity, productDetails, oldProductId, replacementMode, userId);
        }
    }

    public final void destroy() {
        BillingAgent billingAgent = this.billingAgent;
        if (billingAgent != null) {
            billingAgent.destroy();
        }
        this.billingAgent = null;
        this.myListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeAsync(String purchaseToken, String developerPayload) {
        BillingAgent billingAgent = this.billingAgent;
        if (billingAgent != null) {
            billingAgent.consumeAsync(purchaseToken, developerPayload);
        }
    }

    private final void myRestoreOrder(Purchase purchase) {
        Pair pair = TuplesKt.to("name", "start");
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        new LogEventRequest(PurchaseLogEvent.PURCHASE_RESTORE_VERIFY, LogEventArgumentsKt.logEventBundleOf(pair, TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)))).post();
        if (isInAppBilling()) {
            myVerifyOrder(purchase);
        }
        MyBillingAgentListener myBillingAgentListener = this.myListener;
        if (myBillingAgentListener != null) {
            myBillingAgentListener.myShowProgress();
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MyBillingAgent$myRestoreOrder$1(purchase, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreErrorDeal(Throwable exception, Purchase purchase) {
        if (exception instanceof APIException) {
            APIException aPIException = (APIException) exception;
            int code = aPIException.getCode();
            if (code == ErrorCodes.VERIFY_FAIL.getValue() || code == ErrorCodes.MIS_MATCHED_USER.getValue()) {
                PaymentUtils.INSTANCE.purchaseRemove(new PaddingData(purchase, false, 2, null));
            }
            MyBillingAgentListener myBillingAgentListener = this.myListener;
            if (myBillingAgentListener != null) {
                myBillingAgentListener.myPurchaseError(aPIException.getCode(), aPIException.getMessage(), true);
            }
            List<String> products = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_RESTORE_VERIFY, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("name", "failed"), TuplesKt.to("code", Integer.valueOf(aPIException.getCode())))).post();
            return;
        }
        if (exception instanceof RequestFailException) {
            MyBillingAgentListener myBillingAgentListener2 = this.myListener;
            if (myBillingAgentListener2 != null) {
                RequestFailException requestFailException = (RequestFailException) exception;
                myBillingAgentListener2.myPurchaseError(requestFailException.getCode(), requestFailException.getMessage(), true);
            }
            List<String> products2 = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_RESTORE_VERIFY, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products2, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("name", "failed"), TuplesKt.to("code", Integer.valueOf(((RequestFailException) exception).getCode())))).post();
            return;
        }
        LogUtils.e("unkown exception");
        MyBillingAgentListener myBillingAgentListener3 = this.myListener;
        if (myBillingAgentListener3 != null) {
            myBillingAgentListener3.myPurchaseError(AppException.AppError.APP_ERROR_UNKNOWN.getValue(), exception != null ? exception.getMessage() : null, true);
        }
    }

    public final void myVerifyOrder(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        MyBillingAgentListener myBillingAgentListener = this.myListener;
        if (myBillingAgentListener != null) {
            myBillingAgentListener.myShowProgress();
        }
        Pair pair = TuplesKt.to("name", "start");
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        new LogEventRequest(PurchaseLogEvent.PURCHASE_BUY_VERIFY, LogEventArgumentsKt.logEventBundleOf(pair, TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)))).post();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MyBillingAgent$myVerifyOrder$1(purchase, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyOrderErrorDeal(Resource<VerifyMessage> resource, Purchase purchase) {
        BillingAgent billingAgent;
        BillingAgent billingAgent2;
        NetworkException exception = resource.getException();
        if (exception instanceof APIException) {
            APIException aPIException = (APIException) exception;
            int code = aPIException.getCode();
            if (code == ErrorCodes.VERIFY_FAIL.getValue() || code == ErrorCodes.MIS_MATCHED_USER.getValue()) {
                MyBillingAgentListener myBillingAgentListener = this.myListener;
                if (myBillingAgentListener != null) {
                    myBillingAgentListener.myPurchaseError(aPIException.getCode(), aPIException.getMessage(), true);
                }
                PaymentUtils.INSTANCE.purchaseRemove(new PaddingData(purchase, false, 2, null));
            } else {
                PaymentUtils.INSTANCE.purchaseAdd(new PaddingData(purchase, isInAppBilling()));
                new LogEventRequest("assumed_as_vip", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", Integer.valueOf(aPIException.getCode())))).post();
                if (isInAppBilling() && (billingAgent2 = this.billingAgent) != null) {
                    billingAgent2.consumeAsync(purchase.getPurchaseToken(), null);
                }
                MyBillingAgentListener myBillingAgentListener2 = this.myListener;
                if (myBillingAgentListener2 != null) {
                    myBillingAgentListener2.myPurchaseSuccess(purchase, false, resource.getStatus(), null);
                }
            }
            Pair pair = TuplesKt.to("name", "failed");
            List<String> products = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_BUY_VERIFY, LogEventArgumentsKt.logEventBundleOf(pair, TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("code", Integer.valueOf(aPIException.getCode())))).post();
            return;
        }
        if (exception instanceof RequestFailException) {
            PaymentUtils.INSTANCE.purchaseAdd(new PaddingData(purchase, isInAppBilling()));
            RequestFailException requestFailException = (RequestFailException) exception;
            new LogEventRequest("assumed_as_vip", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", Integer.valueOf(requestFailException.getCode())))).post();
            if (isInAppBilling() && (billingAgent = this.billingAgent) != null) {
                billingAgent.consumeAsync(purchase.getPurchaseToken(), null);
            }
            MyBillingAgentListener myBillingAgentListener3 = this.myListener;
            if (myBillingAgentListener3 != null) {
                myBillingAgentListener3.myPurchaseSuccess(purchase, false, resource.getStatus(), null);
            }
            Pair pair2 = TuplesKt.to("name", "failed");
            List<String> products2 = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_BUY_VERIFY, LogEventArgumentsKt.logEventBundleOf(pair2, TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products2, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("code", Integer.valueOf(requestFailException.getCode())))).post();
            return;
        }
        LogUtils.e("unknown exception");
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInAppBilling() {
        MyBillingAgentListener myBillingAgentListener = this.myListener;
        return Intrinsics.areEqual("inapp", myBillingAgentListener != null ? myBillingAgentListener.myGetProductType() : null);
    }

    @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
    public void onPurchaseSuccess(List<Purchase> purchases, boolean restore) {
        if (INSTANCE.isEmptyList(purchases)) {
            boolean z = false;
            if (restore) {
                new LogEventRequest(PurchaseLogEvent.PURCHASE_RESTORE, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("name", "empty"))).post();
                MyBillingAgentListener myBillingAgentListener = this.myListener;
                if (myBillingAgentListener != null && myBillingAgentListener.myRestoreEmpty()) {
                    z = true;
                }
                if (!z) {
                    ToastUtils.showLong(R.string.text_retore_empty);
                    return;
                }
                return;
            }
            MyBillingAgentListener myBillingAgentListener2 = this.myListener;
            if (myBillingAgentListener2 != null) {
                myBillingAgentListener2.myPurchaseSuccess(null, false, Status.SUCCESS, null);
                return;
            }
            return;
        }
        if (restore) {
            Intrinsics.checkNotNull(purchases);
            for (Purchase purchase : purchases) {
                Pair pair = TuplesKt.to("name", "succeed");
                List<String> products = purchase.getProducts();
                Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                new LogEventRequest(PurchaseLogEvent.PURCHASE_RESTORE, LogEventArgumentsKt.logEventBundleOf(pair, TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)))).post();
                if (isInAppBilling()) {
                    myVerifyOrder(purchase);
                } else {
                    myRestoreOrder(purchase);
                }
            }
            return;
        }
        Intrinsics.checkNotNull(purchases);
        Iterator<Purchase> it = purchases.iterator();
        while (it.hasNext()) {
            myVerifyOrder(it.next());
        }
    }

    @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
    public void onPurchaseError(int errorCode, String message, boolean restore) {
        int i;
        if (isInAppBilling() && errorCode == 7 && (i = this.tryNum) > 0) {
            this.tryNum = i - 1;
            restore$default(this, null, 1, null);
        } else {
            MyBillingAgentListener myBillingAgentListener = this.myListener;
            if (myBillingAgentListener != null) {
                myBillingAgentListener.myPurchaseError(errorCode, message, restore);
            }
        }
    }

    @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
    public void onBillingSetupFinished(boolean success, BillingResult billingResult, List<ProductDetails> productList) {
        MyBillingAgentListener myBillingAgentListener = this.myListener;
        if (myBillingAgentListener != null) {
            myBillingAgentListener.myBillingSetupFinished(success, billingResult, productList);
        }
    }

    @Override // com.glority.billing.play.BillingAgent.BillingAgentListener
    public void onConsumeResponse(BillingResult billingResult, String purchaseToken) {
        int i;
        if ((billingResult == null || billingResult.getResponseCode() != 0) && (i = this.tryNum) > 0) {
            this.tryNum = i - 1;
            BillingAgent billingAgent = this.billingAgent;
            if (billingAgent != null) {
                Intrinsics.checkNotNull(purchaseToken);
                billingAgent.consumeAsync(purchaseToken, null);
                return;
            }
            return;
        }
        MyBillingAgentListener myBillingAgentListener = this.myListener;
        if (myBillingAgentListener != null) {
            myBillingAgentListener.myConsumerResponse(billingResult, purchaseToken);
        }
    }

    /* compiled from: MyBillingAgent.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J6\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016¨\u0006\u001f"}, d2 = {"Lcom/glority/billing/agent/MyBillingAgent$MyBillingAgentListener;", "", "myPurchaseSuccess", "", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "restore", "", "status", "Lcom/glority/network/model/Status;", "appData", "", "myRestoreOrderSuccess", "restorePolicy", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;", "myPurchaseError", "errorCode", "", LogEventArguments.ARG_MESSAGE, "myBillingSetupFinished", "success", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetailsList", "", "Lcom/android/billingclient/api/ProductDetails;", "myConsumerResponse", "purchaseToken", "myShowProgress", "myGetProductType", "myRestoreEmpty", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface MyBillingAgentListener {
        void myBillingSetupFinished(boolean success, BillingResult billingResult, List<ProductDetails> skuDetailsList);

        void myConsumerResponse(BillingResult billingResult, String purchaseToken);

        String myGetProductType();

        void myPurchaseError(int errorCode, String message, boolean restore);

        void myPurchaseSuccess(Purchase purchase, boolean restore, Status status, String appData);

        boolean myRestoreEmpty();

        void myRestoreOrderSuccess(Purchase purchase, boolean restore, Status status, String appData, RestorePolicy restorePolicy);

        void myShowProgress();

        /* compiled from: MyBillingAgent.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
            public static void myPurchaseSuccess(MyBillingAgentListener myBillingAgentListener, Purchase purchase, boolean z, Status status, String str) {
                Intrinsics.checkNotNullParameter(status, "status");
                LogUtils.d("myPurchaseSuccess");
            }

            public static /* synthetic */ void myRestoreOrderSuccess$default(MyBillingAgentListener myBillingAgentListener, Purchase purchase, boolean z, Status status, String str, RestorePolicy restorePolicy, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: myRestoreOrderSuccess");
                }
                if ((i & 16) != 0) {
                    restorePolicy = RestorePolicy.Default;
                }
                myBillingAgentListener.myRestoreOrderSuccess(purchase, z, status, str, restorePolicy);
            }

            public static void myRestoreOrderSuccess(MyBillingAgentListener myBillingAgentListener, Purchase purchase, boolean z, Status status, String str, RestorePolicy restorePolicy) {
                Intrinsics.checkNotNullParameter(status, "status");
                Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
                LogUtils.d("myRestoreOrderSuccess");
            }

            public static void myPurchaseError(MyBillingAgentListener myBillingAgentListener, int i, String str, boolean z) {
                LogUtils.d("myPurchaseError");
            }

            public static void myBillingSetupFinished(MyBillingAgentListener myBillingAgentListener, boolean z, BillingResult billingResult, List<ProductDetails> list) {
                LogUtils.d("myBillingSetupFinished");
            }

            public static void myConsumerResponse(MyBillingAgentListener myBillingAgentListener, BillingResult billingResult, String str) {
                LogUtils.d("myConsumerResponse");
            }

            public static void myShowProgress(MyBillingAgentListener myBillingAgentListener) {
                LogUtils.d("myShowProgress");
            }

            public static String myGetProductType(MyBillingAgentListener myBillingAgentListener) {
                return "subs";
            }

            public static boolean myRestoreEmpty(MyBillingAgentListener myBillingAgentListener) {
                LogUtils.d("myVerifyFailed");
                return false;
            }
        }
    }

    /* compiled from: MyBillingAgent.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007Ja\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2O\u0010\u0010\u001aK\u0012*\u0012(\u0018\u00010\u0016j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0011H\u0007J_\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2O\u0010\u0010\u001aK\u0012*\u0012(\u0018\u00010\u0016j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0011J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/glority/billing/agent/MyBillingAgent$Companion;", "", "<init>", "()V", "ADJUST_PURCHASE_EVENT", "", "mFirebaseAppInstanceId", "mFirebaseSessionId", "isEmptyList", "", "list", "", "hasSubscribed", "", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function2;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", "error", "Ljava/lang/Exception;", "hasActiveSubscribed", "setFirebaseAppInstanceId", "firebaseAppInstanceId", "setFirebaseSessionId", "firebaseSessionId", "getFirebaseAppInstanceId", "getFirebaseSessionId", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean isEmptyList(List<?> list) {
            return list == null || list.isEmpty();
        }

        @JvmStatic
        public final void hasSubscribed(Context context, Function2<? super Exception, ? super Boolean, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MyBillingAgent$Companion$hasSubscribed$1(new BillingSync(context), "subs", callback, null), 3, null);
        }

        public final void hasActiveSubscribed(Context context, Function2<? super Exception, ? super Boolean, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MyBillingAgent$Companion$hasActiveSubscribed$1(new BillingSync(context), "subs", callback, null), 3, null);
        }

        @JvmStatic
        public final void setFirebaseAppInstanceId(String firebaseAppInstanceId) {
            Intrinsics.checkNotNullParameter(firebaseAppInstanceId, "firebaseAppInstanceId");
            MyBillingAgent.mFirebaseAppInstanceId = firebaseAppInstanceId;
        }

        @JvmStatic
        public final void setFirebaseSessionId(String firebaseSessionId) {
            Intrinsics.checkNotNullParameter(firebaseSessionId, "firebaseSessionId");
            MyBillingAgent.mFirebaseSessionId = firebaseSessionId;
        }

        @JvmStatic
        public final String getFirebaseAppInstanceId() {
            return MyBillingAgent.mFirebaseAppInstanceId;
        }

        @JvmStatic
        public final String getFirebaseSessionId() {
            return MyBillingAgent.mFirebaseSessionId;
        }
    }
}
