package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import java.util.Arrays;
import n9.h0;
import n9.x;
import ra.f;
import s7.k1;
import vd.e;

/* loaded from: classes3.dex */
public final class a implements l8.a {
    public static final Parcelable.Creator<a> CREATOR = new l(14);

    /* renamed from: b, reason: collision with root package name */
    public final int f23161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23162c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23163d;

    /* renamed from: f, reason: collision with root package name */
    public final int f23164f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23165g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23166h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23167i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f23168j;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f23161b = i10;
        this.f23162c = str;
        this.f23163d = str2;
        this.f23164f = i11;
        this.f23165g = i12;
        this.f23166h = i13;
        this.f23167i = i14;
        this.f23168j = bArr;
    }

    public static a a(x xVar) {
        int f10 = xVar.f();
        String t5 = xVar.t(xVar.f(), f.a);
        String s5 = xVar.s(xVar.f());
        int f11 = xVar.f();
        int f12 = xVar.f();
        int f13 = xVar.f();
        int f14 = xVar.f();
        int f15 = xVar.f();
        byte[] bArr = new byte[f15];
        xVar.d(bArr, 0, f15);
        return new a(f10, t5, s5, f11, f12, f13, f14, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f23161b == aVar.f23161b && this.f23162c.equals(aVar.f23162c) && this.f23163d.equals(aVar.f23163d) && this.f23164f == aVar.f23164f && this.f23165g == aVar.f23165g && this.f23166h == aVar.f23166h && this.f23167i == aVar.f23167i && Arrays.equals(this.f23168j, aVar.f23168j)) {
            return true;
        }
        return false;
    }

    @Override // l8.a
    public final void g(k1 k1Var) {
        k1Var.a(this.f23161b, this.f23168j);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23168j) + ((((((((e.c(this.f23163d, e.c(this.f23162c, (this.f23161b + 527) * 31, 31), 31) + this.f23164f) * 31) + this.f23165g) * 31) + this.f23166h) * 31) + this.f23167i) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f23162c + ", description=" + this.f23163d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23161b);
        parcel.writeString(this.f23162c);
        parcel.writeString(this.f23163d);
        parcel.writeInt(this.f23164f);
        parcel.writeInt(this.f23165g);
        parcel.writeInt(this.f23166h);
        parcel.writeInt(this.f23167i);
        parcel.writeByteArray(this.f23168j);
    }

    public a(Parcel parcel) {
        this.f23161b = parcel.readInt();
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23162c = readString;
        this.f23163d = parcel.readString();
        this.f23164f = parcel.readInt();
        this.f23165g = parcel.readInt();
        this.f23166h = parcel.readInt();
        this.f23167i = parcel.readInt();
        this.f23168j = parcel.createByteArray();
    }
}
