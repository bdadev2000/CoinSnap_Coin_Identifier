package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableLongState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableLongState> {
    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableLongState createFromParcel(Parcel parcel) {
        return new ParcelableSnapshotMutableLongState(parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableLongState[] newArray(int i2) {
        return new ParcelableSnapshotMutableLongState[i2];
    }
}
