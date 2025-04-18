package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.i1;
import com.applovin.impl.w6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.UByte;

/* loaded from: classes.dex */
public class h9 implements i8 {
    public static final m8 I = new ht(4);
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final d9 K = new d9.b().f(MimeTypes.APPLICATION_EMSG).a();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private k8 E;
    private ro[] F;
    private ro[] G;
    private boolean H;
    private final int a;

    /* renamed from: b */
    private final mo f5107b;

    /* renamed from: c */
    private final List f5108c;

    /* renamed from: d */
    private final SparseArray f5109d;

    /* renamed from: e */
    private final yg f5110e;

    /* renamed from: f */
    private final yg f5111f;

    /* renamed from: g */
    private final yg f5112g;

    /* renamed from: h */
    private final byte[] f5113h;

    /* renamed from: i */
    private final yg f5114i;

    /* renamed from: j */
    private final io f5115j;

    /* renamed from: k */
    private final w7 f5116k;

    /* renamed from: l */
    private final yg f5117l;

    /* renamed from: m */
    private final ArrayDeque f5118m;

    /* renamed from: n */
    private final ArrayDeque f5119n;

    /* renamed from: o */
    private final ro f5120o;

    /* renamed from: p */
    private int f5121p;

    /* renamed from: q */
    private int f5122q;

    /* renamed from: r */
    private long f5123r;

    /* renamed from: s */
    private int f5124s;

    /* renamed from: t */
    private yg f5125t;
    private long u;

    /* renamed from: v */
    private int f5126v;

    /* renamed from: w */
    private long f5127w;

    /* renamed from: x */
    private long f5128x;

    /* renamed from: y */
    private long f5129y;

    /* renamed from: z */
    private b f5130z;

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;

        /* renamed from: b */
        public final int f5131b;

        public a(long j3, int i10) {
            this.a = j3;
            this.f5131b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final ro a;

        /* renamed from: d */
        public so f5134d;

        /* renamed from: e */
        public j6 f5135e;

        /* renamed from: f */
        public int f5136f;

        /* renamed from: g */
        public int f5137g;

        /* renamed from: h */
        public int f5138h;

        /* renamed from: i */
        public int f5139i;

        /* renamed from: l */
        private boolean f5142l;

        /* renamed from: b */
        public final oo f5132b = new oo();

        /* renamed from: c */
        public final yg f5133c = new yg();

        /* renamed from: j */
        private final yg f5140j = new yg(1);

        /* renamed from: k */
        private final yg f5141k = new yg();

        public b(ro roVar, so soVar, j6 j6Var) {
            this.a = roVar;
            this.f5134d = soVar;
            this.f5135e = j6Var;
            a(soVar, j6Var);
        }

        public long b() {
            if (!this.f5142l) {
                return this.f5134d.f8064c[this.f5136f];
            }
            return this.f5132b.f6846g[this.f5138h];
        }

        public long c() {
            if (!this.f5142l) {
                return this.f5134d.f8067f[this.f5136f];
            }
            return this.f5132b.a(this.f5136f);
        }

        public int d() {
            if (!this.f5142l) {
                return this.f5134d.f8065d[this.f5136f];
            }
            return this.f5132b.f6848i[this.f5136f];
        }

        public no e() {
            if (!this.f5142l) {
                return null;
            }
            int i10 = ((j6) yp.a(this.f5132b.a)).a;
            no noVar = this.f5132b.f6854o;
            if (noVar == null) {
                noVar = this.f5134d.a.a(i10);
            }
            if (noVar == null || !noVar.a) {
                return null;
            }
            return noVar;
        }

        public boolean f() {
            this.f5136f++;
            if (!this.f5142l) {
                return false;
            }
            int i10 = this.f5137g + 1;
            this.f5137g = i10;
            int[] iArr = this.f5132b.f6847h;
            int i11 = this.f5138h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f5138h = i11 + 1;
            this.f5137g = 0;
            return false;
        }

        public void g() {
            this.f5132b.a();
            this.f5136f = 0;
            this.f5138h = 0;
            this.f5137g = 0;
            this.f5139i = 0;
            this.f5142l = false;
        }

        public void h() {
            no e2 = e();
            if (e2 == null) {
                return;
            }
            yg ygVar = this.f5132b.f6855p;
            int i10 = e2.f6425d;
            if (i10 != 0) {
                ygVar.g(i10);
            }
            if (this.f5132b.c(this.f5136f)) {
                ygVar.g(ygVar.C() * 6);
            }
        }

        public int a() {
            int i10;
            if (!this.f5142l) {
                i10 = this.f5134d.f8068g[this.f5136f];
            } else {
                i10 = this.f5132b.f6851l[this.f5136f] ? 1 : 0;
            }
            return e() != null ? i10 | 1073741824 : i10;
        }

        public int a(int i10, int i11) {
            yg ygVar;
            no e2 = e();
            if (e2 == null) {
                return 0;
            }
            int i12 = e2.f6425d;
            if (i12 != 0) {
                ygVar = this.f5132b.f6855p;
            } else {
                byte[] bArr = (byte[]) yp.a((Object) e2.f6426e);
                this.f5141k.a(bArr, bArr.length);
                yg ygVar2 = this.f5141k;
                i12 = bArr.length;
                ygVar = ygVar2;
            }
            boolean c10 = this.f5132b.c(this.f5136f);
            boolean z10 = c10 || i11 != 0;
            this.f5140j.c()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f5140j.f(0);
            this.a.a(this.f5140j, 1, 1);
            this.a.a(ygVar, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!c10) {
                this.f5133c.d(8);
                byte[] c11 = this.f5133c.c();
                c11[0] = 0;
                c11[1] = 1;
                c11[2] = (byte) ((i11 >> 8) & 255);
                c11[3] = (byte) (i11 & 255);
                c11[4] = (byte) ((i10 >> 24) & 255);
                c11[5] = (byte) ((i10 >> 16) & 255);
                c11[6] = (byte) ((i10 >> 8) & 255);
                c11[7] = (byte) (i10 & 255);
                this.a.a(this.f5133c, 8, 1);
                return i12 + 9;
            }
            yg ygVar3 = this.f5132b.f6855p;
            int C = ygVar3.C();
            ygVar3.g(-2);
            int i13 = (C * 6) + 2;
            if (i11 != 0) {
                this.f5133c.d(i13);
                byte[] c12 = this.f5133c.c();
                ygVar3.a(c12, 0, i13);
                int i14 = (((c12[2] & UByte.MAX_VALUE) << 8) | (c12[3] & UByte.MAX_VALUE)) + i11;
                c12[2] = (byte) ((i14 >> 8) & 255);
                c12[3] = (byte) (i14 & 255);
                ygVar3 = this.f5133c;
            }
            this.a.a(ygVar3, i13, 1);
            return i12 + 1 + i13;
        }

        public void a(so soVar, j6 j6Var) {
            this.f5134d = soVar;
            this.f5135e = j6Var;
            this.a.a(soVar.a.f6281f);
            g();
        }

        public void a(long j3) {
            int i10 = this.f5136f;
            while (true) {
                oo ooVar = this.f5132b;
                if (i10 >= ooVar.f6845f || ooVar.a(i10) >= j3) {
                    return;
                }
                if (this.f5132b.f6851l[i10]) {
                    this.f5139i = i10;
                }
                i10++;
            }
        }

        public void a(w6 w6Var) {
            no a = this.f5134d.a.a(((j6) yp.a(this.f5132b.a)).a);
            this.a.a(this.f5134d.a.f6281f.a().a(w6Var.a(a != null ? a.f6423b : null)).a());
        }
    }

    public h9() {
        this(0);
    }

    private static boolean b(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean c(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static Pair d(yg ygVar) {
        ygVar.f(12);
        return Pair.create(Integer.valueOf(ygVar.j()), new j6(ygVar.j() - 1, ygVar.j(), ygVar.j(), ygVar.j()));
    }

    public static /* synthetic */ i8[] e() {
        return d();
    }

    public mo a(mo moVar) {
        return moVar;
    }

    public h9(int i10) {
        this(i10, null);
    }

    private void b() {
        this.f5121p = 0;
        this.f5124s = 0;
    }

    private void c() {
        int i10;
        ro[] roVarArr = new ro[2];
        this.F = roVarArr;
        ro roVar = this.f5120o;
        int i11 = 0;
        if (roVar != null) {
            roVarArr[0] = roVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.a & 4) != 0) {
            roVarArr[i10] = this.E.a(100, 5);
            i12 = 101;
            i10++;
        }
        ro[] roVarArr2 = (ro[]) yp.a(this.F, i10);
        this.F = roVarArr2;
        for (ro roVar2 : roVarArr2) {
            roVar2.a(K);
        }
        this.G = new ro[this.f5108c.size()];
        while (i11 < this.G.length) {
            ro a10 = this.E.a(i12, 3);
            a10.a((d9) this.f5108c.get(i11));
            this.G[i11] = a10;
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e(j8 j8Var) {
        int a10;
        b bVar = this.f5130z;
        Throwable th2 = null;
        if (bVar == null) {
            bVar = a(this.f5109d);
            if (bVar == null) {
                int f10 = (int) (this.u - j8Var.f());
                if (f10 >= 0) {
                    j8Var.a(f10);
                    b();
                    return false;
                }
                throw ah.a("Offset to end of mdat was negative.", null);
            }
            int b3 = (int) (bVar.b() - j8Var.f());
            if (b3 < 0) {
                kc.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                b3 = 0;
            }
            j8Var.a(b3);
            this.f5130z = bVar;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f5121p == 3) {
            int d10 = bVar.d();
            this.A = d10;
            if (bVar.f5136f < bVar.f5139i) {
                j8Var.a(d10);
                bVar.h();
                if (!bVar.f()) {
                    this.f5130z = null;
                }
                this.f5121p = 3;
                return true;
            }
            if (bVar.f5134d.a.f6282g == 1) {
                this.A = d10 - 8;
                j8Var.a(8);
            }
            if ("audio/ac4".equals(bVar.f5134d.a.f6281f.f4228m)) {
                this.B = bVar.a(this.A, 7);
                n.a(this.A, this.f5114i);
                bVar.a.a(this.f5114i, 7);
                this.B += 7;
            } else {
                this.B = bVar.a(this.A, 0);
            }
            this.A += this.B;
            this.f5121p = 4;
            this.C = 0;
        }
        mo moVar = bVar.f5134d.a;
        ro roVar = bVar.a;
        long c10 = bVar.c();
        io ioVar = this.f5115j;
        if (ioVar != null) {
            c10 = ioVar.a(c10);
        }
        long j3 = c10;
        if (moVar.f6285j == 0) {
            while (true) {
                int i12 = this.B;
                int i13 = this.A;
                if (i12 >= i13) {
                    break;
                }
                this.B += roVar.a((e5) j8Var, i13 - i12, false);
            }
        } else {
            byte[] c11 = this.f5111f.c();
            c11[0] = 0;
            c11[1] = 0;
            c11[2] = 0;
            int i14 = moVar.f6285j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.B < this.A) {
                int i17 = this.C;
                if (i17 == 0) {
                    j8Var.d(c11, i16, i15);
                    this.f5111f.f(0);
                    int j10 = this.f5111f.j();
                    if (j10 >= i11) {
                        this.C = j10 - 1;
                        this.f5110e.f(0);
                        roVar.a(this.f5110e, i10);
                        roVar.a(this.f5111f, i11);
                        this.D = (this.G.length <= 0 || !uf.a(moVar.f6281f.f4228m, c11[i10])) ? 0 : i11;
                        this.B += 5;
                        this.A += i16;
                    } else {
                        throw ah.a("Invalid NAL length", th2);
                    }
                } else {
                    if (this.D) {
                        this.f5112g.d(i17);
                        j8Var.d(this.f5112g.c(), 0, this.C);
                        roVar.a(this.f5112g, this.C);
                        a10 = this.C;
                        int c12 = uf.c(this.f5112g.c(), this.f5112g.e());
                        this.f5112g.f(MimeTypes.VIDEO_H265.equals(moVar.f6281f.f4228m) ? 1 : 0);
                        this.f5112g.e(c12);
                        a3.a(j3, this.f5112g, this.G);
                    } else {
                        a10 = roVar.a((e5) j8Var, i17, false);
                    }
                    this.B += a10;
                    this.C -= a10;
                    th2 = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int a11 = bVar.a();
        no e2 = bVar.e();
        roVar.a(j3, a11, this.A, 0, e2 != null ? e2.f6424c : null);
        a(j3);
        if (!bVar.f()) {
            this.f5130z = null;
        }
        this.f5121p = 3;
        return true;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public h9(int i10, io ioVar) {
        this(i10, ioVar, null, Collections.emptyList());
    }

    private static int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw ah.a("Unexpected negative value: " + i10, null);
    }

    public h9(int i10, io ioVar, mo moVar, List list) {
        this(i10, ioVar, moVar, list, null);
    }

    private j6 a(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (j6) sparseArray.valueAt(0);
        }
        return (j6) a1.a((j6) sparseArray.get(i10));
    }

    private void b(i1.a aVar) {
        a(aVar, this.f5109d, this.f5107b != null, this.a, this.f5113h);
        w6 a10 = a(aVar.f5236c);
        if (a10 != null) {
            int size = this.f5109d.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f5109d.valueAt(i10)).a(a10);
            }
        }
        if (this.f5127w != C.TIME_UNSET) {
            int size2 = this.f5109d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f5109d.valueAt(i11)).a(this.f5127w);
            }
            this.f5127w = C.TIME_UNSET;
        }
    }

    public h9(int i10, io ioVar, mo moVar, List list, ro roVar) {
        this.a = i10;
        this.f5115j = ioVar;
        this.f5107b = moVar;
        this.f5108c = Collections.unmodifiableList(list);
        this.f5120o = roVar;
        this.f5116k = new w7();
        this.f5117l = new yg(16);
        this.f5110e = new yg(uf.a);
        this.f5111f = new yg(5);
        this.f5112g = new yg();
        byte[] bArr = new byte[16];
        this.f5113h = bArr;
        this.f5114i = new yg(bArr);
        this.f5118m = new ArrayDeque();
        this.f5119n = new ArrayDeque();
        this.f5109d = new SparseArray();
        this.f5128x = C.TIME_UNSET;
        this.f5127w = C.TIME_UNSET;
        this.f5129y = C.TIME_UNSET;
        this.E = k8.f5637e;
        this.F = new ro[0];
        this.G = new ro[0];
    }

    private static w6 a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            i1.b bVar = (i1.b) list.get(i10);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] c10 = bVar.f5238b.c();
                UUID c11 = fi.c(c10);
                if (c11 == null) {
                    kc.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new w6.b(c11, MimeTypes.VIDEO_MP4, c10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new w6(arrayList);
    }

    private void d(j8 j8Var) {
        int size = this.f5109d.size();
        long j3 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            oo ooVar = ((b) this.f5109d.valueAt(i10)).f5132b;
            if (ooVar.f6856q) {
                long j10 = ooVar.f6843d;
                if (j10 < j3) {
                    bVar = (b) this.f5109d.valueAt(i10);
                    j3 = j10;
                }
            }
        }
        if (bVar == null) {
            this.f5121p = 3;
            return;
        }
        int f10 = (int) (j3 - j8Var.f());
        if (f10 >= 0) {
            j8Var.a(f10);
            bVar.f5132b.a(j8Var);
            return;
        }
        throw ah.a("Offset to encryption data was negative.", null);
    }

    private static long b(yg ygVar) {
        ygVar.f(8);
        return i1.c(ygVar.j()) == 0 ? ygVar.y() : ygVar.B();
    }

    private void c(i1.a aVar) {
        int i10 = 0;
        a1.b(this.f5107b == null, "Unexpected moov box.");
        w6 a10 = a(aVar.f5236c);
        i1.a aVar2 = (i1.a) a1.a(aVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f5236c.size();
        long j3 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            i1.b bVar = (i1.b) aVar2.f5236c.get(i11);
            int i12 = bVar.a;
            if (i12 == 1953654136) {
                Pair d10 = d(bVar.f5238b);
                sparseArray.put(((Integer) d10.first).intValue(), (j6) d10.second);
            } else if (i12 == 1835362404) {
                j3 = b(bVar.f5238b);
            }
        }
        List a11 = j1.a(aVar, new x9(), j3, a10, (this.a & 16) != 0, false, new Function() { // from class: com.applovin.impl.vt
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return h9.this.a((mo) obj);
            }
        });
        int size2 = a11.size();
        if (this.f5109d.size() == 0) {
            while (i10 < size2) {
                so soVar = (so) a11.get(i10);
                mo moVar = soVar.a;
                this.f5109d.put(moVar.a, new b(this.E.a(i10, moVar.f6277b), soVar, a(sparseArray, moVar.a)));
                this.f5128x = Math.max(this.f5128x, moVar.f6280e);
                i10++;
            }
            this.E.c();
            return;
        }
        a1.b(this.f5109d.size() == size2);
        while (i10 < size2) {
            so soVar2 = (so) a11.get(i10);
            mo moVar2 = soVar2.a;
            ((b) this.f5109d.get(moVar2.a)).a(soVar2, a(sparseArray, moVar2.a));
            i10++;
        }
    }

    private static b a(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f5142l || bVar2.f5136f != bVar2.f5134d.f8063b) && (!bVar2.f5142l || bVar2.f5138h != bVar2.f5132b.f6844e)) {
                long b3 = bVar2.b();
                if (b3 < j3) {
                    bVar = bVar2;
                    j3 = b3;
                }
            }
        }
        return bVar;
    }

    private static void b(yg ygVar, oo ooVar) {
        a(ygVar, 0, ooVar);
    }

    private static void b(i1.a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        b a10 = a(((i1.b) a1.a(aVar.e(1952868452))).f5238b, sparseArray, z10);
        if (a10 == null) {
            return;
        }
        oo ooVar = a10.f5132b;
        long j3 = ooVar.f6857r;
        boolean z11 = ooVar.f6858s;
        a10.g();
        a10.f5142l = true;
        i1.b e2 = aVar.e(1952867444);
        if (e2 != null && (i10 & 2) == 0) {
            ooVar.f6857r = c(e2.f5238b);
            ooVar.f6858s = true;
        } else {
            ooVar.f6857r = j3;
            ooVar.f6858s = z11;
        }
        a(aVar, a10, i10);
        no a11 = a10.f5134d.a.a(((j6) a1.a(ooVar.a)).a);
        i1.b e10 = aVar.e(1935763834);
        if (e10 != null) {
            a((no) a1.a(a11), e10.f5238b, ooVar);
        }
        i1.b e11 = aVar.e(1935763823);
        if (e11 != null) {
            a(e11.f5238b, ooVar);
        }
        i1.b e12 = aVar.e(1936027235);
        if (e12 != null) {
            b(e12.f5238b, ooVar);
        }
        a(aVar, a11 != null ? a11.f6423b : null, ooVar);
        int size = aVar.f5236c.size();
        for (int i11 = 0; i11 < size; i11++) {
            i1.b bVar = (i1.b) aVar.f5236c.get(i11);
            if (bVar.a == 1970628964) {
                a(bVar.f5238b, ooVar, bArr);
            }
        }
    }

    public static /* synthetic */ i8[] d() {
        return new i8[]{new h9()};
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.E = k8Var;
        b();
        c();
        mo moVar = this.f5107b;
        if (moVar != null) {
            this.f5109d.put(0, new b(k8Var.a(0, moVar.f6277b), new so(this.f5107b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new j6(0, 0, 0, 0)));
            this.E.c();
        }
    }

    private void a(i1.a aVar) {
        int i10 = aVar.a;
        if (i10 == 1836019574) {
            c(aVar);
        } else if (i10 == 1836019558) {
            b(aVar);
        } else {
            if (this.f5118m.isEmpty()) {
                return;
            }
            ((i1.a) this.f5118m.peek()).a(aVar);
        }
    }

    private void a(yg ygVar) {
        long c10;
        String str;
        long c11;
        String str2;
        long y4;
        long j3;
        if (this.F.length == 0) {
            return;
        }
        ygVar.f(8);
        int c12 = i1.c(ygVar.j());
        if (c12 != 0) {
            if (c12 != 1) {
                a4.j.u("Skipping unsupported emsg version: ", c12, "FragmentedMp4Extractor");
                return;
            }
            long y10 = ygVar.y();
            j3 = yp.c(ygVar.B(), 1000000L, y10);
            long c13 = yp.c(ygVar.y(), 1000L, y10);
            long y11 = ygVar.y();
            str = (String) a1.a((Object) ygVar.t());
            c11 = c13;
            y4 = y11;
            str2 = (String) a1.a((Object) ygVar.t());
            c10 = -9223372036854775807L;
        } else {
            String str3 = (String) a1.a((Object) ygVar.t());
            String str4 = (String) a1.a((Object) ygVar.t());
            long y12 = ygVar.y();
            c10 = yp.c(ygVar.y(), 1000000L, y12);
            long j10 = this.f5129y;
            long j11 = j10 != C.TIME_UNSET ? j10 + c10 : -9223372036854775807L;
            str = str3;
            c11 = yp.c(ygVar.y(), 1000L, y12);
            str2 = str4;
            y4 = ygVar.y();
            j3 = j11;
        }
        byte[] bArr = new byte[ygVar.a()];
        ygVar.a(bArr, 0, ygVar.a());
        yg ygVar2 = new yg(this.f5116k.a(new u7(str, str2, c11, y4, bArr)));
        int a10 = ygVar2.a();
        for (ro roVar : this.F) {
            ygVar2.f(0);
            roVar.a(ygVar2, a10);
        }
        if (j3 == C.TIME_UNSET) {
            this.f5119n.addLast(new a(c10, a10));
            this.f5126v += a10;
            return;
        }
        io ioVar = this.f5115j;
        if (ioVar != null) {
            j3 = ioVar.a(j3);
        }
        for (ro roVar2 : this.F) {
            roVar2.a(j3, 1, a10, 0, null);
        }
    }

    private static long c(yg ygVar) {
        ygVar.f(8);
        return i1.c(ygVar.j()) == 1 ? ygVar.B() : ygVar.y();
    }

    private void b(long j3) {
        while (!this.f5118m.isEmpty() && ((i1.a) this.f5118m.peek()).f5235b == j3) {
            a((i1.a) this.f5118m.pop());
        }
        b();
    }

    private boolean b(j8 j8Var) {
        if (this.f5124s == 0) {
            if (!j8Var.a(this.f5117l.c(), 0, 8, true)) {
                return false;
            }
            this.f5124s = 8;
            this.f5117l.f(0);
            this.f5123r = this.f5117l.y();
            this.f5122q = this.f5117l.j();
        }
        long j3 = this.f5123r;
        if (j3 == 1) {
            j8Var.d(this.f5117l.c(), 8, 8);
            this.f5124s += 8;
            this.f5123r = this.f5117l.B();
        } else if (j3 == 0) {
            long a10 = j8Var.a();
            if (a10 == -1 && !this.f5118m.isEmpty()) {
                a10 = ((i1.a) this.f5118m.peek()).f5235b;
            }
            if (a10 != -1) {
                this.f5123r = (a10 - j8Var.f()) + this.f5124s;
            }
        }
        if (this.f5123r >= this.f5124s) {
            long f10 = j8Var.f() - this.f5124s;
            int i10 = this.f5122q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.a(new ej.b(this.f5128x, f10));
                this.H = true;
            }
            if (this.f5122q == 1836019558) {
                int size = this.f5109d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    oo ooVar = ((b) this.f5109d.valueAt(i11)).f5132b;
                    ooVar.f6841b = f10;
                    ooVar.f6843d = f10;
                    ooVar.f6842c = f10;
                }
            }
            int i12 = this.f5122q;
            if (i12 == 1835295092) {
                this.f5130z = null;
                this.u = f10 + this.f5123r;
                this.f5121p = 2;
                return true;
            }
            if (b(i12)) {
                long f11 = (j8Var.f() + this.f5123r) - 8;
                this.f5118m.push(new i1.a(this.f5122q, f11));
                if (this.f5123r == this.f5124s) {
                    b(f11);
                } else {
                    b();
                }
            } else if (c(this.f5122q)) {
                if (this.f5124s == 8) {
                    long j10 = this.f5123r;
                    if (j10 <= 2147483647L) {
                        yg ygVar = new yg((int) j10);
                        System.arraycopy(this.f5117l.c(), 0, ygVar.c(), 0, 8);
                        this.f5125t = ygVar;
                        this.f5121p = 1;
                    } else {
                        throw ah.a("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw ah.a("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f5123r <= 2147483647L) {
                this.f5125t = null;
                this.f5121p = 1;
            } else {
                throw ah.a("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private void c(j8 j8Var) {
        int i10 = ((int) this.f5123r) - this.f5124s;
        yg ygVar = this.f5125t;
        if (ygVar != null) {
            j8Var.d(ygVar.c(), 8, i10);
            a(new i1.b(this.f5122q, ygVar), j8Var.f());
        } else {
            j8Var.a(i10);
        }
        b(j8Var.f());
    }

    private void a(i1.b bVar, long j3) {
        if (!this.f5118m.isEmpty()) {
            ((i1.a) this.f5118m.peek()).a(bVar);
            return;
        }
        int i10 = bVar.a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                a(bVar.f5238b);
            }
        } else {
            Pair a10 = a(bVar.f5238b, j3);
            this.f5129y = ((Long) a10.first).longValue();
            this.E.a((ej) a10.second);
            this.H = true;
        }
    }

    private void a(long j3) {
        while (!this.f5119n.isEmpty()) {
            a aVar = (a) this.f5119n.removeFirst();
            this.f5126v -= aVar.f5131b;
            long j10 = aVar.a + j3;
            io ioVar = this.f5115j;
            if (ioVar != null) {
                j10 = ioVar.a(j10);
            }
            for (ro roVar : this.F) {
                roVar.a(j10, 1, aVar.f5131b, this.f5126v, null);
            }
        }
    }

    private static void a(i1.a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f5237d.size();
        for (int i11 = 0; i11 < size; i11++) {
            i1.a aVar2 = (i1.a) aVar.f5237d.get(i11);
            if (aVar2.a == 1953653094) {
                b(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void a(yg ygVar, oo ooVar) {
        ygVar.f(8);
        int j3 = ygVar.j();
        if ((i1.b(j3) & 1) == 1) {
            ygVar.g(8);
        }
        int A = ygVar.A();
        if (A == 1) {
            ooVar.f6843d += i1.c(j3) == 0 ? ygVar.y() : ygVar.B();
        } else {
            throw ah.a("Unexpected saio entry count: " + A, null);
        }
    }

    private static void a(no noVar, yg ygVar, oo ooVar) {
        int i10;
        int i11 = noVar.f6425d;
        ygVar.f(8);
        if ((i1.b(ygVar.j()) & 1) == 1) {
            ygVar.g(8);
        }
        int w10 = ygVar.w();
        int A = ygVar.A();
        if (A <= ooVar.f6845f) {
            if (w10 == 0) {
                boolean[] zArr = ooVar.f6853n;
                i10 = 0;
                for (int i12 = 0; i12 < A; i12++) {
                    int w11 = ygVar.w();
                    i10 += w11;
                    zArr[i12] = w11 > i11;
                }
            } else {
                i10 = w10 * A;
                Arrays.fill(ooVar.f6853n, 0, A, w10 > i11);
            }
            Arrays.fill(ooVar.f6853n, A, ooVar.f6845f, false);
            if (i10 > 0) {
                ooVar.b(i10);
                return;
            }
            return;
        }
        StringBuilder m10 = a4.j.m("Saiz sample count ", A, " is greater than fragment sample count");
        m10.append(ooVar.f6845f);
        throw ah.a(m10.toString(), null);
    }

    private static void a(i1.a aVar, String str, oo ooVar) {
        byte[] bArr = null;
        yg ygVar = null;
        yg ygVar2 = null;
        for (int i10 = 0; i10 < aVar.f5236c.size(); i10++) {
            i1.b bVar = (i1.b) aVar.f5236c.get(i10);
            yg ygVar3 = bVar.f5238b;
            int i11 = bVar.a;
            if (i11 == 1935828848) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar = ygVar3;
                }
            } else if (i11 == 1936158820) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar2 = ygVar3;
                }
            }
        }
        if (ygVar == null || ygVar2 == null) {
            return;
        }
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        ygVar.g(4);
        if (c10 == 1) {
            ygVar.g(4);
        }
        if (ygVar.j() == 1) {
            ygVar2.f(8);
            int c11 = i1.c(ygVar2.j());
            ygVar2.g(4);
            if (c11 == 1) {
                if (ygVar2.y() == 0) {
                    throw ah.a("Variable length description in sgpd found (unsupported)");
                }
            } else if (c11 >= 2) {
                ygVar2.g(4);
            }
            if (ygVar2.y() == 1) {
                ygVar2.g(1);
                int w10 = ygVar2.w();
                int i12 = (w10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                int i13 = w10 & 15;
                boolean z10 = ygVar2.w() == 1;
                if (z10) {
                    int w11 = ygVar2.w();
                    byte[] bArr2 = new byte[16];
                    ygVar2.a(bArr2, 0, 16);
                    if (w11 == 0) {
                        int w12 = ygVar2.w();
                        bArr = new byte[w12];
                        ygVar2.a(bArr, 0, w12);
                    }
                    ooVar.f6852m = true;
                    ooVar.f6854o = new no(z10, str, w11, bArr2, i12, i13, bArr);
                    return;
                }
                return;
            }
            throw ah.a("Entry count in sgpd != 1 (unsupported).");
        }
        throw ah.a("Entry count in sbgp != 1 (unsupported).");
    }

    private static void a(yg ygVar, int i10, oo ooVar) {
        ygVar.f(i10 + 8);
        int b3 = i1.b(ygVar.j());
        if ((b3 & 1) == 0) {
            boolean z10 = (b3 & 2) != 0;
            int A = ygVar.A();
            if (A == 0) {
                Arrays.fill(ooVar.f6853n, 0, ooVar.f6845f, false);
                return;
            }
            if (A == ooVar.f6845f) {
                Arrays.fill(ooVar.f6853n, 0, A, z10);
                ooVar.b(ygVar.a());
                ooVar.a(ygVar);
                return;
            } else {
                StringBuilder m10 = a4.j.m("Senc sample count ", A, " is different from fragment sample count");
                m10.append(ooVar.f6845f);
                throw ah.a(m10.toString(), null);
            }
        }
        throw ah.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static Pair a(yg ygVar, long j3) {
        long B;
        long B2;
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        ygVar.g(4);
        long y4 = ygVar.y();
        if (c10 == 0) {
            B = ygVar.y();
            B2 = ygVar.y();
        } else {
            B = ygVar.B();
            B2 = ygVar.B();
        }
        long j10 = B;
        long j11 = B2 + j3;
        long c11 = yp.c(j10, 1000000L, y4);
        ygVar.g(2);
        int C = ygVar.C();
        int[] iArr = new int[C];
        long[] jArr = new long[C];
        long[] jArr2 = new long[C];
        long[] jArr3 = new long[C];
        long j12 = c11;
        int i10 = 0;
        long j13 = j10;
        while (i10 < C) {
            int j14 = ygVar.j();
            if ((j14 & Integer.MIN_VALUE) == 0) {
                long y10 = ygVar.y();
                iArr[i10] = j14 & Integer.MAX_VALUE;
                jArr[i10] = j11;
                jArr3[i10] = j12;
                long j15 = j13 + y10;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = C;
                long c12 = yp.c(j15, 1000000L, y4);
                jArr4[i10] = c12 - jArr5[i10];
                ygVar.g(4);
                j11 += r1[i10];
                i10++;
                iArr = iArr;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                C = i11;
                j13 = j15;
                j12 = c12;
            } else {
                throw ah.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(c11), new e3(iArr, jArr, jArr2, jArr3));
    }

    private static b a(yg ygVar, SparseArray sparseArray, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        ygVar.f(8);
        int b3 = i1.b(ygVar.j());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(ygVar.j()));
        if (bVar == null) {
            return null;
        }
        if ((b3 & 1) != 0) {
            long B = ygVar.B();
            oo ooVar = bVar.f5132b;
            ooVar.f6842c = B;
            ooVar.f6843d = B;
        }
        j6 j6Var = bVar.f5135e;
        if ((b3 & 2) != 0) {
            i10 = ygVar.j() - 1;
        } else {
            i10 = j6Var.a;
        }
        if ((b3 & 8) != 0) {
            i11 = ygVar.j();
        } else {
            i11 = j6Var.f5457b;
        }
        if ((b3 & 16) != 0) {
            i12 = ygVar.j();
        } else {
            i12 = j6Var.f5458c;
        }
        if ((b3 & 32) != 0) {
            i13 = ygVar.j();
        } else {
            i13 = j6Var.f5459d;
        }
        bVar.f5132b.a = new j6(i10, i11, i12, i13);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.applovin.impl.h9.b r36, int r37, int r38, com.applovin.impl.yg r39, int r40) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h9.a(com.applovin.impl.h9$b, int, int, com.applovin.impl.yg, int):int");
    }

    private static void a(i1.a aVar, b bVar, int i10) {
        List list = aVar.f5236c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i1.b bVar2 = (i1.b) list.get(i13);
            if (bVar2.a == 1953658222) {
                yg ygVar = bVar2.f5238b;
                ygVar.f(12);
                int A = ygVar.A();
                if (A > 0) {
                    i12 += A;
                    i11++;
                }
            }
        }
        bVar.f5138h = 0;
        bVar.f5137g = 0;
        bVar.f5136f = 0;
        bVar.f5132b.a(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            i1.b bVar3 = (i1.b) list.get(i16);
            if (bVar3.a == 1953658222) {
                i15 = a(bVar, i14, i10, bVar3.f5238b, i15);
                i14++;
            }
        }
    }

    private static void a(yg ygVar, oo ooVar, byte[] bArr) {
        ygVar.f(8);
        ygVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            a(ygVar, 16, ooVar);
        }
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            int i10 = this.f5121p;
            if (i10 != 0) {
                if (i10 == 1) {
                    c(j8Var);
                } else if (i10 != 2) {
                    if (e(j8Var)) {
                        return 0;
                    }
                } else {
                    d(j8Var);
                }
            } else if (!b(j8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        int size = this.f5109d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f5109d.valueAt(i10)).g();
        }
        this.f5119n.clear();
        this.f5126v = 0;
        this.f5127w = j10;
        this.f5118m.clear();
        b();
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return ik.a(j8Var);
    }
}
