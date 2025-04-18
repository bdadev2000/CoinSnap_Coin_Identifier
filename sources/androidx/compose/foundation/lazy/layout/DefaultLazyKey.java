package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final class DefaultLazyKey implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f4655a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public DefaultLazyKey(int i2) {
        this.f4655a = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f4655a == ((DefaultLazyKey) obj).f4655a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4655a);
    }

    public final String toString() {
        return d.o(new StringBuilder("DefaultLazyKey(index="), this.f4655a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4655a);
    }
}
