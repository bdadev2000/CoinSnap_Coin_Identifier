package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class DoubleValue extends o3 implements j1 {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        o3.registerDefaultInstance(DoubleValue.class, doubleValue);
    }

    private DoubleValue() {
    }

    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i1 newBuilder() {
        return (i1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DoubleValue of(double d10) {
        return (DoubleValue) newBuilder().setValue(d10).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(double d10) {
        this.value_ = d10;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (h1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new DoubleValue();
            case 2:
                return new i1(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (DoubleValue.class) {
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

    @Override // com.google.protobuf.j1
    public double getValue() {
        return this.value_;
    }

    public static i1 newBuilder(DoubleValue doubleValue) {
        return (i1) DEFAULT_INSTANCE.createBuilder(doubleValue);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (DoubleValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static DoubleValue parseFrom(h0 h0Var) throws h4 {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static DoubleValue parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static DoubleValue parseFrom(byte[] bArr) throws h4 {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DoubleValue parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static DoubleValue parseFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static DoubleValue parseFrom(r0 r0Var) throws IOException {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static DoubleValue parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (DoubleValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
