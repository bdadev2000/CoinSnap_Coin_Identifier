package com.google.longrunning;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
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
import v5.i;
import v5.j;
import v5.p;

/* loaded from: classes2.dex */
public final class ListOperationsResponse extends L2 implements O3 {
    private static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 operations_ = L2.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        ListOperationsResponse listOperationsResponse = new ListOperationsResponse();
        DEFAULT_INSTANCE = listOperationsResponse;
        L2.registerDefaultInstance(ListOperationsResponse.class, listOperationsResponse);
    }

    private ListOperationsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOperations(Iterable<? extends Operation> iterable) {
        ensureOperationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.operations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperations(Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperations() {
        this.operations_ = L2.emptyProtobufList();
    }

    private void ensureOperationsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.operations_;
        if (!interfaceC1891d3.isModifiable()) {
            this.operations_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static ListOperationsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOperations(int i9) {
        ensureOperationsIsMutable();
        this.operations_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageToken(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageTokenBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.nextPageToken_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperations(int i9, Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.set(i9, operation);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (i.f23635a[k22.ordinal()]) {
            case 1:
                return new ListOperationsResponse();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", Operation.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ListOperationsResponse.class) {
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

    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    public H getNextPageTokenBytes() {
        return H.copyFromUtf8(this.nextPageToken_);
    }

    public Operation getOperations(int i9) {
        return (Operation) this.operations_.get(i9);
    }

    public int getOperationsCount() {
        return this.operations_.size();
    }

    public List<Operation> getOperationsList() {
        return this.operations_;
    }

    public p getOperationsOrBuilder(int i9) {
        return (p) this.operations_.get(i9);
    }

    public List<? extends p> getOperationsOrBuilderList() {
        return this.operations_;
    }

    public static j newBuilder(ListOperationsResponse listOperationsResponse) {
        return (j) DEFAULT_INSTANCE.createBuilder(listOperationsResponse);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ListOperationsResponse) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ListOperationsResponse parseFrom(H h6) throws C1912g3 {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOperations(int i9, Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(i9, operation);
    }

    public static ListOperationsResponse parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr) throws C1912g3 {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ListOperationsResponse parseFrom(S s5) throws IOException {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ListOperationsResponse parseFrom(S s5, W1 w1) throws IOException {
        return (ListOperationsResponse) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
