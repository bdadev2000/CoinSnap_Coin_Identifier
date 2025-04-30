package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
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

/* loaded from: classes3.dex */
public final class Sdk$SDKErrorBatch extends L2 implements i {
    private static final Sdk$SDKErrorBatch DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 errors_ = L2.emptyProtobufList();

    static {
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = new Sdk$SDKErrorBatch();
        DEFAULT_INSTANCE = sdk$SDKErrorBatch;
        L2.registerDefaultInstance(Sdk$SDKErrorBatch.class, sdk$SDKErrorBatch);
    }

    private Sdk$SDKErrorBatch() {
    }

    public void addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
        ensureErrorsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.errors_);
    }

    public void addErrors(Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(sdk$SDKError);
    }

    public void clearErrors() {
        this.errors_ = L2.emptyProtobufList();
    }

    private void ensureErrorsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.errors_;
        if (!interfaceC1891d3.isModifiable()) {
            this.errors_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Sdk$SDKErrorBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeErrors(int i9) {
        ensureErrorsIsMutable();
        this.errors_.remove(i9);
    }

    public void setErrors(int i9, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.set(i9, sdk$SDKError);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Sdk$SDKErrorBatch();
            case 2:
                return new h(null);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"errors_", Sdk$SDKError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Sdk$SDKErrorBatch.class) {
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

    @Override // com.vungle.ads.internal.protos.i
    public Sdk$SDKError getErrors(int i9) {
        return (Sdk$SDKError) this.errors_.get(i9);
    }

    @Override // com.vungle.ads.internal.protos.i
    public int getErrorsCount() {
        return this.errors_.size();
    }

    @Override // com.vungle.ads.internal.protos.i
    public List<Sdk$SDKError> getErrorsList() {
        return this.errors_;
    }

    public j getErrorsOrBuilder(int i9) {
        return (j) this.errors_.get(i9);
    }

    public List<? extends j> getErrorsOrBuilderList() {
        return this.errors_;
    }

    public static h newBuilder(Sdk$SDKErrorBatch sdk$SDKErrorBatch) {
        return (h) DEFAULT_INSTANCE.createBuilder(sdk$SDKErrorBatch);
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$SDKErrorBatch) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Sdk$SDKErrorBatch parseFrom(H h6) throws C1912g3 {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public void addErrors(int i9, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(i9, sdk$SDKError);
    }

    public static Sdk$SDKErrorBatch parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr) throws C1912g3 {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Sdk$SDKErrorBatch parseFrom(S s5) throws IOException {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Sdk$SDKErrorBatch parseFrom(S s5, W1 w1) throws IOException {
        return (Sdk$SDKErrorBatch) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
