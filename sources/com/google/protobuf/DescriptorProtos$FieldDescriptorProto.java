package com.google.protobuf;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class DescriptorProtos$FieldDescriptorProto extends L2 implements H0 {
    private static final DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
    public static final int EXTENDEE_FIELD_NUMBER = 2;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int LABEL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_NAME_FIELD_NUMBER = 6;
    private int bitField0_;
    private int number_;
    private int oneofIndex_;
    private DescriptorProtos$FieldOptions options_;
    private boolean proto3Optional_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int label_ = 1;
    private int type_ = 1;
    private String typeName_ = "";
    private String extendee_ = "";
    private String defaultValue_ = "";
    private String jsonName_ = "";

    static {
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = new DescriptorProtos$FieldDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FieldDescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$FieldDescriptorProto.class, descriptorProtos$FieldDescriptorProto);
    }

    private DescriptorProtos$FieldDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.bitField0_ &= -65;
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendee() {
        this.bitField0_ &= -33;
        this.extendee_ = getDefaultInstance().getExtendee();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.bitField0_ &= -257;
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -5;
        this.label_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -3;
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.bitField0_ &= -129;
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProto3Optional() {
        this.bitField0_ &= -1025;
        this.proto3Optional_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -9;
        this.type_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeName() {
        this.bitField0_ &= -17;
        this.typeName_ = getDefaultInstance().getTypeName();
    }

    public static DescriptorProtos$FieldDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions2 = this.options_;
        if (descriptorProtos$FieldOptions2 != null && descriptorProtos$FieldOptions2 != DescriptorProtos$FieldOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$FieldOptions) ((I0) DescriptorProtos$FieldOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$FieldOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$FieldOptions;
        }
        this.bitField0_ |= 512;
    }

    public static A0 newBuilder() {
        return (A0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(H h6) {
        this.defaultValue_ = h6.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendee(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.extendee_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendeeBytes(H h6) {
        this.extendee_ = h6.toStringUtf8();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(H h6) {
        this.jsonName_ = h6.toStringUtf8();
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(D0 d02) {
        this.label_ = d02.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(H h6) {
        this.name_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i9) {
        this.bitField0_ |= 2;
        this.number_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i9) {
        this.bitField0_ |= 128;
        this.oneofIndex_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        this.options_ = descriptorProtos$FieldOptions;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProto3Optional(boolean z8) {
        this.bitField0_ |= 1024;
        this.proto3Optional_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(G0 g02) {
        this.type_ = g02.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.typeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeNameBytes(H h6) {
        this.typeName_ = h6.toStringUtf8();
        this.bitField0_ |= 16;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$FieldDescriptorProto();
            case 2:
                return new A0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", D0.internalGetVerifier(), "type_", G0.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$FieldDescriptorProto.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                if (obj == null) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                this.memoizedIsInitialized = (byte) i9;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.H0
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // com.google.protobuf.H0
    public H getDefaultValueBytes() {
        return H.copyFromUtf8(this.defaultValue_);
    }

    @Override // com.google.protobuf.H0
    public String getExtendee() {
        return this.extendee_;
    }

    @Override // com.google.protobuf.H0
    public H getExtendeeBytes() {
        return H.copyFromUtf8(this.extendee_);
    }

    @Override // com.google.protobuf.H0
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // com.google.protobuf.H0
    public H getJsonNameBytes() {
        return H.copyFromUtf8(this.jsonName_);
    }

    @Override // com.google.protobuf.H0
    public D0 getLabel() {
        D0 forNumber = D0.forNumber(this.label_);
        if (forNumber == null) {
            return D0.LABEL_OPTIONAL;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.H0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.H0
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.H0
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.H0
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // com.google.protobuf.H0
    public DescriptorProtos$FieldOptions getOptions() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
        if (descriptorProtos$FieldOptions == null) {
            return DescriptorProtos$FieldOptions.getDefaultInstance();
        }
        return descriptorProtos$FieldOptions;
    }

    @Override // com.google.protobuf.H0
    public boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    @Override // com.google.protobuf.H0
    public G0 getType() {
        G0 forNumber = G0.forNumber(this.type_);
        if (forNumber == null) {
            return G0.TYPE_DOUBLE;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.H0
    public String getTypeName() {
        return this.typeName_;
    }

    @Override // com.google.protobuf.H0
    public H getTypeNameBytes() {
        return H.copyFromUtf8(this.typeName_);
    }

    @Override // com.google.protobuf.H0
    public boolean hasDefaultValue() {
        if ((this.bitField0_ & 64) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasExtendee() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasJsonName() {
        if ((this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasLabel() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasNumber() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasOneofIndex() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasOptions() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasProto3Optional() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasType() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.H0
    public boolean hasTypeName() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }

    public static A0 newBuilder(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        return (A0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldDescriptorProto);
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$FieldDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
