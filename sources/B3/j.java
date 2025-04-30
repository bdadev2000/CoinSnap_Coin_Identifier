package B3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import b0.AbstractC0547b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class j extends AbstractC0547b {
    public static final Parcelable.Creator<j> CREATOR = new i(0);

    /* renamed from: d, reason: collision with root package name */
    public final int f288d;

    /* renamed from: f, reason: collision with root package name */
    public final int f289f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f290g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f291h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f292i;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f288d = parcel.readInt();
        this.f289f = parcel.readInt();
        this.f290g = parcel.readInt() == 1;
        this.f291h = parcel.readInt() == 1;
        this.f292i = parcel.readInt() == 1;
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f288d);
        parcel.writeInt(this.f289f);
        parcel.writeInt(this.f290g ? 1 : 0);
        parcel.writeInt(this.f291h ? 1 : 0);
        parcel.writeInt(this.f292i ? 1 : 0);
    }

    public j(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f288d = bottomSheetBehavior.f13925L;
        this.f289f = bottomSheetBehavior.f13946e;
        this.f290g = bottomSheetBehavior.b;
        this.f291h = bottomSheetBehavior.f13922I;
        this.f292i = bottomSheetBehavior.f13923J;
    }
}
