package w;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: q0, reason: collision with root package name */
    public float f26656q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f26657r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f26658s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public d f26659t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f26660u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f26661v0;

    public i() {
        this.R.clear();
        this.R.add(this.f26659t0);
        int length = this.Q.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.Q[i10] = this.f26659t0;
        }
    }

    @Override // w.e
    public final boolean B() {
        return this.f26661v0;
    }

    @Override // w.e
    public final boolean C() {
        return this.f26661v0;
    }

    @Override // w.e
    public final void Q(t.d dVar, boolean z10) {
        if (this.T == null) {
            return;
        }
        d dVar2 = this.f26659t0;
        dVar.getClass();
        int n10 = t.d.n(dVar2);
        if (this.f26660u0 == 1) {
            this.Y = n10;
            this.Z = 0;
            L(this.T.l());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n10;
        O(this.T.r());
        L(0);
    }

    public final void R(int i10) {
        this.f26659t0.l(i10);
        this.f26661v0 = true;
    }

    public final void S(int i10) {
        if (this.f26660u0 == i10) {
            return;
        }
        this.f26660u0 = i10;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f26660u0 == 1) {
            this.f26659t0 = this.I;
        } else {
            this.f26659t0 = this.J;
        }
        arrayList.add(this.f26659t0);
        d[] dVarArr = this.Q;
        int length = dVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            dVarArr[i11] = this.f26659t0;
        }
    }

    @Override // w.e
    public final void c(t.d dVar, boolean z10) {
        boolean z11;
        f fVar = (f) this.T;
        if (fVar == null) {
            return;
        }
        Object j3 = fVar.j(c.LEFT);
        Object j10 = fVar.j(c.RIGHT);
        e eVar = this.T;
        boolean z12 = true;
        if (eVar != null && eVar.f26610p0[0] == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26660u0 == 0) {
            j3 = fVar.j(c.TOP);
            j10 = fVar.j(c.BOTTOM);
            e eVar2 = this.T;
            if (eVar2 == null || eVar2.f26610p0[1] != 2) {
                z12 = false;
            }
            z11 = z12;
        }
        if (this.f26661v0) {
            d dVar2 = this.f26659t0;
            if (dVar2.f26573c) {
                t.i k10 = dVar.k(dVar2);
                dVar.d(k10, this.f26659t0.d());
                if (this.f26657r0 != -1) {
                    if (z11) {
                        dVar.f(dVar.k(j10), k10, 0, 5);
                    }
                } else if (this.f26658s0 != -1 && z11) {
                    t.i k11 = dVar.k(j10);
                    dVar.f(k10, dVar.k(j3), 0, 5);
                    dVar.f(k11, k10, 0, 5);
                }
                this.f26661v0 = false;
                return;
            }
        }
        if (this.f26657r0 != -1) {
            t.i k12 = dVar.k(this.f26659t0);
            dVar.e(k12, dVar.k(j3), this.f26657r0, 8);
            if (z11) {
                dVar.f(dVar.k(j10), k12, 0, 5);
                return;
            }
            return;
        }
        if (this.f26658s0 != -1) {
            t.i k13 = dVar.k(this.f26659t0);
            t.i k14 = dVar.k(j10);
            dVar.e(k13, k14, -this.f26658s0, 8);
            if (z11) {
                dVar.f(k13, dVar.k(j3), 0, 5);
                dVar.f(k14, k13, 0, 5);
                return;
            }
            return;
        }
        if (this.f26656q0 != -1.0f) {
            t.i k15 = dVar.k(this.f26659t0);
            t.i k16 = dVar.k(j10);
            float f10 = this.f26656q0;
            t.c l10 = dVar.l();
            l10.f25100d.c(k15, -1.0f);
            l10.f25100d.c(k16, f10);
            dVar.c(l10);
        }
    }

    @Override // w.e
    public final boolean d() {
        return true;
    }

    @Override // w.e
    public final d j(c cVar) {
        int ordinal = cVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f26660u0 == 0) {
                return this.f26659t0;
            }
            return null;
        }
        if (this.f26660u0 == 1) {
            return this.f26659t0;
        }
        return null;
    }
}
