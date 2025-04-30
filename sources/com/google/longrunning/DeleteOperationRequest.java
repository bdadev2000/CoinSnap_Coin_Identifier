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
import v5.AbstractC2856c;
import v5.C2857d;

/* loaded from: classes2.dex */
public final class DeleteOperationRequest extends L2 implements O3 {
    private static final DeleteOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private String name_ = "";

    static {
        DeleteOperationRequest deleteOperationRequest = new DeleteOperationRequest();
        DEFAULT_INSTANCE = deleteOperationRequest;
        L2.registerDefaultInstance(DeleteOperationRequest.class, deleteOperationRequest);
    }

    private DeleteOperationRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static DeleteOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2857d newBuilder() {
        return (C2857d) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeleteOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeleteOperationRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteOperationRequest parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        switch (AbstractC2856c.f23632a[k22.ordinal()]) {
            case 1:
                return new DeleteOperationRequest();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DeleteOperationRequest.class) {
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

    public static C2857d newBuilder(DeleteOperationRequest deleteOperationRequest) {
        return (C2857d) DEFAULT_INSTANCE.createBuilder(deleteOperationRequest);
    }

    public static DeleteOperationRequest parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DeleteOperationRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DeleteOperationRequest parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DeleteOperationRequest parseFrom(H h6) throws C1912g3 {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DeleteOperationRequest parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DeleteOperationRequest parseFrom(byte[] bArr) throws C1912g3 {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeleteOperationRequest parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DeleteOperationRequest parseFrom(InputStream inputStream) throws IOException {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteOperationRequest parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DeleteOperationRequest parseFrom(S s5) throws IOException {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DeleteOperationRequest parseFrom(S s5, W1 w1) throws IOException {
        return (DeleteOperationRequest) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
