package s8;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.x;

/* loaded from: classes3.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new r8.b(8);

    /* renamed from: b, reason: collision with root package name */
    public final long f24931b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24932c;

    public j(long j3, long j10) {
        this.f24931b = j3;
        this.f24932c = j10;
    }

    public static long a(long j3, x xVar) {
        long v10 = xVar.v();
        if ((128 & v10) != 0) {
            return 8589934591L & ((((v10 & 1) << 32) | xVar.w()) + j3);
        }
        return C.TIME_UNSET;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f24931b);
        parcel.writeLong(this.f24932c);
    }
}
