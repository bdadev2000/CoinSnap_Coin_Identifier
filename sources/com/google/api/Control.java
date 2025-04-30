package com.google.api;

import a4.AbstractC0345F;
import a4.G;
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
public final class Control extends L2 implements O3 {
    private static final Control DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private String environment_ = "";

    static {
        Control control = new Control();
        DEFAULT_INSTANCE = control;
        L2.registerDefaultInstance(Control.class, control);
    }

    private Control() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnvironment() {
        this.environment_ = getDefaultInstance().getEnvironment();
    }

    public static Control getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static G newBuilder() {
        return (G) DEFAULT_INSTANCE.createBuilder();
    }

    public static Control parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Control) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironment(String str) {
        str.getClass();
        this.environment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironmentBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.environment_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0345F.f3964a[k22.ordinal()]) {
            case 1:
                return new Control();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"environment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Control.class) {
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

    public String getEnvironment() {
        return this.environment_;
    }

    public H getEnvironmentBytes() {
        return H.copyFromUtf8(this.environment_);
    }

    public static G newBuilder(Control control) {
        return (G) DEFAULT_INSTANCE.createBuilder(control);
    }

    public static Control parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Control) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Control parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Control parseFrom(H h6) throws C1912g3 {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Control parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Control parseFrom(byte[] bArr) throws C1912g3 {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Control parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Control parseFrom(InputStream inputStream) throws IOException {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Control parseFrom(S s5) throws IOException {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Control parseFrom(S s5, W1 w1) throws IOException {
        return (Control) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
