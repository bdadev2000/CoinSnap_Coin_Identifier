package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class UInt32Value extends o3 implements n8 {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        o3.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }

    private UInt32Value() {
    }

    public void clearValue() {
        this.value_ = 0;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m8 newBuilder() {
        return (m8) DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt32Value of(int i10) {
        return (UInt32Value) newBuilder().setValue(i10).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(int i10) {
        this.value_ = i10;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (l8.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new UInt32Value();
            case 2:
                return new m8(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (UInt32Value.class) {
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

    @Override // com.google.protobuf.n8
    public int getValue() {
        return this.value_;
    }

    public static m8 newBuilder(UInt32Value uInt32Value) {
        return (m8) DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (UInt32Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static UInt32Value parseFrom(h0 h0Var) throws h4 {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static UInt32Value parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static UInt32Value parseFrom(byte[] bArr) throws h4 {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static UInt32Value parseFrom(r0 r0Var) throws IOException {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static UInt32Value parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (UInt32Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
