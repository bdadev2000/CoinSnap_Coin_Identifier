package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1992s0 extends F2 implements InterfaceC1999t0 {
    public /* synthetic */ C1992s0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1992s0 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public C1992s0 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1992s0 clearAllowAlias() {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).clearAllowAlias();
        return this;
    }

    public C1992s0 clearDeprecated() {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).clearDeprecated();
        return this;
    }

    public C1992s0 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1999t0
    public boolean getAllowAlias() {
        return ((DescriptorProtos$EnumOptions) this.instance).getAllowAlias();
    }

    @Override // com.google.protobuf.InterfaceC1999t0
    public boolean getDeprecated() {
        return ((DescriptorProtos$EnumOptions) this.instance).getDeprecated();
    }

    @Override // com.google.protobuf.InterfaceC1999t0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.InterfaceC1999t0
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.InterfaceC1999t0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumOptions) this.instance).getUninterpretedOptionList());
    }

    @Override // com.google.protobuf.InterfaceC1999t0
    public boolean hasAllowAlias() {
        return ((DescriptorProtos$EnumOptions) this.instance).hasAllowAlias();
    }

    @Override // com.google.protobuf.InterfaceC1999t0
    public boolean hasDeprecated() {
        return ((DescriptorProtos$EnumOptions) this.instance).hasDeprecated();
    }

    public C1992s0 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public C1992s0 setAllowAlias(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).setAllowAlias(z8);
        return this;
    }

    public C1992s0 setDeprecated(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).setDeprecated(z8);
        return this;
    }

    public C1992s0 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1992s0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$EnumOptions r0 = com.google.protobuf.DescriptorProtos$EnumOptions.access$35300()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1992s0.<init>():void");
    }

    public C1992s0 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1992s0 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1992s0 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1992s0 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$EnumOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
