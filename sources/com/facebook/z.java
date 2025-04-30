package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new y(0);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Parcelable f13846c;

    public z(Parcelable parcelable) {
        this.b = "image/png";
        this.f13846c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "out");
        parcel.writeString(this.b);
        parcel.writeParcelable(this.f13846c, i9);
    }

    public z(Parcel parcel) {
        this.b = parcel.readString();
        this.f13846c = parcel.readParcelable(r.a().getClassLoader());
    }
}
