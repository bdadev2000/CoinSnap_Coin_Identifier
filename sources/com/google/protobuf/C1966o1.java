package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1966o1 extends F2 implements InterfaceC1973p1 {
    public /* synthetic */ C1966o1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1966o1 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public C1966o1 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1966o1 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1973p1
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$OneofOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.InterfaceC1973p1
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$OneofOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.InterfaceC1973p1
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$OneofOptions) this.instance).getUninterpretedOptionList());
    }

    public C1966o1 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public C1966o1 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1966o1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$OneofOptions r0 = com.google.protobuf.DescriptorProtos$OneofOptions.access$34500()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1966o1.<init>():void");
    }

    public C1966o1 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1966o1 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1966o1 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1966o1 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$OneofOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
