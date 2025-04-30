package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class I0 extends F2 implements P0 {
    public /* synthetic */ I0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public I0 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public I0 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public I0 clearCtype() {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).clearCtype();
        return this;
    }

    public I0 clearDeprecated() {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).clearDeprecated();
        return this;
    }

    public I0 clearJstype() {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).clearJstype();
        return this;
    }

    public I0 clearLazy() {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).clearLazy();
        return this;
    }

    public I0 clearPacked() {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).clearPacked();
        return this;
    }

    public I0 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    public I0 clearWeak() {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).clearWeak();
        return this;
    }

    @Override // com.google.protobuf.P0
    public L0 getCtype() {
        return ((DescriptorProtos$FieldOptions) this.instance).getCtype();
    }

    @Override // com.google.protobuf.P0
    public boolean getDeprecated() {
        return ((DescriptorProtos$FieldOptions) this.instance).getDeprecated();
    }

    @Override // com.google.protobuf.P0
    public O0 getJstype() {
        return ((DescriptorProtos$FieldOptions) this.instance).getJstype();
    }

    @Override // com.google.protobuf.P0
    public boolean getLazy() {
        return ((DescriptorProtos$FieldOptions) this.instance).getLazy();
    }

    @Override // com.google.protobuf.P0
    public boolean getPacked() {
        return ((DescriptorProtos$FieldOptions) this.instance).getPacked();
    }

    @Override // com.google.protobuf.P0
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.P0
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.P0
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$FieldOptions) this.instance).getUninterpretedOptionList());
    }

    @Override // com.google.protobuf.P0
    public boolean getWeak() {
        return ((DescriptorProtos$FieldOptions) this.instance).getWeak();
    }

    @Override // com.google.protobuf.P0
    public boolean hasCtype() {
        return ((DescriptorProtos$FieldOptions) this.instance).hasCtype();
    }

    @Override // com.google.protobuf.P0
    public boolean hasDeprecated() {
        return ((DescriptorProtos$FieldOptions) this.instance).hasDeprecated();
    }

    @Override // com.google.protobuf.P0
    public boolean hasJstype() {
        return ((DescriptorProtos$FieldOptions) this.instance).hasJstype();
    }

    @Override // com.google.protobuf.P0
    public boolean hasLazy() {
        return ((DescriptorProtos$FieldOptions) this.instance).hasLazy();
    }

    @Override // com.google.protobuf.P0
    public boolean hasPacked() {
        return ((DescriptorProtos$FieldOptions) this.instance).hasPacked();
    }

    @Override // com.google.protobuf.P0
    public boolean hasWeak() {
        return ((DescriptorProtos$FieldOptions) this.instance).hasWeak();
    }

    public I0 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public I0 setCtype(L0 l02) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setCtype(l02);
        return this;
    }

    public I0 setDeprecated(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setDeprecated(z8);
        return this;
    }

    public I0 setJstype(O0 o02) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setJstype(o02);
        return this;
    }

    public I0 setLazy(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setLazy(z8);
        return this;
    }

    public I0 setPacked(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setPacked(z8);
        return this;
    }

    public I0 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public I0 setWeak(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setWeak(z8);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private I0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$FieldOptions r0 = com.google.protobuf.DescriptorProtos$FieldOptions.access$32500()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.I0.<init>():void");
    }

    public I0 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public I0 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public I0 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public I0 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$FieldOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
