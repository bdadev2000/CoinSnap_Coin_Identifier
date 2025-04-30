package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1928i5 extends D2 implements InterfaceC1935j5 {
    public /* synthetic */ C1928i5(AbstractC1921h5 abstractC1921h5) {
        this();
    }

    public C1928i5 addAllFields(Iterable<? extends Field> iterable) {
        copyOnWrite();
        Type.access$700((Type) this.instance, iterable);
        return this;
    }

    public C1928i5 addAllOneofs(Iterable<String> iterable) {
        copyOnWrite();
        Type.access$1200((Type) this.instance, iterable);
        return this;
    }

    public C1928i5 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Type.access$1800((Type) this.instance, iterable);
        return this;
    }

    public C1928i5 addFields(Field field) {
        copyOnWrite();
        Type.access$500((Type) this.instance, field);
        return this;
    }

    public C1928i5 addOneofs(String str) {
        copyOnWrite();
        Type.access$1100((Type) this.instance, str);
        return this;
    }

    public C1928i5 addOneofsBytes(H h6) {
        copyOnWrite();
        Type.access$1400((Type) this.instance, h6);
        return this;
    }

    public C1928i5 addOptions(Option option) {
        copyOnWrite();
        Type.access$1600((Type) this.instance, option);
        return this;
    }

    public C1928i5 clearFields() {
        copyOnWrite();
        Type.access$800((Type) this.instance);
        return this;
    }

    public C1928i5 clearName() {
        copyOnWrite();
        Type.access$200((Type) this.instance);
        return this;
    }

    public C1928i5 clearOneofs() {
        copyOnWrite();
        Type.access$1300((Type) this.instance);
        return this;
    }

    public C1928i5 clearOptions() {
        copyOnWrite();
        Type.access$1900((Type) this.instance);
        return this;
    }

    public C1928i5 clearSourceContext() {
        copyOnWrite();
        Type.access$2300((Type) this.instance);
        return this;
    }

    public C1928i5 clearSyntax() {
        copyOnWrite();
        Type.access$2600((Type) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public Field getFields(int i9) {
        return ((Type) this.instance).getFields(i9);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getFieldsCount() {
        return ((Type) this.instance).getFieldsCount();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public List<Field> getFieldsList() {
        return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public String getName() {
        return ((Type) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public H getNameBytes() {
        return ((Type) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public String getOneofs(int i9) {
        return ((Type) this.instance).getOneofs(i9);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public H getOneofsBytes(int i9) {
        return ((Type) this.instance).getOneofsBytes(i9);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getOneofsCount() {
        return ((Type) this.instance).getOneofsCount();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public List<String> getOneofsList() {
        return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public Option getOptions(int i9) {
        return ((Type) this.instance).getOptions(i9);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getOptionsCount() {
        return ((Type) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public SourceContext getSourceContext() {
        return ((Type) this.instance).getSourceContext();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public Z4 getSyntax() {
        return ((Type) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getSyntaxValue() {
        return ((Type) this.instance).getSyntaxValue();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public boolean hasSourceContext() {
        return ((Type) this.instance).hasSourceContext();
    }

    public C1928i5 mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Type.access$2200((Type) this.instance, sourceContext);
        return this;
    }

    public C1928i5 removeFields(int i9) {
        copyOnWrite();
        Type.access$900((Type) this.instance, i9);
        return this;
    }

    public C1928i5 removeOptions(int i9) {
        copyOnWrite();
        Type.access$2000((Type) this.instance, i9);
        return this;
    }

    public C1928i5 setFields(int i9, Field field) {
        copyOnWrite();
        Type.access$400((Type) this.instance, i9, field);
        return this;
    }

    public C1928i5 setName(String str) {
        copyOnWrite();
        Type.access$100((Type) this.instance, str);
        return this;
    }

    public C1928i5 setNameBytes(H h6) {
        copyOnWrite();
        Type.access$300((Type) this.instance, h6);
        return this;
    }

    public C1928i5 setOneofs(int i9, String str) {
        copyOnWrite();
        Type.access$1000((Type) this.instance, i9, str);
        return this;
    }

    public C1928i5 setOptions(int i9, Option option) {
        copyOnWrite();
        Type.access$1500((Type) this.instance, i9, option);
        return this;
    }

    public C1928i5 setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Type.access$2100((Type) this.instance, sourceContext);
        return this;
    }

    public C1928i5 setSyntax(Z4 z42) {
        copyOnWrite();
        Type.access$2500((Type) this.instance, z42);
        return this;
    }

    public C1928i5 setSyntaxValue(int i9) {
        copyOnWrite();
        Type.access$2400((Type) this.instance, i9);
        return this;
    }

    private C1928i5() {
        super(Type.access$000());
    }

    public C1928i5 addFields(int i9, Field field) {
        copyOnWrite();
        Type.access$600((Type) this.instance, i9, field);
        return this;
    }

    public C1928i5 addOptions(int i9, Option option) {
        copyOnWrite();
        Type.access$1700((Type) this.instance, i9, option);
        return this;
    }

    public C1928i5 setFields(int i9, C1883c2 c1883c2) {
        copyOnWrite();
        Type.access$400((Type) this.instance, i9, (Field) c1883c2.build());
        return this;
    }

    public C1928i5 setOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        Type.access$1500((Type) this.instance, i9, (Option) c1934j4.build());
        return this;
    }

    public C1928i5 setSourceContext(M4 m42) {
        copyOnWrite();
        Type.access$2100((Type) this.instance, (SourceContext) m42.build());
        return this;
    }

    public C1928i5 addFields(C1883c2 c1883c2) {
        copyOnWrite();
        Type.access$500((Type) this.instance, (Field) c1883c2.build());
        return this;
    }

    public C1928i5 addOptions(C1934j4 c1934j4) {
        copyOnWrite();
        Type.access$1600((Type) this.instance, (Option) c1934j4.build());
        return this;
    }

    public C1928i5 addFields(int i9, C1883c2 c1883c2) {
        copyOnWrite();
        Type.access$600((Type) this.instance, i9, (Field) c1883c2.build());
        return this;
    }

    public C1928i5 addOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        Type.access$1700((Type) this.instance, i9, (Option) c1934j4.build());
        return this;
    }
}
