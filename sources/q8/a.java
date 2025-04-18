package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import n9.h0;
import s7.k1;

/* loaded from: classes3.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new com.facebook.login.l(18);

    /* renamed from: c, reason: collision with root package name */
    public final String f23691c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23692d;

    /* renamed from: f, reason: collision with root package name */
    public final int f23693f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f23694g;

    public a(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f23691c = str;
        this.f23692d = str2;
        this.f23693f = i10;
        this.f23694g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f23693f == aVar.f23693f && h0.a(this.f23691c, aVar.f23691c) && h0.a(this.f23692d, aVar.f23692d) && Arrays.equals(this.f23694g, aVar.f23694g)) {
            return true;
        }
        return false;
    }

    @Override // l8.a
    public final void g(k1 k1Var) {
        k1Var.a(this.f23693f, this.f23694g);
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.f23693f) * 31;
        int i12 = 0;
        String str = this.f23691c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f23692d;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f23694g) + ((i13 + i12) * 31);
    }

    @Override // q8.j
    public final String toString() {
        return this.f23718b + ": mimeType=" + this.f23691c + ", description=" + this.f23692d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23691c);
        parcel.writeString(this.f23692d);
        parcel.writeInt(this.f23693f);
        parcel.writeByteArray(this.f23694g);
    }

    public a(Parcel parcel) {
        super(ApicFrame.ID);
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23691c = readString;
        this.f23692d = parcel.readString();
        this.f23693f = parcel.readInt();
        this.f23694g = parcel.createByteArray();
    }
}
