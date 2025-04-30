package com.google.firebase.perf.v1;

import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import i5.A;
import i5.B;
import i5.C;
import i5.C2352g;
import i5.J;
import i5.O;
import i5.q;
import i5.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class PerfMetric extends L2 implements C {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final PerfMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    static {
        PerfMetric perfMetric = new PerfMetric();
        DEFAULT_INSTANCE = perfMetric;
        L2.registerDefaultInstance(PerfMetric.class, perfMetric);
    }

    private PerfMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static PerfMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        ApplicationInfo applicationInfo2 = this.applicationInfo_;
        if (applicationInfo2 != null && applicationInfo2 != ApplicationInfo.getDefaultInstance()) {
            this.applicationInfo_ = (ApplicationInfo) ((C2352g) ApplicationInfo.newBuilder(this.applicationInfo_).mergeFrom((L2) applicationInfo)).buildPartial();
        } else {
            this.applicationInfo_ = applicationInfo;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        GaugeMetric gaugeMetric2 = this.gaugeMetric_;
        if (gaugeMetric2 != null && gaugeMetric2 != GaugeMetric.getDefaultInstance()) {
            this.gaugeMetric_ = (GaugeMetric) ((q) GaugeMetric.newBuilder(this.gaugeMetric_).mergeFrom((L2) gaugeMetric)).buildPartial();
        } else {
            this.gaugeMetric_ = gaugeMetric;
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        NetworkRequestMetric networkRequestMetric2 = this.networkRequestMetric_;
        if (networkRequestMetric2 != null && networkRequestMetric2 != NetworkRequestMetric.getDefaultInstance()) {
            this.networkRequestMetric_ = (NetworkRequestMetric) ((w) NetworkRequestMetric.newBuilder(this.networkRequestMetric_).mergeFrom((L2) networkRequestMetric)).buildPartial();
        } else {
            this.networkRequestMetric_ = networkRequestMetric;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        TraceMetric traceMetric2 = this.traceMetric_;
        if (traceMetric2 != null && traceMetric2 != TraceMetric.getDefaultInstance()) {
            this.traceMetric_ = (TraceMetric) ((J) TraceMetric.newBuilder(this.traceMetric_).mergeFrom((L2) traceMetric)).buildPartial();
        } else {
            this.traceMetric_ = traceMetric;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        TransportInfo transportInfo2 = this.transportInfo_;
        if (transportInfo2 != null && transportInfo2 != TransportInfo.getDefaultInstance()) {
            this.transportInfo_ = (TransportInfo) ((O) TransportInfo.newBuilder(this.transportInfo_).mergeFrom((L2) transportInfo)).buildPartial();
        } else {
            this.transportInfo_ = transportInfo;
        }
        this.bitField0_ |= 16;
    }

    public static B newBuilder() {
        return (B) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        this.applicationInfo_ = applicationInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        this.gaugeMetric_ = gaugeMetric;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        this.networkRequestMetric_ = networkRequestMetric;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        this.traceMetric_ = traceMetric;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        this.transportInfo_ = transportInfo;
        this.bitField0_ |= 16;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (A.f20658a[k22.ordinal()]) {
            case 1:
                return new PerfMetric();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (PerfMetric.class) {
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

    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = this.applicationInfo_;
        if (applicationInfo == null) {
            return ApplicationInfo.getDefaultInstance();
        }
        return applicationInfo;
    }

    @Override // i5.C
    public GaugeMetric getGaugeMetric() {
        GaugeMetric gaugeMetric = this.gaugeMetric_;
        if (gaugeMetric == null) {
            return GaugeMetric.getDefaultInstance();
        }
        return gaugeMetric;
    }

    @Override // i5.C
    public NetworkRequestMetric getNetworkRequestMetric() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        if (networkRequestMetric == null) {
            return NetworkRequestMetric.getDefaultInstance();
        }
        return networkRequestMetric;
    }

    @Override // i5.C
    public TraceMetric getTraceMetric() {
        TraceMetric traceMetric = this.traceMetric_;
        if (traceMetric == null) {
            return TraceMetric.getDefaultInstance();
        }
        return traceMetric;
    }

    public TransportInfo getTransportInfo() {
        TransportInfo transportInfo = this.transportInfo_;
        if (transportInfo == null) {
            return TransportInfo.getDefaultInstance();
        }
        return transportInfo;
    }

    public boolean hasApplicationInfo() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // i5.C
    public boolean hasGaugeMetric() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // i5.C
    public boolean hasNetworkRequestMetric() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // i5.C
    public boolean hasTraceMetric() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasTransportInfo() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public static B newBuilder(PerfMetric perfMetric) {
        return (B) DEFAULT_INSTANCE.createBuilder(perfMetric);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (PerfMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static PerfMetric parseFrom(H h6) throws C1912g3 {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static PerfMetric parseFrom(H h6, W1 w1) throws C1912g3 {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static PerfMetric parseFrom(byte[] bArr) throws C1912g3 {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfMetric parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static PerfMetric parseFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static PerfMetric parseFrom(S s5) throws IOException {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static PerfMetric parseFrom(S s5, W1 w1) throws IOException {
        return (PerfMetric) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
