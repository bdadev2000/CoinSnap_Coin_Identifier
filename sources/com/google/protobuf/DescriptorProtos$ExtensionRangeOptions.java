package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$ExtensionRangeOptions extends GeneratedMessageLite$ExtendableMessage<DescriptorProtos$ExtensionRangeOptions, C2034y0> implements InterfaceC2041z0 {
    private static final DescriptorProtos$ExtensionRangeOptions DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private byte memoizedIsInitialized = 2;
    private InterfaceC1891d3 uninterpretedOption_ = L2.emptyProtobufList();

    static {
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = new DescriptorProtos$ExtensionRangeOptions();
        DEFAULT_INSTANCE = descriptorProtos$ExtensionRangeOptions;
        L2.registerDefaultInstance(DescriptorProtos$ExtensionRangeOptions.class, descriptorProtos$ExtensionRangeOptions);
    }

    private DescriptorProtos$ExtensionRangeOptions() {
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
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = L2.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.uninterpretedOption_;
        if (!interfaceC1891d3.isModifiable()) {
            this.uninterpretedOption_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$ExtensionRangeOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2034y0 newBuilder() {
        return (C2034y0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return new DescriptorProtos$ExtensionRangeOptions();
            case 2:
                return new C2034y0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$ExtensionRangeOptions.class) {
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

    @Override // com.google.protobuf.InterfaceC2041z0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return (DescriptorProtos$UninterpretedOption) this.uninterpretedOption_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC2041z0
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC2041z0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public B1 getUninterpretedOptionOrBuilder(int i9) {
        return (B1) this.uninterpretedOption_.get(i9);
    }

    public List<? extends B1> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public static C2034y0 newBuilder(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        return (C2034y0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$ExtensionRangeOptions);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i9, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(S s5) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$ExtensionRangeOptions parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$ExtensionRangeOptions) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
