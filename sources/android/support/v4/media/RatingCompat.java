package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new j(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f80a;

    /* renamed from: b, reason: collision with root package name */
    public final float f81b;

    public RatingCompat(int i2, float f2) {
        this.f80a = i2;
        this.f81b = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f80a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f80a);
        sb.append(" rating=");
        float f2 = this.f81b;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f80a);
        parcel.writeFloat(this.f81b);
    }
}
