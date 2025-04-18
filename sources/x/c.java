package x;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f27255k;

    /* renamed from: l, reason: collision with root package name */
    public int f27256l;

    public c(int i10, w.e eVar) {
        super(eVar);
        w.e eVar2;
        o oVar;
        boolean z10;
        int i11;
        o oVar2;
        this.f27255k = new ArrayList();
        this.f27297f = i10;
        w.e eVar3 = this.f27293b;
        w.e n10 = eVar3.n(i10);
        while (true) {
            eVar2 = eVar3;
            eVar3 = n10;
            if (eVar3 == null) {
                break;
            } else {
                n10 = eVar3.n(this.f27297f);
            }
        }
        this.f27293b = eVar2;
        int i12 = this.f27297f;
        if (i12 == 0) {
            oVar = eVar2.f26585d;
        } else if (i12 == 1) {
            oVar = eVar2.f26587e;
        } else {
            oVar = null;
        }
        ArrayList arrayList = this.f27255k;
        arrayList.add(oVar);
        w.e m10 = eVar2.m(this.f27297f);
        while (m10 != null) {
            int i13 = this.f27297f;
            if (i13 == 0) {
                oVar2 = m10.f26585d;
            } else if (i13 == 1) {
                oVar2 = m10.f26587e;
            } else {
                oVar2 = null;
            }
            arrayList.add(oVar2);
            m10 = m10.m(this.f27297f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar3 = (o) it.next();
            int i14 = this.f27297f;
            if (i14 == 0) {
                oVar3.f27293b.f26581b = this;
            } else if (i14 == 1) {
                oVar3.f27293b.f26583c = this;
            }
        }
        if (this.f27297f == 0 && ((w.f) this.f27293b.T).f26624v0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && arrayList.size() > 1) {
            this.f27293b = ((o) arrayList.get(arrayList.size() - 1)).f27293b;
        }
        if (this.f27297f == 0) {
            i11 = this.f27293b.f26596i0;
        } else {
            i11 = this.f27293b.f26598j0;
        }
        this.f27256l = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x03a5, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r27) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.a(x.d):void");
    }

    @Override // x.o
    public final void d() {
        ArrayList arrayList = this.f27255k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        w.e eVar = ((o) arrayList.get(0)).f27293b;
        w.e eVar2 = ((o) arrayList.get(size - 1)).f27293b;
        int i10 = this.f27297f;
        f fVar = this.f27300i;
        f fVar2 = this.f27299h;
        if (i10 == 0) {
            w.d dVar = eVar.I;
            w.d dVar2 = eVar2.K;
            f i11 = o.i(dVar, 0);
            int e2 = dVar.e();
            w.e m10 = m();
            if (m10 != null) {
                e2 = m10.I.e();
            }
            if (i11 != null) {
                o.b(fVar2, i11, e2);
            }
            f i12 = o.i(dVar2, 0);
            int e10 = dVar2.e();
            w.e n10 = n();
            if (n10 != null) {
                e10 = n10.K.e();
            }
            if (i12 != null) {
                o.b(fVar, i12, -e10);
            }
        } else {
            w.d dVar3 = eVar.J;
            w.d dVar4 = eVar2.L;
            f i13 = o.i(dVar3, 1);
            int e11 = dVar3.e();
            w.e m11 = m();
            if (m11 != null) {
                e11 = m11.J.e();
            }
            if (i13 != null) {
                o.b(fVar2, i13, e11);
            }
            f i14 = o.i(dVar4, 1);
            int e12 = dVar4.e();
            w.e n11 = n();
            if (n11 != null) {
                e12 = n11.L.e();
            }
            if (i14 != null) {
                o.b(fVar, i14, -e12);
            }
        }
        fVar2.a = this;
        fVar.a = this;
    }

    @Override // x.o
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27255k;
            if (i10 < arrayList.size()) {
                ((o) arrayList.get(i10)).e();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // x.o
    public final void f() {
        this.f27294c = null;
        Iterator it = this.f27255k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // x.o
    public final long j() {
        ArrayList arrayList = this.f27255k;
        int size = arrayList.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j3 = r5.f27300i.f27269f + ((o) arrayList.get(i10)).j() + j3 + r5.f27299h.f27269f;
        }
        return j3;
    }

    @Override // x.o
    public final boolean k() {
        ArrayList arrayList = this.f27255k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((o) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final w.e m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27255k;
            if (i10 < arrayList.size()) {
                w.e eVar = ((o) arrayList.get(i10)).f27293b;
                if (eVar.f26592g0 != 8) {
                    return eVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final w.e n() {
        ArrayList arrayList = this.f27255k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w.e eVar = ((o) arrayList.get(size)).f27293b;
            if (eVar.f26592g0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f27297f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator it = this.f27255k.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            sb2.append("<");
            sb2.append(oVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
