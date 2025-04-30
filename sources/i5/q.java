package i5;

import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.protobuf.D2;
import com.google.protobuf.O3;

/* loaded from: classes2.dex */
public final class q extends D2 implements O3 {
    public final void a(AndroidMemoryReading androidMemoryReading) {
        copyOnWrite();
        ((GaugeMetric) this.instance).addAndroidMemoryReadings(androidMemoryReading);
    }

    public final void b(CpuMetricReading cpuMetricReading) {
        copyOnWrite();
        ((GaugeMetric) this.instance).addCpuMetricReadings(cpuMetricReading);
    }

    public final void c(GaugeMetadata gaugeMetadata) {
        copyOnWrite();
        ((GaugeMetric) this.instance).setGaugeMetadata(gaugeMetadata);
    }

    public final void d(String str) {
        copyOnWrite();
        ((GaugeMetric) this.instance).setSessionId(str);
    }
}
