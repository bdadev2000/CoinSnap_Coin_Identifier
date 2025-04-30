package C;

import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class p implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f377a;
    public B.d b;

    /* renamed from: c, reason: collision with root package name */
    public m f378c;

    /* renamed from: d, reason: collision with root package name */
    public int f379d;

    /* renamed from: e, reason: collision with root package name */
    public final h f380e = new h(this);

    /* renamed from: f, reason: collision with root package name */
    public int f381f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382g = false;

    /* renamed from: h, reason: collision with root package name */
    public final g f383h = new g(this);

    /* renamed from: i, reason: collision with root package name */
    public final g f384i = new g(this);

    /* renamed from: j, reason: collision with root package name */
    public int f385j = 1;

    public p(B.d dVar) {
        this.b = dVar;
    }

    public static void b(g gVar, g gVar2, int i9) {
        gVar.l.add(gVar2);
        gVar.f362f = i9;
        gVar2.f367k.add(gVar);
    }

    public static g h(B.c cVar) {
        B.c cVar2 = cVar.f107f;
        if (cVar2 == null) {
            return null;
        }
        int d2 = AbstractC2965e.d(cVar2.f106e);
        B.d dVar = cVar2.f105d;
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 != 4) {
                        if (d2 != 5) {
                            return null;
                        }
                        return dVar.f143e.f371k;
                    }
                    return dVar.f143e.f384i;
                }
                return dVar.f141d.f384i;
            }
            return dVar.f143e.f383h;
        }
        return dVar.f141d.f383h;
    }

    public static g i(B.c cVar, int i9) {
        p pVar;
        B.c cVar2 = cVar.f107f;
        if (cVar2 == null) {
            return null;
        }
        B.d dVar = cVar2.f105d;
        if (i9 == 0) {
            pVar = dVar.f141d;
        } else {
            pVar = dVar.f143e;
        }
        int d2 = AbstractC2965e.d(cVar2.f106e);
        if (d2 != 1 && d2 != 2) {
            if (d2 != 3 && d2 != 4) {
                return null;
            }
            return pVar.f384i;
        }
        return pVar.f383h;
    }

    public final void c(g gVar, g gVar2, int i9, h hVar) {
        gVar.l.add(gVar2);
        gVar.l.add(this.f380e);
        gVar.f364h = i9;
        gVar.f365i = hVar;
        gVar2.f367k.add(gVar);
        hVar.f367k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i9, int i10) {
        int max;
        if (i10 == 0) {
            B.d dVar = this.b;
            int i11 = dVar.f169v;
            max = Math.max(dVar.f168u, i9);
            if (i11 > 0) {
                max = Math.min(i11, i9);
            }
            if (max == i9) {
                return i9;
            }
        } else {
            B.d dVar2 = this.b;
            int i12 = dVar2.f172y;
            max = Math.max(dVar2.f171x, i9);
            if (i12 > 0) {
                max = Math.min(i12, i9);
            }
            if (max == i9) {
                return i9;
            }
        }
        return max;
    }

    public long j() {
        if (this.f380e.f366j) {
            return r0.f363g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f377a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(B.c r12, B.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.p.l(B.c, B.c, int):void");
    }
}
