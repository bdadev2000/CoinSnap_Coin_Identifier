package com.vungle.ads.internal;

import android.net.Uri;
import c7.B0;
import c7.C0658v0;
import c7.C0664y0;
import c7.E0;
import c7.K0;
import c7.N0;
import c7.Q0;
import c7.T0;
import c7.U0;
import c7.p1;
import com.vungle.ads.C2137s;
import com.vungle.ads.EnumC2128n;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class F {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final F INSTANCE = new F();
    public static final String TAG = "ConfigManager";
    private static U0 config;
    private static String configExt;
    private static C0658v0 endpoints;
    private static List<p1> placements;

    private F() {
    }

    public final boolean adLoadOptimizationEnabled() {
        B0 isAdDownloadOptEnabled;
        U0 u02 = config;
        if (u02 != null && (isAdDownloadOptEnabled = u02.isAdDownloadOptEnabled()) != null) {
            return isAdDownloadOptEnabled.getEnabled();
        }
        return false;
    }

    public final String getAdsEndpoint() {
        C0658v0 c0658v0 = endpoints;
        if (c0658v0 != null) {
            return c0658v0.getAdsEndpoint();
        }
        return null;
    }

    public final int getCleverCacheDiskPercentage() {
        c7.L cleverCache;
        Integer diskPercentage;
        U0 u02 = config;
        if (u02 != null && (cleverCache = u02.getCleverCache()) != null && (diskPercentage = cleverCache.getDiskPercentage()) != null) {
            return diskPercentage.intValue();
        }
        return 3;
    }

    public final long getCleverCacheDiskSize() {
        c7.L cleverCache;
        Long diskSize;
        U0 u02 = config;
        if (u02 != null && (cleverCache = u02.getCleverCache()) != null && (diskSize = cleverCache.getDiskSize()) != null) {
            long j7 = 1024;
            return diskSize.longValue() * j7 * j7;
        }
        return 1048576000L;
    }

    public final String getConfigExtension() {
        String str = configExt;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getErrorLoggingEndpoint() {
        C0658v0 c0658v0 = endpoints;
        if (c0658v0 != null) {
            return c0658v0.getErrorLogsEndpoint();
        }
        return null;
    }

    public final String getGDPRButtonAccept() {
        C0664y0 gdpr;
        U0 u02 = config;
        if (u02 != null && (gdpr = u02.getGdpr()) != null) {
            return gdpr.getButtonAccept();
        }
        return null;
    }

    public final String getGDPRButtonDeny() {
        C0664y0 gdpr;
        U0 u02 = config;
        if (u02 != null && (gdpr = u02.getGdpr()) != null) {
            return gdpr.getButtonDeny();
        }
        return null;
    }

    public final String getGDPRConsentMessage() {
        C0664y0 gdpr;
        U0 u02 = config;
        if (u02 != null && (gdpr = u02.getGdpr()) != null) {
            return gdpr.getConsentMessage();
        }
        return null;
    }

    public final String getGDPRConsentMessageVersion() {
        C0664y0 gdpr;
        String consentMessageVersion;
        U0 u02 = config;
        if (u02 == null || (gdpr = u02.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) {
            return "";
        }
        return consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        C0664y0 gdpr;
        U0 u02 = config;
        if (u02 != null && (gdpr = u02.getGdpr()) != null) {
            return gdpr.getConsentTitle();
        }
        return null;
    }

    public final boolean getGDPRIsCountryDataProtected() {
        C0664y0 gdpr;
        U0 u02 = config;
        if (u02 != null && (gdpr = u02.getGdpr()) != null) {
            return gdpr.isCountryDataProtected();
        }
        return false;
    }

    public final int getLogLevel() {
        E0 logMetricsSettings;
        U0 u02 = config;
        if (u02 != null && (logMetricsSettings = u02.getLogMetricsSettings()) != null) {
            return logMetricsSettings.getErrorLogLevel();
        }
        return EnumC2128n.ERROR_LOG_LEVEL_ERROR.getLevel();
    }

    public final boolean getMetricsEnabled() {
        E0 logMetricsSettings;
        U0 u02 = config;
        if (u02 != null && (logMetricsSettings = u02.getLogMetricsSettings()) != null) {
            return logMetricsSettings.getMetricsEnabled();
        }
        return false;
    }

    public final String getMetricsEndpoint() {
        C0658v0 c0658v0 = endpoints;
        if (c0658v0 != null) {
            return c0658v0.getMetricsEndpoint();
        }
        return null;
    }

    public final String getMraidEndpoint() {
        C0658v0 c0658v0 = endpoints;
        if (c0658v0 != null) {
            return c0658v0.getMraidEndpoint();
        }
        return null;
    }

    public final String getMraidJsVersion() {
        String mraidEndpoint = getMraidEndpoint();
        if (mraidEndpoint != null) {
            String str = "mraid_" + Uri.parse(mraidEndpoint).getLastPathSegment();
            if (str != null) {
                return str;
            }
        }
        return "mraid_1";
    }

    public final p1 getPlacement(String str) {
        G7.j.e(str, "id");
        List<p1> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (G7.j.a(((p1) next).getReferenceId(), str)) {
                obj = next;
                break;
            }
        }
        return (p1) obj;
    }

    public final String getRiEndpoint() {
        C0658v0 c0658v0 = endpoints;
        if (c0658v0 != null) {
            return c0658v0.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        int i9;
        N0 session;
        U0 u02 = config;
        if (u02 != null && (session = u02.getSession()) != null) {
            i9 = session.getTimeout();
        } else {
            i9 = DEFAULT_SESSION_TIMEOUT_SECONDS;
        }
        return i9 * 1000;
    }

    public final long getSignalsSessionTimeout() {
        int i9;
        Integer signalSessionTimeout;
        U0 u02 = config;
        if (u02 != null && (signalSessionTimeout = u02.getSignalSessionTimeout()) != null) {
            i9 = signalSessionTimeout.intValue();
        } else {
            i9 = DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS;
        }
        return i9 * 1000;
    }

    public final boolean heartbeatEnabled() {
        Q0 template;
        U0 u02 = config;
        if (u02 != null && (template = u02.getTemplate()) != null) {
            return template.getHeartbeatEnabled();
        }
        return false;
    }

    public final void initWithConfig(U0 u02) {
        G7.j.e(u02, "config");
        config = u02;
        endpoints = u02.getEndpoints();
        placements = u02.getPlacements();
    }

    public final boolean isCacheableAssetsRequired() {
        Boolean isCacheableAssetsRequired;
        U0 u02 = config;
        if (u02 != null && (isCacheableAssetsRequired = u02.isCacheableAssetsRequired()) != null) {
            return isCacheableAssetsRequired.booleanValue();
        }
        return false;
    }

    public final boolean isCleverCacheEnabled() {
        c7.L cleverCache;
        Boolean enabled;
        U0 u02 = config;
        if (u02 != null && (cleverCache = u02.getCleverCache()) != null && (enabled = cleverCache.getEnabled()) != null) {
            return enabled.booleanValue();
        }
        return false;
    }

    public final boolean isReportIncentivizedEnabled() {
        K0 isReportIncentivizedEnabled;
        U0 u02 = config;
        if (u02 != null && (isReportIncentivizedEnabled = u02.isReportIncentivizedEnabled()) != null) {
            return isReportIncentivizedEnabled.getEnabled();
        }
        return false;
    }

    public final boolean omEnabled() {
        T0 viewability;
        U0 u02 = config;
        if (u02 != null && (viewability = u02.getViewability()) != null) {
            return viewability.getOm();
        }
        return false;
    }

    public final List<p1> placements() {
        return placements;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        U0 u02 = config;
        if (u02 != null && (rtaDebugging = u02.getRtaDebugging()) != null) {
            return rtaDebugging.booleanValue();
        }
        return false;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        U0 u02 = config;
        if (u02 != null && (disableAdId = u02.getDisableAdId()) != null) {
            return disableAdId.booleanValue();
        }
        return true;
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        U0 u02 = config;
        if (u02 != null && (signalsDisabled = u02.getSignalsDisabled()) != null) {
            return signalsDisabled.booleanValue();
        }
        return false;
    }

    public final void updateConfigExtension(String str) {
        configExt = str;
    }

    public final boolean validateEndpoints() {
        String str;
        boolean z8;
        String str2;
        String str3;
        String str4;
        C0658v0 c0658v0 = endpoints;
        String str5 = null;
        if (c0658v0 != null) {
            str = c0658v0.getAdsEndpoint();
        } else {
            str = null;
        }
        boolean z9 = false;
        if (str == null || str.length() == 0) {
            C2137s.INSTANCE.logError$vungle_ads_release(122, "The ads endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            z8 = false;
        } else {
            z8 = true;
        }
        C0658v0 c0658v02 = endpoints;
        if (c0658v02 != null) {
            str2 = c0658v02.getRiEndpoint();
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            C2137s.INSTANCE.logError$vungle_ads_release(123, "The ri endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        C0658v0 c0658v03 = endpoints;
        if (c0658v03 != null) {
            str3 = c0658v03.getMraidEndpoint();
        } else {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            C2137s.INSTANCE.logError$vungle_ads_release(130, "The mraid endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        } else {
            z9 = z8;
        }
        C0658v0 c0658v04 = endpoints;
        if (c0658v04 != null) {
            str4 = c0658v04.getMetricsEndpoint();
        } else {
            str4 = null;
        }
        if (str4 == null || str4.length() == 0) {
            C2137s.INSTANCE.logError$vungle_ads_release(125, "The metrics endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        C0658v0 c0658v05 = endpoints;
        if (c0658v05 != null) {
            str5 = c0658v05.getErrorLogsEndpoint();
        }
        if (str5 == null || str5.length() == 0) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z9;
    }
}
