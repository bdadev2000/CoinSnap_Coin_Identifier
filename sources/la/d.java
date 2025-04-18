package la;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.j3;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class d extends w0.b {
    public static final Parcelable.Creator<d> CREATOR = new j3(12);

    /* renamed from: d, reason: collision with root package name */
    public final int f21292d;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21292d = parcel.readInt();
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeInt(this.f21292d);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f21292d = sideSheetBehavior.f11779h;
    }
}
