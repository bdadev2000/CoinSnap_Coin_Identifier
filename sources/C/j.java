package C;

/* loaded from: classes.dex */
public final class j extends p {
    @Override // C.e
    public final void a(e eVar) {
        g gVar = this.f383h;
        if (!gVar.f359c || gVar.f366j) {
            return;
        }
        gVar.d((int) ((((g) gVar.l.get(0)).f363g * ((B.h) this.b).f244q0) + 0.5f));
    }

    @Override // C.p
    public final void d() {
        B.d dVar = this.b;
        B.h hVar = (B.h) dVar;
        int i9 = hVar.f245r0;
        int i10 = hVar.f246s0;
        int i11 = hVar.f248u0;
        g gVar = this.f383h;
        if (i11 == 1) {
            if (i9 != -1) {
                gVar.l.add(dVar.f129T.f141d.f383h);
                this.b.f129T.f141d.f383h.f367k.add(gVar);
                gVar.f362f = i9;
            } else if (i10 != -1) {
                gVar.l.add(dVar.f129T.f141d.f384i);
                this.b.f129T.f141d.f384i.f367k.add(gVar);
                gVar.f362f = -i10;
            } else {
                gVar.b = true;
                gVar.l.add(dVar.f129T.f141d.f384i);
                this.b.f129T.f141d.f384i.f367k.add(gVar);
            }
            m(this.b.f141d.f383h);
            m(this.b.f141d.f384i);
            return;
        }
        if (i9 != -1) {
            gVar.l.add(dVar.f129T.f143e.f383h);
            this.b.f129T.f143e.f383h.f367k.add(gVar);
            gVar.f362f = i9;
        } else if (i10 != -1) {
            gVar.l.add(dVar.f129T.f143e.f384i);
            this.b.f129T.f143e.f384i.f367k.add(gVar);
            gVar.f362f = -i10;
        } else {
            gVar.b = true;
            gVar.l.add(dVar.f129T.f143e.f384i);
            this.b.f129T.f143e.f384i.f367k.add(gVar);
        }
        m(this.b.f143e.f383h);
        m(this.b.f143e.f384i);
    }

    @Override // C.p
    public final void e() {
        B.d dVar = this.b;
        int i9 = ((B.h) dVar).f248u0;
        g gVar = this.f383h;
        if (i9 == 1) {
            dVar.f134Y = gVar.f363g;
        } else {
            dVar.f135Z = gVar.f363g;
        }
    }

    @Override // C.p
    public final void f() {
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
