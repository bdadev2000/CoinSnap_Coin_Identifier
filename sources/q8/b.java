package q8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new com.facebook.login.l(19);

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f23695c;

    public b(String str, byte[] bArr) {
        super(str);
        this.f23695c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f23718b.equals(bVar.f23718b) && Arrays.equals(this.f23695c, bVar.f23695c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23695c) + vd.e.c(this.f23718b, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23718b);
        parcel.writeByteArray(this.f23695c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = n9.h0.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f23695c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.b.<init>(android.os.Parcel):void");
    }
}
