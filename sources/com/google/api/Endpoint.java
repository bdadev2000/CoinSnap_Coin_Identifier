package com.google.api;

import a4.Q;
import a4.S;
import a4.T;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Endpoint extends L2 implements T {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final Endpoint DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private boolean allowCors_;
    private String name_ = "";
    private InterfaceC1891d3 aliases_ = L2.emptyProtobufList();
    private InterfaceC1891d3 features_ = L2.emptyProtobufList();
    private String target_ = "";

    static {
        Endpoint endpoint = new Endpoint();
        DEFAULT_INSTANCE = endpoint;
        L2.registerDefaultInstance(Endpoint.class, endpoint);
    }

    private Endpoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliases(String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliasesBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureAliasesIsMutable();
        this.aliases_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAliases(Iterable<String> iterable) {
        ensureAliasesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.aliases_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeatures(Iterable<String> iterable) {
        ensureFeaturesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.features_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatures(String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeaturesBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureFeaturesIsMutable();
        this.features_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowCors() {
        this.allowCors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = getDefaultInstance().getTarget();
    }

    private void ensureAliasesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.aliases_;
        if (!interfaceC1891d3.isModifiable()) {
            this.aliases_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureFeaturesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.features_;
        if (!interfaceC1891d3.isModifiable()) {
            this.features_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static S newBuilder() {
        return (S) DEFAULT_INSTANCE.createBuilder();
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Endpoint) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliases(int i9, String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowCors(boolean z8) {
        this.allowCors_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(int i9, String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.name_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.target_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (Q.f3974a[k22.ordinal()]) {
            case 1:
                return new Endpoint();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Endpoint.class) {
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

    @Deprecated
    public String getAliases(int i9) {
        return (String) this.aliases_.get(i9);
    }

    @Deprecated
    public H getAliasesBytes(int i9) {
        return H.copyFromUtf8((String) this.aliases_.get(i9));
    }

    @Deprecated
    public int getAliasesCount() {
        return this.aliases_.size();
    }

    @Deprecated
    public List<String> getAliasesList() {
        return this.aliases_;
    }

    public boolean getAllowCors() {
        return this.allowCors_;
    }

    public String getFeatures(int i9) {
        return (String) this.features_.get(i9);
    }

    public H getFeaturesBytes(int i9) {
        return H.copyFromUtf8((String) this.features_.get(i9));
    }

    public int getFeaturesCount() {
        return this.features_.size();
    }

    public List<String> getFeaturesList() {
        return this.features_;
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public String getTarget() {
        return this.target_;
    }

    public H getTargetBytes() {
        return H.copyFromUtf8(this.target_);
    }

    public static S newBuilder(Endpoint endpoint) {
        return (S) DEFAULT_INSTANCE.createBuilder(endpoint);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Endpoint) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Endpoint parseFrom(H h6) throws C1912g3 {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Endpoint parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Endpoint parseFrom(byte[] bArr) throws C1912g3 {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Endpoint parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Endpoint parseFrom(InputStream inputStream) throws IOException {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Endpoint parseFrom(com.google.protobuf.S s5) throws IOException {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Endpoint parseFrom(com.google.protobuf.S s5, W1 w1) throws IOException {
        return (Endpoint) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
