package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class DoubleValue extends L2 implements F1 {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        L2.registerDefaultInstance(DoubleValue.class, doubleValue);
    }

    private DoubleValue() {
    }

    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static E1 newBuilder() {
        return (E1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DoubleValue of(double d2) {
        return (DoubleValue) newBuilder().setValue(d2).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(double d2) {
        this.value_ = d2;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (D1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DoubleValue();
            case 2:
                return new E1(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DoubleValue.class) {
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

    @Override // com.google.protobuf.F1
    public double getValue() {
        return this.value_;
    }

    public static E1 newBuilder(DoubleValue doubleValue) {
        return (E1) DEFAULT_INSTANCE.createBuilder(doubleValue);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DoubleValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DoubleValue parseFrom(H h6) throws C1912g3 {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DoubleValue parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DoubleValue parseFrom(byte[] bArr) throws C1912g3 {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DoubleValue parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DoubleValue parseFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DoubleValue parseFrom(S s5) throws IOException {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DoubleValue parseFrom(S s5, W1 w1) throws IOException {
        return (DoubleValue) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
