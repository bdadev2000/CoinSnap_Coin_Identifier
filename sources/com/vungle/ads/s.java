package com.vungle.ads;

import android.os.Build;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class s {
    public static final s INSTANCE = new s();
    private static final String TAG;
    private static final BlockingQueue<com.vungle.ads.internal.protos.d> errors;
    private static com.vungle.ads.internal.executor.l executor = null;
    private static n logLevel = null;
    private static final int maxBatchSize = 20;
    private static int maxErrorLogLevel = 0;
    private static final BlockingQueue<com.vungle.ads.internal.protos.k> metrics;
    private static boolean metricsEnabled = false;
    private static boolean paused = false;
    private static final BlockingQueue<com.vungle.ads.internal.protos.d> pendingErrors;
    private static final BlockingQueue<com.vungle.ads.internal.protos.k> pendingMetrics;
    private static boolean refreshEnabled = false;
    private static final long refreshTimeMillis = 5000;
    private static com.vungle.ads.internal.signals.j signalManager;
    private static com.vungle.ads.internal.network.y vungleApiClient;

    static {
        String simpleName = s.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "AnalyticsClient::class.java.simpleName");
        TAG = simpleName;
        errors = new LinkedBlockingQueue();
        metrics = new LinkedBlockingQueue();
        pendingErrors = new LinkedBlockingQueue();
        pendingMetrics = new LinkedBlockingQueue();
        maxErrorLogLevel = Integer.MAX_VALUE;
        logLevel = n.ERROR_LOG_LEVEL_ERROR;
        refreshEnabled = true;
    }

    private s() {
    }

    private final void flushErrors() {
        com.vungle.ads.internal.network.y yVar;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        String str = TAG;
        StringBuilder sb2 = new StringBuilder("Sending ");
        BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue = errors;
        sb2.append(blockingQueue.size());
        sb2.append(" errors");
        uVar.d(str, sb2.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (yVar = vungleApiClient) != null) {
            yVar.reportErrors(linkedBlockingQueue, new p(linkedBlockingQueue));
        }
    }

    private final void flushMetrics() {
        com.vungle.ads.internal.network.y yVar;
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        String str = TAG;
        StringBuilder sb2 = new StringBuilder("Sending ");
        BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue = metrics;
        sb2.append(blockingQueue.size());
        sb2.append(" metrics");
        uVar.d(str, sb2.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (yVar = vungleApiClient) != null) {
            yVar.reportMetrics(linkedBlockingQueue, new q(linkedBlockingQueue));
        }
    }

    public final com.vungle.ads.internal.protos.k genMetric(com.vungle.ads.internal.protos.n nVar, long j3, String str, String str2, String str3, String str4) {
        String uuid;
        com.vungle.ads.internal.protos.k osVersion = Sdk$SDKMetric.newBuilder().setType(nVar).setValue(j3).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setOs("Android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
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
        Intrinsics.checkNotNullExpressionValue(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
    }

    public final com.vungle.ads.internal.protos.d genSDKError(com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4) {
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
        Intrinsics.checkNotNullExpressionValue(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
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
    public static final void m114init$lambda1(com.vungle.ads.internal.executor.l executor2) {
        Intrinsics.checkNotNullParameter(executor2, "$executor");
        executor2.execute(new com.applovin.impl.sdk.g0(18));
    }

    /* renamed from: init$lambda-1$lambda-0 */
    public static final void m115init$lambda1$lambda0() {
        INSTANCE.report();
    }

    /* renamed from: logError$lambda-2 */
    public static final void m116logError$lambda2(com.vungle.ads.internal.protos.g reason, String message, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(reason, "$reason");
        Intrinsics.checkNotNullParameter(message, "$message");
        INSTANCE.logErrorInSameThread(reason, message, str, str2, str3);
    }

    public final synchronized void logErrorInSameThread(com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4) {
        if (logLevel == n.ERROR_LOG_LEVEL_OFF) {
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
        } catch (Exception e2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logError", e2);
        }
    }

    /* renamed from: logMetric$lambda-3 */
    public static final void m117logMetric$lambda3(com.vungle.ads.internal.protos.n metricType, long j3, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(metricType, "$metricType");
        INSTANCE.logMetricInSameThread(metricType, j3, str, str2, str3, str4);
    }

    public final synchronized void logMetricInSameThread(com.vungle.ads.internal.protos.n nVar, long j3, String str, String str2, String str3, String str4) {
        if (!metricsEnabled) {
            return;
        }
        try {
            com.vungle.ads.internal.protos.k genMetric = genMetric(nVar, j3, str, str2, str3, str4);
            BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue = metrics;
            blockingQueue.put(genMetric);
            com.vungle.ads.internal.util.v.Companion.d(TAG, "Logging Metric " + nVar + " with value " + j3 + " for placement " + str);
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logMetrics", e2);
        }
    }

    private final synchronized void report() {
        if (paused) {
            return;
        }
        if (logLevel != n.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
            flushErrors();
        }
        if (metricsEnabled && metrics.size() > 0) {
            flushMetrics();
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

    public final void init$vungle_ads_release(com.vungle.ads.internal.network.y vungleApiClient2, com.vungle.ads.internal.executor.l executor2, int i10, boolean z10, com.vungle.ads.internal.signals.j signalManager2) {
        Intrinsics.checkNotNullParameter(vungleApiClient2, "vungleApiClient");
        Intrinsics.checkNotNullParameter(executor2, "executor");
        Intrinsics.checkNotNullParameter(signalManager2, "signalManager");
        signalManager = signalManager2;
        executor = executor2;
        vungleApiClient = vungleApiClient2;
        metricsEnabled = z10;
        try {
            BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue = pendingErrors;
            if (!blockingQueue.isEmpty()) {
                blockingQueue.drainTo(errors);
            }
        } catch (Exception e2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Failed to add pendingErrors to errors queue.", e2);
        }
        try {
            BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue2 = pendingMetrics;
            if (!blockingQueue2.isEmpty()) {
                blockingQueue2.drainTo(metrics);
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Failed to add pendingMetrics to metrics queue.", e10);
        }
        if (refreshEnabled) {
            Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new k8.f(executor2, 16), 0L, 5000L, TimeUnit.MILLISECONDS);
        }
        maxErrorLogLevel = i10;
        logLevel = n.Companion.fromValue(i10);
        if (i10 == n.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            com.vungle.ads.internal.util.v.Companion.enable(true);
        } else if (i10 == n.ERROR_LOG_LEVEL_ERROR.getLevel()) {
            com.vungle.ads.internal.util.v.Companion.enable(false);
        } else if (i10 == n.ERROR_LOG_LEVEL_OFF.getLevel()) {
            com.vungle.ads.internal.util.v.Companion.enable(false);
        }
        com.vungle.ads.internal.util.h.Companion.getInstance().addListener(new r());
    }

    public final synchronized void logError$vungle_ads_release(com.vungle.ads.internal.protos.g reason, String message, String str, String str2, String str3) {
        com.vungle.ads.internal.executor.l lVar;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            lVar = executor;
        } catch (Exception e2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logError " + reason + ", " + message + ", " + str + ", " + str2 + AbstractJsonLexerKt.COMMA + str3, e2);
        }
        if (lVar == null) {
            pendingErrors.put(genSDKError(reason, message, str, str2, str3));
        } else {
            if (lVar != null) {
                lVar.execute(new com.applovin.impl.mediation.h(reason, message, str, str2, str3, 3));
            }
        }
    }

    public final synchronized void logMetric$vungle_ads_release(final com.vungle.ads.internal.protos.n metricType, final long j3, final String str, final String str2, final String str3, final String str4) {
        com.vungle.ads.internal.executor.l lVar;
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        try {
            lVar = executor;
        } catch (Exception e2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot logMetric " + metricType + ", " + j3 + ", " + str + ", " + str2 + AbstractJsonLexerKt.COMMA + str3 + ", " + str4, e2);
        }
        if (lVar == null) {
            pendingMetrics.put(genMetric(metricType, j3, str, str2, str3, str4));
        } else {
            if (lVar != null) {
                lVar.execute(new Runnable() { // from class: com.vungle.ads.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.m117logMetric$lambda3(com.vungle.ads.internal.protos.n.this, j3, str, str2, str3, str4);
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

    public final void setMetricsEnabled$vungle_ads_release(boolean z10) {
        metricsEnabled = z10;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z10) {
        refreshEnabled = z10;
    }

    public final void setSignalManager$vungle_ads_release(com.vungle.ads.internal.signals.j jVar) {
        signalManager = jVar;
    }

    public final void setVungleApiClient$vungle_ads_release(com.vungle.ads.internal.network.y yVar) {
        vungleApiClient = yVar;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(s sVar, f3 f3Var, String str, String str2, String str3, String str4, int i10, Object obj) {
        sVar.logMetric$vungle_ads_release(f3Var, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(s sVar, g3 g3Var, String str, String str2, String str3, String str4, int i10, Object obj) {
        String str5 = (i10 & 2) != 0 ? null : str;
        String str6 = (i10 & 4) != 0 ? null : str2;
        String str7 = (i10 & 8) != 0 ? null : str3;
        if ((i10 & 16) != 0) {
            str4 = g3Var.getMeta();
        }
        sVar.logMetric$vungle_ads_release(g3Var, str5, str6, str7, str4);
    }

    public final synchronized void logError$vungle_ads_release(int i10, String message, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.vungle.ads.internal.protos.g forNumber = com.vungle.ads.internal.protos.g.forNumber(i10);
        Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(reasonCode)");
        logError$vungle_ads_release(forNumber, message, str, str2, str3);
    }

    public final synchronized void logMetric$vungle_ads_release(i1 metric, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        com.vungle.ads.internal.protos.n metricType = metric.getMetricType();
        long value = metric.getValue();
        if (str4 == null) {
            str4 = metric.getMeta();
        }
        logMetric$vungle_ads_release(metricType, value, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(f3 singleValueMetric, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(singleValueMetric, "singleValueMetric");
        logMetric$vungle_ads_release((i1) singleValueMetric, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(g3 timeIntervalMetric, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(timeIntervalMetric, "timeIntervalMetric");
        logMetric$vungle_ads_release((i1) timeIntervalMetric, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(c2 oneShotTimeIntervalMetric, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.isLogged()) {
            logMetric$vungle_ads_release((g3) oneShotTimeIntervalMetric, str, str2, str3, str4);
            oneShotTimeIntervalMetric.markLogged();
        }
    }
}
