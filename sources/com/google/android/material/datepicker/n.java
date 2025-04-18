package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new r8.b(14);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f11723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11725d;

    /* renamed from: f, reason: collision with root package name */
    public final int f11726f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11727g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11728h;

    /* renamed from: i, reason: collision with root package name */
    public String f11729i;

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b3 = u.b(calendar);
        this.f11723b = b3;
        this.f11724c = b3.get(2);
        this.f11725d = b3.get(1);
        this.f11726f = b3.getMaximum(7);
        this.f11727g = b3.getActualMaximum(5);
        this.f11728h = b3.getTimeInMillis();
    }

    public static n a(int i10, int i11) {
        Calendar d10 = u.d(null);
        d10.set(1, i10);
        d10.set(2, i11);
        return new n(d10);
    }

    public static n b(long j3) {
        Calendar d10 = u.d(null);
        d10.setTimeInMillis(j3);
        return new n(d10);
    }

    public final String c() {
        if (this.f11729i == null) {
            this.f11729i = u.a("yMMMM", Locale.getDefault()).format(new Date(this.f11723b.getTimeInMillis()));
        }
        return this.f11729i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11723b.compareTo(((n) obj).f11723b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f11724c == nVar.f11724c && this.f11725d == nVar.f11725d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11724c), Integer.valueOf(this.f11725d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11725d);
        parcel.writeInt(this.f11724c);
    }
}
