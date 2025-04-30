package com.google.api;

import a4.I;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class CustomHttpPattern extends L2 implements O3 {
    private static final CustomHttpPattern DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    static {
        CustomHttpPattern customHttpPattern = new CustomHttpPattern();
        DEFAULT_INSTANCE = customHttpPattern;
        L2.registerDefaultInstance(CustomHttpPattern.class, customHttpPattern);
    }

    private CustomHttpPattern() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static CustomHttpPattern getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static I newBuilder() {
        return (I) DEFAULT_INSTANCE.createBuilder();
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CustomHttpPattern) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(String str) {
        str.getClass();
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.kind_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.path_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (a4.H.f3966a[k22.ordinal()]) {
            case 1:
                return new CustomHttpPattern();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (CustomHttpPattern.class) {
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

    public String getKind() {
        return this.kind_;
    }

    public H getKindBytes() {
        return H.copyFromUtf8(this.kind_);
    }

    public String getPath() {
        return this.path_;
    }

    public H getPathBytes() {
        return H.copyFromUtf8(this.path_);
    }

    public static I newBuilder(CustomHttpPattern customHttpPattern) {
        return (I) DEFAULT_INSTANCE.createBuilder(customHttpPattern);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (CustomHttpPattern) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static CustomHttpPattern parseFrom(H h6) throws C1912g3 {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static CustomHttpPattern parseFrom(H h6, W1 w1) throws C1912g3 {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static CustomHttpPattern parseFrom(byte[] bArr) throws C1912g3 {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CustomHttpPattern parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream) throws IOException {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static CustomHttpPattern parseFrom(S s5) throws IOException {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static CustomHttpPattern parseFrom(S s5, W1 w1) throws IOException {
        return (CustomHttpPattern) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
