package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class r1 extends h3 implements s1 {
    public /* synthetic */ r1(q1 q1Var) {
        this();
    }

    public r1 addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        copyOnWrite();
        Enum.access$700((Enum) this.instance, iterable);
        return this;
    }

    public r1 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Enum.access$1300((Enum) this.instance, iterable);
        return this;
    }

    public r1 addEnumvalue(EnumValue enumValue) {
        copyOnWrite();
        Enum.access$500((Enum) this.instance, enumValue);
        return this;
    }

    public r1 addOptions(Option option) {
        copyOnWrite();
        Enum.access$1100((Enum) this.instance, option);
        return this;
    }

    public r1 clearEnumvalue() {
        copyOnWrite();
        Enum.access$800((Enum) this.instance);
        return this;
    }

    public r1 clearName() {
        copyOnWrite();
        Enum.access$200((Enum) this.instance);
        return this;
    }

    public r1 clearOptions() {
        copyOnWrite();
        Enum.access$1400((Enum) this.instance);
        return this;
    }

    public r1 clearSourceContext() {
        copyOnWrite();
        Enum.access$1800((Enum) this.instance);
        return this;
    }

    public r1 clearSyntax() {
        copyOnWrite();
        Enum.access$2100((Enum) this.instance);
        return this;
    }

    @Override // com.google.protobuf.s1
    public EnumValue getEnumvalue(int i10) {
        return ((Enum) this.instance).getEnumvalue(i10);
    }

    @Override // com.google.protobuf.s1
    public int getEnumvalueCount() {
        return ((Enum) this.instance).getEnumvalueCount();
    }

    @Override // com.google.protobuf.s1
    public List<EnumValue> getEnumvalueList() {
        return Collections.unmodifiableList(((Enum) this.instance).getEnumvalueList());
    }

    @Override // com.google.protobuf.s1
    public String getName() {
        return ((Enum) this.instance).getName();
    }

    @Override // com.google.protobuf.s1
    public h0 getNameBytes() {
        return ((Enum) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.s1
    public Option getOptions(int i10) {
        return ((Enum) this.instance).getOptions(i10);
    }

    @Override // com.google.protobuf.s1
    public int getOptionsCount() {
        return ((Enum) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.s1
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Enum) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.s1
    public SourceContext getSourceContext() {
        return ((Enum) this.instance).getSourceContext();
    }

    @Override // com.google.protobuf.s1
    public a8 getSyntax() {
        return ((Enum) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.s1
    public int getSyntaxValue() {
        return ((Enum) this.instance).getSyntaxValue();
    }

    @Override // com.google.protobuf.s1
    public boolean hasSourceContext() {
        return ((Enum) this.instance).hasSourceContext();
    }

    public r1 mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Enum.access$1700((Enum) this.instance, sourceContext);
        return this;
    }

    public r1 removeEnumvalue(int i10) {
        copyOnWrite();
        Enum.access$900((Enum) this.instance, i10);
        return this;
    }

    public r1 removeOptions(int i10) {
        copyOnWrite();
        Enum.access$1500((Enum) this.instance, i10);
        return this;
    }

    public r1 setEnumvalue(int i10, EnumValue enumValue) {
        copyOnWrite();
        Enum.access$400((Enum) this.instance, i10, enumValue);
        return this;
    }

    public r1 setName(String str) {
        copyOnWrite();
        Enum.access$100((Enum) this.instance, str);
        return this;
    }

    public r1 setNameBytes(h0 h0Var) {
        copyOnWrite();
        Enum.access$300((Enum) this.instance, h0Var);
        return this;
    }

    public r1 setOptions(int i10, Option option) {
        copyOnWrite();
        Enum.access$1000((Enum) this.instance, i10, option);
        return this;
    }

    public r1 setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Enum.access$1600((Enum) this.instance, sourceContext);
        return this;
    }

    public r1 setSyntax(a8 a8Var) {
        copyOnWrite();
        Enum.access$2000((Enum) this.instance, a8Var);
        return this;
    }

    public r1 setSyntaxValue(int i10) {
        copyOnWrite();
        Enum.access$1900((Enum) this.instance, i10);
        return this;
    }

    private r1() {
        super(Enum.access$000());
    }

    public r1 addEnumvalue(int i10, EnumValue enumValue) {
        copyOnWrite();
        Enum.access$600((Enum) this.instance, i10, enumValue);
        return this;
    }

    public r1 addOptions(int i10, Option option) {
        copyOnWrite();
        Enum.access$1200((Enum) this.instance, i10, option);
        return this;
    }

    public r1 setEnumvalue(int i10, u1 u1Var) {
        copyOnWrite();
        Enum.access$400((Enum) this.instance, i10, (EnumValue) u1Var.build());
        return this;
    }

    public r1 setOptions(int i10, k6 k6Var) {
        copyOnWrite();
        Enum.access$1000((Enum) this.instance, i10, (Option) k6Var.build());
        return this;
    }

    public r1 setSourceContext(n7 n7Var) {
        copyOnWrite();
        Enum.access$1600((Enum) this.instance, (SourceContext) n7Var.build());
        return this;
    }

    public r1 addEnumvalue(u1 u1Var) {
        copyOnWrite();
        Enum.access$500((Enum) this.instance, (EnumValue) u1Var.build());
        return this;
    }

    public r1 addOptions(k6 k6Var) {
        copyOnWrite();
        Enum.access$1100((Enum) this.instance, (Option) k6Var.build());
        return this;
    }

    public r1 addEnumvalue(int i10, u1 u1Var) {
        copyOnWrite();
        Enum.access$600((Enum) this.instance, i10, (EnumValue) u1Var.build());
        return this;
    }

    public r1 addOptions(int i10, k6 k6Var) {
        copyOnWrite();
        Enum.access$1200((Enum) this.instance, i10, (Option) k6Var.build());
        return this;
    }
}
