package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class FloatValue extends o3 implements e3 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        o3.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d3 newBuilder() {
        return (d3) DEFAULT_INSTANCE.createBuilder();
    }

    public static FloatValue of(float f10) {
        return (FloatValue) newBuilder().setValue(f10).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FloatValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(float f10) {
        this.value_ = f10;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (c3.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new FloatValue();
            case 2:
                return new d3(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (FloatValue.class) {
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

    @Override // com.google.protobuf.e3
    public float getValue() {
        return this.value_;
    }

    public static d3 newBuilder(FloatValue floatValue) {
        return (d3) DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (FloatValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static FloatValue parseFrom(h0 h0Var) throws h4 {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static FloatValue parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static FloatValue parseFrom(byte[] bArr) throws h4 {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static FloatValue parseFrom(InputStream inputStream) throws IOException {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static FloatValue parseFrom(r0 r0Var) throws IOException {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static FloatValue parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (FloatValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
