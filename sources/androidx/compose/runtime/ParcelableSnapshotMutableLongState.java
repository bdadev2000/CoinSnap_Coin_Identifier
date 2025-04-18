package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableLongStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ParcelableSnapshotMutableLongState extends SnapshotMutableLongStateImpl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new Object();

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public ParcelableSnapshotMutableLongState(long j2) {
        SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord = new SnapshotMutableLongStateImpl.LongStateStateRecord(j2);
        if (Snapshot.Companion.b()) {
            SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord2 = new SnapshotMutableLongStateImpl.LongStateStateRecord(j2);
            longStateStateRecord2.f14634a = 1;
            longStateStateRecord.f14635b = longStateStateRecord2;
        }
        this.f14027b = longStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(d());
    }
}
