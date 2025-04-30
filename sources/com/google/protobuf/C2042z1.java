package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;

/* renamed from: com.google.protobuf.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2042z1 extends D2 implements A1 {
    public /* synthetic */ C2042z1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C2042z1 clearIsExtension() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).clearIsExtension();
        return this;
    }

    public C2042z1 clearNamePart() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).clearNamePart();
        return this;
    }

    @Override // com.google.protobuf.A1
    public boolean getIsExtension() {
        return ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).getIsExtension();
    }

    @Override // com.google.protobuf.A1
    public String getNamePart() {
        return ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).getNamePart();
    }

    @Override // com.google.protobuf.A1
    public H getNamePartBytes() {
        return ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).getNamePartBytes();
    }

    @Override // com.google.protobuf.A1
    public boolean hasIsExtension() {
        return ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).hasIsExtension();
    }

    @Override // com.google.protobuf.A1
    public boolean hasNamePart() {
        return ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).hasNamePart();
    }

    public C2042z1 setIsExtension(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).setIsExtension(z8);
        return this;
    }

    public C2042z1 setNamePart(String str) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).setNamePart(str);
        return this;
    }

    public C2042z1 setNamePartBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption.NamePart) this.instance).setNamePartBytes(h6);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2042z1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart r0 = com.google.protobuf.DescriptorProtos$UninterpretedOption.NamePart.access$39700()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2042z1.<init>():void");
    }
}
