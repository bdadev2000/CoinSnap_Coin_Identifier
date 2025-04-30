package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$MessageOptions extends GeneratedMessageLite$ExtendableMessage<DescriptorProtos$MessageOptions, C1889d1> implements InterfaceC1896e1 {
    private static final DescriptorProtos$MessageOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private boolean mapEntry_;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private byte memoizedIsInitialized = 2;
    private InterfaceC1891d3 uninterpretedOption_ = L2.emptyProtobufList();

    static {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = new DescriptorProtos$MessageOptions();
        DEFAULT_INSTANCE = descriptorProtos$MessageOptions;
        L2.registerDefaultInstance(DescriptorProtos$MessageOptions.class, descriptorProtos$MessageOptions);
    }

    private DescriptorProtos$MessageOptions() {
    }

    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
    }

    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    public void clearDeprecated() {
        this.bitField0_ &= -5;
        this.deprecated_ = false;
    }

    public void clearMapEntry() {
        this.bitField0_ &= -9;
        this.mapEntry_ = false;
    }

    public void clearMessageSetWireFormat() {
        this.bitField0_ &= -2;
        this.messageSetWireFormat_ = false;
    }

    public void clearNoStandardDescriptorAccessor() {
        this.bitField0_ &= -3;
        this.noStandardDescriptorAccessor_ = false;
    }

    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = L2.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.uninterpretedOption_;
        if (!interfaceC1891d3.isModifiable()) {
            this.uninterpretedOption_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$MessageOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1889d1 newBuilder() {
        return (C1889d1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MessageOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeUninterpretedOption(int i9) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i9);
    }

    public void setDeprecated(boolean z8) {
        this.bitField0_ |= 4;
        this.deprecated_ = z8;
    }

    public void setMapEntry(boolean z8) {
        this.bitField0_ |= 8;
        this.mapEntry_ = z8;
    }

    public void setMessageSetWireFormat(boolean z8) {
        this.bitField0_ |= 1;
        this.messageSetWireFormat_ = z8;
    }

    public void setNoStandardDescriptorAccessor(boolean z8) {
        this.bitField0_ |= 2;
        this.noStandardDescriptorAccessor_ = z8;
    }

    public void setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i9, descriptorProtos$UninterpretedOption);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$MessageOptions();
            case 2:
                return new C1889d1(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$MessageOptions.class) {
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

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return (DescriptorProtos$UninterpretedOption) this.uninterpretedOption_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public B1 getUninterpretedOptionOrBuilder(int i9) {
        return (B1) this.uninterpretedOption_.get(i9);
    }

    public List<? extends B1> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasDeprecated() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasMapEntry() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasMessageSetWireFormat() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1896e1
    public boolean hasNoStandardDescriptorAccessor() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C1889d1 newBuilder(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        return (C1889d1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MessageOptions);
    }

    public static DescriptorProtos$MessageOptions parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$MessageOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$MessageOptions parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$MessageOptions parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public void addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i9, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$MessageOptions parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MessageOptions parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MessageOptions parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$MessageOptions parseFrom(S s5) throws IOException {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$MessageOptions parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$MessageOptions) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
