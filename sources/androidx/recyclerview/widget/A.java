package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new E3.b(20);
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f4917c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4918d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.f4917c);
        parcel.writeInt(this.f4918d ? 1 : 0);
    }
}
