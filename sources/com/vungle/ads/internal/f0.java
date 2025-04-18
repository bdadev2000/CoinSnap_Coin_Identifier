package com.vungle.ads.internal;

import android.net.Uri;
import bh.a2;
import bh.d2;
import bh.j2;
import bh.m2;
import bh.o3;
import bh.p2;
import bh.s2;
import bh.t2;
import bh.u1;
import bh.x1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public final class f0 {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final f0 INSTANCE = new f0();
    public static final String TAG = "ConfigManager";
    private static t2 config;
    private static String configExt;
    private static u1 endpoints;
    private static List<o3> placements;

    private f0() {
    }

    public final boolean adLoadOptimizationEnabled() {
        a2 isAdDownloadOptEnabled;
        t2 t2Var = config;
        if (t2Var == null || (isAdDownloadOptEnabled = t2Var.isAdDownloadOptEnabled()) == null) {
            return false;
        }
        return isAdDownloadOptEnabled.getEnabled();
    }

    public final String getAdsEndpoint() {
        u1 u1Var = endpoints;
        if (u1Var != null) {
            return u1Var.getAdsEndpoint();
        }
        return null;
    }

    public final int getCleverCacheDiskPercentage() {
        bh.l0 cleverCache;
        Integer diskPercentage;
        t2 t2Var = config;
        if (t2Var == null || (cleverCache = t2Var.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        bh.l0 cleverCache;
        Long diskSize;
        t2 t2Var = config;
        if (t2Var == null || (cleverCache = t2Var.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long longValue = diskSize.longValue();
        long j3 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        return longValue * j3 * j3;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        u1 u1Var = endpoints;
        if (u1Var != null) {
            return u1Var.getErrorLogsEndpoint();
        }
        return null;
    }

    public final String getGDPRButtonAccept() {
        x1 gdpr;
        t2 t2Var = config;
        if (t2Var == null || (gdpr = t2Var.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        x1 gdpr;
        t2 t2Var = config;
        if (t2Var == null || (gdpr = t2Var.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        x1 gdpr;
        t2 t2Var = config;
        if (t2Var == null || (gdpr = t2Var.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        x1 gdpr;
        String consentMessageVersion;
        t2 t2Var = config;
        return (t2Var == null || (gdpr = t2Var.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        x1 gdpr;
        t2 t2Var = config;
        if (t2Var == null || (gdpr = t2Var.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        x1 gdpr;
        t2 t2Var = config;
        if (t2Var == null || (gdpr = t2Var.getGdpr()) == null) {
            return false;
        }
        return gdpr.isCountryDataProtected();
    }

    public final int getLogLevel() {
        d2 logMetricsSettings;
        t2 t2Var = config;
        if (t2Var != null && (logMetricsSettings = t2Var.getLogMetricsSettings()) != null) {
            return logMetricsSettings.getErrorLogLevel();
        }
        return com.vungle.ads.n.ERROR_LOG_LEVEL_ERROR.getLevel();
    }

    public final boolean getMetricsEnabled() {
        d2 logMetricsSettings;
        t2 t2Var = config;
        if (t2Var == null || (logMetricsSettings = t2Var.getLogMetricsSettings()) == null) {
            return false;
        }
        return logMetricsSettings.getMetricsEnabled();
    }

    public final String getMetricsEndpoint() {
        u1 u1Var = endpoints;
        if (u1Var != null) {
            return u1Var.getMetricsEndpoint();
        }
        return null;
    }

    public final String getMraidEndpoint() {
        u1 u1Var = endpoints;
        if (u1Var != null) {
            return u1Var.getMraidEndpoint();
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

    public final o3 getPlacement(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        List<o3> list = placements;
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
            if (Intrinsics.areEqual(((o3) next).getReferenceId(), id2)) {
                obj = next;
                break;
            }
        }
        return (o3) obj;
    }

    public final String getRiEndpoint() {
        u1 u1Var = endpoints;
        if (u1Var != null) {
            return u1Var.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        m2 session;
        t2 t2Var = config;
        return ((t2Var == null || (session = t2Var.getSession()) == null) ? DEFAULT_SESSION_TIMEOUT_SECONDS : session.getTimeout()) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        t2 t2Var = config;
        return ((t2Var == null || (signalSessionTimeout = t2Var.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue()) * 1000;
    }

    public final boolean heartbeatEnabled() {
        p2 template;
        t2 t2Var = config;
        if (t2Var == null || (template = t2Var.getTemplate()) == null) {
            return false;
        }
        return template.getHeartbeatEnabled();
    }

    public final void initWithConfig(t2 config2) {
        Intrinsics.checkNotNullParameter(config2, "config");
        config = config2;
        endpoints = config2.getEndpoints();
        placements = config2.getPlacements();
    }

    public final boolean isCacheableAssetsRequired() {
        Boolean isCacheableAssetsRequired;
        t2 t2Var = config;
        if (t2Var == null || (isCacheableAssetsRequired = t2Var.isCacheableAssetsRequired()) == null) {
            return false;
        }
        return isCacheableAssetsRequired.booleanValue();
    }

    public final boolean isCleverCacheEnabled() {
        bh.l0 cleverCache;
        Boolean enabled;
        t2 t2Var = config;
        if (t2Var == null || (cleverCache = t2Var.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        j2 isReportIncentivizedEnabled;
        t2 t2Var = config;
        if (t2Var == null || (isReportIncentivizedEnabled = t2Var.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return isReportIncentivizedEnabled.getEnabled();
    }

    public final boolean omEnabled() {
        s2 viewability;
        t2 t2Var = config;
        if (t2Var == null || (viewability = t2Var.getViewability()) == null) {
            return false;
        }
        return viewability.getOm();
    }

    public final List<o3> placements() {
        return placements;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        t2 t2Var = config;
        if (t2Var == null || (rtaDebugging = t2Var.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        t2 t2Var = config;
        if (t2Var == null || (disableAdId = t2Var.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        t2 t2Var = config;
        if (t2Var == null || (signalsDisabled = t2Var.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateConfigExtension(String str) {
        configExt = str;
    }

    public final boolean validateEndpoints() {
        String str;
        boolean z10;
        boolean z11;
        String str2;
        boolean z12;
        String str3;
        boolean z13;
        String str4;
        boolean z14;
        u1 u1Var = endpoints;
        String str5 = null;
        if (u1Var != null) {
            str = u1Var.getAdsEndpoint();
        } else {
            str = null;
        }
        boolean z15 = false;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(122, "The ads endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            z11 = false;
        } else {
            z11 = true;
        }
        u1 u1Var2 = endpoints;
        if (u1Var2 != null) {
            str2 = u1Var2.getRiEndpoint();
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(123, "The ri endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        u1 u1Var3 = endpoints;
        if (u1Var3 != null) {
            str3 = u1Var3.getMraidEndpoint();
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(130, "The mraid endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            z11 = false;
        }
        u1 u1Var4 = endpoints;
        if (u1Var4 != null) {
            str4 = u1Var4.getMetricsEndpoint();
        } else {
            str4 = null;
        }
        if (str4 != null && str4.length() != 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(125, "The metrics endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        u1 u1Var5 = endpoints;
        if (u1Var5 != null) {
            str5 = u1Var5.getErrorLogsEndpoint();
        }
        if (str5 == null || str5.length() == 0) {
            z15 = true;
        }
        if (z15) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z11;
    }
}
