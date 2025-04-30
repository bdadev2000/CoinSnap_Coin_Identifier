package com.google.rpc;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
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
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ErrorInfo extends L2 implements O3 {
    private static final ErrorInfo DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private G3 metadata_ = G3.emptyMapField();
    private String reason_ = "";
    private String domain_ = "";

    static {
        ErrorInfo errorInfo = new ErrorInfo();
        DEFAULT_INSTANCE = errorInfo;
        L2.registerDefaultInstance(ErrorInfo.class, errorInfo);
    }

    private ErrorInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDomain() {
        this.domain_ = getDefaultInstance().getDomain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = getDefaultInstance().getReason();
    }

    public static ErrorInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    private G3 internalGetMetadata() {
        return this.metadata_;
    }

    private G3 internalGetMutableMetadata() {
        if (!this.metadata_.isMutable()) {
            this.metadata_ = this.metadata_.mutableCopy();
        }
        return this.metadata_;
    }

    public static w5.f newBuilder() {
        return (w5.f) DEFAULT_INSTANCE.createBuilder();
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ErrorInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDomain(String str) {
        str.getClass();
        this.domain_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDomainBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.domain_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(String str) {
        str.getClass();
        this.reason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.reason_ = h6.toStringUtf8();
    }

    public boolean containsMetadata(String str) {
        str.getClass();
        return internalGetMetadata().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (w5.e.f23984a[k22.ordinal()]) {
            case 1:
                return new ErrorInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"reason_", "domain_", "metadata_", w5.g.f23985a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ErrorInfo.class) {
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

    public String getDomain() {
        return this.domain_;
    }

    public H getDomainBytes() {
        return H.copyFromUtf8(this.domain_);
    }

    @Deprecated
    public Map<String, String> getMetadata() {
        return getMetadataMap();
    }

    public int getMetadataCount() {
        return internalGetMetadata().size();
    }

    public Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(internalGetMetadata());
    }

    public String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        G3 internalGetMetadata = internalGetMetadata();
        if (internalGetMetadata.containsKey(str)) {
            return (String) internalGetMetadata.get(str);
        }
        return str2;
    }

    public String getMetadataOrThrow(String str) {
        str.getClass();
        G3 internalGetMetadata = internalGetMetadata();
        if (internalGetMetadata.containsKey(str)) {
            return (String) internalGetMetadata.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getReason() {
        return this.reason_;
    }

    public H getReasonBytes() {
        return H.copyFromUtf8(this.reason_);
    }

    public static w5.f newBuilder(ErrorInfo errorInfo) {
        return (w5.f) DEFAULT_INSTANCE.createBuilder(errorInfo);
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ErrorInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ErrorInfo parseFrom(H h6) throws C1912g3 {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static ErrorInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ErrorInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ErrorInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ErrorInfo parseFrom(InputStream inputStream) throws IOException {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ErrorInfo parseFrom(S s5) throws IOException {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ErrorInfo parseFrom(S s5, W1 w1) throws IOException {
        return (ErrorInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
