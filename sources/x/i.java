package x;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends o {
    public i(w.e eVar) {
        super(eVar);
    }

    @Override // x.d
    public final void a(d dVar) {
        w.a aVar = (w.a) this.f27293b;
        int i10 = aVar.f26543s0;
        f fVar = this.f27299h;
        Iterator it = fVar.f27275l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f27270g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            fVar.d(i11 + aVar.f26545u0);
        } else {
            fVar.d(i12 + aVar.f26545u0);
        }
    }

    @Override // x.o
    public final void d() {
        w.e eVar = this.f27293b;
        if (eVar instanceof w.a) {
            f fVar = this.f27299h;
            fVar.f27265b = true;
            w.a aVar = (w.a) eVar;
            int i10 = aVar.f26543s0;
            boolean z10 = aVar.f26544t0;
            ArrayList arrayList = fVar.f27275l;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f27268e = 7;
                            while (i11 < aVar.f26663r0) {
                                w.e eVar2 = aVar.f26662q0[i11];
                                if (z10 || eVar2.f26592g0 != 8) {
                                    f fVar2 = eVar2.f26587e.f27300i;
                                    fVar2.f27274k.add(fVar);
                                    arrayList.add(fVar2);
                                }
                                i11++;
                            }
                            m(this.f27293b.f26587e.f27299h);
                            m(this.f27293b.f26587e.f27300i);
                            return;
                        }
                        return;
                    }
                    fVar.f27268e = 6;
                    while (i11 < aVar.f26663r0) {
                        w.e eVar3 = aVar.f26662q0[i11];
                        if (z10 || eVar3.f26592g0 != 8) {
                            f fVar3 = eVar3.f26587e.f27299h;
                            fVar3.f27274k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i11++;
                    }
                    m(this.f27293b.f26587e.f27299h);
                    m(this.f27293b.f26587e.f27300i);
                    return;
                }
                fVar.f27268e = 5;
                while (i11 < aVar.f26663r0) {
                    w.e eVar4 = aVar.f26662q0[i11];
                    if (z10 || eVar4.f26592g0 != 8) {
                        f fVar4 = eVar4.f26585d.f27300i;
                        fVar4.f27274k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i11++;
                }
                m(this.f27293b.f26585d.f27299h);
                m(this.f27293b.f26585d.f27300i);
                return;
            }
            fVar.f27268e = 4;
            while (i11 < aVar.f26663r0) {
                w.e eVar5 = aVar.f26662q0[i11];
                if (z10 || eVar5.f26592g0 != 8) {
                    f fVar5 = eVar5.f26585d.f27299h;
                    fVar5.f27274k.add(fVar);
                    arrayList.add(fVar5);
                }
                i11++;
            }
            m(this.f27293b.f26585d.f27299h);
            m(this.f27293b.f26585d.f27300i);
        }
    }

    @Override // x.o
    public final void e() {
        w.e eVar = this.f27293b;
        if (eVar instanceof w.a) {
            int i10 = ((w.a) eVar).f26543s0;
            f fVar = this.f27299h;
            if (i10 != 0 && i10 != 1) {
                eVar.Z = fVar.f27270g;
            } else {
                eVar.Y = fVar.f27270g;
            }
        }
    }

    @Override // x.o
    public final void f() {
        this.f27294c = null;
        this.f27299h.c();
    }

    @Override // x.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f27299h;
        fVar2.f27274k.add(fVar);
        fVar.f27275l.add(fVar2);
    }
}
