package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class SourceContext extends o3 implements o7 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile m6 PARSER;
    private String fileName_ = "";

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        o3.registerDefaultInstance(SourceContext.class, sourceContext);
    }

    private SourceContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n7 newBuilder() {
        return (n7) DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceContext) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) throws h4 {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m6 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(h0 h0Var) {
        c.checkByteStringIsUtf8(h0Var);
        this.fileName_ = h0Var.toStringUtf8();
    }

    @Override // com.google.protobuf.o3
    public final Object dynamicMethod(n3 n3Var, Object obj, Object obj2) {
        m7 m7Var = null;
        switch (m7.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[n3Var.ordinal()]) {
            case 1:
                return new SourceContext();
            case 2:
                return new n7(m7Var);
            case 3:
                return o3.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m6 m6Var = PARSER;
                if (m6Var == null) {
                    synchronized (SourceContext.class) {
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

    @Override // com.google.protobuf.o7
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.google.protobuf.o7
    public h0 getFileNameBytes() {
        return h0.copyFromUtf8(this.fileName_);
    }

    public static n7 newBuilder(SourceContext sourceContext) {
        return (n7) DEFAULT_INSTANCE.createBuilder(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (SourceContext) o3.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, a2 a2Var) throws h4 {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, byteBuffer, a2Var);
    }

    public static SourceContext parseFrom(h0 h0Var) throws h4 {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, h0Var);
    }

    public static SourceContext parseFrom(h0 h0Var, a2 a2Var) throws h4 {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, h0Var, a2Var);
    }

    public static SourceContext parseFrom(byte[] bArr) throws h4 {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceContext parseFrom(byte[] bArr, a2 a2Var) throws h4 {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, bArr, a2Var);
    }

    public static SourceContext parseFrom(InputStream inputStream) throws IOException {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, a2 a2Var) throws IOException {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, inputStream, a2Var);
    }

    public static SourceContext parseFrom(r0 r0Var) throws IOException {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, r0Var);
    }

    public static SourceContext parseFrom(r0 r0Var, a2 a2Var) throws IOException {
        return (SourceContext) o3.parseFrom(DEFAULT_INSTANCE, r0Var, a2Var);
    }
}
