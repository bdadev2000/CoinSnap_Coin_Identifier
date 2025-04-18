package x;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: k, reason: collision with root package name */
    public final f f27279k;

    /* renamed from: l, reason: collision with root package name */
    public a f27280l;

    public l(w.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f27279k = fVar;
        this.f27280l = null;
        this.f27299h.f27268e = 6;
        this.f27300i.f27268e = 7;
        fVar.f27268e = 8;
        this.f27297f = 1;
    }

    @Override // x.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (t.h.b(this.f27301j) != 3) {
            g gVar = this.f27296e;
            if (gVar.f27266c && !gVar.f27273j && this.f27295d == 3) {
                w.e eVar = this.f27293b;
                int i11 = eVar.f26613s;
                if (i11 != 2) {
                    if (i11 == 3) {
                        g gVar2 = eVar.f26585d.f27296e;
                        if (gVar2.f27273j) {
                            int i12 = eVar.X;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                        gVar.d(i10);
                                    } else {
                                        f10 = gVar2.f27270g;
                                        f11 = eVar.W;
                                    }
                                } else {
                                    f12 = gVar2.f27270g * eVar.W;
                                    i10 = (int) (f12 + 0.5f);
                                    gVar.d(i10);
                                }
                            } else {
                                f10 = gVar2.f27270g;
                                f11 = eVar.W;
                            }
                            f12 = f10 / f11;
                            i10 = (int) (f12 + 0.5f);
                            gVar.d(i10);
                        }
                    }
                } else {
                    w.e eVar2 = eVar.T;
                    if (eVar2 != null) {
                        if (eVar2.f26587e.f27296e.f27273j) {
                            gVar.d((int) ((r5.f27270g * eVar.f26619z) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.f27299h;
            if (fVar.f27266c) {
                f fVar2 = this.f27300i;
                if (fVar2.f27266c) {
                    if (fVar.f27273j && fVar2.f27273j && gVar.f27273j) {
                        return;
                    }
                    boolean z10 = gVar.f27273j;
                    ArrayList arrayList = fVar.f27275l;
                    ArrayList arrayList2 = fVar2.f27275l;
                    if (!z10 && this.f27295d == 3) {
                        w.e eVar3 = this.f27293b;
                        if (eVar3.f26612r == 0 && !eVar3.z()) {
                            f fVar3 = (f) arrayList.get(0);
                            f fVar4 = (f) arrayList2.get(0);
                            int i13 = fVar3.f27270g + fVar.f27269f;
                            int i14 = fVar4.f27270g + fVar2.f27269f;
                            fVar.d(i13);
                            fVar2.d(i14);
                            gVar.d(i14 - i13);
                            return;
                        }
                    }
                    if (!gVar.f27273j && this.f27295d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        f fVar5 = (f) arrayList.get(0);
                        int i15 = (((f) arrayList2.get(0)).f27270g + fVar2.f27269f) - (fVar5.f27270g + fVar.f27269f);
                        int i16 = gVar.f27276m;
                        if (i15 < i16) {
                            gVar.d(i15);
                        } else {
                            gVar.d(i16);
                        }
                    }
                    if (gVar.f27273j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        f fVar6 = (f) arrayList.get(0);
                        f fVar7 = (f) arrayList2.get(0);
                        int i17 = fVar6.f27270g;
                        int i18 = fVar.f27269f + i17;
                        int i19 = fVar7.f27270g;
                        int i20 = fVar2.f27269f + i19;
                        float f13 = this.f27293b.f26588e0;
                        if (fVar6 == fVar7) {
                            f13 = 0.5f;
                        } else {
                            i17 = i18;
                            i19 = i20;
                        }
                        fVar.d((int) ((((i19 - i17) - gVar.f27270g) * f13) + i17 + 0.5f));
                        fVar2.d(fVar.f27270g + gVar.f27270g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        w.e eVar4 = this.f27293b;
        l(eVar4.J, eVar4.L, 1);
    }

    @Override // x.o
    public final void d() {
        w.e eVar;
        w.e eVar2;
        w.e eVar3;
        w.e eVar4;
        w.e eVar5 = this.f27293b;
        boolean z10 = eVar5.a;
        g gVar = this.f27296e;
        if (z10) {
            gVar.d(eVar5.l());
        }
        boolean z11 = gVar.f27273j;
        f fVar = this.f27300i;
        f fVar2 = this.f27299h;
        if (!z11) {
            w.e eVar6 = this.f27293b;
            this.f27295d = eVar6.f26610p0[1];
            if (eVar6.E) {
                this.f27280l = new a(this);
            }
            int i10 = this.f27295d;
            if (i10 != 3) {
                if (i10 == 4 && (eVar4 = this.f27293b.T) != null && eVar4.f26610p0[1] == 1) {
                    int l10 = (eVar4.l() - this.f27293b.J.e()) - this.f27293b.L.e();
                    o.b(fVar2, eVar4.f26587e.f27299h, this.f27293b.J.e());
                    o.b(fVar, eVar4.f26587e.f27300i, -this.f27293b.L.e());
                    gVar.d(l10);
                    return;
                }
                if (i10 == 1) {
                    gVar.d(this.f27293b.l());
                }
            }
        } else if (this.f27295d == 4 && (eVar2 = (eVar = this.f27293b).T) != null && eVar2.f26610p0[1] == 1) {
            o.b(fVar2, eVar2.f26587e.f27299h, eVar.J.e());
            o.b(fVar, eVar2.f26587e.f27300i, -this.f27293b.L.e());
            return;
        }
        boolean z12 = gVar.f27273j;
        f fVar3 = this.f27279k;
        if (z12) {
            w.e eVar7 = this.f27293b;
            if (eVar7.a) {
                w.d[] dVarArr = eVar7.Q;
                w.d dVar = dVarArr[2];
                w.d dVar2 = dVar.f26576f;
                if (dVar2 != null && dVarArr[3].f26576f != null) {
                    if (eVar7.z()) {
                        fVar2.f27269f = this.f27293b.Q[2].e();
                        fVar.f27269f = -this.f27293b.Q[3].e();
                    } else {
                        f h10 = o.h(this.f27293b.Q[2]);
                        if (h10 != null) {
                            o.b(fVar2, h10, this.f27293b.Q[2].e());
                        }
                        f h11 = o.h(this.f27293b.Q[3]);
                        if (h11 != null) {
                            o.b(fVar, h11, -this.f27293b.Q[3].e());
                        }
                        fVar2.f27265b = true;
                        fVar.f27265b = true;
                    }
                    w.e eVar8 = this.f27293b;
                    if (eVar8.E) {
                        o.b(fVar3, fVar2, eVar8.f26580a0);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h12 = o.h(dVar);
                    if (h12 != null) {
                        o.b(fVar2, h12, this.f27293b.Q[2].e());
                        o.b(fVar, fVar2, gVar.f27270g);
                        w.e eVar9 = this.f27293b;
                        if (eVar9.E) {
                            o.b(fVar3, fVar2, eVar9.f26580a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w.d dVar3 = dVarArr[3];
                if (dVar3.f26576f != null) {
                    f h13 = o.h(dVar3);
                    if (h13 != null) {
                        o.b(fVar, h13, -this.f27293b.Q[3].e());
                        o.b(fVar2, fVar, -gVar.f27270g);
                    }
                    w.e eVar10 = this.f27293b;
                    if (eVar10.E) {
                        o.b(fVar3, fVar2, eVar10.f26580a0);
                        return;
                    }
                    return;
                }
                w.d dVar4 = dVarArr[4];
                if (dVar4.f26576f != null) {
                    f h14 = o.h(dVar4);
                    if (h14 != null) {
                        o.b(fVar3, h14, 0);
                        o.b(fVar2, fVar3, -this.f27293b.f26580a0);
                        o.b(fVar, fVar2, gVar.f27270g);
                        return;
                    }
                    return;
                }
                if (!(eVar7 instanceof w.j) && eVar7.T != null && eVar7.j(w.c.CENTER).f26576f == null) {
                    w.e eVar11 = this.f27293b;
                    o.b(fVar2, eVar11.T.f26587e.f27299h, eVar11.t());
                    o.b(fVar, fVar2, gVar.f27270g);
                    w.e eVar12 = this.f27293b;
                    if (eVar12.E) {
                        o.b(fVar3, fVar2, eVar12.f26580a0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = gVar.f27275l;
        if (!z12 && this.f27295d == 3) {
            w.e eVar13 = this.f27293b;
            int i11 = eVar13.f26613s;
            ArrayList arrayList2 = gVar.f27274k;
            if (i11 != 2) {
                if (i11 == 3 && !eVar13.z()) {
                    w.e eVar14 = this.f27293b;
                    if (eVar14.f26612r != 3) {
                        g gVar2 = eVar14.f26585d.f27296e;
                        arrayList.add(gVar2);
                        gVar2.f27274k.add(gVar);
                        gVar.f27265b = true;
                        arrayList2.add(fVar2);
                        arrayList2.add(fVar);
                    }
                }
            } else {
                w.e eVar15 = eVar13.T;
                if (eVar15 != null) {
                    g gVar3 = eVar15.f26587e.f27296e;
                    arrayList.add(gVar3);
                    gVar3.f27274k.add(gVar);
                    gVar.f27265b = true;
                    arrayList2.add(fVar2);
                    arrayList2.add(fVar);
                }
            }
        } else {
            gVar.b(this);
        }
        w.e eVar16 = this.f27293b;
        w.d[] dVarArr2 = eVar16.Q;
        w.d dVar5 = dVarArr2[2];
        w.d dVar6 = dVar5.f26576f;
        if (dVar6 != null && dVarArr2[3].f26576f != null) {
            if (eVar16.z()) {
                fVar2.f27269f = this.f27293b.Q[2].e();
                fVar.f27269f = -this.f27293b.Q[3].e();
            } else {
                f h15 = o.h(this.f27293b.Q[2]);
                f h16 = o.h(this.f27293b.Q[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f27301j = 4;
            }
            if (this.f27293b.E) {
                c(fVar3, fVar2, 1, this.f27280l);
            }
        } else if (dVar6 != null) {
            f h17 = o.h(dVar5);
            if (h17 != null) {
                o.b(fVar2, h17, this.f27293b.Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f27293b.E) {
                    c(fVar3, fVar2, 1, this.f27280l);
                }
                if (this.f27295d == 3) {
                    w.e eVar17 = this.f27293b;
                    if (eVar17.W > 0.0f) {
                        j jVar = eVar17.f26585d;
                        if (jVar.f27295d == 3) {
                            jVar.f27296e.f27274k.add(gVar);
                            arrayList.add(this.f27293b.f26585d.f27296e);
                            gVar.a = this;
                        }
                    }
                }
            }
        } else {
            w.d dVar7 = dVarArr2[3];
            if (dVar7.f26576f != null) {
                f h18 = o.h(dVar7);
                if (h18 != null) {
                    o.b(fVar, h18, -this.f27293b.Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f27293b.E) {
                        c(fVar3, fVar2, 1, this.f27280l);
                    }
                }
            } else {
                w.d dVar8 = dVarArr2[4];
                if (dVar8.f26576f != null) {
                    f h19 = o.h(dVar8);
                    if (h19 != null) {
                        o.b(fVar3, h19, 0);
                        c(fVar2, fVar3, -1, this.f27280l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(eVar16 instanceof w.j) && (eVar3 = eVar16.T) != null) {
                    o.b(fVar2, eVar3.f26587e.f27299h, eVar16.t());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f27293b.E) {
                        c(fVar3, fVar2, 1, this.f27280l);
                    }
                    if (this.f27295d == 3) {
                        w.e eVar18 = this.f27293b;
                        if (eVar18.W > 0.0f) {
                            j jVar2 = eVar18.f26585d;
                            if (jVar2.f27295d == 3) {
                                jVar2.f27296e.f27274k.add(gVar);
                                arrayList.add(this.f27293b.f26585d.f27296e);
                                gVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            gVar.f27266c = true;
        }
    }

    @Override // x.o
    public final void e() {
        f fVar = this.f27299h;
        if (fVar.f27273j) {
            this.f27293b.Z = fVar.f27270g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f27294c = null;
        this.f27299h.c();
        this.f27300i.c();
        this.f27279k.c();
        this.f27296e.c();
        this.f27298g = false;
    }

    @Override // x.o
    public final boolean k() {
        if (this.f27295d != 3 || this.f27293b.f26613s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f27298g = false;
        f fVar = this.f27299h;
        fVar.c();
        fVar.f27273j = false;
        f fVar2 = this.f27300i;
        fVar2.c();
        fVar2.f27273j = false;
        f fVar3 = this.f27279k;
        fVar3.c();
        fVar3.f27273j = false;
        this.f27296e.f27273j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f27293b.f26594h0;
    }
}
