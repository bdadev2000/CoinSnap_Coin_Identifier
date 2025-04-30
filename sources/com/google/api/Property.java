package com.google.api;

import a4.S0;
import a4.T0;
import a4.U0;
import a4.V0;
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
public final class Property extends L2 implements V0 {
    private static final Property DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    private String name_ = "";
    private String description_ = "";

    static {
        Property property = new Property();
        DEFAULT_INSTANCE = property;
        L2.registerDefaultInstance(Property.class, property);
    }

    private Property() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static Property getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static T0 newBuilder() {
        return (T0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Property parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Property) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setType(U0 u02) {
        this.type_ = u02.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i9) {
        this.type_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (S0.f3976a[k22.ordinal()]) {
            case 1:
                return new Property();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"name_", "type_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Property.class) {
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

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public U0 getType() {
        U0 u02;
        int i9 = this.type_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            u02 = null;
                        } else {
                            u02 = U0.DOUBLE;
                        }
                    } else {
                        u02 = U0.STRING;
                    }
                } else {
                    u02 = U0.BOOL;
                }
            } else {
                u02 = U0.INT64;
            }
        } else {
            u02 = U0.UNSPECIFIED;
        }
        if (u02 == null) {
            return U0.UNRECOGNIZED;
        }
        return u02;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static T0 newBuilder(Property property) {
        return (T0) DEFAULT_INSTANCE.createBuilder(property);
    }

    public static Property parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Property) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Property parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Property parseFrom(H h6) throws C1912g3 {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Property parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Property parseFrom(byte[] bArr) throws C1912g3 {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Property parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Property parseFrom(InputStream inputStream) throws IOException {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Property parseFrom(S s5) throws IOException {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Property parseFrom(S s5, W1 w1) throws IOException {
        return (Property) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
