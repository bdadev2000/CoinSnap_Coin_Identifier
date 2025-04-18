package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* renamed from: b, reason: collision with root package name */
    public final int f520b;

    /* renamed from: c, reason: collision with root package name */
    public final float f521c;

    public RatingCompat(int i10, float f10) {
        this.f520b = i10;
        this.f521c = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f520b;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f520b);
        sb2.append(" rating=");
        float f10 = this.f521c;
        if (f10 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f520b);
        parcel.writeFloat(this.f521c);
    }
}
