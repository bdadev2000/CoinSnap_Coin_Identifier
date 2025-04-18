package androidx.navigation;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class NavBackStackEntryState$Companion$CREATOR$1 implements Parcelable.Creator<NavBackStackEntryState> {
    @Override // android.os.Parcelable.Creator
    public final NavBackStackEntryState createFromParcel(Parcel parcel) {
        p0.a.s(parcel, "inParcel");
        return new NavBackStackEntryState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final NavBackStackEntryState[] newArray(int i2) {
        return new NavBackStackEntryState[i2];
    }
}
