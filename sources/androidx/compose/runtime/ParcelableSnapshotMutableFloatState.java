package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class ParcelableSnapshotMutableFloatState extends SnapshotMutableFloatStateImpl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new Object();

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public ParcelableSnapshotMutableFloatState(float f2) {
        SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord = new SnapshotMutableFloatStateImpl.FloatStateStateRecord(f2);
        if (Snapshot.Companion.b()) {
            SnapshotMutableFloatStateImpl.FloatStateStateRecord floatStateStateRecord2 = new SnapshotMutableFloatStateImpl.FloatStateStateRecord(f2);
            floatStateStateRecord2.f14634a = 1;
            floatStateStateRecord.f14635b = floatStateStateRecord2;
        }
        this.f14023b = floatStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(c());
    }
}
