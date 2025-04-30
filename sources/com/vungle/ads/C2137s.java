package com.vungle.ads;

import android.os.Build;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.vungle.ads.s */
/* loaded from: classes3.dex */
public final class C2137s {
    private static com.vungle.ads.internal.executor.l executor = null;
    private static final int maxBatchSize = 20;
    private static boolean metricsEnabled = false;
    private static boolean paused = false;
    private static final long refreshTimeMillis = 5000;
    private static com.vungle.ads.internal.signals.j signalManager;
    private static com.vungle.ads.internal.network.y vungleApiClient;
    public static final C2137s INSTANCE = new C2137s();
    private static final String TAG = C2137s.class.getSimpleName();
    private static final BlockingQueue<com.vungle.ads.internal.protos.d> errors = new LinkedBlockingQueue();
    private static final BlockingQueue<com.vungle.ads.internal.protos.k> metrics = new LinkedBlockingQueue();
    private static final BlockingQueue<com.vungle.ads.internal.protos.d> pendingErrors = new LinkedBlockingQueue();
    private static final BlockingQueue<com.vungle.ads.internal.protos.k> pendingMetrics = new LinkedBlockingQueue();
    private static int maxErrorLogLevel = Integer.MAX_VALUE;
    private static EnumC2128n logLevel = EnumC2128n.ERROR_LOG_LEVEL_ERROR;
    private static boolean refreshEnabled = true;

    private C2137s() {
    }

    public static /* synthetic */ void b(com.vungle.ads.internal.executor.l lVar) {
        m106init$lambda1(lVar);
    }

    public static /* synthetic */ void d() {
        m107init$lambda1$lambda0();
    }

    private final void flushErrors() {
        com.vungle.ads.internal.network.y yVar;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        String str = TAG;
        StringBuilder sb = new StringBuilder("Sending ");
        BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue = errors;
        sb.append(blockingQueue.size());
        sb.append(" errors");
        uVar.d(str, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (yVar = vungleApiClient) != null) {
            yVar.reportErrors(linkedBlockingQueue, new C2132p(linkedBlockingQueue));
        }
    }

    private final void flushMetrics() {
        com.vungle.ads.internal.network.y yVar;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        String str = TAG;
        StringBuilder sb = new StringBuilder("Sending ");
        BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue = metrics;
        sb.append(blockingQueue.size());
        sb.append(" metrics");
        uVar.d(str, sb.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (yVar = vungleApiClient) != null) {
            yVar.reportMetrics(linkedBlockingQueue, new C2134q(linkedBlockingQueue));
        }
    }

    private final com.vungle.ads.internal.protos.k genMetric(com.vungle.ads.internal.protos.n nVar, long j7, String str, String str2, String str3, String str4) {
        String uuid;
        com.vungle.ads.internal.protos.k osVersion = Sdk$SDKMetric.newBuilder().setType(nVar).setValue(j7).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setOs("Android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str5 = "";
        if (str == null) {
            str = "";
        }
        com.vungle.ads.internal.protos.k placementReferenceId = osVersion.setPlacementReferenceId(str);
        if (str2 == null) {
            str2 = "";
        }
        com.vungle.ads.internal.protos.k creativeId = placementReferenceId.setCreativeId(str2);
        if (str3 == null) {
            str3 = "";
        }
        com.vungle.ads.internal.protos.k eventId = creativeId.setEventId(str3);
        if (str4 == null) {
            str4 = "";
        }
        com.vungle.ads.internal.protos.k meta = eventId.setMeta(str4);
        com.vungle.ads.internal.signals.j jVar = signalManager;
        if (jVar != null && (uuid = jVar.getUuid()) != null) {
            str5 = uuid;
        }
        com.vungle.ads.internal.protos.k sessionId = meta.setSessionId(str5);
        G7.j.d(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
    }

    public static /* synthetic */ com.vungle.ads.internal.protos.k genMetric$default(C2137s c2137s, com.vungle.ads.internal.protos.n nVar, long j7, String str, String str2, String str3, String str4, int i9, Object obj) {
        long j9;
        String str5;
        String str6;
        String str7;
        if ((i9 & 2) != 0) {
            j9 = 0;
        } else {
            j9 = j7;
        }
        String str8 = null;
        if ((i9 & 4) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i9 & 8) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i9 & 16) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i9 & 32) == 0) {
            str8 = str4;
        }
        return c2137s.genMetric(nVar, j9, str5, str6, str7, str8);
    }

    private final com.vungle.ads.internal.protos.d genSDKError(com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4) {
        String uuid;
        com.vungle.ads.internal.protos.d at = Sdk$SDKError.newBuilder().setOs("Android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setReason(gVar).setMessage(str).setAt(System.currentTimeMillis());
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        com.vungle.ads.internal.protos.d placementReferenceId = at.setPlacementReferenceId(str2);
        if (str3 == null) {
            str3 = "";
        }
        com.vungle.ads.internal.protos.d creativeId = placementReferenceId.setCreativeId(str3);
        if (str4 == null) {
            str4 = "";
        }
        com.vungle.ads.internal.protos.d eventId = creativeId.setEventId(str4);
        com.vungle.ads.internal.signals.j jVar = signalManager;
        if (jVar != null && (uuid = jVar.getUuid()) != null) {
            str5 = uuid;
        }
        com.vungle.ads.internal.protos.d sessionId = eventId.setSessionId(str5);
        G7.j.d(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
    }

    public static /* synthetic */ com.vungle.ads.internal.protos.d genSDKError$default(C2137s c2137s, com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4, int i9, Object obj) {
        String str5;
        String str6;
        String str7;
        if ((i9 & 4) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i9 & 8) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i9 & 16) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        return c2137s.genSDKError(gVar, str, str5, str6, str7);
    }

    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSignalManager$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    /* renamed from: init$lambda-1 */
    public static final void m106init$lambda1(com.vungle.ads.internal.executor.l lVar) {
        G7.j.e(lVar, "$executor");
        lVar.execute(new C2.b(16));
    }

    /* renamed from: init$lambda-1$lambda-0 */
    public static final void m107init$lambda1$lambda0() {
        INSTANCE.report();
    }

    /* renamed from: logError$lambda-2 */
    public static final void m108logError$lambda2(com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4) {
        G7.j.e(gVar, "$reason");
        G7.j.e(str, "$message");
        INSTANCE.logErrorInSameThread(gVar, str, str2, str3, str4);
    }

    private final synchronized void logErrorInSameThread(com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4) {
        if (logLevel == EnumC2128n.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            com.vungle.ads.internal.protos.d genSDKError = genSDKError(gVar, str, str2, str3, str4);
            BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue = errors;
            blockingQueue.put(genSDKError);
            com.vungle.ads.internal.util.v.Companion.w(TAG, "Logging error: " + gVar + " with message: " + str);
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logError", e4);
        }
    }

    public static /* synthetic */ void logErrorInSameThread$default(C2137s c2137s, com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4, int i9, Object obj) {
        String str5;
        String str6;
        String str7;
        if ((i9 & 4) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i9 & 8) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i9 & 16) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        c2137s.logErrorInSameThread(gVar, str, str5, str6, str7);
    }

    /* renamed from: logMetric$lambda-3 */
    public static final void m109logMetric$lambda3(com.vungle.ads.internal.protos.n nVar, long j7, String str, String str2, String str3, String str4) {
        G7.j.e(nVar, "$metricType");
        INSTANCE.logMetricInSameThread(nVar, j7, str, str2, str3, str4);
    }

    private final synchronized void logMetricInSameThread(com.vungle.ads.internal.protos.n nVar, long j7, String str, String str2, String str3, String str4) {
        if (!metricsEnabled) {
            return;
        }
        try {
            com.vungle.ads.internal.protos.k genMetric = genMetric(nVar, j7, str, str2, str3, str4);
            BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue = metrics;
            blockingQueue.put(genMetric);
            com.vungle.ads.internal.util.v.Companion.d(TAG, "Logging Metric " + nVar + " with value " + j7 + " for placement " + str);
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logMetrics", e4);
        }
    }

    public static /* synthetic */ void logMetricInSameThread$default(C2137s c2137s, com.vungle.ads.internal.protos.n nVar, long j7, String str, String str2, String str3, String str4, int i9, Object obj) {
        long j9;
        String str5;
        String str6;
        String str7;
        if ((i9 & 2) != 0) {
            j9 = 0;
        } else {
            j9 = j7;
        }
        String str8 = null;
        if ((i9 & 4) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i9 & 8) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i9 & 16) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i9 & 32) == 0) {
            str8 = str4;
        }
        c2137s.logMetricInSameThread(nVar, j9, str5, str6, str7, str8);
    }

    private final synchronized void report() {
        try {
            if (paused) {
                return;
            }
            if (logLevel != EnumC2128n.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
                flushErrors();
            }
            if (metricsEnabled && metrics.size() > 0) {
                flushMetrics();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final BlockingQueue<com.vungle.ads.internal.protos.d> getErrors$vungle_ads_release() {
        return errors;
    }

    public final com.vungle.ads.internal.executor.l getExecutor$vungle_ads_release() {
        return executor;
    }

    public final BlockingQueue<com.vungle.ads.internal.protos.k> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final BlockingQueue<com.vungle.ads.internal.protos.d> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    public final BlockingQueue<com.vungle.ads.internal.protos.k> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    public final com.vungle.ads.internal.signals.j getSignalManager$vungle_ads_release() {
        return signalManager;
    }

    public final com.vungle.ads.internal.network.y getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final void init$vungle_ads_release(com.vungle.ads.internal.network.y yVar, com.vungle.ads.internal.executor.l lVar, int i9, boolean z8, com.vungle.ads.internal.signals.j jVar) {
        G7.j.e(yVar, "vungleApiClient");
        G7.j.e(lVar, "executor");
        G7.j.e(jVar, "signalManager");
        signalManager = jVar;
        executor = lVar;
        vungleApiClient = yVar;
        metricsEnabled = z8;
        try {
            BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue = pendingErrors;
            if (!blockingQueue.isEmpty()) {
                blockingQueue.drainTo(errors);
            }
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Failed to add pendingErrors to errors queue.", e4);
        }
        try {
            BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue2 = pendingMetrics;
            if (!blockingQueue2.isEmpty()) {
                blockingQueue2.drainTo(metrics);
            }
        } catch (Exception e9) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Failed to add pendingMetrics to metrics queue.", e9);
        }
        if (refreshEnabled) {
            Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new D3.b(lVar, 29), 0L, 5000L, TimeUnit.MILLISECONDS);
        }
        maxErrorLogLevel = i9;
        logLevel = EnumC2128n.Companion.fromValue(i9);
        if (i9 == EnumC2128n.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            com.vungle.ads.internal.util.v.Companion.enable(true);
        } else if (i9 == EnumC2128n.ERROR_LOG_LEVEL_ERROR.getLevel()) {
            com.vungle.ads.internal.util.v.Companion.enable(false);
        } else if (i9 == EnumC2128n.ERROR_LOG_LEVEL_OFF.getLevel()) {
            com.vungle.ads.internal.util.v.Companion.enable(false);
        }
        com.vungle.ads.internal.util.h.Companion.getInstance().addListener(new r());
    }

    public final synchronized void logError$vungle_ads_release(com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4) {
        com.vungle.ads.internal.executor.l lVar;
        G7.j.e(gVar, "reason");
        G7.j.e(str, "message");
        try {
            lVar = executor;
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logError " + gVar + ", " + str + ", " + str2 + ", " + str3 + ',' + str4, e4);
        }
        if (lVar == null) {
            pendingErrors.put(genSDKError(gVar, str, str2, str3, str4));
        } else {
            if (lVar != null) {
                lVar.execute(new R2.a((Object) gVar, str, (Object) str2, (Object) str3, (Object) str4, 3));
            }
        }
    }

    public final synchronized void logMetric$vungle_ads_release(final com.vungle.ads.internal.protos.n nVar, final long j7, final String str, final String str2, final String str3, final String str4) {
        com.vungle.ads.internal.executor.l lVar;
        G7.j.e(nVar, "metricType");
        try {
            lVar = executor;
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logMetric " + nVar + ", " + j7 + ", " + str + ", " + str2 + ',' + str3 + ", " + str4, e4);
        }
        if (lVar == null) {
            pendingMetrics.put(genMetric(nVar, j7, str, str2, str3, str4));
        } else {
            if (lVar != null) {
                lVar.execute(new Runnable() { // from class: com.vungle.ads.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2137s.m109logMetric$lambda3(com.vungle.ads.internal.protos.n.this, j7, str, str2, str3, str4);
                    }
                });
            }
        }
    }

    public final void pause() {
        paused = true;
    }

    public final void resume() {
        paused = false;
    }

    public final void setExecutor$vungle_ads_release(com.vungle.ads.internal.executor.l lVar) {
        executor = lVar;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z8) {
        metricsEnabled = z8;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z8) {
        refreshEnabled = z8;
    }

    public final void setSignalManager$vungle_ads_release(com.vungle.ads.internal.signals.j jVar) {
        signalManager = jVar;
    }

    public final void setVungleApiClient$vungle_ads_release(com.vungle.ads.internal.network.y yVar) {
        vungleApiClient = yVar;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C2137s c2137s, g1 g1Var, String str, String str2, String str3, String str4, int i9, Object obj) {
        c2137s.logMetric$vungle_ads_release(g1Var, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : str3, (i9 & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(C2137s c2137s, h1 h1Var, String str, String str2, String str3, String str4, int i9, Object obj) {
        String str5 = (i9 & 2) != 0 ? null : str;
        String str6 = (i9 & 4) != 0 ? null : str2;
        String str7 = (i9 & 8) != 0 ? null : str3;
        if ((i9 & 16) != 0) {
            str4 = h1Var.getMeta();
        }
        c2137s.logMetric$vungle_ads_release(h1Var, str5, str6, str7, str4);
    }

    public final synchronized void logError$vungle_ads_release(int i9, String str, String str2, String str3, String str4) {
        G7.j.e(str, "message");
        com.vungle.ads.internal.protos.g forNumber = com.vungle.ads.internal.protos.g.forNumber(i9);
        G7.j.d(forNumber, "forNumber(reasonCode)");
        logError$vungle_ads_release(forNumber, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(AbstractC2123k0 abstractC2123k0, String str, String str2, String str3, String str4) {
        try {
            G7.j.e(abstractC2123k0, "metric");
            com.vungle.ads.internal.protos.n metricType = abstractC2123k0.getMetricType();
            long value = abstractC2123k0.getValue();
            if (str4 == null) {
                str4 = abstractC2123k0.getMeta();
            }
            logMetric$vungle_ads_release(metricType, value, str, str2, str3, str4);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void logMetric$vungle_ads_release(g1 g1Var, String str, String str2, String str3, String str4) {
        G7.j.e(g1Var, "singleValueMetric");
        logMetric$vungle_ads_release((AbstractC2123k0) g1Var, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(h1 h1Var, String str, String str2, String str3, String str4) {
        G7.j.e(h1Var, "timeIntervalMetric");
        logMetric$vungle_ads_release((AbstractC2123k0) h1Var, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(E0 e02, String str, String str2, String str3, String str4) {
        G7.j.e(e02, "oneShotTimeIntervalMetric");
        if (!e02.isLogged()) {
            logMetric$vungle_ads_release((h1) e02, str, str2, str3, str4);
            e02.markLogged();
        }
    }
}
