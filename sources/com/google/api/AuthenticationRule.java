package com.google.api;

import a4.AbstractC0368l;
import a4.C0370m;
import a4.InterfaceC0362i;
import a4.InterfaceC0372n;
import a4.M0;
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
public final class AuthenticationRule extends L2 implements InterfaceC0372n {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private String selector_ = "";
    private InterfaceC1891d3 requirements_ = L2.emptyProtobufList();

    static {
        AuthenticationRule authenticationRule = new AuthenticationRule();
        DEFAULT_INSTANCE = authenticationRule;
        L2.registerDefaultInstance(AuthenticationRule.class, authenticationRule);
    }

    private AuthenticationRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        ensureRequirementsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(authRequirement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOauth() {
        this.oauth_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureRequirementsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.requirements_;
        if (!interfaceC1891d3.isModifiable()) {
            this.requirements_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static AuthenticationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        OAuthRequirements oAuthRequirements2 = this.oauth_;
        if (oAuthRequirements2 != null && oAuthRequirements2 != OAuthRequirements.getDefaultInstance()) {
            this.oauth_ = (OAuthRequirements) ((M0) OAuthRequirements.newBuilder(this.oauth_).mergeFrom((L2) oAuthRequirements)).buildPartial();
        } else {
            this.oauth_ = oAuthRequirements;
        }
    }

    public static C0370m newBuilder() {
        return (C0370m) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRequirements(int i9) {
        ensureRequirementsIsMutable();
        this.requirements_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowWithoutCredential(boolean z8) {
        this.allowWithoutCredential_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        this.oauth_ = oAuthRequirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirements(int i9, AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i9, authRequirement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.selector_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0368l.f4028a[k22.ordinal()]) {
            case 1:
                return new AuthenticationRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\u0007\u0007\u001b", new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", AuthRequirement.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AuthenticationRule.class) {
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

    public boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    public OAuthRequirements getOauth() {
        OAuthRequirements oAuthRequirements = this.oauth_;
        if (oAuthRequirements == null) {
            return OAuthRequirements.getDefaultInstance();
        }
        return oAuthRequirements;
    }

    public AuthRequirement getRequirements(int i9) {
        return (AuthRequirement) this.requirements_.get(i9);
    }

    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    public List<AuthRequirement> getRequirementsList() {
        return this.requirements_;
    }

    public InterfaceC0362i getRequirementsOrBuilder(int i9) {
        return (InterfaceC0362i) this.requirements_.get(i9);
    }

    public List<? extends InterfaceC0362i> getRequirementsOrBuilderList() {
        return this.requirements_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public boolean hasOauth() {
        if (this.oauth_ != null) {
            return true;
        }
        return false;
    }

    public static C0370m newBuilder(AuthenticationRule authenticationRule) {
        return (C0370m) DEFAULT_INSTANCE.createBuilder(authenticationRule);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthenticationRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AuthenticationRule parseFrom(H h6) throws C1912g3 {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(int i9, AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(i9, authRequirement);
    }

    public static AuthenticationRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AuthenticationRule parseFrom(byte[] bArr) throws C1912g3 {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthenticationRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuthenticationRule parseFrom(S s5) throws IOException {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AuthenticationRule parseFrom(S s5, W1 w1) throws IOException {
        return (AuthenticationRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
