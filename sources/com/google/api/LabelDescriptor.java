package com.google.api;

import a4.AbstractC0359g0;
import a4.C0361h0;
import a4.EnumC0363i0;
import a4.InterfaceC0365j0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class LabelDescriptor extends L2 implements InterfaceC0365j0 {
    private static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private int valueType_;
    private String key_ = "";
    private String description_ = "";

    static {
        LabelDescriptor labelDescriptor = new LabelDescriptor();
        DEFAULT_INSTANCE = labelDescriptor;
        L2.registerDefaultInstance(LabelDescriptor.class, labelDescriptor);
    }

    private LabelDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0361h0 newBuilder() {
        return (C0361h0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.description_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.key_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(EnumC0363i0 enumC0363i0) {
        this.valueType_ = enumC0363i0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i9) {
        this.valueType_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0359g0.f4011a[k22.ordinal()]) {
            case 1:
                return new LabelDescriptor();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (LabelDescriptor.class) {
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

    public String getDescription() {
        return this.description_;
    }

    public H getDescriptionBytes() {
        return H.copyFromUtf8(this.description_);
    }

    public String getKey() {
        return this.key_;
    }

    public H getKeyBytes() {
        return H.copyFromUtf8(this.key_);
    }

    public EnumC0363i0 getValueType() {
        EnumC0363i0 enumC0363i0;
        int i9 = this.valueType_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    enumC0363i0 = null;
                } else {
                    enumC0363i0 = EnumC0363i0.INT64;
                }
            } else {
                enumC0363i0 = EnumC0363i0.BOOL;
            }
        } else {
            enumC0363i0 = EnumC0363i0.STRING;
        }
        if (enumC0363i0 == null) {
            return EnumC0363i0.UNRECOGNIZED;
        }
        return enumC0363i0;
    }

    public int getValueTypeValue() {
        return this.valueType_;
    }

    public static C0361h0 newBuilder(LabelDescriptor labelDescriptor) {
        return (C0361h0) DEFAULT_INSTANCE.createBuilder(labelDescriptor);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (LabelDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static LabelDescriptor parseFrom(H h6) throws C1912g3 {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static LabelDescriptor parseFrom(H h6, W1 w1) throws C1912g3 {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static LabelDescriptor parseFrom(byte[] bArr) throws C1912g3 {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LabelDescriptor parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static LabelDescriptor parseFrom(S s5) throws IOException {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static LabelDescriptor parseFrom(S s5, W1 w1) throws IOException {
        return (LabelDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
