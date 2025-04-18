package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.RequiresApi;
import java.time.Instant;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.y;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes2.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp createFromParcel(@NotNull Parcel parcel) {
            p0.a.s(parcel, "source");
            return new Timestamp(parcel.readLong(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp[] newArray(int i2) {
            return new Timestamp[i2];
        }
    };

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d0.k toPreciseTime(Date date) {
            long j2 = 1000;
            long time = date.getTime() / j2;
            int time2 = (int) ((date.getTime() % j2) * 1000000);
            return time2 < 0 ? new d0.k(Long.valueOf(time - 1), Integer.valueOf(time2 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) : new d0.k(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long j2, int i2) {
            if (i2 < 0 || i2 >= 1000000000) {
                throw new IllegalArgumentException(d.i("Timestamp nanoseconds out of range: ", i2).toString());
            }
            if (-62135596800L > j2 || j2 >= 253402300800L) {
                throw new IllegalArgumentException(d.m("Timestamp seconds out of range: ", j2).toString());
            }
        }

        @NotNull
        public final Timestamp now() {
            return new Timestamp(new Date());
        }
    }

    public Timestamp(long j2, int i2) {
        Companion.validateRange(j2, i2);
        this.seconds = j2;
        this.nanoseconds = i2;
    }

    @NotNull
    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0);
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j2 = this.seconds;
        return (((((int) j2) * 1369) + ((int) (j2 >> 32))) * 37) + this.nanoseconds;
    }

    @NotNull
    public final Date toDate() {
        return new Date((this.seconds * 1000) + (this.nanoseconds / 1000000));
    }

    @RequiresApi
    @NotNull
    public final Instant toInstant() {
        Instant ofEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        p0.a.r(ofEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return ofEpochSecond;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.seconds);
        sb.append(", nanoseconds=");
        return d.o(sb, this.nanoseconds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        p0.a.s(parcel, "dest");
        parcel.writeLong(this.seconds);
        parcel.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Timestamp timestamp) {
        p0.a.s(timestamp, "other");
        l[] lVarArr = {new y() { // from class: com.google.firebase.Timestamp$compareTo$1
            @Override // kotlin.jvm.internal.y, x0.l
            @Nullable
            public Object get(@Nullable Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new y() { // from class: com.google.firebase.Timestamp$compareTo$2
            @Override // kotlin.jvm.internal.y, x0.l
            @Nullable
            public Object get(@Nullable Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }};
        for (int i2 = 0; i2 < 2; i2++) {
            l lVar = lVarArr[i2];
            int c2 = q.c((Comparable) lVar.invoke(this), (Comparable) lVar.invoke(timestamp));
            if (c2 != 0) {
                return c2;
            }
        }
        return 0;
    }

    public Timestamp(@NotNull Date date) {
        p0.a.s(date, "date");
        Companion companion = Companion;
        d0.k preciseTime = companion.toPreciseTime(date);
        long longValue = ((Number) preciseTime.f30134a).longValue();
        int intValue = ((Number) preciseTime.f30135b).intValue();
        companion.validateRange(longValue, intValue);
        this.seconds = longValue;
        this.nanoseconds = intValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi
    public Timestamp(@NotNull Instant instant) {
        this(instant.getEpochSecond(), instant.getNano());
        p0.a.s(instant, "time");
    }
}
