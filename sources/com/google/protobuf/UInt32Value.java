package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class UInt32Value extends L2 implements InterfaceC1956m5 {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        L2.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }

    private UInt32Value() {
    }

    public void clearValue() {
        this.value_ = 0;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1949l5 newBuilder() {
        return (C1949l5) DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt32Value of(int i9) {
        return (UInt32Value) newBuilder().setValue(i9).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(int i9) {
        this.value_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC1942k5.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new UInt32Value();
            case 2:
                return new C1949l5(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (UInt32Value.class) {
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

    @Override // com.google.protobuf.InterfaceC1956m5
    public int getValue() {
        return this.value_;
    }

    public static C1949l5 newBuilder(UInt32Value uInt32Value) {
        return (C1949l5) DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (UInt32Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static UInt32Value parseFrom(H h6) throws C1912g3 {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static UInt32Value parseFrom(H h6, W1 w1) throws C1912g3 {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static UInt32Value parseFrom(byte[] bArr) throws C1912g3 {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static UInt32Value parseFrom(S s5) throws IOException {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static UInt32Value parseFrom(S s5, W1 w1) throws IOException {
        return (UInt32Value) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
