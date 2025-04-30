package com.google.api;

import a4.n1;
import a4.o1;
import a4.p1;
import a4.q1;
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
public final class SystemParameterRule extends L2 implements q1 {
    private static final SystemParameterRule DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private InterfaceC1891d3 parameters_ = L2.emptyProtobufList();

    static {
        SystemParameterRule systemParameterRule = new SystemParameterRule();
        DEFAULT_INSTANCE = systemParameterRule;
        L2.registerDefaultInstance(SystemParameterRule.class, systemParameterRule);
    }

    private SystemParameterRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParameters(Iterable<? extends SystemParameter> iterable) {
        ensureParametersIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.parameters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(systemParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameters() {
        this.parameters_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureParametersIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.parameters_;
        if (!interfaceC1891d3.isModifiable()) {
            this.parameters_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static SystemParameterRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static p1 newBuilder() {
        return (p1) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParameters(int i9) {
        ensureParametersIsMutable();
        this.parameters_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameters(int i9, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.set(i9, systemParameter);
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
        switch (o1.f4033a[k22.ordinal()]) {
            case 1:
                return new SystemParameterRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", SystemParameter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (SystemParameterRule.class) {
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

    public SystemParameter getParameters(int i9) {
        return (SystemParameter) this.parameters_.get(i9);
    }

    public int getParametersCount() {
        return this.parameters_.size();
    }

    public List<SystemParameter> getParametersList() {
        return this.parameters_;
    }

    public n1 getParametersOrBuilder(int i9) {
        return (n1) this.parameters_.get(i9);
    }

    public List<? extends n1> getParametersOrBuilderList() {
        return this.parameters_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public static p1 newBuilder(SystemParameterRule systemParameterRule) {
        return (p1) DEFAULT_INSTANCE.createBuilder(systemParameterRule);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SystemParameterRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static SystemParameterRule parseFrom(H h6) throws C1912g3 {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameters(int i9, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(i9, systemParameter);
    }

    public static SystemParameterRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static SystemParameterRule parseFrom(byte[] bArr) throws C1912g3 {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameterRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SystemParameterRule parseFrom(S s5) throws IOException {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static SystemParameterRule parseFrom(S s5, W1 w1) throws IOException {
        return (SystemParameterRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
