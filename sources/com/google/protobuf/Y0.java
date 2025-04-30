package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface Y0 extends H2 {
    boolean getCcEnableArenas();

    boolean getCcGenericServices();

    String getCsharpNamespace();

    H getCsharpNamespaceBytes();

    @Override // com.google.protobuf.H2, com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    boolean getDeprecated();

    @Override // com.google.protobuf.H2
    /* synthetic */ Object getExtension(S1 s1);

    @Override // com.google.protobuf.H2
    /* synthetic */ Object getExtension(S1 s1, int i9);

    @Override // com.google.protobuf.H2
    /* synthetic */ int getExtensionCount(S1 s1);

    String getGoPackage();

    H getGoPackageBytes();

    @Deprecated
    boolean getJavaGenerateEqualsAndHash();

    boolean getJavaGenericServices();

    boolean getJavaMultipleFiles();

    String getJavaOuterClassname();

    H getJavaOuterClassnameBytes();

    String getJavaPackage();

    H getJavaPackageBytes();

    boolean getJavaStringCheckUtf8();

    String getObjcClassPrefix();

    H getObjcClassPrefixBytes();

    X0 getOptimizeFor();

    String getPhpClassPrefix();

    H getPhpClassPrefixBytes();

    boolean getPhpGenericServices();

    String getPhpMetadataNamespace();

    H getPhpMetadataNamespaceBytes();

    String getPhpNamespace();

    H getPhpNamespaceBytes();

    boolean getPyGenericServices();

    String getRubyPackage();

    H getRubyPackageBytes();

    String getSwiftPrefix();

    H getSwiftPrefixBytes();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasCcEnableArenas();

    boolean hasCcGenericServices();

    boolean hasCsharpNamespace();

    boolean hasDeprecated();

    @Override // com.google.protobuf.H2
    /* synthetic */ boolean hasExtension(S1 s1);

    boolean hasGoPackage();

    @Deprecated
    boolean hasJavaGenerateEqualsAndHash();

    boolean hasJavaGenericServices();

    boolean hasJavaMultipleFiles();

    boolean hasJavaOuterClassname();

    boolean hasJavaPackage();

    boolean hasJavaStringCheckUtf8();

    boolean hasObjcClassPrefix();

    boolean hasOptimizeFor();

    boolean hasPhpClassPrefix();

    boolean hasPhpGenericServices();

    boolean hasPhpMetadataNamespace();

    boolean hasPhpNamespace();

    boolean hasPyGenericServices();

    boolean hasRubyPackage();

    boolean hasSwiftPrefix();

    @Override // com.google.protobuf.H2, com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
