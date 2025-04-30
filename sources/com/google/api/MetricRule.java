package com.google.api;

import a4.AbstractC0390w0;
import a4.AbstractC0394y0;
import a4.C0392x0;
import a4.InterfaceC0396z0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MetricRule extends L2 implements InterfaceC0396z0 {
    private static final MetricRule DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private G3 metricCosts_ = G3.emptyMapField();
    private String selector_ = "";

    static {
        MetricRule metricRule = new MetricRule();
        DEFAULT_INSTANCE = metricRule;
        L2.registerDefaultInstance(MetricRule.class, metricRule);
    }

    private MetricRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static MetricRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableMetricCostsMap() {
        return internalGetMutableMetricCosts();
    }

    private G3 internalGetMetricCosts() {
        return this.metricCosts_;
    }

    private G3 internalGetMutableMetricCosts() {
        if (!this.metricCosts_.isMutable()) {
            this.metricCosts_ = this.metricCosts_.mutableCopy();
        }
        return this.metricCosts_;
    }

    public static C0392x0 newBuilder() {
        return (C0392x0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.selector_ = h6.toStringUtf8();
    }

    public boolean containsMetricCosts(String str) {
        str.getClass();
        return internalGetMetricCosts().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0390w0.f4064a[k22.ordinal()]) {
            case 1:
                return new MetricRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", AbstractC0394y0.f4072a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (MetricRule.class) {
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

    @Deprecated
    public Map<String, Long> getMetricCosts() {
        return getMetricCostsMap();
    }

    public int getMetricCostsCount() {
        return internalGetMetricCosts().size();
    }

    public Map<String, Long> getMetricCostsMap() {
        return Collections.unmodifiableMap(internalGetMetricCosts());
    }

    public long getMetricCostsOrDefault(String str, long j7) {
        str.getClass();
        G3 internalGetMetricCosts = internalGetMetricCosts();
        if (internalGetMetricCosts.containsKey(str)) {
            return ((Long) internalGetMetricCosts.get(str)).longValue();
        }
        return j7;
    }

    public long getMetricCostsOrThrow(String str) {
        str.getClass();
        G3 internalGetMetricCosts = internalGetMetricCosts();
        if (internalGetMetricCosts.containsKey(str)) {
            return ((Long) internalGetMetricCosts.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public static C0392x0 newBuilder(MetricRule metricRule) {
        return (C0392x0) DEFAULT_INSTANCE.createBuilder(metricRule);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MetricRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static MetricRule parseFrom(H h6) throws C1912g3 {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static MetricRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static MetricRule parseFrom(byte[] bArr) throws C1912g3 {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static MetricRule parseFrom(InputStream inputStream) throws IOException {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MetricRule parseFrom(S s5) throws IOException {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static MetricRule parseFrom(S s5, W1 w1) throws IOException {
        return (MetricRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
