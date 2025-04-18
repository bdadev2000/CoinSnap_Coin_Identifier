package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Int32Value extends o3 implements r3 {
    private static final Int32Value DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        Int32Value int32Value = new Int32Value();
        DEFAULT_INSTANCE = int32Value;
        o3.registerDefaultInstance(Int32Value.class, int32Value);
    }

    private Int32Value() {
    }

    public void clearValue() {
        this.value_ = 0;
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q3 newBuilder() {
        return (q3) DEFAULT_INSTANCE.createBuilder();
    }

    public static Int32Value of(int i10) {
        return (Int32Value) newBuilder().setValue(i10).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int32Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(int i10) {
        this.value_ = i10;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (p3.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Int32Value();
            case 2:
                return new q3(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Int32Value.class) {
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

    @Override // com.google.protobuf.r3
    public int getValue() {
        return this.value_;
    }

    public static q3 newBuilder(Int32Value int32Value) {
        return (q3) DEFAULT_INSTANCE.createBuilder(int32Value);
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Int32Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Int32Value parseFrom(h0 h0Var) throws h4 {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Int32Value parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Int32Value parseFrom(byte[] bArr) throws h4 {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Int32Value parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Int32Value parseFrom(InputStream inputStream) throws IOException {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Int32Value parseFrom(r0 r0Var) throws IOException {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Int32Value parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Int32Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
