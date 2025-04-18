package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Struct extends o3 implements v7 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile m6 PARSER;
    private h5 fields_ = h5.emptyMapField();

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        o3.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private h5 internalGetFields() {
        return this.fields_;
    }

    private h5 internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static t7 newBuilder() {
        return (t7) DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.v7
    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        s7 s7Var = null;
        switch (s7.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Struct();
            case 2:
                return new t7(s7Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", u7.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Struct.class) {
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

    @Override // com.google.protobuf.v7
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.v7
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // com.google.protobuf.v7
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // com.google.protobuf.v7
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        h5 internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(str)) {
            return (Value) internalGetFields.get(str);
        }
        return value;
    }

    @Override // com.google.protobuf.v7
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        h5 internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(str)) {
            return (Value) internalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static t7 newBuilder(Struct struct) {
        return (t7) DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Struct) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Struct parseFrom(h0 h0Var) throws h4 {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Struct parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Struct parseFrom(byte[] bArr) throws h4 {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Struct parseFrom(r0 r0Var) throws IOException {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Struct parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Struct) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
