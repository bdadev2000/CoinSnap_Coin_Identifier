package com.google.cloud.audit;

import b4.h;
import b4.i;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class RequestMetadata extends L2 implements O3 {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final RequestMetadata DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    static {
        RequestMetadata requestMetadata = new RequestMetadata();
        DEFAULT_INSTANCE = requestMetadata;
        L2.registerDefaultInstance(RequestMetadata.class, requestMetadata);
    }

    private RequestMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallerIp() {
        this.callerIp_ = getDefaultInstance().getCallerIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallerSuppliedUserAgent() {
        this.callerSuppliedUserAgent_ = getDefaultInstance().getCallerSuppliedUserAgent();
    }

    public static RequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerIp(String str) {
        str.getClass();
        this.callerIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerIpBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.callerIp_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerSuppliedUserAgent(String str) {
        str.getClass();
        this.callerSuppliedUserAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerSuppliedUserAgentBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.callerSuppliedUserAgent_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (h.f5319a[k22.ordinal()]) {
            case 1:
                return new RequestMetadata();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (RequestMetadata.class) {
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

    public String getCallerIp() {
        return this.callerIp_;
    }

    public H getCallerIpBytes() {
        return H.copyFromUtf8(this.callerIp_);
    }

    public String getCallerSuppliedUserAgent() {
        return this.callerSuppliedUserAgent_;
    }

    public H getCallerSuppliedUserAgentBytes() {
        return H.copyFromUtf8(this.callerSuppliedUserAgent_);
    }

    public static i newBuilder(RequestMetadata requestMetadata) {
        return (i) DEFAULT_INSTANCE.createBuilder(requestMetadata);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (RequestMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static RequestMetadata parseFrom(H h6) throws C1912g3 {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static RequestMetadata parseFrom(H h6, W1 w1) throws C1912g3 {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static RequestMetadata parseFrom(byte[] bArr) throws C1912g3 {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RequestMetadata parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static RequestMetadata parseFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static RequestMetadata parseFrom(S s5) throws IOException {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static RequestMetadata parseFrom(S s5, W1 w1) throws IOException {
        return (RequestMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
