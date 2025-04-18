package w5;

import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Arrays;

/* loaded from: classes3.dex */
public enum p {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    /* JADX INFO: Fake field, exist only in values array */
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


    /* renamed from: b, reason: collision with root package name */
    public final String f26840b;

    p(String str) {
        this.f26840b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        return (p[]) Arrays.copyOf(values(), 17);
    }
}
