package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1993s1 extends F2 implements InterfaceC2000t1 {
    public /* synthetic */ C1993s1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1993s1 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public C1993s1 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1993s1 clearDeprecated() {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).clearDeprecated();
        return this;
    }

    public C1993s1 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC2000t1
    public boolean getDeprecated() {
        return ((DescriptorProtos$ServiceOptions) this.instance).getDeprecated();
    }

    @Override // com.google.protobuf.InterfaceC2000t1
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$ServiceOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.InterfaceC2000t1
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$ServiceOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.InterfaceC2000t1
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$ServiceOptions) this.instance).getUninterpretedOptionList());
    }

    @Override // com.google.protobuf.InterfaceC2000t1
    public boolean hasDeprecated() {
        return ((DescriptorProtos$ServiceOptions) this.instance).hasDeprecated();
    }

    public C1993s1 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public C1993s1 setDeprecated(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).setDeprecated(z8);
        return this;
    }

    public C1993s1 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1993s1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$ServiceOptions r0 = com.google.protobuf.DescriptorProtos$ServiceOptions.access$37500()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1993s1.<init>():void");
    }

    public C1993s1 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1993s1 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1993s1 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1993s1 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$ServiceOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
