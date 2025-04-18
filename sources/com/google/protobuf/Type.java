package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Type extends o3 implements k8 {
    private static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile m6 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private e4 fields_ = o3.emptyProtobufList();
    private e4 oneofs_ = o3.emptyProtobufList();
    private e4 options_ = o3.emptyProtobufList();

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        o3.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        c.addAll((Iterable) iterable, (List) this.fields_);
    }

    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        c.addAll((Iterable) iterable, (List) this.oneofs_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        c.addAll((Iterable) iterable, (List) this.options_);
    }

    public void addFields(Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    public void addOneofs(String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    public void addOneofsBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        ensureOneofsIsMutable();
        this.oneofs_.add(h0Var.toStringUtf8());
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearFields() {
        this.fields_ = o3.emptyProtobufList();
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearOneofs() {
        this.oneofs_ = o3.emptyProtobufList();
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

    private void ensureFieldsIsMutable() {
        e4 e4Var = this.fields_;
        if (!e4Var.isModifiable()) {
            this.fields_ = o3.mutableCopy(e4Var);
        }
    }

    private void ensureOneofsIsMutable() {
        e4 e4Var = this.oneofs_;
        if (!e4Var.isModifiable()) {
            this.oneofs_ = o3.mutableCopy(e4Var);
        }
    }

    private void ensureOptionsIsMutable() {
        e4 e4Var = this.options_;
        if (!e4Var.isModifiable()) {
            this.options_ = o3.mutableCopy(e4Var);
        }
    }

    public static Type getDefaultInstance() {
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

    public static j8 newBuilder() {
        return (j8) DEFAULT_INSTANCE.createBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeFields(int i10) {
        ensureFieldsIsMutable();
        this.fields_.remove(i10);
    }

    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    public void setFields(int i10, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i10, field);
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.name_ = h0Var.toStringUtf8();
    }

    public void setOneofs(int i10, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i10, str);
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
        switch (i8.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new j8(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Type.class) {
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

    @Override // com.google.protobuf.k8
    public Field getFields(int i10) {
        return (Field) this.fields_.get(i10);
    }

    @Override // com.google.protobuf.k8
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.k8
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public t2 getFieldsOrBuilder(int i10) {
        return (t2) this.fields_.get(i10);
    }

    public List<? extends t2> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.k8
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.k8
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.k8
    public String getOneofs(int i10) {
        return (String) this.oneofs_.get(i10);
    }

    @Override // com.google.protobuf.k8
    public h0 getOneofsBytes(int i10) {
        return h0.copyFromUtf8((String) this.oneofs_.get(i10));
    }

    @Override // com.google.protobuf.k8
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // com.google.protobuf.k8
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.k8
    public Option getOptions(int i10) {
        return (Option) this.options_.get(i10);
    }

    @Override // com.google.protobuf.k8
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.k8
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public l6 getOptionsOrBuilder(int i10) {
        return (l6) this.options_.get(i10);
    }

    public List<? extends l6> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.k8
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.k8
    public a8 getSyntax() {
        a8 forNumber = a8.forNumber(this.syntax_);
        if (forNumber == null) {
            return a8.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.k8
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.k8
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static j8 newBuilder(Type type) {
        return (j8) DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Type) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Type parseFrom(h0 h0Var) throws h4 {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public void addFields(int i10, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i10, field);
    }

    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Type parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Type parseFrom(byte[] bArr) throws h4 {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Type parseFrom(r0 r0Var) throws IOException {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Type parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Type) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
