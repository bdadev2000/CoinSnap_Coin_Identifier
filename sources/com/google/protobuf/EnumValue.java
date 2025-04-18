package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class EnumValue extends o3 implements v1 {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile m6 PARSER;
    private int number_;
    private String name_ = "";
    private e4 options_ = o3.emptyProtobufList();

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        o3.registerDefaultInstance(EnumValue.class, enumValue);
    }

    private EnumValue() {
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
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = o3.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        e4 e4Var = this.options_;
        if (!e4Var.isModifiable()) {
            this.options_ = o3.mutableCopy(e4Var);
        }
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u1 newBuilder() {
        return (u1) DEFAULT_INSTANCE.createBuilder();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EnumValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        t1 t1Var = null;
        switch (t1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new u1(t1Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (EnumValue.class) {
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

    @Override // com.google.protobuf.v1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.v1
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.v1
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.v1
    public Option getOptions(int i10) {
        return (Option) this.options_.get(i10);
    }

    @Override // com.google.protobuf.v1
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.v1
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public l6 getOptionsOrBuilder(int i10) {
        return (l6) this.options_.get(i10);
    }

    public List<? extends l6> getOptionsOrBuilderList() {
        return this.options_;
    }

    public static u1 newBuilder(EnumValue enumValue) {
        return (u1) DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (EnumValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static EnumValue parseFrom(h0 h0Var) throws h4 {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static EnumValue parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static EnumValue parseFrom(byte[] bArr) throws h4 {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static EnumValue parseFrom(r0 r0Var) throws IOException {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static EnumValue parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (EnumValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
