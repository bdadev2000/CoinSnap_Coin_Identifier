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
import v5.e;
import v5.f;

/* loaded from: classes2.dex */
public final class GetOperationRequest extends L2 implements O3 {
    private static final GetOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private String name_ = "";

    static {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        DEFAULT_INSTANCE = getOperationRequest;
        L2.registerDefaultInstance(GetOperationRequest.class, getOperationRequest);
    }

    private GetOperationRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static GetOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetOperationRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (e.f23633a[k22.ordinal()]) {
            case 1:
                return new GetOperationRequest();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (GetOperationRequest.class) {
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

    public static f newBuilder(GetOperationRequest getOperationRequest) {
        return (f) DEFAULT_INSTANCE.createBuilder(getOperationRequest);
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (GetOperationRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static GetOperationRequest parseFrom(H h6) throws C1912g3 {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static GetOperationRequest parseFrom(H h6, W1 w1) throws C1912g3 {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static GetOperationRequest parseFrom(byte[] bArr) throws C1912g3 {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetOperationRequest parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static GetOperationRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetOperationRequest parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static GetOperationRequest parseFrom(S s5) throws IOException {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static GetOperationRequest parseFrom(S s5, W1 w1) throws IOException {
        return (GetOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
