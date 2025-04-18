package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class DefaultLazyKey$Companion$CREATOR$1 implements Parcelable.Creator<DefaultLazyKey> {
    @Override // android.os.Parcelable.Creator
    public final DefaultLazyKey createFromParcel(Parcel parcel) {
        return new DefaultLazyKey(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final DefaultLazyKey[] newArray(int i2) {
        return new DefaultLazyKey[i2];
    }
}
