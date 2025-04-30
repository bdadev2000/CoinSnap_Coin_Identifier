package com.vungle.ads.internal.protos;

import com.google.protobuf.D2;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b extends D2 implements c {
    public /* synthetic */ b(a aVar) {
        this();
    }

    public b addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
        copyOnWrite();
        Sdk$MetricBatch.access$5500((Sdk$MetricBatch) this.instance, iterable);
        return this;
    }

    public b addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
        copyOnWrite();
        Sdk$MetricBatch.access$5300((Sdk$MetricBatch) this.instance, sdk$SDKMetric);
        return this;
    }

    public b clearMetrics() {
        copyOnWrite();
        Sdk$MetricBatch.access$5600((Sdk$MetricBatch) this.instance);
        return this;
    }

    @Override // com.vungle.ads.internal.protos.c
    public Sdk$SDKMetric getMetrics(int i9) {
        return ((Sdk$MetricBatch) this.instance).getMetrics(i9);
    }

    @Override // com.vungle.ads.internal.protos.c
    public int getMetricsCount() {
        return ((Sdk$MetricBatch) this.instance).getMetricsCount();
    }

    @Override // com.vungle.ads.internal.protos.c
    public List<Sdk$SDKMetric> getMetricsList() {
        return Collections.unmodifiableList(((Sdk$MetricBatch) this.instance).getMetricsList());
    }

    public b removeMetrics(int i9) {
        copyOnWrite();
        Sdk$MetricBatch.access$5700((Sdk$MetricBatch) this.instance, i9);
        return this;
    }

    public b setMetrics(int i9, Sdk$SDKMetric sdk$SDKMetric) {
        copyOnWrite();
        Sdk$MetricBatch.access$5200((Sdk$MetricBatch) this.instance, i9, sdk$SDKMetric);
        return this;
    }

    private b() {
        super(Sdk$MetricBatch.access$5100());
    }

    public b addMetrics(int i9, Sdk$SDKMetric sdk$SDKMetric) {
        copyOnWrite();
        Sdk$MetricBatch.access$5400((Sdk$MetricBatch) this.instance, i9, sdk$SDKMetric);
        return this;
    }

    public b setMetrics(int i9, k kVar) {
        copyOnWrite();
        Sdk$MetricBatch.access$5200((Sdk$MetricBatch) this.instance, i9, (Sdk$SDKMetric) kVar.build());
        return this;
    }

    public b addMetrics(k kVar) {
        copyOnWrite();
        Sdk$MetricBatch.access$5300((Sdk$MetricBatch) this.instance, (Sdk$SDKMetric) kVar.build());
        return this;
    }

    public b addMetrics(int i9, k kVar) {
        copyOnWrite();
        Sdk$MetricBatch.access$5400((Sdk$MetricBatch) this.instance, i9, (Sdk$SDKMetric) kVar.build());
        return this;
    }
}
