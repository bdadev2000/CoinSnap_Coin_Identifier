package B;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f195a;

    /* renamed from: d, reason: collision with root package name */
    public c f197d;

    /* renamed from: e, reason: collision with root package name */
    public c f198e;

    /* renamed from: f, reason: collision with root package name */
    public c f199f;

    /* renamed from: g, reason: collision with root package name */
    public c f200g;

    /* renamed from: h, reason: collision with root package name */
    public int f201h;

    /* renamed from: i, reason: collision with root package name */
    public int f202i;

    /* renamed from: j, reason: collision with root package name */
    public int f203j;

    /* renamed from: k, reason: collision with root package name */
    public int f204k;

    /* renamed from: q, reason: collision with root package name */
    public int f208q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f209r;
    public d b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f196c = 0;
    public int l = 0;
    public int m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f205n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f206o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f207p = 0;

    public f(g gVar, int i9, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f209r = gVar;
        this.f201h = 0;
        this.f202i = 0;
        this.f203j = 0;
        this.f204k = 0;
        this.f208q = 0;
        this.f195a = i9;
        this.f197d = cVar;
        this.f198e = cVar2;
        this.f199f = cVar3;
        this.f200g = cVar4;
        this.f201h = gVar.f240w0;
        this.f202i = gVar.f236s0;
        this.f203j = gVar.f241x0;
        this.f204k = gVar.f237t0;
        this.f208q = i10;
    }

    public final void a(d dVar) {
        int i9 = this.f195a;
        int i10 = 0;
        g gVar = this.f209r;
        if (i9 == 0) {
            int U8 = gVar.U(dVar, this.f208q);
            if (dVar.f163p0[0] == 3) {
                this.f207p++;
                U8 = 0;
            }
            int i11 = gVar.P0;
            if (dVar.f147g0 != 8) {
                i10 = i11;
            }
            this.l = U8 + i10 + this.l;
            int T2 = gVar.T(dVar, this.f208q);
            if (this.b == null || this.f196c < T2) {
                this.b = dVar;
                this.f196c = T2;
                this.m = T2;
            }
        } else {
            int U9 = gVar.U(dVar, this.f208q);
            int T8 = gVar.T(dVar, this.f208q);
            if (dVar.f163p0[1] == 3) {
                this.f207p++;
                T8 = 0;
            }
            int i12 = gVar.f224Q0;
            if (dVar.f147g0 != 8) {
                i10 = i12;
            }
            this.m = T8 + i10 + this.m;
            if (this.b == null || this.f196c < U9) {
                this.b = dVar;
                this.f196c = U9;
                this.l = U9;
            }
        }
        this.f206o++;
    }

    public final void b(boolean z8, int i9, boolean z9) {
        g gVar;
        boolean z10;
        int i10;
        int i11;
        int i12;
        d dVar;
        int i13;
        int i14;
        char c9;
        int i15;
        float f9;
        float f10;
        int i16;
        float f11;
        float f12;
        int i17;
        int i18;
        int i19;
        int i20 = this.f206o;
        int i21 = 0;
        while (true) {
            gVar = this.f209r;
            if (i21 >= i20 || (i19 = this.f205n + i21) >= gVar.f235b1) {
                break;
            }
            d dVar2 = gVar.f234a1[i19];
            if (dVar2 != null) {
                dVar2.D();
            }
            i21++;
        }
        if (i20 != 0 && this.b != null) {
            if (z9 && i9 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i22 = -1;
            int i23 = -1;
            for (int i24 = 0; i24 < i20; i24++) {
                if (z8) {
                    i18 = (i20 - 1) - i24;
                } else {
                    i18 = i24;
                }
                int i25 = this.f205n + i18;
                if (i25 >= gVar.f235b1) {
                    break;
                }
                d dVar3 = gVar.f234a1[i25];
                if (dVar3 != null && dVar3.f147g0 == 0) {
                    if (i22 == -1) {
                        i22 = i24;
                    }
                    i23 = i24;
                }
            }
            if (this.f195a == 0) {
                d dVar4 = this.b;
                dVar4.f153j0 = gVar.f214E0;
                int i26 = this.f202i;
                if (i9 > 0) {
                    i26 += gVar.f224Q0;
                }
                c cVar = this.f198e;
                c cVar2 = dVar4.f120J;
                cVar2.a(cVar, i26);
                c cVar3 = dVar4.f122L;
                if (z9) {
                    cVar3.a(this.f200g, this.f204k);
                }
                if (i9 > 0) {
                    this.f198e.f105d.f122L.a(cVar2, 0);
                }
                if (gVar.f226S0 == 3 && !dVar4.f115E) {
                    for (int i27 = 0; i27 < i20; i27++) {
                        if (z8) {
                            i17 = (i20 - 1) - i27;
                        } else {
                            i17 = i27;
                        }
                        int i28 = this.f205n + i17;
                        if (i28 >= gVar.f235b1) {
                            break;
                        }
                        dVar = gVar.f234a1[i28];
                        if (dVar.f115E) {
                            break;
                        }
                    }
                }
                dVar = dVar4;
                int i29 = 0;
                d dVar5 = null;
                while (i29 < i20) {
                    if (z8) {
                        i13 = (i20 - 1) - i29;
                    } else {
                        i13 = i29;
                    }
                    int i30 = this.f205n + i13;
                    if (i30 < gVar.f235b1) {
                        d dVar6 = gVar.f234a1[i30];
                        if (dVar6 == null) {
                            i14 = i20;
                            c9 = 3;
                        } else {
                            c cVar4 = dVar6.f119I;
                            if (i29 == 0) {
                                dVar6.f(cVar4, this.f197d, this.f201h);
                            }
                            if (i13 == 0) {
                                int i31 = gVar.f213D0;
                                if (z8) {
                                    i15 = i31;
                                    f9 = 1.0f - gVar.f219J0;
                                } else {
                                    i15 = i31;
                                    f9 = gVar.f219J0;
                                }
                                if (this.f205n == 0) {
                                    int i32 = gVar.f215F0;
                                    f10 = f9;
                                    if (i32 != -1) {
                                        if (z8) {
                                            f12 = 1.0f - gVar.f220L0;
                                        } else {
                                            f12 = gVar.f220L0;
                                        }
                                        f11 = f12;
                                        i16 = i32;
                                        dVar6.f151i0 = i16;
                                        dVar6.f142d0 = f11;
                                    }
                                } else {
                                    f10 = f9;
                                }
                                if (z9 && (i16 = gVar.f217H0) != -1) {
                                    if (z8) {
                                        f11 = 1.0f - gVar.f222N0;
                                    } else {
                                        f11 = gVar.f222N0;
                                    }
                                } else {
                                    i16 = i15;
                                    f11 = f10;
                                }
                                dVar6.f151i0 = i16;
                                dVar6.f142d0 = f11;
                            }
                            if (i29 == i20 - 1) {
                                i14 = i20;
                                dVar6.f(dVar6.f121K, this.f199f, this.f203j);
                            } else {
                                i14 = i20;
                            }
                            if (dVar5 != null) {
                                int i33 = gVar.P0;
                                c cVar5 = dVar5.f121K;
                                cVar4.a(cVar5, i33);
                                if (i29 == i22) {
                                    int i34 = this.f201h;
                                    if (cVar4.h()) {
                                        cVar4.f109h = i34;
                                    }
                                }
                                cVar5.a(cVar4, 0);
                                if (i29 == i23 + 1) {
                                    int i35 = this.f203j;
                                    if (cVar5.h()) {
                                        cVar5.f109h = i35;
                                    }
                                }
                            }
                            if (dVar6 != dVar4) {
                                int i36 = gVar.f226S0;
                                c9 = 3;
                                if (i36 == 3 && dVar.f115E && dVar6 != dVar && dVar6.f115E) {
                                    dVar6.f123M.a(dVar.f123M, 0);
                                } else {
                                    c cVar6 = dVar6.f120J;
                                    if (i36 != 0) {
                                        c cVar7 = dVar6.f122L;
                                        if (i36 != 1) {
                                            if (z10) {
                                                cVar6.a(this.f198e, this.f202i);
                                                cVar7.a(this.f200g, this.f204k);
                                            } else {
                                                cVar6.a(cVar2, 0);
                                                cVar7.a(cVar3, 0);
                                            }
                                        } else {
                                            cVar7.a(cVar3, 0);
                                        }
                                    } else {
                                        cVar6.a(cVar2, 0);
                                    }
                                }
                            } else {
                                c9 = 3;
                            }
                            dVar5 = dVar6;
                        }
                        i29++;
                        i20 = i14;
                    } else {
                        return;
                    }
                }
                return;
            }
            d dVar7 = this.b;
            dVar7.f151i0 = gVar.f213D0;
            int i37 = this.f201h;
            if (i9 > 0) {
                i37 += gVar.P0;
            }
            c cVar8 = dVar7.f119I;
            c cVar9 = dVar7.f121K;
            if (z8) {
                cVar9.a(this.f199f, i37);
                if (z9) {
                    cVar8.a(this.f197d, this.f203j);
                }
                if (i9 > 0) {
                    this.f199f.f105d.f119I.a(cVar9, 0);
                }
            } else {
                cVar8.a(this.f197d, i37);
                if (z9) {
                    cVar9.a(this.f199f, this.f203j);
                }
                if (i9 > 0) {
                    this.f197d.f105d.f121K.a(cVar8, 0);
                }
            }
            d dVar8 = null;
            for (int i38 = 0; i38 < i20; i38++) {
                int i39 = this.f205n + i38;
                if (i39 < gVar.f235b1) {
                    d dVar9 = gVar.f234a1[i39];
                    if (dVar9 != null) {
                        c cVar10 = dVar9.f120J;
                        if (i38 == 0) {
                            dVar9.f(cVar10, this.f198e, this.f202i);
                            int i40 = gVar.f214E0;
                            float f13 = gVar.K0;
                            if (this.f205n == 0) {
                                i12 = gVar.f216G0;
                                i10 = i40;
                                i11 = -1;
                                if (i12 != -1) {
                                    f13 = gVar.f221M0;
                                    dVar9.f153j0 = i12;
                                    dVar9.f144e0 = f13;
                                }
                            } else {
                                i10 = i40;
                                i11 = -1;
                            }
                            if (z9 && (i12 = gVar.f218I0) != i11) {
                                f13 = gVar.f223O0;
                            } else {
                                i12 = i10;
                            }
                            dVar9.f153j0 = i12;
                            dVar9.f144e0 = f13;
                        }
                        if (i38 == i20 - 1) {
                            dVar9.f(dVar9.f122L, this.f200g, this.f204k);
                        }
                        if (dVar8 != null) {
                            int i41 = gVar.f224Q0;
                            c cVar11 = dVar8.f122L;
                            cVar10.a(cVar11, i41);
                            if (i38 == i22) {
                                int i42 = this.f202i;
                                if (cVar10.h()) {
                                    cVar10.f109h = i42;
                                }
                            }
                            cVar11.a(cVar10, 0);
                            if (i38 == i23 + 1) {
                                int i43 = this.f204k;
                                if (cVar11.h()) {
                                    cVar11.f109h = i43;
                                }
                            }
                        }
                        if (dVar9 != dVar7) {
                            c cVar12 = dVar9.f121K;
                            c cVar13 = dVar9.f119I;
                            if (z8) {
                                int i44 = gVar.f225R0;
                                if (i44 != 0) {
                                    if (i44 != 1) {
                                        if (i44 == 2) {
                                            cVar13.a(cVar8, 0);
                                            cVar12.a(cVar9, 0);
                                        }
                                    } else {
                                        cVar13.a(cVar8, 0);
                                    }
                                } else {
                                    cVar12.a(cVar9, 0);
                                }
                            } else {
                                int i45 = gVar.f225R0;
                                if (i45 != 0) {
                                    if (i45 != 1) {
                                        if (i45 == 2) {
                                            if (z10) {
                                                cVar13.a(this.f197d, this.f201h);
                                                cVar12.a(this.f199f, this.f203j);
                                            } else {
                                                cVar13.a(cVar8, 0);
                                                cVar12.a(cVar9, 0);
                                            }
                                        }
                                    } else {
                                        cVar12.a(cVar9, 0);
                                    }
                                } else {
                                    cVar13.a(cVar8, 0);
                                }
                                dVar8 = dVar9;
                            }
                        }
                        dVar8 = dVar9;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f195a == 1) {
            return this.m - this.f209r.f224Q0;
        }
        return this.m;
    }

    public final int d() {
        if (this.f195a == 0) {
            return this.l - this.f209r.P0;
        }
        return this.l;
    }

    public final void e(int i9) {
        g gVar;
        int i10;
        int i11 = this.f207p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f206o;
        int i13 = i9 / i11;
        int i14 = 0;
        while (true) {
            gVar = this.f209r;
            if (i14 >= i12 || (i10 = this.f205n + i14) >= gVar.f235b1) {
                break;
            }
            d dVar = gVar.f234a1[i10];
            if (this.f195a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f163p0;
                    if (iArr[0] == 3 && dVar.f165r == 0) {
                        gVar.W(1, i13, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f163p0;
                if (iArr2[1] == 3 && dVar.f166s == 0) {
                    gVar.W(iArr2[0], dVar.q(), 1, i13, dVar);
                }
            }
            i14++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.f196c = 0;
        int i15 = this.f206o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f205n + i16;
            if (i17 < gVar.f235b1) {
                d dVar2 = gVar.f234a1[i17];
                if (this.f195a == 0) {
                    int q9 = dVar2.q();
                    int i18 = gVar.P0;
                    if (dVar2.f147g0 == 8) {
                        i18 = 0;
                    }
                    this.l = q9 + i18 + this.l;
                    int T2 = gVar.T(dVar2, this.f208q);
                    if (this.b == null || this.f196c < T2) {
                        this.b = dVar2;
                        this.f196c = T2;
                        this.m = T2;
                    }
                } else {
                    int U8 = gVar.U(dVar2, this.f208q);
                    int T8 = gVar.T(dVar2, this.f208q);
                    int i19 = gVar.f224Q0;
                    if (dVar2.f147g0 == 8) {
                        i19 = 0;
                    }
                    this.m = T8 + i19 + this.m;
                    if (this.b == null || this.f196c < U8) {
                        this.b = dVar2;
                        this.f196c = U8;
                        this.l = U8;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void f(int i9, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f195a = i9;
        this.f197d = cVar;
        this.f198e = cVar2;
        this.f199f = cVar3;
        this.f200g = cVar4;
        this.f201h = i10;
        this.f202i = i11;
        this.f203j = i12;
        this.f204k = i13;
        this.f208q = i14;
    }
}
