package p8;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import n9.h0;
import s7.k1;
import v8.u0;

/* loaded from: classes3.dex */
public final class b implements l8.a {
    public static final Parcelable.Creator<b> CREATOR = new l(16);

    /* renamed from: b, reason: collision with root package name */
    public final int f23485b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23486c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23487d;

    /* renamed from: f, reason: collision with root package name */
    public final String f23488f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23489g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23490h;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        u0.d(i11 == -1 || i11 > 0);
        this.f23485b = i10;
        this.f23486c = str;
        this.f23487d = str2;
        this.f23488f = str3;
        this.f23489g = z10;
        this.f23490h = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p8.b a(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.b.a(java.util.Map):p8.b");
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
        if (this.f23485b == bVar.f23485b && h0.a(this.f23486c, bVar.f23486c) && h0.a(this.f23487d, bVar.f23487d) && h0.a(this.f23488f, bVar.f23488f) && this.f23489g == bVar.f23489g && this.f23490h == bVar.f23490h) {
            return true;
        }
        return false;
    }

    @Override // l8.a
    public final void g(k1 k1Var) {
        String str = this.f23487d;
        if (str != null) {
            k1Var.E = str;
        }
        String str2 = this.f23486c;
        if (str2 != null) {
            k1Var.C = str2;
        }
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f23485b) * 31;
        int i13 = 0;
        String str = this.f23486c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f23487d;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f23488f;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.f23489g ? 1 : 0)) * 31) + this.f23490h;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f23487d + "\", genre=\"" + this.f23486c + "\", bitrate=" + this.f23485b + ", metadataInterval=" + this.f23490h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23485b);
        parcel.writeString(this.f23486c);
        parcel.writeString(this.f23487d);
        parcel.writeString(this.f23488f);
        int i11 = h0.a;
        parcel.writeInt(this.f23489g ? 1 : 0);
        parcel.writeInt(this.f23490h);
    }

    public b(Parcel parcel) {
        this.f23485b = parcel.readInt();
        this.f23486c = parcel.readString();
        this.f23487d = parcel.readString();
        this.f23488f = parcel.readString();
        int i10 = h0.a;
        this.f23489g = parcel.readInt() != 0;
        this.f23490h = parcel.readInt();
    }
}
