package B;

import C.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import l5.k;
import z.C2963c;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: A0, reason: collision with root package name */
    public int f174A0;

    /* renamed from: B0, reason: collision with root package name */
    public b[] f175B0;

    /* renamed from: C0, reason: collision with root package name */
    public b[] f176C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f177D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f178E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f179F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f180G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f181H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f182I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f183J0;
    public final HashSet K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C.b f184L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f185q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final C.c f186r0 = new C.c(this);

    /* renamed from: s0, reason: collision with root package name */
    public final C.f f187s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f188t0;

    /* renamed from: u0, reason: collision with root package name */
    public E.f f189u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f190v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C2963c f191w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f192x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f193y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f194z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, C.f] */
    /* JADX WARN: Type inference failed for: r0v5, types: [C.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [C.b, java.lang.Object] */
    public e() {
        ?? obj = new Object();
        obj.b = true;
        obj.f352c = true;
        obj.f354e = new ArrayList();
        new ArrayList();
        obj.f355f = null;
        obj.f356g = new Object();
        obj.f357h = new ArrayList();
        obj.f351a = this;
        obj.f353d = this;
        this.f187s0 = obj;
        this.f189u0 = null;
        this.f190v0 = false;
        this.f191w0 = new C2963c();
        this.f194z0 = 0;
        this.f174A0 = 0;
        this.f175B0 = new b[4];
        this.f176C0 = new b[4];
        this.f177D0 = 257;
        this.f178E0 = false;
        this.f179F0 = false;
        this.f180G0 = null;
        this.f181H0 = null;
        this.f182I0 = null;
        this.f183J0 = null;
        this.K0 = new HashSet();
        this.f184L0 = new Object();
    }

    public static void V(d dVar, E.f fVar, C.b bVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        if (fVar == null) {
            return;
        }
        if (dVar.f147g0 != 8 && !(dVar instanceof h) && !(dVar instanceof a)) {
            int[] iArr = dVar.f163p0;
            bVar.f337a = iArr[0];
            bVar.b = iArr[1];
            bVar.f338c = dVar.q();
            bVar.f339d = dVar.k();
            bVar.f344i = false;
            bVar.f345j = 0;
            if (bVar.f337a == 3) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (bVar.b == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8 && dVar.f132W > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 && dVar.f132W > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z8 && dVar.t(0) && dVar.f165r == 0 && !z10) {
                bVar.f337a = 2;
                if (z9 && dVar.f166s == 0) {
                    bVar.f337a = 1;
                }
                z8 = false;
            }
            if (z9 && dVar.t(1) && dVar.f166s == 0 && !z11) {
                bVar.b = 2;
                if (z8 && dVar.f165r == 0) {
                    bVar.b = 1;
                }
                z9 = false;
            }
            if (dVar.A()) {
                bVar.f337a = 1;
                z8 = false;
            }
            if (dVar.B()) {
                bVar.b = 1;
                z9 = false;
            }
            int[] iArr2 = dVar.f167t;
            if (z10) {
                if (iArr2[0] == 4) {
                    bVar.f337a = 1;
                } else if (!z9) {
                    if (bVar.b == 1) {
                        i10 = bVar.f339d;
                    } else {
                        bVar.f337a = 2;
                        fVar.b(dVar, bVar);
                        i10 = bVar.f341f;
                    }
                    bVar.f337a = 1;
                    bVar.f338c = (int) (dVar.f132W * i10);
                }
            }
            if (z11) {
                if (iArr2[1] == 4) {
                    bVar.b = 1;
                } else if (!z8) {
                    if (bVar.f337a == 1) {
                        i9 = bVar.f338c;
                    } else {
                        bVar.b = 2;
                        fVar.b(dVar, bVar);
                        i9 = bVar.f340e;
                    }
                    bVar.b = 1;
                    if (dVar.f133X == -1) {
                        bVar.f339d = (int) (i9 / dVar.f132W);
                    } else {
                        bVar.f339d = (int) (dVar.f132W * i9);
                    }
                }
            }
            fVar.b(dVar, bVar);
            dVar.O(bVar.f340e);
            dVar.L(bVar.f341f);
            dVar.f115E = bVar.f343h;
            dVar.I(bVar.f342g);
            bVar.f345j = 0;
            return;
        }
        bVar.f340e = 0;
        bVar.f341f = 0;
    }

    @Override // B.d
    public final void C() {
        this.f191w0.t();
        this.f192x0 = 0;
        this.f193y0 = 0;
        X();
    }

    @Override // B.d
    public final void F(k kVar) {
        super.F(kVar);
        int size = this.f185q0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((d) this.f185q0.get(i9)).F(kVar);
        }
    }

    @Override // B.d
    public final void P(boolean z8, boolean z9) {
        super.P(z8, z9);
        int size = this.f185q0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((d) this.f185q0.get(i9)).P(z8, z9);
        }
    }

    public final void R(d dVar, int i9) {
        if (i9 == 0) {
            int i10 = this.f194z0 + 1;
            b[] bVarArr = this.f176C0;
            if (i10 >= bVarArr.length) {
                this.f176C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f176C0;
            int i11 = this.f194z0;
            bVarArr2[i11] = new b(dVar, 0, this.f190v0);
            this.f194z0 = i11 + 1;
            return;
        }
        if (i9 == 1) {
            int i12 = this.f174A0 + 1;
            b[] bVarArr3 = this.f175B0;
            if (i12 >= bVarArr3.length) {
                this.f175B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f175B0;
            int i13 = this.f174A0;
            bVarArr4[i13] = new b(dVar, 1, this.f190v0);
            this.f174A0 = i13 + 1;
        }
    }

    public final void S(C2963c c2963c) {
        int i9;
        boolean W2 = W(64);
        b(c2963c, W2);
        int size = this.f185q0.size();
        boolean z8 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) this.f185q0.get(i10);
            boolean[] zArr = dVar.f128S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z8 = true;
            }
        }
        if (z8) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar2 = (d) this.f185q0.get(i11);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i12 = 0; i12 < aVar.f251r0; i12++) {
                        d dVar3 = aVar.f250q0[i12];
                        if (aVar.f86t0 || dVar3.c()) {
                            int i13 = aVar.f85s0;
                            if (i13 != 0 && i13 != 1) {
                                if (i13 == 2 || i13 == 3) {
                                    dVar3.f128S[1] = true;
                                }
                            } else {
                                dVar3.f128S[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar4 = (d) this.f185q0.get(i14);
            dVar4.getClass();
            boolean z9 = dVar4 instanceof g;
            if (z9 || (dVar4 instanceof h)) {
                if (z9) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(c2963c, W2);
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
                g gVar = (g) ((d) it.next());
                for (int i15 = 0; i15 < gVar.f251r0; i15++) {
                    if (hashSet.contains(gVar.f250q0[i15])) {
                        gVar.b(c2963c, W2);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(c2963c, W2);
                }
                hashSet.clear();
            }
        }
        if (C2963c.f24464p) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                d dVar5 = (d) this.f185q0.get(i16);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.f163p0[0] == 2) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            a(this, c2963c, hashSet2, i9, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, c2963c, dVar6);
                dVar6.b(c2963c, W2);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                d dVar7 = (d) this.f185q0.get(i17);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f163p0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        dVar7.M(1);
                    }
                    if (i19 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(c2963c, W2);
                    if (i18 == 2) {
                        dVar7.M(i18);
                    }
                    if (i19 == 2) {
                        dVar7.N(i19);
                    }
                } else {
                    j.b(this, c2963c, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(c2963c, W2);
                    }
                }
            }
        }
        if (this.f194z0 > 0) {
            j.a(this, c2963c, null, 0);
        }
        if (this.f174A0 > 0) {
            j.a(this, c2963c, null, 1);
        }
    }

    public final boolean T(int i9, boolean z8) {
        boolean z9;
        C.f fVar = this.f187s0;
        e eVar = fVar.f351a;
        boolean z10 = false;
        int j7 = eVar.j(0);
        int j9 = eVar.j(1);
        int r9 = eVar.r();
        int s5 = eVar.s();
        ArrayList arrayList = fVar.f354e;
        if (z8 && (j7 == 2 || j9 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f381f == i9 && !pVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i9 == 0) {
                if (z8 && j7 == 2) {
                    eVar.M(1);
                    eVar.O(fVar.d(eVar, 0));
                    eVar.f141d.f380e.d(eVar.q());
                }
            } else if (z8 && j9 == 2) {
                eVar.N(1);
                eVar.L(fVar.d(eVar, 1));
                eVar.f143e.f380e.d(eVar.k());
            }
        }
        int[] iArr = eVar.f163p0;
        if (i9 == 0) {
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int q9 = eVar.q() + r9;
                eVar.f141d.f384i.d(q9);
                eVar.f141d.f380e.d(q9 - r9);
                z9 = true;
            }
            z9 = false;
        } else {
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int k6 = eVar.k() + s5;
                eVar.f143e.f384i.d(k6);
                eVar.f143e.f380e.d(k6 - s5);
                z9 = true;
            }
            z9 = false;
        }
        fVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f381f == i9 && (pVar2.b != eVar || pVar2.f382g)) {
                pVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                p pVar3 = (p) it3.next();
                if (pVar3.f381f == i9 && (z9 || pVar3.b != eVar)) {
                    if (!pVar3.f383h.f366j) {
                        break;
                    }
                    if (!pVar3.f384i.f366j) {
                        break;
                    }
                    if (!(pVar3 instanceof C.d) && !pVar3.f380e.f366j) {
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
        }
        eVar.M(j7);
        eVar.N(j9);
        return z10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:227|(7:228|229|(1:231)|232|233|234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0797, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0824 A[LOOP:14: B:280:0x0822->B:281:0x0824, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0633  */
    /* JADX WARN: Type inference failed for: r5v53, types: [C.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.e.U():void");
    }

    public final boolean W(int i9) {
        if ((this.f177D0 & i9) == i9) {
            return true;
        }
        return false;
    }

    public final void X() {
        this.f185q0.clear();
        super.C();
    }

    @Override // B.d
    public final void n(StringBuilder sb) {
        sb.append(this.f152j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f130U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f131V);
        sb.append("\n");
        Iterator it = this.f185q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
