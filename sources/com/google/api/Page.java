package com.google.api;

import a4.N0;
import a4.O0;
import a4.P0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Page extends L2 implements P0 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String name_ = "";
    private String content_ = "";
    private InterfaceC1891d3 subpages_ = L2.emptyProtobufList();

    static {
        Page page = new Page();
        DEFAULT_INSTANCE = page;
        L2.registerDefaultInstance(Page.class, page);
    }

    private Page() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubpages(Iterable<? extends Page> iterable) {
        ensureSubpagesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.subpages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpages(Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubpages() {
        this.subpages_ = L2.emptyProtobufList();
    }

    private void ensureSubpagesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.subpages_;
        if (!interfaceC1891d3.isModifiable()) {
            this.subpages_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static O0 newBuilder() {
        return (O0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Page parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Page) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubpages(int i9) {
        ensureSubpagesIsMutable();
        this.subpages_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.content_ = h6.toStringUtf8();
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
    public void setSubpages(int i9, Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.set(i9, page);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (N0.f3973a[k22.ordinal()]) {
            case 1:
                return new Page();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Page.class) {
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

    public String getContent() {
        return this.content_;
    }

    public H getContentBytes() {
        return H.copyFromUtf8(this.content_);
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public Page getSubpages(int i9) {
        return (Page) this.subpages_.get(i9);
    }

    public int getSubpagesCount() {
        return this.subpages_.size();
    }

    public List<Page> getSubpagesList() {
        return this.subpages_;
    }

    public P0 getSubpagesOrBuilder(int i9) {
        return (P0) this.subpages_.get(i9);
    }

    public List<? extends P0> getSubpagesOrBuilderList() {
        return this.subpages_;
    }

    public static O0 newBuilder(Page page) {
        return (O0) DEFAULT_INSTANCE.createBuilder(page);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Page) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Page parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Page parseFrom(H h6) throws C1912g3 {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpages(int i9, Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(i9, page);
    }

    public static Page parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Page parseFrom(byte[] bArr) throws C1912g3 {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Page parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Page parseFrom(InputStream inputStream) throws IOException {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Page parseFrom(S s5) throws IOException {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Page parseFrom(S s5, W1 w1) throws IOException {
        return (Page) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
