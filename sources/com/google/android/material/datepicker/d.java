package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d implements b {
    public static final Parcelable.Creator<d> CREATOR = new r8.b(13);

    /* renamed from: b, reason: collision with root package name */
    public final long f11673b;

    public d(long j3) {
        this.f11673b = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f11673b == ((d) obj).f11673b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11673b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11673b);
    }
}
