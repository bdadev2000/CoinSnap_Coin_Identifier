package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";
    public static final String ERROR_MSG_REASON_PREFIX = "AppLovin SDK returned a load failure callback with reason: ";
    private static final String TRUE = "true";

    /* loaded from: classes.dex */
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

    public static AdError getAdError(int i9) {
        String h6 = o.h(i9, "AppLovin error code ");
        if (i9 != -8) {
            if (i9 != -7) {
                if (i9 != -6) {
                    switch (i9) {
                        case -1009:
                            h6 = "NO_NETWORK";
                            break;
                        case -1001:
                            h6 = "FETCH_AD_TIMEOUT";
                            break;
                        case AppLovinErrorCodes.INVALID_URL /* -900 */:
                            h6 = "INVALID_URL";
                            break;
                        case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                            h6 = "INVALID_RESPONSE";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                            h6 = "INCENTIVIZED_USER_CLOSED_VIDEO";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                            h6 = "INCENTIVIZED_SERVER_TIMEOUT";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                            h6 = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                            break;
                        case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                            h6 = "INCENTIVIZED_NO_AD_PRELOADED";
                            break;
                        case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                            h6 = "SDK_DISABLED";
                            break;
                        case -1:
                            h6 = "UNSPECIFIED_ERROR";
                            break;
                        case 204:
                            h6 = "NO_FILL";
                            break;
                        default:
                            switch (i9) {
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                                    h6 = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                                    break;
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                                    h6 = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                                    break;
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                                    h6 = "UNABLE_TO_PRECACHE_RESOURCES";
                                    break;
                            }
                    }
                } else {
                    h6 = "UNABLE_TO_RENDER_AD";
                }
            } else {
                h6 = "INVALID_ZONE";
            }
        } else {
            h6 = "INVALID_AD_TOKEN";
        }
        return new AdError(i9, AbstractC2914a.d(ERROR_MSG_REASON_PREFIX, h6), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
    }

    public static boolean isMultiAdsEnabled(Bundle bundle) {
        if (bundle.containsKey(ServerParameterKeys.MULTIPLE_ADS_PER_AD_UNIT)) {
            return bundle.getString(ServerParameterKeys.MULTIPLE_ADS_PER_AD_UNIT).equals(TRUE);
        }
        return false;
    }

    public static String retrieveZoneId(Bundle bundle) {
        if (bundle.containsKey(ServerParameterKeys.ZONE_ID)) {
            return bundle.getString(ServerParameterKeys.ZONE_ID);
        }
        return "";
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        if (bundle != null && bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO)) {
            return true;
        }
        return false;
    }
}
