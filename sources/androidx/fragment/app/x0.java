package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x0 implements Parcelable {
    public static final Parcelable.Creator<x0> CREATOR = new android.support.v4.media.a(11);

    /* renamed from: b, reason: collision with root package name */
    public final String f1739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1740c;

    public x0(String str, int i10) {
        this.f1739b = str;
        this.f1740c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1739b);
        parcel.writeInt(this.f1740c);
    }

    public x0(Parcel parcel) {
        this.f1739b = parcel.readString();
        this.f1740c = parcel.readInt();
    }
}
