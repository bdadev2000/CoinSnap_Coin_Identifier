package w;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import ic.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final d I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public e T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f26580a0;

    /* renamed from: b, reason: collision with root package name */
    public x.c f26581b;

    /* renamed from: b0, reason: collision with root package name */
    public int f26582b0;

    /* renamed from: c, reason: collision with root package name */
    public x.c f26583c;

    /* renamed from: c0, reason: collision with root package name */
    public int f26584c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f26586d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f26588e0;

    /* renamed from: f0, reason: collision with root package name */
    public Object f26590f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f26592g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f26594h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f26596i0;

    /* renamed from: j, reason: collision with root package name */
    public String f26597j;

    /* renamed from: j0, reason: collision with root package name */
    public int f26598j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f26599k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f26600k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26601l;

    /* renamed from: l0, reason: collision with root package name */
    public final e[] f26602l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26603m;

    /* renamed from: m0, reason: collision with root package name */
    public final e[] f26604m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26605n;

    /* renamed from: n0, reason: collision with root package name */
    public int f26606n0;

    /* renamed from: o, reason: collision with root package name */
    public int f26607o;

    /* renamed from: o0, reason: collision with root package name */
    public int f26608o0;

    /* renamed from: p, reason: collision with root package name */
    public int f26609p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f26610p0;

    /* renamed from: q, reason: collision with root package name */
    public int f26611q;

    /* renamed from: r, reason: collision with root package name */
    public int f26612r;

    /* renamed from: s, reason: collision with root package name */
    public int f26613s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f26614t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f26615v;

    /* renamed from: w, reason: collision with root package name */
    public float f26616w;

    /* renamed from: x, reason: collision with root package name */
    public int f26617x;

    /* renamed from: y, reason: collision with root package name */
    public int f26618y;

    /* renamed from: z, reason: collision with root package name */
    public float f26619z;
    public boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    public x.j f26585d = null;

    /* renamed from: e, reason: collision with root package name */
    public x.l f26587e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26589f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f26591g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f26593h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f26595i = -1;

    public e() {
        new v.a();
        this.f26599k = false;
        this.f26601l = false;
        this.f26603m = false;
        this.f26605n = false;
        this.f26607o = -1;
        this.f26609p = -1;
        this.f26611q = 0;
        this.f26612r = 0;
        this.f26613s = 0;
        this.f26614t = new int[2];
        this.u = 0;
        this.f26615v = 0;
        this.f26616w = 1.0f;
        this.f26617x = 0;
        this.f26618y = 0;
        this.f26619z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        d dVar = new d(this, c.LEFT);
        this.I = dVar;
        d dVar2 = new d(this, c.TOP);
        this.J = dVar2;
        d dVar3 = new d(this, c.RIGHT);
        this.K = dVar3;
        d dVar4 = new d(this, c.BOTTOM);
        this.L = dVar4;
        d dVar5 = new d(this, c.BASELINE);
        this.M = dVar5;
        d dVar6 = new d(this, c.CENTER_X);
        this.N = dVar6;
        d dVar7 = new d(this, c.CENTER_Y);
        this.O = dVar7;
        d dVar8 = new d(this, c.CENTER);
        this.P = dVar8;
        this.Q = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f26610p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f26580a0 = 0;
        this.f26586d0 = 0.5f;
        this.f26588e0 = 0.5f;
        this.f26592g0 = 0;
        this.f26594h0 = null;
        this.f26596i0 = 0;
        this.f26598j0 = 0;
        this.f26600k0 = new float[]{-1.0f, -1.0f};
        this.f26602l0 = new e[]{null, null};
        this.f26604m0 = new e[]{null, null};
        this.f26606n0 = -1;
        this.f26608o0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public static void H(StringBuilder sb2, int i10, int i11, String str) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void I(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void p(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        H(sb2, i10, 0, "      size");
        H(sb2, i11, 0, "      min");
        H(sb2, i12, Integer.MAX_VALUE, "      max");
        H(sb2, i13, 0, "      matchMin");
        H(sb2, i14, 0, "      matchDef");
        I(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f26576f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f26576f);
        sb2.append("'");
        if (dVar.f26578h != Integer.MIN_VALUE || dVar.f26577g != 0) {
            sb2.append(",");
            sb2.append(dVar.f26577g);
            if (dVar.f26578h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f26578h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A() {
        return this.f26591g && this.f26592g0 != 8;
    }

    public boolean B() {
        if (!this.f26599k && (!this.I.f26573c || !this.K.f26573c)) {
            return false;
        }
        return true;
    }

    public boolean C() {
        if (!this.f26601l && (!this.J.f26573c || !this.L.f26573c)) {
            return false;
        }
        return true;
    }

    public void D() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f26580a0 = 0;
        this.f26582b0 = 0;
        this.f26584c0 = 0;
        this.f26586d0 = 0.5f;
        this.f26588e0 = 0.5f;
        int[] iArr = this.f26610p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f26590f0 = null;
        this.f26592g0 = 0;
        this.f26596i0 = 0;
        this.f26598j0 = 0;
        float[] fArr = this.f26600k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f26607o = -1;
        this.f26609p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f26612r = 0;
        this.f26613s = 0;
        this.f26616w = 1.0f;
        this.f26619z = 1.0f;
        this.f26615v = Integer.MAX_VALUE;
        this.f26618y = Integer.MAX_VALUE;
        this.u = 0;
        this.f26617x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f26589f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f26591g = true;
        int[] iArr3 = this.f26614t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f26593h = -1;
        this.f26595i = -1;
    }

    public final void E() {
        e eVar = this.T;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) arrayList.get(i10)).j();
        }
    }

    public final void F() {
        this.f26599k = false;
        this.f26601l = false;
        this.f26603m = false;
        this.f26605n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            dVar.f26573c = false;
            dVar.f26572b = 0;
        }
    }

    public void G(t tVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void J(int i10, int i11) {
        if (this.f26599k) {
            return;
        }
        this.I.l(i10);
        this.K.l(i11);
        this.Y = i10;
        this.U = i11 - i10;
        this.f26599k = true;
    }

    public final void K(int i10, int i11) {
        if (this.f26601l) {
            return;
        }
        this.J.l(i10);
        this.L.l(i11);
        this.Z = i10;
        this.V = i11 - i10;
        if (this.E) {
            this.M.l(i10 + this.f26580a0);
        }
        this.f26601l = true;
    }

    public final void L(int i10) {
        this.V = i10;
        int i11 = this.f26584c0;
        if (i10 < i11) {
            this.V = i11;
        }
    }

    public final void M(int i10) {
        this.f26610p0[0] = i10;
    }

    public final void N(int i10) {
        this.f26610p0[1] = i10;
    }

    public final void O(int i10) {
        this.U = i10;
        int i11 = this.f26582b0;
        if (i10 < i11) {
            this.U = i11;
        }
    }

    public void P(boolean z10, boolean z11) {
        int i10;
        int i11;
        x.j jVar = this.f26585d;
        boolean z12 = z10 & jVar.f27298g;
        x.l lVar = this.f26587e;
        boolean z13 = z11 & lVar.f27298g;
        int i12 = jVar.f27299h.f27270g;
        int i13 = lVar.f27299h.f27270g;
        int i14 = jVar.f27300i.f27270g;
        int i15 = lVar.f27300i.f27270g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.Y = i12;
        }
        if (z13) {
            this.Z = i13;
        }
        if (this.f26592g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f26610p0;
        if (z12) {
            if (iArr[0] == 1 && i17 < (i11 = this.U)) {
                i17 = i11;
            }
            this.U = i17;
            int i19 = this.f26582b0;
            if (i17 < i19) {
                this.U = i19;
            }
        }
        if (z13) {
            if (iArr[1] == 1 && i18 < (i10 = this.V)) {
                i18 = i10;
            }
            this.V = i18;
            int i20 = this.f26584c0;
            if (i18 < i20) {
                this.V = i20;
            }
        }
    }

    public void Q(t.d dVar, boolean z10) {
        int i10;
        int i11;
        x.l lVar;
        x.j jVar;
        dVar.getClass();
        int n10 = t.d.n(this.I);
        int n11 = t.d.n(this.J);
        int n12 = t.d.n(this.K);
        int n13 = t.d.n(this.L);
        if (z10 && (jVar = this.f26585d) != null) {
            x.f fVar = jVar.f27299h;
            if (fVar.f27273j) {
                x.f fVar2 = jVar.f27300i;
                if (fVar2.f27273j) {
                    n10 = fVar.f27270g;
                    n12 = fVar2.f27270g;
                }
            }
        }
        if (z10 && (lVar = this.f26587e) != null) {
            x.f fVar3 = lVar.f27299h;
            if (fVar3.f27273j) {
                x.f fVar4 = lVar.f27300i;
                if (fVar4.f27273j) {
                    n11 = fVar3.f27270g;
                    n13 = fVar4.f27270g;
                }
            }
        }
        int i12 = n13 - n11;
        if (n12 - n10 < 0 || i12 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i13 = n12 - n10;
        int i14 = n13 - n11;
        this.Y = n10;
        this.Z = n11;
        if (this.f26592g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f26610p0;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.U)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.V)) {
            i14 = i10;
        }
        this.U = i13;
        this.V = i14;
        int i16 = this.f26584c0;
        if (i14 < i16) {
            this.V = i16;
        }
        int i17 = this.f26582b0;
        if (i13 < i17) {
            this.U = i17;
        }
        int i18 = this.f26615v;
        if (i18 > 0 && i15 == 3) {
            this.U = Math.min(this.U, i18);
        }
        int i19 = this.f26618y;
        if (i19 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i19);
        }
        int i20 = this.U;
        if (i13 != i20) {
            this.f26593h = i20;
        }
        int i21 = this.V;
        if (i14 != i21) {
            this.f26595i = i21;
        }
    }

    public final void b(f fVar, t.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            com.facebook.internal.i.i(fVar, dVar, this);
            hashSet.remove(this);
            c(dVar, fVar.W(64));
        }
        if (i10 == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f26574d.b(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f26574d.b(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f26574d.b(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f26574d.b(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f26574d.b(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(t.d r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 2001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.c(t.d, boolean):void");
    }

    public boolean d() {
        return this.f26592g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(t.d r29, boolean r30, boolean r31, boolean r32, boolean r33, t.i r34, t.i r35, int r36, boolean r37, w.d r38, w.d r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.e(t.d, boolean, boolean, boolean, boolean, t.i, t.i, int, boolean, w.d, w.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void f(c cVar, e eVar, c cVar2, int i10) {
        boolean z10;
        c cVar3 = c.CENTER;
        c cVar4 = c.CENTER_Y;
        c cVar5 = c.CENTER_X;
        c cVar6 = c.LEFT;
        c cVar7 = c.TOP;
        c cVar8 = c.RIGHT;
        c cVar9 = c.BOTTOM;
        if (cVar == cVar3) {
            if (cVar2 == cVar3) {
                d j3 = j(cVar6);
                d j10 = j(cVar8);
                d j11 = j(cVar7);
                d j12 = j(cVar9);
                boolean z11 = true;
                if ((j3 != null && j3.h()) || (j10 != null && j10.h())) {
                    z10 = false;
                } else {
                    f(cVar6, eVar, cVar6, 0);
                    f(cVar8, eVar, cVar8, 0);
                    z10 = true;
                }
                if ((j11 != null && j11.h()) || (j12 != null && j12.h())) {
                    z11 = false;
                } else {
                    f(cVar7, eVar, cVar7, 0);
                    f(cVar9, eVar, cVar9, 0);
                }
                if (z10 && z11) {
                    j(cVar3).a(eVar.j(cVar3), 0);
                    return;
                } else if (z10) {
                    j(cVar5).a(eVar.j(cVar5), 0);
                    return;
                } else {
                    if (z11) {
                        j(cVar4).a(eVar.j(cVar4), 0);
                        return;
                    }
                    return;
                }
            }
            if (cVar2 != cVar6 && cVar2 != cVar8) {
                if (cVar2 == cVar7 || cVar2 == cVar9) {
                    f(cVar7, eVar, cVar2, 0);
                    f(cVar9, eVar, cVar2, 0);
                    j(cVar3).a(eVar.j(cVar2), 0);
                    return;
                }
                return;
            }
            f(cVar6, eVar, cVar2, 0);
            f(cVar8, eVar, cVar2, 0);
            j(cVar3).a(eVar.j(cVar2), 0);
            return;
        }
        if (cVar == cVar5 && (cVar2 == cVar6 || cVar2 == cVar8)) {
            d j13 = j(cVar6);
            d j14 = eVar.j(cVar2);
            d j15 = j(cVar8);
            j13.a(j14, 0);
            j15.a(j14, 0);
            j(cVar5).a(j14, 0);
            return;
        }
        if (cVar == cVar4 && (cVar2 == cVar7 || cVar2 == cVar9)) {
            d j16 = eVar.j(cVar2);
            j(cVar7).a(j16, 0);
            j(cVar9).a(j16, 0);
            j(cVar4).a(j16, 0);
            return;
        }
        if (cVar == cVar5 && cVar2 == cVar5) {
            j(cVar6).a(eVar.j(cVar6), 0);
            j(cVar8).a(eVar.j(cVar8), 0);
            j(cVar5).a(eVar.j(cVar2), 0);
            return;
        }
        if (cVar == cVar4 && cVar2 == cVar4) {
            j(cVar7).a(eVar.j(cVar7), 0);
            j(cVar9).a(eVar.j(cVar9), 0);
            j(cVar4).a(eVar.j(cVar2), 0);
            return;
        }
        d j17 = j(cVar);
        d j18 = eVar.j(cVar2);
        if (j17.i(j18)) {
            c cVar10 = c.BASELINE;
            if (cVar == cVar10) {
                d j19 = j(cVar7);
                d j20 = j(cVar9);
                if (j19 != null) {
                    j19.j();
                }
                if (j20 != null) {
                    j20.j();
                }
            } else if (cVar != cVar7 && cVar != cVar9) {
                if (cVar == cVar6 || cVar == cVar8) {
                    d j21 = j(cVar3);
                    if (j21.f26576f != j18) {
                        j21.j();
                    }
                    d f10 = j(cVar).f();
                    d j22 = j(cVar5);
                    if (j22.h()) {
                        f10.j();
                        j22.j();
                    }
                }
            } else {
                d j23 = j(cVar10);
                if (j23 != null) {
                    j23.j();
                }
                d j24 = j(cVar3);
                if (j24.f26576f != j18) {
                    j24.j();
                }
                d f11 = j(cVar).f();
                d j25 = j(cVar4);
                if (j25.h()) {
                    f11.j();
                    j25.j();
                }
            }
            j17.a(j18, i10);
        }
    }

    public final void g(d dVar, d dVar2, int i10) {
        if (dVar.f26574d == this) {
            f(dVar.f26575e, dVar2.f26574d, dVar2.f26575e, i10);
        }
    }

    public final void h(t.d dVar) {
        dVar.k(this.I);
        dVar.k(this.J);
        dVar.k(this.K);
        dVar.k(this.L);
        if (this.f26580a0 > 0) {
            dVar.k(this.M);
        }
    }

    public final void i() {
        if (this.f26585d == null) {
            this.f26585d = new x.j(this);
        }
        if (this.f26587e == null) {
            this.f26587e = new x.l(this);
        }
    }

    public d j(c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final int k(int i10) {
        int[] iArr = this.f26610p0;
        if (i10 == 0) {
            return iArr[0];
        }
        if (i10 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int l() {
        if (this.f26592g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final e m(int i10) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.K;
            d dVar4 = dVar3.f26576f;
            if (dVar4 != null && dVar4.f26576f == dVar3) {
                return dVar4.f26574d;
            }
            return null;
        }
        if (i10 == 1 && (dVar2 = (dVar = this.L).f26576f) != null && dVar2.f26576f == dVar) {
            return dVar2.f26574d;
        }
        return null;
    }

    public final e n(int i10) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.I;
            d dVar4 = dVar3.f26576f;
            if (dVar4 != null && dVar4.f26576f == dVar3) {
                return dVar4.f26574d;
            }
            return null;
        }
        if (i10 == 1 && (dVar2 = (dVar = this.J).f26576f) != null && dVar2.f26576f == dVar) {
            return dVar2.f26574d;
        }
        return null;
    }

    public void o(StringBuilder sb2) {
        sb2.append("  " + this.f26597j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.V);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.Z);
        sb2.append("\n");
        q(sb2, TtmlNode.LEFT, this.I);
        q(sb2, "top", this.J);
        q(sb2, TtmlNode.RIGHT, this.K);
        q(sb2, "bottom", this.L);
        q(sb2, "baseline", this.M);
        q(sb2, "centerX", this.N);
        q(sb2, "centerY", this.O);
        int i10 = this.U;
        int i11 = this.f26582b0;
        int[] iArr = this.C;
        int i12 = iArr[0];
        int i13 = this.u;
        int i14 = this.f26612r;
        float f10 = this.f26616w;
        float[] fArr = this.f26600k0;
        float f11 = fArr[0];
        p(sb2, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.V;
        int i16 = this.f26584c0;
        int i17 = iArr[1];
        int i18 = this.f26617x;
        int i19 = this.f26613s;
        float f12 = this.f26619z;
        float f13 = fArr[1];
        p(sb2, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.W;
        int i20 = this.X;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        I(sb2, "    horizontalBias", this.f26586d0, 0.5f);
        I(sb2, "    verticalBias", this.f26588e0, 0.5f);
        H(sb2, this.f26596i0, 0, "    horizontalChainStyle");
        H(sb2, this.f26598j0, 0, "    verticalChainStyle");
        sb2.append("  }");
    }

    public final int r() {
        if (this.f26592g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int s() {
        e eVar = this.T;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).f26626x0 + this.Y;
        }
        return this.Y;
    }

    public final int t() {
        e eVar = this.T;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).f26627y0 + this.Z;
        }
        return this.Z;
    }

    public String toString() {
        String str = "";
        StringBuilder m10 = eb.j.m("");
        if (this.f26594h0 != null) {
            str = vd.e.h(new StringBuilder("id: "), this.f26594h0, " ");
        }
        m10.append(str);
        m10.append("(");
        m10.append(this.Y);
        m10.append(", ");
        m10.append(this.Z);
        m10.append(") - (");
        m10.append(this.U);
        m10.append(" x ");
        return vd.e.g(m10, this.V, ")");
    }

    public final boolean u(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 == 0) {
            if (this.I.f26576f != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (this.K.f26576f != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i14 + i15 < 2) {
                return true;
            }
            return false;
        }
        if (this.J.f26576f != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.L.f26576f != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i16 = i11 + i12;
        if (this.M.f26576f != null) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i16 + i13 < 2) {
            return true;
        }
        return false;
    }

    public final boolean v(int i10, int i11) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i10 == 0) {
            d dVar5 = this.I;
            d dVar6 = dVar5.f26576f;
            if (dVar6 != null && dVar6.f26573c && (dVar4 = (dVar3 = this.K).f26576f) != null && dVar4.f26573c) {
                if ((dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f26576f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            d dVar7 = this.J;
            d dVar8 = dVar7.f26576f;
            if (dVar8 != null && dVar8.f26573c && (dVar2 = (dVar = this.L).f26576f) != null && dVar2.f26573c) {
                if ((dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f26576f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void w(c cVar, e eVar, c cVar2, int i10, int i11) {
        j(cVar).b(eVar.j(cVar2), i10, i11, true);
    }

    public final boolean x(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.Q;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f26576f;
        return (dVar4 == null || dVar4.f26576f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f26576f) == null || dVar2.f26576f != dVar) ? false : true;
    }

    public final boolean y() {
        d dVar = this.I;
        d dVar2 = dVar.f26576f;
        if (dVar2 != null && dVar2.f26576f == dVar) {
            return true;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f26576f;
        return dVar4 != null && dVar4.f26576f == dVar3;
    }

    public final boolean z() {
        d dVar = this.J;
        d dVar2 = dVar.f26576f;
        if (dVar2 != null && dVar2.f26576f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f26576f;
        return dVar4 != null && dVar4.f26576f == dVar3;
    }
}
