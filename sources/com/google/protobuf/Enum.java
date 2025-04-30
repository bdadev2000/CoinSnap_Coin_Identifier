package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class Enum extends L2 implements O1 {
    private static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private InterfaceC1891d3 enumvalue_ = L2.emptyProtobufList();
    private InterfaceC1891d3 options_ = L2.emptyProtobufList();

    static {
        Enum r02 = new Enum();
        DEFAULT_INSTANCE = r02;
        L2.registerDefaultInstance(Enum.class, r02);
    }

    private Enum() {
    }

    public void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.enumvalue_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.options_);
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
        this.enumvalue_ = L2.emptyProtobufList();
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

    private void ensureEnumvalueIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.enumvalue_;
        if (!interfaceC1891d3.isModifiable()) {
            this.enumvalue_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureOptionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.options_;
        if (!interfaceC1891d3.isModifiable()) {
            this.options_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Enum getDefaultInstance() {
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

    public static N1 newBuilder() {
        return (N1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeEnumvalue(int i9) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i9);
    }

    public void removeOptions(int i9) {
        ensureOptionsIsMutable();
        this.options_.remove(i9);
    }

    public void setEnumvalue(int i9, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i9, enumValue);
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

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (M1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Enum();
            case 2:
                return new N1(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Enum.class) {
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

    @Override // com.google.protobuf.O1
    public EnumValue getEnumvalue(int i9) {
        return (EnumValue) this.enumvalue_.get(i9);
    }

    @Override // com.google.protobuf.O1
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.O1
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public R1 getEnumvalueOrBuilder(int i9) {
        return (R1) this.enumvalue_.get(i9);
    }

    public List<? extends R1> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.O1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.O1
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.O1
    public Option getOptions(int i9) {
        return (Option) this.options_.get(i9);
    }

    @Override // com.google.protobuf.O1
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.O1
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC1941k4 getOptionsOrBuilder(int i9) {
        return (InterfaceC1941k4) this.options_.get(i9);
    }

    public List<? extends InterfaceC1941k4> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.O1
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // com.google.protobuf.O1
    public Z4 getSyntax() {
        Z4 forNumber = Z4.forNumber(this.syntax_);
        if (forNumber == null) {
            return Z4.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.O1
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.O1
    public boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public static N1 newBuilder(Enum r12) {
        return (N1) DEFAULT_INSTANCE.createBuilder(r12);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Enum) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Enum parseFrom(H h6) throws C1912g3 {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public void addEnumvalue(int i9, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i9, enumValue);
    }

    public void addOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i9, option);
    }

    public static Enum parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Enum parseFrom(byte[] bArr) throws C1912g3 {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Enum parseFrom(S s5) throws IOException {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Enum parseFrom(S s5, W1 w1) throws IOException {
        return (Enum) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
