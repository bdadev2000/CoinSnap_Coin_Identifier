package com.vungle.ads.internal.protos;

import com.google.protobuf.a2;
import com.google.protobuf.e4;
import com.google.protobuf.h0;
import com.google.protobuf.h4;
import com.google.protobuf.i3;
import com.google.protobuf.m6;
import com.google.protobuf.n3;
import com.google.protobuf.o3;
import com.google.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Sdk$MetricBatch extends o3 implements c {
    private static final Sdk$MetricBatch DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 1;
    private static volatile m6 PARSER;
    private e4 metrics_ = o3.emptyProtobufList();

    static {
        Sdk$MetricBatch sdk$MetricBatch = new Sdk$MetricBatch();
        DEFAULT_INSTANCE = sdk$MetricBatch;
        o3.registerDefaultInstance(Sdk$MetricBatch.class, sdk$MetricBatch);
    }

    private Sdk$MetricBatch() {
    }

    public void addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
        ensureMetricsIsMutable();
        com.google.protobuf.c.addAll((Iterable) iterable, (List) this.metrics_);
    }

    public void addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(sdk$SDKMetric);
    }

    public void clearMetrics() {
        this.metrics_ = o3.emptyProtobufList();
    }

    private void ensureMetricsIsMutable() {
        e4 e4Var = this.metrics_;
        if (!e4Var.isModifiable()) {
            this.metrics_ = o3.mutableCopy(e4Var);
        }
    }

    public static Sdk$MetricBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeMetrics(int i10) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i10);
    }

    public void setMetrics(int i10, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i10, sdk$SDKMetric);
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Sdk$MetricBatch();
            case 2:
                return new b(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"metrics_", Sdk$SDKMetric.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Sdk$MetricBatch.class) {
                        m6Var = PARSER;
                        if (m6Var == null) {
                            m6Var = new i3(DEFAULT_INSTANCE);
                            PARSER = m6Var;
                        }
                    }
                }
                return m6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.c
    public Sdk$SDKMetric getMetrics(int i10) {
        return (Sdk$SDKMetric) this.metrics_.get(i10);
    }

    @Override // com.vungle.ads.internal.protos.c
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.vungle.ads.internal.protos.c
    public List<Sdk$SDKMetric> getMetricsList() {
        return this.metrics_;
    }

    public o getMetricsOrBuilder(int i10) {
        return (o) this.metrics_.get(i10);
    }

    public List<? extends o> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public static b newBuilder(Sdk$MetricBatch sdk$MetricBatch) {
        return (b) DEFAULT_INSTANCE.createBuilder(sdk$MetricBatch);
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$MetricBatch) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Sdk$MetricBatch parseFrom(h0 h0Var) throws h4 {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public void addMetrics(int i10, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i10, sdk$SDKMetric);
    }

    public static Sdk$MetricBatch parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr) throws h4 {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$MetricBatch parseFrom(r0 r0Var) throws IOException {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Sdk$MetricBatch parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Sdk$MetricBatch) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
