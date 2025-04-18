package y7;

import n9.h0;

/* loaded from: classes3.dex */
public final class b {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27943b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27944c;

    /* renamed from: d, reason: collision with root package name */
    public long f27945d;

    /* renamed from: e, reason: collision with root package name */
    public long f27946e;

    /* renamed from: f, reason: collision with root package name */
    public long f27947f;

    /* renamed from: g, reason: collision with root package name */
    public long f27948g;

    /* renamed from: h, reason: collision with root package name */
    public long f27949h;

    public b(long j3, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.a = j3;
        this.f27943b = j10;
        this.f27945d = j11;
        this.f27946e = j12;
        this.f27947f = j13;
        this.f27948g = j14;
        this.f27944c = j15;
        this.f27949h = a(j10, j11, j12, j13, j14, j15);
    }

    public static long a(long j3, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 < j13 && j10 + 1 < j11) {
            long j15 = ((float) (j3 - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
            return h0.i(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }
        return j12;
    }
}
