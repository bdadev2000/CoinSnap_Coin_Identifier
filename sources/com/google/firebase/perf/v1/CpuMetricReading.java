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
import i5.AbstractC2356k;
import i5.C2357l;
import i5.InterfaceC2358m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class CpuMetricReading extends L2 implements InterfaceC2358m {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final CpuMetricReading DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        CpuMetricReading cpuMetricReading = new CpuMetricReading();
        DEFAULT_INSTANCE = cpuMetricReading;
        L2.registerDefaultInstance(CpuMetricReading.class, cpuMetricReading);
    }

    private CpuMetricReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemTimeUs() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserTimeUs() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0L;
    }

    public static CpuMetricReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2357l newBuilder() {
        return (C2357l) DEFAULT_INSTANCE.createBuilder();
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CpuMetricReading) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimeUs(long j7) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemTimeUs(long j7) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserTimeUs(long j7) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j7;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2356k.f20686a[k22.ordinal()]) {
            case 1:
                return new CpuMetricReading();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (CpuMetricReading.class) {
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

    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    public long getSystemTimeUs() {
        return this.systemTimeUs_;
    }

    public long getUserTimeUs() {
        return this.userTimeUs_;
    }

    public boolean hasClientTimeUs() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasSystemTimeUs() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasUserTimeUs() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C2357l newBuilder(CpuMetricReading cpuMetricReading) {
        return (C2357l) DEFAULT_INSTANCE.createBuilder(cpuMetricReading);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (CpuMetricReading) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static CpuMetricReading parseFrom(H h6) throws C1912g3 {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static CpuMetricReading parseFrom(H h6, W1 w1) throws C1912g3 {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static CpuMetricReading parseFrom(byte[] bArr) throws C1912g3 {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CpuMetricReading parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream) throws IOException {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static CpuMetricReading parseFrom(S s5) throws IOException {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static CpuMetricReading parseFrom(S s5, W1 w1) throws IOException {
        return (CpuMetricReading) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
