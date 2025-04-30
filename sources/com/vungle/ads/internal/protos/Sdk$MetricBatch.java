package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class Sdk$MetricBatch extends L2 implements c {
    private static final Sdk$MetricBatch DEFAULT_INSTANCE;
    public static final int METRICS_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 metrics_ = L2.emptyProtobufList();

    static {
        Sdk$MetricBatch sdk$MetricBatch = new Sdk$MetricBatch();
        DEFAULT_INSTANCE = sdk$MetricBatch;
        L2.registerDefaultInstance(Sdk$MetricBatch.class, sdk$MetricBatch);
    }

    private Sdk$MetricBatch() {
    }

    public void addAllMetrics(Iterable<? extends Sdk$SDKMetric> iterable) {
        ensureMetricsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.metrics_);
    }

    public void addMetrics(Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(sdk$SDKMetric);
    }

    public void clearMetrics() {
        this.metrics_ = L2.emptyProtobufList();
    }

    private void ensureMetricsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.metrics_;
        if (!interfaceC1891d3.isModifiable()) {
            this.metrics_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Sdk$MetricBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeMetrics(int i9) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i9);
    }

    public void setMetrics(int i9, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i9, sdk$SDKMetric);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Sdk$MetricBatch();
            case 2:
                return new b(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"metrics_", Sdk$SDKMetric.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Sdk$MetricBatch.class) {
                        try {
                            interfaceC1948l4 = PARSER;
                            if (interfaceC1948l4 == null) {
                                interfaceC1948l4 = new E2(DEFAULT_INSTANCE);
                                PARSER = interfaceC1948l4;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1948l4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.c
    public Sdk$SDKMetric getMetrics(int i9) {
        return (Sdk$SDKMetric) this.metrics_.get(i9);
    }

    @Override // com.vungle.ads.internal.protos.c
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.vungle.ads.internal.protos.c
    public List<Sdk$SDKMetric> getMetricsList() {
        return this.metrics_;
    }

    public o getMetricsOrBuilder(int i9) {
        return (o) this.metrics_.get(i9);
    }

    public List<? extends o> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public static b newBuilder(Sdk$MetricBatch sdk$MetricBatch) {
        return (b) DEFAULT_INSTANCE.createBuilder(sdk$MetricBatch);
    }

    public static Sdk$MetricBatch parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$MetricBatch) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$MetricBatch parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Sdk$MetricBatch parseFrom(H h6) throws C1912g3 {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public void addMetrics(int i9, Sdk$SDKMetric sdk$SDKMetric) {
        sdk$SDKMetric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i9, sdk$SDKMetric);
    }

    public static Sdk$MetricBatch parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr) throws C1912g3 {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$MetricBatch parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$MetricBatch parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$MetricBatch parseFrom(S s5) throws IOException {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Sdk$MetricBatch parseFrom(S s5, W1 w1) throws IOException {
        return (Sdk$MetricBatch) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
