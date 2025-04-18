package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import n9.h0;

/* loaded from: classes3.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new com.facebook.login.l(20);

    /* renamed from: c, reason: collision with root package name */
    public final String f23696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23697d;

    /* renamed from: f, reason: collision with root package name */
    public final int f23698f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23699g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23700h;

    /* renamed from: i, reason: collision with root package name */
    public final j[] f23701i;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super(ChapterFrame.ID);
        this.f23696c = str;
        this.f23697d = i10;
        this.f23698f = i11;
        this.f23699g = j3;
        this.f23700h = j10;
        this.f23701i = jVarArr;
    }

    @Override // q8.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23697d == cVar.f23697d && this.f23698f == cVar.f23698f && this.f23699g == cVar.f23699g && this.f23700h == cVar.f23700h && h0.a(this.f23696c, cVar.f23696c) && Arrays.equals(this.f23701i, cVar.f23701i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f23697d) * 31) + this.f23698f) * 31) + ((int) this.f23699g)) * 31) + ((int) this.f23700h)) * 31;
        String str = this.f23696c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23696c);
        parcel.writeInt(this.f23697d);
        parcel.writeInt(this.f23698f);
        parcel.writeLong(this.f23699g);
        parcel.writeLong(this.f23700h);
        j[] jVarArr = this.f23701i;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super(ChapterFrame.ID);
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f23696c = readString;
        this.f23697d = parcel.readInt();
        this.f23698f = parcel.readInt();
        this.f23699g = parcel.readLong();
        this.f23700h = parcel.readLong();
        int readInt = parcel.readInt();
        this.f23701i = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f23701i[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
