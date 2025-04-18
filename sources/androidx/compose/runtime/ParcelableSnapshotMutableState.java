package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Object();

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeValue(getValue());
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.f13839a;
        SnapshotMutationPolicy snapshotMutationPolicy = this.f14029b;
        if (p0.a.g(snapshotMutationPolicy, neverEqualPolicy)) {
            i3 = 0;
        } else if (p0.a.g(snapshotMutationPolicy, StructuralEqualityPolicy.f14078a)) {
            i3 = 1;
        } else {
            if (!p0.a.g(snapshotMutationPolicy, ReferentialEqualityPolicy.f13969a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i3 = 2;
        }
        parcel.writeInt(i3);
    }
}
