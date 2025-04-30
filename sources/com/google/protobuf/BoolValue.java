package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class BoolValue extends L2 implements r {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        L2.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1978q newBuilder() {
        return (C1978q) DEFAULT_INSTANCE.createBuilder();
    }

    public static BoolValue of(boolean z8) {
        return (BoolValue) newBuilder().setValue(z8).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BoolValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(boolean z8) {
        this.value_ = z8;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC1971p.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new BoolValue();
            case 2:
                return new C1978q(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (BoolValue.class) {
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

    @Override // com.google.protobuf.r
    public boolean getValue() {
        return this.value_;
    }

    public static C1978q newBuilder(BoolValue boolValue) {
        return (C1978q) DEFAULT_INSTANCE.createBuilder(boolValue);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BoolValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static BoolValue parseFrom(H h6) throws C1912g3 {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static BoolValue parseFrom(H h6, W1 w1) throws C1912g3 {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static BoolValue parseFrom(byte[] bArr) throws C1912g3 {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static BoolValue parseFrom(InputStream inputStream) throws IOException {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BoolValue parseFrom(S s5) throws IOException {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static BoolValue parseFrom(S s5, W1 w1) throws IOException {
        return (BoolValue) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
