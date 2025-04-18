package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.v2;
import s7.w2;
import s7.x2;

/* loaded from: classes3.dex */
public final class e extends n {

    /* renamed from: d, reason: collision with root package name */
    public final long f26098d;

    /* renamed from: f, reason: collision with root package name */
    public final long f26099f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26100g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26101h;

    public e(x2 x2Var, long j3, long j10) {
        super(x2Var);
        long max;
        long j11;
        boolean z10 = false;
        if (x2Var.h() == 1) {
            w2 m10 = x2Var.m(0, new w2());
            long max2 = Math.max(0L, j3);
            if (!m10.f24850n && max2 != 0 && !m10.f24846j) {
                throw new f(1);
            }
            if (j10 == Long.MIN_VALUE) {
                max = m10.f24852p;
            } else {
                max = Math.max(0L, j10);
            }
            long j12 = m10.f24852p;
            if (j12 != C.TIME_UNSET) {
                max = max > j12 ? j12 : max;
                if (max2 > max) {
                    throw new f(2);
                }
            }
            this.f26098d = max2;
            this.f26099f = max;
            if (max == C.TIME_UNSET) {
                j11 = -9223372036854775807L;
            } else {
                j11 = max - max2;
            }
            this.f26100g = j11;
            if (m10.f24847k && (max == C.TIME_UNSET || (j12 != C.TIME_UNSET && max == j12))) {
                z10 = true;
            }
            this.f26101h = z10;
            return;
        }
        throw new f(0);
    }

    @Override // v8.n, s7.x2
    public final v2 f(int i10, v2 v2Var, boolean z10) {
        long j3;
        this.f26213c.f(0, v2Var, z10);
        long j10 = v2Var.f24789g - this.f26098d;
        long j11 = this.f26100g;
        if (j11 == C.TIME_UNSET) {
            j3 = -9223372036854775807L;
        } else {
            j3 = j11 - j10;
        }
        v2Var.i(v2Var.f24785b, v2Var.f24786c, 0, j3, j10, w8.b.f26918i, false);
        return v2Var;
    }

    @Override // v8.n, s7.x2
    public final w2 n(int i10, w2 w2Var, long j3) {
        this.f26213c.n(0, w2Var, 0L);
        long j10 = w2Var.f24855s;
        long j11 = this.f26098d;
        w2Var.f24855s = j10 + j11;
        w2Var.f24852p = this.f26100g;
        w2Var.f24847k = this.f26101h;
        long j12 = w2Var.f24851o;
        if (j12 != C.TIME_UNSET) {
            long max = Math.max(j12, j11);
            w2Var.f24851o = max;
            long j13 = this.f26099f;
            if (j13 != C.TIME_UNSET) {
                max = Math.min(max, j13);
            }
            w2Var.f24851o = max - j11;
        }
        long Q = n9.h0.Q(j11);
        long j14 = w2Var.f24843g;
        if (j14 != C.TIME_UNSET) {
            w2Var.f24843g = j14 + Q;
        }
        long j15 = w2Var.f24844h;
        if (j15 != C.TIME_UNSET) {
            w2Var.f24844h = j15 + Q;
        }
        return w2Var;
    }
}
