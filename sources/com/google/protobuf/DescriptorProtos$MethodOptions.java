package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$MethodOptions extends GeneratedMessageLite$ExtendableMessage<DescriptorProtos$MethodOptions, C1917h1> implements InterfaceC1945l1 {
    private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized = 2;
    private InterfaceC1891d3 uninterpretedOption_ = L2.emptyProtobufList();

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = new DescriptorProtos$MethodOptions();
        DEFAULT_INSTANCE = descriptorProtos$MethodOptions;
        L2.registerDefaultInstance(DescriptorProtos$MethodOptions.class, descriptorProtos$MethodOptions);
    }

    private DescriptorProtos$MethodOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -2;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdempotencyLevel() {
        this.bitField0_ &= -3;
        this.idempotencyLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = L2.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.uninterpretedOption_;
        if (!interfaceC1891d3.isModifiable()) {
            this.uninterpretedOption_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$MethodOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1917h1 newBuilder() {
        return (C1917h1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i9) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z8) {
        this.bitField0_ |= 1;
        this.deprecated_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdempotencyLevel(EnumC1938k1 enumC1938k1) {
        this.idempotencyLevel_ = enumC1938k1.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i9, descriptorProtos$UninterpretedOption);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$MethodOptions();
            case 2:
                return new C1917h1(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"ဌ\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", EnumC1938k1.internalGetVerifier(), "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$MethodOptions.class) {
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

    @Override // com.google.protobuf.InterfaceC1945l1
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public EnumC1938k1 getIdempotencyLevel() {
        EnumC1938k1 forNumber = EnumC1938k1.forNumber(this.idempotencyLevel_);
        if (forNumber == null) {
            return EnumC1938k1.IDEMPOTENCY_UNKNOWN;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return (DescriptorProtos$UninterpretedOption) this.uninterpretedOption_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public B1 getUninterpretedOptionOrBuilder(int i9) {
        return (B1) this.uninterpretedOption_.get(i9);
    }

    public List<? extends B1> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public boolean hasDeprecated() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public boolean hasIdempotencyLevel() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C1917h1 newBuilder(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        return (C1917h1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodOptions);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$MethodOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$MethodOptions parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i9, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$MethodOptions parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$MethodOptions parseFrom(S s5) throws IOException {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$MethodOptions parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$MethodOptions) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
