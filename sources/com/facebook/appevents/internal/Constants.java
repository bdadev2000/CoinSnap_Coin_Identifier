package com.facebook.appevents.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Constants {

    @NotNull
    public static final String AA_TIME_SPENT_EVENT_NAME = "fb_aa_time_spent_on_view";

    @NotNull
    public static final String AA_TIME_SPENT_SCREEN_PARAMETER_NAME = "fb_aa_time_spent_view_name";

    @NotNull
    public static final String EVENT_NAME_EVENT_KEY = "_eventName";

    @NotNull
    public static final String EVENT_NAME_MD5_EVENT_KEY = "_eventName_md5";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_AVAILABILITY = "fb_product_availability";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_BRAND = "fb_product_brand";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_CONDITION = "fb_product_condition";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_DESCRIPTION = "fb_product_description";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_GTIN = "fb_product_gtin";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_IMAGE_LINK = "fb_product_image_link";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_ITEM_ID = "fb_product_item_id";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_LINK = "fb_product_link";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_MPN = "fb_product_mpn";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_PRICE_AMOUNT = "fb_product_price_amount";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_PRICE_CURRENCY = "fb_product_price_currency";

    @NotNull
    public static final String EVENT_PARAM_PRODUCT_TITLE = "fb_product_title";

    @NotNull
    public static final String IAP_FREE_TRIAL_PERIOD = "fb_free_trial_period";

    @NotNull
    public static final String IAP_INTRO_PRICE_AMOUNT_MICROS = "fb_intro_price_amount_micros";

    @NotNull
    public static final String IAP_INTRO_PRICE_CYCLES = "fb_intro_price_cycles";

    @NotNull
    public static final String IAP_PACKAGE_NAME = "fb_iap_package_name";

    @NotNull
    public static final String IAP_PRODUCT_DESCRIPTION = "fb_iap_product_description";

    @NotNull
    public static final String IAP_PRODUCT_ID = "fb_iap_product_id";

    @NotNull
    public static final String IAP_PRODUCT_TITLE = "fb_iap_product_title";

    @NotNull
    public static final String IAP_PRODUCT_TYPE = "fb_iap_product_type";

    @NotNull
    public static final String IAP_PURCHASE_TIME = "fb_iap_purchase_time";

    @NotNull
    public static final String IAP_PURCHASE_TOKEN = "fb_iap_purchase_token";

    @NotNull
    public static final String IAP_SUBSCRIPTION_AUTORENEWING = "fb_iap_subs_auto_renewing";

    @NotNull
    public static final String IAP_SUBSCRIPTION_PERIOD = "fb_iap_subs_period";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String LOG_TIME_APP_EVENT_KEY = "_logTime";

    private Constants() {
    }

    public static final int getDefaultAppEventsSessionTimeoutInSeconds() {
        return 60;
    }
}
