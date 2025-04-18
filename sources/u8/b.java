package u8;

import android.os.Parcel;
import android.os.Parcelable;
import n9.h0;
import s7.i;

/* loaded from: classes3.dex */
public final class b implements Comparable, Parcelable, i {
    public static final Parcelable.Creator<b> CREATOR = new r8.b(10);

    /* renamed from: f, reason: collision with root package name */
    public static final String f25737f = h0.E(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f25738g = h0.E(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f25739h = h0.E(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f25740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25741c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25742d;

    public b(int i10, int i11, int i12) {
        this.f25740b = i10;
        this.f25741c = i11;
        this.f25742d = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.f25740b - bVar.f25740b;
        if (i10 == 0) {
            int i11 = this.f25741c - bVar.f25741c;
            if (i11 == 0) {
                return this.f25742d - bVar.f25742d;
            }
            return i11;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f25740b == bVar.f25740b && this.f25741c == bVar.f25741c && this.f25742d == bVar.f25742d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f25740b * 31) + this.f25741c) * 31) + this.f25742d;
    }

    public final String toString() {
        return this.f25740b + "." + this.f25741c + "." + this.f25742d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25740b);
        parcel.writeInt(this.f25741c);
        parcel.writeInt(this.f25742d);
    }

    public b(Parcel parcel) {
        this.f25740b = parcel.readInt();
        this.f25741c = parcel.readInt();
        this.f25742d = parcel.readInt();
    }
}
