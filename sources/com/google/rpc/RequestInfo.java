package com.google.rpc;

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
import w5.p;
import w5.q;

/* loaded from: classes3.dex */
public final class RequestInfo extends L2 implements O3 {
    private static final RequestInfo DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    static {
        RequestInfo requestInfo = new RequestInfo();
        DEFAULT_INSTANCE = requestInfo;
        L2.registerDefaultInstance(RequestInfo.class, requestInfo);
    }

    private RequestInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServingData() {
        this.servingData_ = getDefaultInstance().getServingData();
    }

    public static RequestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.requestId_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServingData(String str) {
        str.getClass();
        this.servingData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServingDataBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.servingData_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (p.f23990a[k22.ordinal()]) {
            case 1:
                return new RequestInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "servingData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (RequestInfo.class) {
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

    public String getRequestId() {
        return this.requestId_;
    }

    public H getRequestIdBytes() {
        return H.copyFromUtf8(this.requestId_);
    }

    public String getServingData() {
        return this.servingData_;
    }

    public H getServingDataBytes() {
        return H.copyFromUtf8(this.servingData_);
    }

    public static q newBuilder(RequestInfo requestInfo) {
        return (q) DEFAULT_INSTANCE.createBuilder(requestInfo);
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (RequestInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static RequestInfo parseFrom(H h6) throws C1912g3 {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static RequestInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static RequestInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RequestInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static RequestInfo parseFrom(InputStream inputStream) throws IOException {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static RequestInfo parseFrom(S s5) throws IOException {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static RequestInfo parseFrom(S s5, W1 w1) throws IOException {
        return (RequestInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
