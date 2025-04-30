package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Mixin extends L2 implements Y3 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        L2.registerDefaultInstance(Mixin.class, mixin);
    }

    private Mixin() {
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static X3 newBuilder() {
        return (X3) DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mixin) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.name_ = h6.toStringUtf8();
    }

    public void setRoot(String str) {
        str.getClass();
        this.root_ = str;
    }

    public void setRootBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.root_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (W3.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Mixin();
            case 2:
                return new X3(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Mixin.class) {
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

    @Override // com.google.protobuf.Y3
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.Y3
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.Y3
    public String getRoot() {
        return this.root_;
    }

    @Override // com.google.protobuf.Y3
    public H getRootBytes() {
        return H.copyFromUtf8(this.root_);
    }

    public static X3 newBuilder(Mixin mixin) {
        return (X3) DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Mixin) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Mixin parseFrom(H h6) throws C1912g3 {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Mixin parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Mixin parseFrom(byte[] bArr) throws C1912g3 {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mixin parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Mixin parseFrom(InputStream inputStream) throws IOException {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Mixin parseFrom(S s5) throws IOException {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Mixin parseFrom(S s5, W1 w1) throws IOException {
        return (Mixin) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
