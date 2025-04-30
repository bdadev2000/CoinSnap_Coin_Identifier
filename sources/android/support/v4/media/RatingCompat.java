package android.support.v4.media;

import E3.b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new b(9);
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4100c;

    public RatingCompat(int i9, float f9) {
        this.b = i9;
        this.f4100c = f9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.b;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.b);
        sb.append(" rating=");
        float f9 = this.f4100c;
        if (f9 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f9);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeFloat(this.f4100c);
    }
}
