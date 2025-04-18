package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: b, reason: collision with root package name */
    public final int f535b;

    /* renamed from: c, reason: collision with root package name */
    public final int f536c;

    /* renamed from: d, reason: collision with root package name */
    public final int f537d;

    /* renamed from: f, reason: collision with root package name */
    public final int f538f;

    /* renamed from: g, reason: collision with root package name */
    public final int f539g;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f535b = parcel.readInt();
        this.f537d = parcel.readInt();
        this.f538f = parcel.readInt();
        this.f539g = parcel.readInt();
        this.f536c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f535b);
        parcel.writeInt(this.f537d);
        parcel.writeInt(this.f538f);
        parcel.writeInt(this.f539g);
        parcel.writeInt(this.f536c);
    }
}
