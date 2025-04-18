package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class u1 extends h3 implements v1 {
    public /* synthetic */ u1(t1 t1Var) {
        this();
    }

    public u1 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((EnumValue) this.instance).addAllOptions(iterable);
        return this;
    }

    public u1 addOptions(Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(option);
        return this;
    }

    public u1 clearName() {
        copyOnWrite();
        ((EnumValue) this.instance).clearName();
        return this;
    }

    public u1 clearNumber() {
        copyOnWrite();
        ((EnumValue) this.instance).clearNumber();
        return this;
    }

    public u1 clearOptions() {
        copyOnWrite();
        ((EnumValue) this.instance).clearOptions();
        return this;
    }

    @Override // com.google.protobuf.v1
    public String getName() {
        return ((EnumValue) this.instance).getName();
    }

    @Override // com.google.protobuf.v1
    public h0 getNameBytes() {
        return ((EnumValue) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.v1
    public int getNumber() {
        return ((EnumValue) this.instance).getNumber();
    }

    @Override // com.google.protobuf.v1
    public Option getOptions(int i10) {
        return ((EnumValue) this.instance).getOptions(i10);
    }

    @Override // com.google.protobuf.v1
    public int getOptionsCount() {
        return ((EnumValue) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.v1
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
    }

    public u1 removeOptions(int i10) {
        copyOnWrite();
        ((EnumValue) this.instance).removeOptions(i10);
        return this;
    }

    public u1 setName(String str) {
        copyOnWrite();
        ((EnumValue) this.instance).setName(str);
        return this;
    }

    public u1 setNameBytes(h0 h0Var) {
        copyOnWrite();
        ((EnumValue) this.instance).setNameBytes(h0Var);
        return this;
    }

    public u1 setNumber(int i10) {
        copyOnWrite();
        ((EnumValue) this.instance).setNumber(i10);
        return this;
    }

    public u1 setOptions(int i10, Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).setOptions(i10, option);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private u1() {
        /*
            r1 = this;
            com.google.protobuf.EnumValue r0 = com.google.protobuf.EnumValue.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u1.<init>():void");
    }

    public u1 addOptions(int i10, Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(i10, option);
        return this;
    }

    public u1 setOptions(int i10, k6 k6Var) {
        copyOnWrite();
        ((EnumValue) this.instance).setOptions(i10, (Option) k6Var.build());
        return this;
    }

    public u1 addOptions(k6 k6Var) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions((Option) k6Var.build());
        return this;
    }

    public u1 addOptions(int i10, k6 k6Var) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(i10, (Option) k6Var.build());
        return this;
    }
}
