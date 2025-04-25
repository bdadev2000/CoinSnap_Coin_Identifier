package com.glority.android.picturexx.payment.skumanager;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.payment.skumanager.internal.ActualSkuManager;
import com.glority.android.picturexx.payment.skumanager.internal.SkuTestUtil;
import com.glority.android.picturexx.payment.skumanager.internal.VirtualSkuMapper;
import com.glority.android.picturexx.skumanager.SkuConfig;
import com.glority.base.abtest.CoinAbTestUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SkuManager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\u0015\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u0017J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0005R\u001c\u0010\u0004\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006%"}, d2 = {"Lcom/glority/android/picturexx/payment/skumanager/SkuManager;", "", "<init>", "()V", "skuForCloseRetain", "", "getSkuForCloseRetain", "()Ljava/lang/String;", "setSkuForCloseRetain", "(Ljava/lang/String;)V", "getAllSkus", "", "getSubsSkus", "getConsumeSkus", "isTrialYearPacket", "", LogEventArguments.ARG_SKU, "isYearPacket", "getActualSku", "unconfirmedSku", "getFinalSku", "getSkuCycle", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "getSkuCycleByActualSku", "actualSku", "getSkuCycleValue", "getSkuCycleValueByActualSku", "isTrial", "(Ljava/lang/String;)Ljava/lang/Boolean;", "isTrialByActualSku", "getTrialDays", "getTrialDaysByActualSku", "isSubsSku", "isSubsSkuByActualSku", "isConsumeSku", "isConsumeSkuByActualSku", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class SkuManager {
    public static final SkuManager INSTANCE = new SkuManager();
    private static String skuForCloseRetain = "";

    private SkuManager() {
    }

    public final void setSkuForCloseRetain(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        skuForCloseRetain = str;
    }

    public final String getSkuForCloseRetain() {
        return getFinalSku(skuForCloseRetain);
    }

    public final List<String> getAllSkus() {
        return ActualSkuManager.INSTANCE.getAllActualSkus();
    }

    public final List<String> getSubsSkus() {
        return ActualSkuManager.INSTANCE.getSubsSkus();
    }

    public final List<String> getConsumeSkus() {
        return ActualSkuManager.INSTANCE.getConsumeSkus();
    }

    public final boolean isTrialYearPacket(String sku) {
        Integer skuCycle;
        Intrinsics.checkNotNullParameter(sku, "sku");
        Boolean isTrial = isTrial(sku);
        return isTrial != null && isTrial.booleanValue() && (skuCycle = getSkuCycle(sku)) != null && skuCycle.intValue() == 2;
    }

    public final boolean isYearPacket(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Integer skuCycle = getSkuCycle(sku);
        return skuCycle != null && skuCycle.intValue() == 2;
    }

    private final String getActualSku(String unconfirmedSku) {
        String mapSku = VirtualSkuMapper.INSTANCE.mapSku(unconfirmedSku);
        switch (mapSku.hashCode()) {
            case -2079489389:
                if (!mapSku.equals("sub_week")) {
                    return mapSku;
                }
                break;
            case -1172360855:
                if (!mapSku.equals("sub_yearly")) {
                    return mapSku;
                }
                break;
            case -440402857:
                if (!mapSku.equals("sub_week_3dt")) {
                    return mapSku;
                }
                break;
            case -48589887:
                if (!mapSku.equals("sub_month")) {
                    return mapSku;
                }
                break;
            case 1259489730:
                if (!mapSku.equals(SkuConfig.SUB_YEARLY_1MT)) {
                    return mapSku;
                }
                break;
            case 1259495217:
                if (!mapSku.equals("sub_yearly_7dt")) {
                    return mapSku;
                }
                break;
            default:
                return mapSku;
        }
        if (CoinAbTestUtils.INSTANCE.enablePriceIncreaseExperiment()) {
            int hashCode = mapSku.hashCode();
            return hashCode != -1172360855 ? hashCode != 1259489730 ? (hashCode == 1259495217 && mapSku.equals("sub_yearly_7dt")) ? "sub_year_7dt_2" : mapSku : !mapSku.equals(SkuConfig.SUB_YEARLY_1MT) ? mapSku : SkuConfig.SUB_YEARLY_1MT_2 : !mapSku.equals("sub_yearly") ? mapSku : "sub_yearly_2";
        }
        if (!CoinAbTestUtils.INSTANCE.enablePriceIncreaseExperimentUSA()) {
            return mapSku;
        }
        switch (mapSku.hashCode()) {
            case -2079489389:
                return !mapSku.equals("sub_week") ? mapSku : "sub_week_2";
            case -1172360855:
                return !mapSku.equals("sub_yearly") ? mapSku : "sub_yearly_2";
            case -440402857:
                return !mapSku.equals("sub_week_3dt") ? mapSku : "sub_week_3dt_2";
            case -48589887:
                return !mapSku.equals("sub_month") ? mapSku : "sub_month_2";
            case 1259489730:
                return !mapSku.equals(SkuConfig.SUB_YEARLY_1MT) ? mapSku : SkuConfig.SUB_YEARLY_1MT_2;
            case 1259495217:
                return !mapSku.equals("sub_yearly_7dt") ? mapSku : "sub_year_7dt_2";
            default:
                return mapSku;
        }
    }

    public final String getFinalSku(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return SkuTestUtil.INSTANCE.getTestSku(getActualSku(sku));
    }

    public final Integer getSkuCycle(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        return ActualSkuManager.INSTANCE.getSkuCycle(getFinalSku(unconfirmedSku));
    }

    public final Integer getSkuCycleByActualSku(String actualSku) {
        Intrinsics.checkNotNullParameter(actualSku, "actualSku");
        return ActualSkuManager.INSTANCE.getSkuCycle(actualSku);
    }

    public final Integer getSkuCycleValue(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        return ActualSkuManager.INSTANCE.getSkuCycleValue(getFinalSku(unconfirmedSku));
    }

    public final Integer getSkuCycleValueByActualSku(String actualSku) {
        Intrinsics.checkNotNullParameter(actualSku, "actualSku");
        return ActualSkuManager.INSTANCE.getSkuCycleValue(actualSku);
    }

    public final Boolean isTrial(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        return ActualSkuManager.INSTANCE.isTrial(getFinalSku(unconfirmedSku));
    }

    public final Boolean isTrialByActualSku(String actualSku) {
        Intrinsics.checkNotNullParameter(actualSku, "actualSku");
        return ActualSkuManager.INSTANCE.isTrial(actualSku);
    }

    public final Integer getTrialDays(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        return ActualSkuManager.INSTANCE.getTrialDays(getFinalSku(unconfirmedSku));
    }

    public final Integer getTrialDaysByActualSku(String actualSku) {
        Intrinsics.checkNotNullParameter(actualSku, "actualSku");
        return ActualSkuManager.INSTANCE.getTrialDays(actualSku);
    }

    public final boolean isSubsSku(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        return ActualSkuManager.INSTANCE.isSubsSku(getFinalSku(unconfirmedSku));
    }

    public final boolean isSubsSkuByActualSku(String actualSku) {
        Intrinsics.checkNotNullParameter(actualSku, "actualSku");
        return ActualSkuManager.INSTANCE.isSubsSku(actualSku);
    }

    public final boolean isConsumeSku(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        return ActualSkuManager.INSTANCE.isConsumeSku(getFinalSku(unconfirmedSku));
    }

    public final boolean isConsumeSkuByActualSku(String actualSku) {
        Intrinsics.checkNotNullParameter(actualSku, "actualSku");
        return ActualSkuManager.INSTANCE.isConsumeSku(actualSku);
    }
}
