package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Value extends o3 implements n9 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile m6 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        o3.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ == 6 && this.kind_ != ListValue.getDefaultInstance()) {
            this.kind_ = ((y4) ListValue.newBuilder((ListValue) this.kind_).mergeFrom((o3) listValue)).buildPartial();
        } else {
            this.kind_ = listValue;
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ == 5 && this.kind_ != Struct.getDefaultInstance()) {
            this.kind_ = ((t7) Struct.newBuilder((Struct) this.kind_).mergeFrom((o3) struct)).buildPartial();
        } else {
            this.kind_ = struct;
        }
        this.kindCase_ = 5;
    }

    public static l9 newBuilder() {
        return (l9) DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z10) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(h6 h6Var) {
        this.kind_ = Integer.valueOf(h6Var.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i10) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d10) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.kind_ = h0Var.toStringUtf8();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        k9 k9Var = null;
        switch (k9.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new l9(k9Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Value.class) {
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

    @Override // com.google.protobuf.n9
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.n9
    public m9 getKindCase() {
        return m9.forNumber(this.kindCase_);
    }

    @Override // com.google.protobuf.n9
    public ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.n9
    public h6 getNullValue() {
        if (this.kindCase_ == 1) {
            h6 forNumber = h6.forNumber(((Integer) this.kind_).intValue());
            if (forNumber == null) {
                return h6.UNRECOGNIZED;
            }
            return forNumber;
        }
        return h6.NULL_VALUE;
    }

    @Override // com.google.protobuf.n9
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.n9
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.google.protobuf.n9
    public String getStringValue() {
        if (this.kindCase_ == 3) {
            return (String) this.kind_;
        }
        return "";
    }

    @Override // com.google.protobuf.n9
    public h0 getStringValueBytes() {
        String str;
        if (this.kindCase_ == 3) {
            str = (String) this.kind_;
        } else {
            str = "";
        }
        return h0.copyFromUtf8(str);
    }

    @Override // com.google.protobuf.n9
    public Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.n9
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.protobuf.n9
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.protobuf.n9
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.google.protobuf.n9
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.protobuf.n9
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.protobuf.n9
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static l9 newBuilder(Value value) {
        return (l9) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Value) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Value parseFrom(h0 h0Var) throws h4 {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Value parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Value parseFrom(byte[] bArr) throws h4 {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Value parseFrom(r0 r0Var) throws IOException {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Value parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Value) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
