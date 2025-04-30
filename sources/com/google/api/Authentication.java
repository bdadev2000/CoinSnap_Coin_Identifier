package com.google.api;

import a4.AbstractC0364j;
import a4.C0366k;
import a4.InterfaceC0356f;
import a4.InterfaceC0372n;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Authentication extends L2 implements O3 {
    private static final Authentication DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private InterfaceC1891d3 rules_ = L2.emptyProtobufList();
    private InterfaceC1891d3 providers_ = L2.emptyProtobufList();

    static {
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        L2.registerDefaultInstance(Authentication.class, authentication);
    }

    private Authentication() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        ensureProvidersIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.providers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        ensureRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(authenticationRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviders() {
        this.providers_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = L2.emptyProtobufList();
    }

    private void ensureProvidersIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.providers_;
        if (!interfaceC1891d3.isModifiable()) {
            this.providers_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureRulesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.rules_;
        if (!interfaceC1891d3.isModifiable()) {
            this.rules_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0366k newBuilder() {
        return (C0366k) DEFAULT_INSTANCE.createBuilder();
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Authentication) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProviders(int i9) {
        ensureProvidersIsMutable();
        this.providers_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i9) {
        ensureRulesIsMutable();
        this.rules_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviders(int i9, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.set(i9, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i9, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i9, authenticationRule);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0364j.f4018a[k22.ordinal()]) {
            case 1:
                return new Authentication();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Authentication.class) {
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

    public AuthProvider getProviders(int i9) {
        return (AuthProvider) this.providers_.get(i9);
    }

    public int getProvidersCount() {
        return this.providers_.size();
    }

    public List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public InterfaceC0356f getProvidersOrBuilder(int i9) {
        return (InterfaceC0356f) this.providers_.get(i9);
    }

    public List<? extends InterfaceC0356f> getProvidersOrBuilderList() {
        return this.providers_;
    }

    public AuthenticationRule getRules(int i9) {
        return (AuthenticationRule) this.rules_.get(i9);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public InterfaceC0372n getRulesOrBuilder(int i9) {
        return (InterfaceC0372n) this.rules_.get(i9);
    }

    public List<? extends InterfaceC0372n> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C0366k newBuilder(Authentication authentication) {
        return (C0366k) DEFAULT_INSTANCE.createBuilder(authentication);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Authentication) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Authentication parseFrom(H h6) throws C1912g3 {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(int i9, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(i9, authProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i9, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i9, authenticationRule);
    }

    public static Authentication parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Authentication parseFrom(byte[] bArr) throws C1912g3 {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Authentication parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Authentication parseFrom(S s5) throws IOException {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Authentication parseFrom(S s5, W1 w1) throws IOException {
        return (Authentication) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
