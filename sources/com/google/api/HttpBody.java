package com.google.api;

import a4.W;
import a4.X;
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

/* loaded from: classes2.dex */
public final class HttpBody extends L2 implements O3 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final HttpBody DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER;
    private String contentType_ = "";
    private H data_ = H.EMPTY;
    private InterfaceC1891d3 extensions_ = L2.emptyProtobufList();

    static {
        HttpBody httpBody = new HttpBody();
        DEFAULT_INSTANCE = httpBody;
        L2.registerDefaultInstance(HttpBody.class, httpBody);
    }

    private HttpBody() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensions(Iterable<? extends Any> iterable) {
        ensureExtensionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.extensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensions(Any any) {
        any.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = getDefaultInstance().getContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensions() {
        this.extensions_ = L2.emptyProtobufList();
    }

    private void ensureExtensionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.extensions_;
        if (!interfaceC1891d3.isModifiable()) {
            this.extensions_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static HttpBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static X newBuilder() {
        return (X) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpBody) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtensions(int i9) {
        ensureExtensionsIsMutable();
        this.extensions_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentType(String str) {
        str.getClass();
        this.contentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.contentType_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(H h6) {
        h6.getClass();
        this.data_ = h6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensions(int i9, Any any) {
        any.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.set(i9, any);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (W.f3985a[k22.ordinal()]) {
            case 1:
                return new HttpBody();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (HttpBody.class) {
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

    public String getContentType() {
        return this.contentType_;
    }

    public H getContentTypeBytes() {
        return H.copyFromUtf8(this.contentType_);
    }

    public H getData() {
        return this.data_;
    }

    public Any getExtensions(int i9) {
        return (Any) this.extensions_.get(i9);
    }

    public int getExtensionsCount() {
        return this.extensions_.size();
    }

    public List<Any> getExtensionsList() {
        return this.extensions_;
    }

    public InterfaceC1922i getExtensionsOrBuilder(int i9) {
        return (InterfaceC1922i) this.extensions_.get(i9);
    }

    public List<? extends InterfaceC1922i> getExtensionsOrBuilderList() {
        return this.extensions_;
    }

    public static X newBuilder(HttpBody httpBody) {
        return (X) DEFAULT_INSTANCE.createBuilder(httpBody);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (HttpBody) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static HttpBody parseFrom(H h6) throws C1912g3 {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensions(int i9, Any any) {
        any.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(i9, any);
    }

    public static HttpBody parseFrom(H h6, W1 w1) throws C1912g3 {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static HttpBody parseFrom(byte[] bArr) throws C1912g3 {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpBody parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static HttpBody parseFrom(InputStream inputStream) throws IOException {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static HttpBody parseFrom(S s5) throws IOException {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static HttpBody parseFrom(S s5, W1 w1) throws IOException {
        return (HttpBody) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
