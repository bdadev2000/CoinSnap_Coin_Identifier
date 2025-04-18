package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import x.m;
import x.o;

/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: t0, reason: collision with root package name */
    public int f26622t0;

    /* renamed from: x0, reason: collision with root package name */
    public int f26626x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f26627y0;

    /* renamed from: r0, reason: collision with root package name */
    public final h.c f26620r0 = new h.c(this);

    /* renamed from: s0, reason: collision with root package name */
    public final x.e f26621s0 = new x.e(this);

    /* renamed from: u0, reason: collision with root package name */
    public m f26623u0 = null;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f26624v0 = false;

    /* renamed from: w0, reason: collision with root package name */
    public final t.d f26625w0 = new t.d();

    /* renamed from: z0, reason: collision with root package name */
    public int f26628z0 = 0;
    public int A0 = 0;
    public b[] B0 = new b[4];
    public b[] C0 = new b[4];
    public int D0 = 257;
    public boolean E0 = false;
    public boolean F0 = false;
    public WeakReference G0 = null;
    public WeakReference H0 = null;
    public WeakReference I0 = null;
    public WeakReference J0 = null;
    public final HashSet K0 = new HashSet();
    public final x.b L0 = new x.b();

    public static void V(e eVar, m mVar, x.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        if (mVar == null) {
            return;
        }
        if (eVar.f26592g0 != 8 && !(eVar instanceof i) && !(eVar instanceof a)) {
            int[] iArr = eVar.f26610p0;
            bVar.a = iArr[0];
            boolean z14 = true;
            bVar.f27246b = iArr[1];
            bVar.f27247c = eVar.r();
            bVar.f27248d = eVar.l();
            bVar.f27253i = false;
            bVar.f27254j = 0;
            if (bVar.a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar.f27246b == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && eVar.W > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && eVar.W > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && eVar.u(0) && eVar.f26612r == 0 && !z12) {
                bVar.a = 2;
                if (z11 && eVar.f26613s == 0) {
                    bVar.a = 1;
                }
                z10 = false;
            }
            if (z11 && eVar.u(1) && eVar.f26613s == 0 && !z13) {
                bVar.f27246b = 2;
                if (z10 && eVar.f26612r == 0) {
                    bVar.f27246b = 1;
                }
                z11 = false;
            }
            if (eVar.B()) {
                bVar.a = 1;
                z10 = false;
            }
            if (eVar.C()) {
                bVar.f27246b = 1;
                z11 = false;
            }
            int[] iArr2 = eVar.f26614t;
            if (z12) {
                if (iArr2[0] == 4) {
                    bVar.a = 1;
                } else if (!z11) {
                    if (bVar.f27246b == 1) {
                        i11 = bVar.f27248d;
                    } else {
                        bVar.a = 2;
                        mVar.b(eVar, bVar);
                        i11 = bVar.f27250f;
                    }
                    bVar.a = 1;
                    bVar.f27247c = (int) (eVar.W * i11);
                }
            }
            if (z13) {
                if (iArr2[1] == 4) {
                    bVar.f27246b = 1;
                } else if (!z10) {
                    if (bVar.a == 1) {
                        i10 = bVar.f27247c;
                    } else {
                        bVar.f27246b = 2;
                        mVar.b(eVar, bVar);
                        i10 = bVar.f27249e;
                    }
                    bVar.f27246b = 1;
                    if (eVar.X == -1) {
                        bVar.f27248d = (int) (i10 / eVar.W);
                    } else {
                        bVar.f27248d = (int) (eVar.W * i10);
                    }
                }
            }
            mVar.b(eVar, bVar);
            eVar.O(bVar.f27249e);
            eVar.L(bVar.f27250f);
            eVar.E = bVar.f27252h;
            int i12 = bVar.f27251g;
            eVar.f26580a0 = i12;
            if (i12 <= 0) {
                z14 = false;
            }
            eVar.E = z14;
            bVar.f27254j = 0;
            return;
        }
        bVar.f27249e = 0;
        bVar.f27250f = 0;
    }

    @Override // w.l, w.e
    public final void D() {
        this.f26625w0.t();
        this.f26626x0 = 0;
        this.f26627y0 = 0;
        super.D();
    }

    @Override // w.e
    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.f26664q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f26664q0.get(i10)).P(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0683 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0810 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x081c A[LOOP:14: B:301:0x081a->B:302:0x081c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0606 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // w.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 2304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.f.R():void");
    }

    public final void S(int i10, e eVar) {
        if (i10 == 0) {
            int i11 = this.f26628z0 + 1;
            b[] bVarArr = this.C0;
            if (i11 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i12 = this.f26628z0;
            bVarArr2[i12] = new b(eVar, 0, this.f26624v0);
            this.f26628z0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i13 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i14 = this.A0;
            bVarArr4[i14] = new b(eVar, 1, this.f26624v0);
            this.A0 = i14 + 1;
        }
    }

    public final void T(t.d dVar) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean W = W(64);
        c(dVar, W);
        int size = this.f26664q0.size();
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) this.f26664q0.get(i11);
            boolean[] zArr = eVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = (e) this.f26664q0.get(i12);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i13 = 0; i13 < aVar.f26663r0; i13++) {
                        e eVar3 = aVar.f26662q0[i13];
                        if (aVar.f26544t0 || eVar3.d()) {
                            int i14 = aVar.f26543s0;
                            if (i14 != 0 && i14 != 1) {
                                if (i14 == 2 || i14 == 3) {
                                    eVar3.S[1] = true;
                                }
                            } else {
                                eVar3.S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            e eVar4 = (e) this.f26664q0.get(i15);
            eVar4.getClass();
            if (!(eVar4 instanceof h) && !(eVar4 instanceof i)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                if (eVar4 instanceof h) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.c(dVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) ((e) it.next());
                int i16 = 0;
                while (true) {
                    if (i16 < hVar.f26663r0) {
                        if (hashSet.contains(hVar.f26662q0[i16])) {
                            z12 = true;
                            break;
                        }
                        i16++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (z12) {
                    hVar.c(dVar, W);
                    hashSet.remove(hVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).c(dVar, W);
                }
                hashSet.clear();
            }
        }
        if (t.d.f25102p) {
            HashSet hashSet2 = new HashSet();
            for (int i17 = 0; i17 < size; i17++) {
                e eVar5 = (e) this.f26664q0.get(i17);
                eVar5.getClass();
                if (!(eVar5 instanceof h) && !(eVar5 instanceof i)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    hashSet2.add(eVar5);
                }
            }
            if (this.f26610p0[0] == 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            b(this, dVar, hashSet2, i10, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e eVar6 = (e) it3.next();
                com.facebook.internal.i.i(this, dVar, eVar6);
                eVar6.c(dVar, W);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                e eVar7 = (e) this.f26664q0.get(i18);
                if (eVar7 instanceof f) {
                    int[] iArr = eVar7.f26610p0;
                    int i19 = iArr[0];
                    int i20 = iArr[1];
                    if (i19 == 2) {
                        eVar7.M(1);
                    }
                    if (i20 == 2) {
                        eVar7.N(1);
                    }
                    eVar7.c(dVar, W);
                    if (i19 == 2) {
                        eVar7.M(i19);
                    }
                    if (i20 == 2) {
                        eVar7.N(i20);
                    }
                } else {
                    com.facebook.internal.i.i(this, dVar, eVar7);
                    if (!(eVar7 instanceof h) && !(eVar7 instanceof i)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        eVar7.c(dVar, W);
                    }
                }
            }
        }
        if (this.f26628z0 > 0) {
            com.bumptech.glide.c.b(this, dVar, null, 0);
        }
        if (this.A0 > 0) {
            com.bumptech.glide.c.b(this, dVar, null, 1);
        }
    }

    public final boolean U(int i10, boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        x.e eVar = this.f26621s0;
        f fVar = (f) eVar.f27258c;
        int k10 = fVar.k(0);
        int k11 = fVar.k(1);
        int s5 = fVar.s();
        int t5 = fVar.t();
        Object obj = eVar.f27260e;
        if (z13 && (k10 == 2 || k11 == 2)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f27297f == i10 && !oVar.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && k10 == 2) {
                    fVar.M(1);
                    fVar.O(eVar.e(fVar, 0));
                    fVar.f26585d.f27296e.d(fVar.r());
                }
            } else if (z13 && k11 == 2) {
                fVar.N(1);
                fVar.L(eVar.e(fVar, 1));
                fVar.f26587e.f27296e.d(fVar.l());
            }
        }
        int[] iArr = fVar.f26610p0;
        if (i10 == 0) {
            int i11 = iArr[0];
            if (i11 == 1 || i11 == 4) {
                int r6 = fVar.r() + s5;
                fVar.f26585d.f27300i.d(r6);
                fVar.f26585d.f27296e.d(r6 - s5);
                z11 = true;
            }
            z11 = false;
        } else {
            int i12 = iArr[1];
            if (i12 == 1 || i12 == 4) {
                int l10 = fVar.l() + t5;
                fVar.f26587e.f27300i.d(l10);
                fVar.f26587e.f27296e.d(l10 - t5);
                z11 = true;
            }
            z11 = false;
        }
        eVar.i();
        ArrayList arrayList = (ArrayList) obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.f27297f == i10 && (oVar2.f27293b != fVar || oVar2.f27298g)) {
                oVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar3 = (o) it3.next();
            if (oVar3.f27297f == i10 && (z11 || oVar3.f27293b != fVar)) {
                if (!oVar3.f27299h.f27273j || !oVar3.f27300i.f27273j || (!(oVar3 instanceof x.c) && !oVar3.f27296e.f27273j)) {
                    z12 = false;
                    break;
                }
            }
        }
        fVar.M(k10);
        fVar.N(k11);
        return z12;
    }

    public final boolean W(int i10) {
        return (this.D0 & i10) == i10;
    }

    @Override // w.e
    public final void o(StringBuilder sb2) {
        sb2.append(this.f26597j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.V);
        sb2.append("\n");
        Iterator it = this.f26664q0.iterator();
        while (it.hasNext()) {
            ((e) it.next()).o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
