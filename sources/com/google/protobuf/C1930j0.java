package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;

/* renamed from: com.google.protobuf.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1930j0 extends D2 implements InterfaceC1937k0 {
    public /* synthetic */ C1930j0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1930j0 clearEnd() {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).clearEnd();
        return this;
    }

    public C1930j0 clearOptions() {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).clearOptions();
        return this;
    }

    public C1930j0 clearStart() {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).clearStart();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1937k0
    public int getEnd() {
        return ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).getEnd();
    }

    @Override // com.google.protobuf.InterfaceC1937k0
    public DescriptorProtos$ExtensionRangeOptions getOptions() {
        return ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).getOptions();
    }

    @Override // com.google.protobuf.InterfaceC1937k0
    public int getStart() {
        return ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).getStart();
    }

    @Override // com.google.protobuf.InterfaceC1937k0
    public boolean hasEnd() {
        return ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).hasEnd();
    }

    @Override // com.google.protobuf.InterfaceC1937k0
    public boolean hasOptions() {
        return ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).hasOptions();
    }

    @Override // com.google.protobuf.InterfaceC1937k0
    public boolean hasStart() {
        return ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).hasStart();
    }

    public C1930j0 mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).mergeOptions(descriptorProtos$ExtensionRangeOptions);
        return this;
    }

    public C1930j0 setEnd(int i9) {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).setEnd(i9);
        return this;
    }

    public C1930j0 setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).setOptions(descriptorProtos$ExtensionRangeOptions);
        return this;
    }

    public C1930j0 setStart(int i9) {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).setStart(i9);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1930j0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange r0 = com.google.protobuf.DescriptorProtos$DescriptorProto.ExtensionRange.access$6200()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1930j0.<init>():void");
    }

    public C1930j0 setOptions(C2034y0 c2034y0) {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ExtensionRange) this.instance).setOptions((DescriptorProtos$ExtensionRangeOptions) c2034y0.build());
        return this;
    }
}
