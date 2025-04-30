package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Any extends L2 implements InterfaceC1922i {
    private static final Any DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private H value_ = H.EMPTY;

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        L2.registerDefaultInstance(Any.class, any);
    }

    private Any() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C1915h newBuilder() {
        return (C1915h) DEFAULT_INSTANCE.createBuilder();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.typeUrl_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(H h6) {
        h6.getClass();
        this.value_ = h6;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        AbstractC1908g abstractC1908g = null;
        switch (AbstractC1908g.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Any();
            case 2:
                return new C1915h(abstractC1908g);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Any.class) {
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

    @Override // com.google.protobuf.InterfaceC1922i
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.InterfaceC1922i
    public H getTypeUrlBytes() {
        return H.copyFromUtf8(this.typeUrl_);
    }

    @Override // com.google.protobuf.InterfaceC1922i
    public H getValue() {
        return this.value_;
    }

    public static C1915h newBuilder(Any any) {
        return (C1915h) DEFAULT_INSTANCE.createBuilder(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Any) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Any parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Any parseFrom(H h6) throws C1912g3 {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Any parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Any parseFrom(byte[] bArr) throws C1912g3 {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Any parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Any parseFrom(S s5) throws IOException {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Any parseFrom(S s5, W1 w1) throws IOException {
        return (Any) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
