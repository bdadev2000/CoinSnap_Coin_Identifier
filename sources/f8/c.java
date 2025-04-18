package f8;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;
import y7.w;
import y7.y;

/* loaded from: classes3.dex */
public final class c implements f {
    public final long[] a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17694b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17695c;

    public c(long[] jArr, long[] jArr2, long j3) {
        this.a = jArr;
        this.f17694b = jArr2;
        this.f17695c = j3 == C.TIME_UNSET ? h0.H(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair a(long j3, long[] jArr, long[] jArr2) {
        double d10;
        int f10 = h0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long j11 = jArr2[f10];
        int i10 = f10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i10];
        long j13 = jArr2[i10];
        if (j12 == j10) {
            d10 = 0.0d;
        } else {
            d10 = (j3 - j10) / (j12 - j10);
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) (d10 * (j13 - j11))) + j11));
    }

    @Override // f8.f
    public final long c() {
        return -1L;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f17695c;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        Pair a = a(h0.Q(h0.i(j3, 0L, this.f17695c)), this.f17694b, this.a);
        y yVar = new y(h0.H(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new w(yVar, yVar);
    }

    @Override // f8.f
    public final long getTimeUs(long j3) {
        return h0.H(((Long) a(j3, this.a, this.f17694b).second).longValue());
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return true;
    }
}
