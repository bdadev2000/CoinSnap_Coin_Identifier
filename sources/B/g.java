package B;

import java.util.ArrayList;
import z.C2963c;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f210A0;

    /* renamed from: B0, reason: collision with root package name */
    public C.b f211B0;

    /* renamed from: C0, reason: collision with root package name */
    public E.f f212C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f213D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f214E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f215F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f216G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f217H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f218I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f219J0;
    public float K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f220L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f221M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f222N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f223O0;
    public int P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f224Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f225R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f226S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f227T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f228U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f229V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f230W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f231X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f232Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f233Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f234a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f235b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f236s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f237t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f238u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f239v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f240w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f241x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f242y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f243z0;

    @Override // B.i
    public final void S() {
        for (int i9 = 0; i9 < this.f251r0; i9++) {
            d dVar = this.f250q0[i9];
            if (dVar != null) {
                dVar.f116F = true;
            }
        }
    }

    public final int T(d dVar, int i9) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f163p0;
        if (iArr[1] == 3) {
            int i10 = dVar.f166s;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (dVar.f173z * i9);
                if (i11 != dVar.k()) {
                    dVar.f146g = true;
                    W(iArr[0], dVar.q(), 1, i11, dVar);
                }
                return i11;
            }
            if (i10 == 1) {
                return dVar.k();
            }
            if (i10 == 3) {
                return (int) ((dVar.q() * dVar.f132W) + 0.5f);
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i9) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f163p0;
        if (iArr[0] == 3) {
            int i10 = dVar.f165r;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (dVar.f170w * i9);
                if (i11 != dVar.q()) {
                    dVar.f146g = true;
                    W(1, i11, iArr[1], dVar.k(), dVar);
                }
                return i11;
            }
            if (i10 == 1) {
                return dVar.q();
            }
            if (i10 == 3) {
                return (int) ((dVar.k() * dVar.f132W) + 0.5f);
            }
        }
        return dVar.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0773  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(int r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.g.V(int, int, int, int):void");
    }

    public final void W(int i9, int i10, int i11, int i12, d dVar) {
        E.f fVar;
        d dVar2;
        while (true) {
            fVar = this.f212C0;
            if (fVar != null || (dVar2 = this.f129T) == null) {
                break;
            } else {
                this.f212C0 = ((e) dVar2).f189u0;
            }
        }
        C.b bVar = this.f211B0;
        bVar.f337a = i9;
        bVar.b = i11;
        bVar.f338c = i10;
        bVar.f339d = i12;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f340e);
        dVar.L(bVar.f341f);
        dVar.f115E = bVar.f343h;
        dVar.I(bVar.f342g);
    }

    @Override // B.d
    public final void b(C2963c c2963c, boolean z8) {
        boolean z9;
        boolean z10;
        d dVar;
        float f9;
        int i9;
        boolean z11;
        super.b(c2963c, z8);
        d dVar2 = this.f129T;
        if (dVar2 != null && ((e) dVar2).f190v0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = this.f227T0;
        ArrayList arrayList = this.f230W0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            f fVar = (f) arrayList.get(i11);
                            if (i11 == size - 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            fVar.b(z9, i11, z11);
                        }
                    }
                } else if (this.f233Z0 != null && this.f232Y0 != null && this.f231X0 != null) {
                    for (int i12 = 0; i12 < this.f235b1; i12++) {
                        this.f234a1[i12].D();
                    }
                    int[] iArr = this.f233Z0;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    float f10 = this.f219J0;
                    d dVar3 = null;
                    int i15 = 0;
                    while (i15 < i13) {
                        if (z9) {
                            i9 = (i13 - i15) - 1;
                            f9 = 1.0f - this.f219J0;
                        } else {
                            f9 = f10;
                            i9 = i15;
                        }
                        d dVar4 = this.f232Y0[i9];
                        if (dVar4 != null && dVar4.f147g0 != 8) {
                            c cVar = dVar4.f119I;
                            if (i15 == 0) {
                                dVar4.f(cVar, this.f119I, this.f240w0);
                                dVar4.f151i0 = this.f213D0;
                                dVar4.f142d0 = f9;
                            }
                            if (i15 == i13 - 1) {
                                dVar4.f(dVar4.f121K, this.f121K, this.f241x0);
                            }
                            if (i15 > 0 && dVar3 != null) {
                                int i16 = this.P0;
                                c cVar2 = dVar3.f121K;
                                dVar4.f(cVar, cVar2, i16);
                                dVar3.f(cVar2, cVar, 0);
                            }
                            dVar3 = dVar4;
                        }
                        i15++;
                        f10 = f9;
                    }
                    for (int i17 = 0; i17 < i14; i17++) {
                        d dVar5 = this.f231X0[i17];
                        if (dVar5 != null && dVar5.f147g0 != 8) {
                            c cVar3 = dVar5.f120J;
                            if (i17 == 0) {
                                dVar5.f(cVar3, this.f120J, this.f236s0);
                                dVar5.f153j0 = this.f214E0;
                                dVar5.f144e0 = this.K0;
                            }
                            if (i17 == i14 - 1) {
                                dVar5.f(dVar5.f122L, this.f122L, this.f237t0);
                            }
                            if (i17 > 0 && dVar3 != null) {
                                int i18 = this.f224Q0;
                                c cVar4 = dVar3.f122L;
                                dVar5.f(cVar3, cVar4, i18);
                                dVar3.f(cVar4, cVar3, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                    for (int i19 = 0; i19 < i13; i19++) {
                        for (int i20 = 0; i20 < i14; i20++) {
                            int i21 = (i20 * i13) + i19;
                            if (this.f229V0 == 1) {
                                i21 = (i19 * i14) + i20;
                            }
                            d[] dVarArr = this.f234a1;
                            if (i21 < dVarArr.length && (dVar = dVarArr[i21]) != null && dVar.f147g0 != 8) {
                                d dVar6 = this.f232Y0[i19];
                                d dVar7 = this.f231X0[i20];
                                if (dVar != dVar6) {
                                    dVar.f(dVar.f119I, dVar6.f119I, 0);
                                    dVar.f(dVar.f121K, dVar6.f121K, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.f(dVar.f120J, dVar7.f120J, 0);
                                    dVar.f(dVar.f122L, dVar7.f122L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i22 = 0; i22 < size2; i22++) {
                    f fVar2 = (f) arrayList.get(i22);
                    if (i22 == size2 - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fVar2.b(z9, i22, z10);
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(z9, 0, true);
        }
        this.f242y0 = false;
    }
}
