package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Int32Value extends L2 implements O2 {
    private static final Int32Value DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        Int32Value int32Value = new Int32Value();
        DEFAULT_INSTANCE = int32Value;
        L2.registerDefaultInstance(Int32Value.class, int32Value);
    }

    private Int32Value() {
    }

    public void clearValue() {
        this.value_ = 0;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static N2 newBuilder() {
        return (N2) DEFAULT_INSTANCE.createBuilder();
    }

    public static Int32Value of(int i9) {
        return (Int32Value) newBuilder().setValue(i9).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int32Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(int i9) {
        this.value_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (M2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Int32Value();
            case 2:
                return new N2(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Int32Value.class) {
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

    @Override // com.google.protobuf.O2
    public int getValue() {
        return this.value_;
    }

    public static N2 newBuilder(Int32Value int32Value) {
        return (N2) DEFAULT_INSTANCE.createBuilder(int32Value);
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Int32Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Int32Value parseFrom(H h6) throws C1912g3 {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Int32Value parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Int32Value parseFrom(byte[] bArr) throws C1912g3 {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int32Value parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Int32Value parseFrom(InputStream inputStream) throws IOException {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Int32Value parseFrom(S s5) throws IOException {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Int32Value parseFrom(S s5, W1 w1) throws IOException {
        return (Int32Value) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
