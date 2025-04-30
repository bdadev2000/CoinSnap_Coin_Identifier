package S3;

import B3.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import b0.AbstractC0547b;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class d extends AbstractC0547b {
    public static final Parcelable.Creator<d> CREATOR = new i(5);

    /* renamed from: d, reason: collision with root package name */
    public final int f2805d;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2805d = parcel.readInt();
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f2805d);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f2805d = sideSheetBehavior.f14112h;
    }
}
