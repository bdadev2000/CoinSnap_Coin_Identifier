package c5;

import com.google.firebase.perf.v1.GaugeMetric;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0609b extends AbstractC0612e {

    /* renamed from: a, reason: collision with root package name */
    public final GaugeMetric f5415a;

    public C0609b(GaugeMetric gaugeMetric) {
        this.f5415a = gaugeMetric;
    }

    @Override // c5.AbstractC0612e
    public final boolean a() {
        GaugeMetric gaugeMetric = this.f5415a;
        if (gaugeMetric.hasSessionId() && (gaugeMetric.getCpuMetricReadingsCount() > 0 || gaugeMetric.getAndroidMemoryReadingsCount() > 0 || (gaugeMetric.hasGaugeMetadata() && gaugeMetric.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb()))) {
            return true;
        }
        return false;
    }
}
