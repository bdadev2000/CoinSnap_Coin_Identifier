package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;

/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.SnapshotMutableStateImpl, androidx.compose.runtime.ParcelableSnapshotMutableState] */
    public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
        SnapshotMutationPolicy snapshotMutationPolicy;
        if (classLoader == null) {
            classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            snapshotMutationPolicy = NeverEqualPolicy.f13839a;
        } else if (readInt == 1) {
            snapshotMutationPolicy = StructuralEqualityPolicy.f14078a;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(d.j("Unsupported MutableState policy ", readInt, " was restored"));
            }
            snapshotMutationPolicy = ReferentialEqualityPolicy.f13969a;
        }
        return new SnapshotMutableStateImpl(readValue, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new ParcelableSnapshotMutableState[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
