package com.google.rpc;

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
import w5.t;
import w5.u;

/* loaded from: classes3.dex */
public final class RetryInfo extends L2 implements O3 {
    private static final RetryInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private Duration retryDelay_;

    static {
        RetryInfo retryInfo = new RetryInfo();
        DEFAULT_INSTANCE = retryInfo;
        L2.registerDefaultInstance(RetryInfo.class, retryInfo);
    }

    private RetryInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryDelay() {
        this.retryDelay_ = null;
    }

    public static RetryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRetryDelay(Duration duration) {
        duration.getClass();
        Duration duration2 = this.retryDelay_;
        if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
            this.retryDelay_ = (Duration) ((H1) Duration.newBuilder(this.retryDelay_).mergeFrom((L2) duration)).buildPartial();
        } else {
            this.retryDelay_ = duration;
        }
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RetryInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryDelay(Duration duration) {
        duration.getClass();
        this.retryDelay_ = duration;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (t.f23992a[k22.ordinal()]) {
            case 1:
                return new RetryInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"retryDelay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (RetryInfo.class) {
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

    public Duration getRetryDelay() {
        Duration duration = this.retryDelay_;
        if (duration == null) {
            return Duration.getDefaultInstance();
        }
        return duration;
    }

    public boolean hasRetryDelay() {
        if (this.retryDelay_ != null) {
            return true;
        }
        return false;
    }

    public static u newBuilder(RetryInfo retryInfo) {
        return (u) DEFAULT_INSTANCE.createBuilder(retryInfo);
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (RetryInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static RetryInfo parseFrom(H h6) throws C1912g3 {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static RetryInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static RetryInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetryInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static RetryInfo parseFrom(InputStream inputStream) throws IOException {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetryInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static RetryInfo parseFrom(S s5) throws IOException {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static RetryInfo parseFrom(S s5, W1 w1) throws IOException {
        return (RetryInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
