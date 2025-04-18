package w;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: s0, reason: collision with root package name */
    public int f26543s0 = 0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f26544t0 = true;

    /* renamed from: u0, reason: collision with root package name */
    public int f26545u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f26546v0 = false;

    @Override // w.e
    public final boolean B() {
        return this.f26546v0;
    }

    @Override // w.e
    public final boolean C() {
        return this.f26546v0;
    }

    public final boolean S() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f26663r0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f26662q0[i13];
            if ((this.f26544t0 || eVar.d()) && ((((i11 = this.f26543s0) == 0 || i11 == 1) && !eVar.B()) || (((i12 = this.f26543s0) == 2 || i12 == 3) && !eVar.C()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f26663r0; i15++) {
            e eVar2 = this.f26662q0[i15];
            if (this.f26544t0 || eVar2.d()) {
                c cVar = c.BOTTOM;
                c cVar2 = c.TOP;
                c cVar3 = c.RIGHT;
                c cVar4 = c.LEFT;
                if (!z11) {
                    int i16 = this.f26543s0;
                    if (i16 == 0) {
                        i14 = eVar2.j(cVar4).d();
                    } else if (i16 == 1) {
                        i14 = eVar2.j(cVar3).d();
                    } else if (i16 == 2) {
                        i14 = eVar2.j(cVar2).d();
                    } else if (i16 == 3) {
                        i14 = eVar2.j(cVar).d();
                    }
                    z11 = true;
                }
                int i17 = this.f26543s0;
                if (i17 == 0) {
                    i14 = Math.min(i14, eVar2.j(cVar4).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, eVar2.j(cVar3).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, eVar2.j(cVar2).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, eVar2.j(cVar).d());
                }
            }
        }
        int i18 = i14 + this.f26545u0;
        int i19 = this.f26543s0;
        if (i19 != 0 && i19 != 1) {
            K(i18, i18);
        } else {
            J(i18, i18);
        }
        this.f26546v0 = true;
        return true;
    }

    public final int T() {
        int i10 = this.f26543s0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // w.e
    public final void c(t.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        d[] dVarArr = this.Q;
        d dVar2 = this.I;
        dVarArr[0] = dVar2;
        int i14 = 2;
        d dVar3 = this.J;
        dVarArr[2] = dVar3;
        d dVar4 = this.K;
        dVarArr[1] = dVar4;
        d dVar5 = this.L;
        dVarArr[3] = dVar5;
        for (d dVar6 : dVarArr) {
            dVar6.f26579i = dVar.k(dVar6);
        }
        int i15 = this.f26543s0;
        if (i15 >= 0 && i15 < 4) {
            d dVar7 = dVarArr[i15];
            if (!this.f26546v0) {
                S();
            }
            if (this.f26546v0) {
                this.f26546v0 = false;
                int i16 = this.f26543s0;
                if (i16 != 0 && i16 != 1) {
                    if (i16 == 2 || i16 == 3) {
                        dVar.d(dVar3.f26579i, this.Z);
                        dVar.d(dVar5.f26579i, this.Z);
                        return;
                    }
                    return;
                }
                dVar.d(dVar2.f26579i, this.Y);
                dVar.d(dVar4.f26579i, this.Y);
                return;
            }
            for (int i17 = 0; i17 < this.f26663r0; i17++) {
                e eVar = this.f26662q0[i17];
                if ((this.f26544t0 || eVar.d()) && ((((i13 = this.f26543s0) == 0 || i13 == 1) && eVar.f26610p0[0] == 3 && eVar.I.f26576f != null && eVar.K.f26576f != null) || ((i13 == 2 || i13 == 3) && eVar.f26610p0[1] == 3 && eVar.J.f26576f != null && eVar.L.f26576f != null))) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!dVar2.g() && !dVar4.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!dVar3.g() && !dVar5.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i12 = this.f26543s0) == 0 && z12) || ((i12 == 2 && z13) || ((i12 == 1 && z12) || (i12 == 3 && z13))))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i10 = 4;
            } else {
                i10 = 5;
            }
            int i18 = 0;
            while (i18 < this.f26663r0) {
                e eVar2 = this.f26662q0[i18];
                if (this.f26544t0 || eVar2.d()) {
                    t.i k10 = dVar.k(eVar2.Q[this.f26543s0]);
                    int i19 = this.f26543s0;
                    d dVar8 = eVar2.Q[i19];
                    dVar8.f26579i = k10;
                    d dVar9 = dVar8.f26576f;
                    if (dVar9 != null && dVar9.f26574d == this) {
                        i11 = dVar8.f26577g + 0;
                    } else {
                        i11 = 0;
                    }
                    if (i19 != 0 && i19 != i14) {
                        t.i iVar = dVar7.f26579i;
                        int i20 = this.f26545u0 + i11;
                        t.c l10 = dVar.l();
                        t.i m10 = dVar.m();
                        m10.f25130f = 0;
                        l10.b(iVar, k10, m10, i20);
                        dVar.c(l10);
                    } else {
                        t.i iVar2 = dVar7.f26579i;
                        int i21 = this.f26545u0 - i11;
                        t.c l11 = dVar.l();
                        t.i m11 = dVar.m();
                        m11.f25130f = 0;
                        l11.c(iVar2, k10, m11, i21);
                        dVar.c(l11);
                    }
                    dVar.e(dVar7.f26579i, k10, this.f26545u0 + i11, i10);
                }
                i18++;
                i14 = 2;
            }
            int i22 = this.f26543s0;
            if (i22 == 0) {
                dVar.e(dVar4.f26579i, dVar2.f26579i, 0, 8);
                dVar.e(dVar2.f26579i, this.T.K.f26579i, 0, 4);
                dVar.e(dVar2.f26579i, this.T.I.f26579i, 0, 0);
                return;
            }
            if (i22 == 1) {
                dVar.e(dVar2.f26579i, dVar4.f26579i, 0, 8);
                dVar.e(dVar2.f26579i, this.T.I.f26579i, 0, 4);
                dVar.e(dVar2.f26579i, this.T.K.f26579i, 0, 0);
            } else if (i22 == 2) {
                dVar.e(dVar5.f26579i, dVar3.f26579i, 0, 8);
                dVar.e(dVar3.f26579i, this.T.L.f26579i, 0, 4);
                dVar.e(dVar3.f26579i, this.T.J.f26579i, 0, 0);
            } else if (i22 == 3) {
                dVar.e(dVar3.f26579i, dVar5.f26579i, 0, 8);
                dVar.e(dVar3.f26579i, this.T.J.f26579i, 0, 4);
                dVar.e(dVar3.f26579i, this.T.L.f26579i, 0, 0);
            }
        }
    }

    @Override // w.e
    public final boolean d() {
        return true;
    }

    @Override // w.e
    public final String toString() {
        String h10 = vd.e.h(new StringBuilder("[Barrier] "), this.f26594h0, " {");
        for (int i10 = 0; i10 < this.f26663r0; i10++) {
            e eVar = this.f26662q0[i10];
            if (i10 > 0) {
                h10 = eb.j.k(h10, ", ");
            }
            StringBuilder m10 = eb.j.m(h10);
            m10.append(eVar.f26594h0);
            h10 = m10.toString();
        }
        return eb.j.k(h10, "}");
    }
}
