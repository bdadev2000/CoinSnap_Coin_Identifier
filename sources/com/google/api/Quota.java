package com.google.api;

import a4.InterfaceC0396z0;
import a4.W0;
import a4.X0;
import a4.b1;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Quota extends L2 implements O3 {
    private static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 limits_ = L2.emptyProtobufList();
    private InterfaceC1891d3 metricRules_ = L2.emptyProtobufList();

    static {
        Quota quota = new Quota();
        DEFAULT_INSTANCE = quota;
        L2.registerDefaultInstance(Quota.class, quota);
    }

    private Quota() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        ensureLimitsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.limits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        ensureMetricRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.metricRules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(metricRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimits() {
        this.limits_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricRules() {
        this.metricRules_ = L2.emptyProtobufList();
    }

    private void ensureLimitsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.limits_;
        if (!interfaceC1891d3.isModifiable()) {
            this.limits_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureMetricRulesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.metricRules_;
        if (!interfaceC1891d3.isModifiable()) {
            this.metricRules_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static X0 newBuilder() {
        return (X0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLimits(int i9) {
        ensureLimitsIsMutable();
        this.limits_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetricRules(int i9) {
        ensureMetricRulesIsMutable();
        this.metricRules_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimits(int i9, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.set(i9, quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricRules(int i9, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.set(i9, metricRule);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (W0.f3986a[k22.ordinal()]) {
            case 1:
                return new Quota();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Quota.class) {
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

    public QuotaLimit getLimits(int i9) {
        return (QuotaLimit) this.limits_.get(i9);
    }

    public int getLimitsCount() {
        return this.limits_.size();
    }

    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public b1 getLimitsOrBuilder(int i9) {
        return (b1) this.limits_.get(i9);
    }

    public List<? extends b1> getLimitsOrBuilderList() {
        return this.limits_;
    }

    public MetricRule getMetricRules(int i9) {
        return (MetricRule) this.metricRules_.get(i9);
    }

    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public InterfaceC0396z0 getMetricRulesOrBuilder(int i9) {
        return (InterfaceC0396z0) this.metricRules_.get(i9);
    }

    public List<? extends InterfaceC0396z0> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    public static X0 newBuilder(Quota quota) {
        return (X0) DEFAULT_INSTANCE.createBuilder(quota);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Quota) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Quota parseFrom(H h6) throws C1912g3 {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimits(int i9, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(i9, quotaLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetricRules(int i9, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(i9, metricRule);
    }

    public static Quota parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Quota parseFrom(byte[] bArr) throws C1912g3 {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quota parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Quota parseFrom(S s5) throws IOException {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Quota parseFrom(S s5, W1 w1) throws IOException {
        return (Quota) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
