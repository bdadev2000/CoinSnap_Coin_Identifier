package com.applovin.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.impl.dp;
import com.applovin.impl.ij;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class cp implements k8 {

    /* renamed from: t */
    public static final o8 f23347t = new dt(0);

    /* renamed from: a */
    private final int f23348a;

    /* renamed from: b */
    private final int f23349b;

    /* renamed from: c */
    private final List f23350c;
    private final bh d;
    private final SparseIntArray e;

    /* renamed from: f */
    private final dp.c f23351f;

    /* renamed from: g */
    private final SparseArray f23352g;

    /* renamed from: h */
    private final SparseBooleanArray f23353h;

    /* renamed from: i */
    private final SparseBooleanArray f23354i;

    /* renamed from: j */
    private final bp f23355j;

    /* renamed from: k */
    private ap f23356k;

    /* renamed from: l */
    private m8 f23357l;

    /* renamed from: m */
    private int f23358m;

    /* renamed from: n */
    private boolean f23359n;

    /* renamed from: o */
    private boolean f23360o;

    /* renamed from: p */
    private boolean f23361p;

    /* renamed from: q */
    private dp f23362q;

    /* renamed from: r */
    private int f23363r;

    /* renamed from: s */
    private int f23364s;

    /* loaded from: classes2.dex */
    public class a implements gj {

        /* renamed from: a */
        private final ah f23365a = new ah(new byte[4]);

        public a() {
        }

        @Override // com.applovin.impl.gj
        public void a(ho hoVar, m8 m8Var, dp.d dVar) {
        }

        @Override // com.applovin.impl.gj
        public void a(bh bhVar) {
            if (bhVar.w() == 0 && (bhVar.w() & 128) != 0) {
                bhVar.g(6);
                int a2 = bhVar.a() / 4;
                for (int i2 = 0; i2 < a2; i2++) {
                    bhVar.a(this.f23365a, 4);
                    int a3 = this.f23365a.a(16);
                    this.f23365a.d(3);
                    if (a3 == 0) {
                        this.f23365a.d(13);
                    } else {
                        int a4 = this.f23365a.a(13);
                        if (cp.this.f23352g.get(a4) == null) {
                            cp.this.f23352g.put(a4, new hj(new b(a4)));
                            cp.d(cp.this);
                        }
                    }
                }
                if (cp.this.f23348a != 2) {
                    cp.this.f23352g.remove(0);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements gj {

        /* renamed from: a */
        private final ah f23367a = new ah(new byte[5]);

        /* renamed from: b */
        private final SparseArray f23368b = new SparseArray();

        /* renamed from: c */
        private final SparseIntArray f23369c = new SparseIntArray();
        private final int d;

        public b(int i2) {
            this.d = i2;
        }

        @Override // com.applovin.impl.gj
        public void a(ho hoVar, m8 m8Var, dp.d dVar) {
        }

        @Override // com.applovin.impl.gj
        public void a(bh bhVar) {
            ho hoVar;
            dp a2;
            if (bhVar.w() != 2) {
                return;
            }
            if (cp.this.f23348a != 1 && cp.this.f23348a != 2 && cp.this.f23358m != 1) {
                hoVar = new ho(((ho) cp.this.f23350c.get(0)).a());
                cp.this.f23350c.add(hoVar);
            } else {
                hoVar = (ho) cp.this.f23350c.get(0);
            }
            if ((bhVar.w() & 128) == 0) {
                return;
            }
            bhVar.g(1);
            int C = bhVar.C();
            int i2 = 3;
            bhVar.g(3);
            bhVar.a(this.f23367a, 2);
            this.f23367a.d(3);
            int i3 = 13;
            cp.this.f23364s = this.f23367a.a(13);
            bhVar.a(this.f23367a, 2);
            int i4 = 4;
            this.f23367a.d(4);
            bhVar.g(this.f23367a.a(12));
            if (cp.this.f23348a == 2 && cp.this.f23362q == null) {
                dp.b bVar = new dp.b(21, null, null, xp.f27965f);
                cp cpVar = cp.this;
                cpVar.f23362q = cpVar.f23351f.a(21, bVar);
                if (cp.this.f23362q != null) {
                    cp.this.f23362q.a(hoVar, cp.this.f23357l, new dp.d(C, 21, 8192));
                }
            }
            this.f23368b.clear();
            this.f23369c.clear();
            int a3 = bhVar.a();
            while (a3 > 0) {
                bhVar.a(this.f23367a, 5);
                int a4 = this.f23367a.a(8);
                this.f23367a.d(i2);
                int a5 = this.f23367a.a(i3);
                this.f23367a.d(i4);
                int a6 = this.f23367a.a(12);
                dp.b a7 = a(bhVar, a6);
                if (a4 == 6 || a4 == 5) {
                    a4 = a7.f23523a;
                }
                a3 -= a6 + 5;
                int i5 = cp.this.f23348a == 2 ? a4 : a5;
                if (!cp.this.f23353h.get(i5)) {
                    if (cp.this.f23348a == 2 && a4 == 21) {
                        a2 = cp.this.f23362q;
                    } else {
                        a2 = cp.this.f23351f.a(a4, a7);
                    }
                    if (cp.this.f23348a != 2 || a5 < this.f23369c.get(i5, 8192)) {
                        this.f23369c.put(i5, a5);
                        this.f23368b.put(i5, a2);
                    }
                }
                i2 = 3;
                i4 = 4;
                i3 = 13;
            }
            int size = this.f23369c.size();
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.f23369c.keyAt(i6);
                int valueAt = this.f23369c.valueAt(i6);
                cp.this.f23353h.put(keyAt, true);
                cp.this.f23354i.put(valueAt, true);
                dp dpVar = (dp) this.f23368b.valueAt(i6);
                if (dpVar != null) {
                    if (dpVar != cp.this.f23362q) {
                        dpVar.a(hoVar, cp.this.f23357l, new dp.d(C, keyAt, 8192));
                    }
                    cp.this.f23352g.put(valueAt, dpVar);
                }
            }
            if (cp.this.f23348a == 2) {
                if (cp.this.f23359n) {
                    return;
                }
                cp.this.f23357l.c();
                cp.this.f23358m = 0;
                cp.this.f23359n = true;
                return;
            }
            cp.this.f23352g.remove(this.d);
            cp cpVar2 = cp.this;
            cpVar2.f23358m = cpVar2.f23348a == 1 ? 0 : cp.this.f23358m - 1;
            if (cp.this.f23358m == 0) {
                cp.this.f23357l.c();
                cp.this.f23359n = true;
            }
        }

        private dp.b a(bh bhVar, int i2) {
            int d = bhVar.d();
            int i3 = i2 + d;
            int i4 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (bhVar.d() < i3) {
                int w = bhVar.w();
                int d2 = bhVar.d() + bhVar.w();
                if (d2 > i3) {
                    break;
                }
                if (w == 5) {
                    long y2 = bhVar.y();
                    if (y2 != 1094921523) {
                        if (y2 != 1161904947) {
                            if (y2 != 1094921524) {
                                if (y2 == 1212503619) {
                                    i4 = 36;
                                }
                            }
                            i4 = Opcodes.IRETURN;
                        }
                        i4 = Opcodes.I2D;
                    }
                    i4 = Opcodes.LOR;
                } else {
                    if (w != 106) {
                        if (w != 122) {
                            if (w == 127) {
                                if (bhVar.w() != 21) {
                                }
                                i4 = Opcodes.IRETURN;
                            } else if (w == 123) {
                                i4 = Opcodes.L2D;
                            } else if (w == 10) {
                                str = bhVar.c(3).trim();
                            } else if (w == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (bhVar.d() < d2) {
                                    String trim = bhVar.c(3).trim();
                                    int w2 = bhVar.w();
                                    byte[] bArr = new byte[4];
                                    bhVar.a(bArr, 0, 4);
                                    arrayList2.add(new dp.a(trim, w2, bArr));
                                }
                                arrayList = arrayList2;
                                i4 = 89;
                            } else if (w == 111) {
                                i4 = 257;
                            }
                        }
                        i4 = Opcodes.I2D;
                    }
                    i4 = Opcodes.LOR;
                }
                bhVar.g(d2 - bhVar.d());
            }
            bhVar.f(i3);
            return new dp.b(i4, str, arrayList, Arrays.copyOfRange(bhVar.c(), d, i3));
        }
    }

    public cp() {
        this(0);
    }

    public static /* synthetic */ int d(cp cpVar) {
        int i2 = cpVar.f23358m;
        cpVar.f23358m = i2 + 1;
        return i2;
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    public cp(int i2) {
        this(1, i2, 112800);
    }

    public static /* synthetic */ k8[] c() {
        return new k8[]{new cp()};
    }

    private void d() {
        this.f23353h.clear();
        this.f23352g.clear();
        SparseArray a2 = this.f23351f.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f23352g.put(a2.keyAt(i2), (dp) a2.valueAt(i2));
        }
        this.f23352g.put(0, new hj(new a()));
        this.f23362q = null;
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f23357l = m8Var;
    }

    public cp(int i2, int i3, int i4) {
        this(i2, new ho(0L), new n6(i3), i4);
    }

    private boolean b(l8 l8Var) {
        byte[] c2 = this.d.c();
        if (9400 - this.d.d() < 188) {
            int a2 = this.d.a();
            if (a2 > 0) {
                System.arraycopy(c2, this.d.d(), c2, 0, a2);
            }
            this.d.a(c2, a2);
        }
        while (this.d.a() < 188) {
            int e = this.d.e();
            int a3 = l8Var.a(c2, e, 9400 - e);
            if (a3 == -1) {
                return false;
            }
            this.d.e(e + a3);
        }
        return true;
    }

    public cp(int i2, ho hoVar, dp.c cVar, int i3) {
        this.f23351f = (dp.c) b1.a(cVar);
        this.f23349b = i3;
        this.f23348a = i2;
        if (i2 != 1 && i2 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f23350c = arrayList;
            arrayList.add(hoVar);
        } else {
            this.f23350c = Collections.singletonList(hoVar);
        }
        this.d = new bh(new byte[9400], 0);
        this.f23353h = new SparseBooleanArray();
        this.f23354i = new SparseBooleanArray();
        this.f23352g = new SparseArray();
        this.e = new SparseIntArray();
        this.f23355j = new bp(i3);
        this.f23357l = m8.e;
        this.f23364s = -1;
        d();
    }

    private void a(long j2) {
        if (this.f23360o) {
            return;
        }
        this.f23360o = true;
        if (this.f23355j.a() != -9223372036854775807L) {
            ap apVar = new ap(this.f23355j.b(), this.f23355j.a(), j2, this.f23364s, this.f23349b);
            this.f23356k = apVar;
            this.f23357l.a(apVar.a());
            return;
        }
        this.f23357l.a(new ij.b(this.f23355j.a()));
    }

    private int b() {
        int d = this.d.d();
        int e = this.d.e();
        int a2 = ep.a(this.d.c(), d, e);
        this.d.f(a2);
        int i2 = a2 + Opcodes.NEWARRAY;
        if (i2 > e) {
            int i3 = (a2 - d) + this.f23363r;
            this.f23363r = i3;
            if (this.f23348a == 2 && i3 > 376) {
                throw dh.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f23363r = 0;
        }
        return i2;
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        long a2 = l8Var.a();
        if (this.f23359n) {
            if (a2 != -1 && this.f23348a != 2 && !this.f23355j.c()) {
                return this.f23355j.a(l8Var, thVar, this.f23364s);
            }
            a(a2);
            if (this.f23361p) {
                this.f23361p = false;
                a(0L, 0L);
                if (l8Var.f() != 0) {
                    thVar.f27165a = 0L;
                    return 1;
                }
            }
            ap apVar = this.f23356k;
            if (apVar != null && apVar.b()) {
                return this.f23356k.a(l8Var, thVar);
            }
        }
        if (!b(l8Var)) {
            return -1;
        }
        int b2 = b();
        int e = this.d.e();
        if (b2 > e) {
            return 0;
        }
        int j2 = this.d.j();
        if ((8388608 & j2) != 0) {
            this.d.f(b2);
            return 0;
        }
        int i2 = (4194304 & j2) != 0 ? 1 : 0;
        int i3 = (2096896 & j2) >> 8;
        boolean z2 = (j2 & 32) != 0;
        dp dpVar = (j2 & 16) != 0 ? (dp) this.f23352g.get(i3) : null;
        if (dpVar == null) {
            this.d.f(b2);
            return 0;
        }
        if (this.f23348a != 2) {
            int i4 = j2 & 15;
            int i5 = this.e.get(i3, i4 - 1);
            this.e.put(i3, i4);
            if (i5 == i4) {
                this.d.f(b2);
                return 0;
            }
            if (i4 != ((i5 + 1) & 15)) {
                dpVar.a();
            }
        }
        if (z2) {
            int w = this.d.w();
            i2 |= (this.d.w() & 64) != 0 ? 2 : 0;
            this.d.g(w - 1);
        }
        boolean z3 = this.f23359n;
        if (a(i3)) {
            this.d.e(b2);
            dpVar.a(this.d, i2);
            this.d.e(e);
        }
        if (this.f23348a != 2 && !z3 && this.f23359n && a2 != -1) {
            this.f23361p = true;
        }
        this.d.f(b2);
        return 0;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        int i2;
        ap apVar;
        b1.b(this.f23348a != 2);
        int size = this.f23350c.size();
        for (0; i2 < size; i2 + 1) {
            ho hoVar = (ho) this.f23350c.get(i2);
            boolean z2 = hoVar.c() == -9223372036854775807L;
            if (!z2) {
                long a2 = hoVar.a();
                if (a2 != -9223372036854775807L) {
                    if (a2 != 0) {
                        if (a2 == j3) {
                        }
                        hoVar.d(j3);
                    }
                }
            } else {
                i2 = z2 ? 0 : i2 + 1;
                hoVar.d(j3);
            }
        }
        if (j3 != 0 && (apVar = this.f23356k) != null) {
            apVar.b(j3);
        }
        this.d.d(0);
        this.e.clear();
        for (int i3 = 0; i3 < this.f23352g.size(); i3++) {
            ((dp) this.f23352g.valueAt(i3)).a();
        }
        this.f23363r = 0;
    }

    private boolean a(int i2) {
        return this.f23348a == 2 || this.f23359n || !this.f23354i.get(i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.applovin.impl.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.applovin.impl.l8 r7) {
        /*
            r6 = this;
            com.applovin.impl.bh r0 = r6.d
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.cp.a(com.applovin.impl.l8):boolean");
    }
}
