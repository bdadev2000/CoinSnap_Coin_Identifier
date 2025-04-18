package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class ListValue extends o3 implements z4 {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private e4 values_ = o3.emptyProtobufList();

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        o3.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> iterable) {
        ensureValuesIsMutable();
        c.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = o3.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        e4 e4Var = this.values_;
        if (!e4Var.isModifiable()) {
            this.values_ = o3.mutableCopy(e4Var);
        }
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static y4 newBuilder() {
        return (y4) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i10) {
        ensureValuesIsMutable();
        this.values_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i10, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i10, value);
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        x4 x4Var = null;
        switch (x4.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new ListValue();
            case 2:
                return new y4(x4Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (ListValue.class) {
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

    @Override // com.google.protobuf.z4
    public Value getValues(int i10) {
        return (Value) this.values_.get(i10);
    }

    @Override // com.google.protobuf.z4
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.z4
    public List<Value> getValuesList() {
        return this.values_;
    }

    public n9 getValuesOrBuilder(int i10) {
        return (n9) this.values_.get(i10);
    }

    public List<? extends n9> getValuesOrBuilderList() {
        return this.values_;
    }

    public static y4 newBuilder(ListValue listValue) {
        return (y4) DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (ListValue) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static ListValue parseFrom(h0 h0Var) throws h4 {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i10, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i10, value);
    }

    public static ListValue parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static ListValue parseFrom(byte[] bArr) throws h4 {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static ListValue parseFrom(r0 r0Var) throws IOException {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static ListValue parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (ListValue) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
