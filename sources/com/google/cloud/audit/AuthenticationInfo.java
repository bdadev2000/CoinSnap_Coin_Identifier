package com.google.cloud.audit;

import b4.AbstractC0571c;
import b4.C0572d;
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

/* loaded from: classes2.dex */
public final class AuthenticationInfo extends L2 implements O3 {
    private static final AuthenticationInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    static {
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        DEFAULT_INSTANCE = authenticationInfo;
        L2.registerDefaultInstance(AuthenticationInfo.class, authenticationInfo);
    }

    private AuthenticationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrincipalEmail() {
        this.principalEmail_ = getDefaultInstance().getPrincipalEmail();
    }

    public static AuthenticationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0572d newBuilder() {
        return (C0572d) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthenticationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrincipalEmail(String str) {
        str.getClass();
        this.principalEmail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrincipalEmailBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.principalEmail_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0571c.f5317a[k22.ordinal()]) {
            case 1:
                return new AuthenticationInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"principalEmail_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AuthenticationInfo.class) {
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

    public String getPrincipalEmail() {
        return this.principalEmail_;
    }

    public H getPrincipalEmailBytes() {
        return H.copyFromUtf8(this.principalEmail_);
    }

    public static C0572d newBuilder(AuthenticationInfo authenticationInfo) {
        return (C0572d) DEFAULT_INSTANCE.createBuilder(authenticationInfo);
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthenticationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AuthenticationInfo parseFrom(H h6) throws C1912g3 {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static AuthenticationInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AuthenticationInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthenticationInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthenticationInfo parseFrom(S s5) throws IOException {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AuthenticationInfo parseFrom(S s5, W1 w1) throws IOException {
        return (AuthenticationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
