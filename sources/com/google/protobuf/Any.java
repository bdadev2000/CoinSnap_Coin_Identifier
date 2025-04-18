package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Any extends o3 implements i {
    private static final Any DEFAULT_INSTANCE;
    private static volatile m6 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private h0 value_ = h0.EMPTY;

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        o3.registerDefaultInstance(Any.class, any);
    }

    private Any() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.typeUrl_ = h0Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(h0 h0Var) {
        h0Var.getClass();
        this.value_ = h0Var;
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        g gVar = null;
        switch (g.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new Any();
            case 2:
                return new h(gVar);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (Any.class) {
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

    @Override // com.google.protobuf.i
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.protobuf.i
    public h0 getTypeUrlBytes() {
        return h0.copyFromUtf8(this.typeUrl_);
    }

    @Override // com.google.protobuf.i
    public h0 getValue() {
        return this.value_;
    }

    public static h newBuilder(Any any) {
        return (h) DEFAULT_INSTANCE.createBuilder(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Any) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Any parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static Any parseFrom(h0 h0Var) throws h4 {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static Any parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static Any parseFrom(byte[] bArr) throws h4 {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Any parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static Any parseFrom(r0 r0Var) throws IOException {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static Any parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (Any) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
