package f8;

import n9.h0;
import v8.u0;
import y7.w;
import y7.y;

/* loaded from: classes3.dex */
public final class h implements f {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17718b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17719c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17720d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17721e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f17722f;

    public h(long j3, int i10, long j10, long j11, long[] jArr) {
        this.a = j3;
        this.f17718b = i10;
        this.f17719c = j10;
        this.f17722f = jArr;
        this.f17720d = j11;
        this.f17721e = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override // f8.f
    public final long c() {
        return this.f17721e;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f17719c;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        double d10;
        double d11;
        boolean isSeekable = isSeekable();
        int i10 = this.f17718b;
        long j10 = this.a;
        if (!isSeekable) {
            y yVar = new y(0L, j10 + i10);
            return new w(yVar, yVar);
        }
        long i11 = h0.i(j3, 0L, this.f17719c);
        double d12 = (i11 * 100.0d) / this.f17719c;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d10 = 256.0d;
                d13 = 256.0d;
                double d14 = d13 / d10;
                long j11 = this.f17720d;
                y yVar2 = new y(i11, j10 + h0.i(Math.round(d14 * j11), i10, j11 - 1));
                return new w(yVar2, yVar2);
            }
            int i12 = (int) d12;
            long[] jArr = this.f17722f;
            u0.p(jArr);
            double d15 = jArr[i12];
            if (i12 == 99) {
                d11 = 256.0d;
            } else {
                d11 = jArr[i12 + 1];
            }
            d13 = ((d11 - d15) * (d12 - i12)) + d15;
        }
        d10 = 256.0d;
        double d142 = d13 / d10;
        long j112 = this.f17720d;
        y yVar22 = new y(i11, j10 + h0.i(Math.round(d142 * j112), i10, j112 - 1));
        return new w(yVar22, yVar22);
    }

    @Override // f8.f
    public final long getTimeUs(long j3) {
        long j10;
        double d10;
        long j11 = j3 - this.a;
        if (isSeekable() && j11 > this.f17718b) {
            long[] jArr = this.f17722f;
            u0.p(jArr);
            double d11 = (j11 * 256.0d) / this.f17720d;
            int f10 = h0.f(jArr, (long) d11, true);
            long j12 = this.f17719c;
            long j13 = (f10 * j12) / 100;
            long j14 = jArr[f10];
            int i10 = f10 + 1;
            long j15 = (j12 * i10) / 100;
            if (f10 == 99) {
                j10 = 256;
            } else {
                j10 = jArr[i10];
            }
            if (j14 == j10) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j14) / (j10 - j14);
            }
            return Math.round(d10 * (j15 - j13)) + j13;
        }
        return 0L;
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return this.f17722f != null;
    }
}
