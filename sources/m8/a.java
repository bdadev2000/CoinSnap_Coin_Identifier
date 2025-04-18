package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import vd.e;

/* loaded from: classes3.dex */
public final class a implements l8.a {
    public static final Parcelable.Creator<a> CREATOR = new l(12);

    /* renamed from: b, reason: collision with root package name */
    public final int f21639b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21640c;

    public a(int i10, String str) {
        this.f21639b = i10;
        this.f21640c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f21639b);
        sb2.append(",url=");
        return e.h(sb2, this.f21640c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21640c);
        parcel.writeInt(this.f21639b);
    }
}
