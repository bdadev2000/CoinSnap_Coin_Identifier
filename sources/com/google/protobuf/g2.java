package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class g2 extends h3 implements t2 {
    public /* synthetic */ g2(f2 f2Var) {
        this();
    }

    public g2 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((Field) this.instance).addAllOptions(iterable);
        return this;
    }

    public g2 addOptions(Option option) {
        copyOnWrite();
        ((Field) this.instance).addOptions(option);
        return this;
    }

    public g2 clearCardinality() {
        copyOnWrite();
        ((Field) this.instance).clearCardinality();
        return this;
    }

    public g2 clearDefaultValue() {
        copyOnWrite();
        ((Field) this.instance).clearDefaultValue();
        return this;
    }

    public g2 clearJsonName() {
        copyOnWrite();
        ((Field) this.instance).clearJsonName();
        return this;
    }

    public g2 clearKind() {
        copyOnWrite();
        ((Field) this.instance).clearKind();
        return this;
    }

    public g2 clearName() {
        copyOnWrite();
        ((Field) this.instance).clearName();
        return this;
    }

    public g2 clearNumber() {
        copyOnWrite();
        ((Field) this.instance).clearNumber();
        return this;
    }

    public g2 clearOneofIndex() {
        copyOnWrite();
        ((Field) this.instance).clearOneofIndex();
        return this;
    }

    public g2 clearOptions() {
        copyOnWrite();
        ((Field) this.instance).clearOptions();
        return this;
    }

    public g2 clearPacked() {
        copyOnWrite();
        ((Field) this.instance).clearPacked();
        return this;
    }

    public g2 clearTypeUrl() {
        copyOnWrite();
        ((Field) this.instance).clearTypeUrl();
        return this;
    }

    @Override // com.google.protobuf.t2
    public j2 getCardinality() {
        return ((Field) this.instance).getCardinality();
    }

    @Override // com.google.protobuf.t2
    public int getCardinalityValue() {
        return ((Field) this.instance).getCardinalityValue();
    }

    @Override // com.google.protobuf.t2
    public String getDefaultValue() {
        return ((Field) this.instance).getDefaultValue();
    }

    @Override // com.google.protobuf.t2
    public h0 getDefaultValueBytes() {
        return ((Field) this.instance).getDefaultValueBytes();
    }

    @Override // com.google.protobuf.t2
    public String getJsonName() {
        return ((Field) this.instance).getJsonName();
    }

    @Override // com.google.protobuf.t2
    public h0 getJsonNameBytes() {
        return ((Field) this.instance).getJsonNameBytes();
    }

    @Override // com.google.protobuf.t2
    public m2 getKind() {
        return ((Field) this.instance).getKind();
    }

    @Override // com.google.protobuf.t2
    public int getKindValue() {
        return ((Field) this.instance).getKindValue();
    }

    @Override // com.google.protobuf.t2
    public String getName() {
        return ((Field) this.instance).getName();
    }

    @Override // com.google.protobuf.t2
    public h0 getNameBytes() {
        return ((Field) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.t2
    public int getNumber() {
        return ((Field) this.instance).getNumber();
    }

    @Override // com.google.protobuf.t2
    public int getOneofIndex() {
        return ((Field) this.instance).getOneofIndex();
    }

    @Override // com.google.protobuf.t2
    public Option getOptions(int i10) {
        return ((Field) this.instance).getOptions(i10);
    }

    @Override // com.google.protobuf.t2
    public int getOptionsCount() {
        return ((Field) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.t2
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Field) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.t2
    public boolean getPacked() {
        return ((Field) this.instance).getPacked();
    }

    @Override // com.google.protobuf.t2
    public String getTypeUrl() {
        return ((Field) this.instance).getTypeUrl();
    }

    @Override // com.google.protobuf.t2
    public h0 getTypeUrlBytes() {
        return ((Field) this.instance).getTypeUrlBytes();
    }

    public g2 removeOptions(int i10) {
        copyOnWrite();
        ((Field) this.instance).removeOptions(i10);
        return this;
    }

    public g2 setCardinality(j2 j2Var) {
        copyOnWrite();
        ((Field) this.instance).setCardinality(j2Var);
        return this;
    }

    public g2 setCardinalityValue(int i10) {
        copyOnWrite();
        ((Field) this.instance).setCardinalityValue(i10);
        return this;
    }

    public g2 setDefaultValue(String str) {
        copyOnWrite();
        ((Field) this.instance).setDefaultValue(str);
        return this;
    }

    public g2 setDefaultValueBytes(h0 h0Var) {
        copyOnWrite();
        ((Field) this.instance).setDefaultValueBytes(h0Var);
        return this;
    }

    public g2 setJsonName(String str) {
        copyOnWrite();
        ((Field) this.instance).setJsonName(str);
        return this;
    }

    public g2 setJsonNameBytes(h0 h0Var) {
        copyOnWrite();
        ((Field) this.instance).setJsonNameBytes(h0Var);
        return this;
    }

    public g2 setKind(m2 m2Var) {
        copyOnWrite();
        ((Field) this.instance).setKind(m2Var);
        return this;
    }

    public g2 setKindValue(int i10) {
        copyOnWrite();
        ((Field) this.instance).setKindValue(i10);
        return this;
    }

    public g2 setName(String str) {
        copyOnWrite();
        ((Field) this.instance).setName(str);
        return this;
    }

    public g2 setNameBytes(h0 h0Var) {
        copyOnWrite();
        ((Field) this.instance).setNameBytes(h0Var);
        return this;
    }

    public g2 setNumber(int i10) {
        copyOnWrite();
        ((Field) this.instance).setNumber(i10);
        return this;
    }

    public g2 setOneofIndex(int i10) {
        copyOnWrite();
        ((Field) this.instance).setOneofIndex(i10);
        return this;
    }

    public g2 setOptions(int i10, Option option) {
        copyOnWrite();
        ((Field) this.instance).setOptions(i10, option);
        return this;
    }

    public g2 setPacked(boolean z10) {
        copyOnWrite();
        ((Field) this.instance).setPacked(z10);
        return this;
    }

    public g2 setTypeUrl(String str) {
        copyOnWrite();
        ((Field) this.instance).setTypeUrl(str);
        return this;
    }

    public g2 setTypeUrlBytes(h0 h0Var) {
        copyOnWrite();
        ((Field) this.instance).setTypeUrlBytes(h0Var);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private g2() {
        /*
            r1 = this;
            com.google.protobuf.Field r0 = com.google.protobuf.Field.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g2.<init>():void");
    }

    public g2 addOptions(int i10, Option option) {
        copyOnWrite();
        ((Field) this.instance).addOptions(i10, option);
        return this;
    }

    public g2 setOptions(int i10, k6 k6Var) {
        copyOnWrite();
        ((Field) this.instance).setOptions(i10, (Option) k6Var.build());
        return this;
    }

    public g2 addOptions(k6 k6Var) {
        copyOnWrite();
        ((Field) this.instance).addOptions((Option) k6Var.build());
        return this;
    }

    public g2 addOptions(int i10, k6 k6Var) {
        copyOnWrite();
        ((Field) this.instance).addOptions(i10, (Option) k6Var.build());
        return this;
    }
}
