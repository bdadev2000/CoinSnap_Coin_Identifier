package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$FileDescriptorSet extends L2 implements T0 {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private byte memoizedIsInitialized = 2;
    private InterfaceC1891d3 file_ = L2.emptyProtobufList();

    static {
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorSet;
        L2.registerDefaultInstance(DescriptorProtos$FileDescriptorSet.class, descriptorProtos$FileDescriptorSet);
    }

    private DescriptorProtos$FileDescriptorSet() {
    }

    public void addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
        ensureFileIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.file_);
    }

    public void addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(descriptorProtos$FileDescriptorProto);
    }

    public void clearFile() {
        this.file_ = L2.emptyProtobufList();
    }

    private void ensureFileIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.file_;
        if (!interfaceC1891d3.isModifiable()) {
            this.file_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static S0 newBuilder() {
        return (S0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeFile(int i9) {
        ensureFileIsMutable();
        this.file_.remove(i9);
    }

    public void setFile(int i9, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.set(i9, descriptorProtos$FileDescriptorProto);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileDescriptorSet();
            case 2:
                return new S0(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", DescriptorProtos$FileDescriptorProto.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$FileDescriptorSet.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                if (obj == null) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                this.memoizedIsInitialized = (byte) i9;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.T0
    public DescriptorProtos$FileDescriptorProto getFile(int i9) {
        return (DescriptorProtos$FileDescriptorProto) this.file_.get(i9);
    }

    @Override // com.google.protobuf.T0
    public int getFileCount() {
        return this.file_.size();
    }

    @Override // com.google.protobuf.T0
    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return this.file_;
    }

    public R0 getFileOrBuilder(int i9) {
        return (R0) this.file_.get(i9);
    }

    public List<? extends R0> getFileOrBuilderList() {
        return this.file_;
    }

    public static S0 newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return (S0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public void addFile(int i9, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(i9, descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(S s5) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$FileDescriptorSet) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
