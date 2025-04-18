package x8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import m9.p;
import m9.v0;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class l extends e {

    /* renamed from: l, reason: collision with root package name */
    public final g f27562l;

    /* renamed from: m, reason: collision with root package name */
    public f f27563m;

    /* renamed from: n, reason: collision with root package name */
    public long f27564n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f27565o;

    public l(m9.l lVar, p pVar, r0 r0Var, int i10, Object obj, g gVar) {
        super(lVar, pVar, 2, r0Var, i10, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.f27562l = gVar;
    }

    @Override // m9.k0
    public final void cancelLoad() {
        this.f27565o = true;
    }

    @Override // m9.k0
    public final void load() {
        boolean z10;
        if (this.f27564n == 0) {
            ((d) this.f27562l).a(this.f27563m, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            p a = this.f27522c.a(this.f27564n);
            v0 v0Var = this.f27529k;
            y7.h hVar = new y7.h(v0Var, a.f21710f, v0Var.a(a));
            while (!this.f27565o) {
                try {
                    int b3 = ((d) this.f27562l).f27512b.b(hVar, d.f27511l);
                    boolean z11 = false;
                    if (b3 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u0.m(z10);
                    if (b3 == 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        break;
                    }
                } finally {
                    this.f27564n = hVar.f27982d - this.f27522c.f21710f;
                }
            }
        } finally {
            u0.q(this.f27529k);
        }
    }
}
