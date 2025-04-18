package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import h2.b;
import h2.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(17);

    /* renamed from: b, reason: collision with root package name */
    public final c f2108b;

    public ParcelImpl(Parcel parcel) {
        this.f2108b = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).l(this.f2108b);
    }
}
