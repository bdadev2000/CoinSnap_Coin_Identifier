package com.glority.android.picturexx.payment.skumanager.internal;

import com.glority.android.app.BuildConfig;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.payment.skumanager.BillingSkuData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActualSkuManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0006J\u0012\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0002R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/glority/android/picturexx/payment/skumanager/internal/ActualSkuManager;", "", "<init>", "()V", "totalSkuList", "", "", "Lcom/glority/android/picturexx/payment/skumanager/BillingSkuData;", "getTotalSkuList", "()Ljava/util/Map;", "setTotalSkuList", "(Ljava/util/Map;)V", "getSkuCycle", "", "ActualSku", "(Ljava/lang/String;)Ljava/lang/Integer;", "getSkuCycleValue", "isTrial", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getTrialDays", "isSubsSku", "isConsumeSku", "getAllActualSkus", "", "getSubsSkus", "getConsumeSkus", "isActualSku", "unconfirmedSku", "checkSkuLegal", LogEventArguments.ARG_SKU, "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ActualSkuManager {
    public static final ActualSkuManager INSTANCE = new ActualSkuManager();
    private static Map<String, BillingSkuData> totalSkuList = MapsKt.emptyMap();

    private ActualSkuManager() {
    }

    public final Map<String, BillingSkuData> getTotalSkuList() {
        return totalSkuList;
    }

    public final void setTotalSkuList(Map<String, BillingSkuData> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        totalSkuList = map;
    }

    public final Integer getSkuCycle(String ActualSku) {
        Intrinsics.checkNotNullParameter(ActualSku, "ActualSku");
        checkSkuLegal(ActualSku);
        BillingSkuData billingSkuData = totalSkuList.get(ActualSku);
        if (billingSkuData != null) {
            return Integer.valueOf(billingSkuData.getSkuCycle());
        }
        return null;
    }

    public final Integer getSkuCycleValue(String ActualSku) {
        Intrinsics.checkNotNullParameter(ActualSku, "ActualSku");
        checkSkuLegal(ActualSku);
        BillingSkuData billingSkuData = totalSkuList.get(ActualSku);
        if (billingSkuData != null) {
            return Integer.valueOf(billingSkuData.getCycleValue());
        }
        return null;
    }

    public final Boolean isTrial(String ActualSku) {
        Intrinsics.checkNotNullParameter(ActualSku, "ActualSku");
        checkSkuLegal(ActualSku);
        BillingSkuData billingSkuData = totalSkuList.get(ActualSku);
        if (billingSkuData != null) {
            return Boolean.valueOf(billingSkuData.isTrial());
        }
        return null;
    }

    public final Integer getTrialDays(String ActualSku) {
        Intrinsics.checkNotNullParameter(ActualSku, "ActualSku");
        checkSkuLegal(ActualSku);
        BillingSkuData billingSkuData = totalSkuList.get(ActualSku);
        if (billingSkuData != null) {
            return Integer.valueOf(billingSkuData.getTrialDays());
        }
        return null;
    }

    public final boolean isSubsSku(String ActualSku) {
        String skuType;
        Intrinsics.checkNotNullParameter(ActualSku, "ActualSku");
        checkSkuLegal(ActualSku);
        BillingSkuData billingSkuData = totalSkuList.get(ActualSku);
        if (billingSkuData == null || (skuType = billingSkuData.getSkuType()) == null) {
            return false;
        }
        return Intrinsics.areEqual(skuType, "subs");
    }

    public final boolean isConsumeSku(String ActualSku) {
        String skuType;
        Intrinsics.checkNotNullParameter(ActualSku, "ActualSku");
        checkSkuLegal(ActualSku);
        BillingSkuData billingSkuData = totalSkuList.get(ActualSku);
        if (billingSkuData == null || (skuType = billingSkuData.getSkuType()) == null) {
            return false;
        }
        return Intrinsics.areEqual(skuType, "inapp");
    }

    public final List<String> getAllActualSkus() {
        return CollectionsKt.toList(totalSkuList.keySet());
    }

    public final List<String> getSubsSkus() {
        Map<String, BillingSkuData> map = totalSkuList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, BillingSkuData> entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue().getSkuType(), "subs")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.toList(linkedHashMap.keySet());
    }

    public final List<String> getConsumeSkus() {
        Map<String, BillingSkuData> map = totalSkuList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, BillingSkuData> entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue().getSkuType(), "inapp")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.toList(linkedHashMap.keySet());
    }

    public final boolean isActualSku(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        return totalSkuList.containsKey(unconfirmedSku);
    }

    private final boolean checkSkuLegal(String sku) {
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), BuildConfig.ENV)) {
            return true;
        }
        String str = sku;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("sku is null or empty");
        }
        if (getAllActualSkus().contains(sku)) {
            return true;
        }
        throw new IllegalArgumentException("sku<" + sku + "> is illegal, please check SkuConfig");
    }
}
