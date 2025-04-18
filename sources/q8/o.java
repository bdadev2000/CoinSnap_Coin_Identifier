package q8;

import android.os.Parcel;
import android.os.Parcelable;
import n9.h0;

/* loaded from: classes3.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new com.facebook.login.l(28);

    /* renamed from: c, reason: collision with root package name */
    public final String f23731c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23732d;

    public o(String str, String str2, String str3) {
        super(str);
        this.f23731c = str2;
        this.f23732d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f23718b.equals(oVar.f23718b) && h0.a(this.f23731c, oVar.f23731c) && h0.a(this.f23732d, oVar.f23732d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int c10 = vd.e.c(this.f23718b, 527, 31);
        int i11 = 0;
        String str = this.f23731c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (c10 + i10) * 31;
        String str2 = this.f23732d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // q8.j
    public final String toString() {
        return this.f23718b + ": url=" + this.f23732d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23718b);
        parcel.writeString(this.f23731c);
        parcel.writeString(this.f23732d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = n9.h0.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f23731c = r0
            java.lang.String r3 = r3.readString()
            r2.f23732d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.o.<init>(android.os.Parcel):void");
    }
}
