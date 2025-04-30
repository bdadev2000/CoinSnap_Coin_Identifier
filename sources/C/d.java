package C;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f350k;
    public int l;

    public d(B.d dVar, int i9) {
        super(dVar);
        B.d dVar2;
        p pVar;
        int i10;
        p pVar2;
        this.f350k = new ArrayList();
        this.f381f = i9;
        B.d dVar3 = this.b;
        B.d m = dVar3.m(i9);
        while (true) {
            B.d dVar4 = m;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                m = dVar3.m(this.f381f);
            }
        }
        this.b = dVar2;
        int i11 = this.f381f;
        if (i11 == 0) {
            pVar = dVar2.f141d;
        } else if (i11 == 1) {
            pVar = dVar2.f143e;
        } else {
            pVar = null;
        }
        ArrayList arrayList = this.f350k;
        arrayList.add(pVar);
        B.d l = dVar2.l(this.f381f);
        while (l != null) {
            int i12 = this.f381f;
            if (i12 == 0) {
                pVar2 = l.f141d;
            } else if (i12 == 1) {
                pVar2 = l.f143e;
            } else {
                pVar2 = null;
            }
            arrayList.add(pVar2);
            l = l.l(this.f381f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar3 = (p) it.next();
            int i13 = this.f381f;
            if (i13 == 0) {
                pVar3.b.b = this;
            } else if (i13 == 1) {
                pVar3.b.f139c = this;
            }
        }
        if (this.f381f == 0 && ((B.e) this.b.f129T).f190v0 && arrayList.size() > 1) {
            this.b = ((p) com.mbridge.msdk.foundation.entity.o.g(arrayList, 1)).b;
        }
        if (this.f381f == 0) {
            i10 = this.b.f151i0;
        } else {
            i10 = this.b.f153j0;
        }
        this.l = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // C.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(C.e r27) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.a(C.e):void");
    }

    @Override // C.p
    public final void d() {
        ArrayList arrayList = this.f350k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        B.d dVar = ((p) arrayList.get(0)).b;
        B.d dVar2 = ((p) arrayList.get(size - 1)).b;
        int i9 = this.f381f;
        g gVar = this.f384i;
        g gVar2 = this.f383h;
        if (i9 == 0) {
            B.c cVar = dVar.f119I;
            B.c cVar2 = dVar2.f121K;
            g i10 = p.i(cVar, 0);
            int e4 = cVar.e();
            B.d m = m();
            if (m != null) {
                e4 = m.f119I.e();
            }
            if (i10 != null) {
                p.b(gVar2, i10, e4);
            }
            g i11 = p.i(cVar2, 0);
            int e9 = cVar2.e();
            B.d n2 = n();
            if (n2 != null) {
                e9 = n2.f121K.e();
            }
            if (i11 != null) {
                p.b(gVar, i11, -e9);
            }
        } else {
            B.c cVar3 = dVar.f120J;
            B.c cVar4 = dVar2.f122L;
            g i12 = p.i(cVar3, 1);
            int e10 = cVar3.e();
            B.d m2 = m();
            if (m2 != null) {
                e10 = m2.f120J.e();
            }
            if (i12 != null) {
                p.b(gVar2, i12, e10);
            }
            g i13 = p.i(cVar4, 1);
            int e11 = cVar4.e();
            B.d n9 = n();
            if (n9 != null) {
                e11 = n9.f122L.e();
            }
            if (i13 != null) {
                p.b(gVar, i13, -e11);
            }
        }
        gVar2.f358a = this;
        gVar.f358a = this;
    }

    @Override // C.p
    public final void e() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f350k;
            if (i9 < arrayList.size()) {
                ((p) arrayList.get(i9)).e();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // C.p
    public final void f() {
        this.f378c = null;
        Iterator it = this.f350k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // C.p
    public final long j() {
        ArrayList arrayList = this.f350k;
        int size = arrayList.size();
        long j7 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            j7 = r5.f384i.f362f + ((p) arrayList.get(i9)).j() + j7 + r5.f383h.f362f;
        }
        return j7;
    }

    @Override // C.p
    public final boolean k() {
        ArrayList arrayList = this.f350k;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!((p) arrayList.get(i9)).k()) {
                return false;
            }
        }
        return true;
    }

    public final B.d m() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f350k;
            if (i9 < arrayList.size()) {
                B.d dVar = ((p) arrayList.get(i9)).b;
                if (dVar.f147g0 != 8) {
                    return dVar;
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public final B.d n() {
        ArrayList arrayList = this.f350k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            B.d dVar = ((p) arrayList.get(size)).b;
            if (dVar.f147g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f381f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.f350k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
