package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Empty extends L2 implements L1 {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER;

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        L2.registerDefaultInstance(Empty.class, empty);
    }

    private Empty() {
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static K1 newBuilder() {
        return (K1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Empty) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (J1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Empty();
            case 2:
                return new K1(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Empty.class) {
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

    public static K1 newBuilder(Empty empty) {
        return (K1) DEFAULT_INSTANCE.createBuilder(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Empty) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Empty parseFrom(H h6) throws C1912g3 {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Empty parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Empty parseFrom(byte[] bArr) throws C1912g3 {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Empty parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Empty parseFrom(InputStream inputStream) throws IOException {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Empty parseFrom(S s5) throws IOException {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Empty parseFrom(S s5, W1 w1) throws IOException {
        return (Empty) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
