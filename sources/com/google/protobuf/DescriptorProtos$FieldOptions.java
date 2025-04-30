package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$FieldOptions extends GeneratedMessageLite$ExtendableMessage<DescriptorProtos$FieldOptions, I0> implements P0 {
    public static final int CTYPE_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FieldOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int WEAK_FIELD_NUMBER = 10;
    private int bitField0_;
    private int ctype_;
    private boolean deprecated_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    private boolean weak_;
    private byte memoizedIsInitialized = 2;
    private InterfaceC1891d3 uninterpretedOption_ = L2.emptyProtobufList();

    static {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions();
        DEFAULT_INSTANCE = descriptorProtos$FieldOptions;
        L2.registerDefaultInstance(DescriptorProtos$FieldOptions.class, descriptorProtos$FieldOptions);
    }

    private DescriptorProtos$FieldOptions() {
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
    public void clearCtype() {
        this.bitField0_ &= -2;
        this.ctype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -17;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJstype() {
        this.bitField0_ &= -5;
        this.jstype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLazy() {
        this.bitField0_ &= -9;
        this.lazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.bitField0_ &= -3;
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeak() {
        this.bitField0_ &= -33;
        this.weak_ = false;
    }

    private void ensureUninterpretedOptionIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.uninterpretedOption_;
        if (!interfaceC1891d3.isModifiable()) {
            this.uninterpretedOption_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$FieldOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static I0 newBuilder() {
        return (I0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setCtype(L0 l02) {
        this.ctype_ = l02.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z8) {
        this.bitField0_ |= 16;
        this.deprecated_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJstype(O0 o02) {
        this.jstype_ = o02.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLazy(boolean z8) {
        this.bitField0_ |= 8;
        this.lazy_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z8) {
        this.bitField0_ |= 2;
        this.packed_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i9, descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeak(boolean z8) {
        this.bitField0_ |= 32;
        this.weak_ = z8;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$FieldOptions();
            case 2:
                return new I0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", L0.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", O0.internalGetVerifier(), "weak_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$FieldOptions.class) {
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

    @Override // com.google.protobuf.P0
    public L0 getCtype() {
        L0 forNumber = L0.forNumber(this.ctype_);
        if (forNumber == null) {
            return L0.STRING;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.P0
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.P0
    public O0 getJstype() {
        O0 forNumber = O0.forNumber(this.jstype_);
        if (forNumber == null) {
            return O0.JS_NORMAL;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.P0
    public boolean getLazy() {
        return this.lazy_;
    }

    @Override // com.google.protobuf.P0
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.P0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return (DescriptorProtos$UninterpretedOption) this.uninterpretedOption_.get(i9);
    }

    @Override // com.google.protobuf.P0
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.P0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public B1 getUninterpretedOptionOrBuilder(int i9) {
        return (B1) this.uninterpretedOption_.get(i9);
    }

    public List<? extends B1> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.P0
    public boolean getWeak() {
        return this.weak_;
    }

    @Override // com.google.protobuf.P0
    public boolean hasCtype() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.P0
    public boolean hasDeprecated() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.P0
    public boolean hasJstype() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.P0
    public boolean hasLazy() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.P0
    public boolean hasPacked() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.P0
    public boolean hasWeak() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public static I0 newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return (I0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FieldOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$FieldOptions parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i9, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FieldOptions parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FieldOptions parseFrom(S s5) throws IOException {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$FieldOptions parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$FieldOptions) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
