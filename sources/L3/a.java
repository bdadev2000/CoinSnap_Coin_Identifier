package L3;

import android.os.Parcel;
import android.os.Parcelable;
import b0.AbstractC0547b;

/* loaded from: classes2.dex */
public final class a extends AbstractC0547b {
    public static final Parcelable.Creator<a> CREATOR = new B3.i(3);

    /* renamed from: d, reason: collision with root package name */
    public boolean f1724d;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1724d = parcel.readInt() == 1;
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f1724d ? 1 : 0);
    }
}
