package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Method extends o3 implements w5 {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile m6 PARSER = null;
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
    private e4 options_ = o3.emptyProtobufList();

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        o3.registerDefaultInstance(Method.class, method);
    }

    private Method() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        c.addAll((Iterable) iterable, (List) this.options_);
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
        this.options_ = o3.emptyProtobufList();
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
        e4 e4Var = this.options_;
        if (!e4Var.isModifiable()) {
            this.options_ = o3.mutableCopy(e4Var);
        }
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v5 newBuilder() {
        return (v5) DEFAULT_INSTANCE.createBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i10) {
        ensureOptionsIsMutable();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.name_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestStreaming(boolean z10) {
        this.requestStreaming_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrlBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.requestTypeUrl_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStreaming(boolean z10) {
        this.responseStreaming_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrlBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.responseTypeUrl_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(a8 a8Var) {
        this.syntax_ = a8Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i10) {
        this.syntax_ = i10;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        u5 u5Var = null;
        switch (u5.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Method();
            case 2:
                return new v5(u5Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Method.class) {
                        m6Var = PARSER;
                        if (m6Var == null) {
                            m6Var = new i3(DEFAULT_INSTANCE);
                            PARSER = m6Var;
                        }
                    }
                }
                return m6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.w5
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.w5
    public h0 getNameBytes() {
        return h0.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.w5
    public Option getOptions(int i10) {
        return (Option) this.options_.get(i10);
    }

    @Override // com.google.protobuf.w5
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.w5
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public l6 getOptionsOrBuilder(int i10) {
        return (l6) this.options_.get(i10);
    }

    public List<? extends l6> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.w5
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // com.google.protobuf.w5
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // com.google.protobuf.w5
    public h0 getRequestTypeUrlBytes() {
        return h0.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override // com.google.protobuf.w5
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // com.google.protobuf.w5
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // com.google.protobuf.w5
    public h0 getResponseTypeUrlBytes() {
        return h0.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override // com.google.protobuf.w5
    public a8 getSyntax() {
        a8 forNumber = a8.forNumber(this.syntax_);
        if (forNumber == null) {
            return a8.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.google.protobuf.w5
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static v5 newBuilder(Method method) {
        return (v5) DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Method) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Method parseFrom(h0 h0Var) throws h4 {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i10, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i10, option);
    }

    public static Method parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Method parseFrom(byte[] bArr) throws h4 {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Method parseFrom(r0 r0Var) throws IOException {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Method parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Method) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
