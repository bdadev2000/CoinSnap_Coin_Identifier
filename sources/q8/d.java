package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import n9.h0;

/* loaded from: classes3.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new com.facebook.login.l(21);

    /* renamed from: c, reason: collision with root package name */
    public final String f23702c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23703d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23704f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f23705g;

    /* renamed from: h, reason: collision with root package name */
    public final j[] f23706h;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super(ChapterTocFrame.ID);
        this.f23702c = str;
        this.f23703d = z10;
        this.f23704f = z11;
        this.f23705g = strArr;
        this.f23706h = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f23703d == dVar.f23703d && this.f23704f == dVar.f23704f && h0.a(this.f23702c, dVar.f23702c) && Arrays.equals(this.f23705g, dVar.f23705g) && Arrays.equals(this.f23706h, dVar.f23706h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f23703d ? 1 : 0)) * 31) + (this.f23704f ? 1 : 0)) * 31;
        String str = this.f23702c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23702c);
        parcel.writeByte(this.f23703d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23704f ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f23705g);
        j[] jVarArr = this.f23706h;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super(ChapterTocFrame.ID);
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23702c = readString;
        this.f23703d = parcel.readByte() != 0;
        this.f23704f = parcel.readByte() != 0;
        this.f23705g = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f23706h = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f23706h[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
