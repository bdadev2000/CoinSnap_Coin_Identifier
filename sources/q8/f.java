package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;
import n9.h0;

/* loaded from: classes3.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new com.facebook.login.l(23);

    /* renamed from: c, reason: collision with root package name */
    public final String f23710c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23711d;

    /* renamed from: f, reason: collision with root package name */
    public final String f23712f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f23713g;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f23710c = str;
        this.f23711d = str2;
        this.f23712f = str3;
        this.f23713g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (h0.a(this.f23710c, fVar.f23710c) && h0.a(this.f23711d, fVar.f23711d) && h0.a(this.f23712f, fVar.f23712f) && Arrays.equals(this.f23713g, fVar.f23713g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f23710c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f23711d;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f23712f;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f23713g) + ((i14 + i12) * 31);
    }

    @Override // q8.j
    public final String toString() {
        return this.f23718b + ": mimeType=" + this.f23710c + ", filename=" + this.f23711d + ", description=" + this.f23712f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23710c);
        parcel.writeString(this.f23711d);
        parcel.writeString(this.f23712f);
        parcel.writeByteArray(this.f23713g);
    }

    public f(Parcel parcel) {
        super(GeobFrame.ID);
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23710c = readString;
        this.f23711d = parcel.readString();
        this.f23712f = parcel.readString();
        this.f23713g = parcel.createByteArray();
    }
}
