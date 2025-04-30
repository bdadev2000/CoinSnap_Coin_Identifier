package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class N1 extends D2 implements O1 {
    public /* synthetic */ N1(M1 m12) {
        this();
    }

    public N1 addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        copyOnWrite();
        Enum.access$700((Enum) this.instance, iterable);
        return this;
    }

    public N1 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Enum.access$1300((Enum) this.instance, iterable);
        return this;
    }

    public N1 addEnumvalue(EnumValue enumValue) {
        copyOnWrite();
        Enum.access$500((Enum) this.instance, enumValue);
        return this;
    }

    public N1 addOptions(Option option) {
        copyOnWrite();
        Enum.access$1100((Enum) this.instance, option);
        return this;
    }

    public N1 clearEnumvalue() {
        copyOnWrite();
        Enum.access$800((Enum) this.instance);
        return this;
    }

    public N1 clearName() {
        copyOnWrite();
        Enum.access$200((Enum) this.instance);
        return this;
    }

    public N1 clearOptions() {
        copyOnWrite();
        Enum.access$1400((Enum) this.instance);
        return this;
    }

    public N1 clearSourceContext() {
        copyOnWrite();
        Enum.access$1800((Enum) this.instance);
        return this;
    }

    public N1 clearSyntax() {
        copyOnWrite();
        Enum.access$2100((Enum) this.instance);
        return this;
    }

    @Override // com.google.protobuf.O1
    public EnumValue getEnumvalue(int i9) {
        return ((Enum) this.instance).getEnumvalue(i9);
    }

    @Override // com.google.protobuf.O1
    public int getEnumvalueCount() {
        return ((Enum) this.instance).getEnumvalueCount();
    }

    @Override // com.google.protobuf.O1
    public List<EnumValue> getEnumvalueList() {
        return Collections.unmodifiableList(((Enum) this.instance).getEnumvalueList());
    }

    @Override // com.google.protobuf.O1
    public String getName() {
        return ((Enum) this.instance).getName();
    }

    @Override // com.google.protobuf.O1
    public H getNameBytes() {
        return ((Enum) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.O1
    public Option getOptions(int i9) {
        return ((Enum) this.instance).getOptions(i9);
    }

    @Override // com.google.protobuf.O1
    public int getOptionsCount() {
        return ((Enum) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.O1
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Enum) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.O1
    public SourceContext getSourceContext() {
        return ((Enum) this.instance).getSourceContext();
    }

    @Override // com.google.protobuf.O1
    public Z4 getSyntax() {
        return ((Enum) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.O1
    public int getSyntaxValue() {
        return ((Enum) this.instance).getSyntaxValue();
    }

    @Override // com.google.protobuf.O1
    public boolean hasSourceContext() {
        return ((Enum) this.instance).hasSourceContext();
    }

    public N1 mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Enum.access$1700((Enum) this.instance, sourceContext);
        return this;
    }

    public N1 removeEnumvalue(int i9) {
        copyOnWrite();
        Enum.access$900((Enum) this.instance, i9);
        return this;
    }

    public N1 removeOptions(int i9) {
        copyOnWrite();
        Enum.access$1500((Enum) this.instance, i9);
        return this;
    }

    public N1 setEnumvalue(int i9, EnumValue enumValue) {
        copyOnWrite();
        Enum.access$400((Enum) this.instance, i9, enumValue);
        return this;
    }

    public N1 setName(String str) {
        copyOnWrite();
        Enum.access$100((Enum) this.instance, str);
        return this;
    }

    public N1 setNameBytes(H h6) {
        copyOnWrite();
        Enum.access$300((Enum) this.instance, h6);
        return this;
    }

    public N1 setOptions(int i9, Option option) {
        copyOnWrite();
        Enum.access$1000((Enum) this.instance, i9, option);
        return this;
    }

    public N1 setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Enum.access$1600((Enum) this.instance, sourceContext);
        return this;
    }

    public N1 setSyntax(Z4 z42) {
        copyOnWrite();
        Enum.access$2000((Enum) this.instance, z42);
        return this;
    }

    public N1 setSyntaxValue(int i9) {
        copyOnWrite();
        Enum.access$1900((Enum) this.instance, i9);
        return this;
    }

    private N1() {
        super(Enum.access$000());
    }

    public N1 addEnumvalue(int i9, EnumValue enumValue) {
        copyOnWrite();
        Enum.access$600((Enum) this.instance, i9, enumValue);
        return this;
    }

    public N1 addOptions(int i9, Option option) {
        copyOnWrite();
        Enum.access$1200((Enum) this.instance, i9, option);
        return this;
    }

    public N1 setEnumvalue(int i9, Q1 q12) {
        copyOnWrite();
        Enum.access$400((Enum) this.instance, i9, (EnumValue) q12.build());
        return this;
    }

    public N1 setOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        Enum.access$1000((Enum) this.instance, i9, (Option) c1934j4.build());
        return this;
    }

    public N1 setSourceContext(M4 m42) {
        copyOnWrite();
        Enum.access$1600((Enum) this.instance, (SourceContext) m42.build());
        return this;
    }

    public N1 addEnumvalue(Q1 q12) {
        copyOnWrite();
        Enum.access$500((Enum) this.instance, (EnumValue) q12.build());
        return this;
    }

    public N1 addOptions(C1934j4 c1934j4) {
        copyOnWrite();
        Enum.access$1100((Enum) this.instance, (Option) c1934j4.build());
        return this;
    }

    public N1 addEnumvalue(int i9, Q1 q12) {
        copyOnWrite();
        Enum.access$600((Enum) this.instance, i9, (EnumValue) q12.build());
        return this;
    }

    public N1 addOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        Enum.access$1200((Enum) this.instance, i9, (Option) c1934j4.build());
        return this;
    }
}
