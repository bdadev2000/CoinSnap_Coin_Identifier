package w;

/* loaded from: classes.dex */
public final class g {
    public int a;

    /* renamed from: d, reason: collision with root package name */
    public d f26631d;

    /* renamed from: e, reason: collision with root package name */
    public d f26632e;

    /* renamed from: f, reason: collision with root package name */
    public d f26633f;

    /* renamed from: g, reason: collision with root package name */
    public d f26634g;

    /* renamed from: h, reason: collision with root package name */
    public int f26635h;

    /* renamed from: i, reason: collision with root package name */
    public int f26636i;

    /* renamed from: j, reason: collision with root package name */
    public int f26637j;

    /* renamed from: k, reason: collision with root package name */
    public int f26638k;

    /* renamed from: q, reason: collision with root package name */
    public int f26644q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f26645r;

    /* renamed from: b, reason: collision with root package name */
    public e f26629b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f26630c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f26639l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f26640m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f26641n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f26642o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f26643p = 0;

    public g(h hVar, int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
        this.f26645r = hVar;
        this.f26635h = 0;
        this.f26636i = 0;
        this.f26637j = 0;
        this.f26638k = 0;
        this.f26644q = 0;
        this.a = i10;
        this.f26631d = dVar;
        this.f26632e = dVar2;
        this.f26633f = dVar3;
        this.f26634g = dVar4;
        this.f26635h = hVar.f26652w0;
        this.f26636i = hVar.f26648s0;
        this.f26637j = hVar.f26653x0;
        this.f26638k = hVar.f26649t0;
        this.f26644q = i11;
    }

    public final void a(e eVar) {
        int i10 = this.a;
        int i11 = 0;
        h hVar = this.f26645r;
        if (i10 == 0) {
            int T = hVar.T(this.f26644q, eVar);
            if (eVar.f26610p0[0] == 3) {
                this.f26643p++;
                T = 0;
            }
            int i12 = hVar.P0;
            if (eVar.f26592g0 != 8) {
                i11 = i12;
            }
            this.f26639l = T + i11 + this.f26639l;
            int S = hVar.S(this.f26644q, eVar);
            if (this.f26629b == null || this.f26630c < S) {
                this.f26629b = eVar;
                this.f26630c = S;
                this.f26640m = S;
            }
        } else {
            int T2 = hVar.T(this.f26644q, eVar);
            int S2 = hVar.S(this.f26644q, eVar);
            if (eVar.f26610p0[1] == 3) {
                this.f26643p++;
                S2 = 0;
            }
            int i13 = hVar.Q0;
            if (eVar.f26592g0 != 8) {
                i11 = i13;
            }
            this.f26640m = S2 + i11 + this.f26640m;
            if (this.f26629b == null || this.f26630c < T2) {
                this.f26629b = eVar;
                this.f26630c = T2;
                this.f26639l = T2;
            }
        }
        this.f26642o++;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        h hVar;
        boolean z12;
        int i11;
        int i12;
        int i13;
        e eVar;
        int i14;
        int i15;
        char c10;
        int i16;
        float f10;
        float f11;
        int i17;
        float f12;
        float f13;
        int i18;
        int i19;
        int i20;
        int i21 = this.f26642o;
        int i22 = 0;
        while (true) {
            hVar = this.f26645r;
            if (i22 >= i21 || (i20 = this.f26641n + i22) >= hVar.f26647b1) {
                break;
            }
            e eVar2 = hVar.f26646a1[i20];
            if (eVar2 != null) {
                eVar2.E();
            }
            i22++;
        }
        if (i21 != 0 && this.f26629b != null) {
            if (z11 && i10 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i23 = -1;
            int i24 = -1;
            for (int i25 = 0; i25 < i21; i25++) {
                if (z10) {
                    i19 = (i21 - 1) - i25;
                } else {
                    i19 = i25;
                }
                int i26 = this.f26641n + i19;
                if (i26 >= hVar.f26647b1) {
                    break;
                }
                e eVar3 = hVar.f26646a1[i26];
                if (eVar3 != null && eVar3.f26592g0 == 0) {
                    if (i23 == -1) {
                        i23 = i25;
                    }
                    i24 = i25;
                }
            }
            if (this.a == 0) {
                e eVar4 = this.f26629b;
                eVar4.f26598j0 = hVar.E0;
                int i27 = this.f26636i;
                if (i10 > 0) {
                    i27 += hVar.Q0;
                }
                d dVar = this.f26632e;
                d dVar2 = eVar4.J;
                dVar2.a(dVar, i27);
                d dVar3 = eVar4.L;
                if (z11) {
                    dVar3.a(this.f26634g, this.f26638k);
                }
                if (i10 > 0) {
                    this.f26632e.f26574d.L.a(dVar2, 0);
                }
                if (hVar.S0 == 3 && !eVar4.E) {
                    for (int i28 = 0; i28 < i21; i28++) {
                        if (z10) {
                            i18 = (i21 - 1) - i28;
                        } else {
                            i18 = i28;
                        }
                        int i29 = this.f26641n + i18;
                        if (i29 >= hVar.f26647b1) {
                            break;
                        }
                        eVar = hVar.f26646a1[i29];
                        if (eVar.E) {
                            break;
                        }
                    }
                }
                eVar = eVar4;
                int i30 = 0;
                e eVar5 = null;
                while (i30 < i21) {
                    if (z10) {
                        i14 = (i21 - 1) - i30;
                    } else {
                        i14 = i30;
                    }
                    int i31 = this.f26641n + i14;
                    if (i31 < hVar.f26647b1) {
                        e eVar6 = hVar.f26646a1[i31];
                        if (eVar6 == null) {
                            i15 = i21;
                            c10 = 3;
                        } else {
                            d dVar4 = eVar6.I;
                            if (i30 == 0) {
                                eVar6.g(dVar4, this.f26631d, this.f26635h);
                            }
                            if (i14 == 0) {
                                int i32 = hVar.D0;
                                if (z10) {
                                    i16 = i32;
                                    f10 = 1.0f - hVar.J0;
                                } else {
                                    i16 = i32;
                                    f10 = hVar.J0;
                                }
                                if (this.f26641n == 0) {
                                    int i33 = hVar.F0;
                                    f11 = f10;
                                    if (i33 != -1) {
                                        if (z10) {
                                            f13 = 1.0f - hVar.L0;
                                        } else {
                                            f13 = hVar.L0;
                                        }
                                        f12 = f13;
                                        i17 = i33;
                                        eVar6.f26596i0 = i17;
                                        eVar6.f26586d0 = f12;
                                    }
                                } else {
                                    f11 = f10;
                                }
                                if (z11 && (i17 = hVar.H0) != -1) {
                                    if (z10) {
                                        f12 = 1.0f - hVar.N0;
                                    } else {
                                        f12 = hVar.N0;
                                    }
                                } else {
                                    i17 = i16;
                                    f12 = f11;
                                }
                                eVar6.f26596i0 = i17;
                                eVar6.f26586d0 = f12;
                            }
                            if (i30 == i21 - 1) {
                                i15 = i21;
                                eVar6.g(eVar6.K, this.f26633f, this.f26637j);
                            } else {
                                i15 = i21;
                            }
                            if (eVar5 != null) {
                                int i34 = hVar.P0;
                                d dVar5 = eVar5.K;
                                dVar4.a(dVar5, i34);
                                if (i30 == i23) {
                                    int i35 = this.f26635h;
                                    if (dVar4.h()) {
                                        dVar4.f26578h = i35;
                                    }
                                }
                                dVar5.a(dVar4, 0);
                                if (i30 == i24 + 1) {
                                    int i36 = this.f26637j;
                                    if (dVar5.h()) {
                                        dVar5.f26578h = i36;
                                    }
                                }
                            }
                            if (eVar6 != eVar4) {
                                int i37 = hVar.S0;
                                c10 = 3;
                                if (i37 == 3 && eVar.E && eVar6 != eVar && eVar6.E) {
                                    eVar6.M.a(eVar.M, 0);
                                } else {
                                    d dVar6 = eVar6.J;
                                    if (i37 != 0) {
                                        d dVar7 = eVar6.L;
                                        if (i37 != 1) {
                                            if (z12) {
                                                dVar6.a(this.f26632e, this.f26636i);
                                                dVar7.a(this.f26634g, this.f26638k);
                                            } else {
                                                dVar6.a(dVar2, 0);
                                                dVar7.a(dVar3, 0);
                                            }
                                        } else {
                                            dVar7.a(dVar3, 0);
                                        }
                                    } else {
                                        dVar6.a(dVar2, 0);
                                    }
                                }
                            } else {
                                c10 = 3;
                            }
                            eVar5 = eVar6;
                        }
                        i30++;
                        i21 = i15;
                    } else {
                        return;
                    }
                }
                return;
            }
            e eVar7 = this.f26629b;
            eVar7.f26596i0 = hVar.D0;
            int i38 = this.f26635h;
            if (i10 > 0) {
                i38 += hVar.P0;
            }
            d dVar8 = eVar7.K;
            d dVar9 = eVar7.I;
            if (z10) {
                dVar8.a(this.f26633f, i38);
                if (z11) {
                    dVar9.a(this.f26631d, this.f26637j);
                }
                if (i10 > 0) {
                    this.f26633f.f26574d.I.a(dVar8, 0);
                }
            } else {
                dVar9.a(this.f26631d, i38);
                if (z11) {
                    dVar8.a(this.f26633f, this.f26637j);
                }
                if (i10 > 0) {
                    this.f26631d.f26574d.K.a(dVar9, 0);
                }
            }
            int i39 = 0;
            e eVar8 = null;
            while (i39 < i21) {
                int i40 = this.f26641n + i39;
                if (i40 < hVar.f26647b1) {
                    e eVar9 = hVar.f26646a1[i40];
                    if (eVar9 == null) {
                        eVar9 = eVar8;
                    } else {
                        d dVar10 = eVar9.J;
                        if (i39 == 0) {
                            eVar9.g(dVar10, this.f26632e, this.f26636i);
                            int i41 = hVar.E0;
                            float f14 = hVar.K0;
                            if (this.f26641n == 0) {
                                i13 = hVar.G0;
                                i11 = i41;
                                i12 = -1;
                                if (i13 != -1) {
                                    f14 = hVar.M0;
                                    eVar9.f26598j0 = i13;
                                    eVar9.f26588e0 = f14;
                                }
                            } else {
                                i11 = i41;
                                i12 = -1;
                            }
                            if (z11 && (i13 = hVar.I0) != i12) {
                                f14 = hVar.O0;
                            } else {
                                i13 = i11;
                            }
                            eVar9.f26598j0 = i13;
                            eVar9.f26588e0 = f14;
                        }
                        if (i39 == i21 - 1) {
                            eVar9.g(eVar9.L, this.f26634g, this.f26638k);
                        }
                        if (eVar8 != null) {
                            int i42 = hVar.Q0;
                            d dVar11 = eVar8.L;
                            dVar10.a(dVar11, i42);
                            if (i39 == i23) {
                                int i43 = this.f26636i;
                                if (dVar10.h()) {
                                    dVar10.f26578h = i43;
                                }
                            }
                            dVar11.a(dVar10, 0);
                            if (i39 == i24 + 1) {
                                int i44 = this.f26638k;
                                if (dVar11.h()) {
                                    dVar11.f26578h = i44;
                                }
                            }
                        }
                        if (eVar9 != eVar7) {
                            d dVar12 = eVar9.K;
                            d dVar13 = eVar9.I;
                            if (z10) {
                                int i45 = hVar.R0;
                                if (i45 != 0) {
                                    if (i45 != 1) {
                                        if (i45 == 2) {
                                            dVar13.a(dVar9, 0);
                                            dVar12.a(dVar8, 0);
                                        }
                                    } else {
                                        dVar13.a(dVar9, 0);
                                    }
                                } else {
                                    dVar12.a(dVar8, 0);
                                }
                                i39++;
                                eVar8 = eVar9;
                            } else {
                                int i46 = hVar.R0;
                                if (i46 != 0) {
                                    if (i46 != 1) {
                                        if (i46 == 2) {
                                            if (z12) {
                                                dVar13.a(this.f26631d, this.f26635h);
                                                dVar12.a(this.f26633f, this.f26637j);
                                            } else {
                                                dVar13.a(dVar9, 0);
                                                dVar12.a(dVar8, 0);
                                            }
                                        }
                                    } else {
                                        dVar12.a(dVar8, 0);
                                    }
                                } else {
                                    dVar13.a(dVar9, 0);
                                }
                                i39++;
                                eVar8 = eVar9;
                            }
                        }
                    }
                    i39++;
                    eVar8 = eVar9;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.a == 1) {
            return this.f26640m - this.f26645r.Q0;
        }
        return this.f26640m;
    }

    public final int d() {
        if (this.a == 0) {
            return this.f26639l - this.f26645r.P0;
        }
        return this.f26639l;
    }

    public final void e(int i10) {
        h hVar;
        int i11;
        int i12 = this.f26643p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f26642o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            hVar = this.f26645r;
            if (i15 >= i13 || (i11 = this.f26641n + i15) >= hVar.f26647b1) {
                break;
            }
            e eVar = hVar.f26646a1[i11];
            if (this.a == 0) {
                if (eVar != null) {
                    int[] iArr = eVar.f26610p0;
                    if (iArr[0] == 3 && eVar.f26612r == 0) {
                        hVar.U(eVar, 1, i14, iArr[1], eVar.l());
                    }
                }
            } else if (eVar != null) {
                int[] iArr2 = eVar.f26610p0;
                if (iArr2[1] == 3 && eVar.f26613s == 0) {
                    hVar.U(eVar, iArr2[0], eVar.r(), 1, i14);
                }
            }
            i15++;
        }
        this.f26639l = 0;
        this.f26640m = 0;
        this.f26629b = null;
        this.f26630c = 0;
        int i16 = this.f26642o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f26641n + i17;
            if (i18 < hVar.f26647b1) {
                e eVar2 = hVar.f26646a1[i18];
                if (this.a == 0) {
                    int r6 = eVar2.r();
                    int i19 = hVar.P0;
                    if (eVar2.f26592g0 == 8) {
                        i19 = 0;
                    }
                    this.f26639l = r6 + i19 + this.f26639l;
                    int S = hVar.S(this.f26644q, eVar2);
                    if (this.f26629b == null || this.f26630c < S) {
                        this.f26629b = eVar2;
                        this.f26630c = S;
                        this.f26640m = S;
                    }
                } else {
                    int T = hVar.T(this.f26644q, eVar2);
                    int S2 = hVar.S(this.f26644q, eVar2);
                    int i20 = hVar.Q0;
                    if (eVar2.f26592g0 == 8) {
                        i20 = 0;
                    }
                    this.f26640m = S2 + i20 + this.f26640m;
                    if (this.f26629b == null || this.f26630c < T) {
                        this.f26629b = eVar2;
                        this.f26630c = T;
                        this.f26639l = T;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void f(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
        this.a = i10;
        this.f26631d = dVar;
        this.f26632e = dVar2;
        this.f26633f = dVar3;
        this.f26634g = dVar4;
        this.f26635h = i11;
        this.f26636i = i12;
        this.f26637j = i13;
        this.f26638k = i14;
        this.f26644q = i15;
    }
}
