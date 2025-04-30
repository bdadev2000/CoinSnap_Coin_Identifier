package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2034y0 extends F2 implements InterfaceC2041z0 {
    public /* synthetic */ C2034y0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C2034y0 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public C2034y0 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public C2034y0 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC2041z0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.InterfaceC2041z0
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.InterfaceC2041z0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$ExtensionRangeOptions) this.instance).getUninterpretedOptionList());
    }

    public C2034y0 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public C2034y0 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2034y0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$ExtensionRangeOptions r0 = com.google.protobuf.DescriptorProtos$ExtensionRangeOptions.access$13200()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2034y0.<init>():void");
    }

    public C2034y0 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C2034y0 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C2034y0 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C2034y0 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$ExtensionRangeOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
