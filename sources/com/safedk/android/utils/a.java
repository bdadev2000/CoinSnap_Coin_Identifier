package com.safedk.android.utils;

import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30017a = "ConfigurationHelper";

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f30018b = new HashSet(Arrays.asList("CONTENTCAT", "PLAYBACKMETHODS", "STOREID", "STOREURL", "CACHEBUSTING", "TIMESTAMP", "ADCATEGORIES", "ADCOUNT", "ADTYPE", "BLOCKEDADCATEGORIES", "BREAKMAXADLENGTH", "BREAKMAXADS", "BREAKMAXDURATION", "BREAKMINADLENGTH", "BREAKPOSITION", "CONTENTPLAYHEAD", "MEDIAPLAYHEAD", "PLACEMENTTYPE", "TRANSACTIONID", "UNIVERSALADID", "CLIENTUA", "DEVICEIP", "DEVICEUA", "IFA", "IFATYPE", "LATLONG", "SERVERSIDE", "SERVERUA", "APPBUNDLE", "DOMAIN", "PAGEURL", "APIFRAMEWORKS", "CLICKTYPE", "EXTENSIONS", "MEDIAMIME", "OMIDPARTNER", "PLAYERCAPABILITIES", "VASTVERSIONS", "VERIFICATIONVENDORS", "ADPLAYHEAD", "ADSERVINGID", "ASvastMacroQueryParams.RI", "CONTENTID", "CONTENTURI", "INVENTORYSTATE", "PLAYERSIZE", "PLAYERSTATE", "PODSEQUENCE", "CLICKPOS", "ERRORCODE", "REASON", "GDPRCONSENT", "LIMITADTRACKING", "REGULATIONS"));

    public static boolean a(String str) {
        boolean z2 = false;
        com.safedk.android.analytics.brandsafety.creatives.a i2 = CreativeInfoManager.i(str);
        if (i2 == null) {
            Logger.d(f30017a, "cannot determine config item SUPPORTS_BANNER_IMPRESSION_TRACKING for sdk " + str);
        }
        if (i2 != null && i2.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING)) {
            z2 = true;
        }
        Logger.d(f30017a, "isBannerMonitoringSupported returned " + z2 + " for sdk " + str);
        return z2;
    }
}
