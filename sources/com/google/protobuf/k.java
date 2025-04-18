package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class k extends h3 implements l {
    public /* synthetic */ k(j jVar) {
        this();
    }

    public k addAllMethods(Iterable<? extends Method> iterable) {
        copyOnWrite();
        Api.access$700((Api) this.instance, iterable);
        return this;
    }

    public k addAllMixins(Iterable<? extends Mixin> iterable) {
        copyOnWrite();
        Api.access$2500((Api) this.instance, iterable);
        return this;
    }

    public k addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Api.access$1300((Api) this.instance, iterable);
        return this;
    }

    public k addMethods(Method method) {
        copyOnWrite();
        Api.access$500((Api) this.instance, method);
        return this;
    }

    public k addMixins(Mixin mixin) {
        copyOnWrite();
        Api.access$2300((Api) this.instance, mixin);
        return this;
    }

    public k addOptions(Option option) {
        copyOnWrite();
        Api.access$1100((Api) this.instance, option);
        return this;
    }

    public k clearMethods() {
        copyOnWrite();
        Api.access$800((Api) this.instance);
        return this;
    }

    public k clearMixins() {
        copyOnWrite();
        Api.access$2600((Api) this.instance);
        return this;
    }

    public k clearName() {
        copyOnWrite();
        Api.access$200((Api) this.instance);
        return this;
    }

    public k clearOptions() {
        copyOnWrite();
        Api.access$1400((Api) this.instance);
        return this;
    }

    public k clearSourceContext() {
        copyOnWrite();
        Api.access$2100((Api) this.instance);
        return this;
    }

    public k clearSyntax() {
        copyOnWrite();
        Api.access$3000((Api) this.instance);
        return this;
    }

    public k clearVersion() {
        copyOnWrite();
        Api.access$1700((Api) this.instance);
        return this;
    }

    @Override // com.google.protobuf.l
    public Method getMethods(int i10) {
        return ((Api) this.instance).getMethods(i10);
    }

    @Override // com.google.protobuf.l
    public int getMethodsCount() {
        return ((Api) this.instance).getMethodsCount();
    }

    @Override // com.google.protobuf.l
    public List<Method> getMethodsList() {
        return Collections.unmodifiableList(((Api) this.instance).getMethodsList());
    }

    @Override // com.google.protobuf.l
    public Mixin getMixins(int i10) {
        return ((Api) this.instance).getMixins(i10);
    }

    @Override // com.google.protobuf.l
    public int getMixinsCount() {
        return ((Api) this.instance).getMixinsCount();
    }

    @Override // com.google.protobuf.l
    public List<Mixin> getMixinsList() {
        return Collections.unmodifiableList(((Api) this.instance).getMixinsList());
    }

    @Override // com.google.protobuf.l
    public String getName() {
        return ((Api) this.instance).getName();
    }

    @Override // com.google.protobuf.l
    public h0 getNameBytes() {
        return ((Api) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.l
    public Option getOptions(int i10) {
        return ((Api) this.instance).getOptions(i10);
    }

    @Override // com.google.protobuf.l
    public int getOptionsCount() {
        return ((Api) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.l
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Api) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.l
    public SourceContext getSourceContext() {
        return ((Api) this.instance).getSourceContext();
    }

    @Override // com.google.protobuf.l
    public a8 getSyntax() {
        return ((Api) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.l
    public int getSyntaxValue() {
        return ((Api) this.instance).getSyntaxValue();
    }

    @Override // com.google.protobuf.l
    public String getVersion() {
        return ((Api) this.instance).getVersion();
    }

    @Override // com.google.protobuf.l
    public h0 getVersionBytes() {
        return ((Api) this.instance).getVersionBytes();
    }

    @Override // com.google.protobuf.l
    public boolean hasSourceContext() {
        return ((Api) this.instance).hasSourceContext();
    }

    public k mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Api.access$2000((Api) this.instance, sourceContext);
        return this;
    }

    public k removeMethods(int i10) {
        copyOnWrite();
        Api.access$900((Api) this.instance, i10);
        return this;
    }

    public k removeMixins(int i10) {
        copyOnWrite();
        Api.access$2700((Api) this.instance, i10);
        return this;
    }

    public k removeOptions(int i10) {
        copyOnWrite();
        Api.access$1500((Api) this.instance, i10);
        return this;
    }

    public k setMethods(int i10, Method method) {
        copyOnWrite();
        Api.access$400((Api) this.instance, i10, method);
        return this;
    }

    public k setMixins(int i10, Mixin mixin) {
        copyOnWrite();
        Api.access$2200((Api) this.instance, i10, mixin);
        return this;
    }

    public k setName(String str) {
        copyOnWrite();
        Api.access$100((Api) this.instance, str);
        return this;
    }

    public k setNameBytes(h0 h0Var) {
        copyOnWrite();
        Api.access$300((Api) this.instance, h0Var);
        return this;
    }

    public k setOptions(int i10, Option option) {
        copyOnWrite();
        Api.access$1000((Api) this.instance, i10, option);
        return this;
    }

    public k setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Api.access$1900((Api) this.instance, sourceContext);
        return this;
    }

    public k setSyntax(a8 a8Var) {
        copyOnWrite();
        Api.access$2900((Api) this.instance, a8Var);
        return this;
    }

    public k setSyntaxValue(int i10) {
        copyOnWrite();
        Api.access$2800((Api) this.instance, i10);
        return this;
    }

    public k setVersion(String str) {
        copyOnWrite();
        Api.access$1600((Api) this.instance, str);
        return this;
    }

    public k setVersionBytes(h0 h0Var) {
        copyOnWrite();
        Api.access$1800((Api) this.instance, h0Var);
        return this;
    }

    private k() {
        super(Api.access$000());
    }

    public k addMethods(int i10, Method method) {
        copyOnWrite();
        Api.access$600((Api) this.instance, i10, method);
        return this;
    }

    public k addMixins(int i10, Mixin mixin) {
        copyOnWrite();
        Api.access$2400((Api) this.instance, i10, mixin);
        return this;
    }

    public k addOptions(int i10, Option option) {
        copyOnWrite();
        Api.access$1200((Api) this.instance, i10, option);
        return this;
    }

    public k setMethods(int i10, v5 v5Var) {
        copyOnWrite();
        Api.access$400((Api) this.instance, i10, (Method) v5Var.build());
        return this;
    }

    public k setMixins(int i10, y5 y5Var) {
        copyOnWrite();
        Api.access$2200((Api) this.instance, i10, (Mixin) y5Var.build());
        return this;
    }

    public k setOptions(int i10, k6 k6Var) {
        copyOnWrite();
        Api.access$1000((Api) this.instance, i10, (Option) k6Var.build());
        return this;
    }

    public k setSourceContext(n7 n7Var) {
        copyOnWrite();
        Api.access$1900((Api) this.instance, (SourceContext) n7Var.build());
        return this;
    }

    public k addMethods(v5 v5Var) {
        copyOnWrite();
        Api.access$500((Api) this.instance, (Method) v5Var.build());
        return this;
    }

    public k addMixins(y5 y5Var) {
        copyOnWrite();
        Api.access$2300((Api) this.instance, (Mixin) y5Var.build());
        return this;
    }

    public k addOptions(k6 k6Var) {
        copyOnWrite();
        Api.access$1100((Api) this.instance, (Option) k6Var.build());
        return this;
    }

    public k addMethods(int i10, v5 v5Var) {
        copyOnWrite();
        Api.access$600((Api) this.instance, i10, (Method) v5Var.build());
        return this;
    }

    public k addMixins(int i10, y5 y5Var) {
        copyOnWrite();
        Api.access$2400((Api) this.instance, i10, (Mixin) y5Var.build());
        return this;
    }

    public k addOptions(int i10, k6 k6Var) {
        copyOnWrite();
        Api.access$1200((Api) this.instance, i10, (Option) k6Var.build());
        return this;
    }
}
