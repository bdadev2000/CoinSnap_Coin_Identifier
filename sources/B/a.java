package B;

import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;
import z.AbstractC2965e;
import z.C2962b;
import z.C2963c;
import z.C2966f;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f85s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f86t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f87u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f88v0;

    @Override // B.d
    public final boolean A() {
        return this.f88v0;
    }

    @Override // B.d
    public final boolean B() {
        return this.f88v0;
    }

    public final boolean T() {
        int i9;
        int i10;
        int i11;
        boolean z8 = true;
        int i12 = 0;
        while (true) {
            i9 = this.f251r0;
            if (i12 >= i9) {
                break;
            }
            d dVar = this.f250q0[i12];
            if ((this.f86t0 || dVar.c()) && ((((i10 = this.f85s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f85s0) == 2 || i11 == 3) && !dVar.B()))) {
                z8 = false;
            }
            i12++;
        }
        if (!z8 || i9 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z9 = false;
        for (int i14 = 0; i14 < this.f251r0; i14++) {
            d dVar2 = this.f250q0[i14];
            if (this.f86t0 || dVar2.c()) {
                if (!z9) {
                    int i15 = this.f85s0;
                    if (i15 == 0) {
                        i13 = dVar2.i(2).d();
                    } else if (i15 == 1) {
                        i13 = dVar2.i(4).d();
                    } else if (i15 == 2) {
                        i13 = dVar2.i(3).d();
                    } else if (i15 == 3) {
                        i13 = dVar2.i(5).d();
                    }
                    z9 = true;
                }
                int i16 = this.f85s0;
                if (i16 == 0) {
                    i13 = Math.min(i13, dVar2.i(2).d());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, dVar2.i(4).d());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, dVar2.i(3).d());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, dVar2.i(5).d());
                }
            }
        }
        int i17 = i13 + this.f87u0;
        int i18 = this.f85s0;
        if (i18 != 0 && i18 != 1) {
            K(i17, i17);
        } else {
            J(i17, i17);
        }
        this.f88v0 = true;
        return true;
    }

    public final int U() {
        int i9 = this.f85s0;
        if (i9 != 0 && i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // B.d
    public final void b(C2963c c2963c, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        int i11;
        int i12;
        c[] cVarArr = this.f126Q;
        c cVar = this.f119I;
        cVarArr[0] = cVar;
        c cVar2 = this.f120J;
        int i13 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f121K;
        cVarArr[1] = cVar3;
        c cVar4 = this.f122L;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f110i = c2963c.k(cVar5);
        }
        int i14 = this.f85s0;
        if (i14 >= 0 && i14 < 4) {
            c cVar6 = cVarArr[i14];
            if (!this.f88v0) {
                T();
            }
            if (this.f88v0) {
                this.f88v0 = false;
                int i15 = this.f85s0;
                if (i15 != 0 && i15 != 1) {
                    if (i15 == 2 || i15 == 3) {
                        c2963c.d(cVar2.f110i, this.f135Z);
                        c2963c.d(cVar4.f110i, this.f135Z);
                        return;
                    }
                    return;
                }
                c2963c.d(cVar.f110i, this.f134Y);
                c2963c.d(cVar3.f110i, this.f134Y);
                return;
            }
            for (int i16 = 0; i16 < this.f251r0; i16++) {
                d dVar = this.f250q0[i16];
                if ((this.f86t0 || dVar.c()) && ((((i12 = this.f85s0) == 0 || i12 == 1) && dVar.f163p0[0] == 3 && dVar.f119I.f107f != null && dVar.f121K.f107f != null) || ((i12 == 2 || i12 == 3) && dVar.f163p0[1] == 3 && dVar.f120J.f107f != null && dVar.f122L.f107f != null))) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
            if (!cVar.g() && !cVar3.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!cVar2.g() && !cVar4.g()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z9 && (((i11 = this.f85s0) == 0 && z10) || ((i11 == 2 && z11) || ((i11 == 1 && z10) || (i11 == 3 && z11))))) {
                i9 = 5;
            } else {
                i9 = 4;
            }
            int i17 = 0;
            while (i17 < this.f251r0) {
                d dVar2 = this.f250q0[i17];
                if (this.f86t0 || dVar2.c()) {
                    C2966f k6 = c2963c.k(dVar2.f126Q[this.f85s0]);
                    int i18 = this.f85s0;
                    c cVar7 = dVar2.f126Q[i18];
                    cVar7.f110i = k6;
                    c cVar8 = cVar7.f107f;
                    if (cVar8 != null && cVar8.f105d == this) {
                        i10 = cVar7.f108g;
                    } else {
                        i10 = 0;
                    }
                    if (i18 != 0 && i18 != i13) {
                        C2966f c2966f = cVar6.f110i;
                        int i19 = this.f87u0 + i10;
                        C2962b l = c2963c.l();
                        C2966f m = c2963c.m();
                        m.f24485f = 0;
                        l.b(c2966f, k6, m, i19);
                        c2963c.c(l);
                    } else {
                        C2966f c2966f2 = cVar6.f110i;
                        int i20 = this.f87u0 - i10;
                        C2962b l2 = c2963c.l();
                        C2966f m2 = c2963c.m();
                        m2.f24485f = 0;
                        l2.c(c2966f2, k6, m2, i20);
                        c2963c.c(l2);
                    }
                    c2963c.e(cVar6.f110i, k6, this.f87u0 + i10, i9);
                }
                i17++;
                i13 = 2;
            }
            int i21 = this.f85s0;
            if (i21 == 0) {
                c2963c.e(cVar3.f110i, cVar.f110i, 0, 8);
                c2963c.e(cVar.f110i, this.f129T.f121K.f110i, 0, 4);
                c2963c.e(cVar.f110i, this.f129T.f119I.f110i, 0, 0);
                return;
            }
            if (i21 == 1) {
                c2963c.e(cVar.f110i, cVar3.f110i, 0, 8);
                c2963c.e(cVar.f110i, this.f129T.f119I.f110i, 0, 4);
                c2963c.e(cVar.f110i, this.f129T.f121K.f110i, 0, 0);
            } else if (i21 == 2) {
                c2963c.e(cVar4.f110i, cVar2.f110i, 0, 8);
                c2963c.e(cVar2.f110i, this.f129T.f122L.f110i, 0, 4);
                c2963c.e(cVar2.f110i, this.f129T.f120J.f110i, 0, 0);
            } else if (i21 == 3) {
                c2963c.e(cVar2.f110i, cVar4.f110i, 0, 8);
                c2963c.e(cVar2.f110i, this.f129T.f120J.f110i, 0, 4);
                c2963c.e(cVar2.f110i, this.f129T.f122L.f110i, 0, 0);
            }
        }
    }

    @Override // B.d
    public final boolean c() {
        return true;
    }

    @Override // B.d
    public final String toString() {
        String h6 = AbstractC2914a.h(new StringBuilder("[Barrier] "), this.f149h0, " {");
        for (int i9 = 0; i9 < this.f251r0; i9++) {
            d dVar = this.f250q0[i9];
            if (i9 > 0) {
                h6 = o.j(h6, ", ");
            }
            StringBuilder b = AbstractC2965e.b(h6);
            b.append(dVar.f149h0);
            h6 = b.toString();
        }
        return o.j(h6, "}");
    }
}
