package X3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new E3.b(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        c cVar = (c) this;
        parcel.writeParcelable(cVar.b, 0);
        parcel.writeInt(cVar.f3667c ? 1 : 0);
    }
}
