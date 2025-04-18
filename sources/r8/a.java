package r8;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.login.l;
import java.util.Arrays;
import kotlin.UByte;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class a implements l8.a {
    public static final Parcelable.Creator<a> CREATOR = new l(29);

    /* renamed from: b, reason: collision with root package name */
    public final String f24005b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f24006c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24007d;

    /* renamed from: f, reason: collision with root package name */
    public final int f24008f;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f24005b = str;
        this.f24006c = bArr;
        this.f24007d = i10;
        this.f24008f = i11;
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
        if (this.f24005b.equals(aVar.f24005b) && Arrays.equals(this.f24006c, aVar.f24006c) && this.f24007d == aVar.f24007d && this.f24008f == aVar.f24008f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f24006c) + vd.e.c(this.f24005b, 527, 31)) * 31) + this.f24007d) * 31) + this.f24008f;
    }

    public final String toString() {
        String l10;
        boolean z10;
        boolean z11;
        byte[] bArr = this.f24006c;
        int i10 = this.f24008f;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    int i11 = h0.a;
                    StringBuilder sb2 = new StringBuilder(bArr.length * 2);
                    for (int i12 = 0; i12 < bArr.length; i12++) {
                        sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                        sb2.append(Character.forDigit(bArr[i12] & Ascii.SI, 16));
                    }
                    l10 = sb2.toString();
                } else {
                    int i13 = h0.a;
                    if (bArr.length == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u0.d(z11);
                    l10 = String.valueOf(bArr[3] | (bArr[1] << Ascii.DLE) | (bArr[0] << Ascii.CAN) | (bArr[2] << 8));
                }
            } else {
                int i14 = h0.a;
                if (bArr.length == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0.d(z10);
                l10 = String.valueOf(Float.intBitsToFloat((bArr[3] & UByte.MAX_VALUE) | ((bArr[1] & UByte.MAX_VALUE) << 16) | (bArr[0] << Ascii.CAN) | ((bArr[2] & UByte.MAX_VALUE) << 8)));
            }
        } else {
            l10 = h0.l(bArr);
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder("mdta: key="), this.f24005b, ", value=", l10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24005b);
        parcel.writeByteArray(this.f24006c);
        parcel.writeInt(this.f24007d);
        parcel.writeInt(this.f24008f);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f24005b = readString;
        this.f24006c = parcel.createByteArray();
        this.f24007d = parcel.readInt();
        this.f24008f = parcel.readInt();
    }
}
