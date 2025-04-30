package com.google.rpc;

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
import w5.i;

/* loaded from: classes3.dex */
public final class Help extends L2 implements O3 {
    private static final Help DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 links_ = L2.emptyProtobufList();

    /* loaded from: classes3.dex */
    public static final class Link extends L2 implements i {
        private static final Link DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        static {
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            L2.registerDefaultInstance(Link.class, link);
        }

        private Link() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static d newBuilder() {
            return (d) DEFAULT_INSTANCE.createBuilder();
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Link) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.description_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.url_ = h6.toStringUtf8();
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (w5.h.f23986a[k22.ordinal()]) {
                case 1:
                    return new Link();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Link.class) {
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

        public String getDescription() {
            return this.description_;
        }

        public H getDescriptionBytes() {
            return H.copyFromUtf8(this.description_);
        }

        public String getUrl() {
            return this.url_;
        }

        public H getUrlBytes() {
            return H.copyFromUtf8(this.url_);
        }

        public static d newBuilder(Link link) {
            return (d) DEFAULT_INSTANCE.createBuilder(link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Link) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Link parseFrom(H h6) throws C1912g3 {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Link parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Link parseFrom(byte[] bArr) throws C1912g3 {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Link parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Link parseFrom(S s5) throws IOException {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Link parseFrom(S s5, W1 w1) throws IOException {
            return (Link) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        Help help = new Help();
        DEFAULT_INSTANCE = help;
        L2.registerDefaultInstance(Help.class, help);
    }

    private Help() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends Link> iterable) {
        ensureLinksIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = L2.emptyProtobufList();
    }

    private void ensureLinksIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.links_;
        if (!interfaceC1891d3.isModifiable()) {
            this.links_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Help getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static Help parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Help) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLinks(int i9) {
        ensureLinksIsMutable();
        this.links_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinks(int i9, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.set(i9, link);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (w5.h.f23986a[k22.ordinal()]) {
            case 1:
                return new Help();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"links_", Link.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Help.class) {
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

    public Link getLinks(int i9) {
        return (Link) this.links_.get(i9);
    }

    public int getLinksCount() {
        return this.links_.size();
    }

    public List<Link> getLinksList() {
        return this.links_;
    }

    public i getLinksOrBuilder(int i9) {
        return (i) this.links_.get(i9);
    }

    public List<? extends i> getLinksOrBuilderList() {
        return this.links_;
    }

    public static c newBuilder(Help help) {
        return (c) DEFAULT_INSTANCE.createBuilder(help);
    }

    public static Help parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Help) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Help parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Help parseFrom(H h6) throws C1912g3 {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(int i9, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(i9, link);
    }

    public static Help parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Help parseFrom(byte[] bArr) throws C1912g3 {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Help parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Help parseFrom(InputStream inputStream) throws IOException {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Help parseFrom(S s5) throws IOException {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Help parseFrom(S s5, W1 w1) throws IOException {
        return (Help) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
