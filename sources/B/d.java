package B;

import C.l;
import C.n;
import C.p;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l5.k;
import x0.AbstractC2914a;
import z.AbstractC2965e;
import z.C2963c;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public int f111A;

    /* renamed from: B, reason: collision with root package name */
    public float f112B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f113C;

    /* renamed from: D, reason: collision with root package name */
    public float f114D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f115E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f116F;

    /* renamed from: G, reason: collision with root package name */
    public int f117G;

    /* renamed from: H, reason: collision with root package name */
    public int f118H;

    /* renamed from: I, reason: collision with root package name */
    public final c f119I;

    /* renamed from: J, reason: collision with root package name */
    public final c f120J;

    /* renamed from: K, reason: collision with root package name */
    public final c f121K;

    /* renamed from: L, reason: collision with root package name */
    public final c f122L;

    /* renamed from: M, reason: collision with root package name */
    public final c f123M;

    /* renamed from: N, reason: collision with root package name */
    public final c f124N;
    public final c O;

    /* renamed from: P, reason: collision with root package name */
    public final c f125P;

    /* renamed from: Q, reason: collision with root package name */
    public final c[] f126Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f127R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean[] f128S;

    /* renamed from: T, reason: collision with root package name */
    public d f129T;

    /* renamed from: U, reason: collision with root package name */
    public int f130U;

    /* renamed from: V, reason: collision with root package name */
    public int f131V;

    /* renamed from: W, reason: collision with root package name */
    public float f132W;

    /* renamed from: X, reason: collision with root package name */
    public int f133X;

    /* renamed from: Y, reason: collision with root package name */
    public int f134Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f135Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f137a0;
    public C.d b;

    /* renamed from: b0, reason: collision with root package name */
    public int f138b0;

    /* renamed from: c, reason: collision with root package name */
    public C.d f139c;

    /* renamed from: c0, reason: collision with root package name */
    public int f140c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f142d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f144e0;
    public Object f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f147g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f149h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f151i0;

    /* renamed from: j, reason: collision with root package name */
    public String f152j;

    /* renamed from: j0, reason: collision with root package name */
    public int f153j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f154k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f155k0;
    public boolean l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f156l0;
    public boolean m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f157m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f158n;

    /* renamed from: n0, reason: collision with root package name */
    public int f159n0;

    /* renamed from: o, reason: collision with root package name */
    public int f160o;

    /* renamed from: o0, reason: collision with root package name */
    public int f161o0;

    /* renamed from: p, reason: collision with root package name */
    public int f162p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f163p0;

    /* renamed from: q, reason: collision with root package name */
    public int f164q;

    /* renamed from: r, reason: collision with root package name */
    public int f165r;

    /* renamed from: s, reason: collision with root package name */
    public int f166s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f167t;

    /* renamed from: u, reason: collision with root package name */
    public int f168u;

    /* renamed from: v, reason: collision with root package name */
    public int f169v;

    /* renamed from: w, reason: collision with root package name */
    public float f170w;

    /* renamed from: x, reason: collision with root package name */
    public int f171x;

    /* renamed from: y, reason: collision with root package name */
    public int f172y;

    /* renamed from: z, reason: collision with root package name */
    public float f173z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f136a = false;

    /* renamed from: d, reason: collision with root package name */
    public l f141d = null;

    /* renamed from: e, reason: collision with root package name */
    public n f143e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f145f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f146g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f148h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f150i = -1;

    public d() {
        new HashMap();
        this.f154k = false;
        this.l = false;
        this.m = false;
        this.f158n = false;
        this.f160o = -1;
        this.f162p = -1;
        this.f164q = 0;
        this.f165r = 0;
        this.f166s = 0;
        this.f167t = new int[2];
        this.f168u = 0;
        this.f169v = 0;
        this.f170w = 1.0f;
        this.f171x = 0;
        this.f172y = 0;
        this.f173z = 1.0f;
        this.f111A = -1;
        this.f112B = 1.0f;
        this.f113C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f114D = 0.0f;
        this.f115E = false;
        this.f116F = false;
        this.f117G = 0;
        this.f118H = 0;
        c cVar = new c(this, 2);
        this.f119I = cVar;
        c cVar2 = new c(this, 3);
        this.f120J = cVar2;
        c cVar3 = new c(this, 4);
        this.f121K = cVar3;
        c cVar4 = new c(this, 5);
        this.f122L = cVar4;
        c cVar5 = new c(this, 6);
        this.f123M = cVar5;
        c cVar6 = new c(this, 8);
        this.f124N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.f125P = cVar8;
        this.f126Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.f127R = arrayList;
        this.f128S = new boolean[2];
        this.f163p0 = new int[]{1, 1};
        this.f129T = null;
        this.f130U = 0;
        this.f131V = 0;
        this.f132W = 0.0f;
        this.f133X = -1;
        this.f134Y = 0;
        this.f135Z = 0;
        this.f137a0 = 0;
        this.f142d0 = 0.5f;
        this.f144e0 = 0.5f;
        this.f147g0 = 0;
        this.f149h0 = null;
        this.f151i0 = 0;
        this.f153j0 = 0;
        this.f155k0 = new float[]{-1.0f, -1.0f};
        this.f156l0 = new d[]{null, null};
        this.f157m0 = new d[]{null, null};
        this.f159n0 = -1;
        this.f161o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i9, int i10, String str, StringBuilder sb) {
        if (i9 == i10) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i9);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f9, float f10) {
        if (f9 == f10) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f9);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i9, int i10, int i11, int i12, int i13, float f9) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i9, 0, "      size", sb);
        G(i10, 0, "      min", sb);
        G(i11, Integer.MAX_VALUE, "      max", sb);
        G(i12, 0, "      matchMin", sb);
        G(i13, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f9, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f107f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f107f);
        sb.append("'");
        if (cVar.f109h != Integer.MIN_VALUE || cVar.f108g != 0) {
            sb.append(",");
            sb.append(cVar.f108g);
            if (cVar.f109h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f109h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (!this.f154k && (!this.f119I.f104c || !this.f121K.f104c)) {
            return false;
        }
        return true;
    }

    public boolean B() {
        if (!this.l && (!this.f120J.f104c || !this.f122L.f104c)) {
            return false;
        }
        return true;
    }

    public void C() {
        this.f119I.j();
        this.f120J.j();
        this.f121K.j();
        this.f122L.j();
        this.f123M.j();
        this.f124N.j();
        this.O.j();
        this.f125P.j();
        this.f129T = null;
        this.f114D = 0.0f;
        this.f130U = 0;
        this.f131V = 0;
        this.f132W = 0.0f;
        this.f133X = -1;
        this.f134Y = 0;
        this.f135Z = 0;
        this.f137a0 = 0;
        this.f138b0 = 0;
        this.f140c0 = 0;
        this.f142d0 = 0.5f;
        this.f144e0 = 0.5f;
        int[] iArr = this.f163p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.f147g0 = 0;
        this.f151i0 = 0;
        this.f153j0 = 0;
        float[] fArr = this.f155k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f160o = -1;
        this.f162p = -1;
        int[] iArr2 = this.f113C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f165r = 0;
        this.f166s = 0;
        this.f170w = 1.0f;
        this.f173z = 1.0f;
        this.f169v = Integer.MAX_VALUE;
        this.f172y = Integer.MAX_VALUE;
        this.f168u = 0;
        this.f171x = 0;
        this.f111A = -1;
        this.f112B = 1.0f;
        boolean[] zArr = this.f145f;
        zArr[0] = true;
        zArr[1] = true;
        this.f116F = false;
        boolean[] zArr2 = this.f128S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f146g = true;
        int[] iArr3 = this.f167t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f148h = -1;
        this.f150i = -1;
    }

    public final void D() {
        d dVar = this.f129T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.f127R;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((c) arrayList.get(i9)).j();
        }
    }

    public final void E() {
        this.f154k = false;
        this.l = false;
        this.m = false;
        this.f158n = false;
        ArrayList arrayList = this.f127R;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            c cVar = (c) arrayList.get(i9);
            cVar.f104c = false;
            cVar.b = 0;
        }
    }

    public void F(k kVar) {
        this.f119I.k();
        this.f120J.k();
        this.f121K.k();
        this.f122L.k();
        this.f123M.k();
        this.f125P.k();
        this.f124N.k();
        this.O.k();
    }

    public final void I(int i9) {
        boolean z8;
        this.f137a0 = i9;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f115E = z8;
    }

    public final void J(int i9, int i10) {
        if (this.f154k) {
            return;
        }
        this.f119I.l(i9);
        this.f121K.l(i10);
        this.f134Y = i9;
        this.f130U = i10 - i9;
        this.f154k = true;
    }

    public final void K(int i9, int i10) {
        if (this.l) {
            return;
        }
        this.f120J.l(i9);
        this.f122L.l(i10);
        this.f135Z = i9;
        this.f131V = i10 - i9;
        if (this.f115E) {
            this.f123M.l(i9 + this.f137a0);
        }
        this.l = true;
    }

    public final void L(int i9) {
        this.f131V = i9;
        int i10 = this.f140c0;
        if (i9 < i10) {
            this.f131V = i10;
        }
    }

    public final void M(int i9) {
        this.f163p0[0] = i9;
    }

    public final void N(int i9) {
        this.f163p0[1] = i9;
    }

    public final void O(int i9) {
        this.f130U = i9;
        int i10 = this.f138b0;
        if (i9 < i10) {
            this.f130U = i10;
        }
    }

    public void P(boolean z8, boolean z9) {
        int i9;
        int i10;
        l lVar = this.f141d;
        boolean z10 = z8 & lVar.f382g;
        n nVar = this.f143e;
        boolean z11 = z9 & nVar.f382g;
        int i11 = lVar.f383h.f363g;
        int i12 = nVar.f383h.f363g;
        int i13 = lVar.f384i.f363g;
        int i14 = nVar.f384i.f363g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z10) {
            this.f134Y = i11;
        }
        if (z11) {
            this.f135Z = i12;
        }
        if (this.f147g0 == 8) {
            this.f130U = 0;
            this.f131V = 0;
            return;
        }
        int[] iArr = this.f163p0;
        if (z10) {
            if (iArr[0] == 1 && i16 < (i10 = this.f130U)) {
                i16 = i10;
            }
            this.f130U = i16;
            int i18 = this.f138b0;
            if (i16 < i18) {
                this.f130U = i18;
            }
        }
        if (z11) {
            if (iArr[1] == 1 && i17 < (i9 = this.f131V)) {
                i17 = i9;
            }
            this.f131V = i17;
            int i19 = this.f140c0;
            if (i17 < i19) {
                this.f131V = i19;
            }
        }
    }

    public void Q(C2963c c2963c, boolean z8) {
        int i9;
        int i10;
        n nVar;
        l lVar;
        c cVar = this.f119I;
        c2963c.getClass();
        int n2 = C2963c.n(cVar);
        int n9 = C2963c.n(this.f120J);
        int n10 = C2963c.n(this.f121K);
        int n11 = C2963c.n(this.f122L);
        if (z8 && (lVar = this.f141d) != null) {
            C.g gVar = lVar.f383h;
            if (gVar.f366j) {
                C.g gVar2 = lVar.f384i;
                if (gVar2.f366j) {
                    n2 = gVar.f363g;
                    n10 = gVar2.f363g;
                }
            }
        }
        if (z8 && (nVar = this.f143e) != null) {
            C.g gVar3 = nVar.f383h;
            if (gVar3.f366j) {
                C.g gVar4 = nVar.f384i;
                if (gVar4.f366j) {
                    n9 = gVar3.f363g;
                    n11 = gVar4.f363g;
                }
            }
        }
        int i11 = n11 - n9;
        if (n10 - n2 < 0 || i11 < 0 || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n9 == Integer.MIN_VALUE || n9 == Integer.MAX_VALUE || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE) {
            n2 = 0;
            n9 = 0;
            n10 = 0;
            n11 = 0;
        }
        int i12 = n10 - n2;
        int i13 = n11 - n9;
        this.f134Y = n2;
        this.f135Z = n9;
        if (this.f147g0 == 8) {
            this.f130U = 0;
            this.f131V = 0;
            return;
        }
        int[] iArr = this.f163p0;
        int i14 = iArr[0];
        if (i14 == 1 && i12 < (i10 = this.f130U)) {
            i12 = i10;
        }
        if (iArr[1] == 1 && i13 < (i9 = this.f131V)) {
            i13 = i9;
        }
        this.f130U = i12;
        this.f131V = i13;
        int i15 = this.f140c0;
        if (i13 < i15) {
            this.f131V = i15;
        }
        int i16 = this.f138b0;
        if (i12 < i16) {
            this.f130U = i16;
        }
        int i17 = this.f169v;
        if (i17 > 0 && i14 == 3) {
            this.f130U = Math.min(this.f130U, i17);
        }
        int i18 = this.f172y;
        if (i18 > 0 && iArr[1] == 3) {
            this.f131V = Math.min(this.f131V, i18);
        }
        int i19 = this.f130U;
        if (i12 != i19) {
            this.f148h = i19;
        }
        int i20 = this.f131V;
        if (i13 != i20) {
            this.f150i = i20;
        }
    }

    public final void a(e eVar, C2963c c2963c, HashSet hashSet, int i9, boolean z8) {
        if (z8) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, c2963c, this);
            hashSet.remove(this);
            b(c2963c, eVar.W(64));
        }
        if (i9 == 0) {
            HashSet hashSet2 = this.f119I.f103a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f105d.a(eVar, c2963c, hashSet, i9, true);
                }
            }
            HashSet hashSet3 = this.f121K.f103a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f105d.a(eVar, c2963c, hashSet, i9, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f120J.f103a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f105d.a(eVar, c2963c, hashSet, i9, true);
            }
        }
        HashSet hashSet5 = this.f122L.f103a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f105d.a(eVar, c2963c, hashSet, i9, true);
            }
        }
        HashSet hashSet6 = this.f123M.f103a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f105d.a(eVar, c2963c, hashSet, i9, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(z.C2963c r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.d.b(z.c, boolean):void");
    }

    public boolean c() {
        if (this.f147g0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(z.C2963c r31, boolean r32, boolean r33, boolean r34, boolean r35, z.C2966f r36, z.C2966f r37, int r38, boolean r39, B.c r40, B.c r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.d.d(z.c, boolean, boolean, boolean, boolean, z.f, z.f, int, boolean, B.c, B.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i9, d dVar, int i10, int i11) {
        boolean z8;
        if (i9 == 7) {
            if (i10 == 7) {
                c i12 = i(2);
                c i13 = i(4);
                c i14 = i(3);
                c i15 = i(5);
                boolean z9 = true;
                if ((i12 != null && i12.h()) || (i13 != null && i13.h())) {
                    z8 = false;
                } else {
                    e(2, dVar, 2, 0);
                    e(4, dVar, 4, 0);
                    z8 = true;
                }
                if ((i14 != null && i14.h()) || (i15 != null && i15.h())) {
                    z9 = false;
                } else {
                    e(3, dVar, 3, 0);
                    e(5, dVar, 5, 0);
                }
                if (z8 && z9) {
                    i(7).a(dVar.i(7), 0);
                    return;
                } else if (z8) {
                    i(8).a(dVar.i(8), 0);
                    return;
                } else {
                    if (z9) {
                        i(9).a(dVar.i(9), 0);
                        return;
                    }
                    return;
                }
            }
            if (i10 != 2 && i10 != 4) {
                if (i10 == 3 || i10 == 5) {
                    e(3, dVar, i10, 0);
                    e(5, dVar, i10, 0);
                    i(7).a(dVar.i(i10), 0);
                    return;
                }
                return;
            }
            e(2, dVar, i10, 0);
            e(4, dVar, i10, 0);
            i(7).a(dVar.i(i10), 0);
            return;
        }
        if (i9 == 8 && (i10 == 2 || i10 == 4)) {
            c i16 = i(2);
            c i17 = dVar.i(i10);
            c i18 = i(4);
            i16.a(i17, 0);
            i18.a(i17, 0);
            i(8).a(i17, 0);
            return;
        }
        if (i9 == 9 && (i10 == 3 || i10 == 5)) {
            c i19 = dVar.i(i10);
            i(3).a(i19, 0);
            i(5).a(i19, 0);
            i(9).a(i19, 0);
            return;
        }
        if (i9 == 8 && i10 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i10), 0);
            return;
        }
        if (i9 == 9 && i10 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i10), 0);
            return;
        }
        c i20 = i(i9);
        c i21 = dVar.i(i10);
        if (i20.i(i21)) {
            if (i9 == 6) {
                c i22 = i(3);
                c i23 = i(5);
                if (i22 != null) {
                    i22.j();
                }
                if (i23 != null) {
                    i23.j();
                }
            } else if (i9 != 3 && i9 != 5) {
                if (i9 == 2 || i9 == 4) {
                    c i24 = i(7);
                    if (i24.f107f != i21) {
                        i24.j();
                    }
                    c f9 = i(i9).f();
                    c i25 = i(8);
                    if (i25.h()) {
                        f9.j();
                        i25.j();
                    }
                }
            } else {
                c i26 = i(6);
                if (i26 != null) {
                    i26.j();
                }
                c i27 = i(7);
                if (i27.f107f != i21) {
                    i27.j();
                }
                c f10 = i(i9).f();
                c i28 = i(9);
                if (i28.h()) {
                    f10.j();
                    i28.j();
                }
            }
            i20.a(i21, i11);
        }
    }

    public final void f(c cVar, c cVar2, int i9) {
        if (cVar.f105d == this) {
            e(cVar.f106e, cVar2.f105d, cVar2.f106e, i9);
        }
    }

    public final void g(C2963c c2963c) {
        c2963c.k(this.f119I);
        c2963c.k(this.f120J);
        c2963c.k(this.f121K);
        c2963c.k(this.f122L);
        if (this.f137a0 > 0) {
            c2963c.k(this.f123M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [C.n, C.p] */
    /* JADX WARN: Type inference failed for: r0v3, types: [C.l, C.p] */
    public final void h() {
        if (this.f141d == null) {
            ?? pVar = new p(this);
            pVar.f383h.f361e = 4;
            pVar.f384i.f361e = 5;
            pVar.f381f = 0;
            this.f141d = pVar;
        }
        if (this.f143e == null) {
            ?? pVar2 = new p(this);
            C.g gVar = new C.g(pVar2);
            pVar2.f371k = gVar;
            pVar2.l = null;
            pVar2.f383h.f361e = 6;
            pVar2.f384i.f361e = 7;
            gVar.f361e = 8;
            pVar2.f381f = 1;
            this.f143e = pVar2;
        }
    }

    public c i(int i9) {
        switch (AbstractC2965e.d(i9)) {
            case 0:
                return null;
            case 1:
                return this.f119I;
            case 2:
                return this.f120J;
            case 3:
                return this.f121K;
            case 4:
                return this.f122L;
            case 5:
                return this.f123M;
            case 6:
                return this.f125P;
            case 7:
                return this.f124N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(AbstractC2914a.l(i9));
        }
    }

    public final int j(int i9) {
        int[] iArr = this.f163p0;
        if (i9 == 0) {
            return iArr[0];
        }
        if (i9 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int k() {
        if (this.f147g0 == 8) {
            return 0;
        }
        return this.f131V;
    }

    public final d l(int i9) {
        c cVar;
        c cVar2;
        if (i9 == 0) {
            c cVar3 = this.f121K;
            c cVar4 = cVar3.f107f;
            if (cVar4 != null && cVar4.f107f == cVar3) {
                return cVar4.f105d;
            }
            return null;
        }
        if (i9 == 1 && (cVar2 = (cVar = this.f122L).f107f) != null && cVar2.f107f == cVar) {
            return cVar2.f105d;
        }
        return null;
    }

    public final d m(int i9) {
        c cVar;
        c cVar2;
        if (i9 == 0) {
            c cVar3 = this.f119I;
            c cVar4 = cVar3.f107f;
            if (cVar4 != null && cVar4.f107f == cVar3) {
                return cVar4.f105d;
            }
            return null;
        }
        if (i9 == 1 && (cVar2 = (cVar = this.f120J).f107f) != null && cVar2.f107f == cVar) {
            return cVar2.f105d;
        }
        return null;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f152j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f130U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f131V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f134Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.f135Z);
        sb.append("\n");
        p(sb, TtmlNode.LEFT, this.f119I);
        p(sb, "top", this.f120J);
        p(sb, TtmlNode.RIGHT, this.f121K);
        p(sb, "bottom", this.f122L);
        p(sb, "baseline", this.f123M);
        p(sb, "centerX", this.f124N);
        p(sb, "centerY", this.O);
        int i9 = this.f130U;
        int i10 = this.f138b0;
        int[] iArr = this.f113C;
        int i11 = iArr[0];
        int i12 = this.f168u;
        int i13 = this.f165r;
        float f9 = this.f170w;
        float[] fArr = this.f155k0;
        float f10 = fArr[0];
        o(sb, "    width", i9, i10, i11, i12, i13, f9);
        int i14 = this.f131V;
        int i15 = this.f140c0;
        int i16 = iArr[1];
        int i17 = this.f171x;
        int i18 = this.f166s;
        float f11 = this.f173z;
        float f12 = fArr[1];
        o(sb, "    height", i14, i15, i16, i17, i18, f11);
        float f13 = this.f132W;
        int i19 = this.f133X;
        if (f13 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f13);
            sb.append(",");
            sb.append(i19);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f142d0, 0.5f);
        H(sb, "    verticalBias", this.f144e0, 0.5f);
        G(this.f151i0, 0, "    horizontalChainStyle", sb);
        G(this.f153j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f147g0 == 8) {
            return 0;
        }
        return this.f130U;
    }

    public final int r() {
        d dVar = this.f129T;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f192x0 + this.f134Y;
        }
        return this.f134Y;
    }

    public final int s() {
        d dVar = this.f129T;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f193y0 + this.f135Z;
        }
        return this.f135Z;
    }

    public final boolean t(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (i9 == 0) {
            if (this.f119I.f107f != null) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (this.f121K.f107f != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (i13 + i14 >= 2) {
                return false;
            }
            return true;
        }
        if (this.f120J.f107f != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f122L.f107f != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i15 = i10 + i11;
        if (this.f123M.f107f != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i15 + i12 >= 2) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str = "";
        StringBuilder b = AbstractC2965e.b("");
        if (this.f149h0 != null) {
            str = AbstractC2914a.h(new StringBuilder("id: "), this.f149h0, " ");
        }
        b.append(str);
        b.append("(");
        b.append(this.f134Y);
        b.append(", ");
        b.append(this.f135Z);
        b.append(") - (");
        b.append(this.f130U);
        b.append(" x ");
        return AbstractC2914a.g(b, this.f131V, ")");
    }

    public final boolean u(int i9, int i10) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i9 == 0) {
            c cVar5 = this.f119I;
            c cVar6 = cVar5.f107f;
            if (cVar6 != null && cVar6.f104c && (cVar4 = (cVar3 = this.f121K).f107f) != null && cVar4.f104c) {
                if ((cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f107f.d()) >= i10) {
                    return true;
                }
                return false;
            }
        } else {
            c cVar7 = this.f120J;
            c cVar8 = cVar7.f107f;
            if (cVar8 != null && cVar8.f104c && (cVar2 = (cVar = this.f122L).f107f) != null && cVar2.f104c) {
                if ((cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f107f.d()) >= i10) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void v(int i9, int i10, int i11, int i12, d dVar) {
        i(i9).b(dVar.i(i10), i11, i12, true);
    }

    public final boolean w(int i9) {
        c cVar;
        c cVar2;
        int i10 = i9 * 2;
        c[] cVarArr = this.f126Q;
        c cVar3 = cVarArr[i10];
        c cVar4 = cVar3.f107f;
        if (cVar4 != null && cVar4.f107f != cVar3 && (cVar2 = (cVar = cVarArr[i10 + 1]).f107f) != null && cVar2.f107f == cVar) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        c cVar = this.f119I;
        c cVar2 = cVar.f107f;
        if (cVar2 == null || cVar2.f107f != cVar) {
            c cVar3 = this.f121K;
            c cVar4 = cVar3.f107f;
            if (cVar4 != null && cVar4.f107f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean y() {
        c cVar = this.f120J;
        c cVar2 = cVar.f107f;
        if (cVar2 == null || cVar2.f107f != cVar) {
            c cVar3 = this.f122L;
            c cVar4 = cVar3.f107f;
            if (cVar4 != null && cVar4.f107f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        if (this.f146g && this.f147g0 != 8) {
            return true;
        }
        return false;
    }
}
