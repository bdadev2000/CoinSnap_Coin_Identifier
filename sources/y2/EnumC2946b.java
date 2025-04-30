package y2;

import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Arrays;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2946b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER(Constants.INSTALL_REFERRER),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA(AppLovinEventParameters.IN_APP_PURCHASE_DATA),
    URL_SCHEMES("url_schemes");

    public final String b;

    EnumC2946b(String str) {
        this.b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2946b[] valuesCustom() {
        return (EnumC2946b[]) Arrays.copyOf(values(), 17);
    }
}
