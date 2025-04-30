package C;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final b f368a = new Object();

    public static boolean a(B.d dVar) {
        B.e eVar;
        boolean z8;
        boolean z9;
        int[] iArr = dVar.f163p0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        B.d dVar2 = dVar.f129T;
        if (dVar2 != null) {
            eVar = (B.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i11 = eVar.f163p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f163p0[1];
        }
        if (i9 != 1 && !dVar.A() && i9 != 2 && ((i9 != 3 || dVar.f165r != 0 || dVar.f132W != 0.0f || !dVar.t(0)) && (i9 != 3 || dVar.f165r != 1 || !dVar.u(0, dVar.q())))) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (i10 != 1 && !dVar.B() && i10 != 2 && ((i10 != 3 || dVar.f166s != 0 || dVar.f132W != 0.0f || !dVar.t(1)) && (i10 != 3 || dVar.f166s != 1 || !dVar.u(1, dVar.k())))) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (dVar.f132W > 0.0f && (z8 || z9)) {
            return true;
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [C.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [C.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static o b(B.d dVar, int i9, ArrayList arrayList, o oVar) {
        int i10;
        int i11;
        if (i9 == 0) {
            i10 = dVar.f159n0;
        } else {
            i10 = dVar.f161o0;
        }
        int i12 = 0;
        if (i10 != -1 && (oVar == 0 || i10 != oVar.b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i13);
                if (oVar2.b == i10) {
                    if (oVar != 0) {
                        oVar.c(i9, oVar2);
                        arrayList.remove((Object) oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i10 != -1) {
            return oVar;
        }
        o oVar3 = oVar;
        if (oVar == 0) {
            if (dVar instanceof B.i) {
                B.i iVar = (B.i) dVar;
                int i14 = 0;
                while (true) {
                    if (i14 < iVar.f251r0) {
                        B.d dVar2 = iVar.f250q0[i14];
                        if ((i9 == 0 && (i11 = dVar2.f159n0) != -1) || (i9 == 1 && (i11 = dVar2.f161o0) != -1)) {
                            break;
                        }
                        i14++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        o oVar4 = (o) arrayList.get(i15);
                        if (oVar4.b == i11) {
                            oVar = oVar4;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (oVar == 0) {
                oVar = new Object();
                oVar.f373a = new ArrayList();
                oVar.f375d = null;
                oVar.f376e = -1;
                int i16 = o.f372f;
                o.f372f = i16 + 1;
                oVar.b = i16;
                oVar.f374c = i9;
            }
            arrayList.add(oVar);
            oVar3 = oVar;
        }
        ArrayList arrayList2 = oVar3.f373a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof B.h) {
                B.h hVar = (B.h) dVar;
                B.c cVar = hVar.f247t0;
                if (hVar.f248u0 == 0) {
                    i12 = 1;
                }
                cVar.c(i12, oVar3, arrayList);
            }
            int i17 = oVar3.b;
            if (i9 == 0) {
                dVar.f159n0 = i17;
                dVar.f119I.c(i9, oVar3, arrayList);
                dVar.f121K.c(i9, oVar3, arrayList);
            } else {
                dVar.f161o0 = i17;
                dVar.f120J.c(i9, oVar3, arrayList);
                dVar.f123M.c(i9, oVar3, arrayList);
                dVar.f122L.c(i9, oVar3, arrayList);
            }
            dVar.f125P.c(i9, oVar3, arrayList);
        }
        return oVar3;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [C.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [C.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [C.b, java.lang.Object] */
    public static void c(int i9, B.d dVar, E.f fVar, boolean z8) {
        boolean z9;
        B.c cVar;
        B.c cVar2;
        char c9;
        B.c cVar3;
        B.c cVar4;
        if (dVar.m) {
            return;
        }
        if (!(dVar instanceof B.e) && dVar.z() && a(dVar)) {
            B.e.V(dVar, fVar, new Object());
        }
        B.c i10 = dVar.i(2);
        B.c i11 = dVar.i(4);
        int d2 = i10.d();
        int d9 = i11.d();
        HashSet hashSet = i10.f103a;
        char c10 = 0;
        if (hashSet != null && i10.f104c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                B.c cVar5 = (B.c) it.next();
                B.d dVar2 = cVar5.f105d;
                int i12 = i9 + 1;
                boolean a6 = a(dVar2);
                if (dVar2.z() && a6) {
                    B.e.V(dVar2, fVar, new Object());
                }
                B.c cVar6 = dVar2.f119I;
                B.c cVar7 = dVar2.f121K;
                if ((cVar5 == cVar6 && (cVar4 = cVar7.f107f) != null && cVar4.f104c) || (cVar5 == cVar7 && (cVar3 = cVar6.f107f) != null && cVar3.f104c)) {
                    c9 = 1;
                } else {
                    c9 = c10;
                }
                int i13 = dVar2.f163p0[c10];
                if (i13 == 3 && !a6) {
                    if (i13 == 3 && dVar2.f169v >= 0 && dVar2.f168u >= 0 && ((dVar2.f147g0 == 8 || (dVar2.f165r == 0 && dVar2.f132W == 0.0f)) && !dVar2.x() && !dVar2.f116F && c9 != 0 && !dVar2.x())) {
                        e(i12, dVar, fVar, dVar2, z8);
                    }
                } else if (!dVar2.z()) {
                    if (cVar5 == cVar6 && cVar7.f107f == null) {
                        int e4 = cVar6.e() + d2;
                        dVar2.J(e4, dVar2.q() + e4);
                        c(i12, dVar2, fVar, z8);
                    } else if (cVar5 == cVar7 && cVar6.f107f == null) {
                        int e9 = d2 - cVar7.e();
                        dVar2.J(e9 - dVar2.q(), e9);
                        c(i12, dVar2, fVar, z8);
                    } else if (c9 != 0 && !dVar2.x()) {
                        d(i12, dVar2, fVar, z8);
                    }
                }
                c10 = 0;
            }
        }
        if (dVar instanceof B.h) {
            return;
        }
        HashSet hashSet2 = i11.f103a;
        if (hashSet2 != null && i11.f104c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                B.c cVar8 = (B.c) it2.next();
                B.d dVar3 = cVar8.f105d;
                int i14 = i9 + 1;
                boolean a9 = a(dVar3);
                if (dVar3.z() && a9) {
                    B.e.V(dVar3, fVar, new Object());
                }
                B.c cVar9 = dVar3.f119I;
                B.c cVar10 = dVar3.f121K;
                if ((cVar8 == cVar9 && (cVar2 = cVar10.f107f) != null && cVar2.f104c) || (cVar8 == cVar10 && (cVar = cVar9.f107f) != null && cVar.f104c)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i15 = dVar3.f163p0[0];
                if (i15 == 3 && !a9) {
                    if (i15 == 3 && dVar3.f169v >= 0 && dVar3.f168u >= 0) {
                        if (dVar3.f147g0 != 8) {
                            if (dVar3.f165r == 0) {
                                if (dVar3.f132W == 0.0f) {
                                }
                            }
                        }
                        if (!dVar3.x() && !dVar3.f116F && z9 && !dVar3.x()) {
                            e(i14, dVar, fVar, dVar3, z8);
                        }
                    }
                } else if (!dVar3.z()) {
                    if (cVar8 == cVar9 && cVar10.f107f == null) {
                        int e10 = cVar9.e() + d9;
                        dVar3.J(e10, dVar3.q() + e10);
                        c(i14, dVar3, fVar, z8);
                    } else if (cVar8 == cVar10 && cVar9.f107f == null) {
                        int e11 = d9 - cVar10.e();
                        dVar3.J(e11 - dVar3.q(), e11);
                        c(i14, dVar3, fVar, z8);
                    } else if (z9 && !dVar3.x()) {
                        d(i14, dVar3, fVar, z8);
                    }
                }
            }
        }
        dVar.m = true;
    }

    public static void d(int i9, B.d dVar, E.f fVar, boolean z8) {
        float f9;
        float f10 = dVar.f142d0;
        B.c cVar = dVar.f119I;
        int d2 = cVar.f107f.d();
        B.c cVar2 = dVar.f121K;
        int d9 = cVar2.f107f.d();
        int e4 = cVar.e() + d2;
        int e9 = d9 - cVar2.e();
        if (d2 == d9) {
            f10 = 0.5f;
        } else {
            d2 = e4;
            d9 = e9;
        }
        int q9 = dVar.q();
        int i10 = (d9 - d2) - q9;
        if (d2 > d9) {
            i10 = (d2 - d9) - q9;
        }
        if (i10 > 0) {
            f9 = (f10 * i10) + 0.5f;
        } else {
            f9 = f10 * i10;
        }
        int i11 = ((int) f9) + d2;
        int i12 = i11 + q9;
        if (d2 > d9) {
            i12 = i11 - q9;
        }
        dVar.J(i11, i12);
        c(i9 + 1, dVar, fVar, z8);
    }

    public static void e(int i9, B.d dVar, E.f fVar, B.d dVar2, boolean z8) {
        int q9;
        float f9 = dVar2.f142d0;
        B.c cVar = dVar2.f119I;
        int e4 = cVar.e() + cVar.f107f.d();
        B.c cVar2 = dVar2.f121K;
        int d2 = cVar2.f107f.d() - cVar2.e();
        if (d2 >= e4) {
            int q10 = dVar2.q();
            if (dVar2.f147g0 != 8) {
                int i10 = dVar2.f165r;
                if (i10 == 2) {
                    if (dVar instanceof B.e) {
                        q9 = dVar.q();
                    } else {
                        q9 = dVar.f129T.q();
                    }
                    q10 = (int) (dVar2.f142d0 * 0.5f * q9);
                } else if (i10 == 0) {
                    q10 = d2 - e4;
                }
                q10 = Math.max(dVar2.f168u, q10);
                int i11 = dVar2.f169v;
                if (i11 > 0) {
                    q10 = Math.min(i11, q10);
                }
            }
            int i12 = e4 + ((int) ((f9 * ((d2 - e4) - q10)) + 0.5f));
            dVar2.J(i12, q10 + i12);
            c(i9 + 1, dVar2, fVar, z8);
        }
    }

    public static void f(int i9, B.d dVar, E.f fVar) {
        float f9;
        float f10 = dVar.f144e0;
        B.c cVar = dVar.f120J;
        int d2 = cVar.f107f.d();
        B.c cVar2 = dVar.f122L;
        int d9 = cVar2.f107f.d();
        int e4 = cVar.e() + d2;
        int e9 = d9 - cVar2.e();
        if (d2 == d9) {
            f10 = 0.5f;
        } else {
            d2 = e4;
            d9 = e9;
        }
        int k6 = dVar.k();
        int i10 = (d9 - d2) - k6;
        if (d2 > d9) {
            i10 = (d2 - d9) - k6;
        }
        if (i10 > 0) {
            f9 = (f10 * i10) + 0.5f;
        } else {
            f9 = f10 * i10;
        }
        int i11 = (int) f9;
        int i12 = d2 + i11;
        int i13 = i12 + k6;
        if (d2 > d9) {
            i12 = d2 - i11;
            i13 = i12 - k6;
        }
        dVar.K(i12, i13);
        i(i9 + 1, dVar, fVar);
    }

    public static void g(int i9, B.d dVar, E.f fVar, B.d dVar2) {
        int k6;
        float f9 = dVar2.f144e0;
        B.c cVar = dVar2.f120J;
        int e4 = cVar.e() + cVar.f107f.d();
        B.c cVar2 = dVar2.f122L;
        int d2 = cVar2.f107f.d() - cVar2.e();
        if (d2 >= e4) {
            int k7 = dVar2.k();
            if (dVar2.f147g0 != 8) {
                int i10 = dVar2.f166s;
                if (i10 == 2) {
                    if (dVar instanceof B.e) {
                        k6 = dVar.k();
                    } else {
                        k6 = dVar.f129T.k();
                    }
                    k7 = (int) (f9 * 0.5f * k6);
                } else if (i10 == 0) {
                    k7 = d2 - e4;
                }
                k7 = Math.max(dVar2.f171x, k7);
                int i11 = dVar2.f172y;
                if (i11 > 0) {
                    k7 = Math.min(i11, k7);
                }
            }
            int i12 = e4 + ((int) ((f9 * ((d2 - e4) - k7)) + 0.5f));
            dVar2.K(i12, k7 + i12);
            i(i9 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i9, int i10, int i11, int i12) {
        boolean z8;
        boolean z9;
        if (i11 != 1 && i11 != 2 && (i11 != 4 || i9 == 2)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (i12 != 1 && i12 != 2 && (i12 != 4 || i10 == 2)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z8 || z9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [C.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [C.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [C.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [C.b, java.lang.Object] */
    public static void i(int i9, B.d dVar, E.f fVar) {
        B.c cVar;
        boolean z8;
        B.c cVar2;
        B.c cVar3;
        boolean z9;
        B.c cVar4;
        B.c cVar5;
        if (dVar.f158n) {
            return;
        }
        if (!(dVar instanceof B.e) && dVar.z() && a(dVar)) {
            B.e.V(dVar, fVar, new Object());
        }
        B.c i10 = dVar.i(3);
        B.c i11 = dVar.i(5);
        int d2 = i10.d();
        int d9 = i11.d();
        HashSet hashSet = i10.f103a;
        if (hashSet != null && i10.f104c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                B.c cVar6 = (B.c) it.next();
                B.d dVar2 = cVar6.f105d;
                int i12 = i9 + 1;
                boolean a6 = a(dVar2);
                if (dVar2.z() && a6) {
                    B.e.V(dVar2, fVar, new Object());
                }
                B.c cVar7 = dVar2.f120J;
                B.c cVar8 = dVar2.f122L;
                if ((cVar6 == cVar7 && (cVar5 = cVar8.f107f) != null && cVar5.f104c) || (cVar6 == cVar8 && (cVar4 = cVar7.f107f) != null && cVar4.f104c)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i13 = dVar2.f163p0[1];
                if (i13 == 3 && !a6) {
                    if (i13 == 3 && dVar2.f172y >= 0 && dVar2.f171x >= 0 && (dVar2.f147g0 == 8 || (dVar2.f166s == 0 && dVar2.f132W == 0.0f))) {
                        if (!dVar2.y() && !dVar2.f116F && z9 && !dVar2.y()) {
                            g(i12, dVar, fVar, dVar2);
                        }
                    }
                } else if (!dVar2.z()) {
                    if (cVar6 == cVar7 && cVar8.f107f == null) {
                        int e4 = cVar7.e() + d2;
                        dVar2.K(e4, dVar2.k() + e4);
                        i(i12, dVar2, fVar);
                    } else if (cVar6 == cVar8 && cVar7.f107f == null) {
                        int e9 = d2 - cVar8.e();
                        dVar2.K(e9 - dVar2.k(), e9);
                        i(i12, dVar2, fVar);
                    } else if (z9 && !dVar2.y()) {
                        f(i12, dVar2, fVar);
                    }
                }
            }
        }
        if (dVar instanceof B.h) {
            return;
        }
        HashSet hashSet2 = i11.f103a;
        if (hashSet2 != null && i11.f104c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                B.c cVar9 = (B.c) it2.next();
                B.d dVar3 = cVar9.f105d;
                int i14 = i9 + 1;
                boolean a9 = a(dVar3);
                if (dVar3.z() && a9) {
                    B.e.V(dVar3, fVar, new Object());
                }
                B.c cVar10 = dVar3.f120J;
                B.c cVar11 = dVar3.f122L;
                if ((cVar9 == cVar10 && (cVar3 = cVar11.f107f) != null && cVar3.f104c) || (cVar9 == cVar11 && (cVar2 = cVar10.f107f) != null && cVar2.f104c)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i15 = dVar3.f163p0[1];
                if (i15 == 3 && !a9) {
                    if (i15 == 3 && dVar3.f172y >= 0 && dVar3.f171x >= 0) {
                        if (dVar3.f147g0 != 8) {
                            if (dVar3.f166s == 0) {
                                if (dVar3.f132W == 0.0f) {
                                }
                            }
                        }
                        if (!dVar3.y() && !dVar3.f116F && z8 && !dVar3.y()) {
                            g(i14, dVar, fVar, dVar3);
                        }
                    }
                } else if (!dVar3.z()) {
                    if (cVar9 == cVar10 && cVar11.f107f == null) {
                        int e10 = cVar10.e() + d9;
                        dVar3.K(e10, dVar3.k() + e10);
                        i(i14, dVar3, fVar);
                    } else if (cVar9 == cVar11 && cVar10.f107f == null) {
                        int e11 = d9 - cVar11.e();
                        dVar3.K(e11 - dVar3.k(), e11);
                        i(i14, dVar3, fVar);
                    } else if (z8 && !dVar3.y()) {
                        f(i14, dVar3, fVar);
                    }
                }
            }
        }
        B.c i16 = dVar.i(6);
        if (i16.f103a != null && i16.f104c) {
            int d10 = i16.d();
            Iterator it3 = i16.f103a.iterator();
            while (it3.hasNext()) {
                B.c cVar12 = (B.c) it3.next();
                B.d dVar4 = cVar12.f105d;
                int i17 = i9 + 1;
                boolean a10 = a(dVar4);
                if (dVar4.z() && a10) {
                    B.e.V(dVar4, fVar, new Object());
                }
                if (dVar4.f163p0[1] != 3 || a10) {
                    if (!dVar4.z() && cVar12 == (cVar = dVar4.f123M)) {
                        int e12 = cVar12.e() + d10;
                        if (dVar4.f115E) {
                            int i18 = e12 - dVar4.f137a0;
                            int i19 = dVar4.f131V + i18;
                            dVar4.f135Z = i18;
                            dVar4.f120J.l(i18);
                            dVar4.f122L.l(i19);
                            cVar.l(e12);
                            dVar4.l = true;
                        }
                        i(i17, dVar4, fVar);
                    }
                }
            }
        }
        dVar.f158n = true;
    }
}
