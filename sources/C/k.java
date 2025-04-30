package C;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends p {
    @Override // C.e
    public final void a(e eVar) {
        B.a aVar = (B.a) this.b;
        int i9 = aVar.f85s0;
        g gVar = this.f383h;
        Iterator it = gVar.l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((g) it.next()).f363g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i9 != 0 && i9 != 2) {
            gVar.d(i10 + aVar.f87u0);
        } else {
            gVar.d(i11 + aVar.f87u0);
        }
    }

    @Override // C.p
    public final void d() {
        B.d dVar = this.b;
        if (dVar instanceof B.a) {
            g gVar = this.f383h;
            gVar.b = true;
            B.a aVar = (B.a) dVar;
            int i9 = aVar.f85s0;
            boolean z8 = aVar.f86t0;
            int i10 = 0;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            gVar.f361e = 7;
                            while (i10 < aVar.f251r0) {
                                B.d dVar2 = aVar.f250q0[i10];
                                if (z8 || dVar2.f147g0 != 8) {
                                    g gVar2 = dVar2.f143e.f384i;
                                    gVar2.f367k.add(gVar);
                                    gVar.l.add(gVar2);
                                }
                                i10++;
                            }
                            m(this.b.f143e.f383h);
                            m(this.b.f143e.f384i);
                            return;
                        }
                        return;
                    }
                    gVar.f361e = 6;
                    while (i10 < aVar.f251r0) {
                        B.d dVar3 = aVar.f250q0[i10];
                        if (z8 || dVar3.f147g0 != 8) {
                            g gVar3 = dVar3.f143e.f383h;
                            gVar3.f367k.add(gVar);
                            gVar.l.add(gVar3);
                        }
                        i10++;
                    }
                    m(this.b.f143e.f383h);
                    m(this.b.f143e.f384i);
                    return;
                }
                gVar.f361e = 5;
                while (i10 < aVar.f251r0) {
                    B.d dVar4 = aVar.f250q0[i10];
                    if (z8 || dVar4.f147g0 != 8) {
                        g gVar4 = dVar4.f141d.f384i;
                        gVar4.f367k.add(gVar);
                        gVar.l.add(gVar4);
                    }
                    i10++;
                }
                m(this.b.f141d.f383h);
                m(this.b.f141d.f384i);
                return;
            }
            gVar.f361e = 4;
            while (i10 < aVar.f251r0) {
                B.d dVar5 = aVar.f250q0[i10];
                if (z8 || dVar5.f147g0 != 8) {
                    g gVar5 = dVar5.f141d.f383h;
                    gVar5.f367k.add(gVar);
                    gVar.l.add(gVar5);
                }
                i10++;
            }
            m(this.b.f141d.f383h);
            m(this.b.f141d.f384i);
        }
    }

    @Override // C.p
    public final void e() {
        B.d dVar = this.b;
        if (dVar instanceof B.a) {
            int i9 = ((B.a) dVar).f85s0;
            g gVar = this.f383h;
            if (i9 != 0 && i9 != 1) {
                dVar.f135Z = gVar.f363g;
            } else {
                dVar.f134Y = gVar.f363g;
            }
        }
    }

    @Override // C.p
    public final void f() {
        this.f378c = null;
        this.f383h.c();
    }

    @Override // C.p
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f383h;
        gVar2.f367k.add(gVar);
        gVar.l.add(gVar2);
    }
}
