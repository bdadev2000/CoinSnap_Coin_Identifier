package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Enum extends o3 implements s1 {
    private static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile m6 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private e4 enumvalue_ = o3.emptyProtobufList();
    private e4 options_ = o3.emptyProtobufList();

    static {
        Enum r02 = new Enum();
        DEFAULT_INSTANCE = r02;
        o3.registerDefaultInstance(Enum.class, r02);
    }

    private Enum() {
    }

    public void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        c.addAll((Iterable) iterable, (List) this.enumvalue_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        c.addAll((Iterable) iterable, (List) this.options_);
    }

    public void addEnumvalue(EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearEnumvalue() {
        this.enumvalue_ = o3.emptyProtobufList();
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

    private void ensureEnumvalueIsMutable() {
        e4 e4Var = this.enumvalue_;
        if (!e4Var.isModifiable()) {
            this.enumvalue_ = o3.mutableCopy(e4Var);
        }
    }

    private void ensureOptionsIsMutable() {
        e4 e4Var = this.options_;
        if (!e4Var.isModifiable()) {
            this.options_ = o3.mutableCopy(e4Var);
        }
    }

    public static Enum getDefaultInstance() {
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

    public static r1 newBuilder() {
        return (r1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeEnumvalue(int i10) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i10);
    }

    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    public void setEnumvalue(int i10, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i10, enumValue);
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

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (q1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Enum();
            case 2:
                return new r1(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Enum.class) {
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

    @Override // com.google.protobuf.s1
    public EnumValue getEnumvalue(int i10) {
        return (EnumValue) this.enumvalue_.get(i10);
    }

    @Override // com.google.protobuf.s1
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.s1
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public v1 getEnumvalueOrBuilder(int i10) {
        return (v1) this.enumvalue_.get(i10);
    }

    public List<? extends v1> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.s1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.s1
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.s1
    public Option getOptions(int i10) {
        return (Option) this.options_.get(i10);
    }

    @Override // com.google.protobuf.s1
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.s1
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public l6 getOptionsOrBuilder(int i10) {
        return (l6) this.options_.get(i10);
    }

    public List<? extends l6> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.s1
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.s1
    public a8 getSyntax() {
        a8 forNumber = a8.forNumber(this.syntax_);
        if (forNumber == null) {
            return a8.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.s1
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.s1
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static r1 newBuilder(Enum r12) {
        return (r1) DEFAULT_INSTANCE.createBuilder(r12);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Enum) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Enum parseFrom(h0 h0Var) throws h4 {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public void addEnumvalue(int i10, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i10, enumValue);
    }

    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Enum parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Enum parseFrom(byte[] bArr) throws h4 {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Enum parseFrom(r0 r0Var) throws IOException {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Enum parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Enum) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
