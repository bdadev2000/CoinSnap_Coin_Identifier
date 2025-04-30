package com.google.api;

import a4.InterfaceC0349b0;
import a4.U;
import a4.V;
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
public final class Http extends L2 implements O3 {
    private static final Http DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private InterfaceC1891d3 rules_ = L2.emptyProtobufList();

    static {
        Http http = new Http();
        DEFAULT_INSTANCE = http;
        L2.registerDefaultInstance(Http.class, http);
    }

    private Http() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends HttpRule> iterable) {
        ensureRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullyDecodeReservedExpansion() {
        this.fullyDecodeReservedExpansion_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = L2.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.rules_;
        if (!interfaceC1891d3.isModifiable()) {
            this.rules_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Http getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static V newBuilder() {
        return (V) DEFAULT_INSTANCE.createBuilder();
    }

    public static Http parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Http) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i9) {
        ensureRulesIsMutable();
        this.rules_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullyDecodeReservedExpansion(boolean z8) {
        this.fullyDecodeReservedExpansion_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i9, HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i9, httpRule);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (U.f3977a[k22.ordinal()]) {
            case 1:
                return new Http();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"rules_", HttpRule.class, "fullyDecodeReservedExpansion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Http.class) {
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

    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
    }

    public HttpRule getRules(int i9) {
        return (HttpRule) this.rules_.get(i9);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<HttpRule> getRulesList() {
        return this.rules_;
    }

    public InterfaceC0349b0 getRulesOrBuilder(int i9) {
        return (InterfaceC0349b0) this.rules_.get(i9);
    }

    public List<? extends InterfaceC0349b0> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static V newBuilder(Http http) {
        return (V) DEFAULT_INSTANCE.createBuilder(http);
    }

    public static Http parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Http) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Http parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Http parseFrom(H h6) throws C1912g3 {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i9, HttpRule httpRule) {
        httpRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i9, httpRule);
    }

    public static Http parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Http parseFrom(byte[] bArr) throws C1912g3 {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Http parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Http parseFrom(InputStream inputStream) throws IOException {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Http parseFrom(S s5) throws IOException {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Http parseFrom(S s5, W1 w1) throws IOException {
        return (Http) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
