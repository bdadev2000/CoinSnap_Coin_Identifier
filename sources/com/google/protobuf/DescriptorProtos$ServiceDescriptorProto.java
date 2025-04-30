package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$ServiceDescriptorProto extends L2 implements InterfaceC1986r1 {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER;
    private int bitField0_;
    private DescriptorProtos$ServiceOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private InterfaceC1891d3 method_ = L2.emptyProtobufList();

    static {
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$ServiceDescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$ServiceDescriptorProto.class, descriptorProtos$ServiceDescriptorProto);
    }

    private DescriptorProtos$ServiceDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
        ensureMethodIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.method_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(descriptorProtos$MethodDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureMethodIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.method_;
        if (!interfaceC1891d3.isModifiable()) {
            this.method_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$ServiceDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2 = this.options_;
        if (descriptorProtos$ServiceOptions2 != null && descriptorProtos$ServiceOptions2 != DescriptorProtos$ServiceOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$ServiceOptions) ((C1993s1) DescriptorProtos$ServiceOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$ServiceOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$ServiceOptions;
        }
        this.bitField0_ |= 2;
    }

    public static C1980q1 newBuilder() {
        return (C1980q1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethod(int i9) {
        ensureMethodIsMutable();
        this.method_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(int i9, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.set(i9, descriptorProtos$MethodDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(H h6) {
        this.name_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        this.options_ = descriptorProtos$ServiceOptions;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$ServiceDescriptorProto();
            case 2:
                return new C1980q1(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", DescriptorProtos$MethodDescriptorProto.class, "options_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$ServiceDescriptorProto.class) {
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

    @Override // com.google.protobuf.InterfaceC1986r1
    public DescriptorProtos$MethodDescriptorProto getMethod(int i9) {
        return (DescriptorProtos$MethodDescriptorProto) this.method_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public int getMethodCount() {
        return this.method_.size();
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return this.method_;
    }

    public InterfaceC1910g1 getMethodOrBuilder(int i9) {
        return (InterfaceC1910g1) this.method_.get(i9);
    }

    public List<? extends InterfaceC1910g1> getMethodOrBuilderList() {
        return this.method_;
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        if (descriptorProtos$ServiceOptions == null) {
            return DescriptorProtos$ServiceOptions.getDefaultInstance();
        }
        return descriptorProtos$ServiceOptions;
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1986r1
    public boolean hasOptions() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C1980q1 newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return (C1980q1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(int i9, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(i9, descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$ServiceDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
