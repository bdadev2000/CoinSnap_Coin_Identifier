package com.google.api;

import a4.N;
import a4.O;
import a4.P;
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
public final class DocumentationRule extends L2 implements P {
    private static final DocumentationRule DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private String description_ = "";
    private String deprecationDescription_ = "";

    static {
        DocumentationRule documentationRule = new DocumentationRule();
        DEFAULT_INSTANCE = documentationRule;
        L2.registerDefaultInstance(DocumentationRule.class, documentationRule);
    }

    private DocumentationRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecationDescription() {
        this.deprecationDescription_ = getDefaultInstance().getDeprecationDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static DocumentationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static O newBuilder() {
        return (O) DEFAULT_INSTANCE.createBuilder();
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationDescription(String str) {
        str.getClass();
        this.deprecationDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationDescriptionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.deprecationDescription_ = h6.toStringUtf8();
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
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.selector_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (N.f3972a[k22.ordinal()]) {
            case 1:
                return new DocumentationRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"selector_", "description_", "deprecationDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DocumentationRule.class) {
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

    public String getDeprecationDescription() {
        return this.deprecationDescription_;
    }

    public H getDeprecationDescriptionBytes() {
        return H.copyFromUtf8(this.deprecationDescription_);
    }

    public String getDescription() {
        return this.description_;
    }

    public H getDescriptionBytes() {
        return H.copyFromUtf8(this.description_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public static O newBuilder(DocumentationRule documentationRule) {
        return (O) DEFAULT_INSTANCE.createBuilder(documentationRule);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DocumentationRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DocumentationRule parseFrom(H h6) throws C1912g3 {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DocumentationRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DocumentationRule parseFrom(byte[] bArr) throws C1912g3 {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DocumentationRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DocumentationRule parseFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentationRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DocumentationRule parseFrom(S s5) throws IOException {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DocumentationRule parseFrom(S s5, W1 w1) throws IOException {
        return (DocumentationRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
