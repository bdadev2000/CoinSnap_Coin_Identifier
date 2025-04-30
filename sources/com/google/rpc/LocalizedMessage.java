package com.google.rpc;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import w5.j;
import w5.k;

/* loaded from: classes3.dex */
public final class LocalizedMessage extends L2 implements O3 {
    private static final LocalizedMessage DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER;
    private String locale_ = "";
    private String message_ = "";

    static {
        LocalizedMessage localizedMessage = new LocalizedMessage();
        DEFAULT_INSTANCE = localizedMessage;
        L2.registerDefaultInstance(LocalizedMessage.class, localizedMessage);
    }

    private LocalizedMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static LocalizedMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocalizedMessage) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        str.getClass();
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.locale_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.message_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (j.f23987a[k22.ordinal()]) {
            case 1:
                return new LocalizedMessage();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"locale_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (LocalizedMessage.class) {
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

    public String getLocale() {
        return this.locale_;
    }

    public H getLocaleBytes() {
        return H.copyFromUtf8(this.locale_);
    }

    public String getMessage() {
        return this.message_;
    }

    public H getMessageBytes() {
        return H.copyFromUtf8(this.message_);
    }

    public static k newBuilder(LocalizedMessage localizedMessage) {
        return (k) DEFAULT_INSTANCE.createBuilder(localizedMessage);
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (LocalizedMessage) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static LocalizedMessage parseFrom(H h6) throws C1912g3 {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static LocalizedMessage parseFrom(H h6, W1 w1) throws C1912g3 {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static LocalizedMessage parseFrom(byte[] bArr) throws C1912g3 {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocalizedMessage parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream) throws IOException {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static LocalizedMessage parseFrom(S s5) throws IOException {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static LocalizedMessage parseFrom(S s5, W1 w1) throws IOException {
        return (LocalizedMessage) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
