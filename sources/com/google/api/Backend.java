package com.google.api;

import a4.AbstractC0374o;
import a4.C0376p;
import a4.InterfaceC0385u;
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
public final class Backend extends L2 implements O3 {
    private static final Backend DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private InterfaceC1891d3 rules_ = L2.emptyProtobufList();

    static {
        Backend backend = new Backend();
        DEFAULT_INSTANCE = backend;
        L2.registerDefaultInstance(Backend.class, backend);
    }

    private Backend() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends BackendRule> iterable) {
        ensureRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(backendRule);
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

    public static Backend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0376p newBuilder() {
        return (C0376p) DEFAULT_INSTANCE.createBuilder();
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Backend) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setRules(int i9, BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i9, backendRule);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0374o.f4031a[k22.ordinal()]) {
            case 1:
                return new Backend();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", BackendRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Backend.class) {
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

    public BackendRule getRules(int i9) {
        return (BackendRule) this.rules_.get(i9);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<BackendRule> getRulesList() {
        return this.rules_;
    }

    public InterfaceC0385u getRulesOrBuilder(int i9) {
        return (InterfaceC0385u) this.rules_.get(i9);
    }

    public List<? extends InterfaceC0385u> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C0376p newBuilder(Backend backend) {
        return (C0376p) DEFAULT_INSTANCE.createBuilder(backend);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Backend) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Backend parseFrom(H h6) throws C1912g3 {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i9, BackendRule backendRule) {
        backendRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i9, backendRule);
    }

    public static Backend parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Backend parseFrom(byte[] bArr) throws C1912g3 {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Backend parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Backend parseFrom(InputStream inputStream) throws IOException {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Backend parseFrom(S s5) throws IOException {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Backend parseFrom(S s5, W1 w1) throws IOException {
        return (Backend) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
