package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new android.support.v4.media.j(7);

    /* renamed from: a, reason: collision with root package name */
    public int f108a;

    /* renamed from: b, reason: collision with root package name */
    public int f109b;

    /* renamed from: c, reason: collision with root package name */
    public int f110c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f111f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f108a);
        parcel.writeInt(this.f110c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f111f);
        parcel.writeInt(this.f109b);
    }
}
