package w5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum q {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");


    /* renamed from: b, reason: collision with root package name */
    public final String f26858b;

    q(String str) {
        this.f26858b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static q[] valuesCustom() {
        return (q[]) Arrays.copyOf(values(), 17);
    }
}
