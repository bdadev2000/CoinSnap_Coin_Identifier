package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;

/* renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1972p0 extends D2 implements InterfaceC1979q0 {
    public /* synthetic */ C1972p0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1972p0 clearEnd() {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).clearEnd();
        return this;
    }

    public C1972p0 clearStart() {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).clearStart();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1979q0
    public int getEnd() {
        return ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).getEnd();
    }

    @Override // com.google.protobuf.InterfaceC1979q0
    public int getStart() {
        return ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).getStart();
    }

    @Override // com.google.protobuf.InterfaceC1979q0
    public boolean hasEnd() {
        return ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).hasEnd();
    }

    @Override // com.google.protobuf.InterfaceC1979q0
    public boolean hasStart() {
        return ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).hasStart();
    }

    public C1972p0 setEnd(int i9) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).setEnd(i9);
        return this;
    }

    public C1972p0 setStart(int i9) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) this.instance).setStart(i9);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1972p0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange r0 = com.google.protobuf.DescriptorProtos$EnumDescriptorProto.EnumReservedRange.access$17800()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1972p0.<init>():void");
    }
}
