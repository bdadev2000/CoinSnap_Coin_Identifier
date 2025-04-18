package com.vungle.ads.internal.protos;

import com.google.protobuf.a2;
import com.google.protobuf.e4;
import com.google.protobuf.h0;
import com.google.protobuf.h4;
import com.google.protobuf.i3;
import com.google.protobuf.m6;
import com.google.protobuf.n3;
import com.google.protobuf.o3;
import com.google.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Sdk$SDKErrorBatch extends o3 implements i {
    private static final Sdk$SDKErrorBatch DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 1;
    private static volatile m6 PARSER;
    private e4 errors_ = o3.emptyProtobufList();

    static {
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = new Sdk$SDKErrorBatch();
        DEFAULT_INSTANCE = sdk$SDKErrorBatch;
        o3.registerDefaultInstance(Sdk$SDKErrorBatch.class, sdk$SDKErrorBatch);
    }

    private Sdk$SDKErrorBatch() {
    }

    public void addAllErrors(Iterable<? extends Sdk$SDKError> iterable) {
        ensureErrorsIsMutable();
        com.google.protobuf.c.addAll((Iterable) iterable, (List) this.errors_);
    }

    public void addErrors(Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(sdk$SDKError);
    }

    public void clearErrors() {
        this.errors_ = o3.emptyProtobufList();
    }

    private void ensureErrorsIsMutable() {
        e4 e4Var = this.errors_;
        if (!e4Var.isModifiable()) {
            this.errors_ = o3.mutableCopy(e4Var);
        }
    }

    public static Sdk$SDKErrorBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeErrors(int i10) {
        ensureErrorsIsMutable();
        this.errors_.remove(i10);
    }

    public void setErrors(int i10, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.set(i10, sdk$SDKError);
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Sdk$SDKErrorBatch();
            case 2:
                return new h(null);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"errors_", Sdk$SDKError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Sdk$SDKErrorBatch.class) {
                        m6Var = PARSER;
                        if (m6Var == null) {
                            m6Var = new i3(DEFAULT_INSTANCE);
                            PARSER = m6Var;
                        }
                    }
                }
                return m6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.i
    public Sdk$SDKError getErrors(int i10) {
        return (Sdk$SDKError) this.errors_.get(i10);
    }

    @Override // com.vungle.ads.internal.protos.i
    public int getErrorsCount() {
        return this.errors_.size();
    }

    @Override // com.vungle.ads.internal.protos.i
    public List<Sdk$SDKError> getErrorsList() {
        return this.errors_;
    }

    public j getErrorsOrBuilder(int i10) {
        return (j) this.errors_.get(i10);
    }

    public List<? extends j> getErrorsOrBuilderList() {
        return this.errors_;
    }

    public static h newBuilder(Sdk$SDKErrorBatch sdk$SDKErrorBatch) {
        return (h) DEFAULT_INSTANCE.createBuilder(sdk$SDKErrorBatch);
    }

    public static Sdk$SDKErrorBatch parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$SDKErrorBatch) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$SDKErrorBatch parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Sdk$SDKErrorBatch parseFrom(h0 h0Var) throws h4 {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public void addErrors(int i10, Sdk$SDKError sdk$SDKError) {
        sdk$SDKError.getClass();
        ensureErrorsIsMutable();
        this.errors_.add(i10, sdk$SDKError);
    }

    public static Sdk$SDKErrorBatch parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr) throws h4 {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKErrorBatch parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKErrorBatch parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Sdk$SDKErrorBatch parseFrom(r0 r0Var) throws IOException {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Sdk$SDKErrorBatch parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Sdk$SDKErrorBatch) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
