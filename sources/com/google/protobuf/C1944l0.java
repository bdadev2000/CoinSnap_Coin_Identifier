package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;

/* renamed from: com.google.protobuf.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1944l0 extends D2 implements InterfaceC1951m0 {
    public /* synthetic */ C1944l0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1944l0 clearEnd() {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).clearEnd();
        return this;
    }

    public C1944l0 clearStart() {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).clearStart();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1951m0
    public int getEnd() {
        return ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).getEnd();
    }

    @Override // com.google.protobuf.InterfaceC1951m0
    public int getStart() {
        return ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).getStart();
    }

    @Override // com.google.protobuf.InterfaceC1951m0
    public boolean hasEnd() {
        return ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).hasEnd();
    }

    @Override // com.google.protobuf.InterfaceC1951m0
    public boolean hasStart() {
        return ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).hasStart();
    }

    public C1944l0 setEnd(int i9) {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).setEnd(i9);
        return this;
    }

    public C1944l0 setStart(int i9) {
        copyOnWrite();
        ((DescriptorProtos$DescriptorProto.ReservedRange) this.instance).setStart(i9);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1944l0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange r0 = com.google.protobuf.DescriptorProtos$DescriptorProto.ReservedRange.access$7100()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1944l0.<init>():void");
    }
}
