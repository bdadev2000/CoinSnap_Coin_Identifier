package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2020w0 extends F2 implements InterfaceC2027x0 {
    public /* synthetic */ C2020w0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C2020w0 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public C2020w0 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public C2020w0 clearDeprecated() {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).clearDeprecated();
        return this;
    }

    public C2020w0 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC2027x0
    public boolean getDeprecated() {
        return ((DescriptorProtos$EnumValueOptions) this.instance).getDeprecated();
    }

    @Override // com.google.protobuf.InterfaceC2027x0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.InterfaceC2027x0
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.InterfaceC2027x0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumValueOptions) this.instance).getUninterpretedOptionList());
    }

    @Override // com.google.protobuf.InterfaceC2027x0
    public boolean hasDeprecated() {
        return ((DescriptorProtos$EnumValueOptions) this.instance).hasDeprecated();
    }

    public C2020w0 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public C2020w0 setDeprecated(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).setDeprecated(z8);
        return this;
    }

    public C2020w0 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2020w0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$EnumValueOptions r0 = com.google.protobuf.DescriptorProtos$EnumValueOptions.access$36500()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2020w0.<init>():void");
    }

    public C2020w0 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C2020w0 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C2020w0 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C2020w0 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$EnumValueOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
