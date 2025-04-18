package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class BytesValue extends o3 implements k0 {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private h0 value_ = h0.EMPTY;

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        o3.registerDefaultInstance(BytesValue.class, bytesValue);
    }

    private BytesValue() {
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j0 newBuilder() {
        return (j0) DEFAULT_INSTANCE.createBuilder();
    }

    public static BytesValue of(h0 h0Var) {
        return (BytesValue) newBuilder().setValue(h0Var).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BytesValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(h0 h0Var) {
        h0Var.getClass();
        this.value_ = h0Var;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (i0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new BytesValue();
            case 2:
                return new j0(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (BytesValue.class) {
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

    @Override // com.google.protobuf.k0
    public h0 getValue() {
        return this.value_;
    }

    public static j0 newBuilder(BytesValue bytesValue) {
        return (j0) DEFAULT_INSTANCE.createBuilder(bytesValue);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (BytesValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static BytesValue parseFrom(h0 h0Var) throws h4 {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static BytesValue parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static BytesValue parseFrom(byte[] bArr) throws h4 {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BytesValue parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static BytesValue parseFrom(r0 r0Var) throws IOException {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static BytesValue parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (BytesValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
