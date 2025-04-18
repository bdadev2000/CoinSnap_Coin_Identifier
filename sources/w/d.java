package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public int f26572b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26573c;

    /* renamed from: d, reason: collision with root package name */
    public final e f26574d;

    /* renamed from: e, reason: collision with root package name */
    public final c f26575e;

    /* renamed from: f, reason: collision with root package name */
    public d f26576f;

    /* renamed from: i, reason: collision with root package name */
    public t.i f26579i;
    public HashSet a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f26577g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f26578h = Integer.MIN_VALUE;

    public d(e eVar, c cVar) {
        this.f26574d = eVar;
        this.f26575e = cVar;
    }

    public final void a(d dVar, int i10) {
        b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z10 && !i(dVar)) {
            return false;
        }
        this.f26576f = dVar;
        if (dVar.a == null) {
            dVar.a = new HashSet();
        }
        HashSet hashSet = this.f26576f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f26577g = i10;
        this.f26578h = i11;
        return true;
    }

    public final void c(int i10, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.d.l(((d) it.next()).f26574d, i10, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (!this.f26573c) {
            return 0;
        }
        return this.f26572b;
    }

    public final int e() {
        d dVar;
        if (this.f26574d.f26592g0 == 8) {
            return 0;
        }
        int i10 = this.f26578h;
        if (i10 != Integer.MIN_VALUE && (dVar = this.f26576f) != null && dVar.f26574d.f26592g0 == 8) {
            return i10;
        }
        return this.f26577g;
    }

    public final d f() {
        c cVar = this.f26575e;
        int ordinal = cVar.ordinal();
        e eVar = this.f26574d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.K;
            case 2:
                return eVar.L;
            case 3:
                return eVar.I;
            case 4:
                return eVar.J;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f26576f != null;
    }

    public final boolean i(d dVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (dVar == null) {
            return false;
        }
        c cVar = c.BASELINE;
        c cVar2 = this.f26575e;
        e eVar = dVar.f26574d;
        c cVar3 = dVar.f26575e;
        if (cVar3 == cVar2) {
            if (cVar2 == cVar && (!eVar.E || !this.f26574d.E)) {
                return false;
            }
            return true;
        }
        int ordinal = cVar2.ordinal();
        c cVar4 = c.CENTER_Y;
        c cVar5 = c.RIGHT;
        c cVar6 = c.CENTER_X;
        c cVar7 = c.LEFT;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (cVar3 != cVar7 && cVar3 != cVar5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (eVar instanceof i) {
                    if (z10 || cVar3 == cVar6) {
                        z12 = true;
                    }
                    return z12;
                }
                return z10;
            case 2:
            case 4:
                if (cVar3 != c.TOP && cVar3 != c.BOTTOM) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (eVar instanceof i) {
                    if (z11 || cVar3 == cVar4) {
                        z12 = true;
                    }
                    return z12;
                }
                return z11;
            case 5:
                if (cVar3 == cVar7 || cVar3 == cVar5) {
                    return false;
                }
                return true;
            case 6:
                if (cVar3 == cVar || cVar3 == cVar6 || cVar3 == cVar4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(cVar2.name());
        }
    }

    public final void j() {
        HashSet hashSet;
        d dVar = this.f26576f;
        if (dVar != null && (hashSet = dVar.a) != null) {
            hashSet.remove(this);
            if (this.f26576f.a.size() == 0) {
                this.f26576f.a = null;
            }
        }
        this.a = null;
        this.f26576f = null;
        this.f26577g = 0;
        this.f26578h = Integer.MIN_VALUE;
        this.f26573c = false;
        this.f26572b = 0;
    }

    public final void k() {
        t.i iVar = this.f26579i;
        if (iVar == null) {
            this.f26579i = new t.i(1);
        } else {
            iVar.c();
        }
    }

    public final void l(int i10) {
        this.f26572b = i10;
        this.f26573c = true;
    }

    public final String toString() {
        return this.f26574d.f26594h0 + ":" + this.f26575e.toString();
    }
}
