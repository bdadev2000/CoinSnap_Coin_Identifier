package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new com.facebook.y(3);
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f13710c;

    /* renamed from: d, reason: collision with root package name */
    public String f13711d;

    /* renamed from: f, reason: collision with root package name */
    public long f13712f;

    /* renamed from: g, reason: collision with root package name */
    public long f13713g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.f13710c);
        parcel.writeString(this.f13711d);
        parcel.writeLong(this.f13712f);
        parcel.writeLong(this.f13713g);
    }
}
