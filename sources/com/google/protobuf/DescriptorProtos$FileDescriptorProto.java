package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$FileDescriptorProto extends L2 implements R0 {
    private static final DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE;
    public static final int DEPENDENCY_FIELD_NUMBER = 3;
    public static final int ENUM_TYPE_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private int bitField0_;
    private DescriptorProtos$FileOptions options_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String package_ = "";
    private InterfaceC1891d3 dependency_ = L2.emptyProtobufList();
    private Z2 publicDependency_ = L2.emptyIntList();
    private Z2 weakDependency_ = L2.emptyIntList();
    private InterfaceC1891d3 messageType_ = L2.emptyProtobufList();
    private InterfaceC1891d3 enumType_ = L2.emptyProtobufList();
    private InterfaceC1891d3 service_ = L2.emptyProtobufList();
    private InterfaceC1891d3 extension_ = L2.emptyProtobufList();
    private String syntax_ = "";

    static {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$FileDescriptorProto.class, descriptorProtos$FileDescriptorProto);
    }

    private DescriptorProtos$FileDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDependency(Iterable<String> iterable) {
        ensureDependencyIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.dependency_);
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
    public void addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureMessageTypeIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.messageType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
        ensurePublicDependencyIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.publicDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
        ensureServiceIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.service_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
        ensureWeakDependencyIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.weakDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependency(String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependencyBytes(H h6) {
        ensureDependencyIsMutable();
        this.dependency_.add(h6.toStringUtf8());
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
    public void addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublicDependency(int i9) {
        ensurePublicDependencyIsMutable();
        ((S2) this.publicDependency_).addInt(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWeakDependency(int i9) {
        ensureWeakDependencyIsMutable();
        ((S2) this.weakDependency_).addInt(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDependency() {
        this.dependency_ = L2.emptyProtobufList();
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
    public void clearMessageType() {
        this.messageType_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackage() {
        this.bitField0_ &= -3;
        this.package_ = getDefaultInstance().getPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicDependency() {
        this.publicDependency_ = L2.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearService() {
        this.service_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceCodeInfo() {
        this.sourceCodeInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.bitField0_ &= -17;
        this.syntax_ = getDefaultInstance().getSyntax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeakDependency() {
        this.weakDependency_ = L2.emptyIntList();
    }

    private void ensureDependencyIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.dependency_;
        if (!interfaceC1891d3.isModifiable()) {
            this.dependency_ = L2.mutableCopy(interfaceC1891d3);
        }
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

    private void ensureMessageTypeIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.messageType_;
        if (!interfaceC1891d3.isModifiable()) {
            this.messageType_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensurePublicDependencyIsMutable() {
        Z2 z22 = this.publicDependency_;
        if (!((AbstractC1894e) z22).isModifiable()) {
            this.publicDependency_ = L2.mutableCopy(z22);
        }
    }

    private void ensureServiceIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.service_;
        if (!interfaceC1891d3.isModifiable()) {
            this.service_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureWeakDependencyIsMutable() {
        Z2 z22 = this.weakDependency_;
        if (!((AbstractC1894e) z22).isModifiable()) {
            this.weakDependency_ = L2.mutableCopy(z22);
        }
    }

    public static DescriptorProtos$FileDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        DescriptorProtos$FileOptions descriptorProtos$FileOptions2 = this.options_;
        if (descriptorProtos$FileOptions2 != null && descriptorProtos$FileOptions2 != DescriptorProtos$FileOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$FileOptions) ((U0) DescriptorProtos$FileOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$FileOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$FileOptions;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2 = this.sourceCodeInfo_;
        if (descriptorProtos$SourceCodeInfo2 != null && descriptorProtos$SourceCodeInfo2 != DescriptorProtos$SourceCodeInfo.getDefaultInstance()) {
            this.sourceCodeInfo_ = (DescriptorProtos$SourceCodeInfo) ((C2007u1) DescriptorProtos$SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom((L2) descriptorProtos$SourceCodeInfo)).buildPartial();
        } else {
            this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        }
        this.bitField0_ |= 8;
    }

    public static Q0 newBuilder() {
        return (Q0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeMessageType(int i9) {
        ensureMessageTypeIsMutable();
        this.messageType_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeService(int i9) {
        ensureServiceIsMutable();
        this.service_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDependency(int i9, String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.set(i9, str);
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
    public void setMessageType(int i9, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.set(i9, descriptorProtos$DescriptorProto);
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
    public void setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        this.options_ = descriptorProtos$FileOptions;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackage(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.package_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageBytes(H h6) {
        this.package_ = h6.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicDependency(int i9, int i10) {
        ensurePublicDependencyIsMutable();
        ((S2) this.publicDependency_).setInt(i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setService(int i9, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.set(i9, descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.syntax_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxBytes(H h6) {
        this.syntax_ = h6.toStringUtf8();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeakDependency(int i9, int i10) {
        ensureWeakDependencyIsMutable();
        ((S2) this.weakDependency_).setInt(i9, i10);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileDescriptorProto();
            case 2:
                return new Q0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "service_", DescriptorProtos$ServiceDescriptorProto.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$FileDescriptorProto.class) {
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

    @Override // com.google.protobuf.R0
    public String getDependency(int i9) {
        return (String) this.dependency_.get(i9);
    }

    @Override // com.google.protobuf.R0
    public H getDependencyBytes(int i9) {
        return H.copyFromUtf8((String) this.dependency_.get(i9));
    }

    @Override // com.google.protobuf.R0
    public int getDependencyCount() {
        return this.dependency_.size();
    }

    @Override // com.google.protobuf.R0
    public List<String> getDependencyList() {
        return this.dependency_;
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i9) {
        return (DescriptorProtos$EnumDescriptorProto) this.enumType_.get(i9);
    }

    @Override // com.google.protobuf.R0
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public InterfaceC1985r0 getEnumTypeOrBuilder(int i9) {
        return (InterfaceC1985r0) this.enumType_.get(i9);
    }

    public List<? extends InterfaceC1985r0> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$FieldDescriptorProto getExtension(int i9) {
        return (DescriptorProtos$FieldDescriptorProto) this.extension_.get(i9);
    }

    @Override // com.google.protobuf.R0
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public H0 getExtensionOrBuilder(int i9) {
        return (H0) this.extension_.get(i9);
    }

    public List<? extends H0> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$DescriptorProto getMessageType(int i9) {
        return (DescriptorProtos$DescriptorProto) this.messageType_.get(i9);
    }

    @Override // com.google.protobuf.R0
    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return this.messageType_;
    }

    public InterfaceC1958n0 getMessageTypeOrBuilder(int i9) {
        return (InterfaceC1958n0) this.messageType_.get(i9);
    }

    public List<? extends InterfaceC1958n0> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.R0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.R0
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        if (descriptorProtos$FileOptions == null) {
            return DescriptorProtos$FileOptions.getDefaultInstance();
        }
        return descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.R0
    public String getPackage() {
        return this.package_;
    }

    @Override // com.google.protobuf.R0
    public H getPackageBytes() {
        return H.copyFromUtf8(this.package_);
    }

    @Override // com.google.protobuf.R0
    public int getPublicDependency(int i9) {
        return ((S2) this.publicDependency_).getInt(i9);
    }

    @Override // com.google.protobuf.R0
    public int getPublicDependencyCount() {
        return this.publicDependency_.size();
    }

    @Override // com.google.protobuf.R0
    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$ServiceDescriptorProto getService(int i9) {
        return (DescriptorProtos$ServiceDescriptorProto) this.service_.get(i9);
    }

    @Override // com.google.protobuf.R0
    public int getServiceCount() {
        return this.service_.size();
    }

    @Override // com.google.protobuf.R0
    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return this.service_;
    }

    public InterfaceC1986r1 getServiceOrBuilder(int i9) {
        return (InterfaceC1986r1) this.service_.get(i9);
    }

    public List<? extends InterfaceC1986r1> getServiceOrBuilderList() {
        return this.service_;
    }

    @Override // com.google.protobuf.R0
    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        if (descriptorProtos$SourceCodeInfo == null) {
            return DescriptorProtos$SourceCodeInfo.getDefaultInstance();
        }
        return descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.R0
    public String getSyntax() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.R0
    public H getSyntaxBytes() {
        return H.copyFromUtf8(this.syntax_);
    }

    @Override // com.google.protobuf.R0
    public int getWeakDependency(int i9) {
        return ((S2) this.weakDependency_).getInt(i9);
    }

    @Override // com.google.protobuf.R0
    public int getWeakDependencyCount() {
        return this.weakDependency_.size();
    }

    @Override // com.google.protobuf.R0
    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    @Override // com.google.protobuf.R0
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.R0
    public boolean hasOptions() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.R0
    public boolean hasPackage() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.R0
    public boolean hasSourceCodeInfo() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.R0
    public boolean hasSyntax() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public static Q0 newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return (Q0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
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
    public void addMessageType(int i9, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(i9, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(int i9, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(i9, descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
