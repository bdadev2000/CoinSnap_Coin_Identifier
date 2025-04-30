package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1883c2 extends D2 implements InterfaceC1974p2 {
    public /* synthetic */ C1883c2(AbstractC1876b2 abstractC1876b2) {
        this();
    }

    public C1883c2 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((Field) this.instance).addAllOptions(iterable);
        return this;
    }

    public C1883c2 addOptions(Option option) {
        copyOnWrite();
        ((Field) this.instance).addOptions(option);
        return this;
    }

    public C1883c2 clearCardinality() {
        copyOnWrite();
        ((Field) this.instance).clearCardinality();
        return this;
    }

    public C1883c2 clearDefaultValue() {
        copyOnWrite();
        ((Field) this.instance).clearDefaultValue();
        return this;
    }

    public C1883c2 clearJsonName() {
        copyOnWrite();
        ((Field) this.instance).clearJsonName();
        return this;
    }

    public C1883c2 clearKind() {
        copyOnWrite();
        ((Field) this.instance).clearKind();
        return this;
    }

    public C1883c2 clearName() {
        copyOnWrite();
        ((Field) this.instance).clearName();
        return this;
    }

    public C1883c2 clearNumber() {
        copyOnWrite();
        ((Field) this.instance).clearNumber();
        return this;
    }

    public C1883c2 clearOneofIndex() {
        copyOnWrite();
        ((Field) this.instance).clearOneofIndex();
        return this;
    }

    public C1883c2 clearOptions() {
        copyOnWrite();
        ((Field) this.instance).clearOptions();
        return this;
    }

    public C1883c2 clearPacked() {
        copyOnWrite();
        ((Field) this.instance).clearPacked();
        return this;
    }

    public C1883c2 clearTypeUrl() {
        copyOnWrite();
        ((Field) this.instance).clearTypeUrl();
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public EnumC1904f2 getCardinality() {
        return ((Field) this.instance).getCardinality();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getCardinalityValue() {
        return ((Field) this.instance).getCardinalityValue();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getDefaultValue() {
        return ((Field) this.instance).getDefaultValue();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getDefaultValueBytes() {
        return ((Field) this.instance).getDefaultValueBytes();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getJsonName() {
        return ((Field) this.instance).getJsonName();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getJsonNameBytes() {
        return ((Field) this.instance).getJsonNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public EnumC1925i2 getKind() {
        return ((Field) this.instance).getKind();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getKindValue() {
        return ((Field) this.instance).getKindValue();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getName() {
        return ((Field) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getNameBytes() {
        return ((Field) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getNumber() {
        return ((Field) this.instance).getNumber();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getOneofIndex() {
        return ((Field) this.instance).getOneofIndex();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public Option getOptions(int i9) {
        return ((Field) this.instance).getOptions(i9);
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getOptionsCount() {
        return ((Field) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Field) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public boolean getPacked() {
        return ((Field) this.instance).getPacked();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getTypeUrl() {
        return ((Field) this.instance).getTypeUrl();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getTypeUrlBytes() {
        return ((Field) this.instance).getTypeUrlBytes();
    }

    public C1883c2 removeOptions(int i9) {
        copyOnWrite();
        ((Field) this.instance).removeOptions(i9);
        return this;
    }

    public C1883c2 setCardinality(EnumC1904f2 enumC1904f2) {
        copyOnWrite();
        ((Field) this.instance).setCardinality(enumC1904f2);
        return this;
    }

    public C1883c2 setCardinalityValue(int i9) {
        copyOnWrite();
        ((Field) this.instance).setCardinalityValue(i9);
        return this;
    }

    public C1883c2 setDefaultValue(String str) {
        copyOnWrite();
        ((Field) this.instance).setDefaultValue(str);
        return this;
    }

    public C1883c2 setDefaultValueBytes(H h6) {
        copyOnWrite();
        ((Field) this.instance).setDefaultValueBytes(h6);
        return this;
    }

    public C1883c2 setJsonName(String str) {
        copyOnWrite();
        ((Field) this.instance).setJsonName(str);
        return this;
    }

    public C1883c2 setJsonNameBytes(H h6) {
        copyOnWrite();
        ((Field) this.instance).setJsonNameBytes(h6);
        return this;
    }

    public C1883c2 setKind(EnumC1925i2 enumC1925i2) {
        copyOnWrite();
        ((Field) this.instance).setKind(enumC1925i2);
        return this;
    }

    public C1883c2 setKindValue(int i9) {
        copyOnWrite();
        ((Field) this.instance).setKindValue(i9);
        return this;
    }

    public C1883c2 setName(String str) {
        copyOnWrite();
        ((Field) this.instance).setName(str);
        return this;
    }

    public C1883c2 setNameBytes(H h6) {
        copyOnWrite();
        ((Field) this.instance).setNameBytes(h6);
        return this;
    }

    public C1883c2 setNumber(int i9) {
        copyOnWrite();
        ((Field) this.instance).setNumber(i9);
        return this;
    }

    public C1883c2 setOneofIndex(int i9) {
        copyOnWrite();
        ((Field) this.instance).setOneofIndex(i9);
        return this;
    }

    public C1883c2 setOptions(int i9, Option option) {
        copyOnWrite();
        ((Field) this.instance).setOptions(i9, option);
        return this;
    }

    public C1883c2 setPacked(boolean z8) {
        copyOnWrite();
        ((Field) this.instance).setPacked(z8);
        return this;
    }

    public C1883c2 setTypeUrl(String str) {
        copyOnWrite();
        ((Field) this.instance).setTypeUrl(str);
        return this;
    }

    public C1883c2 setTypeUrlBytes(H h6) {
        copyOnWrite();
        ((Field) this.instance).setTypeUrlBytes(h6);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1883c2() {
        /*
            r1 = this;
            com.google.protobuf.Field r0 = com.google.protobuf.Field.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1883c2.<init>():void");
    }

    public C1883c2 addOptions(int i9, Option option) {
        copyOnWrite();
        ((Field) this.instance).addOptions(i9, option);
        return this;
    }

    public C1883c2 setOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        ((Field) this.instance).setOptions(i9, (Option) c1934j4.build());
        return this;
    }

    public C1883c2 addOptions(C1934j4 c1934j4) {
        copyOnWrite();
        ((Field) this.instance).addOptions((Option) c1934j4.build());
        return this;
    }

    public C1883c2 addOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        ((Field) this.instance).addOptions(i9, (Option) c1934j4.build());
        return this;
    }
}
