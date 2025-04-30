package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class EnumValue extends L2 implements R1 {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER;
    private int number_;
    private String name_ = "";
    private InterfaceC1891d3 options_ = L2.emptyProtobufList();

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        L2.registerDefaultInstance(EnumValue.class, enumValue);
    }

    private EnumValue() {
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
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = L2.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.options_;
        if (!interfaceC1891d3.isModifiable()) {
            this.options_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Q1 newBuilder() {
        return (Q1) DEFAULT_INSTANCE.createBuilder();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EnumValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i9, option);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        P1 p12 = null;
        switch (P1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new Q1(p12);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (EnumValue.class) {
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

    @Override // com.google.protobuf.R1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.R1
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.R1
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.R1
    public Option getOptions(int i9) {
        return (Option) this.options_.get(i9);
    }

    @Override // com.google.protobuf.R1
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.R1
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC1941k4 getOptionsOrBuilder(int i9) {
        return (InterfaceC1941k4) this.options_.get(i9);
    }

    public List<? extends InterfaceC1941k4> getOptionsOrBuilderList() {
        return this.options_;
    }

    public static Q1 newBuilder(EnumValue enumValue) {
        return (Q1) DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (EnumValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static EnumValue parseFrom(H h6) throws C1912g3 {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i9, option);
    }

    public static EnumValue parseFrom(H h6, W1 w1) throws C1912g3 {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static EnumValue parseFrom(byte[] bArr) throws C1912g3 {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static EnumValue parseFrom(S s5) throws IOException {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static EnumValue parseFrom(S s5, W1 w1) throws IOException {
        return (EnumValue) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
