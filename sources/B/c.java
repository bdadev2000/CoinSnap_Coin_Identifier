package B;

import C.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x0.AbstractC2914a;
import z.AbstractC2965e;
import z.C2966f;

/* loaded from: classes.dex */
public final class c {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f104c;

    /* renamed from: d, reason: collision with root package name */
    public final d f105d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106e;

    /* renamed from: f, reason: collision with root package name */
    public c f107f;

    /* renamed from: i, reason: collision with root package name */
    public C2966f f110i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f103a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f108g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f109h = Integer.MIN_VALUE;

    public c(d dVar, int i9) {
        this.f105d = dVar;
        this.f106e = i9;
    }

    public final void a(c cVar, int i9) {
        b(cVar, i9, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i9, int i10, boolean z8) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z8 && !i(cVar)) {
            return false;
        }
        this.f107f = cVar;
        if (cVar.f103a == null) {
            cVar.f103a = new HashSet();
        }
        HashSet hashSet = this.f107f.f103a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f108g = i9;
        this.f109h = i10;
        return true;
    }

    public final void c(int i9, o oVar, ArrayList arrayList) {
        HashSet hashSet = this.f103a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C.i.b(((c) it.next()).f105d, i9, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (!this.f104c) {
            return 0;
        }
        return this.b;
    }

    public final int e() {
        c cVar;
        if (this.f105d.f147g0 == 8) {
            return 0;
        }
        int i9 = this.f109h;
        if (i9 != Integer.MIN_VALUE && (cVar = this.f107f) != null && cVar.f105d.f147g0 == 8) {
            return i9;
        }
        return this.f108g;
    }

    public final c f() {
        int i9 = this.f106e;
        int d2 = AbstractC2965e.d(i9);
        d dVar = this.f105d;
        switch (d2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f121K;
            case 2:
                return dVar.f122L;
            case 3:
                return dVar.f119I;
            case 4:
                return dVar.f120J;
            default:
                throw new AssertionError(AbstractC2914a.l(i9));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f103a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f107f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(c cVar) {
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (cVar == null) {
            return false;
        }
        int i9 = this.f106e;
        d dVar = cVar.f105d;
        int i10 = cVar.f106e;
        if (i10 != i9) {
            switch (AbstractC2965e.d(i9)) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (i10 != 2 && i10 != 4) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (dVar instanceof h) {
                        if (z8 || i10 == 8) {
                            z10 = true;
                        }
                        return z10;
                    }
                    return z8;
                case 2:
                case 4:
                    if (i10 != 3 && i10 != 5) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (dVar instanceof h) {
                        if (z9 || i10 == 9) {
                            z10 = true;
                        }
                        return z10;
                    }
                    return z9;
                case 5:
                    if (i10 == 2 || i10 == 4) {
                        return false;
                    }
                    return true;
                case 6:
                    if (i10 == 6 || i10 == 8 || i10 == 9) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(AbstractC2914a.l(i9));
            }
        }
        if (i9 == 6 && (!dVar.f115E || !this.f105d.f115E)) {
            return false;
        }
        return true;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f107f;
        if (cVar != null && (hashSet = cVar.f103a) != null) {
            hashSet.remove(this);
            if (this.f107f.f103a.size() == 0) {
                this.f107f.f103a = null;
            }
        }
        this.f103a = null;
        this.f107f = null;
        this.f108g = 0;
        this.f109h = Integer.MIN_VALUE;
        this.f104c = false;
        this.b = 0;
    }

    public final void k() {
        C2966f c2966f = this.f110i;
        if (c2966f == null) {
            this.f110i = new C2966f(1);
        } else {
            c2966f.c();
        }
    }

    public final void l(int i9) {
        this.b = i9;
        this.f104c = true;
    }

    public final String toString() {
        return this.f105d.f149h0 + ":" + AbstractC2914a.l(this.f106e);
    }
}
