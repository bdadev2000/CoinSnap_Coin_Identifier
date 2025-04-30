package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class U0 extends F2 implements Y0 {
    public /* synthetic */ U0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public U0 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public U0 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public U0 clearCcEnableArenas() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearCcEnableArenas();
        return this;
    }

    public U0 clearCcGenericServices() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearCcGenericServices();
        return this;
    }

    public U0 clearCsharpNamespace() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearCsharpNamespace();
        return this;
    }

    public U0 clearDeprecated() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearDeprecated();
        return this;
    }

    public U0 clearGoPackage() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearGoPackage();
        return this;
    }

    @Deprecated
    public U0 clearJavaGenerateEqualsAndHash() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearJavaGenerateEqualsAndHash();
        return this;
    }

    public U0 clearJavaGenericServices() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearJavaGenericServices();
        return this;
    }

    public U0 clearJavaMultipleFiles() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearJavaMultipleFiles();
        return this;
    }

    public U0 clearJavaOuterClassname() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearJavaOuterClassname();
        return this;
    }

    public U0 clearJavaPackage() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearJavaPackage();
        return this;
    }

    public U0 clearJavaStringCheckUtf8() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearJavaStringCheckUtf8();
        return this;
    }

    public U0 clearObjcClassPrefix() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearObjcClassPrefix();
        return this;
    }

    public U0 clearOptimizeFor() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearOptimizeFor();
        return this;
    }

    public U0 clearPhpClassPrefix() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearPhpClassPrefix();
        return this;
    }

    public U0 clearPhpGenericServices() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearPhpGenericServices();
        return this;
    }

    public U0 clearPhpMetadataNamespace() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearPhpMetadataNamespace();
        return this;
    }

    public U0 clearPhpNamespace() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearPhpNamespace();
        return this;
    }

    public U0 clearPyGenericServices() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearPyGenericServices();
        return this;
    }

    public U0 clearRubyPackage() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearRubyPackage();
        return this;
    }

    public U0 clearSwiftPrefix() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearSwiftPrefix();
        return this;
    }

    public U0 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    @Override // com.google.protobuf.Y0
    public boolean getCcEnableArenas() {
        return ((DescriptorProtos$FileOptions) this.instance).getCcEnableArenas();
    }

    @Override // com.google.protobuf.Y0
    public boolean getCcGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).getCcGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public String getCsharpNamespace() {
        return ((DescriptorProtos$FileOptions) this.instance).getCsharpNamespace();
    }

    @Override // com.google.protobuf.Y0
    public H getCsharpNamespaceBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getCsharpNamespaceBytes();
    }

    @Override // com.google.protobuf.Y0
    public boolean getDeprecated() {
        return ((DescriptorProtos$FileOptions) this.instance).getDeprecated();
    }

    @Override // com.google.protobuf.Y0
    public String getGoPackage() {
        return ((DescriptorProtos$FileOptions) this.instance).getGoPackage();
    }

    @Override // com.google.protobuf.Y0
    public H getGoPackageBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getGoPackageBytes();
    }

    @Override // com.google.protobuf.Y0
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaGenerateEqualsAndHash();
    }

    @Override // com.google.protobuf.Y0
    public boolean getJavaGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public boolean getJavaMultipleFiles() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaMultipleFiles();
    }

    @Override // com.google.protobuf.Y0
    public String getJavaOuterClassname() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaOuterClassname();
    }

    @Override // com.google.protobuf.Y0
    public H getJavaOuterClassnameBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaOuterClassnameBytes();
    }

    @Override // com.google.protobuf.Y0
    public String getJavaPackage() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaPackage();
    }

    @Override // com.google.protobuf.Y0
    public H getJavaPackageBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaPackageBytes();
    }

    @Override // com.google.protobuf.Y0
    public boolean getJavaStringCheckUtf8() {
        return ((DescriptorProtos$FileOptions) this.instance).getJavaStringCheckUtf8();
    }

    @Override // com.google.protobuf.Y0
    public String getObjcClassPrefix() {
        return ((DescriptorProtos$FileOptions) this.instance).getObjcClassPrefix();
    }

    @Override // com.google.protobuf.Y0
    public H getObjcClassPrefixBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getObjcClassPrefixBytes();
    }

    @Override // com.google.protobuf.Y0
    public X0 getOptimizeFor() {
        return ((DescriptorProtos$FileOptions) this.instance).getOptimizeFor();
    }

    @Override // com.google.protobuf.Y0
    public String getPhpClassPrefix() {
        return ((DescriptorProtos$FileOptions) this.instance).getPhpClassPrefix();
    }

    @Override // com.google.protobuf.Y0
    public H getPhpClassPrefixBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getPhpClassPrefixBytes();
    }

    @Override // com.google.protobuf.Y0
    public boolean getPhpGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).getPhpGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public String getPhpMetadataNamespace() {
        return ((DescriptorProtos$FileOptions) this.instance).getPhpMetadataNamespace();
    }

    @Override // com.google.protobuf.Y0
    public H getPhpMetadataNamespaceBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getPhpMetadataNamespaceBytes();
    }

    @Override // com.google.protobuf.Y0
    public String getPhpNamespace() {
        return ((DescriptorProtos$FileOptions) this.instance).getPhpNamespace();
    }

    @Override // com.google.protobuf.Y0
    public H getPhpNamespaceBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getPhpNamespaceBytes();
    }

    @Override // com.google.protobuf.Y0
    public boolean getPyGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).getPyGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public String getRubyPackage() {
        return ((DescriptorProtos$FileOptions) this.instance).getRubyPackage();
    }

    @Override // com.google.protobuf.Y0
    public H getRubyPackageBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getRubyPackageBytes();
    }

    @Override // com.google.protobuf.Y0
    public String getSwiftPrefix() {
        return ((DescriptorProtos$FileOptions) this.instance).getSwiftPrefix();
    }

    @Override // com.google.protobuf.Y0
    public H getSwiftPrefixBytes() {
        return ((DescriptorProtos$FileOptions) this.instance).getSwiftPrefixBytes();
    }

    @Override // com.google.protobuf.Y0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$FileOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.Y0
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$FileOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.Y0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$FileOptions) this.instance).getUninterpretedOptionList());
    }

    @Override // com.google.protobuf.Y0
    public boolean hasCcEnableArenas() {
        return ((DescriptorProtos$FileOptions) this.instance).hasCcEnableArenas();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasCcGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).hasCcGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasCsharpNamespace() {
        return ((DescriptorProtos$FileOptions) this.instance).hasCsharpNamespace();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasDeprecated() {
        return ((DescriptorProtos$FileOptions) this.instance).hasDeprecated();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasGoPackage() {
        return ((DescriptorProtos$FileOptions) this.instance).hasGoPackage();
    }

    @Override // com.google.protobuf.Y0
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return ((DescriptorProtos$FileOptions) this.instance).hasJavaGenerateEqualsAndHash();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).hasJavaGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaMultipleFiles() {
        return ((DescriptorProtos$FileOptions) this.instance).hasJavaMultipleFiles();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaOuterClassname() {
        return ((DescriptorProtos$FileOptions) this.instance).hasJavaOuterClassname();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaPackage() {
        return ((DescriptorProtos$FileOptions) this.instance).hasJavaPackage();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasJavaStringCheckUtf8() {
        return ((DescriptorProtos$FileOptions) this.instance).hasJavaStringCheckUtf8();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasObjcClassPrefix() {
        return ((DescriptorProtos$FileOptions) this.instance).hasObjcClassPrefix();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasOptimizeFor() {
        return ((DescriptorProtos$FileOptions) this.instance).hasOptimizeFor();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpClassPrefix() {
        return ((DescriptorProtos$FileOptions) this.instance).hasPhpClassPrefix();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).hasPhpGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpMetadataNamespace() {
        return ((DescriptorProtos$FileOptions) this.instance).hasPhpMetadataNamespace();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPhpNamespace() {
        return ((DescriptorProtos$FileOptions) this.instance).hasPhpNamespace();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasPyGenericServices() {
        return ((DescriptorProtos$FileOptions) this.instance).hasPyGenericServices();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasRubyPackage() {
        return ((DescriptorProtos$FileOptions) this.instance).hasRubyPackage();
    }

    @Override // com.google.protobuf.Y0
    public boolean hasSwiftPrefix() {
        return ((DescriptorProtos$FileOptions) this.instance).hasSwiftPrefix();
    }

    public U0 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public U0 setCcEnableArenas(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setCcEnableArenas(z8);
        return this;
    }

    public U0 setCcGenericServices(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setCcGenericServices(z8);
        return this;
    }

    public U0 setCsharpNamespace(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setCsharpNamespace(str);
        return this;
    }

    public U0 setCsharpNamespaceBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setCsharpNamespaceBytes(h6);
        return this;
    }

    public U0 setDeprecated(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setDeprecated(z8);
        return this;
    }

    public U0 setGoPackage(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setGoPackage(str);
        return this;
    }

    public U0 setGoPackageBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setGoPackageBytes(h6);
        return this;
    }

    @Deprecated
    public U0 setJavaGenerateEqualsAndHash(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaGenerateEqualsAndHash(z8);
        return this;
    }

    public U0 setJavaGenericServices(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaGenericServices(z8);
        return this;
    }

    public U0 setJavaMultipleFiles(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaMultipleFiles(z8);
        return this;
    }

    public U0 setJavaOuterClassname(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaOuterClassname(str);
        return this;
    }

    public U0 setJavaOuterClassnameBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaOuterClassnameBytes(h6);
        return this;
    }

    public U0 setJavaPackage(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaPackage(str);
        return this;
    }

    public U0 setJavaPackageBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaPackageBytes(h6);
        return this;
    }

    public U0 setJavaStringCheckUtf8(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setJavaStringCheckUtf8(z8);
        return this;
    }

    public U0 setObjcClassPrefix(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setObjcClassPrefix(str);
        return this;
    }

    public U0 setObjcClassPrefixBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setObjcClassPrefixBytes(h6);
        return this;
    }

    public U0 setOptimizeFor(X0 x02) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setOptimizeFor(x02);
        return this;
    }

    public U0 setPhpClassPrefix(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPhpClassPrefix(str);
        return this;
    }

    public U0 setPhpClassPrefixBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPhpClassPrefixBytes(h6);
        return this;
    }

    public U0 setPhpGenericServices(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPhpGenericServices(z8);
        return this;
    }

    public U0 setPhpMetadataNamespace(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPhpMetadataNamespace(str);
        return this;
    }

    public U0 setPhpMetadataNamespaceBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPhpMetadataNamespaceBytes(h6);
        return this;
    }

    public U0 setPhpNamespace(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPhpNamespace(str);
        return this;
    }

    public U0 setPhpNamespaceBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPhpNamespaceBytes(h6);
        return this;
    }

    public U0 setPyGenericServices(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setPyGenericServices(z8);
        return this;
    }

    public U0 setRubyPackage(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setRubyPackage(str);
        return this;
    }

    public U0 setRubyPackageBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setRubyPackageBytes(h6);
        return this;
    }

    public U0 setSwiftPrefix(String str) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setSwiftPrefix(str);
        return this;
    }

    public U0 setSwiftPrefixBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setSwiftPrefixBytes(h6);
        return this;
    }

    public U0 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private U0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$FileOptions r0 = com.google.protobuf.DescriptorProtos$FileOptions.access$25100()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.U0.<init>():void");
    }

    public U0 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public U0 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public U0 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public U0 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
