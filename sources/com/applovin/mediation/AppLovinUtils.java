package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.j;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";
    public static final String ERROR_MSG_CHILD_USER = "MobileAds.getRequestConfiguration() indicates the user is a child. AppLovin SDK 13.0.0 or higher does not support child users.";

    @VisibleForTesting
    public static final String ERROR_MSG_REASON_PREFIX = "AppLovin SDK returned a load failure callback with reason: ";
    private static final String TRUE = "true";

    /* loaded from: classes2.dex */
    public static class ServerParameterKeys {
        public static final String MULTIPLE_ADS_PER_AD_UNIT = "enable_multiple_ads_per_unit";
        public static final String SDK_KEY = "sdkKey";
        public static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    @Nullable
    public static AppLovinAdSize appLovinAdSizeFromAdMobAdSize(@NonNull Context context, @NonNull AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.LEADERBOARD;
        arrayList.add(adSize3);
        AdSize adSize4 = AdSize.MEDIUM_RECTANGLE;
        arrayList.add(adSize4);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSize2.equals(findClosestSize)) {
            return AppLovinAdSize.BANNER;
        }
        if (adSize4.equals(findClosestSize)) {
            return AppLovinAdSize.MREC;
        }
        if (adSize3.equals(findClosestSize)) {
            return AppLovinAdSize.LEADER;
        }
        return null;
    }

    public static AdError getAdError(int i2) {
        String i3 = d.i("AppLovin error code ", i2);
        if (i2 == -8) {
            i3 = "INVALID_AD_TOKEN";
        } else if (i2 == -7) {
            i3 = "INVALID_ZONE";
        } else if (i2 != -6) {
            switch (i2) {
                case -1009:
                    i3 = "NO_NETWORK";
                    break;
                case -1001:
                    i3 = "FETCH_AD_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INVALID_URL /* -900 */:
                    i3 = "INVALID_URL";
                    break;
                case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                    i3 = "INVALID_RESPONSE";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                    i3 = "INCENTIVIZED_USER_CLOSED_VIDEO";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                    i3 = "INCENTIVIZED_SERVER_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                    i3 = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                    i3 = "INCENTIVIZED_NO_AD_PRELOADED";
                    break;
                case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                    i3 = "SDK_DISABLED";
                    break;
                case -1:
                    i3 = "UNSPECIFIED_ERROR";
                    break;
                case 204:
                    i3 = "NO_FILL";
                    break;
                default:
                    switch (i2) {
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                            i3 = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                            i3 = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                            i3 = "UNABLE_TO_PRECACHE_RESOURCES";
                            break;
                    }
            }
        } else {
            i3 = "UNABLE_TO_RENDER_AD";
        }
        return new AdError(i2, j.b(ERROR_MSG_REASON_PREFIX, i3), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
    }

    public static AdError getChildUserError() {
        return new AdError(112, ERROR_MSG_CHILD_USER, AppLovinMediationAdapter.ERROR_DOMAIN);
    }

    public static boolean isChildUser() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        return requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1;
    }

    public static boolean isMultiAdsEnabled(Bundle bundle) {
        if (bundle.containsKey(ServerParameterKeys.MULTIPLE_ADS_PER_AD_UNIT)) {
            return bundle.getString(ServerParameterKeys.MULTIPLE_ADS_PER_AD_UNIT).equals("true");
        }
        return false;
    }

    public static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey("zone_id") ? bundle.getString("zone_id") : "";
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
    }
}
