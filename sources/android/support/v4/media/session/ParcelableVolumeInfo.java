package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new E3.b(13);
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f4102c;

    /* renamed from: d, reason: collision with root package name */
    public int f4103d;

    /* renamed from: f, reason: collision with root package name */
    public int f4104f;

    /* renamed from: g, reason: collision with root package name */
    public int f4105g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.f4103d);
        parcel.writeInt(this.f4104f);
        parcel.writeInt(this.f4105g);
        parcel.writeInt(this.f4102c);
    }
}
