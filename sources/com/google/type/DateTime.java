package com.google.type;

import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.Duration;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.H1;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import y5.e;
import y5.f;
import y5.g;
import y5.w;

/* loaded from: classes3.dex */
public final class DateTime extends L2 implements O3 {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    static {
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        L2.registerDefaultInstance(DateTime.class, dateTime);
    }

    private DateTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
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
    public void clearMonth() {
        this.month_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        if (this.timeOffsetCase_ == 9 && this.timeOffset_ != TimeZone.getDefaultInstance()) {
            this.timeOffset_ = ((w) TimeZone.newBuilder((TimeZone) this.timeOffset_).mergeFrom((L2) timeZone)).buildPartial();
        } else {
            this.timeOffset_ = timeZone;
        }
        this.timeOffsetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUtcOffset(Duration duration) {
        duration.getClass();
        if (this.timeOffsetCase_ == 8 && this.timeOffset_ != Duration.getDefaultInstance()) {
            this.timeOffset_ = ((H1) Duration.newBuilder((Duration) this.timeOffset_).mergeFrom((L2) duration)).buildPartial();
        } else {
            this.timeOffset_ = duration;
        }
        this.timeOffsetCase_ = 8;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTime) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i9) {
        this.day_ = i9;
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
    public void setMonth(int i9) {
        this.month_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i9) {
        this.nanos_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(int i9) {
        this.seconds_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        this.timeOffset_ = timeZone;
        this.timeOffsetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtcOffset(Duration duration) {
        duration.getClass();
        this.timeOffset_ = duration;
        this.timeOffsetCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(int i9) {
        this.year_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (e.f24434a[k22.ordinal()]) {
            case 1:
                return new DateTime();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (DateTime.class) {
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

    public int getHours() {
        return this.hours_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getMonth() {
        return this.month_;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public g getTimeOffsetCase() {
        int i9 = this.timeOffsetCase_;
        if (i9 != 0) {
            if (i9 != 8) {
                if (i9 != 9) {
                    return null;
                }
                return g.f24435c;
            }
            return g.b;
        }
        return g.f24436d;
    }

    public TimeZone getTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            return (TimeZone) this.timeOffset_;
        }
        return TimeZone.getDefaultInstance();
    }

    public Duration getUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            return (Duration) this.timeOffset_;
        }
        return Duration.getDefaultInstance();
    }

    public int getYear() {
        return this.year_;
    }

    public boolean hasTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            return true;
        }
        return false;
    }

    public boolean hasUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            return true;
        }
        return false;
    }

    public static f newBuilder(DateTime dateTime) {
        return (f) DEFAULT_INSTANCE.createBuilder(dateTime);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DateTime) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static DateTime parseFrom(H h6) throws C1912g3 {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static DateTime parseFrom(H h6, W1 w1) throws C1912g3 {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static DateTime parseFrom(byte[] bArr) throws C1912g3 {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DateTime parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static DateTime parseFrom(S s5) throws IOException {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static DateTime parseFrom(S s5, W1 w1) throws IOException {
        return (DateTime) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
