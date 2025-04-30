package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class DescriptorProtos$MethodDescriptorProto extends L2 implements InterfaceC1910g1 {
    public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
    private static final DescriptorProtos$MethodDescriptorProto DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean clientStreaming_;
    private DescriptorProtos$MethodOptions options_;
    private boolean serverStreaming_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String inputType_ = "";
    private String outputType_ = "";

    static {
        DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto = new DescriptorProtos$MethodDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$MethodDescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$MethodDescriptorProto.class, descriptorProtos$MethodDescriptorProto);
    }

    private DescriptorProtos$MethodDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStreaming() {
        this.bitField0_ &= -17;
        this.clientStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputType() {
        this.bitField0_ &= -3;
        this.inputType_ = getDefaultInstance().getInputType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutputType() {
        this.bitField0_ &= -5;
        this.outputType_ = getDefaultInstance().getOutputType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerStreaming() {
        this.bitField0_ &= -33;
        this.serverStreaming_ = false;
    }

    public static DescriptorProtos$MethodDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodOptions.getClass();
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions2 = this.options_;
        if (descriptorProtos$MethodOptions2 != null && descriptorProtos$MethodOptions2 != DescriptorProtos$MethodOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$MethodOptions) ((C1917h1) DescriptorProtos$MethodOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$MethodOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$MethodOptions;
        }
        this.bitField0_ |= 8;
    }

    public static C1903f1 newBuilder() {
        return (C1903f1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStreaming(boolean z8) {
        this.bitField0_ |= 16;
        this.clientStreaming_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputType(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.inputType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputTypeBytes(H h6) {
        this.inputType_ = h6.toStringUtf8();
        this.bitField0_ |= 2;
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
    public void setOptions(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        descriptorProtos$MethodOptions.getClass();
        this.options_ = descriptorProtos$MethodOptions;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputType(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.outputType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputTypeBytes(H h6) {
        this.outputType_ = h6.toStringUtf8();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerStreaming(boolean z8) {
        this.bitField0_ |= 32;
        this.serverStreaming_ = z8;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$MethodDescriptorProto();
            case 2:
                return new C1903f1(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$MethodDescriptorProto.class) {
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

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean getClientStreaming() {
        return this.clientStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public String getInputType() {
        return this.inputType_;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public H getInputTypeBytes() {
        return H.copyFromUtf8(this.inputType_);
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public DescriptorProtos$MethodOptions getOptions() {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = this.options_;
        if (descriptorProtos$MethodOptions == null) {
            return DescriptorProtos$MethodOptions.getDefaultInstance();
        }
        return descriptorProtos$MethodOptions;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public String getOutputType() {
        return this.outputType_;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public H getOutputTypeBytes() {
        return H.copyFromUtf8(this.outputType_);
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean getServerStreaming() {
        return this.serverStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasClientStreaming() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasInputType() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasOptions() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasOutputType() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1910g1
    public boolean hasServerStreaming() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public static C1903f1 newBuilder(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        return (C1903f1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$MethodDescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$MethodDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
