package com.google.api;

import a4.q1;
import a4.r1;
import a4.s1;
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
public final class SystemParameters extends L2 implements O3 {
    private static final SystemParameters DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private InterfaceC1891d3 rules_ = L2.emptyProtobufList();

    static {
        SystemParameters systemParameters = new SystemParameters();
        DEFAULT_INSTANCE = systemParameters;
        L2.registerDefaultInstance(SystemParameters.class, systemParameters);
    }

    private SystemParameters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        ensureRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(systemParameterRule);
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

    public static SystemParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static s1 newBuilder() {
        return (s1) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameters) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setRules(int i9, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i9, systemParameterRule);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (r1.f4039a[k22.ordinal()]) {
            case 1:
                return new SystemParameters();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", SystemParameterRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (SystemParameters.class) {
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

    public SystemParameterRule getRules(int i9) {
        return (SystemParameterRule) this.rules_.get(i9);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<SystemParameterRule> getRulesList() {
        return this.rules_;
    }

    public q1 getRulesOrBuilder(int i9) {
        return (q1) this.rules_.get(i9);
    }

    public List<? extends q1> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static s1 newBuilder(SystemParameters systemParameters) {
        return (s1) DEFAULT_INSTANCE.createBuilder(systemParameters);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SystemParameters) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static SystemParameters parseFrom(H h6) throws C1912g3 {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i9, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i9, systemParameterRule);
    }

    public static SystemParameters parseFrom(H h6, W1 w1) throws C1912g3 {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static SystemParameters parseFrom(byte[] bArr) throws C1912g3 {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameters parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static SystemParameters parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SystemParameters parseFrom(S s5) throws IOException {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static SystemParameters parseFrom(S s5, W1 w1) throws IOException {
        return (SystemParameters) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
