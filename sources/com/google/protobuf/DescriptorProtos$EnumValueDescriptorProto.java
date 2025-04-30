package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class DescriptorProtos$EnumValueDescriptorProto extends L2 implements InterfaceC2013v0 {
    private static final DescriptorProtos$EnumValueDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int number_;
    private DescriptorProtos$EnumValueOptions options_;

    static {
        DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto = new DescriptorProtos$EnumValueDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$EnumValueDescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$EnumValueDescriptorProto.class, descriptorProtos$EnumValueDescriptorProto);
    }

    private DescriptorProtos$EnumValueDescriptorProto() {
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
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -5;
    }

    public static DescriptorProtos$EnumValueDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        descriptorProtos$EnumValueOptions.getClass();
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions2 = this.options_;
        if (descriptorProtos$EnumValueOptions2 != null && descriptorProtos$EnumValueOptions2 != DescriptorProtos$EnumValueOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$EnumValueOptions) ((C2020w0) DescriptorProtos$EnumValueOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$EnumValueOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$EnumValueOptions;
        }
        this.bitField0_ |= 4;
    }

    public static C2006u0 newBuilder() {
        return (C2006u0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setOptions(DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions) {
        descriptorProtos$EnumValueOptions.getClass();
        this.options_ = descriptorProtos$EnumValueOptions;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        AbstractC1916h0 abstractC1916h0 = null;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$EnumValueDescriptorProto();
            case 2:
                return new C2006u0(abstractC1916h0);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$EnumValueDescriptorProto.class) {
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

    @Override // com.google.protobuf.InterfaceC2013v0
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public int getNumber() {
        return this.number_;
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public DescriptorProtos$EnumValueOptions getOptions() {
        DescriptorProtos$EnumValueOptions descriptorProtos$EnumValueOptions = this.options_;
        if (descriptorProtos$EnumValueOptions == null) {
            return DescriptorProtos$EnumValueOptions.getDefaultInstance();
        }
        return descriptorProtos$EnumValueOptions;
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public boolean hasNumber() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC2013v0
    public boolean hasOptions() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public static C2006u0 newBuilder(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        return (C2006u0) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$EnumValueDescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$EnumValueDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
