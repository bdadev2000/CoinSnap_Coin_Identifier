package S0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class o extends View.BaseSavedState {
    public static final Parcelable.Creator<o> CREATOR = new B3.i(4);
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f2790c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2791d;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.b);
        parcel.writeInt(this.f2790c);
        parcel.writeParcelable(this.f2791d, i9);
    }
}
