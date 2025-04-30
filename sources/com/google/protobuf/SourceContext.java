package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class SourceContext extends L2 implements N4 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private String fileName_ = "";

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        L2.registerDefaultInstance(SourceContext.class, sourceContext);
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

    public static M4 newBuilder() {
        return (M4) DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceContext) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.fileName_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        L4 l42 = null;
        switch (L4.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k22.ordinal()]) {
            case 1:
                return new SourceContext();
            case 2:
                return new M4(l42);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (SourceContext.class) {
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

    @Override // com.google.protobuf.N4
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.google.protobuf.N4
    public H getFileNameBytes() {
        return H.copyFromUtf8(this.fileName_);
    }

    public static M4 newBuilder(SourceContext sourceContext) {
        return (M4) DEFAULT_INSTANCE.createBuilder(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SourceContext) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static SourceContext parseFrom(H h6) throws C1912g3 {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static SourceContext parseFrom(H h6, W1 w1) throws C1912g3 {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static SourceContext parseFrom(byte[] bArr) throws C1912g3 {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceContext parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static SourceContext parseFrom(InputStream inputStream) throws IOException {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static SourceContext parseFrom(S s5) throws IOException {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static SourceContext parseFrom(S s5, W1 w1) throws IOException {
        return (SourceContext) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
