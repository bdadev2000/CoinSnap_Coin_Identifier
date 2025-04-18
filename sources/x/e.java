package x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import n9.c0;
import n9.d0;
import n9.e0;
import o.q;
import v8.u0;

/* loaded from: classes.dex */
public final class e {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27257b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27258c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27259d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f27260e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractCollection f27261f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractCollection f27262g;

    /* renamed from: h, reason: collision with root package name */
    public Object f27263h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f27264i;

    public e(w.f fVar) {
        this.a = true;
        this.f27257b = true;
        this.f27260e = new ArrayList();
        this.f27261f = new ArrayList();
        this.f27263h = null;
        this.f27264i = new b();
        this.f27262g = new ArrayList();
        this.f27258c = fVar;
        this.f27259d = fVar;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f27264i) {
            if (this.a) {
                return;
            }
            ((CopyOnWriteArraySet) this.f27261f).add(new n9.n(obj));
        }
    }

    public final void b(f fVar, int i10, int i11, ArrayList arrayList, k kVar) {
        o oVar = fVar.f27267d;
        if (oVar.f27294c == null) {
            w.f fVar2 = (w.f) this.f27258c;
            if (oVar != fVar2.f26585d && oVar != fVar2.f26587e) {
                if (kVar == null) {
                    kVar = new k(oVar);
                    arrayList.add(kVar);
                }
                oVar.f27294c = kVar;
                kVar.f27278b.add(oVar);
                f fVar3 = oVar.f27299h;
                Iterator it = fVar3.f27274k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        b((f) dVar, i10, 0, arrayList, kVar);
                    }
                }
                f fVar4 = oVar.f27300i;
                Iterator it2 = fVar4.f27274k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        b((f) dVar2, i10, 1, arrayList, kVar);
                    }
                }
                if (i10 == 1 && (oVar instanceof l)) {
                    Iterator it3 = ((l) oVar).f27279k.f27274k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            b((f) dVar3, i10, 2, arrayList, kVar);
                        }
                    }
                }
                Iterator it4 = fVar3.f27275l.iterator();
                while (it4.hasNext()) {
                    b((f) it4.next(), i10, 0, arrayList, kVar);
                }
                Iterator it5 = fVar4.f27275l.iterator();
                while (it5.hasNext()) {
                    b((f) it5.next(), i10, 1, arrayList, kVar);
                }
                if (i10 == 1 && (oVar instanceof l)) {
                    Iterator it6 = ((l) oVar).f27279k.f27275l.iterator();
                    while (it6.hasNext()) {
                        b((f) it6.next(), i10, 2, arrayList, kVar);
                    }
                }
            }
        }
    }

    public final void c(w.f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Iterator it = fVar.f26664q0.iterator();
        while (it.hasNext()) {
            w.e eVar = (w.e) it.next();
            int[] iArr = eVar.f26610p0;
            int i16 = iArr[0];
            int i17 = iArr[1];
            if (eVar.f26592g0 == 8) {
                eVar.a = true;
            } else {
                float f10 = eVar.f26616w;
                if (f10 < 1.0f && i16 == 3) {
                    eVar.f26612r = 2;
                }
                float f11 = eVar.f26619z;
                if (f11 < 1.0f && i17 == 3) {
                    eVar.f26613s = 2;
                }
                if (eVar.W > 0.0f) {
                    if (i16 == 3 && (i17 == 2 || i17 == 1)) {
                        eVar.f26612r = 3;
                    } else if (i17 == 3 && (i16 == 2 || i16 == 1)) {
                        eVar.f26613s = 3;
                    } else if (i16 == 3 && i17 == 3) {
                        if (eVar.f26612r == 0) {
                            eVar.f26612r = 3;
                        }
                        if (eVar.f26613s == 0) {
                            eVar.f26613s = 3;
                        }
                    }
                }
                w.d dVar = eVar.K;
                w.d dVar2 = eVar.I;
                if (i16 == 3 && eVar.f26612r == 1 && (dVar2.f26576f == null || dVar.f26576f == null)) {
                    i16 = 2;
                }
                w.d dVar3 = eVar.L;
                w.d dVar4 = eVar.J;
                if (i17 == 3 && eVar.f26613s == 1 && (dVar4.f26576f == null || dVar3.f26576f == null)) {
                    i10 = 2;
                } else {
                    i10 = i17;
                }
                j jVar = eVar.f26585d;
                jVar.f27295d = i16;
                int i18 = eVar.f26612r;
                jVar.a = i18;
                l lVar = eVar.f26587e;
                lVar.f27295d = i10;
                int i19 = eVar.f26613s;
                lVar.a = i19;
                if ((i16 != 4 && i16 != 1 && i16 != 2) || (i10 != 4 && i10 != 1 && i10 != 2)) {
                    int[] iArr2 = fVar.f26610p0;
                    w.d[] dVarArr = eVar.Q;
                    if (i16 == 3 && (i10 == 2 || i10 == 1)) {
                        if (i18 == 3) {
                            if (i10 == 2) {
                                h(eVar, 2, 0, 2, 0);
                            }
                            int l10 = eVar.l();
                            h(eVar, 1, (int) ((l10 * eVar.W) + 0.5f), 1, l10);
                            eVar.f26585d.f27296e.d(eVar.r());
                            eVar.f26587e.f27296e.d(eVar.l());
                            eVar.a = true;
                        } else if (i18 == 1) {
                            h(eVar, 2, 0, i10, 0);
                            eVar.f26585d.f27296e.f27276m = eVar.r();
                        } else if (i18 == 2) {
                            int i20 = iArr2[0];
                            if (i20 == 1 || i20 == 4) {
                                h(eVar, 1, (int) ((f10 * fVar.r()) + 0.5f), i10, eVar.l());
                                eVar.f26585d.f27296e.d(eVar.r());
                                eVar.f26587e.f27296e.d(eVar.l());
                                eVar.a = true;
                            } else {
                                i14 = 3;
                            }
                        } else if (dVarArr[0].f26576f != null && dVarArr[1].f26576f != null) {
                            i14 = 3;
                        } else {
                            h(eVar, 2, 0, i10, 0);
                            eVar.f26585d.f27296e.d(eVar.r());
                            eVar.f26587e.f27296e.d(eVar.l());
                            eVar.a = true;
                        }
                    } else {
                        i14 = 3;
                    }
                    if (i10 == i14 && (i16 == 2 || i16 == 1)) {
                        if (i19 == i14) {
                            if (i16 == 2) {
                                h(eVar, 2, 0, 2, 0);
                            }
                            int r6 = eVar.r();
                            float f12 = eVar.W;
                            if (eVar.X == -1) {
                                f12 = 1.0f / f12;
                            }
                            h(eVar, 1, r6, 1, (int) ((r6 * f12) + 0.5f));
                            eVar.f26585d.f27296e.d(eVar.r());
                            eVar.f26587e.f27296e.d(eVar.l());
                            eVar.a = true;
                        } else if (i19 == 1) {
                            h(eVar, i16, 0, 2, 0);
                            eVar.f26587e.f27296e.f27276m = eVar.l();
                        } else if (i19 == 2) {
                            int i21 = iArr2[1];
                            if (i21 == 1 || i21 == 4) {
                                h(eVar, i16, eVar.r(), 1, (int) ((f11 * fVar.l()) + 0.5f));
                                eVar.f26585d.f27296e.d(eVar.r());
                                eVar.f26587e.f27296e.d(eVar.l());
                                eVar.a = true;
                            } else {
                                i15 = 3;
                            }
                        } else if (dVarArr[2].f26576f != null && dVarArr[3].f26576f != null) {
                            i15 = 3;
                        } else {
                            h(eVar, 2, 0, i10, 0);
                            eVar.f26585d.f27296e.d(eVar.r());
                            eVar.f26587e.f27296e.d(eVar.l());
                            eVar.a = true;
                        }
                    } else {
                        i15 = i14;
                    }
                    if (i16 == i15 && i10 == i15) {
                        if (i18 != 1 && i19 != 1) {
                            if (i19 == 2 && i18 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                                h(eVar, 1, (int) ((f10 * fVar.r()) + 0.5f), 1, (int) ((f11 * fVar.l()) + 0.5f));
                                eVar.f26585d.f27296e.d(eVar.r());
                                eVar.f26587e.f27296e.d(eVar.l());
                                eVar.a = true;
                            }
                        } else {
                            h(eVar, 2, 0, 2, 0);
                            eVar.f26585d.f27296e.f27276m = eVar.r();
                            eVar.f26587e.f27296e.f27276m = eVar.l();
                        }
                    }
                } else {
                    int r10 = eVar.r();
                    if (i16 == 4) {
                        i11 = (fVar.r() - dVar2.f26577g) - dVar.f26577g;
                        i16 = 1;
                    } else {
                        i11 = r10;
                    }
                    int l11 = eVar.l();
                    if (i10 == 4) {
                        i12 = (fVar.l() - dVar4.f26577g) - dVar3.f26577g;
                        i13 = 1;
                    } else {
                        i12 = l11;
                        i13 = i10;
                    }
                    h(eVar, i16, i11, i13, i12);
                    eVar.f26585d.f27296e.d(eVar.r());
                    eVar.f26587e.f27296e.d(eVar.l());
                    eVar.a = true;
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.f27260e;
        arrayList.clear();
        w.f fVar = (w.f) this.f27259d;
        fVar.f26585d.f();
        fVar.f26587e.f();
        arrayList.add(fVar.f26585d);
        arrayList.add(fVar.f26587e);
        Iterator it = fVar.f26664q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            w.e eVar = (w.e) it.next();
            if (eVar instanceof w.i) {
                arrayList.add(new h(eVar));
            } else {
                if (eVar.y()) {
                    if (eVar.f26581b == null) {
                        eVar.f26581b = new c(0, eVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f26581b);
                } else {
                    arrayList.add(eVar.f26585d);
                }
                if (eVar.z()) {
                    if (eVar.f26583c == null) {
                        eVar.f26583c = new c(1, eVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f26583c);
                } else {
                    arrayList.add(eVar.f26587e);
                }
                if (eVar instanceof w.k) {
                    arrayList.add(new i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            if (oVar.f27293b != fVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f27262g;
        arrayList2.clear();
        w.f fVar2 = (w.f) this.f27258c;
        f(fVar2.f26585d, 0, arrayList2);
        f(fVar2.f26587e, 1, arrayList2);
        this.a = false;
    }

    public final int e(w.f fVar, int i10) {
        long j3;
        ArrayList arrayList;
        int i11;
        o oVar;
        o oVar2;
        long max;
        float f10;
        long j10;
        w.f fVar2 = fVar;
        int i12 = i10;
        ArrayList arrayList2 = (ArrayList) this.f27262g;
        int size = arrayList2.size();
        int i13 = 0;
        long j11 = 0;
        while (i13 < size) {
            o oVar3 = ((k) arrayList2.get(i13)).a;
            if (!(oVar3 instanceof c) ? !(i12 != 0 ? (oVar3 instanceof l) : (oVar3 instanceof j)) : ((c) oVar3).f27297f != i12) {
                j3 = 0;
                arrayList = arrayList2;
                i11 = size;
            } else {
                if (i12 == 0) {
                    oVar = fVar2.f26585d;
                } else {
                    oVar = fVar2.f26587e;
                }
                f fVar3 = oVar.f27299h;
                if (i12 == 0) {
                    oVar2 = fVar2.f26585d;
                } else {
                    oVar2 = fVar2.f26587e;
                }
                f fVar4 = oVar2.f27300i;
                boolean contains = oVar3.f27299h.f27275l.contains(fVar3);
                f fVar5 = oVar3.f27300i;
                boolean contains2 = fVar5.f27275l.contains(fVar4);
                long j12 = oVar3.j();
                f fVar6 = oVar3.f27299h;
                if (contains && contains2) {
                    long b3 = k.b(fVar6, 0L);
                    long a = k.a(fVar5, 0L);
                    long j13 = b3 - j12;
                    int i14 = fVar5.f27269f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j13 >= (-i14)) {
                        j13 += i14;
                    }
                    long j14 = j13;
                    long j15 = (-a) - j12;
                    long j16 = fVar6.f27269f;
                    long j17 = j15 - j16;
                    if (j17 >= j16) {
                        j17 -= j16;
                    }
                    w.e eVar = oVar3.f27293b;
                    if (i12 == 0) {
                        f10 = eVar.f26586d0;
                    } else if (i12 == 1) {
                        f10 = eVar.f26588e0;
                    } else {
                        eVar.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j10 = (((float) j14) / (1.0f - f10)) + (((float) j17) / f10);
                    } else {
                        j10 = 0;
                    }
                    float f11 = (float) j10;
                    j3 = (fVar6.f27269f + ((((f11 * f10) + 0.5f) + j12) + vd.e.b(1.0f, f10, f11, 0.5f))) - fVar5.f27269f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    if (contains) {
                        max = Math.max(k.b(fVar6, fVar6.f27269f), fVar6.f27269f + j12);
                    } else if (contains2) {
                        max = Math.max(-k.a(fVar5, fVar5.f27269f), (-fVar5.f27269f) + j12);
                    } else {
                        j3 = (oVar3.j() + fVar6.f27269f) - fVar5.f27269f;
                    }
                    j3 = max;
                }
            }
            j11 = Math.max(j11, j3);
            i13++;
            fVar2 = fVar;
            i12 = i10;
            arrayList2 = arrayList;
            size = i11;
        }
        return (int) j11;
    }

    public final void f(o oVar, int i10, ArrayList arrayList) {
        f fVar;
        Iterator it = oVar.f27299h.f27274k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = oVar.f27300i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                b((f) dVar, i10, 0, arrayList, null);
            } else if (dVar instanceof o) {
                b(((o) dVar).f27299h, i10, 0, arrayList, null);
            }
        }
        Iterator it2 = fVar.f27274k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                b((f) dVar2, i10, 1, arrayList, null);
            } else if (dVar2 instanceof o) {
                b(((o) dVar2).f27300i, i10, 1, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((l) oVar).f27279k.f27274k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    b((f) dVar3, i10, 2, arrayList, null);
                }
            }
        }
    }

    public final void g() {
        l();
        if (((ArrayDeque) this.f27263h).isEmpty()) {
            return;
        }
        e0 e0Var = (e0) ((n9.j) this.f27259d);
        if (!e0Var.a.hasMessages(0)) {
            e0Var.getClass();
            d0 b3 = e0.b();
            b3.a = e0Var.a.obtainMessage(0);
            e0Var.getClass();
            Message message = b3.a;
            message.getClass();
            e0Var.a.sendMessageAtFrontOfQueue(message);
            b3.a = null;
            ArrayList arrayList = e0.f22535b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(b3);
                }
            }
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f27262g;
        boolean z10 = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.f27263h);
        ((ArrayDeque) this.f27263h).clear();
        if (z10) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void h(w.e eVar, int i10, int i11, int i12, int i13) {
        boolean z10;
        b bVar = (b) this.f27264i;
        bVar.a = i10;
        bVar.f27246b = i12;
        bVar.f27247c = i11;
        bVar.f27248d = i13;
        ((m) this.f27263h).b(eVar, bVar);
        eVar.O(bVar.f27249e);
        eVar.L(bVar.f27250f);
        eVar.E = bVar.f27252h;
        int i14 = bVar.f27251g;
        eVar.f26580a0 = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.E = z10;
    }

    public final void i() {
        boolean z10;
        a aVar;
        Iterator it = ((w.f) this.f27258c).f26664q0.iterator();
        while (it.hasNext()) {
            w.e eVar = (w.e) it.next();
            if (!eVar.a) {
                int[] iArr = eVar.f26610p0;
                boolean z11 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = eVar.f26612r;
                int i13 = eVar.f26613s;
                if (i10 != 2 && (i10 != 3 || i12 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z11 = true;
                }
                g gVar = eVar.f26585d.f27296e;
                boolean z12 = gVar.f27273j;
                g gVar2 = eVar.f26587e.f27296e;
                boolean z13 = gVar2.f27273j;
                if (z12 && z13) {
                    h(eVar, 1, gVar.f27270g, 1, gVar2.f27270g);
                    eVar.a = true;
                } else if (z12 && z11) {
                    h(eVar, 1, gVar.f27270g, 2, gVar2.f27270g);
                    if (i11 == 3) {
                        eVar.f26587e.f27296e.f27276m = eVar.l();
                    } else {
                        eVar.f26587e.f27296e.d(eVar.l());
                        eVar.a = true;
                    }
                } else if (z13 && z10) {
                    h(eVar, 2, gVar.f27270g, 1, gVar2.f27270g);
                    if (i10 == 3) {
                        eVar.f26585d.f27296e.f27276m = eVar.r();
                    } else {
                        eVar.f26585d.f27296e.d(eVar.r());
                        eVar.a = true;
                    }
                }
                if (eVar.a && (aVar = eVar.f26587e.f27280l) != null) {
                    aVar.d(eVar.f26580a0);
                }
            }
        }
    }

    public final void j(int i10, n9.l lVar) {
        l();
        ((ArrayDeque) this.f27263h).add(new q(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f27261f), i10, lVar, 6));
    }

    public final void k(int i10, n9.l lVar) {
        j(i10, lVar);
        g();
    }

    public final void l() {
        boolean z10;
        if (!this.f27257b) {
            return;
        }
        if (Thread.currentThread() == ((e0) ((n9.j) this.f27259d)).a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
    }

    public e(Looper looper, n9.a aVar, n9.m mVar) {
        this(new CopyOnWriteArraySet(), looper, aVar, mVar, true);
    }

    public e(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, n9.a aVar, n9.m mVar, boolean z10) {
        this.f27258c = aVar;
        this.f27261f = copyOnWriteArraySet;
        this.f27260e = mVar;
        this.f27264i = new Object();
        this.f27262g = new ArrayDeque();
        this.f27263h = new ArrayDeque();
        this.f27259d = ((c0) aVar).a(looper, new Handler.Callback() { // from class: n9.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                x.e eVar = x.e.this;
                Iterator it = ((CopyOnWriteArraySet) eVar.f27261f).iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    m mVar2 = (m) eVar.f27260e;
                    if (!nVar.f22560d && nVar.f22559c) {
                        g b3 = nVar.f22558b.b();
                        nVar.f22558b = new a4.g0(4);
                        nVar.f22559c = false;
                        mVar2.c(nVar.a, b3);
                    }
                    if (((e0) ((j) eVar.f27259d)).a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f27257b = z10;
    }
}
