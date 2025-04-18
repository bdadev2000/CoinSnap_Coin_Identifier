package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import n9.h0;

/* loaded from: classes3.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new com.facebook.login.l(26);

    /* renamed from: c, reason: collision with root package name */
    public final String f23727c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f23728d;

    public m(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f23727c = str;
        this.f23728d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (h0.a(this.f23727c, mVar.f23727c) && Arrays.equals(this.f23728d, mVar.f23728d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f23727c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f23728d) + ((527 + i10) * 31);
    }

    @Override // q8.j
    public final String toString() {
        return this.f23718b + ": owner=" + this.f23727c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23727c);
        parcel.writeByteArray(this.f23728d);
    }

    public m(Parcel parcel) {
        super(PrivFrame.ID);
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23727c = readString;
        this.f23728d = parcel.createByteArray();
    }
}
