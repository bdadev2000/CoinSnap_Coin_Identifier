package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class StringValue extends o3 implements r7 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        o3.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q7 newBuilder() {
        return (q7) DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue of(String str) {
        return (StringValue) newBuilder().setValue(str).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    public void setValueBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.value_ = h0Var.toStringUtf8();
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (p7.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new StringValue();
            case 2:
                return new q7(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (StringValue.class) {
                        m6Var = PARSER;
                        if (m6Var == null) {
                            m6Var = new i3(DEFAULT_INSTANCE);
                            PARSER = m6Var;
                        }
                    }
                }
                return m6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.r7
    public String getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.r7
    public h0 getValueBytes() {
        return h0.copyFromUtf8(this.value_);
    }

    public static q7 newBuilder(StringValue stringValue) {
        return (q7) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (StringValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static StringValue parseFrom(h0 h0Var) throws h4 {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static StringValue parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static StringValue parseFrom(byte[] bArr) throws h4 {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static StringValue parseFrom(r0 r0Var) throws IOException {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static StringValue parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (StringValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
