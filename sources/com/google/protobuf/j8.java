package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class j8 extends h3 implements k8 {
    public /* synthetic */ j8(i8 i8Var) {
        this();
    }

    public j8 addAllFields(Iterable<? extends Field> iterable) {
        copyOnWrite();
        Type.access$700((Type) this.instance, iterable);
        return this;
    }

    public j8 addAllOneofs(Iterable<String> iterable) {
        copyOnWrite();
        Type.access$1200((Type) this.instance, iterable);
        return this;
    }

    public j8 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Type.access$1800((Type) this.instance, iterable);
        return this;
    }

    public j8 addFields(Field field) {
        copyOnWrite();
        Type.access$500((Type) this.instance, field);
        return this;
    }

    public j8 addOneofs(String str) {
        copyOnWrite();
        Type.access$1100((Type) this.instance, str);
        return this;
    }

    public j8 addOneofsBytes(h0 h0Var) {
        copyOnWrite();
        Type.access$1400((Type) this.instance, h0Var);
        return this;
    }

    public j8 addOptions(Option option) {
        copyOnWrite();
        Type.access$1600((Type) this.instance, option);
        return this;
    }

    public j8 clearFields() {
        copyOnWrite();
        Type.access$800((Type) this.instance);
        return this;
    }

    public j8 clearName() {
        copyOnWrite();
        Type.access$200((Type) this.instance);
        return this;
    }

    public j8 clearOneofs() {
        copyOnWrite();
        Type.access$1300((Type) this.instance);
        return this;
    }

    public j8 clearOptions() {
        copyOnWrite();
        Type.access$1900((Type) this.instance);
        return this;
    }

    public j8 clearSourceContext() {
        copyOnWrite();
        Type.access$2300((Type) this.instance);
        return this;
    }

    public j8 clearSyntax() {
        copyOnWrite();
        Type.access$2600((Type) this.instance);
        return this;
    }

    @Override // com.google.protobuf.k8
    public Field getFields(int i10) {
        return ((Type) this.instance).getFields(i10);
    }

    @Override // com.google.protobuf.k8
    public int getFieldsCount() {
        return ((Type) this.instance).getFieldsCount();
    }

    @Override // com.google.protobuf.k8
    public List<Field> getFieldsList() {
        return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
    }

    @Override // com.google.protobuf.k8
    public String getName() {
        return ((Type) this.instance).getName();
    }

    @Override // com.google.protobuf.k8
    public h0 getNameBytes() {
        return ((Type) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.k8
    public String getOneofs(int i10) {
        return ((Type) this.instance).getOneofs(i10);
    }

    @Override // com.google.protobuf.k8
    public h0 getOneofsBytes(int i10) {
        return ((Type) this.instance).getOneofsBytes(i10);
    }

    @Override // com.google.protobuf.k8
    public int getOneofsCount() {
        return ((Type) this.instance).getOneofsCount();
    }

    @Override // com.google.protobuf.k8
    public List<String> getOneofsList() {
        return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
    }

    @Override // com.google.protobuf.k8
    public Option getOptions(int i10) {
        return ((Type) this.instance).getOptions(i10);
    }

    @Override // com.google.protobuf.k8
    public int getOptionsCount() {
        return ((Type) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.k8
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.k8
    public SourceContext getSourceContext() {
        return ((Type) this.instance).getSourceContext();
    }

    @Override // com.google.protobuf.k8
    public a8 getSyntax() {
        return ((Type) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.k8
    public int getSyntaxValue() {
        return ((Type) this.instance).getSyntaxValue();
    }

    @Override // com.google.protobuf.k8
    public boolean hasSourceContext() {
        return ((Type) this.instance).hasSourceContext();
    }

    public j8 mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Type.access$2200((Type) this.instance, sourceContext);
        return this;
    }

    public j8 removeFields(int i10) {
        copyOnWrite();
        Type.access$900((Type) this.instance, i10);
        return this;
    }

    public j8 removeOptions(int i10) {
        copyOnWrite();
        Type.access$2000((Type) this.instance, i10);
        return this;
    }

    public j8 setFields(int i10, Field field) {
        copyOnWrite();
        Type.access$400((Type) this.instance, i10, field);
        return this;
    }

    public j8 setName(String str) {
        copyOnWrite();
        Type.access$100((Type) this.instance, str);
        return this;
    }

    public j8 setNameBytes(h0 h0Var) {
        copyOnWrite();
        Type.access$300((Type) this.instance, h0Var);
        return this;
    }

    public j8 setOneofs(int i10, String str) {
        copyOnWrite();
        Type.access$1000((Type) this.instance, i10, str);
        return this;
    }

    public j8 setOptions(int i10, Option option) {
        copyOnWrite();
        Type.access$1500((Type) this.instance, i10, option);
        return this;
    }

    public j8 setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Type.access$2100((Type) this.instance, sourceContext);
        return this;
    }

    public j8 setSyntax(a8 a8Var) {
        copyOnWrite();
        Type.access$2500((Type) this.instance, a8Var);
        return this;
    }

    public j8 setSyntaxValue(int i10) {
        copyOnWrite();
        Type.access$2400((Type) this.instance, i10);
        return this;
    }

    private j8() {
        super(Type.access$000());
    }

    public j8 addFields(int i10, Field field) {
        copyOnWrite();
        Type.access$600((Type) this.instance, i10, field);
        return this;
    }

    public j8 addOptions(int i10, Option option) {
        copyOnWrite();
        Type.access$1700((Type) this.instance, i10, option);
        return this;
    }

    public j8 setFields(int i10, g2 g2Var) {
        copyOnWrite();
        Type.access$400((Type) this.instance, i10, (Field) g2Var.build());
        return this;
    }

    public j8 setOptions(int i10, k6 k6Var) {
        copyOnWrite();
        Type.access$1500((Type) this.instance, i10, (Option) k6Var.build());
        return this;
    }

    public j8 setSourceContext(n7 n7Var) {
        copyOnWrite();
        Type.access$2100((Type) this.instance, (SourceContext) n7Var.build());
        return this;
    }

    public j8 addFields(g2 g2Var) {
        copyOnWrite();
        Type.access$500((Type) this.instance, (Field) g2Var.build());
        return this;
    }

    public j8 addOptions(k6 k6Var) {
        copyOnWrite();
        Type.access$1600((Type) this.instance, (Option) k6Var.build());
        return this;
    }

    public j8 addFields(int i10, g2 g2Var) {
        copyOnWrite();
        Type.access$600((Type) this.instance, i10, (Field) g2Var.build());
        return this;
    }

    public j8 addOptions(int i10, k6 k6Var) {
        copyOnWrite();
        Type.access$1700((Type) this.instance, i10, (Option) k6Var.build());
        return this;
    }
}
