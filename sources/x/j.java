package x;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f27277k = new int[2];

    public j(w.e eVar) {
        super(eVar);
        this.f27299h.f27268e = 4;
        this.f27300i.f27268e = 5;
        this.f27297f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    iArr[0] = i15;
                    iArr[1] = (int) ((i15 * f10) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i16 * f10) + 0.5f);
            iArr[1] = i16;
            return;
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0243, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r24) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.j.a(x.d):void");
    }

    @Override // x.o
    public final void d() {
        w.e eVar;
        w.e eVar2;
        int i10;
        w.e eVar3;
        w.e eVar4;
        int i11;
        w.e eVar5 = this.f27293b;
        boolean z10 = eVar5.a;
        g gVar = this.f27296e;
        if (z10) {
            gVar.d(eVar5.r());
        }
        boolean z11 = gVar.f27273j;
        f fVar = this.f27300i;
        f fVar2 = this.f27299h;
        if (!z11) {
            w.e eVar6 = this.f27293b;
            int i12 = eVar6.f26610p0[0];
            this.f27295d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (eVar4 = eVar6.T) != null && ((i11 = eVar4.f26610p0[0]) == 1 || i11 == 4)) {
                    int r6 = (eVar4.r() - this.f27293b.I.e()) - this.f27293b.K.e();
                    o.b(fVar2, eVar4.f26585d.f27299h, this.f27293b.I.e());
                    o.b(fVar, eVar4.f26585d.f27300i, -this.f27293b.K.e());
                    gVar.d(r6);
                    return;
                }
                if (i12 == 1) {
                    gVar.d(eVar6.r());
                }
            }
        } else if (this.f27295d == 4 && (eVar2 = (eVar = this.f27293b).T) != null && ((i10 = eVar2.f26610p0[0]) == 1 || i10 == 4)) {
            o.b(fVar2, eVar2.f26585d.f27299h, eVar.I.e());
            o.b(fVar, eVar2.f26585d.f27300i, -this.f27293b.K.e());
            return;
        }
        if (gVar.f27273j) {
            w.e eVar7 = this.f27293b;
            if (eVar7.a) {
                w.d[] dVarArr = eVar7.Q;
                w.d dVar = dVarArr[0];
                w.d dVar2 = dVar.f26576f;
                if (dVar2 != null && dVarArr[1].f26576f != null) {
                    if (eVar7.y()) {
                        fVar2.f27269f = this.f27293b.Q[0].e();
                        fVar.f27269f = -this.f27293b.Q[1].e();
                        return;
                    }
                    f h10 = o.h(this.f27293b.Q[0]);
                    if (h10 != null) {
                        o.b(fVar2, h10, this.f27293b.Q[0].e());
                    }
                    f h11 = o.h(this.f27293b.Q[1]);
                    if (h11 != null) {
                        o.b(fVar, h11, -this.f27293b.Q[1].e());
                    }
                    fVar2.f27265b = true;
                    fVar.f27265b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h12 = o.h(dVar);
                    if (h12 != null) {
                        o.b(fVar2, h12, this.f27293b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f27270g);
                        return;
                    }
                    return;
                }
                w.d dVar3 = dVarArr[1];
                if (dVar3.f26576f != null) {
                    f h13 = o.h(dVar3);
                    if (h13 != null) {
                        o.b(fVar, h13, -this.f27293b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f27270g);
                        return;
                    }
                    return;
                }
                if (!(eVar7 instanceof w.j) && eVar7.T != null && eVar7.j(w.c.CENTER).f26576f == null) {
                    w.e eVar8 = this.f27293b;
                    o.b(fVar2, eVar8.T.f26585d.f27299h, eVar8.s());
                    o.b(fVar, fVar2, gVar.f27270g);
                    return;
                }
                return;
            }
        }
        if (this.f27295d == 3) {
            w.e eVar9 = this.f27293b;
            int i13 = eVar9.f26612r;
            ArrayList arrayList = gVar.f27274k;
            ArrayList arrayList2 = gVar.f27275l;
            if (i13 != 2) {
                if (i13 == 3) {
                    if (eVar9.f26613s == 3) {
                        fVar2.a = this;
                        fVar.a = this;
                        l lVar = eVar9.f26587e;
                        lVar.f27299h.a = this;
                        lVar.f27300i.a = this;
                        gVar.a = this;
                        if (eVar9.z()) {
                            arrayList2.add(this.f27293b.f26587e.f27296e);
                            this.f27293b.f26587e.f27296e.f27274k.add(gVar);
                            l lVar2 = this.f27293b.f26587e;
                            lVar2.f27296e.a = this;
                            arrayList2.add(lVar2.f27299h);
                            arrayList2.add(this.f27293b.f26587e.f27300i);
                            this.f27293b.f26587e.f27299h.f27274k.add(gVar);
                            this.f27293b.f26587e.f27300i.f27274k.add(gVar);
                        } else if (this.f27293b.y()) {
                            this.f27293b.f26587e.f27296e.f27275l.add(gVar);
                            arrayList.add(this.f27293b.f26587e.f27296e);
                        } else {
                            this.f27293b.f26587e.f27296e.f27275l.add(gVar);
                        }
                    } else {
                        g gVar2 = eVar9.f26587e.f27296e;
                        arrayList2.add(gVar2);
                        gVar2.f27274k.add(gVar);
                        this.f27293b.f26587e.f27299h.f27274k.add(gVar);
                        this.f27293b.f26587e.f27300i.f27274k.add(gVar);
                        gVar.f27265b = true;
                        arrayList.add(fVar2);
                        arrayList.add(fVar);
                        fVar2.f27275l.add(gVar);
                        fVar.f27275l.add(gVar);
                    }
                }
            } else {
                w.e eVar10 = eVar9.T;
                if (eVar10 != null) {
                    g gVar3 = eVar10.f26587e.f27296e;
                    arrayList2.add(gVar3);
                    gVar3.f27274k.add(gVar);
                    gVar.f27265b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            }
        }
        w.e eVar11 = this.f27293b;
        w.d[] dVarArr2 = eVar11.Q;
        w.d dVar4 = dVarArr2[0];
        w.d dVar5 = dVar4.f26576f;
        if (dVar5 != null && dVarArr2[1].f26576f != null) {
            if (eVar11.y()) {
                fVar2.f27269f = this.f27293b.Q[0].e();
                fVar.f27269f = -this.f27293b.Q[1].e();
                return;
            }
            f h14 = o.h(this.f27293b.Q[0]);
            f h15 = o.h(this.f27293b.Q[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f27301j = 4;
            return;
        }
        if (dVar5 != null) {
            f h16 = o.h(dVar4);
            if (h16 != null) {
                o.b(fVar2, h16, this.f27293b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        w.d dVar6 = dVarArr2[1];
        if (dVar6.f26576f != null) {
            f h17 = o.h(dVar6);
            if (h17 != null) {
                o.b(fVar, h17, -this.f27293b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if (!(eVar11 instanceof w.j) && (eVar3 = eVar11.T) != null) {
            o.b(fVar2, eVar3.f26585d.f27299h, eVar11.s());
            c(fVar, fVar2, 1, gVar);
        }
    }

    @Override // x.o
    public final void e() {
        f fVar = this.f27299h;
        if (fVar.f27273j) {
            this.f27293b.Y = fVar.f27270g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f27294c = null;
        this.f27299h.c();
        this.f27300i.c();
        this.f27296e.c();
        this.f27298g = false;
    }

    @Override // x.o
    public final boolean k() {
        if (this.f27295d != 3 || this.f27293b.f26612r == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f27298g = false;
        f fVar = this.f27299h;
        fVar.c();
        fVar.f27273j = false;
        f fVar2 = this.f27300i;
        fVar2.c();
        fVar2.f27273j = false;
        this.f27296e.f27273j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f27293b.f26594h0;
    }
}
