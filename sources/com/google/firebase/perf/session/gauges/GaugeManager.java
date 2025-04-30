package com.google.firebase.perf.session.gauges;

import U4.RunnableC0311g;
import U4.m;
import Y4.a;
import Y4.n;
import Y4.o;
import Y4.q;
import Y4.r;
import a5.C0397a;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bumptech.glide.c;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import e5.C2221a;
import f5.b;
import f5.d;
import f5.e;
import f5.f;
import g5.C2303f;
import h5.C2323d;
import h5.i;
import i5.C2360o;
import i5.EnumC2355j;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o4.l;

@Keep
/* loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC2355j applicationProcessState;
    private final a configResolver;
    private final l cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final l gaugeManagerExecutor;

    @Nullable
    private d gaugeMetadataManager;
    private final l memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final C2303f transportManager;
    private static final C0397a logger = C0397a.d();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new l(new m(1)), C2303f.f20472u, a.e(), null, new l(new m(2)), new l(new m(3)));
    }

    private static void collectGaugeMetricOnce(b bVar, f fVar, i iVar) {
        synchronized (bVar) {
            try {
                bVar.b.schedule(new f5.a(bVar, iVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                b.f20331g.f("Unable to collect Cpu Metric: " + e4.getMessage());
            }
        }
        synchronized (fVar) {
            try {
                fVar.f20347a.schedule(new e(fVar, iVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                f.f20346f.f("Unable to collect Memory Metric: " + e9.getMessage());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [Y4.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [Y4.n, java.lang.Object] */
    private long getCpuGaugeCollectionFrequencyMs(EnumC2355j enumC2355j) {
        o oVar;
        long j7;
        n nVar;
        int ordinal = enumC2355j.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                j7 = -1;
            } else {
                a aVar = this.configResolver;
                aVar.getClass();
                synchronized (n.class) {
                    try {
                        if (n.f3804j == null) {
                            n.f3804j = new Object();
                        }
                        nVar = n.f3804j;
                    } finally {
                    }
                }
                C2323d j9 = aVar.j(nVar);
                if (j9.b() && a.n(((Long) j9.a()).longValue())) {
                    j7 = ((Long) j9.a()).longValue();
                } else {
                    C2323d c2323d = aVar.f3790a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                    if (c2323d.b() && a.n(((Long) c2323d.a()).longValue())) {
                        aVar.f3791c.d(((Long) c2323d.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                        j7 = ((Long) c2323d.a()).longValue();
                    } else {
                        C2323d c9 = aVar.c(nVar);
                        if (c9.b() && a.n(((Long) c9.a()).longValue())) {
                            j7 = ((Long) c9.a()).longValue();
                        } else {
                            j7 = 0;
                        }
                    }
                }
            }
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (o.class) {
                try {
                    if (o.f3805j == null) {
                        o.f3805j = new Object();
                    }
                    oVar = o.f3805j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2323d j10 = aVar2.j(oVar);
            if (j10.b() && a.n(((Long) j10.a()).longValue())) {
                j7 = ((Long) j10.a()).longValue();
            } else {
                C2323d c2323d2 = aVar2.f3790a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (c2323d2.b() && a.n(((Long) c2323d2.a()).longValue())) {
                    aVar2.f3791c.d(((Long) c2323d2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    j7 = ((Long) c2323d2.a()).longValue();
                } else {
                    C2323d c10 = aVar2.c(oVar);
                    if (c10.b() && a.n(((Long) c10.a()).longValue())) {
                        j7 = ((Long) c10.a()).longValue();
                    } else if (aVar2.f3790a.isLastFetchFailed()) {
                        j7 = 300;
                    } else {
                        j7 = 100;
                    }
                }
            }
        }
        C0397a c0397a = b.f20331g;
        if (j7 <= 0) {
            return -1L;
        }
        return j7;
    }

    private GaugeMetadata getGaugeMetadata() {
        C2360o newBuilder = GaugeMetadata.newBuilder();
        newBuilder.a(c.R((com.mbridge.msdk.foundation.entity.o.e(5) * this.gaugeMetadataManager.f20342c.totalMem) / 1024));
        newBuilder.b(c.R((com.mbridge.msdk.foundation.entity.o.e(5) * this.gaugeMetadataManager.f20341a.maxMemory()) / 1024));
        newBuilder.c(c.R((com.mbridge.msdk.foundation.entity.o.e(3) * this.gaugeMetadataManager.b.getMemoryClass()) / 1024));
        return (GaugeMetadata) newBuilder.build();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [Y4.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [Y4.q, java.lang.Object] */
    private long getMemoryGaugeCollectionFrequencyMs(EnumC2355j enumC2355j) {
        r rVar;
        long j7;
        q qVar;
        int ordinal = enumC2355j.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                j7 = -1;
            } else {
                a aVar = this.configResolver;
                aVar.getClass();
                synchronized (q.class) {
                    try {
                        if (q.f3807j == null) {
                            q.f3807j = new Object();
                        }
                        qVar = q.f3807j;
                    } finally {
                    }
                }
                C2323d j9 = aVar.j(qVar);
                if (j9.b() && a.n(((Long) j9.a()).longValue())) {
                    j7 = ((Long) j9.a()).longValue();
                } else {
                    C2323d c2323d = aVar.f3790a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                    if (c2323d.b() && a.n(((Long) c2323d.a()).longValue())) {
                        aVar.f3791c.d(((Long) c2323d.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                        j7 = ((Long) c2323d.a()).longValue();
                    } else {
                        C2323d c9 = aVar.c(qVar);
                        if (c9.b() && a.n(((Long) c9.a()).longValue())) {
                            j7 = ((Long) c9.a()).longValue();
                        } else {
                            j7 = 0;
                        }
                    }
                }
            }
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (r.class) {
                try {
                    if (r.f3808j == null) {
                        r.f3808j = new Object();
                    }
                    rVar = r.f3808j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2323d j10 = aVar2.j(rVar);
            if (j10.b() && a.n(((Long) j10.a()).longValue())) {
                j7 = ((Long) j10.a()).longValue();
            } else {
                C2323d c2323d2 = aVar2.f3790a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (c2323d2.b() && a.n(((Long) c2323d2.a()).longValue())) {
                    aVar2.f3791c.d(((Long) c2323d2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    j7 = ((Long) c2323d2.a()).longValue();
                } else {
                    C2323d c10 = aVar2.c(rVar);
                    if (c10.b() && a.n(((Long) c10.a()).longValue())) {
                        j7 = ((Long) c10.a()).longValue();
                    } else if (aVar2.f3790a.isLastFetchFailed()) {
                        j7 = 300;
                    } else {
                        j7 = 100;
                    }
                }
            }
        }
        C0397a c0397a = f.f20346f;
        if (j7 <= 0) {
            return -1L;
        }
        return j7;
    }

    public static /* synthetic */ b lambda$new$0() {
        return new b();
    }

    public static /* synthetic */ f lambda$new$1() {
        return new f();
    }

    private boolean startCollectingCpuMetrics(long j7, i iVar) {
        if (j7 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        b bVar = (b) this.cpuGaugeCollector.get();
        long j9 = bVar.f20335d;
        if (j9 != -1 && j9 != 0 && j7 > 0) {
            ScheduledFuture scheduledFuture = bVar.f20336e;
            if (scheduledFuture != null) {
                if (bVar.f20337f != j7) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        bVar.f20336e = null;
                        bVar.f20337f = -1L;
                    }
                    bVar.a(j7, iVar);
                    return true;
                }
                return true;
            }
            bVar.a(j7, iVar);
            return true;
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j7, i iVar) {
        if (j7 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        f fVar = (f) this.memoryGaugeCollector.get();
        C0397a c0397a = f.f20346f;
        if (j7 <= 0) {
            fVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = fVar.f20349d;
        if (scheduledFuture != null) {
            if (fVar.f20350e != j7) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    fVar.f20349d = null;
                    fVar.f20350e = -1L;
                }
                fVar.a(j7, iVar);
                return true;
            }
            return true;
        }
        fVar.a(j7, iVar);
        return true;
    }

    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, EnumC2355j enumC2355j) {
        i5.q newBuilder = GaugeMetric.newBuilder();
        while (!((b) this.cpuGaugeCollector.get()).f20333a.isEmpty()) {
            newBuilder.b((CpuMetricReading) ((b) this.cpuGaugeCollector.get()).f20333a.poll());
        }
        while (!((f) this.memoryGaugeCollector.get()).b.isEmpty()) {
            newBuilder.a((AndroidMemoryReading) ((f) this.memoryGaugeCollector.get()).b.poll());
        }
        newBuilder.d(str);
        C2303f c2303f = this.transportManager;
        c2303f.f20480k.execute(new RunnableC0311g(c2303f, (GaugeMetric) newBuilder.build(), enumC2355j, 16));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new d(context);
    }

    public boolean logGaugeMetadata(String str, EnumC2355j enumC2355j) {
        if (this.gaugeMetadataManager != null) {
            i5.q newBuilder = GaugeMetric.newBuilder();
            newBuilder.d(str);
            newBuilder.c(getGaugeMetadata());
            GaugeMetric gaugeMetric = (GaugeMetric) newBuilder.build();
            C2303f c2303f = this.transportManager;
            c2303f.f20480k.execute(new RunnableC0311g(c2303f, gaugeMetric, enumC2355j, 16));
            return true;
        }
        return false;
    }

    public void startCollectingGauges(C2221a c2221a, EnumC2355j enumC2355j) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(enumC2355j, c2221a.f20110c);
        if (startCollectingGauges == -1) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = c2221a.b;
        this.sessionId = str;
        this.applicationProcessState = enumC2355j;
        try {
            long j7 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new f5.c(this, str, enumC2355j, 1), j7, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            logger.f("Unable to start collecting Gauges: " + e4.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        EnumC2355j enumC2355j = this.applicationProcessState;
        b bVar = (b) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = bVar.f20336e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bVar.f20336e = null;
            bVar.f20337f = -1L;
        }
        f fVar = (f) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = fVar.f20349d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            fVar.f20349d = null;
            fVar.f20350e = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new f5.c(this, str, enumC2355j, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = EnumC2355j.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(l lVar, C2303f c2303f, a aVar, d dVar, l lVar2, l lVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC2355j.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lVar;
        this.transportManager = c2303f;
        this.configResolver = aVar;
        this.gaugeMetadataManager = dVar;
        this.cpuGaugeCollector = lVar2;
        this.memoryGaugeCollector = lVar3;
    }

    private long startCollectingGauges(EnumC2355j enumC2355j, i iVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC2355j);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, iVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC2355j);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, iVar) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(i iVar) {
        collectGaugeMetricOnce((b) this.cpuGaugeCollector.get(), (f) this.memoryGaugeCollector.get(), iVar);
    }
}
