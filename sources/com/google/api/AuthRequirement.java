package com.google.api;

import a4.AbstractC0358g;
import a4.C0360h;
import a4.InterfaceC0362i;
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
public final class AuthRequirement extends L2 implements InterfaceC0362i {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final AuthRequirement DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String providerId_ = "";
    private String audiences_ = "";

    static {
        AuthRequirement authRequirement = new AuthRequirement();
        DEFAULT_INSTANCE = authRequirement;
        L2.registerDefaultInstance(AuthRequirement.class, authRequirement);
    }

    private AuthRequirement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    public static AuthRequirement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0360h newBuilder() {
        return (C0360h) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthRequirement) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiences(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiencesBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.audiences_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(String str) {
        str.getClass();
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.providerId_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0358g.f4010a[k22.ordinal()]) {
            case 1:
                return new AuthRequirement();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"providerId_", "audiences_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AuthRequirement.class) {
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

    public String getAudiences() {
        return this.audiences_;
    }

    public H getAudiencesBytes() {
        return H.copyFromUtf8(this.audiences_);
    }

    public String getProviderId() {
        return this.providerId_;
    }

    public H getProviderIdBytes() {
        return H.copyFromUtf8(this.providerId_);
    }

    public static C0360h newBuilder(AuthRequirement authRequirement) {
        return (C0360h) DEFAULT_INSTANCE.createBuilder(authRequirement);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthRequirement) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AuthRequirement parseFrom(H h6) throws C1912g3 {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static AuthRequirement parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AuthRequirement parseFrom(byte[] bArr) throws C1912g3 {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthRequirement parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AuthRequirement parseFrom(InputStream inputStream) throws IOException {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthRequirement parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthRequirement parseFrom(S s5) throws IOException {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AuthRequirement parseFrom(S s5, W1 w1) throws IOException {
        return (AuthRequirement) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
