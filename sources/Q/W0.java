package q;

import android.os.Parcel;
import android.os.Parcelable;
import b0.AbstractC0547b;

/* loaded from: classes.dex */
public final class W0 extends AbstractC0547b {
    public static final Parcelable.Creator<W0> CREATOR = new B3.i(11);

    /* renamed from: d, reason: collision with root package name */
    public int f22607d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22608f;

    public W0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z8;
        this.f22607d = parcel.readInt();
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f22608f = z8;
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f22607d);
        parcel.writeInt(this.f22608f ? 1 : 0);
    }
}
