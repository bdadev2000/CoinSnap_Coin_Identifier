package com.applovin.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class dp implements i8 {

    /* renamed from: t */
    public static final m8 f4350t = new ht(2);
    private final int a;

    /* renamed from: b */
    private final int f4351b;

    /* renamed from: c */
    private final List f4352c;

    /* renamed from: d */
    private final yg f4353d;

    /* renamed from: e */
    private final SparseIntArray f4354e;

    /* renamed from: f */
    private final ep.c f4355f;

    /* renamed from: g */
    private final SparseArray f4356g;

    /* renamed from: h */
    private final SparseBooleanArray f4357h;

    /* renamed from: i */
    private final SparseBooleanArray f4358i;

    /* renamed from: j */
    private final cp f4359j;

    /* renamed from: k */
    private bp f4360k;

    /* renamed from: l */
    private k8 f4361l;

    /* renamed from: m */
    private int f4362m;

    /* renamed from: n */
    private boolean f4363n;

    /* renamed from: o */
    private boolean f4364o;

    /* renamed from: p */
    private boolean f4365p;

    /* renamed from: q */
    private ep f4366q;

    /* renamed from: r */
    private int f4367r;

    /* renamed from: s */
    private int f4368s;

    /* loaded from: classes.dex */
    public class a implements cj {
        private final xg a = new xg(new byte[4]);

        public a() {
        }

        @Override // com.applovin.impl.cj
        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        @Override // com.applovin.impl.cj
        public void a(yg ygVar) {
            if (ygVar.w() == 0 && (ygVar.w() & 128) != 0) {
                ygVar.g(6);
                int a = ygVar.a() / 4;
                for (int i10 = 0; i10 < a; i10++) {
                    ygVar.a(this.a, 4);
                    int a10 = this.a.a(16);
                    this.a.d(3);
                    if (a10 == 0) {
                        this.a.d(13);
                    } else {
                        int a11 = this.a.a(13);
                        if (dp.this.f4356g.get(a11) == null) {
                            dp.this.f4356g.put(a11, new dj(new b(a11)));
                            dp.d(dp.this);
                        }
                    }
                }
                if (dp.this.a != 2) {
                    dp.this.f4356g.remove(0);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements cj {
        private final xg a = new xg(new byte[5]);

        /* renamed from: b */
        private final SparseArray f4370b = new SparseArray();

        /* renamed from: c */
        private final SparseIntArray f4371c = new SparseIntArray();

        /* renamed from: d */
        private final int f4372d;

        public b(int i10) {
            this.f4372d = i10;
        }

        @Override // com.applovin.impl.cj
        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        @Override // com.applovin.impl.cj
        public void a(yg ygVar) {
            io ioVar;
            ep a;
            if (ygVar.w() != 2) {
                return;
            }
            if (dp.this.a != 1 && dp.this.a != 2 && dp.this.f4362m != 1) {
                ioVar = new io(((io) dp.this.f4352c.get(0)).a());
                dp.this.f4352c.add(ioVar);
            } else {
                ioVar = (io) dp.this.f4352c.get(0);
            }
            if ((ygVar.w() & 128) == 0) {
                return;
            }
            ygVar.g(1);
            int C = ygVar.C();
            int i10 = 3;
            ygVar.g(3);
            ygVar.a(this.a, 2);
            this.a.d(3);
            int i11 = 13;
            dp.this.f4368s = this.a.a(13);
            ygVar.a(this.a, 2);
            int i12 = 4;
            this.a.d(4);
            ygVar.g(this.a.a(12));
            if (dp.this.a == 2 && dp.this.f4366q == null) {
                ep.b bVar = new ep.b(21, null, null, yp.f9257f);
                dp dpVar = dp.this;
                dpVar.f4366q = dpVar.f4355f.a(21, bVar);
                if (dp.this.f4366q != null) {
                    dp.this.f4366q.a(ioVar, dp.this.f4361l, new ep.d(C, 21, 8192));
                }
            }
            this.f4370b.clear();
            this.f4371c.clear();
            int a10 = ygVar.a();
            while (a10 > 0) {
                ygVar.a(this.a, 5);
                int a11 = this.a.a(8);
                this.a.d(i10);
                int a12 = this.a.a(i11);
                this.a.d(i12);
                int a13 = this.a.a(12);
                ep.b a14 = a(ygVar, a13);
                if (a11 == 6 || a11 == 5) {
                    a11 = a14.a;
                }
                a10 -= a13 + 5;
                int i13 = dp.this.a == 2 ? a11 : a12;
                if (!dp.this.f4357h.get(i13)) {
                    if (dp.this.a == 2 && a11 == 21) {
                        a = dp.this.f4366q;
                    } else {
                        a = dp.this.f4355f.a(a11, a14);
                    }
                    if (dp.this.a != 2 || a12 < this.f4371c.get(i13, 8192)) {
                        this.f4371c.put(i13, a12);
                        this.f4370b.put(i13, a);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f4371c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f4371c.keyAt(i14);
                int valueAt = this.f4371c.valueAt(i14);
                dp.this.f4357h.put(keyAt, true);
                dp.this.f4358i.put(valueAt, true);
                ep epVar = (ep) this.f4370b.valueAt(i14);
                if (epVar != null) {
                    if (epVar != dp.this.f4366q) {
                        epVar.a(ioVar, dp.this.f4361l, new ep.d(C, keyAt, 8192));
                    }
                    dp.this.f4356g.put(valueAt, epVar);
                }
            }
            if (dp.this.a == 2) {
                if (dp.this.f4363n) {
                    return;
                }
                dp.this.f4361l.c();
                dp.this.f4362m = 0;
                dp.this.f4363n = true;
                return;
            }
            dp.this.f4356g.remove(this.f4372d);
            dp dpVar2 = dp.this;
            dpVar2.f4362m = dpVar2.a == 1 ? 0 : dp.this.f4362m - 1;
            if (dp.this.f4362m == 0) {
                dp.this.f4361l.c();
                dp.this.f4363n = true;
            }
        }

        private ep.b a(yg ygVar, int i10) {
            int d10 = ygVar.d();
            int i11 = i10 + d10;
            int i12 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (ygVar.d() < i11) {
                int w10 = ygVar.w();
                int d11 = ygVar.d() + ygVar.w();
                if (d11 > i11) {
                    break;
                }
                if (w10 == 5) {
                    long y4 = ygVar.y();
                    if (y4 != 1094921523) {
                        if (y4 != 1161904947) {
                            if (y4 != 1094921524) {
                                if (y4 == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (w10 != 106) {
                        if (w10 != 122) {
                            if (w10 == 127) {
                                if (ygVar.w() != 21) {
                                }
                                i12 = 172;
                            } else if (w10 == 123) {
                                i12 = 138;
                            } else if (w10 == 10) {
                                str = ygVar.c(3).trim();
                            } else if (w10 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (ygVar.d() < d11) {
                                    String trim = ygVar.c(3).trim();
                                    int w11 = ygVar.w();
                                    byte[] bArr = new byte[4];
                                    ygVar.a(bArr, 0, 4);
                                    arrayList2.add(new ep.a(trim, w11, bArr));
                                }
                                arrayList = arrayList2;
                                i12 = 89;
                            } else if (w10 == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                ygVar.g(d11 - ygVar.d());
            }
            ygVar.f(i11);
            return new ep.b(i12, str, arrayList, Arrays.copyOfRange(ygVar.c(), d10, i11));
        }
    }

    public dp() {
        this(0);
    }

    public static /* synthetic */ int d(dp dpVar) {
        int i10 = dpVar.f4362m;
        dpVar.f4362m = i10 + 1;
        return i10;
    }

    public static /* synthetic */ i8[] e() {
        return c();
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public dp(int i10) {
        this(1, i10, 112800);
    }

    public static /* synthetic */ i8[] c() {
        return new i8[]{new dp()};
    }

    private void d() {
        this.f4357h.clear();
        this.f4356g.clear();
        SparseArray a10 = this.f4355f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4356g.put(a10.keyAt(i10), (ep) a10.valueAt(i10));
        }
        this.f4356g.put(0, new dj(new a()));
        this.f4366q = null;
    }

    public dp(int i10, int i11, int i12) {
        this(i10, new io(0L), new l6(i11), i12);
    }

    private boolean b(j8 j8Var) {
        byte[] c10 = this.f4353d.c();
        if (9400 - this.f4353d.d() < 188) {
            int a10 = this.f4353d.a();
            if (a10 > 0) {
                System.arraycopy(c10, this.f4353d.d(), c10, 0, a10);
            }
            this.f4353d.a(c10, a10);
        }
        while (this.f4353d.a() < 188) {
            int e2 = this.f4353d.e();
            int a11 = j8Var.a(c10, e2, 9400 - e2);
            if (a11 == -1) {
                return false;
            }
            this.f4353d.e(e2 + a11);
        }
        return true;
    }

    public dp(int i10, io ioVar, ep.c cVar, int i11) {
        this.f4355f = (ep.c) a1.a(cVar);
        this.f4351b = i11;
        this.a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f4352c = arrayList;
            arrayList.add(ioVar);
        } else {
            this.f4352c = Collections.singletonList(ioVar);
        }
        this.f4353d = new yg(new byte[9400], 0);
        this.f4357h = new SparseBooleanArray();
        this.f4358i = new SparseBooleanArray();
        this.f4356g = new SparseArray();
        this.f4354e = new SparseIntArray();
        this.f4359j = new cp(i11);
        this.f4361l = k8.f5637e;
        this.f4368s = -1;
        d();
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f4361l = k8Var;
    }

    private void a(long j3) {
        if (this.f4364o) {
            return;
        }
        this.f4364o = true;
        if (this.f4359j.a() != C.TIME_UNSET) {
            bp bpVar = new bp(this.f4359j.b(), this.f4359j.a(), j3, this.f4368s, this.f4351b);
            this.f4360k = bpVar;
            this.f4361l.a(bpVar.a());
            return;
        }
        this.f4361l.a(new ej.b(this.f4359j.a()));
    }

    private int b() {
        int d10 = this.f4353d.d();
        int e2 = this.f4353d.e();
        int a10 = fp.a(this.f4353d.c(), d10, e2);
        this.f4353d.f(a10);
        int i10 = a10 + 188;
        if (i10 > e2) {
            int i11 = (a10 - d10) + this.f4367r;
            this.f4367r = i11;
            if (this.a == 2 && i11 > 376) {
                throw ah.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f4367r = 0;
        }
        return i10;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        long a10 = j8Var.a();
        if (this.f4363n) {
            if (a10 != -1 && this.a != 2 && !this.f4359j.c()) {
                return this.f4359j.a(j8Var, qhVar, this.f4368s);
            }
            a(a10);
            if (this.f4365p) {
                this.f4365p = false;
                a(0L, 0L);
                if (j8Var.f() != 0) {
                    qhVar.a = 0L;
                    return 1;
                }
            }
            bp bpVar = this.f4360k;
            if (bpVar != null && bpVar.b()) {
                return this.f4360k.a(j8Var, qhVar);
            }
        }
        if (!b(j8Var)) {
            return -1;
        }
        int b3 = b();
        int e2 = this.f4353d.e();
        if (b3 > e2) {
            return 0;
        }
        int j3 = this.f4353d.j();
        if ((8388608 & j3) != 0) {
            this.f4353d.f(b3);
            return 0;
        }
        int i10 = (4194304 & j3) != 0 ? 1 : 0;
        int i11 = (2096896 & j3) >> 8;
        boolean z10 = (j3 & 32) != 0;
        ep epVar = (j3 & 16) != 0 ? (ep) this.f4356g.get(i11) : null;
        if (epVar == null) {
            this.f4353d.f(b3);
            return 0;
        }
        if (this.a != 2) {
            int i12 = j3 & 15;
            int i13 = this.f4354e.get(i11, i12 - 1);
            this.f4354e.put(i11, i12);
            if (i13 == i12) {
                this.f4353d.f(b3);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                epVar.a();
            }
        }
        if (z10) {
            int w10 = this.f4353d.w();
            i10 |= (this.f4353d.w() & 64) != 0 ? 2 : 0;
            this.f4353d.g(w10 - 1);
        }
        boolean z11 = this.f4363n;
        if (a(i11)) {
            this.f4353d.e(b3);
            epVar.a(this.f4353d, i10);
            this.f4353d.e(e2);
        }
        if (this.a != 2 && !z11 && this.f4363n && a10 != -1) {
            this.f4365p = true;
        }
        this.f4353d.f(b3);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        int i10;
        bp bpVar;
        a1.b(this.a != 2);
        int size = this.f4352c.size();
        for (0; i10 < size; i10 + 1) {
            io ioVar = (io) this.f4352c.get(i10);
            boolean z10 = ioVar.c() == C.TIME_UNSET;
            if (!z10) {
                long a10 = ioVar.a();
                if (a10 != C.TIME_UNSET) {
                    if (a10 != 0) {
                        if (a10 == j10) {
                        }
                        ioVar.d(j10);
                    }
                }
            } else {
                i10 = z10 ? 0 : i10 + 1;
                ioVar.d(j10);
            }
        }
        if (j10 != 0 && (bpVar = this.f4360k) != null) {
            bpVar.b(j10);
        }
        this.f4353d.d(0);
        this.f4354e.clear();
        for (int i11 = 0; i11 < this.f4356g.size(); i11++) {
            ((ep) this.f4356g.valueAt(i11)).a();
        }
        this.f4367r = 0;
    }

    private boolean a(int i10) {
        return this.a == 2 || this.f4363n || !this.f4358i.get(i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.applovin.impl.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.applovin.impl.j8 r7) {
        /*
            r6 = this;
            com.applovin.impl.yg r0 = r6.f4353d
            byte[] r0 = r0.c()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.c(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.a(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.dp.a(com.applovin.impl.j8):boolean");
    }
}
