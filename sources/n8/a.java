package n8;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.l;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import n9.h0;
import s7.q0;
import s7.r0;

/* loaded from: classes3.dex */
public final class a implements l8.a {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: i, reason: collision with root package name */
    public static final r0 f22505i;

    /* renamed from: j, reason: collision with root package name */
    public static final r0 f22506j;

    /* renamed from: b, reason: collision with root package name */
    public final String f22507b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22508c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22509d;

    /* renamed from: f, reason: collision with root package name */
    public final long f22510f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f22511g;

    /* renamed from: h, reason: collision with root package name */
    public int f22512h;

    static {
        q0 q0Var = new q0();
        q0Var.f24667k = MimeTypes.APPLICATION_ID3;
        f22505i = q0Var.a();
        q0 q0Var2 = new q0();
        q0Var2.f24667k = MimeTypes.APPLICATION_SCTE35;
        f22506j = q0Var2.a();
        CREATOR = new l(13);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f22507b = str;
        this.f22508c = str2;
        this.f22509d = j3;
        this.f22510f = j10;
        this.f22511g = bArr;
    }

    @Override // l8.a
    public final r0 d() {
        String str = this.f22507b;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f22506j;
            case 1:
            case 2:
                return f22505i;
            default:
                return null;
        }
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
        if (this.f22509d == aVar.f22509d && this.f22510f == aVar.f22510f && h0.a(this.f22507b, aVar.f22507b) && h0.a(this.f22508c, aVar.f22508c) && Arrays.equals(this.f22511g, aVar.f22511g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f22512h == 0) {
            int i11 = 0;
            String str = this.f22507b;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f22508c;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            int i13 = (i12 + i11) * 31;
            long j3 = this.f22509d;
            int i14 = (i13 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j10 = this.f22510f;
            this.f22512h = Arrays.hashCode(this.f22511g) + ((i14 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f22512h;
    }

    @Override // l8.a
    public final byte[] p() {
        if (d() != null) {
            return this.f22511g;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f22507b + ", id=" + this.f22510f + ", durationMs=" + this.f22509d + ", value=" + this.f22508c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22507b);
        parcel.writeString(this.f22508c);
        parcel.writeLong(this.f22509d);
        parcel.writeLong(this.f22510f);
        parcel.writeByteArray(this.f22511g);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = h0.a;
        this.f22507b = readString;
        this.f22508c = parcel.readString();
        this.f22509d = parcel.readLong();
        this.f22510f = parcel.readLong();
        this.f22511g = parcel.createByteArray();
    }
}
