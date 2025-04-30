package i5;

import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.protobuf.D2;

/* loaded from: classes2.dex */
public final class B extends D2 implements C {
    public final void a(C2352g c2352g) {
        copyOnWrite();
        ((PerfMetric) this.instance).setApplicationInfo((ApplicationInfo) c2352g.build());
    }

    public final void b(GaugeMetric gaugeMetric) {
        copyOnWrite();
        ((PerfMetric) this.instance).setGaugeMetric(gaugeMetric);
    }

    public final void c(NetworkRequestMetric networkRequestMetric) {
        copyOnWrite();
        ((PerfMetric) this.instance).setNetworkRequestMetric(networkRequestMetric);
    }

    public final void d(TraceMetric traceMetric) {
        copyOnWrite();
        ((PerfMetric) this.instance).setTraceMetric(traceMetric);
    }

    @Override // i5.C
    public final GaugeMetric getGaugeMetric() {
        return ((PerfMetric) this.instance).getGaugeMetric();
    }

    @Override // i5.C
    public final NetworkRequestMetric getNetworkRequestMetric() {
        return ((PerfMetric) this.instance).getNetworkRequestMetric();
    }

    @Override // i5.C
    public final TraceMetric getTraceMetric() {
        return ((PerfMetric) this.instance).getTraceMetric();
    }

    @Override // i5.C
    public final boolean hasGaugeMetric() {
        return ((PerfMetric) this.instance).hasGaugeMetric();
    }

    @Override // i5.C
    public final boolean hasNetworkRequestMetric() {
        return ((PerfMetric) this.instance).hasNetworkRequestMetric();
    }

    @Override // i5.C
    public final boolean hasTraceMetric() {
        return ((PerfMetric) this.instance).hasTraceMetric();
    }
}
