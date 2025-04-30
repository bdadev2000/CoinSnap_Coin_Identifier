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
import v5.g;
import v5.h;

/* loaded from: classes2.dex */
public final class ListOperationsRequest extends L2 implements O3 {
    private static final ListOperationsRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER;
    private int pageSize_;
    private String name_ = "";
    private String filter_ = "";
    private String pageToken_ = "";

    static {
        ListOperationsRequest listOperationsRequest = new ListOperationsRequest();
        DEFAULT_INSTANCE = listOperationsRequest;
        L2.registerDefaultInstance(ListOperationsRequest.class, listOperationsRequest);
    }

    private ListOperationsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilter() {
        this.filter_ = getDefaultInstance().getFilter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageToken() {
        this.pageToken_ = getDefaultInstance().getPageToken();
    }

    public static ListOperationsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilter(String str) {
        str.getClass();
        this.filter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.filter_ = h6.toStringUtf8();
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
    public void setPageSize(int i9) {
        this.pageSize_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageToken(String str) {
        str.getClass();
        this.pageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageTokenBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.pageToken_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (g.f23634a[k22.ordinal()]) {
            case 1:
                return new ListOperationsRequest();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"filter_", "pageSize_", "pageToken_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ListOperationsRequest.class) {
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

    public String getFilter() {
        return this.filter_;
    }

    public H getFilterBytes() {
        return H.copyFromUtf8(this.filter_);
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public int getPageSize() {
        return this.pageSize_;
    }

    public String getPageToken() {
        return this.pageToken_;
    }

    public H getPageTokenBytes() {
        return H.copyFromUtf8(this.pageToken_);
    }

    public static h newBuilder(ListOperationsRequest listOperationsRequest) {
        return (h) DEFAULT_INSTANCE.createBuilder(listOperationsRequest);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ListOperationsRequest) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ListOperationsRequest parseFrom(H h6) throws C1912g3 {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static ListOperationsRequest parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ListOperationsRequest parseFrom(byte[] bArr) throws C1912g3 {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListOperationsRequest parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ListOperationsRequest parseFrom(S s5) throws IOException {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ListOperationsRequest parseFrom(S s5, W1 w1) throws IOException {
        return (ListOperationsRequest) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
