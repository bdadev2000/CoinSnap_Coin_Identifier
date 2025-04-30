package com.google.longrunning;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.Any;
import com.google.protobuf.C1912g3;
import com.google.protobuf.C1915h;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import v5.k;
import v5.l;
import v5.m;
import v5.p;
import w5.w;

/* loaded from: classes2.dex */
public final class Operation extends L2 implements p {
    private static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private Object result_;
    private int resultCase_ = 0;
    private String name_ = "";

    static {
        Operation operation = new Operation();
        DEFAULT_INSTANCE = operation;
        L2.registerDefaultInstance(Operation.class, operation);
    }

    private Operation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDone() {
        this.done_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeError(Status status) {
        status.getClass();
        if (this.resultCase_ == 4 && this.result_ != Status.getDefaultInstance()) {
            this.result_ = ((w) Status.newBuilder((Status) this.result_).mergeFrom((L2) status)).buildPartial();
        } else {
            this.result_ = status;
        }
        this.resultCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(Any any) {
        any.getClass();
        Any any2 = this.metadata_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.metadata_ = (Any) ((C1915h) Any.newBuilder(this.metadata_).mergeFrom((L2) any)).buildPartial();
        } else {
            this.metadata_ = any;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(Any any) {
        any.getClass();
        if (this.resultCase_ == 5 && this.result_ != Any.getDefaultInstance()) {
            this.result_ = ((C1915h) Any.newBuilder((Any) this.result_).mergeFrom((L2) any)).buildPartial();
        } else {
            this.result_ = any;
        }
        this.resultCase_ = 5;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Operation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDone(boolean z8) {
        this.done_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(Status status) {
        status.getClass();
        this.result_ = status;
        this.resultCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(Any any) {
        any.getClass();
        this.metadata_ = any;
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
    public void setResponse(Any any) {
        any.getClass();
        this.result_ = any;
        this.resultCase_ = 5;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (k.f23636a[k22.ordinal()]) {
            case 1:
                return new Operation();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "name_", "metadata_", "done_", Status.class, Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Operation.class) {
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

    public boolean getDone() {
        return this.done_;
    }

    public Status getError() {
        if (this.resultCase_ == 4) {
            return (Status) this.result_;
        }
        return Status.getDefaultInstance();
    }

    public Any getMetadata() {
        Any any = this.metadata_;
        if (any == null) {
            return Any.getDefaultInstance();
        }
        return any;
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public Any getResponse() {
        if (this.resultCase_ == 5) {
            return (Any) this.result_;
        }
        return Any.getDefaultInstance();
    }

    public m getResultCase() {
        int i9 = this.resultCase_;
        if (i9 != 0) {
            if (i9 != 4) {
                if (i9 != 5) {
                    return null;
                }
                return m.f23637c;
            }
            return m.b;
        }
        return m.f23638d;
    }

    public boolean hasError() {
        if (this.resultCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasMetadata() {
        if (this.metadata_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasResponse() {
        if (this.resultCase_ == 5) {
            return true;
        }
        return false;
    }

    public static l newBuilder(Operation operation) {
        return (l) DEFAULT_INSTANCE.createBuilder(operation);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Operation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Operation parseFrom(H h6) throws C1912g3 {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Operation parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Operation parseFrom(byte[] bArr) throws C1912g3 {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Operation parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Operation parseFrom(S s5) throws IOException {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Operation parseFrom(S s5, W1 w1) throws IOException {
        return (Operation) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
