package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<d0> CREATOR = new android.support.v4.media.a(24);

    /* renamed from: b, reason: collision with root package name */
    public final String f10984b;

    /* renamed from: c, reason: collision with root package name */
    public final Parcelable f10985c;

    public d0(Parcelable parcelable) {
        this.f10984b = "image/png";
        this.f10985c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f10984b);
        out.writeParcelable(this.f10985c, i10);
    }

    public d0(Parcel parcel) {
        this.f10984b = parcel.readString();
        this.f10985c = parcel.readParcelable(x.a().getClassLoader());
    }
}
