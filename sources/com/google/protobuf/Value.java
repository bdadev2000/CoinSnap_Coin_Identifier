package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Value extends L2 implements M5 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        L2.registerDefaultInstance(Value.class, value);
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
            this.kind_ = ((C2030x3) ListValue.newBuilder((ListValue) this.kind_).mergeFrom((L2) listValue)).buildPartial();
        } else {
            this.kind_ = listValue;
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ == 5 && this.kind_ != Struct.getDefaultInstance()) {
            this.kind_ = ((S4) Struct.newBuilder((Struct) this.kind_).mergeFrom((L2) struct)).buildPartial();
        } else {
            this.kind_ = struct;
        }
        this.kindCase_ = 5;
    }

    public static K5 newBuilder() {
        return (K5) DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z8) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(EnumC1913g4 enumC1913g4) {
        this.kind_ = Integer.valueOf(enumC1913g4.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i9) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d2) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.kind_ = h6.toStringUtf8();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        J5 j52 = null;
        switch (J5.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new K5(j52);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Value.class) {
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

    @Override // com.google.protobuf.M5
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.google.protobuf.M5
    public L5 getKindCase() {
        return L5.forNumber(this.kindCase_);
    }

    @Override // com.google.protobuf.M5
    public ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    @Override // com.google.protobuf.M5
    public EnumC1913g4 getNullValue() {
        if (this.kindCase_ == 1) {
            EnumC1913g4 forNumber = EnumC1913g4.forNumber(((Integer) this.kind_).intValue());
            if (forNumber == null) {
                return EnumC1913g4.UNRECOGNIZED;
            }
            return forNumber;
        }
        return EnumC1913g4.NULL_VALUE;
    }

    @Override // com.google.protobuf.M5
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.M5
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.google.protobuf.M5
    public String getStringValue() {
        if (this.kindCase_ == 3) {
            return (String) this.kind_;
        }
        return "";
    }

    @Override // com.google.protobuf.M5
    public H getStringValueBytes() {
        String str;
        if (this.kindCase_ == 3) {
            str = (String) this.kind_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    @Override // com.google.protobuf.M5
    public Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.M5
    public boolean hasBoolValue() {
        if (this.kindCase_ == 4) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.M5
    public boolean hasListValue() {
        if (this.kindCase_ == 6) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.M5
    public boolean hasNullValue() {
        if (this.kindCase_ == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.M5
    public boolean hasNumberValue() {
        if (this.kindCase_ == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.M5
    public boolean hasStringValue() {
        if (this.kindCase_ == 3) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.M5
    public boolean hasStructValue() {
        if (this.kindCase_ == 5) {
            return true;
        }
        return false;
    }

    public static K5 newBuilder(Value value) {
        return (K5) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Value) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Value parseFrom(H h6) throws C1912g3 {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Value parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Value parseFrom(byte[] bArr) throws C1912g3 {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Value parseFrom(S s5) throws IOException {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Value parseFrom(S s5, W1 w1) throws IOException {
        return (Value) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
