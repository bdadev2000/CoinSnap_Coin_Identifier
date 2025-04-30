package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Struct extends L2 implements U4 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private G3 fields_ = G3.emptyMapField();

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        L2.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static /* synthetic */ Struct access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ Map access$100(Struct struct) {
        return struct.getMutableFieldsMap();
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private G3 internalGetFields() {
        return this.fields_;
    }

    private G3 internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static S4 newBuilder() {
        return (S4) DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.U4
    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        R4 r42 = null;
        switch (R4.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Struct();
            case 2:
                return new S4(r42);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", T4.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Struct.class) {
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

    @Override // com.google.protobuf.U4
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.U4
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // com.google.protobuf.U4
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // com.google.protobuf.U4
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        G3 internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(str)) {
            return (Value) internalGetFields.get(str);
        }
        return value;
    }

    @Override // com.google.protobuf.U4
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        G3 internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(str)) {
            return (Value) internalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static S4 newBuilder(Struct struct) {
        return (S4) DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Struct) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Struct parseFrom(H h6) throws C1912g3 {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Struct parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Struct parseFrom(byte[] bArr) throws C1912g3 {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Struct parseFrom(S s5) throws IOException {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Struct parseFrom(S s5, W1 w1) throws IOException {
        return (Struct) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
