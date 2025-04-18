package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import v8.u0;

/* loaded from: classes3.dex */
public final class b implements l8.a {
    public static final Parcelable.Creator<b> CREATOR = new l(8);

    /* renamed from: b, reason: collision with root package name */
    public final float f26066b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26067c;

    public b(float f10, float f11) {
        u0.e(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f26066b = f10;
        this.f26067c = f11;
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
        if (this.f26066b == bVar.f26066b && this.f26067c == bVar.f26067c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f26067c).hashCode() + ((Float.valueOf(this.f26066b).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f26066b + ", longitude=" + this.f26067c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f26066b);
        parcel.writeFloat(this.f26067c);
    }

    public b(Parcel parcel) {
        this.f26066b = parcel.readFloat();
        this.f26067c = parcel.readFloat();
    }
}
