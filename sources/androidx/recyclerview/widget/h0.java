package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import b0.AbstractC0547b;

/* loaded from: classes.dex */
public final class h0 extends AbstractC0547b {
    public static final Parcelable.Creator<h0> CREATOR = new B3.i(8);

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f4991d;

    public h0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4991d = parcel.readParcelable(classLoader == null ? W.class.getClassLoader() : classLoader);
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeParcelable(this.f4991d, 0);
    }
}
