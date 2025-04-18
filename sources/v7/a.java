package v7;

import a6.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;

/* loaded from: classes3.dex */
public final class a implements l8.a {
    public static final Parcelable.Creator<a> CREATOR = new l(7);

    /* renamed from: b, reason: collision with root package name */
    public final long f26065b;

    public a(long j3) {
        this.f26065b = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f26065b == ((a) obj).f26065b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return k.B(this.f26065b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Creation time: ");
        long j3 = this.f26065b;
        sb2.append(j3 == -2082844800000L ? "unset" : Long.valueOf(j3));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f26065b);
    }

    public a(Parcel parcel) {
        this.f26065b = parcel.readLong();
    }
}
