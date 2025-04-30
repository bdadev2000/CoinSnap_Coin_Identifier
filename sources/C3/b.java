package C3;

import B3.i;
import android.os.Parcel;
import android.os.Parcelable;
import b0.AbstractC0547b;

/* loaded from: classes2.dex */
public final class b extends AbstractC0547b {
    public static final Parcelable.Creator<b> CREATOR = new i(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f536d;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f536d = parcel.readInt() == 1;
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f536d ? 1 : 0);
    }
}
