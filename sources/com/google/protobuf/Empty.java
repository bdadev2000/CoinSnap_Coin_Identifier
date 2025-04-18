package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Empty extends o3 implements p1 {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile m6 PARSER;

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        o3.registerDefaultInstance(Empty.class, empty);
    }

    private Empty() {
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o1 newBuilder() {
        return (o1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Empty) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (n1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Empty();
            case 2:
                return new o1(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Empty.class) {
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

    public static o1 newBuilder(Empty empty) {
        return (o1) DEFAULT_INSTANCE.createBuilder(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Empty) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Empty parseFrom(h0 h0Var) throws h4 {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Empty parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Empty parseFrom(byte[] bArr) throws h4 {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Empty parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Empty parseFrom(InputStream inputStream) throws IOException {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Empty parseFrom(r0 r0Var) throws IOException {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Empty parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Empty) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
