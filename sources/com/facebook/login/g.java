package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.a(28);

    /* renamed from: b, reason: collision with root package name */
    public String f11213b;

    /* renamed from: c, reason: collision with root package name */
    public String f11214c;

    /* renamed from: d, reason: collision with root package name */
    public String f11215d;

    /* renamed from: f, reason: collision with root package name */
    public long f11216f;

    /* renamed from: g, reason: collision with root package name */
    public long f11217g;

    public g() {
    }

    public g(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f11213b = parcel.readString();
        this.f11214c = parcel.readString();
        this.f11215d = parcel.readString();
        this.f11216f = parcel.readLong();
        this.f11217g = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11213b);
        dest.writeString(this.f11214c);
        dest.writeString(this.f11215d);
        dest.writeLong(this.f11216f);
        dest.writeLong(this.f11217g);
    }
}
