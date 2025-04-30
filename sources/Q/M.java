package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class M extends View.BaseSavedState {
    public static final Parcelable.Creator<M> CREATOR = new com.facebook.y(20);
    public boolean b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }
}
