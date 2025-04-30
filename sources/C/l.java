package C;

/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f369k = new int[2];

    public static void m(int[] iArr, int i9, int i10, int i11, int i12, float f9, int i13) {
        int i14 = i10 - i9;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    iArr[0] = i14;
                    iArr[1] = (int) ((i14 * f9) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i15 * f9) + 0.5f);
            iArr[1] = i15;
            return;
        }
        int i16 = (int) ((i15 * f9) + 0.5f);
        int i17 = (int) ((i14 / f9) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // C.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(C.e r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.l.a(C.e):void");
    }

    @Override // C.p
    public final void d() {
        B.d dVar;
        B.d dVar2;
        int i9;
        B.d dVar3;
        B.d dVar4;
        int i10;
        B.d dVar5 = this.b;
        boolean z8 = dVar5.f136a;
        h hVar = this.f380e;
        if (z8) {
            hVar.d(dVar5.q());
        }
        boolean z9 = hVar.f366j;
        g gVar = this.f384i;
        g gVar2 = this.f383h;
        if (!z9) {
            B.d dVar6 = this.b;
            int i11 = dVar6.f163p0[0];
            this.f379d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.f129T) != null && ((i10 = dVar4.f163p0[0]) == 1 || i10 == 4)) {
                    int q9 = (dVar4.q() - this.b.f119I.e()) - this.b.f121K.e();
                    p.b(gVar2, dVar4.f141d.f383h, this.b.f119I.e());
                    p.b(gVar, dVar4.f141d.f384i, -this.b.f121K.e());
                    hVar.d(q9);
                    return;
                }
                if (i11 == 1) {
                    hVar.d(dVar6.q());
                }
            }
        } else if (this.f379d == 4 && (dVar2 = (dVar = this.b).f129T) != null && ((i9 = dVar2.f163p0[0]) == 1 || i9 == 4)) {
            p.b(gVar2, dVar2.f141d.f383h, dVar.f119I.e());
            p.b(gVar, dVar2.f141d.f384i, -this.b.f121K.e());
            return;
        }
        if (hVar.f366j) {
            B.d dVar7 = this.b;
            if (dVar7.f136a) {
                B.c[] cVarArr = dVar7.f126Q;
                B.c cVar = cVarArr[0];
                B.c cVar2 = cVar.f107f;
                if (cVar2 != null && cVarArr[1].f107f != null) {
                    if (dVar7.x()) {
                        gVar2.f362f = this.b.f126Q[0].e();
                        gVar.f362f = -this.b.f126Q[1].e();
                        return;
                    }
                    g h6 = p.h(this.b.f126Q[0]);
                    if (h6 != null) {
                        p.b(gVar2, h6, this.b.f126Q[0].e());
                    }
                    g h9 = p.h(this.b.f126Q[1]);
                    if (h9 != null) {
                        p.b(gVar, h9, -this.b.f126Q[1].e());
                    }
                    gVar2.b = true;
                    gVar.b = true;
                    return;
                }
                if (cVar2 != null) {
                    g h10 = p.h(cVar);
                    if (h10 != null) {
                        p.b(gVar2, h10, this.b.f126Q[0].e());
                        p.b(gVar, gVar2, hVar.f363g);
                        return;
                    }
                    return;
                }
                B.c cVar3 = cVarArr[1];
                if (cVar3.f107f != null) {
                    g h11 = p.h(cVar3);
                    if (h11 != null) {
                        p.b(gVar, h11, -this.b.f126Q[1].e());
                        p.b(gVar2, gVar, -hVar.f363g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof B.i) && dVar7.f129T != null && dVar7.i(7).f107f == null) {
                    B.d dVar8 = this.b;
                    p.b(gVar2, dVar8.f129T.f141d.f383h, dVar8.r());
                    p.b(gVar, gVar2, hVar.f363g);
                    return;
                }
                return;
            }
        }
        if (this.f379d == 3) {
            B.d dVar9 = this.b;
            int i12 = dVar9.f165r;
            if (i12 != 2) {
                if (i12 == 3) {
                    if (dVar9.f166s == 3) {
                        gVar2.f358a = this;
                        gVar.f358a = this;
                        n nVar = dVar9.f143e;
                        nVar.f383h.f358a = this;
                        nVar.f384i.f358a = this;
                        hVar.f358a = this;
                        if (dVar9.y()) {
                            hVar.l.add(this.b.f143e.f380e);
                            this.b.f143e.f380e.f367k.add(hVar);
                            n nVar2 = this.b.f143e;
                            nVar2.f380e.f358a = this;
                            hVar.l.add(nVar2.f383h);
                            hVar.l.add(this.b.f143e.f384i);
                            this.b.f143e.f383h.f367k.add(hVar);
                            this.b.f143e.f384i.f367k.add(hVar);
                        } else if (this.b.x()) {
                            this.b.f143e.f380e.l.add(hVar);
                            hVar.f367k.add(this.b.f143e.f380e);
                        } else {
                            this.b.f143e.f380e.l.add(hVar);
                        }
                    } else {
                        h hVar2 = dVar9.f143e.f380e;
                        hVar.l.add(hVar2);
                        hVar2.f367k.add(hVar);
                        this.b.f143e.f383h.f367k.add(hVar);
                        this.b.f143e.f384i.f367k.add(hVar);
                        hVar.b = true;
                        hVar.f367k.add(gVar2);
                        hVar.f367k.add(gVar);
                        gVar2.l.add(hVar);
                        gVar.l.add(hVar);
                    }
                }
            } else {
                B.d dVar10 = dVar9.f129T;
                if (dVar10 != null) {
                    h hVar3 = dVar10.f143e.f380e;
                    hVar.l.add(hVar3);
                    hVar3.f367k.add(hVar);
                    hVar.b = true;
                    hVar.f367k.add(gVar2);
                    hVar.f367k.add(gVar);
                }
            }
        }
        B.d dVar11 = this.b;
        B.c[] cVarArr2 = dVar11.f126Q;
        B.c cVar4 = cVarArr2[0];
        B.c cVar5 = cVar4.f107f;
        if (cVar5 != null && cVarArr2[1].f107f != null) {
            if (dVar11.x()) {
                gVar2.f362f = this.b.f126Q[0].e();
                gVar.f362f = -this.b.f126Q[1].e();
                return;
            }
            g h12 = p.h(this.b.f126Q[0]);
            g h13 = p.h(this.b.f126Q[1]);
            if (h12 != null) {
                h12.b(this);
            }
            if (h13 != null) {
                h13.b(this);
            }
            this.f385j = 4;
            return;
        }
        if (cVar5 != null) {
            g h14 = p.h(cVar4);
            if (h14 != null) {
                p.b(gVar2, h14, this.b.f126Q[0].e());
                c(gVar, gVar2, 1, hVar);
                return;
            }
            return;
        }
        B.c cVar6 = cVarArr2[1];
        if (cVar6.f107f != null) {
            g h15 = p.h(cVar6);
            if (h15 != null) {
                p.b(gVar, h15, -this.b.f126Q[1].e());
                c(gVar2, gVar, -1, hVar);
                return;
            }
            return;
        }
        if (!(dVar11 instanceof B.i) && (dVar3 = dVar11.f129T) != null) {
            p.b(gVar2, dVar3.f141d.f383h, dVar11.r());
            c(gVar, gVar2, 1, hVar);
        }
    }

    @Override // C.p
    public final void e() {
        g gVar = this.f383h;
        if (gVar.f366j) {
            this.b.f134Y = gVar.f363g;
        }
    }

    @Override // C.p
    public final void f() {
        this.f378c = null;
        this.f383h.c();
        this.f384i.c();
        this.f380e.c();
        this.f382g = false;
    }

    @Override // C.p
    public final boolean k() {
        if (this.f379d != 3 || this.b.f165r == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f382g = false;
        g gVar = this.f383h;
        gVar.c();
        gVar.f366j = false;
        g gVar2 = this.f384i;
        gVar2.c();
        gVar2.f366j = false;
        this.f380e.f366j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.f149h0;
    }
}
