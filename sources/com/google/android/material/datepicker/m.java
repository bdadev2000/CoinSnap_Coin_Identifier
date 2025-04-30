package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.y;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new y(14);
    public final Calendar b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14058c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14059d;

    /* renamed from: f, reason: collision with root package name */
    public final int f14060f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14061g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14062h;

    /* renamed from: i, reason: collision with root package name */
    public String f14063i;

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = u.b(calendar);
        this.b = b;
        this.f14058c = b.get(2);
        this.f14059d = b.get(1);
        this.f14060f = b.getMaximum(7);
        this.f14061g = b.getActualMaximum(5);
        this.f14062h = b.getTimeInMillis();
    }

    public static m a(int i9, int i10) {
        Calendar d2 = u.d(null);
        d2.set(1, i9);
        d2.set(2, i10);
        return new m(d2);
    }

    public static m b(long j7) {
        Calendar d2 = u.d(null);
        d2.setTimeInMillis(j7);
        return new m(d2);
    }

    public final String c() {
        if (this.f14063i == null) {
            this.f14063i = u.a("yMMMM", Locale.getDefault()).format(new Date(this.b.getTimeInMillis()));
        }
        return this.f14063i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b.compareTo(((m) obj).b);
    }

    public final int d(m mVar) {
        if (this.b instanceof GregorianCalendar) {
            return (mVar.f14058c - this.f14058c) + ((mVar.f14059d - this.f14059d) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f14058c == mVar.f14058c && this.f14059d == mVar.f14059d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14058c), Integer.valueOf(this.f14059d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f14059d);
        parcel.writeInt(this.f14058c);
    }
}
