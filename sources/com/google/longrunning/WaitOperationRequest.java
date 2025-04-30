package com.google.longrunning;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.Duration;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.H1;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import v5.q;
import v5.r;

/* loaded from: classes2.dex */
public final class WaitOperationRequest extends L2 implements O3 {
    private static final WaitOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private String name_ = "";
    private Duration timeout_;

    static {
        WaitOperationRequest waitOperationRequest = new WaitOperationRequest();
        DEFAULT_INSTANCE = waitOperationRequest;
        L2.registerDefaultInstance(WaitOperationRequest.class, waitOperationRequest);
    }

    private WaitOperationRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeout() {
        this.timeout_ = null;
    }

    public static WaitOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeout(Duration duration) {
        duration.getClass();
        Duration duration2 = this.timeout_;
        if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
            this.timeout_ = (Duration) ((H1) Duration.newBuilder(this.timeout_).mergeFrom((L2) duration)).buildPartial();
        } else {
            this.timeout_ = duration;
        }
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WaitOperationRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setTimeout(Duration duration) {
        duration.getClass();
        this.timeout_ = duration;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (q.f23641a[k22.ordinal()]) {
            case 1:
                return new WaitOperationRequest();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "timeout_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (WaitOperationRequest.class) {
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

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public Duration getTimeout() {
        Duration duration = this.timeout_;
        if (duration == null) {
            return Duration.getDefaultInstance();
        }
        return duration;
    }

    public boolean hasTimeout() {
        if (this.timeout_ != null) {
            return true;
        }
        return false;
    }

    public static r newBuilder(WaitOperationRequest waitOperationRequest) {
        return (r) DEFAULT_INSTANCE.createBuilder(waitOperationRequest);
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (WaitOperationRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static WaitOperationRequest parseFrom(H h6) throws C1912g3 {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static WaitOperationRequest parseFrom(H h6, W1 w1) throws C1912g3 {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static WaitOperationRequest parseFrom(byte[] bArr) throws C1912g3 {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WaitOperationRequest parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream) throws IOException {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static WaitOperationRequest parseFrom(S s5) throws IOException {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static WaitOperationRequest parseFrom(S s5, W1 w1) throws IOException {
        return (WaitOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
