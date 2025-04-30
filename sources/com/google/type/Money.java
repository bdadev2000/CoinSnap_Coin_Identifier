package com.google.type;

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
import y5.n;
import y5.o;

/* loaded from: classes3.dex */
public final class Money extends L2 implements O3 {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final Money DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    static {
        Money money = new Money();
        DEFAULT_INSTANCE = money;
        L2.registerDefaultInstance(Money.class, money);
    }

    private Money() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrencyCode() {
        this.currencyCode_ = getDefaultInstance().getCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnits() {
        this.units_ = 0L;
    }

    public static Money getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static Money parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Money) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Money parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCode(String str) {
        str.getClass();
        this.currencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCodeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.currencyCode_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i9) {
        this.nanos_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnits(long j7) {
        this.units_ = j7;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (n.f24441a[k22.ordinal()]) {
            case 1:
                return new Money();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"currencyCode_", "units_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Money.class) {
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

    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    public H getCurrencyCodeBytes() {
        return H.copyFromUtf8(this.currencyCode_);
    }

    public int getNanos() {
        return this.nanos_;
    }

    public long getUnits() {
        return this.units_;
    }

    public static o newBuilder(Money money) {
        return (o) DEFAULT_INSTANCE.createBuilder(money);
    }

    public static Money parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Money) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Money parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Money parseFrom(H h6) throws C1912g3 {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Money parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Money parseFrom(byte[] bArr) throws C1912g3 {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Money parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Money parseFrom(InputStream inputStream) throws IOException {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Money parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Money parseFrom(S s5) throws IOException {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Money parseFrom(S s5, W1 w1) throws IOException {
        return (Money) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
