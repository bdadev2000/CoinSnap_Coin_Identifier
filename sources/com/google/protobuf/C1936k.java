package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1936k extends D2 implements InterfaceC1943l {
    public /* synthetic */ C1936k(AbstractC1929j abstractC1929j) {
        this();
    }

    public C1936k addAllMethods(Iterable<? extends Method> iterable) {
        copyOnWrite();
        Api.access$700((Api) this.instance, iterable);
        return this;
    }

    public C1936k addAllMixins(Iterable<? extends Mixin> iterable) {
        copyOnWrite();
        Api.access$2500((Api) this.instance, iterable);
        return this;
    }

    public C1936k addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        Api.access$1300((Api) this.instance, iterable);
        return this;
    }

    public C1936k addMethods(Method method) {
        copyOnWrite();
        Api.access$500((Api) this.instance, method);
        return this;
    }

    public C1936k addMixins(Mixin mixin) {
        copyOnWrite();
        Api.access$2300((Api) this.instance, mixin);
        return this;
    }

    public C1936k addOptions(Option option) {
        copyOnWrite();
        Api.access$1100((Api) this.instance, option);
        return this;
    }

    public C1936k clearMethods() {
        copyOnWrite();
        Api.access$800((Api) this.instance);
        return this;
    }

    public C1936k clearMixins() {
        copyOnWrite();
        Api.access$2600((Api) this.instance);
        return this;
    }

    public C1936k clearName() {
        copyOnWrite();
        Api.access$200((Api) this.instance);
        return this;
    }

    public C1936k clearOptions() {
        copyOnWrite();
        Api.access$1400((Api) this.instance);
        return this;
    }

    public C1936k clearSourceContext() {
        copyOnWrite();
        Api.access$2100((Api) this.instance);
        return this;
    }

    public C1936k clearSyntax() {
        copyOnWrite();
        Api.access$3000((Api) this.instance);
        return this;
    }

    public C1936k clearVersion() {
        copyOnWrite();
        Api.access$1700((Api) this.instance);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Method getMethods(int i9) {
        return ((Api) this.instance).getMethods(i9);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getMethodsCount() {
        return ((Api) this.instance).getMethodsCount();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public List<Method> getMethodsList() {
        return Collections.unmodifiableList(((Api) this.instance).getMethodsList());
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Mixin getMixins(int i9) {
        return ((Api) this.instance).getMixins(i9);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getMixinsCount() {
        return ((Api) this.instance).getMixinsCount();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public List<Mixin> getMixinsList() {
        return Collections.unmodifiableList(((Api) this.instance).getMixinsList());
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public String getName() {
        return ((Api) this.instance).getName();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public H getNameBytes() {
        return ((Api) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Option getOptions(int i9) {
        return ((Api) this.instance).getOptions(i9);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getOptionsCount() {
        return ((Api) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Api) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public SourceContext getSourceContext() {
        return ((Api) this.instance).getSourceContext();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Z4 getSyntax() {
        return ((Api) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getSyntaxValue() {
        return ((Api) this.instance).getSyntaxValue();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public String getVersion() {
        return ((Api) this.instance).getVersion();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public H getVersionBytes() {
        return ((Api) this.instance).getVersionBytes();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public boolean hasSourceContext() {
        return ((Api) this.instance).hasSourceContext();
    }

    public C1936k mergeSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Api.access$2000((Api) this.instance, sourceContext);
        return this;
    }

    public C1936k removeMethods(int i9) {
        copyOnWrite();
        Api.access$900((Api) this.instance, i9);
        return this;
    }

    public C1936k removeMixins(int i9) {
        copyOnWrite();
        Api.access$2700((Api) this.instance, i9);
        return this;
    }

    public C1936k removeOptions(int i9) {
        copyOnWrite();
        Api.access$1500((Api) this.instance, i9);
        return this;
    }

    public C1936k setMethods(int i9, Method method) {
        copyOnWrite();
        Api.access$400((Api) this.instance, i9, method);
        return this;
    }

    public C1936k setMixins(int i9, Mixin mixin) {
        copyOnWrite();
        Api.access$2200((Api) this.instance, i9, mixin);
        return this;
    }

    public C1936k setName(String str) {
        copyOnWrite();
        Api.access$100((Api) this.instance, str);
        return this;
    }

    public C1936k setNameBytes(H h6) {
        copyOnWrite();
        Api.access$300((Api) this.instance, h6);
        return this;
    }

    public C1936k setOptions(int i9, Option option) {
        copyOnWrite();
        Api.access$1000((Api) this.instance, i9, option);
        return this;
    }

    public C1936k setSourceContext(SourceContext sourceContext) {
        copyOnWrite();
        Api.access$1900((Api) this.instance, sourceContext);
        return this;
    }

    public C1936k setSyntax(Z4 z42) {
        copyOnWrite();
        Api.access$2900((Api) this.instance, z42);
        return this;
    }

    public C1936k setSyntaxValue(int i9) {
        copyOnWrite();
        Api.access$2800((Api) this.instance, i9);
        return this;
    }

    public C1936k setVersion(String str) {
        copyOnWrite();
        Api.access$1600((Api) this.instance, str);
        return this;
    }

    public C1936k setVersionBytes(H h6) {
        copyOnWrite();
        Api.access$1800((Api) this.instance, h6);
        return this;
    }

    private C1936k() {
        super(Api.access$000());
    }

    public C1936k addMethods(int i9, Method method) {
        copyOnWrite();
        Api.access$600((Api) this.instance, i9, method);
        return this;
    }

    public C1936k addMixins(int i9, Mixin mixin) {
        copyOnWrite();
        Api.access$2400((Api) this.instance, i9, mixin);
        return this;
    }

    public C1936k addOptions(int i9, Option option) {
        copyOnWrite();
        Api.access$1200((Api) this.instance, i9, option);
        return this;
    }

    public C1936k setMethods(int i9, U3 u32) {
        copyOnWrite();
        Api.access$400((Api) this.instance, i9, (Method) u32.build());
        return this;
    }

    public C1936k setMixins(int i9, X3 x32) {
        copyOnWrite();
        Api.access$2200((Api) this.instance, i9, (Mixin) x32.build());
        return this;
    }

    public C1936k setOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        Api.access$1000((Api) this.instance, i9, (Option) c1934j4.build());
        return this;
    }

    public C1936k setSourceContext(M4 m42) {
        copyOnWrite();
        Api.access$1900((Api) this.instance, (SourceContext) m42.build());
        return this;
    }

    public C1936k addMethods(U3 u32) {
        copyOnWrite();
        Api.access$500((Api) this.instance, (Method) u32.build());
        return this;
    }

    public C1936k addMixins(X3 x32) {
        copyOnWrite();
        Api.access$2300((Api) this.instance, (Mixin) x32.build());
        return this;
    }

    public C1936k addOptions(C1934j4 c1934j4) {
        copyOnWrite();
        Api.access$1100((Api) this.instance, (Option) c1934j4.build());
        return this;
    }

    public C1936k addMethods(int i9, U3 u32) {
        copyOnWrite();
        Api.access$600((Api) this.instance, i9, (Method) u32.build());
        return this;
    }

    public C1936k addMixins(int i9, X3 x32) {
        copyOnWrite();
        Api.access$2400((Api) this.instance, i9, (Mixin) x32.build());
        return this;
    }

    public C1936k addOptions(int i9, C1934j4 c1934j4) {
        copyOnWrite();
        Api.access$1200((Api) this.instance, i9, (Option) c1934j4.build());
        return this;
    }
}
