package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class UInt64Value extends L2 implements InterfaceC1977p5 {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        L2.registerDefaultInstance(UInt64Value.class, uInt64Value);
    }

    private UInt64Value() {
    }

    public void clearValue() {
        this.value_ = 0L;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1970o5 newBuilder() {
        return (C1970o5) DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt64Value of(long j7) {
        return (UInt64Value) newBuilder().setValue(j7).build();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(long j7) {
        this.value_ = j7;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC1963n5.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new UInt64Value();
            case 2:
                return new C1970o5(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (UInt64Value.class) {
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

    @Override // com.google.protobuf.InterfaceC1977p5
    public long getValue() {
        return this.value_;
    }

    public static C1970o5 newBuilder(UInt64Value uInt64Value) {
        return (C1970o5) DEFAULT_INSTANCE.createBuilder(uInt64Value);
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (UInt64Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static UInt64Value parseFrom(H h6) throws C1912g3 {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static UInt64Value parseFrom(H h6, W1 w1) throws C1912g3 {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static UInt64Value parseFrom(byte[] bArr) throws C1912g3 {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt64Value parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static UInt64Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static UInt64Value parseFrom(S s5) throws IOException {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static UInt64Value parseFrom(S s5, W1 w1) throws IOException {
        return (UInt64Value) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
