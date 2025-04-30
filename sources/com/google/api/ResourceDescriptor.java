package com.google.api;

import a4.c1;
import a4.d1;
import a4.e1;
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
public final class ResourceDescriptor extends L2 implements O3 {
    private static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String type_ = "";
    private InterfaceC1891d3 pattern_ = L2.emptyProtobufList();
    private String nameField_ = "";
    private String plural_ = "";
    private String singular_ = "";

    static {
        ResourceDescriptor resourceDescriptor = new ResourceDescriptor();
        DEFAULT_INSTANCE = resourceDescriptor;
        L2.registerDefaultInstance(ResourceDescriptor.class, resourceDescriptor);
    }

    private ResourceDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPattern(Iterable<String> iterable) {
        ensurePatternIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.pattern_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPattern(String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPatternBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensurePatternIsMutable();
        this.pattern_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameField() {
        this.nameField_ = getDefaultInstance().getNameField();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.pattern_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlural() {
        this.plural_ = getDefaultInstance().getPlural();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSingular() {
        this.singular_ = getDefaultInstance().getSingular();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensurePatternIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.pattern_;
        if (!interfaceC1891d3.isModifiable()) {
            this.pattern_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static ResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d1 newBuilder() {
        return (d1) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(e1 e1Var) {
        this.history_ = e1Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoryValue(int i9) {
        this.history_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameField(String str) {
        str.getClass();
        this.nameField_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameFieldBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.nameField_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPattern(int i9, String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlural(String str) {
        str.getClass();
        this.plural_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPluralBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.plural_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingular(String str) {
        str.getClass();
        this.singular_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingularBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.singular_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.type_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (c1.f3999a[k22.ordinal()]) {
            case 1:
                return new ResourceDescriptor();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ResourceDescriptor.class) {
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

    public e1 getHistory() {
        e1 e1Var;
        int i9 = this.history_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    e1Var = null;
                } else {
                    e1Var = e1.FUTURE_MULTI_PATTERN;
                }
            } else {
                e1Var = e1.ORIGINALLY_SINGLE_PATTERN;
            }
        } else {
            e1Var = e1.HISTORY_UNSPECIFIED;
        }
        if (e1Var == null) {
            return e1.UNRECOGNIZED;
        }
        return e1Var;
    }

    public int getHistoryValue() {
        return this.history_;
    }

    public String getNameField() {
        return this.nameField_;
    }

    public H getNameFieldBytes() {
        return H.copyFromUtf8(this.nameField_);
    }

    public String getPattern(int i9) {
        return (String) this.pattern_.get(i9);
    }

    public H getPatternBytes(int i9) {
        return H.copyFromUtf8((String) this.pattern_.get(i9));
    }

    public int getPatternCount() {
        return this.pattern_.size();
    }

    public List<String> getPatternList() {
        return this.pattern_;
    }

    public String getPlural() {
        return this.plural_;
    }

    public H getPluralBytes() {
        return H.copyFromUtf8(this.plural_);
    }

    public String getSingular() {
        return this.singular_;
    }

    public H getSingularBytes() {
        return H.copyFromUtf8(this.singular_);
    }

    public String getType() {
        return this.type_;
    }

    public H getTypeBytes() {
        return H.copyFromUtf8(this.type_);
    }

    public static d1 newBuilder(ResourceDescriptor resourceDescriptor) {
        return (d1) DEFAULT_INSTANCE.createBuilder(resourceDescriptor);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ResourceDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ResourceDescriptor parseFrom(H h6) throws C1912g3 {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static ResourceDescriptor parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr) throws C1912g3 {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ResourceDescriptor parseFrom(S s5) throws IOException {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ResourceDescriptor parseFrom(S s5, W1 w1) throws IOException {
        return (ResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
