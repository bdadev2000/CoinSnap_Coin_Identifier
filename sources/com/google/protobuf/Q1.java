package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Q1 extends D2 implements R1 {
    public /* synthetic */ Q1(P1 p12) {
        this();
    }

    public Q1 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((EnumValue) this.instance).addAllOptions(iterable);
        return this;
    }

    public Q1 addOptions(Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(option);
        return this;
    }

    public Q1 clearName() {
        copyOnWrite();
        ((EnumValue) this.instance).clearName();
        return this;
    }

    public Q1 clearNumber() {
        copyOnWrite();
        ((EnumValue) this.instance).clearNumber();
        return this;
    }

    public Q1 clearOptions() {
        copyOnWrite();
        ((EnumValue) this.instance).clearOptions();
        return this;
    }

    @Override // com.google.protobuf.R1
    public String getName() {
        return ((EnumValue) this.instance).getName();
    }

    @Override // com.google.protobuf.R1
    public H getNameBytes() {
        return ((EnumValue) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.R1
    public int getNumber() {
        return ((EnumValue) this.instance).getNumber();
    }

    @Override // com.google.protobuf.R1
    public Option getOptions(int i9) {
        return ((EnumValue) this.instance).getOptions(i9);
    }

    @Override // com.google.protobuf.R1
    public int getOptionsCount() {
        return ((EnumValue) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.R1
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
    }

    public Q1 removeOptions(int i9) {
        copyOnWrite();
        ((EnumValue) this.instance).removeOptions(i9);
        return this;
    }

    public Q1 setName(String str) {
        copyOnWrite();
        ((EnumValue) this.instance).setName(str);
        return this;
    }

    public Q1 setNameBytes(H h6) {
        copyOnWrite();
        ((EnumValue) this.instance).setNameBytes(h6);
        return this;
    }

    public Q1 setNumber(int i9) {
        copyOnWrite();
        ((EnumValue) this.instance).setNumber(i9);
        return this;
    }

    public Q1 setOptions(int i9, Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).setOptions(i9, option);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Q1() {
        /*
            r1 = this;
            com.google.protobuf.EnumValue r0 = com.google.protobuf.EnumValue.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Q1.<init>():void");
    }

    public Q1 addOptions(int i9, Option option) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(i9, option);
        return this;
    }

    public Q1 setOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        ((EnumValue) this.instance).setOptions(i9, (Option) c1934j4.build());
        return this;
    }

    public Q1 addOptions(C1934j4 c1934j4) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions((Option) c1934j4.build());
        return this;
    }

    public Q1 addOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        ((EnumValue) this.instance).addOptions(i9, (Option) c1934j4.build());
        return this;
    }
}
