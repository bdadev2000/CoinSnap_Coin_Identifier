package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class FieldMask extends L2 implements InterfaceC1967o2 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private InterfaceC1891d3 paths_ = L2.emptyProtobufList();

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        L2.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.paths_);
    }

    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    public void addPathsBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensurePathsIsMutable();
        this.paths_.add(h6.toStringUtf8());
    }

    public void clearPaths() {
        this.paths_ = L2.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.paths_;
        if (!interfaceC1891d3.isModifiable()) {
            this.paths_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1960n2 newBuilder() {
        return (C1960n2) DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setPaths(int i9, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i9, str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC1953m2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new FieldMask();
            case 2:
                return new C1960n2(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (FieldMask.class) {
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

    @Override // com.google.protobuf.InterfaceC1967o2
    public String getPaths(int i9) {
        return (String) this.paths_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1967o2
    public H getPathsBytes(int i9) {
        return H.copyFromUtf8((String) this.paths_.get(i9));
    }

    @Override // com.google.protobuf.InterfaceC1967o2
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // com.google.protobuf.InterfaceC1967o2
    public List<String> getPathsList() {
        return this.paths_;
    }

    public static C1960n2 newBuilder(FieldMask fieldMask) {
        return (C1960n2) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (FieldMask) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static FieldMask parseFrom(H h6) throws C1912g3 {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static FieldMask parseFrom(H h6, W1 w1) throws C1912g3 {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static FieldMask parseFrom(byte[] bArr) throws C1912g3 {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static FieldMask parseFrom(S s5) throws IOException {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static FieldMask parseFrom(S s5, W1 w1) throws IOException {
        return (FieldMask) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
