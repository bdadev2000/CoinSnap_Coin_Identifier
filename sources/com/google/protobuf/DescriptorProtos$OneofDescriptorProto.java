package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class DescriptorProtos$OneofDescriptorProto extends L2 implements InterfaceC1959n1 {
    private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private DescriptorProtos$OneofOptions options_;

    static {
        DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = new DescriptorProtos$OneofDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$OneofDescriptorProto;
        L2.registerDefaultInstance(DescriptorProtos$OneofDescriptorProto.class, descriptorProtos$OneofDescriptorProto);
    }

    private DescriptorProtos$OneofDescriptorProto() {
    }

    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    public static DescriptorProtos$OneofDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofOptions.getClass();
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions2 = this.options_;
        if (descriptorProtos$OneofOptions2 != null && descriptorProtos$OneofOptions2 != DescriptorProtos$OneofOptions.getDefaultInstance()) {
            this.options_ = (DescriptorProtos$OneofOptions) ((C1966o1) DescriptorProtos$OneofOptions.newBuilder(this.options_).mergeFrom((L2) descriptorProtos$OneofOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$OneofOptions;
        }
        this.bitField0_ |= 2;
    }

    public static C1952m1 newBuilder() {
        return (C1952m1) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public void setNameBytes(H h6) {
        this.name_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public void setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofOptions.getClass();
        this.options_ = descriptorProtos$OneofOptions;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        int i9;
        switch (AbstractC1916h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new DescriptorProtos$OneofDescriptorProto();
            case 2:
                return new C1952m1(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DescriptorProtos$OneofDescriptorProto.class) {
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

    @Override // com.google.protobuf.InterfaceC1959n1
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public DescriptorProtos$OneofOptions getOptions() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        if (descriptorProtos$OneofOptions == null) {
            return DescriptorProtos$OneofOptions.getDefaultInstance();
        }
        return descriptorProtos$OneofOptions;
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC1959n1
    public boolean hasOptions() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public static C1952m1 newBuilder(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        return (C1952m1) DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofDescriptorProto);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(H h6) throws C1912g3 {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr) throws C1912g3 {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(S s5) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(S s5, W1 w1) throws IOException {
        return (DescriptorProtos$OneofDescriptorProto) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
