package com.google.rpc;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.Any;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1922i;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import w5.v;
import w5.w;

/* loaded from: classes3.dex */
public final class Status extends L2 implements O3 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER;
    private int code_;
    private String message_ = "";
    private InterfaceC1891d3 details_ = L2.emptyProtobufList();

    static {
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        L2.registerDefaultInstance(Status.class, status);
    }

    private Status() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends Any> iterable) {
        ensureDetailsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.add(any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    private void ensureDetailsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.details_;
        if (!interfaceC1891d3.isModifiable()) {
            this.details_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetails(int i9) {
        ensureDetailsIsMutable();
        this.details_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i9) {
        this.code_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(int i9, Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i9, any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.message_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (v.f23993a[k22.ordinal()]) {
            case 1:
                return new Status();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Status.class) {
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

    public int getCode() {
        return this.code_;
    }

    public Any getDetails(int i9) {
        return (Any) this.details_.get(i9);
    }

    public int getDetailsCount() {
        return this.details_.size();
    }

    public List<Any> getDetailsList() {
        return this.details_;
    }

    public InterfaceC1922i getDetailsOrBuilder(int i9) {
        return (InterfaceC1922i) this.details_.get(i9);
    }

    public List<? extends InterfaceC1922i> getDetailsOrBuilderList() {
        return this.details_;
    }

    public String getMessage() {
        return this.message_;
    }

    public H getMessageBytes() {
        return H.copyFromUtf8(this.message_);
    }

    public static w newBuilder(Status status) {
        return (w) DEFAULT_INSTANCE.createBuilder(status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Status) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Status parseFrom(H h6) throws C1912g3 {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(int i9, Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i9, any);
    }

    public static Status parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Status parseFrom(byte[] bArr) throws C1912g3 {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Status parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Status parseFrom(S s5) throws IOException {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Status parseFrom(S s5, W1 w1) throws IOException {
        return (Status) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
