package com.google.api;

import a4.AbstractC0342C;
import a4.C0343D;
import a4.InterfaceC0344E;
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
public final class ContextRule extends L2 implements InterfaceC0344E {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private InterfaceC1891d3 requested_ = L2.emptyProtobufList();
    private InterfaceC1891d3 provided_ = L2.emptyProtobufList();
    private InterfaceC1891d3 allowedRequestExtensions_ = L2.emptyProtobufList();
    private InterfaceC1891d3 allowedResponseExtensions_ = L2.emptyProtobufList();

    static {
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        L2.registerDefaultInstance(ContextRule.class, contextRule);
    }

    private ContextRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.allowedRequestExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.allowedResponseExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.provided_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.requested_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvided(String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvidedBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureProvidedIsMutable();
        this.provided_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequested(String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequestedBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureRequestedIsMutable();
        this.requested_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.allowedRequestExtensions_;
        if (!interfaceC1891d3.isModifiable()) {
            this.allowedRequestExtensions_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.allowedResponseExtensions_;
        if (!interfaceC1891d3.isModifiable()) {
            this.allowedResponseExtensions_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureProvidedIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.provided_;
        if (!interfaceC1891d3.isModifiable()) {
            this.provided_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureRequestedIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.requested_;
        if (!interfaceC1891d3.isModifiable()) {
            this.requested_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0343D newBuilder() {
        return (C0343D) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i9, String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i9, String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvided(int i9, String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequested(int i9, String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.set(i9, str);
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
        switch (AbstractC0342C.f3961a[k22.ordinal()]) {
            case 1:
                return new ContextRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ContextRule.class) {
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

    public String getAllowedRequestExtensions(int i9) {
        return (String) this.allowedRequestExtensions_.get(i9);
    }

    public H getAllowedRequestExtensionsBytes(int i9) {
        return H.copyFromUtf8((String) this.allowedRequestExtensions_.get(i9));
    }

    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    public List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    public String getAllowedResponseExtensions(int i9) {
        return (String) this.allowedResponseExtensions_.get(i9);
    }

    public H getAllowedResponseExtensionsBytes(int i9) {
        return H.copyFromUtf8((String) this.allowedResponseExtensions_.get(i9));
    }

    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    public List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    public String getProvided(int i9) {
        return (String) this.provided_.get(i9);
    }

    public H getProvidedBytes(int i9) {
        return H.copyFromUtf8((String) this.provided_.get(i9));
    }

    public int getProvidedCount() {
        return this.provided_.size();
    }

    public List<String> getProvidedList() {
        return this.provided_;
    }

    public String getRequested(int i9) {
        return (String) this.requested_.get(i9);
    }

    public H getRequestedBytes(int i9) {
        return H.copyFromUtf8((String) this.requested_.get(i9));
    }

    public int getRequestedCount() {
        return this.requested_.size();
    }

    public List<String> getRequestedList() {
        return this.requested_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public static C0343D newBuilder(ContextRule contextRule) {
        return (C0343D) DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ContextRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ContextRule parseFrom(H h6) throws C1912g3 {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static ContextRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ContextRule parseFrom(byte[] bArr) throws C1912g3 {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ContextRule parseFrom(S s5) throws IOException {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ContextRule parseFrom(S s5, W1 w1) throws IOException {
        return (ContextRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
