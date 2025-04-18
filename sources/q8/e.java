package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import n9.h0;

/* loaded from: classes3.dex */
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new com.facebook.login.l(22);

    /* renamed from: c, reason: collision with root package name */
    public final String f23707c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23708d;

    /* renamed from: f, reason: collision with root package name */
    public final String f23709f;

    public e(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f23707c = str;
        this.f23708d = str2;
        this.f23709f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (h0.a(this.f23708d, eVar.f23708d) && h0.a(this.f23707c, eVar.f23707c) && h0.a(this.f23709f, eVar.f23709f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f23707c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f23708d;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f23709f;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // q8.j
    public final String toString() {
        return this.f23718b + ": language=" + this.f23707c + ", description=" + this.f23708d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23718b);
        parcel.writeString(this.f23707c);
        parcel.writeString(this.f23709f);
    }

    public e(Parcel parcel) {
        super(CommentFrame.ID);
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23707c = readString;
        this.f23708d = parcel.readString();
        this.f23709f = parcel.readString();
    }
}
