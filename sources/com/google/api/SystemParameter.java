package com.google.api;

import a4.l1;
import a4.m1;
import a4.n1;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class SystemParameter extends L2 implements n1 {
    private static final SystemParameter DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String name_ = "";
    private String httpHeader_ = "";
    private String urlQueryParameter_ = "";

    static {
        SystemParameter systemParameter = new SystemParameter();
        DEFAULT_INSTANCE = systemParameter;
        L2.registerDefaultInstance(SystemParameter.class, systemParameter);
    }

    private SystemParameter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpHeader() {
        this.httpHeader_ = getDefaultInstance().getHttpHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlQueryParameter() {
        this.urlQueryParameter_ = getDefaultInstance().getUrlQueryParameter();
    }

    public static SystemParameter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m1 newBuilder() {
        return (m1) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameter) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpHeader(String str) {
        str.getClass();
        this.httpHeader_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpHeaderBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.httpHeader_ = h6.toStringUtf8();
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
    public void setUrlQueryParameter(String str) {
        str.getClass();
        this.urlQueryParameter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlQueryParameterBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.urlQueryParameter_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (l1.f4030a[k22.ordinal()]) {
            case 1:
                return new SystemParameter();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "httpHeader_", "urlQueryParameter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (SystemParameter.class) {
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

    public String getHttpHeader() {
        return this.httpHeader_;
    }

    public H getHttpHeaderBytes() {
        return H.copyFromUtf8(this.httpHeader_);
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public String getUrlQueryParameter() {
        return this.urlQueryParameter_;
    }

    public H getUrlQueryParameterBytes() {
        return H.copyFromUtf8(this.urlQueryParameter_);
    }

    public static m1 newBuilder(SystemParameter systemParameter) {
        return (m1) DEFAULT_INSTANCE.createBuilder(systemParameter);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SystemParameter) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static SystemParameter parseFrom(H h6) throws C1912g3 {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static SystemParameter parseFrom(H h6, W1 w1) throws C1912g3 {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static SystemParameter parseFrom(byte[] bArr) throws C1912g3 {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameter parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static SystemParameter parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameter parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SystemParameter parseFrom(S s5) throws IOException {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static SystemParameter parseFrom(S s5, W1 w1) throws IOException {
        return (SystemParameter) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
