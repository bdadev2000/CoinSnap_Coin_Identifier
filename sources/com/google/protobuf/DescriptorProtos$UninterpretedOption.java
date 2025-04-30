package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$UninterpretedOption extends L2 implements B1 {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private double doubleValue_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte memoizedIsInitialized = 2;
    private InterfaceC1891d3 name_ = L2.emptyProtobufList();
    private String identifierValue_ = "";
    private H stringValue_ = H.EMPTY;
    private String aggregateValue_ = "";

    /* loaded from: classes3.dex */
    public static final class NamePart extends L2 implements A1 {
        private static final NamePart DEFAULT_INSTANCE;
        public static final int IS_EXTENSION_FIELD_NUMBER = 2;
        public static final int NAME_PART_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER;
        private int bitField0_;
        private boolean isExtension_;
        private byte memoizedIsInitialized = 2;
        private String namePart_ = "";

        static {
            NamePart namePart = new NamePart();
            DEFAULT_INSTANCE = namePart;
            L2.registerDefaultInstance(NamePart.class, namePart);
        }

        private NamePart() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsExtension() {
            this.bitField0_ &= -3;
            this.isExtension_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNamePart() {
            this.bitField0_ &= -2;
            this.namePart_ = getDefaultInstance().getNamePart();
        }

        public static NamePart getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C2042z1 newBuilder() {
            return (C2042z1) DEFAULT_INSTANCE.createBuilder();
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NamePart) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsExtension(boolean z8) {
            this.bitField0_ |= 2;
            this.isExtension_ = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePart(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.namePart_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePartBytes(H h6) {
            this.namePart_ = h6.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            int i9;
            AbstractC1916h0 abstractC1916h0 = null;
            switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
                case 1:
                    return new NamePart();
                case 2:
                    return new C2042z1(abstractC1916h0);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (NamePart.class) {
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

        @Override // com.google.protobuf.A1
        public boolean getIsExtension() {
            return this.isExtension_;
        }

        @Override // com.google.protobuf.A1
        public String getNamePart() {
            return this.namePart_;
        }

        @Override // com.google.protobuf.A1
        public H getNamePartBytes() {
            return H.copyFromUtf8(this.namePart_);
        }

        @Override // com.google.protobuf.A1
        public boolean hasIsExtension() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.A1
        public boolean hasNamePart() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static C2042z1 newBuilder(NamePart namePart) {
            return (C2042z1) DEFAULT_INSTANCE.createBuilder(namePart);
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (NamePart) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static NamePart parseFrom(H h6) throws C1912g3 {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static NamePart parseFrom(H h6, W1 w1) throws C1912g3 {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static NamePart parseFrom(byte[] bArr) throws C1912g3 {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NamePart parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static NamePart parseFrom(InputStream inputStream) throws IOException {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static NamePart parseFrom(S s5) throws IOException {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static NamePart parseFrom(S s5, W1 w1) throws IOException {
            return (NamePart) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = new DescriptorProtos$UninterpretedOption();
        DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption;
        L2.registerDefaultInstance(DescriptorProtos$UninterpretedOption.class, descriptorProtos$UninterpretedOption);
    }

    private DescriptorProtos$UninterpretedOption() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllName(Iterable<? extends NamePart> iterable) {
        ensureNameIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregateValue() {
        this.bitField0_ &= -33;
        this.aggregateValue_ = getDefaultInstance().getAggregateValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.bitField0_ &= -9;
        this.doubleValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifierValue() {
        this.bitField0_ &= -2;
        this.identifierValue_ = getDefaultInstance().getIdentifierValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNegativeIntValue() {
        this.bitField0_ &= -5;
        this.negativeIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositiveIntValue() {
        this.bitField0_ &= -3;
        this.positiveIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -17;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    private void ensureNameIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.name_;
        if (!interfaceC1891d3.isModifiable()) {
            this.name_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$UninterpretedOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2035y1 newBuilder() {
        return (C2035y1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$UninterpretedOption) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeName(int i9) {
        ensureNameIsMutable();
        this.name_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValue(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.aggregateValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValueBytes(H h6) {
        this.aggregateValue_ = h6.toStringUtf8();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d2) {
        this.bitField0_ |= 8;
        this.doubleValue_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValue(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.identifierValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValueBytes(H h6) {
        this.identifierValue_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(int i9, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.set(i9, namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNegativeIntValue(long j7) {
        this.bitField0_ |= 4;
        this.negativeIntValue_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositiveIntValue(long j7) {
        this.bitField0_ |= 2;
        this.positiveIntValue_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(H h6) {
        h6.getClass();
        this.bitField0_ |= 16;
        this.stringValue_ = h6;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$UninterpretedOption();
            case 2:
                return new C2035y1(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$UninterpretedOption.class) {
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

    @Override // com.google.protobuf.B1
    public String getAggregateValue() {
        return this.aggregateValue_;
    }

    @Override // com.google.protobuf.B1
    public H getAggregateValueBytes() {
        return H.copyFromUtf8(this.aggregateValue_);
    }

    @Override // com.google.protobuf.B1
    public double getDoubleValue() {
        return this.doubleValue_;
    }

    @Override // com.google.protobuf.B1
    public String getIdentifierValue() {
        return this.identifierValue_;
    }

    @Override // com.google.protobuf.B1
    public H getIdentifierValueBytes() {
        return H.copyFromUtf8(this.identifierValue_);
    }

    @Override // com.google.protobuf.B1
    public NamePart getName(int i9) {
        return (NamePart) this.name_.get(i9);
    }

    @Override // com.google.protobuf.B1
    public int getNameCount() {
        return this.name_.size();
    }

    @Override // com.google.protobuf.B1
    public List<NamePart> getNameList() {
        return this.name_;
    }

    public A1 getNameOrBuilder(int i9) {
        return (A1) this.name_.get(i9);
    }

    public List<? extends A1> getNameOrBuilderList() {
        return this.name_;
    }

    @Override // com.google.protobuf.B1
    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    @Override // com.google.protobuf.B1
    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    @Override // com.google.protobuf.B1
    public H getStringValue() {
        return this.stringValue_;
    }

    @Override // com.google.protobuf.B1
    public boolean hasAggregateValue() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.B1
    public boolean hasDoubleValue() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.B1
    public boolean hasIdentifierValue() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.B1
    public boolean hasNegativeIntValue() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.B1
    public boolean hasPositiveIntValue() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.B1
    public boolean hasStringValue() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public static C2035y1 newBuilder(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        return (C2035y1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$UninterpretedOption) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(int i9, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(i9, namePart);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(S s5) throws IOException {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$UninterpretedOption) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
