package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class BytesValue extends L2 implements K {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private H value_ = H.EMPTY;

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        L2.registerDefaultInstance(BytesValue.class, bytesValue);
    }

    private BytesValue() {
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static J newBuilder() {
        return (J) DEFAULT_INSTANCE.createBuilder();
    }

    public static BytesValue of(H h6) {
        return (BytesValue) newBuilder().setValue(h6).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BytesValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(H h6) {
        h6.getClass();
        this.value_ = h6;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (I.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new BytesValue();
            case 2:
                return new J(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (BytesValue.class) {
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

    @Override // com.google.protobuf.K
    public H getValue() {
        return this.value_;
    }

    public static J newBuilder(BytesValue bytesValue) {
        return (J) DEFAULT_INSTANCE.createBuilder(bytesValue);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BytesValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static BytesValue parseFrom(H h6) throws C1912g3 {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static BytesValue parseFrom(H h6, W1 w1) throws C1912g3 {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static BytesValue parseFrom(byte[] bArr) throws C1912g3 {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BytesValue parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BytesValue parseFrom(S s5) throws IOException {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static BytesValue parseFrom(S s5, W1 w1) throws IOException {
        return (BytesValue) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
