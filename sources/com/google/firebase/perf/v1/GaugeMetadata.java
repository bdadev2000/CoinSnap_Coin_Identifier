package com.google.firebase.perf.v1;

import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import i5.AbstractC2359n;
import i5.C2360o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class GaugeMetadata extends L2 implements O3 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final GaugeMetadata DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        GaugeMetadata gaugeMetadata = new GaugeMetadata();
        DEFAULT_INSTANCE = gaugeMetadata;
        L2.registerDefaultInstance(GaugeMetadata.class, gaugeMetadata);
    }

    private GaugeMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuClockRateKhz() {
        this.bitField0_ &= -3;
        this.cpuClockRateKhz_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuProcessorCount() {
        this.bitField0_ &= -5;
        this.cpuProcessorCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceRamSizeKb() {
        this.bitField0_ &= -9;
        this.deviceRamSizeKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAppJavaHeapMemoryKb() {
        this.bitField0_ &= -17;
        this.maxAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxEncouragedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -33;
        this.maxEncouragedAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessName() {
        this.bitField0_ &= -2;
        this.processName_ = getDefaultInstance().getProcessName();
    }

    public static GaugeMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2360o newBuilder() {
        return (C2360o) DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GaugeMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuClockRateKhz(int i9) {
        this.bitField0_ |= 2;
        this.cpuClockRateKhz_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuProcessorCount(int i9) {
        this.bitField0_ |= 4;
        this.cpuProcessorCount_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceRamSizeKb(int i9) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAppJavaHeapMemoryKb(int i9) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxEncouragedAppJavaHeapMemoryKb(int i9) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessNameBytes(H h6) {
        this.processName_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2359n.f20687a[k22.ordinal()]) {
            case 1:
                return new GaugeMetadata();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (GaugeMetadata.class) {
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

    public int getCpuClockRateKhz() {
        return this.cpuClockRateKhz_;
    }

    public int getCpuProcessorCount() {
        return this.cpuProcessorCount_;
    }

    public int getDeviceRamSizeKb() {
        return this.deviceRamSizeKb_;
    }

    public int getMaxAppJavaHeapMemoryKb() {
        return this.maxAppJavaHeapMemoryKb_;
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return this.maxEncouragedAppJavaHeapMemoryKb_;
    }

    @Deprecated
    public String getProcessName() {
        return this.processName_;
    }

    @Deprecated
    public H getProcessNameBytes() {
        return H.copyFromUtf8(this.processName_);
    }

    public boolean hasCpuClockRateKhz() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasCpuProcessorCount() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasDeviceRamSizeKb() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasMaxAppJavaHeapMemoryKb() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasProcessName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static C2360o newBuilder(GaugeMetadata gaugeMetadata) {
        return (C2360o) DEFAULT_INSTANCE.createBuilder(gaugeMetadata);
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (GaugeMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static GaugeMetadata parseFrom(H h6) throws C1912g3 {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static GaugeMetadata parseFrom(H h6, W1 w1) throws C1912g3 {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static GaugeMetadata parseFrom(byte[] bArr) throws C1912g3 {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetadata parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream) throws IOException {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static GaugeMetadata parseFrom(S s5) throws IOException {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static GaugeMetadata parseFrom(S s5, W1 w1) throws IOException {
        return (GaugeMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
