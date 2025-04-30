package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class StringValue extends L2 implements Q4 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        L2.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static P4 newBuilder() {
        return (P4) DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue of(String str) {
        return (StringValue) newBuilder().setValue(str).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    public void setValueBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.value_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (O4.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new StringValue();
            case 2:
                return new P4(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (StringValue.class) {
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

    @Override // com.google.protobuf.Q4
    public String getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.Q4
    public H getValueBytes() {
        return H.copyFromUtf8(this.value_);
    }

    public static P4 newBuilder(StringValue stringValue) {
        return (P4) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (StringValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static StringValue parseFrom(H h6) throws C1912g3 {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static StringValue parseFrom(H h6, W1 w1) throws C1912g3 {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static StringValue parseFrom(byte[] bArr) throws C1912g3 {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static StringValue parseFrom(S s5) throws IOException {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static StringValue parseFrom(S s5, W1 w1) throws IOException {
        return (StringValue) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
