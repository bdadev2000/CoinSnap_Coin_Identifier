package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class FieldMask extends o3 implements s2 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private e4 paths_ = o3.emptyProtobufList();

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        o3.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        c.addAll((Iterable) iterable, (List) this.paths_);
    }

    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    public void addPathsBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        ensurePathsIsMutable();
        this.paths_.add(h0Var.toStringUtf8());
    }

    public void clearPaths() {
        this.paths_ = o3.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        e4 e4Var = this.paths_;
        if (!e4Var.isModifiable()) {
            this.paths_ = o3.mutableCopy(e4Var);
        }
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r2 newBuilder() {
        return (r2) DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setPaths(int i10, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i10, str);
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (q2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new FieldMask();
            case 2:
                return new r2(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (FieldMask.class) {
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

    @Override // com.google.protobuf.s2
    public String getPaths(int i10) {
        return (String) this.paths_.get(i10);
    }

    @Override // com.google.protobuf.s2
    public h0 getPathsBytes(int i10) {
        return h0.copyFromUtf8((String) this.paths_.get(i10));
    }

    @Override // com.google.protobuf.s2
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // com.google.protobuf.s2
    public List<String> getPathsList() {
        return this.paths_;
    }

    public static r2 newBuilder(FieldMask fieldMask) {
        return (r2) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (FieldMask) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static FieldMask parseFrom(h0 h0Var) throws h4 {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static FieldMask parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static FieldMask parseFrom(byte[] bArr) throws h4 {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static FieldMask parseFrom(r0 r0Var) throws IOException {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static FieldMask parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (FieldMask) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
