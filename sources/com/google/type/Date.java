package com.google.type;

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
import y5.c;
import y5.d;

/* loaded from: classes3.dex */
public final class Date extends L2 implements O3 {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Date DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    static {
        Date date = new Date();
        DEFAULT_INSTANCE = date;
        L2.registerDefaultInstance(Date.class, date);
    }

    private Date() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonth() {
        this.month_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    public static Date getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static Date parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Date) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Date parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i9) {
        this.day_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonth(int i9) {
        this.month_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(int i9) {
        this.year_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (c.f24433a[k22.ordinal()]) {
            case 1:
                return new Date();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"year_", "month_", "day_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Date.class) {
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

    public int getDay() {
        return this.day_;
    }

    public int getMonth() {
        return this.month_;
    }

    public int getYear() {
        return this.year_;
    }

    public static d newBuilder(Date date) {
        return (d) DEFAULT_INSTANCE.createBuilder(date);
    }

    public static Date parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Date) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Date parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Date parseFrom(H h6) throws C1912g3 {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Date parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Date parseFrom(byte[] bArr) throws C1912g3 {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Date parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Date parseFrom(InputStream inputStream) throws IOException {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Date parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Date parseFrom(S s5) throws IOException {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Date parseFrom(S s5, W1 w1) throws IOException {
        return (Date) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
