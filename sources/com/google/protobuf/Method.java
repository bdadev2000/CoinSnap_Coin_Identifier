package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class Method extends L2 implements V3 {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private InterfaceC1891d3 options_ = L2.emptyProtobufList();

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        L2.registerDefaultInstance(Method.class, method);
    }

    private Method() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.options_;
        if (!interfaceC1891d3.isModifiable()) {
            this.options_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static U3 newBuilder() {
        return (U3) DEFAULT_INSTANCE.createBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i9) {
        ensureOptionsIsMutable();
        this.options_.remove(i9);
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
    public void setOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i9, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestStreaming(boolean z8) {
        this.requestStreaming_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrlBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.requestTypeUrl_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStreaming(boolean z8) {
        this.responseStreaming_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrlBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.responseTypeUrl_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(Z4 z42) {
        this.syntax_ = z42.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i9) {
        this.syntax_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        T3 t32 = null;
        switch (T3.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new Method();
            case 2:
                return new U3(t32);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Method.class) {
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

    @Override // com.google.protobuf.V3
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.V3
    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.V3
    public Option getOptions(int i9) {
        return (Option) this.options_.get(i9);
    }

    @Override // com.google.protobuf.V3
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.V3
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public InterfaceC1941k4 getOptionsOrBuilder(int i9) {
        return (InterfaceC1941k4) this.options_.get(i9);
    }

    public List<? extends InterfaceC1941k4> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.V3
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // com.google.protobuf.V3
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // com.google.protobuf.V3
    public H getRequestTypeUrlBytes() {
        return H.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override // com.google.protobuf.V3
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // com.google.protobuf.V3
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // com.google.protobuf.V3
    public H getResponseTypeUrlBytes() {
        return H.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override // com.google.protobuf.V3
    public Z4 getSyntax() {
        Z4 forNumber = Z4.forNumber(this.syntax_);
        if (forNumber == null) {
            return Z4.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.V3
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static U3 newBuilder(Method method) {
        return (U3) DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Method) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Method parseFrom(H h6) throws C1912g3 {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i9, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i9, option);
    }

    public static Method parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Method parseFrom(byte[] bArr) throws C1912g3 {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Method parseFrom(S s5) throws IOException {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Method parseFrom(S s5, W1 w1) throws IOException {
        return (Method) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
