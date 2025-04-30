package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$DescriptorProto extends L2 implements InterfaceC1958n0 {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 10;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
    private int bitField0_;
    private DescriptorProtos$MessageOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private InterfaceC1891d3 field_ = L2.emptyProtobufList();
    private InterfaceC1891d3 extension_ = L2.emptyProtobufList();
    private InterfaceC1891d3 nestedType_ = L2.emptyProtobufList();
    private InterfaceC1891d3 enumType_ = L2.emptyProtobufList();
    private InterfaceC1891d3 extensionRange_ = L2.emptyProtobufList();
    private InterfaceC1891d3 oneofDecl_ = L2.emptyProtobufList();
    private InterfaceC1891d3 reservedRange_ = L2.emptyProtobufList();
    private InterfaceC1891d3 reservedName_ = L2.emptyProtobufList();

    /* loaded from: classes3.dex */
    public static final class ExtensionRange extends L2 implements InterfaceC1937k0 {
        private static final ExtensionRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized = 2;
        private DescriptorProtos$ExtensionRangeOptions options_;
        private int start_;

        static {
            ExtensionRange extensionRange = new ExtensionRange();
            DEFAULT_INSTANCE = extensionRange;
            L2.registerDefaultInstance(ExtensionRange.class, extensionRange);
        }

        private ExtensionRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static ExtensionRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2 = this.options_;
            if (descriptorProtos$ExtensionRangeOptions2 != null && descriptorProtos$ExtensionRangeOptions2 != DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()) {
                this.options_ = (DescriptorProtos$ExtensionRangeOptions) ((C2034y0) DescriptorProtos$ExtensionRangeOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$ExtensionRangeOptions)).buildPartial();
            } else {
                this.options_ = descriptorProtos$ExtensionRangeOptions;
            }
            this.bitField0_ |= 4;
        }

        public static C1930j0 newBuilder() {
            return (C1930j0) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExtensionRange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        public void setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            this.options_ = descriptorProtos$ExtensionRangeOptions;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i9) {
            this.bitField0_ |= 1;
            this.start_ = i9;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            int i9;
            AbstractC1916h0 abstractC1916h0 = null;
            switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
                case 1:
                    return new ExtensionRange();
                case 2:
                    return new C1930j0(abstractC1916h0);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (ExtensionRange.class) {
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

        @Override // com.google.protobuf.InterfaceC1937k0
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.InterfaceC1937k0
        public DescriptorProtos$ExtensionRangeOptions getOptions() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            if (descriptorProtos$ExtensionRangeOptions == null) {
                return DescriptorProtos$ExtensionRangeOptions.getDefaultInstance();
            }
            return descriptorProtos$ExtensionRangeOptions;
        }

        @Override // com.google.protobuf.InterfaceC1937k0
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC1937k0
        public boolean hasEnd() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC1937k0
        public boolean hasOptions() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC1937k0
        public boolean hasStart() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static C1930j0 newBuilder(ExtensionRange extensionRange) {
            return (C1930j0) DEFAULT_INSTANCE.createBuilder(extensionRange);
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (ExtensionRange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static ExtensionRange parseFrom(H h6) throws C1912g3 {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static ExtensionRange parseFrom(H h6, W1 w1) throws C1912g3 {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static ExtensionRange parseFrom(byte[] bArr) throws C1912g3 {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRange parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static ExtensionRange parseFrom(S s5) throws IOException {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static ExtensionRange parseFrom(S s5, W1 w1) throws IOException {
            return (ExtensionRange) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ReservedRange extends L2 implements InterfaceC1951m0 {
        private static final ReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        static {
            ReservedRange reservedRange = new ReservedRange();
            DEFAULT_INSTANCE = reservedRange;
            L2.registerDefaultInstance(ReservedRange.class, reservedRange);
        }

        private ReservedRange() {
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

        public static ReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C1944l0 newBuilder() {
            return (C1944l0) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReservedRange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                    return new ReservedRange();
                case 2:
                    return new C1944l0(abstractC1916h0);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (ReservedRange.class) {
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

        @Override // com.google.protobuf.InterfaceC1951m0
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.InterfaceC1951m0
        public int getStart() {
            return this.start_;
        }

        @Override // com.google.protobuf.InterfaceC1951m0
        public boolean hasEnd() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC1951m0
        public boolean hasStart() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        public static C1944l0 newBuilder(ReservedRange reservedRange) {
            return (C1944l0) DEFAULT_INSTANCE.createBuilder(reservedRange);
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (ReservedRange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static ReservedRange parseFrom(H h6) throws C1912g3 {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static ReservedRange parseFrom(H h6, W1 w1) throws C1912g3 {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static ReservedRange parseFrom(byte[] bArr) throws C1912g3 {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReservedRange parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static ReservedRange parseFrom(S s5) throws IOException {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static ReservedRange parseFrom(S s5, W1 w1) throws IOException {
            return (ReservedRange) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$DescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$DescriptorProto.class, descriptorProtos$DescriptorProto);
    }

    private DescriptorProtos$DescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
        ensureEnumTypeIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.enumType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureExtensionIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
        ensureExtensionRangeIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.extensionRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureFieldIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.field_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureNestedTypeIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.nestedType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
        ensureOneofDeclIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.oneofDecl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.reservedRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionRange(ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
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
    public void addReservedRange(ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(reservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.enumType_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensionRange() {
        this.extensionRange_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearField() {
        this.field_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestedType() {
        this.nestedType_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofDecl() {
        this.oneofDecl_ = L2.emptyProtobufList();
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

    private void ensureEnumTypeIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.enumType_;
        if (!interfaceC1891d3.isModifiable()) {
            this.enumType_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureExtensionIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.extension_;
        if (!interfaceC1891d3.isModifiable()) {
            this.extension_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureExtensionRangeIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.extensionRange_;
        if (!interfaceC1891d3.isModifiable()) {
            this.extensionRange_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureFieldIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.field_;
        if (!interfaceC1891d3.isModifiable()) {
            this.field_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureNestedTypeIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.nestedType_;
        if (!interfaceC1891d3.isModifiable()) {
            this.nestedType_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureOneofDeclIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.oneofDecl_;
        if (!interfaceC1891d3.isModifiable()) {
            this.oneofDecl_ = L2.mutableCopy(interfaceC1891d3);
        }
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

    public static DescriptorProtos$DescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2 = this.options_;
        if (descriptorProtos$MessageOptions2 != null && descriptorProtos$MessageOptions2 != DescriptorProtos$MessageOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$MessageOptions) ((C1889d1) DescriptorProtos$MessageOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$MessageOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$MessageOptions;
        }
        this.bitField0_ |= 2;
    }

    public static C1923i0 newBuilder() {
        return (C1923i0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$DescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumType(int i9) {
        ensureEnumTypeIsMutable();
        this.enumType_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i9) {
        ensureExtensionIsMutable();
        this.extension_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtensionRange(int i9) {
        ensureExtensionRangeIsMutable();
        this.extensionRange_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeField(int i9) {
        ensureFieldIsMutable();
        this.field_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNestedType(int i9) {
        ensureNestedTypeIsMutable();
        this.nestedType_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOneofDecl(int i9) {
        ensureOneofDeclIsMutable();
        this.oneofDecl_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i9) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(int i9, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.set(i9, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i9, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i9, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionRange(int i9, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.set(i9, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setField(int i9, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.set(i9, descriptorProtos$FieldDescriptorProto);
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
    public void setNestedType(int i9, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.set(i9, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofDecl(int i9, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.set(i9, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        this.options_ = descriptorProtos$MessageOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i9, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i9, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i9, reservedRange);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$DescriptorProto();
            case 2:
                return new C1923i0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", DescriptorProtos$FieldDescriptorProto.class, "nestedType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "oneofDecl_", DescriptorProtos$OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$DescriptorProto.class) {
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

    @Override // com.google.protobuf.InterfaceC1958n0
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i9) {
        return (DescriptorProtos$EnumDescriptorProto) this.enumType_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public InterfaceC1985r0 getEnumTypeOrBuilder(int i9) {
        return (InterfaceC1985r0) this.enumType_.get(i9);
    }

    public List<? extends InterfaceC1985r0> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public DescriptorProtos$FieldDescriptorProto getExtension(int i9) {
        return (DescriptorProtos$FieldDescriptorProto) this.extension_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public H0 getExtensionOrBuilder(int i9) {
        return (H0) this.extension_.get(i9);
    }

    public List<? extends H0> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public ExtensionRange getExtensionRange(int i9) {
        return (ExtensionRange) this.extensionRange_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<ExtensionRange> getExtensionRangeList() {
        return this.extensionRange_;
    }

    public InterfaceC1937k0 getExtensionRangeOrBuilder(int i9) {
        return (InterfaceC1937k0) this.extensionRange_.get(i9);
    }

    public List<? extends InterfaceC1937k0> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public DescriptorProtos$FieldDescriptorProto getField(int i9) {
        return (DescriptorProtos$FieldDescriptorProto) this.field_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
        return this.field_;
    }

    public H0 getFieldOrBuilder(int i9) {
        return (H0) this.field_.get(i9);
    }

    public List<? extends H0> getFieldOrBuilderList() {
        return this.field_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public DescriptorProtos$DescriptorProto getNestedType(int i9) {
        return (DescriptorProtos$DescriptorProto) this.nestedType_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
        return this.nestedType_;
    }

    public InterfaceC1958n0 getNestedTypeOrBuilder(int i9) {
        return (InterfaceC1958n0) this.nestedType_.get(i9);
    }

    public List<? extends InterfaceC1958n0> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i9) {
        return (DescriptorProtos$OneofDescriptorProto) this.oneofDecl_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
        return this.oneofDecl_;
    }

    public InterfaceC1959n1 getOneofDeclOrBuilder(int i9) {
        return (InterfaceC1959n1) this.oneofDecl_.get(i9);
    }

    public List<? extends InterfaceC1959n1> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        if (descriptorProtos$MessageOptions == null) {
            return DescriptorProtos$MessageOptions.getDefaultInstance();
        }
        return descriptorProtos$MessageOptions;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public String getReservedName(int i9) {
        return (String) this.reservedName_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public H getReservedNameBytes(int i9) {
        return H.copyFromUtf8((String) this.reservedName_.get(i9));
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<String> getReservedNameList() {
        return this.reservedName_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public ReservedRange getReservedRange(int i9) {
        return (ReservedRange) this.reservedRange_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public List<ReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public InterfaceC1951m0 getReservedRangeOrBuilder(int i9) {
        return (InterfaceC1951m0) this.reservedRange_.get(i9);
    }

    public List<? extends InterfaceC1951m0> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1958n0
    public boolean hasOptions() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C1923i0 newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return (C1923i0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$DescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(int i9, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(i9, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i9, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i9, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionRange(int i9, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(i9, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(int i9, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(i9, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(int i9, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(i9, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(int i9, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(i9, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i9, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i9, reservedRange);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$DescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
