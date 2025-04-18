package androidx.compose.material3.internal;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CalendarMonth {

    /* renamed from: a, reason: collision with root package name */
    public final int f12947a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12949c;
    public final int d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12950f;

    public CalendarMonth(int i2, int i3, int i4, long j2, int i5) {
        this.f12947a = i2;
        this.f12948b = i3;
        this.f12949c = i4;
        this.d = i5;
        this.e = j2;
        this.f12950f = ((i4 * 86400000) + j2) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.f12947a == calendarMonth.f12947a && this.f12948b == calendarMonth.f12948b && this.f12949c == calendarMonth.f12949c && this.d == calendarMonth.d && this.e == calendarMonth.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + d.c(this.d, d.c(this.f12949c, d.c(this.f12948b, Integer.hashCode(this.f12947a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.f12947a + ", month=" + this.f12948b + ", numberOfDays=" + this.f12949c + ", daysFromStartOfWeekToFirstOfMonth=" + this.d + ", startUtcTimeMillis=" + this.e + ')';
    }
}
