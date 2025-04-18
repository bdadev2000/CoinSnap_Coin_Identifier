package x;

/* loaded from: classes.dex */
public final class h extends o {
    public h(w.e eVar) {
        super(eVar);
        eVar.f26585d.f();
        eVar.f26587e.f();
        this.f27297f = ((w.i) eVar).f26660u0;
    }

    @Override // x.d
    public final void a(d dVar) {
        f fVar = this.f27299h;
        if (!fVar.f27266c || fVar.f27273j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f27275l.get(0)).f27270g * ((w.i) this.f27293b).f26656q0) + 0.5f));
    }

    @Override // x.o
    public final void d() {
        w.e eVar = this.f27293b;
        w.i iVar = (w.i) eVar;
        int i10 = iVar.f26657r0;
        int i11 = iVar.f26658s0;
        int i12 = iVar.f26660u0;
        f fVar = this.f27299h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f27275l.add(eVar.T.f26585d.f27299h);
                this.f27293b.T.f26585d.f27299h.f27274k.add(fVar);
                fVar.f27269f = i10;
            } else if (i11 != -1) {
                fVar.f27275l.add(eVar.T.f26585d.f27300i);
                this.f27293b.T.f26585d.f27300i.f27274k.add(fVar);
                fVar.f27269f = -i11;
            } else {
                fVar.f27265b = true;
                fVar.f27275l.add(eVar.T.f26585d.f27300i);
                this.f27293b.T.f26585d.f27300i.f27274k.add(fVar);
            }
            m(this.f27293b.f26585d.f27299h);
            m(this.f27293b.f26585d.f27300i);
            return;
        }
        if (i10 != -1) {
            fVar.f27275l.add(eVar.T.f26587e.f27299h);
            this.f27293b.T.f26587e.f27299h.f27274k.add(fVar);
            fVar.f27269f = i10;
        } else if (i11 != -1) {
            fVar.f27275l.add(eVar.T.f26587e.f27300i);
            this.f27293b.T.f26587e.f27300i.f27274k.add(fVar);
            fVar.f27269f = -i11;
        } else {
            fVar.f27265b = true;
            fVar.f27275l.add(eVar.T.f26587e.f27300i);
            this.f27293b.T.f26587e.f27300i.f27274k.add(fVar);
        }
        m(this.f27293b.f26587e.f27299h);
        m(this.f27293b.f26587e.f27300i);
    }

    @Override // x.o
    public final void e() {
        w.e eVar = this.f27293b;
        int i10 = ((w.i) eVar).f26660u0;
        f fVar = this.f27299h;
        if (i10 == 1) {
            eVar.Y = fVar.f27270g;
        } else {
            eVar.Z = fVar.f27270g;
        }
    }

    @Override // x.o
    public final void f() {
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
