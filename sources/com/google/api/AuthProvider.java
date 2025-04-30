package com.google.api;

import a4.AbstractC0352d;
import a4.C0354e;
import a4.InterfaceC0356f;
import a4.InterfaceC0357f0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class AuthProvider extends L2 implements InterfaceC0356f {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile InterfaceC1948l4 PARSER;
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private InterfaceC1891d3 jwtLocations_ = L2.emptyProtobufList();

    static {
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        L2.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    private AuthProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        ensureJwtLocationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.jwtLocations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwtLocations() {
        this.jwtLocations_ = L2.emptyProtobufList();
    }

    private void ensureJwtLocationsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.jwtLocations_;
        if (!interfaceC1891d3.isModifiable()) {
            this.jwtLocations_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0354e newBuilder() {
        return (C0354e) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeJwtLocations(int i9) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i9);
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
    public void setAuthorizationUrl(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationUrlBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.authorizationUrl_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.id_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuer(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuerBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.issuer_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUri(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwksUriBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.jwksUri_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtLocations(int i9, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i9, jwtLocation);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0352d.f4000a[k22.ordinal()]) {
            case 1:
                return new AuthProvider();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AuthProvider.class) {
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

    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    public H getAuthorizationUrlBytes() {
        return H.copyFromUtf8(this.authorizationUrl_);
    }

    public String getId() {
        return this.id_;
    }

    public H getIdBytes() {
        return H.copyFromUtf8(this.id_);
    }

    public String getIssuer() {
        return this.issuer_;
    }

    public H getIssuerBytes() {
        return H.copyFromUtf8(this.issuer_);
    }

    public String getJwksUri() {
        return this.jwksUri_;
    }

    public H getJwksUriBytes() {
        return H.copyFromUtf8(this.jwksUri_);
    }

    public JwtLocation getJwtLocations(int i9) {
        return (JwtLocation) this.jwtLocations_.get(i9);
    }

    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    public List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public InterfaceC0357f0 getJwtLocationsOrBuilder(int i9) {
        return (InterfaceC0357f0) this.jwtLocations_.get(i9);
    }

    public List<? extends InterfaceC0357f0> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    public static C0354e newBuilder(AuthProvider authProvider) {
        return (C0354e) DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthProvider) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AuthProvider parseFrom(H h6) throws C1912g3 {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addJwtLocations(int i9, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i9, jwtLocation);
    }

    public static AuthProvider parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AuthProvider parseFrom(byte[] bArr) throws C1912g3 {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthProvider parseFrom(S s5) throws IOException {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AuthProvider parseFrom(S s5, W1 w1) throws IOException {
        return (AuthProvider) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
