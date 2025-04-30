package g5;

import Q7.n0;
import U4.RunnableC0311g;
import a5.C0397a;
import android.content.Context;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.mbridge.msdk.foundation.entity.o;
import g4.C2296f;
import i5.C;
import i5.C2352g;
import i5.EnumC2355j;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;

/* renamed from: g5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2303f implements X4.b {

    /* renamed from: t, reason: collision with root package name */
    public static final C0397a f20471t = C0397a.d();

    /* renamed from: u, reason: collision with root package name */
    public static final C2303f f20472u = new C2303f();
    public final ConcurrentHashMap b;

    /* renamed from: f, reason: collision with root package name */
    public C2296f f20475f;

    /* renamed from: g, reason: collision with root package name */
    public W4.b f20476g;

    /* renamed from: h, reason: collision with root package name */
    public O4.e f20477h;

    /* renamed from: i, reason: collision with root package name */
    public N4.b f20478i;

    /* renamed from: j, reason: collision with root package name */
    public C2298a f20479j;
    public Context l;
    public Y4.a m;

    /* renamed from: n, reason: collision with root package name */
    public C2301d f20481n;

    /* renamed from: o, reason: collision with root package name */
    public X4.c f20482o;

    /* renamed from: p, reason: collision with root package name */
    public C2352g f20483p;

    /* renamed from: q, reason: collision with root package name */
    public String f20484q;

    /* renamed from: r, reason: collision with root package name */
    public String f20485r;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f20473c = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20474d = new AtomicBoolean(false);

    /* renamed from: s, reason: collision with root package name */
    public boolean f20486s = false;

    /* renamed from: k, reason: collision with root package name */
    public final ThreadPoolExecutor f20480k = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C2303f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.b = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(C c9) {
        long j7;
        String str;
        if (c9.hasTraceMetric()) {
            TraceMetric traceMetric = c9.getTraceMetric();
            long durationUs = traceMetric.getDurationUs();
            Locale locale = Locale.ENGLISH;
            return n0.j("trace metric: ", traceMetric.getName(), " (duration: ", new DecimalFormat("#.####").format(durationUs / 1000.0d), "ms)");
        }
        if (c9.hasNetworkRequestMetric()) {
            NetworkRequestMetric networkRequestMetric = c9.getNetworkRequestMetric();
            if (networkRequestMetric.hasTimeToResponseCompletedUs()) {
                j7 = networkRequestMetric.getTimeToResponseCompletedUs();
            } else {
                j7 = 0;
            }
            if (networkRequestMetric.hasHttpResponseCode()) {
                str = String.valueOf(networkRequestMetric.getHttpResponseCode());
            } else {
                str = "UNKNOWN";
            }
            Locale locale2 = Locale.ENGLISH;
            return AbstractC2914a.h(o.o("network request trace: ", networkRequestMetric.getUrl(), " (responseCode: ", str, ", responseTime: "), new DecimalFormat("#.####").format(j7 / 1000.0d), "ms)");
        }
        if (c9.hasGaugeMetric()) {
            GaugeMetric gaugeMetric = c9.getGaugeMetric();
            Locale locale3 = Locale.ENGLISH;
            boolean hasGaugeMetadata = gaugeMetric.hasGaugeMetadata();
            int cpuMetricReadingsCount = gaugeMetric.getCpuMetricReadingsCount();
            int androidMemoryReadingsCount = gaugeMetric.getAndroidMemoryReadingsCount();
            StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
            sb.append(hasGaugeMetadata);
            sb.append(", cpuGaugeCount: ");
            sb.append(cpuMetricReadingsCount);
            sb.append(", memoryGaugeCount: ");
            return AbstractC2914a.g(sb, androidMemoryReadingsCount, ")");
        }
        return "log";
    }

    public final void b(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.f20482o.b("_fstec");
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.f20482o.b("_fsntc");
        }
    }

    public final void c(TraceMetric traceMetric, EnumC2355j enumC2355j) {
        this.f20480k.execute(new RunnableC0311g(this, traceMetric, enumC2355j, 17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b4, code lost:
    
        if (g5.C2301d.a(r0.getTraceMetric().getPerfSessionsList()) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x042e, code lost:
    
        b(r0);
        g5.C2303f.f20471t.e("Event dropped due to device sampling - %s", a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0311, code lost:
    
        if (Y4.a.p(r13) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0388, code lost:
    
        if (g5.C2301d.a(r0.getTraceMetric().getPerfSessionsList()) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x042c, code lost:
    
        if (g5.C2301d.a(r0.getNetworkRequestMetric().getPerfSessionsList()) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, Y4.e] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, Y4.v] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, Y4.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(i5.B r18, i5.EnumC2355j r19) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2303f.d(i5.B, i5.j):void");
    }

    @Override // X4.b
    public final void onUpdateAppState(EnumC2355j enumC2355j) {
        boolean z8;
        if (enumC2355j == EnumC2355j.FOREGROUND) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f20486s = z8;
        if (this.f20474d.get()) {
            this.f20480k.execute(new RunnableC2302e(this, 0));
        }
    }
}
