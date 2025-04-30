package y2;

import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* loaded from: classes.dex */
public enum k {
    VALUE_TO_SUM(AppMeasurementSdk.ConditionalUserProperty.VALUE),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE("content_type"),
    DESCRIPTION("description"),
    LEVEL(AppLovinEventTypes.USER_COMPLETED_LEVEL),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS("success"),
    ORDER_ID("order_id"),
    AD_TYPE("ad_type"),
    CURRENCY(AppLovinEventParameters.REVENUE_CURRENCY);

    public final String b;

    k(String str) {
        this.b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        return (k[]) Arrays.copyOf(values(), 17);
    }
}
