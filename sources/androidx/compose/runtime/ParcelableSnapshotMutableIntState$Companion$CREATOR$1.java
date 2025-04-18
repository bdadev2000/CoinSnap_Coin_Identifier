package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class ParcelableSnapshotMutableIntState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
        return new ParcelableSnapshotMutableIntState(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableIntState[] newArray(int i2) {
        return new ParcelableSnapshotMutableIntState[i2];
    }
}
