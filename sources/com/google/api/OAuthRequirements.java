package com.google.api;

import a4.L0;
import a4.M0;
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
public final class OAuthRequirements extends L2 implements O3 {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    private static final OAuthRequirements DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER;
    private String canonicalScopes_ = "";

    static {
        OAuthRequirements oAuthRequirements = new OAuthRequirements();
        DEFAULT_INSTANCE = oAuthRequirements;
        L2.registerDefaultInstance(OAuthRequirements.class, oAuthRequirements);
    }

    private OAuthRequirements() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanonicalScopes() {
        this.canonicalScopes_ = getDefaultInstance().getCanonicalScopes();
    }

    public static OAuthRequirements getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static M0 newBuilder() {
        return (M0) DEFAULT_INSTANCE.createBuilder();
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OAuthRequirements) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanonicalScopes(String str) {
        str.getClass();
        this.canonicalScopes_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanonicalScopesBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.canonicalScopes_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (L0.f3971a[k22.ordinal()]) {
            case 1:
                return new OAuthRequirements();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"canonicalScopes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (OAuthRequirements.class) {
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

    public String getCanonicalScopes() {
        return this.canonicalScopes_;
    }

    public H getCanonicalScopesBytes() {
        return H.copyFromUtf8(this.canonicalScopes_);
    }

    public static M0 newBuilder(OAuthRequirements oAuthRequirements) {
        return (M0) DEFAULT_INSTANCE.createBuilder(oAuthRequirements);
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (OAuthRequirements) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static OAuthRequirements parseFrom(H h6) throws C1912g3 {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static OAuthRequirements parseFrom(H h6, W1 w1) throws C1912g3 {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static OAuthRequirements parseFrom(byte[] bArr) throws C1912g3 {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OAuthRequirements parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static OAuthRequirements parseFrom(InputStream inputStream) throws IOException {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OAuthRequirements parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static OAuthRequirements parseFrom(S s5) throws IOException {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static OAuthRequirements parseFrom(S s5, W1 w1) throws IOException {
        return (OAuthRequirements) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
