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
import y5.j;
import y5.k;

/* loaded from: classes3.dex */
public final class Fraction extends L2 implements O3 {
    private static final Fraction DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private long denominator_;
    private long numerator_;

    static {
        Fraction fraction = new Fraction();
        DEFAULT_INSTANCE = fraction;
        L2.registerDefaultInstance(Fraction.class, fraction);
    }

    private Fraction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDenominator() {
        this.denominator_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumerator() {
        this.numerator_ = 0L;
    }

    public static Fraction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Fraction) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDenominator(long j7) {
        this.denominator_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumerator(long j7) {
        this.numerator_ = j7;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (j.f24439a[k22.ordinal()]) {
            case 1:
                return new Fraction();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Fraction.class) {
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

    public long getDenominator() {
        return this.denominator_;
    }

    public long getNumerator() {
        return this.numerator_;
    }

    public static k newBuilder(Fraction fraction) {
        return (k) DEFAULT_INSTANCE.createBuilder(fraction);
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Fraction) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Fraction parseFrom(H h6) throws C1912g3 {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static Fraction parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Fraction parseFrom(byte[] bArr) throws C1912g3 {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Fraction parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Fraction parseFrom(InputStream inputStream) throws IOException {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Fraction parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Fraction parseFrom(S s5) throws IOException {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Fraction parseFrom(S s5, W1 w1) throws IOException {
        return (Fraction) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
