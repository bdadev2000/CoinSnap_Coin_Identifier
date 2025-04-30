package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Duration extends L2 implements I1 {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Duration duration = new Duration();
        DEFAULT_INSTANCE = duration;
        L2.registerDefaultInstance(Duration.class, duration);
    }

    private Duration() {
    }

    public void clearNanos() {
        this.nanos_ = 0;
    }

    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static H1 newBuilder() {
        return (H1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Duration) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        switch (G1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Duration();
            case 2:
                return new H1(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Duration.class) {
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

    @Override // com.google.protobuf.I1
    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.I1
    public long getSeconds() {
        return this.seconds_;
    }

    public static H1 newBuilder(Duration duration) {
        return (H1) DEFAULT_INSTANCE.createBuilder(duration);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Duration) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Duration parseFrom(H h6) throws C1912g3 {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Duration parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Duration parseFrom(byte[] bArr) throws C1912g3 {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Duration parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Duration parseFrom(InputStream inputStream) throws IOException {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Duration parseFrom(S s5) throws IOException {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Duration parseFrom(S s5, W1 w1) throws IOException {
        return (Duration) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
