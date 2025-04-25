package com.glority.billing.utils;

import com.android.billingclient.api.Purchase;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.android.core.route.utils.PersistDataWriteRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import com.glority.billing.PurchaseLogEvent;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.network.exception.APIException;
import com.glority.network.exception.RequestFailException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: PaymentUtils.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/glority/billing/utils/PaymentUtils;", "", "<init>", "()V", "paddingPurchases", "", "Lcom/glority/billing/utils/PaddingData;", "getPaddingPurchases", "()Ljava/util/List;", "setPaddingPurchases", "(Ljava/util/List;)V", "cleanPaddingData", "", "isPaddingVip", "", "haveExpertCount", "purchaseAdd", "paddingData", "(Lcom/glority/billing/utils/PaddingData;)Ljava/lang/Boolean;", "paddingPersistWrite", "purchaseRemove", "synRestore", FirebaseAnalytics.Event.PURCHASE, "Lcom/android/billingclient/api/Purchase;", "synRestoreErrorDeal", "exception", "", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class PaymentUtils {
    public static final PaymentUtils INSTANCE = new PaymentUtils();
    private static List<PaddingData> paddingPurchases = new ArrayList();

    private PaymentUtils() {
    }

    public final List<PaddingData> getPaddingPurchases() {
        return paddingPurchases;
    }

    public final void setPaddingPurchases(List<PaddingData> list) {
        paddingPurchases = list;
    }

    public final void cleanPaddingData() {
        new PersistDataWriteRequest(CorePersistKey.BILLING_PADDING, "").post();
        paddingPurchases = null;
    }

    public final boolean isPaddingVip() {
        List<PaddingData> list = paddingPurchases;
        if (list == null) {
            return false;
        }
        Intrinsics.checkNotNull(list);
        Iterator<PaddingData> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().isInApp()) {
                return true;
            }
        }
        return false;
    }

    public final boolean haveExpertCount() {
        List<PaddingData> list = paddingPurchases;
        if (list == null) {
            return false;
        }
        Intrinsics.checkNotNull(list);
        Iterator<PaddingData> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().isInApp()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized Boolean purchaseAdd(PaddingData paddingData) {
        Intrinsics.checkNotNullParameter(paddingData, "paddingData");
        if (paddingPurchases == null) {
            paddingPurchases = new ArrayList();
        }
        List<PaddingData> list = paddingPurchases;
        if (list != null && list.size() == 0) {
            List<PaddingData> list2 = paddingPurchases;
            if (list2 != null) {
                list2.add(paddingData);
            }
            paddingPersistWrite();
        } else {
            List<PaddingData> list3 = paddingPurchases;
            Intrinsics.checkNotNull(list3);
            Iterator<PaddingData> it = list3.iterator();
            while (it.hasNext()) {
                List<String> products = it.next().getPurchase().getProducts();
                Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                String joinToString$default = CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null);
                List<String> products2 = paddingData.getPurchase().getProducts();
                Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
                if (Intrinsics.areEqual(joinToString$default, CollectionsKt.joinToString$default(products2, ",", null, null, 0, null, null, 62, null))) {
                    return false;
                }
            }
            List<PaddingData> list4 = paddingPurchases;
            if (list4 != null) {
                list4.add(paddingData);
            }
            paddingPersistWrite();
        }
        return true;
    }

    private final void paddingPersistWrite() {
        new PersistDataWriteRequest(CorePersistKey.BILLING_PADDING, new Gson().toJson(paddingPurchases)).post();
    }

    public final synchronized Boolean purchaseRemove(PaddingData paddingData) {
        Intrinsics.checkNotNullParameter(paddingData, "paddingData");
        List<PaddingData> list = paddingPurchases;
        if (list != null && (list == null || list.size() != 0)) {
            List<PaddingData> list2 = paddingPurchases;
            Intrinsics.checkNotNull(list2);
            for (PaddingData paddingData2 : list2) {
                List<String> products = paddingData2.getPurchase().getProducts();
                Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                String joinToString$default = CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null);
                List<String> products2 = paddingData.getPurchase().getProducts();
                Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
                if (Intrinsics.areEqual(joinToString$default, CollectionsKt.joinToString$default(products2, ",", null, null, 0, null, null, 62, null))) {
                    List<PaddingData> list3 = paddingPurchases;
                    if (list3 != null) {
                        list3.remove(paddingData2);
                    }
                    paddingPersistWrite();
                    new LogEventRequest("revert_from_assumed_vip_succeed", null, 2, null).post();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void synRestore(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        try {
            List<String> products = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_PENDING, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("name", "start"))).post();
        } catch (Exception e) {
            new SendErrorEventRequest("synRestore", e.toString()).post();
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new PaymentUtils$synRestore$1(purchase, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synRestoreErrorDeal(Throwable exception, Purchase purchase) {
        if (exception instanceof APIException) {
            APIException aPIException = (APIException) exception;
            int code = aPIException.getCode();
            if (code == ErrorCodes.SUCCESS.getValue() || code == ErrorCodes.MIS_MATCHED_USER.getValue() || code == ErrorCodes.VERIFY_FAIL.getValue()) {
                purchaseRemove(new PaddingData(purchase, false, 2, null));
            }
            new LogEventRequest("revert_from_assumed_vip_failed", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", Integer.valueOf(aPIException.getCode())))).post();
            List<String> products = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_PENDING, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("name", "failed"), TuplesKt.to("code", Integer.valueOf(aPIException.getCode())))).post();
            return;
        }
        if (exception instanceof RequestFailException) {
            RequestFailException requestFailException = (RequestFailException) exception;
            new LogEventRequest("revert_from_assumed_vip_failed", LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("type", Integer.valueOf(requestFailException.getCode())))).post();
            List<String> products2 = purchase.getProducts();
            Intrinsics.checkNotNullExpressionValue(products2, "getProducts(...)");
            new LogEventRequest(PurchaseLogEvent.PURCHASE_PENDING, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products2, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("name", "failed"), TuplesKt.to("code", Integer.valueOf(requestFailException.getCode())))).post();
        }
    }
}
