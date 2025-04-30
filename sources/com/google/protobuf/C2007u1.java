package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2007u1 extends D2 implements InterfaceC2028x1 {
    public /* synthetic */ C2007u1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C2007u1 addAllLocation(Iterable<? extends DescriptorProtos$SourceCodeInfo.Location> iterable) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).addAllLocation(iterable);
        return this;
    }

    public C2007u1 addLocation(DescriptorProtos$SourceCodeInfo.Location location) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(location);
        return this;
    }

    public C2007u1 clearLocation() {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).clearLocation();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC2028x1
    public DescriptorProtos$SourceCodeInfo.Location getLocation(int i9) {
        return ((DescriptorProtos$SourceCodeInfo) this.instance).getLocation(i9);
    }

    @Override // com.google.protobuf.InterfaceC2028x1
    public int getLocationCount() {
        return ((DescriptorProtos$SourceCodeInfo) this.instance).getLocationCount();
    }

    @Override // com.google.protobuf.InterfaceC2028x1
    public List<DescriptorProtos$SourceCodeInfo.Location> getLocationList() {
        return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo) this.instance).getLocationList());
    }

    public C2007u1 removeLocation(int i9) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).removeLocation(i9);
        return this;
    }

    public C2007u1 setLocation(int i9, DescriptorProtos$SourceCodeInfo.Location location) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).setLocation(i9, location);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2007u1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$SourceCodeInfo r0 = com.google.protobuf.DescriptorProtos$SourceCodeInfo.access$44700()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2007u1.<init>():void");
    }

    public C2007u1 addLocation(int i9, DescriptorProtos$SourceCodeInfo.Location location) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(i9, location);
        return this;
    }

    public C2007u1 setLocation(int i9, C2014v1 c2014v1) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).setLocation(i9, (DescriptorProtos$SourceCodeInfo.Location) c2014v1.build());
        return this;
    }

    public C2007u1 addLocation(C2014v1 c2014v1) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation((DescriptorProtos$SourceCodeInfo.Location) c2014v1.build());
        return this;
    }

    public C2007u1 addLocation(int i9, C2014v1 c2014v1) {
        copyOnWrite();
        ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(i9, (DescriptorProtos$SourceCodeInfo.Location) c2014v1.build());
        return this;
    }
}
