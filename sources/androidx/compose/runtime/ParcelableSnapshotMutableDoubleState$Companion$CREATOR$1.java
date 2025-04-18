package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;

/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1 implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.ParcelableSnapshotMutableDoubleState, androidx.compose.runtime.SnapshotMutableDoubleStateImpl, androidx.compose.runtime.snapshots.StateObjectImpl] */
    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
        double readDouble = parcel.readDouble();
        ?? stateObjectImpl = new StateObjectImpl();
        SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord = new SnapshotMutableDoubleStateImpl.DoubleStateStateRecord(readDouble);
        if (Snapshot.Companion.b()) {
            SnapshotMutableDoubleStateImpl.DoubleStateStateRecord doubleStateStateRecord2 = new SnapshotMutableDoubleStateImpl.DoubleStateStateRecord(readDouble);
            doubleStateStateRecord2.f14634a = 1;
            doubleStateStateRecord.f14635b = doubleStateStateRecord2;
        }
        stateObjectImpl.f14021b = doubleStateStateRecord;
        return stateObjectImpl;
    }

    @Override // android.os.Parcelable.Creator
    public final ParcelableSnapshotMutableDoubleState[] newArray(int i2) {
        return new ParcelableSnapshotMutableDoubleState[i2];
    }
}
