package com.google.firebase.perf.v1;

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
import i5.AbstractC2361p;
import i5.C2360o;
import i5.InterfaceC2350e;
import i5.InterfaceC2358m;
import i5.q;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class GaugeMetric extends L2 implements O3 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";
    private InterfaceC1891d3 cpuMetricReadings_ = L2.emptyProtobufList();
    private InterfaceC1891d3 androidMemoryReadings_ = L2.emptyProtobufList();

    static {
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        L2.registerDefaultInstance(GaugeMetric.class, gaugeMetric);
    }

    private GaugeMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.androidMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
        ensureCpuMetricReadingsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.cpuMetricReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.androidMemoryReadings_;
        if (!interfaceC1891d3.isModifiable()) {
            this.androidMemoryReadings_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureCpuMetricReadingsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.cpuMetricReadings_;
        if (!interfaceC1891d3.isModifiable()) {
            this.cpuMetricReadings_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static GaugeMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        GaugeMetadata gaugeMetadata2 = this.gaugeMetadata_;
        if (gaugeMetadata2 != null && gaugeMetadata2 != GaugeMetadata.getDefaultInstance()) {
            this.gaugeMetadata_ = (GaugeMetadata) ((C2360o) GaugeMetadata.newBuilder(this.gaugeMetadata_).mergeFrom((L2) gaugeMetadata)).buildPartial();
        } else {
            this.gaugeMetadata_ = gaugeMetadata;
        }
        this.bitField0_ |= 2;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAndroidMemoryReadings(int i9) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCpuMetricReadings(int i9) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i9, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i9, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuMetricReadings(int i9, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i9, cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        this.gaugeMetadata_ = gaugeMetadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(H h6) {
        this.sessionId_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2361p.f20688a[k22.ordinal()]) {
            case 1:
                return new GaugeMetric();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (GaugeMetric.class) {
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

    public AndroidMemoryReading getAndroidMemoryReadings(int i9) {
        return (AndroidMemoryReading) this.androidMemoryReadings_.get(i9);
    }

    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public InterfaceC2350e getAndroidMemoryReadingsOrBuilder(int i9) {
        return (InterfaceC2350e) this.androidMemoryReadings_.get(i9);
    }

    public List<? extends InterfaceC2350e> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    public CpuMetricReading getCpuMetricReadings(int i9) {
        return (CpuMetricReading) this.cpuMetricReadings_.get(i9);
    }

    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    public List<CpuMetricReading> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public InterfaceC2358m getCpuMetricReadingsOrBuilder(int i9) {
        return (InterfaceC2358m) this.cpuMetricReadings_.get(i9);
    }

    public List<? extends InterfaceC2358m> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    public GaugeMetadata getGaugeMetadata() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        if (gaugeMetadata == null) {
            return GaugeMetadata.getDefaultInstance();
        }
        return gaugeMetadata;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public H getSessionIdBytes() {
        return H.copyFromUtf8(this.sessionId_);
    }

    public boolean hasGaugeMetadata() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasSessionId() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static q newBuilder(GaugeMetric gaugeMetric) {
        return (q) DEFAULT_INSTANCE.createBuilder(gaugeMetric);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (GaugeMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static GaugeMetric parseFrom(H h6) throws C1912g3 {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i9, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i9, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(int i9, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i9, cpuMetricReading);
    }

    public static GaugeMetric parseFrom(H h6, W1 w1) throws C1912g3 {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static GaugeMetric parseFrom(byte[] bArr) throws C1912g3 {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetric parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static GaugeMetric parseFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static GaugeMetric parseFrom(S s5) throws IOException {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static GaugeMetric parseFrom(S s5, W1 w1) throws IOException {
        return (GaugeMetric) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
