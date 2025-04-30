package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1917h1 extends F2 implements InterfaceC1945l1 {
    public /* synthetic */ C1917h1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1917h1 addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).addAllUninterpretedOption(iterable);
        return this;
    }

    public C1917h1 addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1917h1 clearDeprecated() {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).clearDeprecated();
        return this;
    }

    public C1917h1 clearIdempotencyLevel() {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).clearIdempotencyLevel();
        return this;
    }

    public C1917h1 clearUninterpretedOption() {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).clearUninterpretedOption();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public boolean getDeprecated() {
        return ((DescriptorProtos$MethodOptions) this.instance).getDeprecated();
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public EnumC1938k1 getIdempotencyLevel() {
        return ((DescriptorProtos$MethodOptions) this.instance).getIdempotencyLevel();
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i9) {
        return ((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOption(i9);
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public int getUninterpretedOptionCount() {
        return ((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOptionCount();
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return Collections.unmodifiableList(((DescriptorProtos$MethodOptions) this.instance).getUninterpretedOptionList());
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public boolean hasDeprecated() {
        return ((DescriptorProtos$MethodOptions) this.instance).hasDeprecated();
    }

    @Override // com.google.protobuf.InterfaceC1945l1
    public boolean hasIdempotencyLevel() {
        return ((DescriptorProtos$MethodOptions) this.instance).hasIdempotencyLevel();
    }

    public C1917h1 removeUninterpretedOption(int i9) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).removeUninterpretedOption(i9);
        return this;
    }

    public C1917h1 setDeprecated(boolean z8) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).setDeprecated(z8);
        return this;
    }

    public C1917h1 setIdempotencyLevel(EnumC1938k1 enumC1938k1) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).setIdempotencyLevel(enumC1938k1);
        return this;
    }

    public C1917h1 setUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).setUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1917h1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$MethodOptions r0 = com.google.protobuf.DescriptorProtos$MethodOptions.access$38500()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1917h1.<init>():void");
    }

    public C1917h1 addUninterpretedOption(int i9, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(i9, descriptorProtos$UninterpretedOption);
        return this;
    }

    public C1917h1 setUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).setUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1917h1 addUninterpretedOption(C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption((DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }

    public C1917h1 addUninterpretedOption(int i9, C2035y1 c2035y1) {
        copyOnWrite();
        ((DescriptorProtos$MethodOptions) this.instance).addUninterpretedOption(i9, (DescriptorProtos$UninterpretedOption) c2035y1.build());
        return this;
    }
}
