package com.google.api;

import a4.AbstractC0351c0;
import a4.C0353d0;
import a4.EnumC0355e0;
import a4.InterfaceC0357f0;
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
public final class JwtLocation extends L2 implements InterfaceC0357f0 {
    private static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private Object in_;
    private int inCase_ = 0;
    private String valuePrefix_ = "";

    static {
        JwtLocation jwtLocation = new JwtLocation();
        DEFAULT_INSTANCE = jwtLocation;
        L2.registerDefaultInstance(JwtLocation.class, jwtLocation);
    }

    private JwtLocation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeader() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIn() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValuePrefix() {
        this.valuePrefix_ = getDefaultInstance().getValuePrefix();
    }

    public static JwtLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0353d0 newBuilder() {
        return (C0353d0) DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(String str) {
        str.getClass();
        this.inCase_ = 1;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.in_ = h6.toStringUtf8();
        this.inCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        str.getClass();
        this.inCase_ = 2;
        this.in_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.in_ = h6.toStringUtf8();
        this.inCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValuePrefix(String str) {
        str.getClass();
        this.valuePrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValuePrefixBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.valuePrefix_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0351c0.f3998a[k22.ordinal()]) {
            case 1:
                return new JwtLocation();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (JwtLocation.class) {
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

    public String getHeader() {
        if (this.inCase_ == 1) {
            return (String) this.in_;
        }
        return "";
    }

    public H getHeaderBytes() {
        String str;
        if (this.inCase_ == 1) {
            str = (String) this.in_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public EnumC0355e0 getInCase() {
        int i9 = this.inCase_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return null;
                }
                return EnumC0355e0.f4001c;
            }
            return EnumC0355e0.b;
        }
        return EnumC0355e0.f4002d;
    }

    public String getQuery() {
        if (this.inCase_ == 2) {
            return (String) this.in_;
        }
        return "";
    }

    public H getQueryBytes() {
        String str;
        if (this.inCase_ == 2) {
            str = (String) this.in_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public String getValuePrefix() {
        return this.valuePrefix_;
    }

    public H getValuePrefixBytes() {
        return H.copyFromUtf8(this.valuePrefix_);
    }

    public static C0353d0 newBuilder(JwtLocation jwtLocation) {
        return (C0353d0) DEFAULT_INSTANCE.createBuilder(jwtLocation);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (JwtLocation) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static JwtLocation parseFrom(H h6) throws C1912g3 {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static JwtLocation parseFrom(H h6, W1 w1) throws C1912g3 {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static JwtLocation parseFrom(byte[] bArr) throws C1912g3 {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtLocation parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static JwtLocation parseFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static JwtLocation parseFrom(S s5) throws IOException {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static JwtLocation parseFrom(S s5, W1 w1) throws IOException {
        return (JwtLocation) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
