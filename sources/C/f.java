package C;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public B.e f351a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352c;

    /* renamed from: d, reason: collision with root package name */
    public B.e f353d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f354e;

    /* renamed from: f, reason: collision with root package name */
    public E.f f355f;

    /* renamed from: g, reason: collision with root package name */
    public b f356g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f357h;

    /* JADX WARN: Type inference failed for: r10v2, types: [C.m, java.lang.Object] */
    public final void a(g gVar, int i9, ArrayList arrayList, m mVar) {
        p pVar = gVar.f360d;
        if (pVar.f378c == null) {
            B.e eVar = this.f351a;
            if (pVar != eVar.f141d) {
                m mVar2 = mVar;
                if (pVar != eVar.f143e) {
                    if (mVar == null) {
                        ?? obj = new Object();
                        obj.f370a = null;
                        obj.b = new ArrayList();
                        obj.f370a = pVar;
                        arrayList.add(obj);
                        mVar2 = obj;
                    }
                    pVar.f378c = mVar2;
                    mVar2.b.add(pVar);
                    g gVar2 = pVar.f383h;
                    Iterator it = gVar2.f367k.iterator();
                    while (it.hasNext()) {
                        e eVar2 = (e) it.next();
                        if (eVar2 instanceof g) {
                            a((g) eVar2, i9, arrayList, mVar2);
                        }
                    }
                    g gVar3 = pVar.f384i;
                    Iterator it2 = gVar3.f367k.iterator();
                    while (it2.hasNext()) {
                        e eVar3 = (e) it2.next();
                        if (eVar3 instanceof g) {
                            a((g) eVar3, i9, arrayList, mVar2);
                        }
                    }
                    if (i9 == 1 && (pVar instanceof n)) {
                        Iterator it3 = ((n) pVar).f371k.f367k.iterator();
                        while (it3.hasNext()) {
                            e eVar4 = (e) it3.next();
                            if (eVar4 instanceof g) {
                                a((g) eVar4, i9, arrayList, mVar2);
                            }
                        }
                    }
                    Iterator it4 = gVar2.l.iterator();
                    while (it4.hasNext()) {
                        a((g) it4.next(), i9, arrayList, mVar2);
                    }
                    Iterator it5 = gVar3.l.iterator();
                    while (it5.hasNext()) {
                        a((g) it5.next(), i9, arrayList, mVar2);
                    }
                    if (i9 == 1 && (pVar instanceof n)) {
                        Iterator it6 = ((n) pVar).f371k.l.iterator();
                        while (it6.hasNext()) {
                            a((g) it6.next(), i9, arrayList, mVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(B.e r17) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.f.b(B.e):void");
    }

    public final void c() {
        ArrayList arrayList = this.f354e;
        arrayList.clear();
        B.e eVar = this.f353d;
        eVar.f141d.f();
        eVar.f143e.f();
        arrayList.add(eVar.f141d);
        arrayList.add(eVar.f143e);
        Iterator it = eVar.f185q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            B.d dVar = (B.d) it.next();
            if (dVar instanceof B.h) {
                p pVar = new p(dVar);
                dVar.f141d.f();
                dVar.f143e.f();
                pVar.f381f = ((B.h) dVar).f248u0;
                arrayList.add(pVar);
            } else {
                if (dVar.x()) {
                    if (dVar.b == null) {
                        dVar.b = new d(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.b);
                } else {
                    arrayList.add(dVar.f141d);
                }
                if (dVar.y()) {
                    if (dVar.f139c == null) {
                        dVar.f139c = new d(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f139c);
                } else {
                    arrayList.add(dVar.f143e);
                }
                if (dVar instanceof B.i) {
                    arrayList.add(new p(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar2 = (p) it3.next();
            if (pVar2.b != eVar) {
                pVar2.d();
            }
        }
        ArrayList arrayList2 = this.f357h;
        arrayList2.clear();
        B.e eVar2 = this.f351a;
        e(eVar2.f141d, 0, arrayList2);
        e(eVar2.f143e, 1, arrayList2);
        this.b = false;
    }

    public final int d(B.e eVar, int i9) {
        p pVar;
        p pVar2;
        ArrayList arrayList;
        int i10;
        int i11;
        long j7;
        float f9;
        long j9;
        B.e eVar2 = eVar;
        ArrayList arrayList2 = this.f357h;
        int size = arrayList2.size();
        int i12 = 0;
        long j10 = 0;
        while (i12 < size) {
            p pVar3 = ((m) arrayList2.get(i12)).f370a;
            if (!(pVar3 instanceof d) ? !(i9 != 0 ? (pVar3 instanceof n) : (pVar3 instanceof l)) : ((d) pVar3).f381f != i9) {
                arrayList = arrayList2;
                i10 = size;
                i11 = i12;
                j7 = 0;
            } else {
                if (i9 == 0) {
                    pVar = eVar2.f141d;
                } else {
                    pVar = eVar2.f143e;
                }
                g gVar = pVar.f383h;
                if (i9 == 0) {
                    pVar2 = eVar2.f141d;
                } else {
                    pVar2 = eVar2.f143e;
                }
                g gVar2 = pVar2.f384i;
                boolean contains = pVar3.f383h.l.contains(gVar);
                g gVar3 = pVar3.f384i;
                boolean contains2 = gVar3.l.contains(gVar2);
                long j11 = pVar3.j();
                g gVar4 = pVar3.f383h;
                if (contains && contains2) {
                    long b = m.b(gVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i10 = size;
                    long a6 = m.a(gVar3, 0L);
                    long j12 = b - j11;
                    int i13 = gVar3.f362f;
                    arrayList = arrayList3;
                    i11 = i12;
                    if (j12 >= (-i13)) {
                        j12 += i13;
                    }
                    long j13 = (-a6) - j11;
                    long j14 = gVar4.f362f;
                    long j15 = j13 - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    B.d dVar = pVar3.b;
                    if (i9 == 0) {
                        f9 = dVar.f142d0;
                    } else if (i9 == 1) {
                        f9 = dVar.f144e0;
                    } else {
                        dVar.getClass();
                        f9 = -1.0f;
                    }
                    if (f9 > 0.0f) {
                        j9 = (((float) j12) / (1.0f - f9)) + (((float) j15) / f9);
                    } else {
                        j9 = 0;
                    }
                    float f10 = (float) j9;
                    j7 = (gVar4.f362f + ((((f10 * f9) + 0.5f) + j11) + AbstractC2914a.a(1.0f, f9, f10, 0.5f))) - gVar3.f362f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i12;
                    if (contains) {
                        j7 = Math.max(m.b(gVar4, gVar4.f362f), gVar4.f362f + j11);
                    } else if (contains2) {
                        j7 = Math.max(-m.a(gVar3, gVar3.f362f), (-gVar3.f362f) + j11);
                    } else {
                        j7 = (pVar3.j() + gVar4.f362f) - gVar3.f362f;
                    }
                }
            }
            j10 = Math.max(j10, j7);
            i12 = i11 + 1;
            eVar2 = eVar;
            size = i10;
            arrayList2 = arrayList;
        }
        return (int) j10;
    }

    public final void e(p pVar, int i9, ArrayList arrayList) {
        g gVar;
        Iterator it = pVar.f383h.f367k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = pVar.f384i;
            if (!hasNext) {
                break;
            }
            e eVar = (e) it.next();
            if (eVar instanceof g) {
                a((g) eVar, i9, arrayList, null);
            } else if (eVar instanceof p) {
                a(((p) eVar).f383h, i9, arrayList, null);
            }
        }
        Iterator it2 = gVar.f367k.iterator();
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (eVar2 instanceof g) {
                a((g) eVar2, i9, arrayList, null);
            } else if (eVar2 instanceof p) {
                a(((p) eVar2).f384i, i9, arrayList, null);
            }
        }
        if (i9 == 1) {
            Iterator it3 = ((n) pVar).f371k.f367k.iterator();
            while (it3.hasNext()) {
                e eVar3 = (e) it3.next();
                if (eVar3 instanceof g) {
                    a((g) eVar3, i9, arrayList, null);
                }
            }
        }
    }

    public final void f(int i9, int i10, int i11, int i12, B.d dVar) {
        b bVar = this.f356g;
        bVar.f337a = i9;
        bVar.b = i11;
        bVar.f338c = i10;
        bVar.f339d = i12;
        this.f355f.b(dVar, bVar);
        dVar.O(bVar.f340e);
        dVar.L(bVar.f341f);
        dVar.f115E = bVar.f343h;
        dVar.I(bVar.f342g);
    }

    public final void g() {
        boolean z8;
        a aVar;
        Iterator it = this.f351a.f185q0.iterator();
        while (it.hasNext()) {
            B.d dVar = (B.d) it.next();
            if (!dVar.f136a) {
                int[] iArr = dVar.f163p0;
                boolean z9 = false;
                int i9 = iArr[0];
                int i10 = iArr[1];
                int i11 = dVar.f165r;
                int i12 = dVar.f166s;
                if (i9 != 2 && (i9 != 3 || i11 != 1)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (i10 == 2 || (i10 == 3 && i12 == 1)) {
                    z9 = true;
                }
                h hVar = dVar.f141d.f380e;
                boolean z10 = hVar.f366j;
                h hVar2 = dVar.f143e.f380e;
                boolean z11 = hVar2.f366j;
                if (z10 && z11) {
                    f(1, hVar.f363g, 1, hVar2.f363g, dVar);
                    dVar.f136a = true;
                } else if (z10 && z9) {
                    f(1, hVar.f363g, 2, hVar2.f363g, dVar);
                    if (i10 == 3) {
                        dVar.f143e.f380e.m = dVar.k();
                    } else {
                        dVar.f143e.f380e.d(dVar.k());
                        dVar.f136a = true;
                    }
                } else if (z11 && z8) {
                    f(2, hVar.f363g, 1, hVar2.f363g, dVar);
                    if (i9 == 3) {
                        dVar.f141d.f380e.m = dVar.q();
                    } else {
                        dVar.f141d.f380e.d(dVar.q());
                        dVar.f136a = true;
                    }
                }
                if (dVar.f136a && (aVar = dVar.f143e.l) != null) {
                    aVar.d(dVar.f137a0);
                }
            }
        }
    }
}
