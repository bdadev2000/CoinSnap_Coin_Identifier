package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$EnumDescriptorProto extends L2 implements InterfaceC1985r0 {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DescriptorProtos$EnumOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private InterfaceC1891d3 value_ = L2.emptyProtobufList();
    private InterfaceC1891d3 reservedRange_ = L2.emptyProtobufList();
    private InterfaceC1891d3 reservedName_ = L2.emptyProtobufList();

    /* loaded from: classes3.dex */
    public static final class EnumReservedRange extends L2 implements InterfaceC1979q0 {
        private static final EnumReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        static {
            EnumReservedRange enumReservedRange = new EnumReservedRange();
            DEFAULT_INSTANCE = enumReservedRange;
            L2.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
        }

        private EnumReservedRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static EnumReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C1972p0 newBuilder() {
            return (C1972p0) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EnumReservedRange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i9) {
            this.bitField0_ |= 2;
            this.end_ = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i9) {
            this.bitField0_ |= 1;
            this.start_ = i9;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            AbstractC1916h0 abstractC1916h0 = null;
            switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
                case 1:
                    return new EnumReservedRange();
                case 2:
                    return new C1972p0(abstractC1916h0);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (EnumReservedRange.class) {
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

        @Override // com.google.protobuf.InterfaceC1979q0
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.InterfaceC1979q0
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC1979q0
        public boolean hasEnd() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC1979q0
        public boolean hasStart() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static C1972p0 newBuilder(EnumReservedRange enumReservedRange) {
            return (C1972p0) DEFAULT_INSTANCE.createBuilder(enumReservedRange);
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (EnumReservedRange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static EnumReservedRange parseFrom(H h6) throws C1912g3 {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static EnumReservedRange parseFrom(H h6, W1 w1) throws C1912g3 {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static EnumReservedRange parseFrom(byte[] bArr) throws C1912g3 {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumReservedRange parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream) throws IOException {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static EnumReservedRange parseFrom(S s5) throws IOException {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static EnumReservedRange parseFrom(S s5, W1 w1) throws IOException {
            return (EnumReservedRange) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$EnumDescriptorProto.class, descriptorProtos$EnumDescriptorProto);
    }

    private DescriptorProtos$EnumDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.reservedRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
        ensureValueIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedName(String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedNameBytes(H h6) {
        ensureReservedNameIsMutable();
        this.reservedName_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(descriptorProtos$EnumValueDescriptorProto);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedName() {
        this.reservedName_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedRange() {
        this.reservedRange_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = L2.emptyProtobufList();
    }

    private void ensureReservedNameIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.reservedName_;
        if (!interfaceC1891d3.isModifiable()) {
            this.reservedName_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureReservedRangeIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.reservedRange_;
        if (!interfaceC1891d3.isModifiable()) {
            this.reservedRange_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureValueIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.value_;
        if (!interfaceC1891d3.isModifiable()) {
            this.value_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static DescriptorProtos$EnumDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2 = this.options_;
        if (descriptorProtos$EnumOptions2 != null && descriptorProtos$EnumOptions2 != DescriptorProtos$EnumOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$EnumOptions) ((C1992s0) DescriptorProtos$EnumOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$EnumOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$EnumOptions;
        }
        this.bitField0_ |= 2;
    }

    public static C1965o0 newBuilder() {
        return (C1965o0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i9) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValue(int i9) {
        ensureValueIsMutable();
        this.value_.remove(i9);
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
    public void setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        this.options_ = descriptorProtos$EnumOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i9, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i9, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i9, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i9, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.set(i9, descriptorProtos$EnumValueDescriptorProto);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$EnumDescriptorProto();
            case 2:
                return new C1965o0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", DescriptorProtos$EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$EnumDescriptorProto.class) {
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

    @Override // com.google.protobuf.InterfaceC1985r0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        if (descriptorProtos$EnumOptions == null) {
            return DescriptorProtos$EnumOptions.getDefaultInstance();
        }
        return descriptorProtos$EnumOptions;
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public String getReservedName(int i9) {
        return (String) this.reservedName_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public H getReservedNameBytes(int i9) {
        return H.copyFromUtf8((String) this.reservedName_.get(i9));
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public List<String> getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public EnumReservedRange getReservedRange(int i9) {
        return (EnumReservedRange) this.reservedRange_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public List<EnumReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public InterfaceC1979q0 getReservedRangeOrBuilder(int i9) {
        return (InterfaceC1979q0) this.reservedRange_.get(i9);
    }

    public List<? extends InterfaceC1979q0> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public DescriptorProtos$EnumValueDescriptorProto getValue(int i9) {
        return (DescriptorProtos$EnumValueDescriptorProto) this.value_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return this.value_;
    }

    public InterfaceC2013v0 getValueOrBuilder(int i9) {
        return (InterfaceC2013v0) this.value_.get(i9);
    }

    public List<? extends InterfaceC2013v0> getValueOrBuilderList() {
        return this.value_;
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public boolean hasOptions() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C1965o0 newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return (C1965o0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i9, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i9, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i9, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(i9, descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$EnumDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
