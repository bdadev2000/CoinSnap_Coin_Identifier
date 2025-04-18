package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Field extends o3 implements t2 {
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
    private static volatile m6 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private e4 options_ = o3.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        o3.registerDefaultInstance(Field.class, field);
    }

    private Field() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        c.addAll((Iterable) iterable, (List) this.options_);
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
        this.options_ = o3.emptyProtobufList();
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
        e4 e4Var = this.options_;
        if (!e4Var.isModifiable()) {
            this.options_ = o3.mutableCopy(e4Var);
        }
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g2 newBuilder() {
        return (g2) DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(j2 j2Var) {
        this.cardinality_ = j2Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int i10) {
        this.cardinality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.defaultValue_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.jsonName_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(m2 m2Var) {
        this.kind_ = m2Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.name_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i10) {
        this.number_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i10) {
        this.oneofIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z10) {
        this.packed_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.typeUrl_ = h0Var.toStringUtf8();
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        f2 f2Var = null;
        switch (f2.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new g2(f2Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Field.class) {
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

    @Override // com.google.protobuf.t2
    public j2 getCardinality() {
        j2 forNumber = j2.forNumber(this.cardinality_);
        if (forNumber == null) {
            return j2.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.t2
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // com.google.protobuf.t2
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // com.google.protobuf.t2
    public h0 getDefaultValueBytes() {
        return h0.copyFromUtf8(this.defaultValue_);
    }

    @Override // com.google.protobuf.t2
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // com.google.protobuf.t2
    public h0 getJsonNameBytes() {
        return h0.copyFromUtf8(this.jsonName_);
    }

    @Override // com.google.protobuf.t2
    public m2 getKind() {
        m2 forNumber = m2.forNumber(this.kind_);
        if (forNumber == null) {
            return m2.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.t2
    public int getKindValue() {
        return this.kind_;
    }

    @Override // com.google.protobuf.t2
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.t2
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.t2
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.t2
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.t2
    public Option getOptions(int i10) {
        return (Option) this.options_.get(i10);
    }

    @Override // com.google.protobuf.t2
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.t2
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public l6 getOptionsOrBuilder(int i10) {
        return (l6) this.options_.get(i10);
    }

    public List<? extends l6> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.t2
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.t2
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.t2
    public h0 getTypeUrlBytes() {
        return h0.copyFromUtf8(this.typeUrl_);
    }

    public static g2 newBuilder(Field field) {
        return (g2) DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Field) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Field parseFrom(h0 h0Var) throws h4 {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Field parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Field parseFrom(byte[] bArr) throws h4 {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Field parseFrom(r0 r0Var) throws IOException {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Field parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Field) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
