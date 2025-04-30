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
import y5.t;
import y5.u;

/* loaded from: classes3.dex */
public final class TimeOfDay extends L2 implements O3 {
    private static final TimeOfDay DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    static {
        TimeOfDay timeOfDay = new TimeOfDay();
        DEFAULT_INSTANCE = timeOfDay;
        L2.registerDefaultInstance(TimeOfDay.class, timeOfDay);
    }

    private TimeOfDay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinutes() {
        this.minutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    public static TimeOfDay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimeOfDay) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(int i9) {
        this.hours_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinutes(int i9) {
        this.minutes_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i9) {
        this.nanos_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(int i9) {
        this.seconds_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (t.f24444a[k22.ordinal()]) {
            case 1:
                return new TimeOfDay();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"hours_", "minutes_", "seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (TimeOfDay.class) {
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

    public int getHours() {
        return this.hours_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public static u newBuilder(TimeOfDay timeOfDay) {
        return (u) DEFAULT_INSTANCE.createBuilder(timeOfDay);
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TimeOfDay) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static TimeOfDay parseFrom(H h6) throws C1912g3 {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static TimeOfDay parseFrom(H h6, W1 w1) throws C1912g3 {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static TimeOfDay parseFrom(byte[] bArr) throws C1912g3 {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TimeOfDay parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static TimeOfDay parseFrom(InputStream inputStream) throws IOException {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeOfDay parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TimeOfDay parseFrom(S s5) throws IOException {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static TimeOfDay parseFrom(S s5, W1 w1) throws IOException {
        return (TimeOfDay) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
