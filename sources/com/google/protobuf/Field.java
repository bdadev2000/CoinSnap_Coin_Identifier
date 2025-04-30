package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class Field extends L2 implements InterfaceC1974p2 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private InterfaceC1891d3 options_ = L2.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        L2.registerDefaultInstance(Field.class, field);
    }

    private Field() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.options_;
        if (!interfaceC1891d3.isModifiable()) {
            this.options_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1883c2 newBuilder() {
        return (C1883c2) DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i9) {
        ensureOptionsIsMutable();
        this.options_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(EnumC1904f2 enumC1904f2) {
        this.cardinality_ = enumC1904f2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int i9) {
        this.cardinality_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.defaultValue_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.jsonName_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(EnumC1925i2 enumC1925i2) {
        this.kind_ = enumC1925i2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i9) {
        this.kind_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.name_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i9) {
        this.number_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i9) {
        this.oneofIndex_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i9, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z8) {
        this.packed_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.typeUrl_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        AbstractC1876b2 abstractC1876b2 = null;
        switch (AbstractC1876b2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new C1883c2(abstractC1876b2);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Field.class) {
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

    @Override // com.google.protobuf.InterfaceC1974p2
    public EnumC1904f2 getCardinality() {
        EnumC1904f2 forNumber = EnumC1904f2.forNumber(this.cardinality_);
        if (forNumber == null) {
            return EnumC1904f2.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getDefaultValueBytes() {
        return H.copyFromUtf8(this.defaultValue_);
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getJsonNameBytes() {
        return H.copyFromUtf8(this.jsonName_);
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public EnumC1925i2 getKind() {
        EnumC1925i2 forNumber = EnumC1925i2.forNumber(this.kind_);
        if (forNumber == null) {
            return EnumC1925i2.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public Option getOptions(int i9) {
        return (Option) this.options_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC1941k4 getOptionsOrBuilder(int i9) {
        return (InterfaceC1941k4) this.options_.get(i9);
    }

    public List<? extends InterfaceC1941k4> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.InterfaceC1974p2
    public H getTypeUrlBytes() {
        return H.copyFromUtf8(this.typeUrl_);
    }

    public static C1883c2 newBuilder(Field field) {
        return (C1883c2) DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Field) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Field parseFrom(H h6) throws C1912g3 {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i9, option);
    }

    public static Field parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Field parseFrom(byte[] bArr) throws C1912g3 {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Field parseFrom(S s5) throws IOException {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Field parseFrom(S s5, W1 w1) throws IOException {
        return (Field) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
