package x8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import m9.p;
import m9.v0;
import s7.r0;
import v8.u0;
import v8.y0;

/* loaded from: classes3.dex */
public final class k extends a {

    /* renamed from: q, reason: collision with root package name */
    public final int f27557q;

    /* renamed from: r, reason: collision with root package name */
    public final long f27558r;

    /* renamed from: s, reason: collision with root package name */
    public final g f27559s;

    /* renamed from: t, reason: collision with root package name */
    public long f27560t;
    public volatile boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27561v;

    public k(m9.l lVar, p pVar, r0 r0Var, int i10, Object obj, long j3, long j10, long j11, long j12, long j13, int i11, long j14, g gVar) {
        super(lVar, pVar, r0Var, i10, obj, j3, j10, j11, j12, j13);
        this.f27557q = i11;
        this.f27558r = j14;
        this.f27559s = gVar;
    }

    @Override // x8.a
    public final long b() {
        return this.f27500l + this.f27557q;
    }

    @Override // x8.a
    public final boolean c() {
        return this.f27561v;
    }

    @Override // m9.k0
    public final void cancelLoad() {
        this.u = true;
    }

    @Override // m9.k0
    public final void load() {
        boolean z10;
        boolean z11;
        long j3;
        if (this.f27560t == 0) {
            b bVar = this.f27503o;
            u0.p(bVar);
            long j10 = this.f27558r;
            for (y0 y0Var : bVar.f27505b) {
                if (y0Var.E != j10) {
                    y0Var.E = j10;
                    y0Var.f26345z = true;
                }
            }
            g gVar = this.f27559s;
            long j11 = this.f27501m;
            long j12 = C.TIME_UNSET;
            if (j11 == C.TIME_UNSET) {
                j3 = -9223372036854775807L;
            } else {
                j3 = j11 - this.f27558r;
            }
            long j13 = this.f27502n;
            if (j13 != C.TIME_UNSET) {
                j12 = j13 - this.f27558r;
            }
            ((d) gVar).a(bVar, j3, j12);
        }
        try {
            p a = this.f27522c.a(this.f27560t);
            v0 v0Var = this.f27529k;
            y7.h hVar = new y7.h(v0Var, a.f21710f, v0Var.a(a));
            while (!this.u) {
                try {
                    int b3 = ((d) this.f27559s).f27512b.b(hVar, d.f27511l);
                    if (b3 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u0.m(z10);
                    if (b3 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                } finally {
                    this.f27560t = hVar.f27982d - this.f27522c.f21710f;
                }
            }
            u0.q(this.f27529k);
            this.f27561v = !this.u;
        } catch (Throwable th2) {
            u0.q(this.f27529k);
            throw th2;
        }
    }
}
