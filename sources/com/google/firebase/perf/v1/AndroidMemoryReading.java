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
import i5.AbstractC2348c;
import i5.C2349d;
import i5.InterfaceC2350e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class AndroidMemoryReading extends L2 implements InterfaceC2350e {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final AndroidMemoryReading DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        AndroidMemoryReading androidMemoryReading = new AndroidMemoryReading();
        DEFAULT_INSTANCE = androidMemoryReading;
        L2.registerDefaultInstance(AndroidMemoryReading.class, androidMemoryReading);
    }

    private AndroidMemoryReading() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static AndroidMemoryReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2349d newBuilder() {
        return (C2349d) DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AndroidMemoryReading) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setUsedAppJavaHeapMemoryKb(int i9) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2348c.f20671a[k22.ordinal()]) {
            case 1:
                return new AndroidMemoryReading();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AndroidMemoryReading.class) {
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

    public int getUsedAppJavaHeapMemoryKb() {
        return this.usedAppJavaHeapMemoryKb_;
    }

    public boolean hasClientTimeUs() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasUsedAppJavaHeapMemoryKb() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C2349d newBuilder(AndroidMemoryReading androidMemoryReading) {
        return (C2349d) DEFAULT_INSTANCE.createBuilder(androidMemoryReading);
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AndroidMemoryReading) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AndroidMemoryReading parseFrom(H h6) throws C1912g3 {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static AndroidMemoryReading parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr) throws C1912g3 {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream) throws IOException {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AndroidMemoryReading parseFrom(S s5) throws IOException {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AndroidMemoryReading parseFrom(S s5, W1 w1) throws IOException {
        return (AndroidMemoryReading) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
