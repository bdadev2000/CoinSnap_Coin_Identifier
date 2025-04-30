package com.google.longrunning;

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
import v5.n;
import v5.o;

/* loaded from: classes2.dex */
public final class OperationInfo extends L2 implements O3 {
    private static final OperationInfo DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String responseType_ = "";
    private String metadataType_ = "";

    static {
        OperationInfo operationInfo = new OperationInfo();
        DEFAULT_INSTANCE = operationInfo;
        L2.registerDefaultInstance(OperationInfo.class, operationInfo);
    }

    private OperationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadataType() {
        this.metadataType_ = getDefaultInstance().getMetadataType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseType() {
        this.responseType_ = getDefaultInstance().getResponseType();
    }

    public static OperationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataType(String str) {
        str.getClass();
        this.metadataType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.metadataType_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseType(String str) {
        str.getClass();
        this.responseType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.responseType_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (n.f23640a[k22.ordinal()]) {
            case 1:
                return new OperationInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseType_", "metadataType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (OperationInfo.class) {
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

    public String getMetadataType() {
        return this.metadataType_;
    }

    public H getMetadataTypeBytes() {
        return H.copyFromUtf8(this.metadataType_);
    }

    public String getResponseType() {
        return this.responseType_;
    }

    public H getResponseTypeBytes() {
        return H.copyFromUtf8(this.responseType_);
    }

    public static o newBuilder(OperationInfo operationInfo) {
        return (o) DEFAULT_INSTANCE.createBuilder(operationInfo);
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (OperationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static OperationInfo parseFrom(H h6) throws C1912g3 {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static OperationInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static OperationInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static OperationInfo parseFrom(InputStream inputStream) throws IOException {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static OperationInfo parseFrom(S s5) throws IOException {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static OperationInfo parseFrom(S s5, W1 w1) throws IOException {
        return (OperationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
