package com.glority.android.picturexx.skumanager;

import com.glority.android.picturexx.payment.skumanager.ASkuConfig;
import com.glority.android.picturexx.payment.skumanager.BillingSkuData;
import com.glority.android.picturexx.payment.skumanager.internal.ISkuTest;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SkuConfig.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR,\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0011j\b\u0012\u0004\u0012\u00020\u0010`\u000fX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/glority/android/picturexx/skumanager/SkuConfig;", "Lcom/glority/android/picturexx/payment/skumanager/ASkuConfig;", "<init>", "()V", "SUB_YEARLY_1MT", "", "SUB_YEARLY_1MT_2", "totalSkuList", "", "Lcom/glority/android/picturexx/payment/skumanager/BillingSkuData;", "getTotalSkuList", "()Ljava/util/Map;", "setTotalSkuList", "(Ljava/util/Map;)V", "skuTests", "Lkotlin/collections/ArrayList;", "Lcom/glority/android/picturexx/payment/skumanager/internal/ISkuTest;", "Ljava/util/ArrayList;", "getSkuTests", "()Ljava/util/ArrayList;", "setSkuTests", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "virtualSkuMap", "getVirtualSkuMap", "setVirtualSkuMap", "skuForCloseRetain", "getSkuForCloseRetain", "()Ljava/lang/String;", "setSkuForCloseRetain", "(Ljava/lang/String;)V", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SkuConfig extends ASkuConfig {
    public static final SkuConfig INSTANCE = new SkuConfig();
    public static final String SUB_YEARLY_1MT = "sub_yearly_1mt";
    public static final String SUB_YEARLY_1MT_2 = "sub_yearly_1mt_2";
    private static Map<String, BillingSkuData> totalSkuList = MapsKt.mapOf(TuplesKt.to("sub_yearly", new BillingSkuData("sub_yearly", false, 0, 2, "subs", 0, 32, null)), TuplesKt.to("sub_yearly_7dt", new BillingSkuData("sub_yearly_7dt", true, 7, 2, "subs", 0, 32, null)), TuplesKt.to("sub_yearly_7dt_2", new BillingSkuData("sub_yearly_7dt_2", true, 7, 2, "subs", 0, 32, null)), TuplesKt.to("sub_month", new BillingSkuData("sub_month", false, 0, 1, "subs", 0, 32, null)), TuplesKt.to("sub_month_pro", new BillingSkuData("sub_month_pro", false, 0, 1, "subs", 0, 32, null)), TuplesKt.to("sub_week", new BillingSkuData("sub_week", false, 0, 0, "subs", 0, 32, null)), TuplesKt.to("sub_week_3dt", new BillingSkuData("sub_week_3dt", true, 3, 0, "subs", 0, 32, null)), TuplesKt.to("sub_year_7dt_2", new BillingSkuData("sub_year_7dt_2", true, 7, 2, "subs", 0, 32, null)), TuplesKt.to("sub_yearly_2", new BillingSkuData("sub_yearly_2", false, 0, 2, "subs", 0, 32, null)), TuplesKt.to(SUB_YEARLY_1MT, new BillingSkuData(SUB_YEARLY_1MT, false, 30, 2, "subs", 0, 32, null)), TuplesKt.to(SUB_YEARLY_1MT_2, new BillingSkuData(SUB_YEARLY_1MT_2, false, 30, 2, "subs", 0, 32, null)), TuplesKt.to("sub_week_3dt_2", new BillingSkuData("sub_week_3dt_2", true, 3, 0, "subs", 0, 32, null)), TuplesKt.to("sub_week_2", new BillingSkuData("sub_week_2", false, 0, 0, "subs", 0, 32, null)), TuplesKt.to("sub_month_2", new BillingSkuData("sub_month_2", false, 0, 1, "subs", 0, 32, null)));
    private static ArrayList<ISkuTest> skuTests = new ArrayList<>();
    private static Map<String, String> virtualSkuMap = MapsKt.emptyMap();
    private static String skuForCloseRetain = "sub_yearly_7dt";
    public static final int $stable = 8;

    private SkuConfig() {
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public Map<String, BillingSkuData> getTotalSkuList() {
        return totalSkuList;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public void setTotalSkuList(Map<String, BillingSkuData> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        totalSkuList = map;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public ArrayList<ISkuTest> getSkuTests() {
        return skuTests;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public void setSkuTests(ArrayList<ISkuTest> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        skuTests = arrayList;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public Map<String, String> getVirtualSkuMap() {
        return virtualSkuMap;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public void setVirtualSkuMap(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        virtualSkuMap = map;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public String getSkuForCloseRetain() {
        return skuForCloseRetain;
    }

    @Override // com.glority.android.picturexx.payment.skumanager.ASkuConfig
    public void setSkuForCloseRetain(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        skuForCloseRetain = str;
    }
}
