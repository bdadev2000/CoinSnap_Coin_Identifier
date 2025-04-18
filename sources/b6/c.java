package b6;

import com.applovin.sdk.AppLovinEventParameters;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c f2299c = new c(0);

    /* renamed from: d, reason: collision with root package name */
    public static final c f2300d = new c(1);

    /* renamed from: f, reason: collision with root package name */
    public static final c f2301f = new c(2);

    /* renamed from: g, reason: collision with root package name */
    public static final c f2302g = new c(3);

    /* renamed from: h, reason: collision with root package name */
    public static final c f2303h = new c(4);

    /* renamed from: i, reason: collision with root package name */
    public static final c f2304i = new c(5);

    /* renamed from: j, reason: collision with root package name */
    public static final c f2305j = new c(6);

    /* renamed from: k, reason: collision with root package name */
    public static final c f2306k = new c(7);

    /* renamed from: l, reason: collision with root package name */
    public static final c f2307l = new c(8);

    /* renamed from: m, reason: collision with root package name */
    public static final c f2308m = new c(9);

    /* renamed from: n, reason: collision with root package name */
    public static final c f2309n = new c(10);

    /* renamed from: o, reason: collision with root package name */
    public static final c f2310o = new c(11);

    /* renamed from: p, reason: collision with root package name */
    public static final c f2311p = new c(12);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f2312b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        switch (this.f2312b) {
            case 1:
                return "Must be called on a background thread, was called on " + kb.c.b() + '.';
            case 2:
                return "Must be called on a blocking thread, was called on " + kb.c.b() + '.';
            default:
                return "Must not be called on a main thread, was called on " + kb.c.b() + '.';
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2312b) {
            case 0:
                return SetsKt.hashSetOf("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_search_string", "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", AppLovinEventParameters.IN_APP_PURCHASE_DATA, "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
            case 1:
                return invoke();
            case 2:
                return invoke();
            case 3:
                return invoke();
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}
