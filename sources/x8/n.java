package x8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import m9.p;
import m9.v0;
import s7.r0;
import v8.u0;
import v8.y0;
import y7.a0;

/* loaded from: classes3.dex */
public final class n extends a {

    /* renamed from: q, reason: collision with root package name */
    public final int f27567q;

    /* renamed from: r, reason: collision with root package name */
    public final r0 f27568r;

    /* renamed from: s, reason: collision with root package name */
    public long f27569s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27570t;

    public n(m9.l lVar, p pVar, r0 r0Var, int i10, Object obj, long j3, long j10, long j11, int i11, r0 r0Var2) {
        super(lVar, pVar, r0Var, i10, obj, j3, j10, C.TIME_UNSET, C.TIME_UNSET, j11);
        this.f27567q = i11;
        this.f27568r = r0Var2;
    }

    @Override // x8.a
    public final boolean c() {
        return this.f27570t;
    }

    @Override // m9.k0
    public final void cancelLoad() {
    }

    @Override // m9.k0
    public final void load() {
        v0 v0Var = this.f27529k;
        b bVar = this.f27503o;
        u0.p(bVar);
        for (y0 y0Var : bVar.f27505b) {
            if (y0Var.E != 0) {
                y0Var.E = 0L;
                y0Var.f26345z = true;
            }
        }
        a0 a = bVar.a(this.f27567q);
        a.f(this.f27568r);
        try {
            long a10 = v0Var.a(this.f27522c.a(this.f27569s));
            if (a10 != -1) {
                a10 += this.f27569s;
            }
            y7.h hVar = new y7.h(this.f27529k, this.f27569s, a10);
            for (int i10 = 0; i10 != -1; i10 = a.b(hVar, Integer.MAX_VALUE, true)) {
                this.f27569s += i10;
            }
            a.d(this.f27527i, 1, (int) this.f27569s, 0, null);
            u0.q(v0Var);
            this.f27570t = true;
        } catch (Throwable th2) {
            u0.q(v0Var);
            throw th2;
        }
    }
}
