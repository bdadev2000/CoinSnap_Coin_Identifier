package com.glority.android.core.route.guide;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.abtest.AbtestGetStringVariableRequest;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.utils.stability.LogUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BillingSkuDealUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/core/route/guide/BillingSkuDealUtils;", "", "()V", "DEFAULT_SKU", "", "SKU_ERR", BillingSkuDealUtils.SKU_LIST, "skuJson", "skuObj", "Lcom/google/gson/JsonObject;", "changePriceUpAB1", LogEventArguments.ARG_SKU, "changePriceUpAB2", "enableEnglishCountryChangeSKU", "", "getSku", "key", "getSkuAbValue", "getVirtualSkuIsEffective", "virtualSku", "isPicturethis", "skuReplace", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingSkuDealUtils {
    private static final String DEFAULT_SKU = "us_sub_vip_yearly_19_7dt";
    public static final BillingSkuDealUtils INSTANCE = new BillingSkuDealUtils();
    private static final String SKU_ERR = "sku_err";
    private static final String SKU_LIST = "SKU_LIST";
    private static final String skuJson;
    private static JsonObject skuObj;

    private BillingSkuDealUtils() {
    }

    static {
        JsonObject jsonObject;
        String config = AppContext.INSTANCE.getConfig(SKU_LIST);
        skuJson = config;
        try {
            jsonObject = new JsonParser().parse(config).getAsJsonObject();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            jsonObject = null;
        }
        skuObj = jsonObject;
    }

    public final String getSku(String key) {
        JsonElement jsonElement;
        String asString;
        String replace$default;
        JsonElement jsonElement2;
        String asString2;
        if (key == null) {
            return "";
        }
        if (!getVirtualSkuIsEffective(key)) {
            if (key == null) {
                return "";
            }
            return skuReplace(key);
        }
        JsonObject jsonObject = skuObj;
        String str = null;
        if (jsonObject != null && (jsonElement2 = jsonObject.get(key)) != null && (asString2 = jsonElement2.getAsString()) != null) {
            str = StringsKt.replace$default(asString2, "\"", "", false, 4, (Object) null);
        }
        if (str != null) {
            return str;
        }
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage") || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "dev")) {
            throw new Exception("virtual sku not config!!!!!!!");
        }
        new SendErrorEventRequest(SKU_ERR, "virtual sku not config!!!!!!!").post();
        JsonObject jsonObject2 = skuObj;
        return (jsonObject2 == null || (jsonElement = jsonObject2.get(SkuEnum.YEAR_FREE_TRIAL_SKU.getValue())) == null || (asString = jsonElement.getAsString()) == null || (replace$default = StringsKt.replace$default(asString, "\"", "", false, 4, (Object) null)) == null) ? DEFAULT_SKU : replace$default;
    }

    private final boolean getVirtualSkuIsEffective(String virtualSku) {
        SkuEnum[] values = SkuEnum.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            SkuEnum skuEnum = values[i];
            i++;
            if (Intrinsics.areEqual(virtualSku, skuEnum.getValue())) {
                return true;
            }
        }
        return false;
    }

    private final boolean enableEnglishCountryChangeSKU() {
        return Intrinsics.areEqual("110464", new AbtestGetStringVariableRequest("onetime_sku_ab").toResult());
    }

    private final String getSkuAbValue() {
        return new AbtestGetStringVariableRequest("onetime_sku_ab").toResult();
    }

    private final boolean isPicturethis() {
        return Intrinsics.areEqual(AppContext.INSTANCE.getConfig("APP_NAME"), "PictureThis");
    }

    private final String skuReplace(String sku) {
        String skuAbValue;
        if (!isPicturethis() || (skuAbValue = getSkuAbValue()) == null) {
            return sku;
        }
        if (Intrinsics.areEqual(skuAbValue, "110529")) {
            return INSTANCE.changePriceUpAB1(sku);
        }
        return Intrinsics.areEqual(skuAbValue, "110530") ? INSTANCE.changePriceUpAB2(sku) : sku;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String changePriceUpAB1(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -2093183360: goto L66;
                case -2053579942: goto L5a;
                case -1616395404: goto L4e;
                case -1147251603: goto L45;
                case -756062440: goto L3c;
                case -467768361: goto L33;
                case 215197858: goto L27;
                case 539697533: goto L1b;
                case 797771998: goto L12;
                case 797771999: goto L9;
                default: goto L7;
            }
        L7:
            goto L71
        L9:
            java.lang.String r0 = "trail_yearly_03"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L24
            goto L71
        L12:
            java.lang.String r0 = "trail_yearly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L30
            goto L71
        L1b:
            java.lang.String r0 = "us_sub_vip_yearly_39.99_7dt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L24
            goto L71
        L24:
            java.lang.String r2 = "us_sub_vip_yearly_3999de"
            return r2
        L27:
            java.lang.String r0 = "us_sub_vip_yearly_29_7dt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L30
            goto L71
        L30:
            java.lang.String r2 = "us_sub_vip_yearly_3299de"
            return r2
        L33:
            java.lang.String r0 = "yearly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            goto L71
        L3c:
            java.lang.String r0 = "us_sub_vip_weekly_2.99"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6f
            goto L71
        L45:
            java.lang.String r0 = "us_sub_vip_monthly_5.99"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
            goto L71
        L4e:
            java.lang.String r0 = "monthly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
            goto L71
        L57:
            java.lang.String r2 = "us_sub_vip_monthly_6.99de"
            return r2
        L5a:
            java.lang.String r0 = "us_sub_vip_yearly_29"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            goto L71
        L63:
            java.lang.String r2 = "us_sub_vip_yearly_3299de_notrail"
            return r2
        L66:
            java.lang.String r0 = "weekly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6f
            goto L71
        L6f:
            java.lang.String r2 = "us_sub_vip_weekly_3.99de"
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.core.route.guide.BillingSkuDealUtils.changePriceUpAB1(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String changePriceUpAB2(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -2093183360: goto L66;
                case -2053579942: goto L5a;
                case -1616395404: goto L4e;
                case -1147251603: goto L45;
                case -756062440: goto L3c;
                case -467768361: goto L33;
                case 215197858: goto L27;
                case 539697533: goto L1b;
                case 797771998: goto L12;
                case 797771999: goto L9;
                default: goto L7;
            }
        L7:
            goto L71
        L9:
            java.lang.String r0 = "trail_yearly_03"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L24
            goto L71
        L12:
            java.lang.String r0 = "trail_yearly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L30
            goto L71
        L1b:
            java.lang.String r0 = "us_sub_vip_yearly_39.99_7dt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L24
            goto L71
        L24:
            java.lang.String r2 = "us_sub_vip_yearly_3999test"
            return r2
        L27:
            java.lang.String r0 = "us_sub_vip_yearly_29_7dt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L30
            goto L71
        L30:
            java.lang.String r2 = "us_sub_vip_yearly_2999_7dt_test"
            return r2
        L33:
            java.lang.String r0 = "yearly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            goto L71
        L3c:
            java.lang.String r0 = "us_sub_vip_weekly_2.99"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6f
            goto L71
        L45:
            java.lang.String r0 = "us_sub_vip_monthly_5.99"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
            goto L71
        L4e:
            java.lang.String r0 = "monthly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L57
            goto L71
        L57:
            java.lang.String r2 = "us_sub_vip_monthly_599test"
            return r2
        L5a:
            java.lang.String r0 = "us_sub_vip_yearly_29"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L63
            goto L71
        L63:
            java.lang.String r2 = "us_sub_vip_yearly_2999test"
            return r2
        L66:
            java.lang.String r0 = "weekly_02"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6f
            goto L71
        L6f:
            java.lang.String r2 = "us_sub_vip_weekly_299test"
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.core.route.guide.BillingSkuDealUtils.changePriceUpAB2(java.lang.String):java.lang.String");
    }
}
