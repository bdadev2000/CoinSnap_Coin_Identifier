package com.google.api;

import a4.L;
import a4.M;
import a4.P;
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
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Documentation extends L2 implements O3 {
    private static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String summary_ = "";
    private InterfaceC1891d3 pages_ = L2.emptyProtobufList();
    private InterfaceC1891d3 rules_ = L2.emptyProtobufList();
    private String documentationRootUrl_ = "";
    private String overview_ = "";

    static {
        Documentation documentation = new Documentation();
        DEFAULT_INSTANCE = documentation;
        L2.registerDefaultInstance(Documentation.class, documentation);
    }

    private Documentation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPages(Iterable<? extends Page> iterable) {
        ensurePagesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends DocumentationRule> iterable) {
        ensureRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(documentationRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = getDefaultInstance().getDocumentationRootUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverview() {
        this.overview_ = getDefaultInstance().getOverview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = getDefaultInstance().getSummary();
    }

    private void ensurePagesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.pages_;
        if (!interfaceC1891d3.isModifiable()) {
            this.pages_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureRulesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.rules_;
        if (!interfaceC1891d3.isModifiable()) {
            this.rules_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static M newBuilder() {
        return (M) DEFAULT_INSTANCE.createBuilder();
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Documentation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePages(int i9) {
        ensurePagesIsMutable();
        this.pages_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i9) {
        ensureRulesIsMutable();
        this.rules_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentationRootUrl(String str) {
        str.getClass();
        this.documentationRootUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentationRootUrlBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.documentationRootUrl_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverview(String str) {
        str.getClass();
        this.overview_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverviewBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.overview_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPages(int i9, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i9, page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i9, DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i9, documentationRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummary(String str) {
        str.getClass();
        this.summary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummaryBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.summary_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (L.f3970a[k22.ordinal()]) {
            case 1:
                return new Documentation();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", DocumentationRule.class, "documentationRootUrl_", "pages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Documentation.class) {
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

    public String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    public H getDocumentationRootUrlBytes() {
        return H.copyFromUtf8(this.documentationRootUrl_);
    }

    public String getOverview() {
        return this.overview_;
    }

    public H getOverviewBytes() {
        return H.copyFromUtf8(this.overview_);
    }

    public Page getPages(int i9) {
        return (Page) this.pages_.get(i9);
    }

    public int getPagesCount() {
        return this.pages_.size();
    }

    public List<Page> getPagesList() {
        return this.pages_;
    }

    public P0 getPagesOrBuilder(int i9) {
        return (P0) this.pages_.get(i9);
    }

    public List<? extends P0> getPagesOrBuilderList() {
        return this.pages_;
    }

    public DocumentationRule getRules(int i9) {
        return (DocumentationRule) this.rules_.get(i9);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<DocumentationRule> getRulesList() {
        return this.rules_;
    }

    public P getRulesOrBuilder(int i9) {
        return (P) this.rules_.get(i9);
    }

    public List<? extends P> getRulesOrBuilderList() {
        return this.rules_;
    }

    public String getSummary() {
        return this.summary_;
    }

    public H getSummaryBytes() {
        return H.copyFromUtf8(this.summary_);
    }

    public static M newBuilder(Documentation documentation) {
        return (M) DEFAULT_INSTANCE.createBuilder(documentation);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Documentation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Documentation parseFrom(H h6) throws C1912g3 {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(int i9, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i9, page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i9, DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i9, documentationRule);
    }

    public static Documentation parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Documentation parseFrom(byte[] bArr) throws C1912g3 {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Documentation parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Documentation parseFrom(InputStream inputStream) throws IOException {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Documentation parseFrom(S s5) throws IOException {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Documentation parseFrom(S s5, W1 w1) throws IOException {
        return (Documentation) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
