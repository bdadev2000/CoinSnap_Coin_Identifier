package com.google.api;

import a4.AbstractC0346a;
import a4.C0348b;
import a4.InterfaceC0350c;
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
public final class Advice extends L2 implements InterfaceC0350c {
    private static final Advice DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER;
    private String description_ = "";

    static {
        Advice advice = new Advice();
        DEFAULT_INSTANCE = advice;
        L2.registerDefaultInstance(Advice.class, advice);
    }

    private Advice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    public static Advice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0348b newBuilder() {
        return (C0348b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Advice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Advice) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Advice parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0346a.f3989a[k22.ordinal()]) {
            case 1:
                return new Advice();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Advice.class) {
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

    public static C0348b newBuilder(Advice advice) {
        return (C0348b) DEFAULT_INSTANCE.createBuilder(advice);
    }

    public static Advice parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Advice) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Advice parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Advice parseFrom(H h6) throws C1912g3 {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Advice parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Advice parseFrom(byte[] bArr) throws C1912g3 {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Advice parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Advice parseFrom(InputStream inputStream) throws IOException {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Advice parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Advice parseFrom(S s5) throws IOException {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Advice parseFrom(S s5, W1 w1) throws IOException {
        return (Advice) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
