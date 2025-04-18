package w;

import java.util.ArrayList;
import x.m;

/* loaded from: classes.dex */
public final class h extends k {

    /* renamed from: a1, reason: collision with root package name */
    public e[] f26646a1;

    /* renamed from: s0, reason: collision with root package name */
    public int f26648s0 = 0;

    /* renamed from: t0, reason: collision with root package name */
    public int f26649t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public int f26650u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public int f26651v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public int f26652w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f26653x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f26654y0 = false;

    /* renamed from: z0, reason: collision with root package name */
    public int f26655z0 = 0;
    public int A0 = 0;
    public final x.b B0 = new x.b();
    public m C0 = null;
    public int D0 = -1;
    public int E0 = -1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public float J0 = 0.5f;
    public float K0 = 0.5f;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 2;
    public int S0 = 2;
    public int T0 = 0;
    public int U0 = -1;
    public int V0 = 0;
    public final ArrayList W0 = new ArrayList();
    public e[] X0 = null;
    public e[] Y0 = null;
    public int[] Z0 = null;

    /* renamed from: b1, reason: collision with root package name */
    public int f26647b1 = 0;

    public final int S(int i10, e eVar) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f26610p0;
        if (iArr[1] == 3) {
            int i11 = eVar.f26613s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f26619z * i10);
                if (i12 != eVar.l()) {
                    eVar.f26591g = true;
                    U(eVar, iArr[0], eVar.r(), 1, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.l();
            }
            if (i11 == 3) {
                return (int) ((eVar.r() * eVar.W) + 0.5f);
            }
        }
        return eVar.l();
    }

    public final int T(int i10, e eVar) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f26610p0;
        if (iArr[0] == 3) {
            int i11 = eVar.f26612r;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f26616w * i10);
                if (i12 != eVar.r()) {
                    eVar.f26591g = true;
                    U(eVar, 1, i12, iArr[1], eVar.l());
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.r();
            }
            if (i11 == 3) {
                return (int) ((eVar.l() * eVar.W) + 0.5f);
            }
        }
        return eVar.r();
    }

    public final void U(e eVar, int i10, int i11, int i12, int i13) {
        m mVar;
        boolean z10;
        e eVar2;
        while (true) {
            mVar = this.C0;
            if (mVar != null || (eVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((f) eVar2).f26623u0;
            }
        }
        x.b bVar = this.B0;
        bVar.a = i10;
        bVar.f27246b = i12;
        bVar.f27247c = i11;
        bVar.f27248d = i13;
        mVar.b(eVar, bVar);
        eVar.O(bVar.f27249e);
        eVar.L(bVar.f27250f);
        eVar.E = bVar.f27252h;
        int i14 = bVar.f27251g;
        eVar.f26580a0 = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.E = z10;
    }

    @Override // w.k, w.j
    public final void a() {
        for (int i10 = 0; i10 < this.f26663r0; i10++) {
            e eVar = this.f26662q0[i10];
            if (eVar != null) {
                eVar.F = true;
            }
        }
    }

    @Override // w.e
    public final void c(t.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        e eVar;
        float f10;
        int i10;
        boolean z13;
        super.c(dVar, z10);
        e eVar2 = this.T;
        if (eVar2 != null && ((f) eVar2).f26624v0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.T0;
        ArrayList arrayList = this.W0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            g gVar = (g) arrayList.get(i12);
                            if (i12 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            gVar.b(i12, z11, z13);
                        }
                    }
                } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                    for (int i13 = 0; i13 < this.f26647b1; i13++) {
                        this.f26646a1[i13].E();
                    }
                    int[] iArr = this.Z0;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    float f11 = this.J0;
                    e eVar3 = null;
                    int i16 = 0;
                    while (i16 < i14) {
                        if (z11) {
                            i10 = (i14 - i16) - 1;
                            f10 = 1.0f - this.J0;
                        } else {
                            f10 = f11;
                            i10 = i16;
                        }
                        e eVar4 = this.Y0[i10];
                        if (eVar4 != null && eVar4.f26592g0 != 8) {
                            d dVar2 = eVar4.I;
                            if (i16 == 0) {
                                eVar4.g(dVar2, this.I, this.f26652w0);
                                eVar4.f26596i0 = this.D0;
                                eVar4.f26586d0 = f10;
                            }
                            if (i16 == i14 - 1) {
                                eVar4.g(eVar4.K, this.K, this.f26653x0);
                            }
                            if (i16 > 0 && eVar3 != null) {
                                int i17 = this.P0;
                                d dVar3 = eVar3.K;
                                eVar4.g(dVar2, dVar3, i17);
                                eVar3.g(dVar3, dVar2, 0);
                            }
                            eVar3 = eVar4;
                        }
                        i16++;
                        f11 = f10;
                    }
                    for (int i18 = 0; i18 < i15; i18++) {
                        e eVar5 = this.X0[i18];
                        if (eVar5 != null && eVar5.f26592g0 != 8) {
                            d dVar4 = eVar5.J;
                            if (i18 == 0) {
                                eVar5.g(dVar4, this.J, this.f26648s0);
                                eVar5.f26598j0 = this.E0;
                                eVar5.f26588e0 = this.K0;
                            }
                            if (i18 == i15 - 1) {
                                eVar5.g(eVar5.L, this.L, this.f26649t0);
                            }
                            if (i18 > 0 && eVar3 != null) {
                                int i19 = this.Q0;
                                d dVar5 = eVar3.L;
                                eVar5.g(dVar4, dVar5, i19);
                                eVar3.g(dVar5, dVar4, 0);
                            }
                            eVar3 = eVar5;
                        }
                    }
                    for (int i20 = 0; i20 < i14; i20++) {
                        for (int i21 = 0; i21 < i15; i21++) {
                            int i22 = (i21 * i14) + i20;
                            if (this.V0 == 1) {
                                i22 = (i20 * i15) + i21;
                            }
                            e[] eVarArr = this.f26646a1;
                            if (i22 < eVarArr.length && (eVar = eVarArr[i22]) != null && eVar.f26592g0 != 8) {
                                e eVar6 = this.Y0[i20];
                                e eVar7 = this.X0[i21];
                                if (eVar != eVar6) {
                                    eVar.g(eVar.I, eVar6.I, 0);
                                    eVar.g(eVar.K, eVar6.K, 0);
                                }
                                if (eVar != eVar7) {
                                    eVar.g(eVar.J, eVar7.J, 0);
                                    eVar.g(eVar.L, eVar7.L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    g gVar2 = (g) arrayList.get(i23);
                    if (i23 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    gVar2.b(i23, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z11, true);
        }
        this.f26654y0 = false;
    }
}
