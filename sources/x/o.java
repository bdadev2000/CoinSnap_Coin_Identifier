package x;

/* loaded from: classes.dex */
public abstract class o implements d {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public w.e f27293b;

    /* renamed from: c, reason: collision with root package name */
    public k f27294c;

    /* renamed from: d, reason: collision with root package name */
    public int f27295d;

    /* renamed from: e, reason: collision with root package name */
    public final g f27296e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f27297f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27298g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f27299h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f27300i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f27301j = 1;

    public o(w.e eVar) {
        this.f27293b = eVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f27275l.add(fVar2);
        fVar.f27269f = i10;
        fVar2.f27274k.add(fVar);
    }

    public static f h(w.d dVar) {
        w.d dVar2 = dVar.f26576f;
        if (dVar2 == null) {
            return null;
        }
        int ordinal = dVar2.f26575e.ordinal();
        w.e eVar = dVar2.f26574d;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return eVar.f26587e.f27279k;
                    }
                    return eVar.f26587e.f27300i;
                }
                return eVar.f26585d.f27300i;
            }
            return eVar.f26587e.f27299h;
        }
        return eVar.f26585d.f27299h;
    }

    public static f i(w.d dVar, int i10) {
        o oVar;
        w.d dVar2 = dVar.f26576f;
        if (dVar2 == null) {
            return null;
        }
        w.e eVar = dVar2.f26574d;
        if (i10 == 0) {
            oVar = eVar.f26585d;
        } else {
            oVar = eVar.f26587e;
        }
        int ordinal = dVar2.f26575e.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal != 3 && ordinal != 4) {
                return null;
            }
            return oVar.f27300i;
        }
        return oVar.f27299h;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f27275l.add(fVar2);
        fVar.f27275l.add(this.f27296e);
        fVar.f27271h = i10;
        fVar.f27272i = gVar;
        fVar2.f27274k.add(fVar);
        gVar.f27274k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            w.e eVar = this.f27293b;
            int i12 = eVar.f26615v;
            max = Math.max(eVar.u, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            w.e eVar2 = this.f27293b;
            int i13 = eVar2.f26618y;
            max = Math.max(eVar2.f26617x, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public long j() {
        if (this.f27296e.f27273j) {
            return r0.f27270g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(w.d r12, w.d r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.o.l(w.d, w.d, int):void");
    }
}
