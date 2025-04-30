package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class ListValue extends L2 implements InterfaceC2037y3 {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private InterfaceC1891d3 values_ = L2.emptyProtobufList();

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        L2.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> iterable) {
        ensureValuesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = L2.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.values_;
        if (!interfaceC1891d3.isModifiable()) {
            this.values_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2030x3 newBuilder() {
        return (C2030x3) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i9) {
        ensureValuesIsMutable();
        this.values_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i9, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i9, value);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        AbstractC2023w3 abstractC2023w3 = null;
        switch (AbstractC2023w3.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new ListValue();
            case 2:
                return new C2030x3(abstractC2023w3);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ListValue.class) {
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

    @Override // com.google.protobuf.InterfaceC2037y3
    public Value getValues(int i9) {
        return (Value) this.values_.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC2037y3
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.InterfaceC2037y3
    public List<Value> getValuesList() {
        return this.values_;
    }

    public M5 getValuesOrBuilder(int i9) {
        return (M5) this.values_.get(i9);
    }

    public List<? extends M5> getValuesOrBuilderList() {
        return this.values_;
    }

    public static C2030x3 newBuilder(ListValue listValue) {
        return (C2030x3) DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ListValue) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ListValue parseFrom(H h6) throws C1912g3 {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i9, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i9, value);
    }

    public static ListValue parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ListValue parseFrom(byte[] bArr) throws C1912g3 {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ListValue parseFrom(S s5) throws IOException {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ListValue parseFrom(S s5, W1 w1) throws IOException {
        return (ListValue) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
