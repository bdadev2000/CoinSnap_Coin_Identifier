package z8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import n9.h0;

/* loaded from: classes3.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f28642d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28643e;

    /* renamed from: f, reason: collision with root package name */
    public final List f28644f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28645g;

    /* renamed from: h, reason: collision with root package name */
    public final long f28646h;

    /* renamed from: i, reason: collision with root package name */
    public final long f28647i;

    public n(j jVar, long j3, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j3, j10);
        this.f28642d = j11;
        this.f28643e = j12;
        this.f28644f = list;
        this.f28647i = j13;
        this.f28645g = j14;
        this.f28646h = j15;
    }

    public final long b(long j3, long j10) {
        long d10 = d(j3);
        if (d10 != -1) {
            return d10;
        }
        return (int) (f((j10 - this.f28646h) + this.f28647i, j3) - c(j3, j10));
    }

    public final long c(long j3, long j10) {
        long d10 = d(j3);
        long j11 = this.f28642d;
        if (d10 == -1) {
            long j12 = this.f28645g;
            if (j12 != C.TIME_UNSET) {
                return Math.max(j11, f((j10 - this.f28646h) - j12, j3));
            }
        }
        return j11;
    }

    public abstract long d(long j3);

    public final long e(long j3, long j10) {
        long j11 = this.f28655b;
        long j12 = this.f28642d;
        List list = this.f28644f;
        if (list != null) {
            return (((q) list.get((int) (j3 - j12))).f28652b * 1000000) / j11;
        }
        long d10 = d(j10);
        if (d10 != -1 && j3 == (j12 + d10) - 1) {
            return j10 - g(j3);
        }
        return (this.f28643e * 1000000) / j11;
    }

    public final long f(long j3, long j10) {
        long d10 = d(j10);
        long j11 = this.f28642d;
        if (d10 == 0) {
            return j11;
        }
        if (this.f28644f == null) {
            long j12 = (j3 / ((this.f28643e * 1000000) / this.f28655b)) + j11;
            if (j12 >= j11) {
                if (d10 == -1) {
                    return j12;
                }
                return Math.min(j12, (j11 + d10) - 1);
            }
            return j11;
        }
        long j13 = (d10 + j11) - 1;
        long j14 = j11;
        while (j14 <= j13) {
            long j15 = ((j13 - j14) / 2) + j14;
            long g10 = g(j15);
            if (g10 < j3) {
                j14 = j15 + 1;
            } else if (g10 > j3) {
                j13 = j15 - 1;
            } else {
                return j15;
            }
        }
        if (j14 == j11) {
            return j14;
        }
        return j13;
    }

    public final long g(long j3) {
        long j10;
        long j11 = this.f28642d;
        List list = this.f28644f;
        if (list != null) {
            j10 = ((q) list.get((int) (j3 - j11))).a - this.f28656c;
        } else {
            j10 = (j3 - j11) * this.f28643e;
        }
        return h0.M(j10, 1000000L, this.f28655b);
    }

    public abstract j h(long j3, m mVar);

    public boolean i() {
        return this.f28644f != null;
    }
}
