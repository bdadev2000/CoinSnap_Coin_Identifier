package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2035y1 extends D2 implements B1 {
    public /* synthetic */ C2035y1(AbstractC1916h0 abstractC1916h0) {
        this();
    }

    public C2035y1 addAllName(Iterable<? extends DescriptorProtos$UninterpretedOption.NamePart> iterable) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).addAllName(iterable);
        return this;
    }

    public C2035y1 addName(DescriptorProtos$UninterpretedOption.NamePart namePart) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).addName(namePart);
        return this;
    }

    public C2035y1 clearAggregateValue() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).clearAggregateValue();
        return this;
    }

    public C2035y1 clearDoubleValue() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).clearDoubleValue();
        return this;
    }

    public C2035y1 clearIdentifierValue() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).clearIdentifierValue();
        return this;
    }

    public C2035y1 clearName() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).clearName();
        return this;
    }

    public C2035y1 clearNegativeIntValue() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).clearNegativeIntValue();
        return this;
    }

    public C2035y1 clearPositiveIntValue() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).clearPositiveIntValue();
        return this;
    }

    public C2035y1 clearStringValue() {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).clearStringValue();
        return this;
    }

    @Override // com.google.protobuf.B1
    public String getAggregateValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getAggregateValue();
    }

    @Override // com.google.protobuf.B1
    public H getAggregateValueBytes() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getAggregateValueBytes();
    }

    @Override // com.google.protobuf.B1
    public double getDoubleValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getDoubleValue();
    }

    @Override // com.google.protobuf.B1
    public String getIdentifierValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getIdentifierValue();
    }

    @Override // com.google.protobuf.B1
    public H getIdentifierValueBytes() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getIdentifierValueBytes();
    }

    @Override // com.google.protobuf.B1
    public DescriptorProtos$UninterpretedOption.NamePart getName(int i9) {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getName(i9);
    }

    @Override // com.google.protobuf.B1
    public int getNameCount() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getNameCount();
    }

    @Override // com.google.protobuf.B1
    public List<DescriptorProtos$UninterpretedOption.NamePart> getNameList() {
        return Collections.unmodifiableList(((DescriptorProtos$UninterpretedOption) this.instance).getNameList());
    }

    @Override // com.google.protobuf.B1
    public long getNegativeIntValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getNegativeIntValue();
    }

    @Override // com.google.protobuf.B1
    public long getPositiveIntValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getPositiveIntValue();
    }

    @Override // com.google.protobuf.B1
    public H getStringValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).getStringValue();
    }

    @Override // com.google.protobuf.B1
    public boolean hasAggregateValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).hasAggregateValue();
    }

    @Override // com.google.protobuf.B1
    public boolean hasDoubleValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).hasDoubleValue();
    }

    @Override // com.google.protobuf.B1
    public boolean hasIdentifierValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).hasIdentifierValue();
    }

    @Override // com.google.protobuf.B1
    public boolean hasNegativeIntValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).hasNegativeIntValue();
    }

    @Override // com.google.protobuf.B1
    public boolean hasPositiveIntValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).hasPositiveIntValue();
    }

    @Override // com.google.protobuf.B1
    public boolean hasStringValue() {
        return ((DescriptorProtos$UninterpretedOption) this.instance).hasStringValue();
    }

    public C2035y1 removeName(int i9) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).removeName(i9);
        return this;
    }

    public C2035y1 setAggregateValue(String str) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setAggregateValue(str);
        return this;
    }

    public C2035y1 setAggregateValueBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setAggregateValueBytes(h6);
        return this;
    }

    public C2035y1 setDoubleValue(double d2) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setDoubleValue(d2);
        return this;
    }

    public C2035y1 setIdentifierValue(String str) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setIdentifierValue(str);
        return this;
    }

    public C2035y1 setIdentifierValueBytes(H h6) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setIdentifierValueBytes(h6);
        return this;
    }

    public C2035y1 setName(int i9, DescriptorProtos$UninterpretedOption.NamePart namePart) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setName(i9, namePart);
        return this;
    }

    public C2035y1 setNegativeIntValue(long j7) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setNegativeIntValue(j7);
        return this;
    }

    public C2035y1 setPositiveIntValue(long j7) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setPositiveIntValue(j7);
        return this;
    }

    public C2035y1 setStringValue(H h6) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setStringValue(h6);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2035y1() {
        /*
            r1 = this;
            com.google.protobuf.DescriptorProtos$UninterpretedOption r0 = com.google.protobuf.DescriptorProtos$UninterpretedOption.access$40400()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2035y1.<init>():void");
    }

    public C2035y1 addName(int i9, DescriptorProtos$UninterpretedOption.NamePart namePart) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).addName(i9, namePart);
        return this;
    }

    public C2035y1 setName(int i9, C2042z1 c2042z1) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).setName(i9, (DescriptorProtos$UninterpretedOption.NamePart) c2042z1.build());
        return this;
    }

    public C2035y1 addName(C2042z1 c2042z1) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).addName((DescriptorProtos$UninterpretedOption.NamePart) c2042z1.build());
        return this;
    }

    public C2035y1 addName(int i9, C2042z1 c2042z1) {
        copyOnWrite();
        ((DescriptorProtos$UninterpretedOption) this.instance).addName(i9, (DescriptorProtos$UninterpretedOption.NamePart) c2042z1.build());
        return this;
    }
}
