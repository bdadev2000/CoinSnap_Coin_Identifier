package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import n9.h0;

/* loaded from: classes3.dex */
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new com.facebook.login.l(24);

    /* renamed from: c, reason: collision with root package name */
    public final String f23719c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23720d;

    /* renamed from: f, reason: collision with root package name */
    public final String f23721f;

    public k(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.f23719c = str;
        this.f23720d = str2;
        this.f23721f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (h0.a(this.f23720d, kVar.f23720d) && h0.a(this.f23719c, kVar.f23719c) && h0.a(this.f23721f, kVar.f23721f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f23719c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f23720d;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f23721f;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // q8.j
    public final String toString() {
        return this.f23718b + ": domain=" + this.f23719c + ", description=" + this.f23720d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23718b);
        parcel.writeString(this.f23719c);
        parcel.writeString(this.f23721f);
    }

    public k(Parcel parcel) {
        super(InternalFrame.ID);
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23719c = readString;
        this.f23720d = parcel.readString();
        this.f23721f = parcel.readString();
    }
}
