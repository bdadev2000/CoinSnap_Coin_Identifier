package com.google.cloud.audit;

import b4.AbstractC0573e;
import b4.f;
import b4.g;
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
public final class AuthorizationInfo extends L2 implements g {
    private static final AuthorizationInfo DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String resource_ = "";
    private String permission_ = "";

    static {
        AuthorizationInfo authorizationInfo = new AuthorizationInfo();
        DEFAULT_INSTANCE = authorizationInfo;
        L2.registerDefaultInstance(AuthorizationInfo.class, authorizationInfo);
    }

    private AuthorizationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGranted() {
        this.granted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermission() {
        this.permission_ = getDefaultInstance().getPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = getDefaultInstance().getResource();
    }

    public static AuthorizationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGranted(boolean z8) {
        this.granted_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermission(String str) {
        str.getClass();
        this.permission_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.permission_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.resource_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0573e.f5318a[k22.ordinal()]) {
            case 1:
                return new AuthorizationInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"resource_", "permission_", "granted_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AuthorizationInfo.class) {
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

    public boolean getGranted() {
        return this.granted_;
    }

    public String getPermission() {
        return this.permission_;
    }

    public H getPermissionBytes() {
        return H.copyFromUtf8(this.permission_);
    }

    public String getResource() {
        return this.resource_;
    }

    public H getResourceBytes() {
        return H.copyFromUtf8(this.resource_);
    }

    public static f newBuilder(AuthorizationInfo authorizationInfo) {
        return (f) DEFAULT_INSTANCE.createBuilder(authorizationInfo);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthorizationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AuthorizationInfo parseFrom(H h6) throws C1912g3 {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static AuthorizationInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthorizationInfo parseFrom(S s5) throws IOException {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AuthorizationInfo parseFrom(S s5, W1 w1) throws IOException {
        return (AuthorizationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
