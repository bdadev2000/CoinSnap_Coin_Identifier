package com.google.api;

import a4.AbstractC0378q;
import a4.C0381s;
import a4.EnumC0383t;
import a4.InterfaceC0385u;
import a4.r;
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
public final class BackendRule extends L2 implements InterfaceC0385u {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private int authenticationCase_ = 0;
    private String selector_ = "";
    private String address_ = "";
    private String protocol_ = "";

    static {
        BackendRule backendRule = new BackendRule();
        DEFAULT_INSTANCE = backendRule;
        L2.registerDefaultInstance(BackendRule.class, backendRule);
    }

    private BackendRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeadline() {
        this.deadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableAuth() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJwtAudience() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinDeadline() {
        this.minDeadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationDeadline() {
        this.operationDeadline_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPathTranslation() {
        this.pathTranslation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static BackendRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0381s newBuilder() {
        return (C0381s) DEFAULT_INSTANCE.createBuilder();
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BackendRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.address_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeadline(double d2) {
        this.deadline_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableAuth(boolean z8) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtAudience(String str) {
        str.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJwtAudienceBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.authentication_ = h6.toStringUtf8();
        this.authenticationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinDeadline(double d2) {
        this.minDeadline_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationDeadline(double d2) {
        this.operationDeadline_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathTranslation(EnumC0383t enumC0383t) {
        this.pathTranslation_ = enumC0383t.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathTranslationValue(int i9) {
        this.pathTranslation_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.protocol_ = h6.toStringUtf8();
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
        switch (AbstractC0378q.f4034a[k22.ordinal()]) {
            case 1:
                return new BackendRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (BackendRule.class) {
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

    public String getAddress() {
        return this.address_;
    }

    public H getAddressBytes() {
        return H.copyFromUtf8(this.address_);
    }

    public r getAuthenticationCase() {
        int i9 = this.authenticationCase_;
        if (i9 != 0) {
            if (i9 != 7) {
                if (i9 != 8) {
                    return null;
                }
                return r.f4036c;
            }
            return r.b;
        }
        return r.f4037d;
    }

    public double getDeadline() {
        return this.deadline_;
    }

    public boolean getDisableAuth() {
        if (this.authenticationCase_ == 8) {
            return ((Boolean) this.authentication_).booleanValue();
        }
        return false;
    }

    public String getJwtAudience() {
        if (this.authenticationCase_ == 7) {
            return (String) this.authentication_;
        }
        return "";
    }

    public H getJwtAudienceBytes() {
        String str;
        if (this.authenticationCase_ == 7) {
            str = (String) this.authentication_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public double getMinDeadline() {
        return this.minDeadline_;
    }

    public double getOperationDeadline() {
        return this.operationDeadline_;
    }

    public EnumC0383t getPathTranslation() {
        EnumC0383t enumC0383t;
        int i9 = this.pathTranslation_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    enumC0383t = null;
                } else {
                    enumC0383t = EnumC0383t.APPEND_PATH_TO_ADDRESS;
                }
            } else {
                enumC0383t = EnumC0383t.CONSTANT_ADDRESS;
            }
        } else {
            enumC0383t = EnumC0383t.PATH_TRANSLATION_UNSPECIFIED;
        }
        if (enumC0383t == null) {
            return EnumC0383t.UNRECOGNIZED;
        }
        return enumC0383t;
    }

    public int getPathTranslationValue() {
        return this.pathTranslation_;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public H getProtocolBytes() {
        return H.copyFromUtf8(this.protocol_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public static C0381s newBuilder(BackendRule backendRule) {
        return (C0381s) DEFAULT_INSTANCE.createBuilder(backendRule);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BackendRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static BackendRule parseFrom(H h6) throws C1912g3 {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static BackendRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static BackendRule parseFrom(byte[] bArr) throws C1912g3 {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BackendRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static BackendRule parseFrom(InputStream inputStream) throws IOException {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static BackendRule parseFrom(S s5) throws IOException {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static BackendRule parseFrom(S s5, W1 w1) throws IOException {
        return (BackendRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
