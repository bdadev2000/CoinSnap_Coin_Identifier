package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class FloatValue extends L2 implements A2 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        L2.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2043z2 newBuilder() {
        return (C2043z2) DEFAULT_INSTANCE.createBuilder();
    }

    public static FloatValue of(float f9) {
        return (FloatValue) newBuilder().setValue(f9).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FloatValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(float f9) {
        this.value_ = f9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2036y2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new FloatValue();
            case 2:
                return new C2043z2(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (FloatValue.class) {
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

    @Override // com.google.protobuf.A2
    public float getValue() {
        return this.value_;
    }

    public static C2043z2 newBuilder(FloatValue floatValue) {
        return (C2043z2) DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (FloatValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static FloatValue parseFrom(H h6) throws C1912g3 {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static FloatValue parseFrom(H h6, W1 w1) throws C1912g3 {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static FloatValue parseFrom(byte[] bArr) throws C1912g3 {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static FloatValue parseFrom(InputStream inputStream) throws IOException {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static FloatValue parseFrom(S s5) throws IOException {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static FloatValue parseFrom(S s5, W1 w1) throws IOException {
        return (FloatValue) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
