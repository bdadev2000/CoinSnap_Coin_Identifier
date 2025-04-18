package androidx.compose.material3.internal;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class CalendarDate implements Comparable<CalendarDate> {

    /* renamed from: a, reason: collision with root package name */
    public final int f12941a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12942b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12943c;
    public final long d;

    public CalendarDate(int i2, int i3, long j2, int i4) {
        this.f12941a = i2;
        this.f12942b = i3;
        this.f12943c = i4;
        this.d = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(CalendarDate calendarDate) {
        return p0.a.F(this.d, calendarDate.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.f12941a == calendarDate.f12941a && this.f12942b == calendarDate.f12942b && this.f12943c == calendarDate.f12943c && this.d == calendarDate.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + d.c(this.f12943c, d.c(this.f12942b, Integer.hashCode(this.f12941a) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.f12941a + ", month=" + this.f12942b + ", dayOfMonth=" + this.f12943c + ", utcTimeMillis=" + this.d + ')';
    }
}
