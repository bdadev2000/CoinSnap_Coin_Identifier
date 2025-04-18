package com.facebook.appevents.integrity;

import b1.f0;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashSet;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes.dex */
public final class ProtectedModeManager$defaultStandardParameterNames$2 extends r implements a {
    public static final ProtectedModeManager$defaultStandardParameterNames$2 INSTANCE = new ProtectedModeManager$defaultStandardParameterNames$2();

    public ProtectedModeManager$defaultStandardParameterNames$2() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final HashSet<String> invoke() {
        return f0.q("_currency", AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, "fb_contents", "fb_country", AppEventsConstants.EVENT_PARAM_CURRENCY, "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", AppEventsConstants.EVENT_PARAM_NUM_ITEMS, AppEventsConstants.EVENT_PARAM_ORDER_ID, "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", RemoteConfigConstants.RequestFieldKey.APP_VERSION, Constants.EVENT_NAME_EVENT_KEY, Constants.EVENT_NAME_MD5_EVENT_KEY, "_implicitlyLogged", "_inBackground", "_isTimedEvent", Constants.LOG_TIME_APP_EVENT_KEY, "_session_id", "_ui", "_valueToUpdate", com.facebook.appevents.codeless.internal.Constants.IS_CODELESS_EVENT_KEY, "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", AppEventsConstants.EVENT_PARAM_PACKAGE_FP, AppEventsConstants.EVENT_PARAM_APP_CERT_HASH, "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", AppLovinEventParameters.IN_APP_PURCHASE_DATA, AppEventsConstants.EVENT_PARAM_AD_TYPE, AppEventsConstants.EVENT_PARAM_CONTENT, AppEventsConstants.EVENT_PARAM_CONTENT_ID, AppEventsConstants.EVENT_PARAM_DESCRIPTION, AppEventsConstants.EVENT_PARAM_LEVEL, AppEventsConstants.EVENT_PARAM_MAX_RATING_VALUE, AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE, AppEventsConstants.EVENT_PARAM_REGISTRATION_METHOD, AppEventsConstants.EVENT_PARAM_SUCCESS, "pm", "_audiencePropertyIds", "cs_maca");
    }
}
