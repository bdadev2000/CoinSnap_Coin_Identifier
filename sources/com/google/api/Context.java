package com.google.api;

import a4.AbstractC0340A;
import a4.C0341B;
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
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Context extends L2 implements O3 {
    private static final Context DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private InterfaceC1891d3 rules_ = L2.emptyProtobufList();

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        L2.registerDefaultInstance(Context.class, context);
    }

    private Context() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends ContextRule> iterable) {
        ensureRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(contextRule);
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

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0341B newBuilder() {
        return (C0341B) DEFAULT_INSTANCE.createBuilder();
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setRules(int i9, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i9, contextRule);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0340A.f3959a[k22.ordinal()]) {
            case 1:
                return new Context();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", ContextRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Context.class) {
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

    public ContextRule getRules(int i9) {
        return (ContextRule) this.rules_.get(i9);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<ContextRule> getRulesList() {
        return this.rules_;
    }

    public InterfaceC0344E getRulesOrBuilder(int i9) {
        return (InterfaceC0344E) this.rules_.get(i9);
    }

    public List<? extends InterfaceC0344E> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C0341B newBuilder(Context context) {
        return (C0341B) DEFAULT_INSTANCE.createBuilder(context);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Context) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Context parseFrom(H h6) throws C1912g3 {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i9, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i9, contextRule);
    }

    public static Context parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Context parseFrom(byte[] bArr) throws C1912g3 {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Context parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Context parseFrom(S s5) throws IOException {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Context parseFrom(S s5, W1 w1) throws IOException {
        return (Context) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
