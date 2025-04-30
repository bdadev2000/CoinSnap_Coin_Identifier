package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Timestamp extends L2 implements InterfaceC1914g5 {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        L2.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    public void clearNanos() {
        this.nanos_ = 0;
    }

    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1907f5 newBuilder() {
        return (C1907f5) DEFAULT_INSTANCE.createBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Timestamp) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setNanos(int i9) {
        this.nanos_ = i9;
    }

    public void setSeconds(long j7) {
        this.seconds_ = j7;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC1900e5.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Timestamp();
            case 2:
                return new C1907f5(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Timestamp.class) {
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

    @Override // com.google.protobuf.InterfaceC1914g5
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.InterfaceC1914g5
    public long getSeconds() {
        return this.seconds_;
    }

    public static C1907f5 newBuilder(Timestamp timestamp) {
        return (C1907f5) DEFAULT_INSTANCE.createBuilder(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Timestamp) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Timestamp parseFrom(H h6) throws C1912g3 {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Timestamp parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Timestamp parseFrom(byte[] bArr) throws C1912g3 {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Timestamp parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Timestamp parseFrom(S s5) throws IOException {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Timestamp parseFrom(S s5, W1 w1) throws IOException {
        return (Timestamp) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
