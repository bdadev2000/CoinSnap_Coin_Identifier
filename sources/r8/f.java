package r8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class f implements l8.a {
    public static final Parcelable.Creator<f> CREATOR = new b(3);

    /* renamed from: b, reason: collision with root package name */
    public final float f24018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24019c;

    public f(float f10, int i10) {
        this.f24018b = f10;
        this.f24019c = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f24018b == fVar.f24018b && this.f24019c == fVar.f24019c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f24018b).hashCode() + 527) * 31) + this.f24019c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f24018b + ", svcTemporalLayerCount=" + this.f24019c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f24018b);
        parcel.writeInt(this.f24019c);
    }

    public f(Parcel parcel) {
        this.f24018b = parcel.readFloat();
        this.f24019c = parcel.readInt();
    }
}
