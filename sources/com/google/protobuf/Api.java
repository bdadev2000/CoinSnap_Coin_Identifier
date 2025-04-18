package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Api extends o3 implements l {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile m6 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private e4 methods_ = o3.emptyProtobufList();
    private e4 options_ = o3.emptyProtobufList();
    private String version_ = "";
    private e4 mixins_ = o3.emptyProtobufList();

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        o3.registerDefaultInstance(Api.class, api);
    }

    private Api() {
    }

    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        c.addAll((Iterable) iterable, (List) this.methods_);
    }

    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        c.addAll((Iterable) iterable, (List) this.mixins_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        c.addAll((Iterable) iterable, (List) this.options_);
    }

    public void addMethods(Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    public void addMixins(Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearMethods() {
        this.methods_ = o3.emptyProtobufList();
    }

    public void clearMixins() {
        this.mixins_ = o3.emptyProtobufList();
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearOptions() {
        this.options_ = o3.emptyProtobufList();
    }

    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    public void clearSyntax() {
        this.syntax_ = 0;
    }

    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        e4 e4Var = this.methods_;
        if (!e4Var.isModifiable()) {
            this.methods_ = o3.mutableCopy(e4Var);
        }
    }

    private void ensureMixinsIsMutable() {
        e4 e4Var = this.mixins_;
        if (!e4Var.isModifiable()) {
            this.mixins_ = o3.mutableCopy(e4Var);
        }
    }

    private void ensureOptionsIsMutable() {
        e4 e4Var = this.options_;
        if (!e4Var.isModifiable()) {
            this.options_ = o3.mutableCopy(e4Var);
        }
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != SourceContext.getDefaultInstance()) {
            this.sourceContext_ = (SourceContext) ((n7) SourceContext.newBuilder(this.sourceContext_).mergeFrom((o3) sourceContext)).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeMethods(int i10) {
        ensureMethodsIsMutable();
        this.methods_.remove(i10);
    }

    public void removeMixins(int i10) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i10);
    }

    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    public void setMethods(int i10, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i10, method);
    }

    public void setMixins(int i10, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i10, mixin);
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.name_ = h0Var.toStringUtf8();
    }

    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    public void setSyntax(a8 a8Var) {
        this.syntax_ = a8Var.getNumber();
    }

    public void setSyntaxValue(int i10) {
        this.syntax_ = i10;
    }

    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    public void setVersionBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.version_ = h0Var.toStringUtf8();
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (j.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Api();
            case 2:
                return new k(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Api.class) {
                        m6Var = PARSER;
                        if (m6Var == null) {
                            m6Var = new i3(DEFAULT_INSTANCE);
                            PARSER = m6Var;
                        }
                    }
                }
                return m6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.l
    public Method getMethods(int i10) {
        return (Method) this.methods_.get(i10);
    }

    @Override // com.google.protobuf.l
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.l
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public w5 getMethodsOrBuilder(int i10) {
        return (w5) this.methods_.get(i10);
    }

    public List<? extends w5> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.l
    public Mixin getMixins(int i10) {
        return (Mixin) this.mixins_.get(i10);
    }

    @Override // com.google.protobuf.l
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.l
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public z5 getMixinsOrBuilder(int i10) {
        return (z5) this.mixins_.get(i10);
    }

    public List<? extends z5> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.l
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.l
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.l
    public Option getOptions(int i10) {
        return (Option) this.options_.get(i10);
    }

    @Override // com.google.protobuf.l
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.l
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public l6 getOptionsOrBuilder(int i10) {
        return (l6) this.options_.get(i10);
    }

    public List<? extends l6> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.l
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.l
    public a8 getSyntax() {
        a8 forNumber = a8.forNumber(this.syntax_);
        if (forNumber == null) {
            return a8.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.l
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.l
    public String getVersion() {
        return this.version_;
    }

    @Override // com.google.protobuf.l
    public h0 getVersionBytes() {
        return h0.copyFromUtf8(this.version_);
    }

    @Override // com.google.protobuf.l
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static k newBuilder(Api api) {
        return (k) DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Api) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Api parseFrom(h0 h0Var) throws h4 {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public void addMethods(int i10, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i10, method);
    }

    public void addMixins(int i10, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i10, mixin);
    }

    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Api parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Api parseFrom(byte[] bArr) throws h4 {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Api parseFrom(r0 r0Var) throws IOException {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Api parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Api) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
