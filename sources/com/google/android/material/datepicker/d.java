package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.y;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new y(13);
    public final long b;

    public d(long j7) {
        this.b = j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.b == ((d) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.b);
    }
}
