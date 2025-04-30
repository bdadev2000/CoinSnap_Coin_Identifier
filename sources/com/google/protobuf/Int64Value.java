package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Int64Value extends L2 implements R2 {
    private static final Int64Value DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        Int64Value int64Value = new Int64Value();
        DEFAULT_INSTANCE = int64Value;
        L2.registerDefaultInstance(Int64Value.class, int64Value);
    }

    private Int64Value() {
    }

    public void clearValue() {
        this.value_ = 0L;
    }

    public static Int64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Q2 newBuilder() {
        return (Q2) DEFAULT_INSTANCE.createBuilder();
    }

    public static Int64Value of(long j7) {
        return (Int64Value) newBuilder().setValue(j7).build();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int64Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(long j7) {
        this.value_ = j7;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (P2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Int64Value();
            case 2:
                return new Q2(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Int64Value.class) {
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

    @Override // com.google.protobuf.R2
    public long getValue() {
        return this.value_;
    }

    public static Q2 newBuilder(Int64Value int64Value) {
        return (Q2) DEFAULT_INSTANCE.createBuilder(int64Value);
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Int64Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Int64Value parseFrom(H h6) throws C1912g3 {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Int64Value parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Int64Value parseFrom(byte[] bArr) throws C1912g3 {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int64Value parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Int64Value parseFrom(InputStream inputStream) throws IOException {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Int64Value parseFrom(S s5) throws IOException {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Int64Value parseFrom(S s5, W1 w1) throws IOException {
        return (Int64Value) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
