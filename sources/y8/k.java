package y8;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class k {
    public final x8.g a;

    /* renamed from: b, reason: collision with root package name */
    public final z8.m f28079b;

    /* renamed from: c, reason: collision with root package name */
    public final z8.b f28080c;

    /* renamed from: d, reason: collision with root package name */
    public final i f28081d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28082e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28083f;

    public k(long j3, z8.m mVar, z8.b bVar, x8.g gVar, long j10, i iVar) {
        this.f28082e = j3;
        this.f28079b = mVar;
        this.f28080c = bVar;
        this.f28083f = j10;
        this.a = gVar;
        this.f28081d = iVar;
    }

    public final k a(long j3, z8.m mVar) {
        long j10;
        long j11;
        i b3 = this.f28079b.b();
        i b10 = mVar.b();
        if (b3 == null) {
            return new k(j3, mVar, this.f28080c, this.a, this.f28083f, b3);
        }
        if (!b3.t()) {
            return new k(j3, mVar, this.f28080c, this.a, this.f28083f, b10);
        }
        long m10 = b3.m(j3);
        if (m10 == 0) {
            return new k(j3, mVar, this.f28080c, this.a, this.f28083f, b10);
        }
        long u = b3.u();
        long timeUs = b3.getTimeUs(u);
        long j12 = (m10 + u) - 1;
        long d10 = b3.d(j12, j3) + b3.getTimeUs(j12);
        long u4 = b10.u();
        long timeUs2 = b10.getTimeUs(u4);
        long j13 = this.f28083f;
        if (d10 == timeUs2) {
            j10 = j12 + 1;
        } else if (d10 >= timeUs2) {
            if (timeUs2 < timeUs) {
                j11 = j13 - (b10.j(timeUs, j3) - u);
                return new k(j3, mVar, this.f28080c, this.a, j11, b10);
            }
            j10 = b3.j(timeUs2, j3);
        } else {
            throw new v8.b();
        }
        j11 = (j10 - u4) + j13;
        return new k(j3, mVar, this.f28080c, this.a, j11, b10);
    }

    public final long b(long j3) {
        i iVar = this.f28081d;
        long j10 = this.f28082e;
        return (iVar.v(j10, j3) + (iVar.e(j10, j3) + this.f28083f)) - 1;
    }

    public final long c(long j3) {
        return this.f28081d.d(j3 - this.f28083f, this.f28082e) + d(j3);
    }

    public final long d(long j3) {
        return this.f28081d.getTimeUs(j3 - this.f28083f);
    }

    public final boolean e(long j3, long j10) {
        if (this.f28081d.t() || j10 == C.TIME_UNSET || c(j3) <= j10) {
            return true;
        }
        return false;
    }
}
