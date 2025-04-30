package C;

import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public g f371k;
    public a l;

    @Override // C.e
    public final void a(e eVar) {
        float f9;
        float f10;
        float f11;
        int i9;
        if (AbstractC2965e.d(this.f385j) != 3) {
            h hVar = this.f380e;
            if (hVar.f359c && !hVar.f366j && this.f379d == 3) {
                B.d dVar = this.b;
                int i10 = dVar.f166s;
                if (i10 != 2) {
                    if (i10 == 3) {
                        h hVar2 = dVar.f141d.f380e;
                        if (hVar2.f366j) {
                            int i11 = dVar.f133X;
                            if (i11 != -1) {
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        i9 = 0;
                                        hVar.d(i9);
                                    } else {
                                        f9 = hVar2.f363g;
                                        f10 = dVar.f132W;
                                    }
                                } else {
                                    f11 = hVar2.f363g * dVar.f132W;
                                    i9 = (int) (f11 + 0.5f);
                                    hVar.d(i9);
                                }
                            } else {
                                f9 = hVar2.f363g;
                                f10 = dVar.f132W;
                            }
                            f11 = f9 / f10;
                            i9 = (int) (f11 + 0.5f);
                            hVar.d(i9);
                        }
                    }
                } else {
                    B.d dVar2 = dVar.f129T;
                    if (dVar2 != null) {
                        if (dVar2.f143e.f380e.f366j) {
                            hVar.d((int) ((r5.f363g * dVar.f173z) + 0.5f));
                        }
                    }
                }
            }
            g gVar = this.f383h;
            if (gVar.f359c) {
                g gVar2 = this.f384i;
                if (gVar2.f359c) {
                    if (gVar.f366j && gVar2.f366j && hVar.f366j) {
                        return;
                    }
                    if (!hVar.f366j && this.f379d == 3) {
                        B.d dVar3 = this.b;
                        if (dVar3.f165r == 0 && !dVar3.y()) {
                            g gVar3 = (g) gVar.l.get(0);
                            g gVar4 = (g) gVar2.l.get(0);
                            int i12 = gVar3.f363g + gVar.f362f;
                            int i13 = gVar4.f363g + gVar2.f362f;
                            gVar.d(i12);
                            gVar2.d(i13);
                            hVar.d(i13 - i12);
                            return;
                        }
                    }
                    if (!hVar.f366j && this.f379d == 3 && this.f377a == 1 && gVar.l.size() > 0 && gVar2.l.size() > 0) {
                        g gVar5 = (g) gVar.l.get(0);
                        int i14 = (((g) gVar2.l.get(0)).f363g + gVar2.f362f) - (gVar5.f363g + gVar.f362f);
                        int i15 = hVar.m;
                        if (i14 < i15) {
                            hVar.d(i14);
                        } else {
                            hVar.d(i15);
                        }
                    }
                    if (hVar.f366j && gVar.l.size() > 0 && gVar2.l.size() > 0) {
                        g gVar6 = (g) gVar.l.get(0);
                        g gVar7 = (g) gVar2.l.get(0);
                        int i16 = gVar6.f363g;
                        int i17 = gVar.f362f + i16;
                        int i18 = gVar7.f363g;
                        int i19 = gVar2.f362f + i18;
                        float f12 = this.b.f144e0;
                        if (gVar6 == gVar7) {
                            f12 = 0.5f;
                        } else {
                            i16 = i17;
                            i18 = i19;
                        }
                        gVar.d((int) ((((i18 - i16) - hVar.f363g) * f12) + i16 + 0.5f));
                        gVar2.d(gVar.f363g + hVar.f363g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        B.d dVar4 = this.b;
        l(dVar4.f120J, dVar4.f122L, 1);
    }

    /* JADX WARN: Type inference failed for: r0v124, types: [C.a, C.h] */
    @Override // C.p
    public final void d() {
        B.d dVar;
        B.d dVar2;
        B.d dVar3;
        B.d dVar4;
        B.d dVar5 = this.b;
        boolean z8 = dVar5.f136a;
        h hVar = this.f380e;
        if (z8) {
            hVar.d(dVar5.k());
        }
        boolean z9 = hVar.f366j;
        g gVar = this.f384i;
        g gVar2 = this.f383h;
        if (!z9) {
            B.d dVar6 = this.b;
            this.f379d = dVar6.f163p0[1];
            if (dVar6.f115E) {
                this.l = new h(this);
            }
            int i9 = this.f379d;
            if (i9 != 3) {
                if (i9 == 4 && (dVar4 = this.b.f129T) != null && dVar4.f163p0[1] == 1) {
                    int k6 = (dVar4.k() - this.b.f120J.e()) - this.b.f122L.e();
                    p.b(gVar2, dVar4.f143e.f383h, this.b.f120J.e());
                    p.b(gVar, dVar4.f143e.f384i, -this.b.f122L.e());
                    hVar.d(k6);
                    return;
                }
                if (i9 == 1) {
                    hVar.d(this.b.k());
                }
            }
        } else if (this.f379d == 4 && (dVar2 = (dVar = this.b).f129T) != null && dVar2.f163p0[1] == 1) {
            p.b(gVar2, dVar2.f143e.f383h, dVar.f120J.e());
            p.b(gVar, dVar2.f143e.f384i, -this.b.f122L.e());
            return;
        }
        boolean z10 = hVar.f366j;
        g gVar3 = this.f371k;
        if (z10) {
            B.d dVar7 = this.b;
            if (dVar7.f136a) {
                B.c[] cVarArr = dVar7.f126Q;
                B.c cVar = cVarArr[2];
                B.c cVar2 = cVar.f107f;
                if (cVar2 != null && cVarArr[3].f107f != null) {
                    if (dVar7.y()) {
                        gVar2.f362f = this.b.f126Q[2].e();
                        gVar.f362f = -this.b.f126Q[3].e();
                    } else {
                        g h6 = p.h(this.b.f126Q[2]);
                        if (h6 != null) {
                            p.b(gVar2, h6, this.b.f126Q[2].e());
                        }
                        g h9 = p.h(this.b.f126Q[3]);
                        if (h9 != null) {
                            p.b(gVar, h9, -this.b.f126Q[3].e());
                        }
                        gVar2.b = true;
                        gVar.b = true;
                    }
                    B.d dVar8 = this.b;
                    if (dVar8.f115E) {
                        p.b(gVar3, gVar2, dVar8.f137a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    g h10 = p.h(cVar);
                    if (h10 != null) {
                        p.b(gVar2, h10, this.b.f126Q[2].e());
                        p.b(gVar, gVar2, hVar.f363g);
                        B.d dVar9 = this.b;
                        if (dVar9.f115E) {
                            p.b(gVar3, gVar2, dVar9.f137a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                B.c cVar3 = cVarArr[3];
                if (cVar3.f107f != null) {
                    g h11 = p.h(cVar3);
                    if (h11 != null) {
                        p.b(gVar, h11, -this.b.f126Q[3].e());
                        p.b(gVar2, gVar, -hVar.f363g);
                    }
                    B.d dVar10 = this.b;
                    if (dVar10.f115E) {
                        p.b(gVar3, gVar2, dVar10.f137a0);
                        return;
                    }
                    return;
                }
                B.c cVar4 = cVarArr[4];
                if (cVar4.f107f != null) {
                    g h12 = p.h(cVar4);
                    if (h12 != null) {
                        p.b(gVar3, h12, 0);
                        p.b(gVar2, gVar3, -this.b.f137a0);
                        p.b(gVar, gVar2, hVar.f363g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof B.i) && dVar7.f129T != null && dVar7.i(7).f107f == null) {
                    B.d dVar11 = this.b;
                    p.b(gVar2, dVar11.f129T.f143e.f383h, dVar11.s());
                    p.b(gVar, gVar2, hVar.f363g);
                    B.d dVar12 = this.b;
                    if (dVar12.f115E) {
                        p.b(gVar3, gVar2, dVar12.f137a0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z10 && this.f379d == 3) {
            B.d dVar13 = this.b;
            int i10 = dVar13.f166s;
            if (i10 != 2) {
                if (i10 == 3 && !dVar13.y()) {
                    B.d dVar14 = this.b;
                    if (dVar14.f165r != 3) {
                        h hVar2 = dVar14.f141d.f380e;
                        hVar.l.add(hVar2);
                        hVar2.f367k.add(hVar);
                        hVar.b = true;
                        hVar.f367k.add(gVar2);
                        hVar.f367k.add(gVar);
                    }
                }
            } else {
                B.d dVar15 = dVar13.f129T;
                if (dVar15 != null) {
                    h hVar3 = dVar15.f143e.f380e;
                    hVar.l.add(hVar3);
                    hVar3.f367k.add(hVar);
                    hVar.b = true;
                    hVar.f367k.add(gVar2);
                    hVar.f367k.add(gVar);
                }
            }
        } else {
            hVar.b(this);
        }
        B.d dVar16 = this.b;
        B.c[] cVarArr2 = dVar16.f126Q;
        B.c cVar5 = cVarArr2[2];
        B.c cVar6 = cVar5.f107f;
        if (cVar6 != null && cVarArr2[3].f107f != null) {
            if (dVar16.y()) {
                gVar2.f362f = this.b.f126Q[2].e();
                gVar.f362f = -this.b.f126Q[3].e();
            } else {
                g h13 = p.h(this.b.f126Q[2]);
                g h14 = p.h(this.b.f126Q[3]);
                if (h13 != null) {
                    h13.b(this);
                }
                if (h14 != null) {
                    h14.b(this);
                }
                this.f385j = 4;
            }
            if (this.b.f115E) {
                c(gVar3, gVar2, 1, this.l);
            }
        } else if (cVar6 != null) {
            g h15 = p.h(cVar5);
            if (h15 != null) {
                p.b(gVar2, h15, this.b.f126Q[2].e());
                c(gVar, gVar2, 1, hVar);
                if (this.b.f115E) {
                    c(gVar3, gVar2, 1, this.l);
                }
                if (this.f379d == 3) {
                    B.d dVar17 = this.b;
                    if (dVar17.f132W > 0.0f) {
                        l lVar = dVar17.f141d;
                        if (lVar.f379d == 3) {
                            lVar.f380e.f367k.add(hVar);
                            hVar.l.add(this.b.f141d.f380e);
                            hVar.f358a = this;
                        }
                    }
                }
            }
        } else {
            B.c cVar7 = cVarArr2[3];
            if (cVar7.f107f != null) {
                g h16 = p.h(cVar7);
                if (h16 != null) {
                    p.b(gVar, h16, -this.b.f126Q[3].e());
                    c(gVar2, gVar, -1, hVar);
                    if (this.b.f115E) {
                        c(gVar3, gVar2, 1, this.l);
                    }
                }
            } else {
                B.c cVar8 = cVarArr2[4];
                if (cVar8.f107f != null) {
                    g h17 = p.h(cVar8);
                    if (h17 != null) {
                        p.b(gVar3, h17, 0);
                        c(gVar2, gVar3, -1, this.l);
                        c(gVar, gVar2, 1, hVar);
                    }
                } else if (!(dVar16 instanceof B.i) && (dVar3 = dVar16.f129T) != null) {
                    p.b(gVar2, dVar3.f143e.f383h, dVar16.s());
                    c(gVar, gVar2, 1, hVar);
                    if (this.b.f115E) {
                        c(gVar3, gVar2, 1, this.l);
                    }
                    if (this.f379d == 3) {
                        B.d dVar18 = this.b;
                        if (dVar18.f132W > 0.0f) {
                            l lVar2 = dVar18.f141d;
                            if (lVar2.f379d == 3) {
                                lVar2.f380e.f367k.add(hVar);
                                hVar.l.add(this.b.f141d.f380e);
                                hVar.f358a = this;
                            }
                        }
                    }
                }
            }
        }
        if (hVar.l.size() == 0) {
            hVar.f359c = true;
        }
    }

    @Override // C.p
    public final void e() {
        g gVar = this.f383h;
        if (gVar.f366j) {
            this.b.f135Z = gVar.f363g;
        }
    }

    @Override // C.p
    public final void f() {
        this.f378c = null;
        this.f383h.c();
        this.f384i.c();
        this.f371k.c();
        this.f380e.c();
        this.f382g = false;
    }

    @Override // C.p
    public final boolean k() {
        if (this.f379d != 3 || this.b.f166s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f382g = false;
        g gVar = this.f383h;
        gVar.c();
        gVar.f366j = false;
        g gVar2 = this.f384i;
        gVar2.c();
        gVar2.f366j = false;
        g gVar3 = this.f371k;
        gVar3.c();
        gVar3.f366j = false;
        this.f380e.f366j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.f149h0;
    }
}
