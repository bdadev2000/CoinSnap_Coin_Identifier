package t0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class k extends View.BaseSavedState {
    public static final Parcelable.Creator<k> CREATOR = new android.support.v4.media.a(8);

    /* renamed from: b, reason: collision with root package name */
    public int f25165b;

    public k(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return vd.e.g(sb2, this.f25165b, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f25165b);
    }

    public k(Parcel parcel) {
        super(parcel);
        this.f25165b = parcel.readInt();
    }
}
