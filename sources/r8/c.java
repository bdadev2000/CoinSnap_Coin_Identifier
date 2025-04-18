package r8;

import a6.k;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class c implements l8.a {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: b, reason: collision with root package name */
    public final long f24009b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24010c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24011d;

    /* renamed from: f, reason: collision with root package name */
    public final long f24012f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24013g;

    public c(long j3, long j10, long j11, long j12, long j13) {
        this.f24009b = j3;
        this.f24010c = j10;
        this.f24011d = j11;
        this.f24012f = j12;
        this.f24013g = j13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f24009b == cVar.f24009b && this.f24010c == cVar.f24010c && this.f24011d == cVar.f24011d && this.f24012f == cVar.f24012f && this.f24013g == cVar.f24013g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return k.B(this.f24013g) + ((k.B(this.f24012f) + ((k.B(this.f24011d) + ((k.B(this.f24010c) + ((k.B(this.f24009b) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f24009b + ", photoSize=" + this.f24010c + ", photoPresentationTimestampUs=" + this.f24011d + ", videoStartPosition=" + this.f24012f + ", videoSize=" + this.f24013g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24009b);
        parcel.writeLong(this.f24010c);
        parcel.writeLong(this.f24011d);
        parcel.writeLong(this.f24012f);
        parcel.writeLong(this.f24013g);
    }

    public c(Parcel parcel) {
        this.f24009b = parcel.readLong();
        this.f24010c = parcel.readLong();
        this.f24011d = parcel.readLong();
        this.f24012f = parcel.readLong();
        this.f24013g = parcel.readLong();
    }
}
