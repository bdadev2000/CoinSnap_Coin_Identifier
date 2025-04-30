package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class Type extends L2 implements InterfaceC1935j5 {
    private static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private InterfaceC1891d3 fields_ = L2.emptyProtobufList();
    private InterfaceC1891d3 oneofs_ = L2.emptyProtobufList();
    private InterfaceC1891d3 options_ = L2.emptyProtobufList();

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        L2.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.fields_);
    }

    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.oneofs_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.options_);
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

    public void addOneofsBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureOneofsIsMutable();
        this.oneofs_.add(h6.toStringUtf8());
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearFields() {
        this.fields_ = L2.emptyProtobufList();
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearOneofs() {
        this.oneofs_ = L2.emptyProtobufList();
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

    private void ensureFieldsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.fields_;
        if (!interfaceC1891d3.isModifiable()) {
            this.fields_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureOneofsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.oneofs_;
        if (!interfaceC1891d3.isModifiable()) {
            this.oneofs_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureOptionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.options_;
        if (!interfaceC1891d3.isModifiable()) {
            this.options_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Type getDefaultInstance() {
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

    public static C1928i5 newBuilder() {
        return (C1928i5) DEFAULT_INSTANCE.createBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeFields(int i9) {
        ensureFieldsIsMutable();
        this.fields_.remove(i9);
    }

    public void removeOptions(int i9) {
        ensureOptionsIsMutable();
        this.options_.remove(i9);
    }

    public void setFields(int i9, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i9, field);
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.name_ = h6.toStringUtf8();
    }

    public void setOneofs(int i9, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i9, str);
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

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC1921h5.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new C1928i5(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Type.class) {
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

    @Override // com.google.protobuf.InterfaceC1935j5
    public Field getFields(int i9) {
        return (Field) this.fields_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public InterfaceC1974p2 getFieldsOrBuilder(int i9) {
        return (InterfaceC1974p2) this.fields_.get(i9);
    }

    public List<? extends InterfaceC1974p2> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public String getOneofs(int i9) {
        return (String) this.oneofs_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public H getOneofsBytes(int i9) {
        return H.copyFromUtf8((String) this.oneofs_.get(i9));
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public Option getOptions(int i9) {
        return (Option) this.options_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC1941k4 getOptionsOrBuilder(int i9) {
        return (InterfaceC1941k4) this.options_.get(i9);
    }

    public List<? extends InterfaceC1941k4> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public Z4 getSyntax() {
        Z4 forNumber = Z4.forNumber(this.syntax_);
        if (forNumber == null) {
            return Z4.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC1935j5
    public boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public static C1928i5 newBuilder(Type type) {
        return (C1928i5) DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Type) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Type parseFrom(H h6) throws C1912g3 {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public void addFields(int i9, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i9, field);
    }

    public void addOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i9, option);
    }

    public static Type parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Type parseFrom(byte[] bArr) throws C1912g3 {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Type parseFrom(S s5) throws IOException {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Type parseFrom(S s5, W1 w1) throws IOException {
        return (Type) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
