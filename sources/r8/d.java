package r8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b(2);

    /* renamed from: b, reason: collision with root package name */
    public final long f24014b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24015c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24016d;

    public d(long j3, long j10, int i10) {
        boolean z10;
        if (j3 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.f24014b = j3;
        this.f24015c = j10;
        this.f24016d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f24014b == dVar.f24014b && this.f24015c == dVar.f24015c && this.f24016d == dVar.f24016d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f24014b), Long.valueOf(this.f24015c), Integer.valueOf(this.f24016d)});
    }

    public final String toString() {
        return h0.k("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f24014b), Long.valueOf(this.f24015c), Integer.valueOf(this.f24016d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24014b);
        parcel.writeLong(this.f24015c);
        parcel.writeInt(this.f24016d);
    }
}
