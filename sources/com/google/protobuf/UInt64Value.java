package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class UInt64Value extends o3 implements q8 {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        o3.registerDefaultInstance(UInt64Value.class, uInt64Value);
    }

    private UInt64Value() {
    }

    public void clearValue() {
        this.value_ = 0L;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static p8 newBuilder() {
        return (p8) DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt64Value of(long j3) {
        return (UInt64Value) newBuilder().setValue(j3).build();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(long j3) {
        this.value_ = j3;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (o8.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new UInt64Value();
            case 2:
                return new p8(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (UInt64Value.class) {
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

    @Override // com.google.protobuf.q8
    public long getValue() {
        return this.value_;
    }

    public static p8 newBuilder(UInt64Value uInt64Value) {
        return (p8) DEFAULT_INSTANCE.createBuilder(uInt64Value);
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (UInt64Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static UInt64Value parseFrom(h0 h0Var) throws h4 {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static UInt64Value parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static UInt64Value parseFrom(byte[] bArr) throws h4 {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt64Value parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static UInt64Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static UInt64Value parseFrom(r0 r0Var) throws IOException {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static UInt64Value parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (UInt64Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
