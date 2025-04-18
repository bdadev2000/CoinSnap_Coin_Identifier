package y7;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public class g implements x {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27974b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27975c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27976d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27977e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27978f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27979g;

    public g(long j3, long j10, int i10, int i11, boolean z10) {
        this.a = j3;
        this.f27974b = j10;
        this.f27975c = i11 == -1 ? 1 : i11;
        this.f27977e = i10;
        this.f27979g = z10;
        if (j3 == -1) {
            this.f27976d = -1L;
            this.f27978f = C.TIME_UNSET;
        } else {
            long j11 = j3 - j10;
            this.f27976d = j11;
            this.f27978f = ((Math.max(0L, j11) * 8) * 1000000) / i10;
        }
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f27978f;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        long j10 = this.f27976d;
        long j11 = this.f27974b;
        if (j10 == -1 && !this.f27979g) {
            y yVar = new y(0L, j11);
            return new w(yVar, yVar);
        }
        int i10 = this.f27977e;
        long j12 = this.f27975c;
        long j13 = (((i10 * j3) / 8000000) / j12) * j12;
        if (j10 != -1) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = ((Math.max(0L, max - j11) * 8) * 1000000) / i10;
        y yVar2 = new y(max2, max);
        if (j10 != -1 && max2 < j3) {
            long j14 = j12 + max;
            if (j14 < this.a) {
                return new w(yVar2, new y(((Math.max(0L, j14 - j11) * 8) * 1000000) / i10, j14));
            }
        }
        return new w(yVar2, yVar2);
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return this.f27976d != -1 || this.f27979g;
    }
}
