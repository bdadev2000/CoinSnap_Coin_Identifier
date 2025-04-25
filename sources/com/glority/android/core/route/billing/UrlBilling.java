package com.glority.android.core.route.billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlBilling.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006¨\u0006+"}, d2 = {"Lcom/glority/android/core/route/billing/UrlBilling;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_GET_ACTUAL_SKU", "getURL_GET_ACTUAL_SKU", "URL_GET_BOOKS", "getURL_GET_BOOKS", "URL_GET_DEVICE_ID", "getURL_GET_DEVICE_ID", "URL_GET_DEVICE_REGION", "getURL_GET_DEVICE_REGION", "URL_GET_FINAL_SKU", "getURL_GET_FINAL_SKU", "URL_GET_IN_APP_SKU_LIST", "getURL_GET_IN_APP_SKU_LIST", "URL_GET_SKU_CYCLE", "getURL_GET_SKU_CYCLE", "URL_GET_SKU_CYCLE_VALUE", "getURL_GET_SKU_CYCLE_VALUE", "URL_GET_SKU_IS_SUB", "getURL_GET_SKU_IS_SUB", "URL_GET_SKU_IS_TRIAL", "getURL_GET_SKU_IS_TRIAL", "URL_GET_SKU_TRIAL_DAY", "getURL_GET_SKU_TRIAL_DAY", "URL_GET_SUBSCRIBE_SKU_LIST", "getURL_GET_SUBSCRIBE_SKU_LIST", "URL_GET_TOKEN", "getURL_GET_TOKEN", "URL_GET_USER_ID", "getURL_GET_USER_ID", "URL_QUERY_HAS_ACTIVE_SUBSCRIBED", "getURL_QUERY_HAS_ACTIVE_SUBSCRIBED", "URL_QUERY_HAS_SUBSCRIBED", "getURL_QUERY_HAS_SUBSCRIBED", "URL_QUERY_HISTORY_SUBSCRIBED", "getURL_QUERY_HISTORY_SUBSCRIBED", "URL_QUERY_HISTORY_SUBSCRIBED_SKU", "getURL_QUERY_HISTORY_SUBSCRIBED_SKU", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlBilling {
    public static final UrlBilling INSTANCE = new UrlBilling();
    private static final String MODULE;
    private static final String URL_GET_ACTUAL_SKU;
    private static final String URL_GET_BOOKS;
    private static final String URL_GET_DEVICE_ID;
    private static final String URL_GET_DEVICE_REGION;
    private static final String URL_GET_FINAL_SKU;
    private static final String URL_GET_IN_APP_SKU_LIST;
    private static final String URL_GET_SKU_CYCLE;
    private static final String URL_GET_SKU_CYCLE_VALUE;
    private static final String URL_GET_SKU_IS_SUB;
    private static final String URL_GET_SKU_IS_TRIAL;
    private static final String URL_GET_SKU_TRIAL_DAY;
    private static final String URL_GET_SUBSCRIBE_SKU_LIST;
    private static final String URL_GET_TOKEN;
    private static final String URL_GET_USER_ID;
    private static final String URL_QUERY_HAS_ACTIVE_SUBSCRIBED;
    private static final String URL_QUERY_HAS_SUBSCRIBED;
    private static final String URL_QUERY_HISTORY_SUBSCRIBED;
    private static final String URL_QUERY_HISTORY_SUBSCRIBED_SKU;

    private UrlBilling() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "billing");
        MODULE = stringPlus;
        URL_GET_TOKEN = Intrinsics.stringPlus(stringPlus, "/getToken");
        URL_GET_DEVICE_REGION = Intrinsics.stringPlus(stringPlus, "/getDeviceRegion");
        URL_GET_DEVICE_ID = Intrinsics.stringPlus(stringPlus, "/getDeviceId");
        URL_GET_USER_ID = Intrinsics.stringPlus(stringPlus, "/getUserId");
        URL_QUERY_HAS_SUBSCRIBED = Intrinsics.stringPlus(stringPlus, "/queryHasSubscribed");
        URL_QUERY_HAS_ACTIVE_SUBSCRIBED = Intrinsics.stringPlus(stringPlus, "/queryHasActiveSubscribed");
        URL_GET_SUBSCRIBE_SKU_LIST = Intrinsics.stringPlus(stringPlus, "/getSubscribeSkuList");
        URL_GET_IN_APP_SKU_LIST = Intrinsics.stringPlus(stringPlus, "/getInAppSkuList");
        URL_GET_SKU_IS_TRIAL = Intrinsics.stringPlus(stringPlus, "/getSkuIsTrial");
        URL_GET_SKU_CYCLE = Intrinsics.stringPlus(stringPlus, "/getSkuCycle");
        URL_GET_SKU_IS_SUB = Intrinsics.stringPlus(stringPlus, "/getSkuIsSub");
        URL_GET_SKU_TRIAL_DAY = Intrinsics.stringPlus(stringPlus, "/getSkuTrialDay");
        URL_GET_SKU_CYCLE_VALUE = Intrinsics.stringPlus(stringPlus, "/getSkuCycleValue");
        URL_GET_ACTUAL_SKU = Intrinsics.stringPlus(stringPlus, "/getActualSku");
        URL_GET_FINAL_SKU = Intrinsics.stringPlus(stringPlus, "/getFinalSku");
        URL_GET_BOOKS = Intrinsics.stringPlus(stringPlus, "/getBooks");
        URL_QUERY_HISTORY_SUBSCRIBED = Intrinsics.stringPlus(stringPlus, "/queryHistorySubscribed");
        URL_QUERY_HISTORY_SUBSCRIBED_SKU = Intrinsics.stringPlus(stringPlus, "/urlQueryHistorySubscribedSku");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_GET_TOKEN() {
        return URL_GET_TOKEN;
    }

    public final String getURL_GET_DEVICE_REGION() {
        return URL_GET_DEVICE_REGION;
    }

    public final String getURL_GET_DEVICE_ID() {
        return URL_GET_DEVICE_ID;
    }

    public final String getURL_GET_USER_ID() {
        return URL_GET_USER_ID;
    }

    public final String getURL_QUERY_HAS_SUBSCRIBED() {
        return URL_QUERY_HAS_SUBSCRIBED;
    }

    public final String getURL_QUERY_HAS_ACTIVE_SUBSCRIBED() {
        return URL_QUERY_HAS_ACTIVE_SUBSCRIBED;
    }

    public final String getURL_GET_SUBSCRIBE_SKU_LIST() {
        return URL_GET_SUBSCRIBE_SKU_LIST;
    }

    public final String getURL_GET_IN_APP_SKU_LIST() {
        return URL_GET_IN_APP_SKU_LIST;
    }

    public final String getURL_GET_SKU_IS_TRIAL() {
        return URL_GET_SKU_IS_TRIAL;
    }

    public final String getURL_GET_SKU_CYCLE() {
        return URL_GET_SKU_CYCLE;
    }

    public final String getURL_GET_SKU_IS_SUB() {
        return URL_GET_SKU_IS_SUB;
    }

    public final String getURL_GET_SKU_TRIAL_DAY() {
        return URL_GET_SKU_TRIAL_DAY;
    }

    public final String getURL_GET_SKU_CYCLE_VALUE() {
        return URL_GET_SKU_CYCLE_VALUE;
    }

    public final String getURL_GET_ACTUAL_SKU() {
        return URL_GET_ACTUAL_SKU;
    }

    public final String getURL_GET_FINAL_SKU() {
        return URL_GET_FINAL_SKU;
    }

    public final String getURL_GET_BOOKS() {
        return URL_GET_BOOKS;
    }

    public final String getURL_QUERY_HISTORY_SUBSCRIBED() {
        return URL_QUERY_HISTORY_SUBSCRIBED;
    }

    public final String getURL_QUERY_HISTORY_SUBSCRIBED_SKU() {
        return URL_QUERY_HISTORY_SUBSCRIBED_SKU;
    }
}
