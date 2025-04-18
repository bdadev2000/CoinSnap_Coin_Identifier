package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class BoolValue extends o3 implements r {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        o3.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static BoolValue of(boolean z10) {
        return (BoolValue) newBuilder().setValue(z10).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BoolValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(boolean z10) {
        this.value_ = z10;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (p.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new BoolValue();
            case 2:
                return new q(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (BoolValue.class) {
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

    @Override // com.google.protobuf.r
    public boolean getValue() {
        return this.value_;
    }

    public static q newBuilder(BoolValue boolValue) {
        return (q) DEFAULT_INSTANCE.createBuilder(boolValue);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (BoolValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static BoolValue parseFrom(h0 h0Var) throws h4 {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static BoolValue parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static BoolValue parseFrom(byte[] bArr) throws h4 {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static BoolValue parseFrom(InputStream inputStream) throws IOException {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static BoolValue parseFrom(r0 r0Var) throws IOException {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static BoolValue parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (BoolValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
