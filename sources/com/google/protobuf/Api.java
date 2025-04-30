package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class Api extends L2 implements InterfaceC1943l {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private InterfaceC1891d3 methods_ = L2.emptyProtobufList();
    private InterfaceC1891d3 options_ = L2.emptyProtobufList();
    private String version_ = "";
    private InterfaceC1891d3 mixins_ = L2.emptyProtobufList();

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        L2.registerDefaultInstance(Api.class, api);
    }

    private Api() {
    }

    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.methods_);
    }

    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.mixins_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.options_);
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
        this.methods_ = L2.emptyProtobufList();
    }

    public void clearMixins() {
        this.mixins_ = L2.emptyProtobufList();
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearOptions() {
        this.options_ = L2.emptyProtobufList();
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
        InterfaceC1891d3 interfaceC1891d3 = this.methods_;
        if (!interfaceC1891d3.isModifiable()) {
            this.methods_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureMixinsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.mixins_;
        if (!interfaceC1891d3.isModifiable()) {
            this.mixins_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureOptionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.options_;
        if (!interfaceC1891d3.isModifiable()) {
            this.options_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != SourceContext.getDefaultInstance()) {
            this.sourceContext_ = (SourceContext) ((M4) SourceContext.newBuilder(this.sourceContext_).mergeFrom((L2) sourceContext)).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
    }

    public static C1936k newBuilder() {
        return (C1936k) DEFAULT_INSTANCE.createBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeMethods(int i9) {
        ensureMethodsIsMutable();
        this.methods_.remove(i9);
    }

    public void removeMixins(int i9) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i9);
    }

    public void removeOptions(int i9) {
        ensureOptionsIsMutable();
        this.options_.remove(i9);
    }

    public void setMethods(int i9, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i9, method);
    }

    public void setMixins(int i9, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i9, mixin);
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.name_ = h6.toStringUtf8();
    }

    public void setOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i9, option);
    }

    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    public void setSyntax(Z4 z42) {
        this.syntax_ = z42.getNumber();
    }

    public void setSyntaxValue(int i9) {
        this.syntax_ = i9;
    }

    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    public void setVersionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.version_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC1929j.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Api();
            case 2:
                return new C1936k(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Api.class) {
                        try {
                            interfaceC1948l4 = PARSER;
                            if (interfaceC1948l4 == null) {
                                interfaceC1948l4 = new E2(DEFAULT_INSTANCE);
                                PARSER = interfaceC1948l4;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1948l4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Method getMethods(int i9) {
        return (Method) this.methods_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public V3 getMethodsOrBuilder(int i9) {
        return (V3) this.methods_.get(i9);
    }

    public List<? extends V3> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Mixin getMixins(int i9) {
        return (Mixin) this.mixins_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public Y3 getMixinsOrBuilder(int i9) {
        return (Y3) this.mixins_.get(i9);
    }

    public List<? extends Y3> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Option getOptions(int i9) {
        return (Option) this.options_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC1941k4 getOptionsOrBuilder(int i9) {
        return (InterfaceC1941k4) this.options_.get(i9);
    }

    public List<? extends InterfaceC1941k4> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public Z4 getSyntax() {
        Z4 forNumber = Z4.forNumber(this.syntax_);
        if (forNumber == null) {
            return Z4.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public String getVersion() {
        return this.version_;
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public H getVersionBytes() {
        return H.copyFromUtf8(this.version_);
    }

    @Override // com.google.protobuf.InterfaceC1943l
    public boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public static C1936k newBuilder(Api api) {
        return (C1936k) DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Api) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Api parseFrom(H h6) throws C1912g3 {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public void addMethods(int i9, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i9, method);
    }

    public void addMixins(int i9, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i9, mixin);
    }

    public void addOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i9, option);
    }

    public static Api parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Api parseFrom(byte[] bArr) throws C1912g3 {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Api parseFrom(S s5) throws IOException {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Api parseFrom(S s5, W1 w1) throws IOException {
        return (Api) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
