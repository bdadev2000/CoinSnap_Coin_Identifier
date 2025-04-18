package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes4.dex */
public final class ParcelableSnapshotMutableIntState extends SnapshotMutableIntStateImpl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new Object();

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public ParcelableSnapshotMutableIntState(int i2) {
        SnapshotMutableIntStateImpl.IntStateStateRecord intStateStateRecord = new SnapshotMutableIntStateImpl.IntStateStateRecord(i2);
        if (Snapshot.Companion.b()) {
            SnapshotMutableIntStateImpl.IntStateStateRecord intStateStateRecord2 = new SnapshotMutableIntStateImpl.IntStateStateRecord(i2);
            intStateStateRecord2.f14634a = 1;
            intStateStateRecord.f14635b = intStateStateRecord2;
        }
        this.f14025b = intStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(g());
    }
}
