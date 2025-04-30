package com.google.protobuf;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class DescriptorProtos$FileOptions extends GeneratedMessageLite$ExtendableMessage<DescriptorProtos$FileOptions, U0> implements Y0 {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final DescriptorProtos$FileOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean ccGenericServices_;
    private boolean deprecated_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private boolean javaStringCheckUtf8_;
    private boolean phpGenericServices_;
    private boolean pyGenericServices_;
    private byte memoizedIsInitialized = 2;
    private String javaPackage_ = "";
    private String javaOuterClassname_ = "";
    private int optimizeFor_ = 1;
    private String goPackage_ = "";
    private boolean ccEnableArenas_ = true;
    private String objcClassPrefix_ = "";
    private String csharpNamespace_ = "";
    private String swiftPrefix_ = "";
    private String phpClassPrefix_ = "";
    private String phpNamespace_ = "";
    private String phpMetadataNamespace_ = "";
    private String rubyPackage_ = "";
    private InterfaceC1891d3 uninterpretedOption_ = L2.emptyProtobufList();

    static {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = new DescriptorProtos$FileOptions();
        DEFAULT_INSTANCE = descriptorProtos$FileOptions;
        L2.registerDefaultInstance(DescriptorProtos$FileOptions.class, descriptorProtos$FileOptions);
    }

    private DescriptorProtos$FileOptions() {
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
    public void clearCcEnableArenas() {
        this.bitField0_ &= -4097;
        this.ccEnableArenas_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcGenericServices() {
        this.bitField0_ &= -129;
        this.ccGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCsharpNamespace() {
        this.bitField0_ &= -16385;
        this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -2049;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoPackage() {
        this.bitField0_ &= -65;
        this.goPackage_ = getDefaultInstance().getGoPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenerateEqualsAndHash() {
        this.bitField0_ &= -9;
        this.javaGenerateEqualsAndHash_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenericServices() {
        this.bitField0_ &= -257;
        this.javaGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaMultipleFiles() {
        this.bitField0_ &= -5;
        this.javaMultipleFiles_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaOuterClassname() {
        this.bitField0_ &= -3;
        this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaPackage() {
        this.bitField0_ &= -2;
        this.javaPackage_ = getDefaultInstance().getJavaPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaStringCheckUtf8() {
        this.bitField0_ &= -17;
        this.javaStringCheckUtf8_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjcClassPrefix() {
        this.bitField0_ &= -8193;
        this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptimizeFor() {
        this.bitField0_ &= -33;
        this.optimizeFor_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpClassPrefix() {
        this.bitField0_ &= -65537;
        this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpGenericServices() {
        this.bitField0_ &= -1025;
        this.phpGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpMetadataNamespace() {
        this.bitField0_ &= -262145;
        this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpNamespace() {
        this.bitField0_ &= -131073;
        this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPyGenericServices() {
        this.bitField0_ &= -513;
        this.pyGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRubyPackage() {
        this.bitField0_ &= -524289;
        this.rubyPackage_ = getDefaultInstance().getRubyPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwiftPrefix() {
        this.bitField0_ &= -32769;
        this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
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

    public static DescriptorProtos$FileOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static U0 newBuilder() {
        return (U0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setCcEnableArenas(boolean z8) {
        this.bitField0_ |= 4096;
        this.ccEnableArenas_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcGenericServices(boolean z8) {
        this.bitField0_ |= 128;
        this.ccGenericServices_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.csharpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespaceBytes(H h6) {
        this.csharpNamespace_ = h6.toStringUtf8();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z8) {
        this.bitField0_ |= 2048;
        this.deprecated_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackage(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.goPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackageBytes(H h6) {
        this.goPackage_ = h6.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenerateEqualsAndHash(boolean z8) {
        this.bitField0_ |= 8;
        this.javaGenerateEqualsAndHash_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenericServices(boolean z8) {
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.javaGenericServices_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMultipleFiles(boolean z8) {
        this.bitField0_ |= 4;
        this.javaMultipleFiles_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassname(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.javaOuterClassname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassnameBytes(H h6) {
        this.javaOuterClassname_ = h6.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.javaPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackageBytes(H h6) {
        this.javaPackage_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaStringCheckUtf8(boolean z8) {
        this.bitField0_ |= 16;
        this.javaStringCheckUtf8_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= FragmentTransaction.TRANSIT_EXIT_MASK;
        this.objcClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefixBytes(H h6) {
        this.objcClassPrefix_ = h6.toStringUtf8();
        this.bitField0_ |= FragmentTransaction.TRANSIT_EXIT_MASK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptimizeFor(X0 x02) {
        this.optimizeFor_ = x02.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.phpClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefixBytes(H h6) {
        this.phpClassPrefix_ = h6.toStringUtf8();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpGenericServices(boolean z8) {
        this.bitField0_ |= 1024;
        this.phpGenericServices_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 262144;
        this.phpMetadataNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespaceBytes(H h6) {
        this.phpMetadataNamespace_ = h6.toStringUtf8();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.phpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespaceBytes(H h6) {
        this.phpNamespace_ = h6.toStringUtf8();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPyGenericServices(boolean z8) {
        this.bitField0_ |= 512;
        this.pyGenericServices_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackage(String str) {
        str.getClass();
        this.bitField0_ |= ImageMetadata.LENS_APERTURE;
        this.rubyPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackageBytes(H h6) {
        this.rubyPackage_ = h6.toStringUtf8();
        this.bitField0_ |= ImageMetadata.LENS_APERTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.swiftPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefixBytes(H h6) {
        this.swiftPrefix_ = h6.toStringUtf8();
        this.bitField0_ |= 32768;
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
                return new DescriptorProtos$FileOptions();
            case 2:
                return new U0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\tဌ\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", X0.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$FileOptions.class) {
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

    @Override // com.google.protobuf.Y0
    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    @Override // com.google.protobuf.Y0
    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    @Override // com.google.protobuf.Y0
    public String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    @Override // com.google.protobuf.Y0
    public H getCsharpNamespaceBytes() {
        return H.copyFromUtf8(this.csharpNamespace_);
    }

    @Override // com.google.protobuf.Y0
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.Y0
    public String getGoPackage() {
        return this.goPackage_;
    }

    @Override // com.google.protobuf.Y0
    public H getGoPackageBytes() {
        return H.copyFromUtf8(this.goPackage_);
    }

    @Override // com.google.protobuf.Y0
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    @Override // com.google.protobuf.Y0
    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    @Override // com.google.protobuf.Y0
    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    @Override // com.google.protobuf.Y0
    public String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    @Override // com.google.protobuf.Y0
    public H getJavaOuterClassnameBytes() {
        return H.copyFromUtf8(this.javaOuterClassname_);
    }

    @Override // com.google.protobuf.Y0
    public String getJavaPackage() {
        return this.javaPackage_;
    }

    @Override // com.google.protobuf.Y0
    public H getJavaPackageBytes() {
        return H.copyFromUtf8(this.javaPackage_);
    }

    @Override // com.google.protobuf.Y0
    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Override // com.google.protobuf.Y0
    public String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    @Override // com.google.protobuf.Y0
    public H getObjcClassPrefixBytes() {
        return H.copyFromUtf8(this.objcClassPrefix_);
    }

    @Override // com.google.protobuf.Y0
    public X0 getOptimizeFor() {
        X0 forNumber = X0.forNumber(this.optimizeFor_);
        if (forNumber == null) {
            return X0.SPEED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.Y0
    public String getPhpClassPrefix() {
        return this.phpClassPrefix_;
    }

    @Override // com.google.protobuf.Y0
    public H getPhpClassPrefixBytes() {
        return H.copyFromUtf8(this.phpClassPrefix_);
    }

    @Override // com.google.protobuf.Y0
    public boolean getPhpGenericServices() {
        return this.phpGenericServices_;
    }

    @Override // com.google.protobuf.Y0
    public String getPhpMetadataNamespace() {
        return this.phpMetadataNamespace_;
    }

    @Override // com.google.protobuf.Y0
    public H getPhpMetadataNamespaceBytes() {
        return H.copyFromUtf8(this.phpMetadataNamespace_);
    }

    @Override // com.google.protobuf.Y0
    public String getPhpNamespace() {
        return this.phpNamespace_;
    }

    @Override // com.google.protobuf.Y0
    public H getPhpNamespaceBytes() {
        return H.copyFromUtf8(this.phpNamespace_);
    }

    @Override // com.google.protobuf.Y0
    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    @Override // com.google.protobuf.Y0
    public String getRubyPackage() {
        return this.rubyPackage_;
    }

    @Override // com.google.protobuf.Y0
    public H getRubyPackageBytes() {
        return H.copyFromUtf8(this.rubyPackage_);
    }

    @Override // com.google.protobuf.Y0
    public String getSwiftPrefix() {
        return this.swiftPrefix_;
    }

    @Override // com.google.protobuf.Y0
    public H getSwiftPrefixBytes() {
        return H.copyFromUtf8(this.swiftPrefix_);
    }

    @Override // com.google.protobuf.Y0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return (DescriptorProtos$UninterpretedOption) this.uninterpretedOption_.get(i9);
    }

    @Override // com.google.protobuf.Y0
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.Y0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public B1 getUninterpretedOptionOrBuilder(int i9) {
        return (B1) this.uninterpretedOption_.get(i9);
    }

    public List<? extends B1> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasCcEnableArenas() {
        if ((this.bitField0_ & 4096) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasCcGenericServices() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasCsharpNamespace() {
        if ((this.bitField0_ & 16384) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasDeprecated() {
        if ((this.bitField0_ & 2048) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasGoPackage() {
        if ((this.bitField0_ & 64) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaGenericServices() {
        if ((this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaMultipleFiles() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaOuterClassname() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaPackage() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaStringCheckUtf8() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasObjcClassPrefix() {
        if ((this.bitField0_ & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasOptimizeFor() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpClassPrefix() {
        if ((this.bitField0_ & 65536) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpGenericServices() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpMetadataNamespace() {
        if ((this.bitField0_ & 262144) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpNamespace() {
        if ((this.bitField0_ & 131072) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPyGenericServices() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasRubyPackage() {
        if ((this.bitField0_ & ImageMetadata.LENS_APERTURE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.Y0
    public boolean hasSwiftPrefix() {
        if ((this.bitField0_ & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static U0 newBuilder(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        return (U0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileOptions);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FileOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$FileOptions parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i9, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FileOptions parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FileOptions parseFrom(S s5) throws IOException {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$FileOptions parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$FileOptions) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
