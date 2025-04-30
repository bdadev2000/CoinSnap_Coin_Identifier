package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1965o0 extends D2 implements InterfaceC1985r0 {
    public /* synthetic */ C1965o0(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C1965o0 addAllReservedName(Iterable<String> iterable) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllReservedName(iterable);
        return this;
    }

    public C1965o0 addAllReservedRange(Iterable<? extends DescriptorProtos$EnumDescriptorProto.EnumReservedRange> iterable) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllReservedRange(iterable);
        return this;
    }

    public C1965o0 addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addAllValue(iterable);
        return this;
    }

    public C1965o0 addReservedName(String str) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedName(str);
        return this;
    }

    public C1965o0 addReservedNameBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedNameBytes(h6);
        return this;
    }

    public C1965o0 addReservedRange(DescriptorProtos$EnumDescriptorProto.EnumReservedRange enumReservedRange) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(enumReservedRange);
        return this;
    }

    public C1965o0 addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(descriptorProtos$EnumValueDescriptorProto);
        return this;
    }

    public C1965o0 clearName() {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).clearName();
        return this;
    }

    public C1965o0 clearOptions() {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).clearOptions();
        return this;
    }

    public C1965o0 clearReservedName() {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).clearReservedName();
        return this;
    }

    public C1965o0 clearReservedRange() {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).clearReservedRange();
        return this;
    }

    public C1965o0 clearValue() {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).clearValue();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public String getName() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public H getNameBytes() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public DescriptorProtos$EnumOptions getOptions() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getOptions();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public String getReservedName(int i9) {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedName(i9);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public H getReservedNameBytes(int i9) {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameBytes(i9);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public int getReservedNameCount() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameCount();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public List<String> getReservedNameList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedNameList());
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public DescriptorProtos$EnumDescriptorProto.EnumReservedRange getReservedRange(int i9) {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRange(i9);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public int getReservedRangeCount() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRangeCount();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public List<DescriptorProtos$EnumDescriptorProto.EnumReservedRange> getReservedRangeList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getReservedRangeList());
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public DescriptorProtos$EnumValueDescriptorProto getValue(int i9) {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getValue(i9);
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public int getValueCount() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).getValueCount();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return Collections.unmodifiableList(((DescriptorProtos$EnumDescriptorProto) this.instance).getValueList());
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public boolean hasName() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).hasName();
    }

    @Override // com.google.protobuf.InterfaceC1985r0
    public boolean hasOptions() {
        return ((DescriptorProtos$EnumDescriptorProto) this.instance).hasOptions();
    }

    public C1965o0 mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).mergeOptions(descriptorProtos$EnumOptions);
        return this;
    }

    public C1965o0 removeReservedRange(int i9) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).removeReservedRange(i9);
        return this;
    }

    public C1965o0 removeValue(int i9) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).removeValue(i9);
        return this;
    }

    public C1965o0 setName(String str) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setName(str);
        return this;
    }

    public C1965o0 setNameBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setNameBytes(h6);
        return this;
    }

    public C1965o0 setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setOptions(descriptorProtos$EnumOptions);
        return this;
    }

    public C1965o0 setReservedName(int i9, String str) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedName(i9, str);
        return this;
    }

    public C1965o0 setReservedRange(int i9, DescriptorProtos$EnumDescriptorProto.EnumReservedRange enumReservedRange) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedRange(i9, enumReservedRange);
        return this;
    }

    public C1965o0 setValue(int i9, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setValue(i9, descriptorProtos$EnumValueDescriptorProto);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1965o0() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$EnumDescriptorProto r0 = com.google.protobuf.DescriptorProtos$EnumDescriptorProto.access$18400()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1965o0.<init>():void");
    }

    public C1965o0 addReservedRange(int i9, DescriptorProtos$EnumDescriptorProto.EnumReservedRange enumReservedRange) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(i9, enumReservedRange);
        return this;
    }

    public C1965o0 addValue(int i9, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(i9, descriptorProtos$EnumValueDescriptorProto);
        return this;
    }

    public C1965o0 setOptions(C1992s0 c1992s0) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setOptions((DescriptorProtos$EnumOptions) c1992s0.build());
        return this;
    }

    public C1965o0 setReservedRange(int i9, C1972p0 c1972p0) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setReservedRange(i9, (DescriptorProtos$EnumDescriptorProto.EnumReservedRange) c1972p0.build());
        return this;
    }

    public C1965o0 setValue(int i9, C2006u0 c2006u0) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).setValue(i9, (DescriptorProtos$EnumValueDescriptorProto) c2006u0.build());
        return this;
    }

    public C1965o0 addReservedRange(C1972p0 c1972p0) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange((DescriptorProtos$EnumDescriptorProto.EnumReservedRange) c1972p0.build());
        return this;
    }

    public C1965o0 addValue(C2006u0 c2006u0) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue((DescriptorProtos$EnumValueDescriptorProto) c2006u0.build());
        return this;
    }

    public C1965o0 addReservedRange(int i9, C1972p0 c1972p0) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addReservedRange(i9, (DescriptorProtos$EnumDescriptorProto.EnumReservedRange) c1972p0.build());
        return this;
    }

    public C1965o0 addValue(int i9, C2006u0 c2006u0) {
        copyOnWrite();
        ((DescriptorProtos$EnumDescriptorProto) this.instance).addValue(i9, (DescriptorProtos$EnumValueDescriptorProto) c2006u0.build());
        return this;
    }
}
