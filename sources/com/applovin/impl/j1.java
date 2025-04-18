package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.i1;
import com.applovin.impl.we;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class j1 {
    private static final byte[] a = yp.c("OpusHead");

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public int f5415b;

        /* renamed from: c, reason: collision with root package name */
        public int f5416c;

        /* renamed from: d, reason: collision with root package name */
        public long f5417d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f5418e;

        /* renamed from: f, reason: collision with root package name */
        private final yg f5419f;

        /* renamed from: g, reason: collision with root package name */
        private final yg f5420g;

        /* renamed from: h, reason: collision with root package name */
        private int f5421h;

        /* renamed from: i, reason: collision with root package name */
        private int f5422i;

        public a(yg ygVar, yg ygVar2, boolean z10) {
            this.f5420g = ygVar;
            this.f5419f = ygVar2;
            this.f5418e = z10;
            ygVar2.f(12);
            this.a = ygVar2.A();
            ygVar.f(12);
            this.f5422i = ygVar.A();
            l8.a(ygVar.j() == 1, "first_chunk must be 1");
            this.f5415b = -1;
        }

        public boolean a() {
            long y4;
            int i10;
            int i11 = this.f5415b + 1;
            this.f5415b = i11;
            if (i11 == this.a) {
                return false;
            }
            if (this.f5418e) {
                y4 = this.f5419f.B();
            } else {
                y4 = this.f5419f.y();
            }
            this.f5417d = y4;
            if (this.f5415b == this.f5421h) {
                this.f5416c = this.f5420g.A();
                this.f5420g.g(4);
                int i12 = this.f5422i - 1;
                this.f5422i = i12;
                if (i12 > 0) {
                    i10 = this.f5420g.A() - 1;
                } else {
                    i10 = -1;
                }
                this.f5421h = i10;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b();

        int c();
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final no[] a;

        /* renamed from: b, reason: collision with root package name */
        public d9 f5423b;

        /* renamed from: c, reason: collision with root package name */
        public int f5424c;

        /* renamed from: d, reason: collision with root package name */
        public int f5425d = 0;

        public c(int i10) {
            this.a = new no[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements b {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5426b;

        /* renamed from: c, reason: collision with root package name */
        private final yg f5427c;

        public d(i1.b bVar, d9 d9Var) {
            yg ygVar = bVar.f5238b;
            this.f5427c = ygVar;
            ygVar.f(12);
            int A = ygVar.A();
            if (MimeTypes.AUDIO_RAW.equals(d9Var.f4228m)) {
                int b3 = yp.b(d9Var.B, d9Var.f4240z);
                if (A == 0 || A % b3 != 0) {
                    kc.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + b3 + ", stsz sample size: " + A);
                    A = b3;
                }
            }
            this.a = A == 0 ? -1 : A;
            this.f5426b = ygVar.A();
        }

        @Override // com.applovin.impl.j1.b
        public int a() {
            return this.a;
        }

        @Override // com.applovin.impl.j1.b
        public int b() {
            return this.f5426b;
        }

        @Override // com.applovin.impl.j1.b
        public int c() {
            int i10 = this.a;
            return i10 == -1 ? this.f5427c.A() : i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements b {
        private final yg a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5428b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5429c;

        /* renamed from: d, reason: collision with root package name */
        private int f5430d;

        /* renamed from: e, reason: collision with root package name */
        private int f5431e;

        public e(i1.b bVar) {
            yg ygVar = bVar.f5238b;
            this.a = ygVar;
            ygVar.f(12);
            this.f5429c = ygVar.A() & 255;
            this.f5428b = ygVar.A();
        }

        @Override // com.applovin.impl.j1.b
        public int a() {
            return -1;
        }

        @Override // com.applovin.impl.j1.b
        public int b() {
            return this.f5428b;
        }

        @Override // com.applovin.impl.j1.b
        public int c() {
            int i10 = this.f5429c;
            if (i10 == 8) {
                return this.a.w();
            }
            if (i10 == 16) {
                return this.a.C();
            }
            int i11 = this.f5430d;
            this.f5430d = i11 + 1;
            if (i11 % 2 == 0) {
                int w10 = this.a.w();
                this.f5431e = w10;
                return (w10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.f5431e & 15;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5432b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5433c;

        public f(int i10, long j3, int i11) {
            this.a = i10;
            this.f5432b = j3;
            this.f5433c = i11;
        }
    }

    private static int a(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static Pair b(yg ygVar, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            ygVar.f(i12);
            int j3 = ygVar.j();
            int j10 = ygVar.j();
            if (j10 == 1718775137) {
                num = Integer.valueOf(ygVar.j());
            } else if (j10 == 1935894637) {
                ygVar.g(4);
                str = ygVar.c(4);
            } else if (j10 == 1935894633) {
                i13 = i12;
                i14 = j3;
            }
            i12 += j3;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        l8.a(num != null, "frma atom is mandatory");
        l8.a(i13 != -1, "schi atom is mandatory");
        no a10 = a(ygVar, i13, i14, str);
        l8.a(a10 != null, "tenc atom is mandatory");
        return Pair.create(num, (no) yp.a(a10));
    }

    private static int c(yg ygVar) {
        ygVar.f(16);
        return ygVar.j();
    }

    private static Pair d(yg ygVar) {
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        ygVar.g(c10 == 0 ? 8 : 16);
        long y4 = ygVar.y();
        ygVar.g(c10 == 0 ? 4 : 8);
        int C = ygVar.C();
        return Pair.create(Long.valueOf(y4), "" + ((char) (((C >> 10) & 31) + 96)) + ((char) (((C >> 5) & 31) + 96)) + ((char) ((C & 31) + 96)));
    }

    private static long e(yg ygVar) {
        ygVar.f(8);
        ygVar.g(i1.c(ygVar.j()) != 0 ? 16 : 8);
        return ygVar.y();
    }

    private static f f(yg ygVar) {
        int i10;
        long j3;
        long B;
        int i11 = 8;
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        if (c10 == 0) {
            i10 = 8;
        } else {
            i10 = 16;
        }
        ygVar.g(i10);
        int j10 = ygVar.j();
        ygVar.g(4);
        int d10 = ygVar.d();
        if (c10 == 0) {
            i11 = 4;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j3 = C.TIME_UNSET;
            if (i13 < i11) {
                if (ygVar.c()[d10 + i13] != -1) {
                    if (c10 == 0) {
                        B = ygVar.y();
                    } else {
                        B = ygVar.B();
                    }
                    if (B != 0) {
                        j3 = B;
                    }
                } else {
                    i13++;
                }
            } else {
                ygVar.g(i11);
                break;
            }
        }
        ygVar.g(16);
        int j11 = ygVar.j();
        int j12 = ygVar.j();
        ygVar.g(4);
        int j13 = ygVar.j();
        int j14 = ygVar.j();
        if (j11 == 0 && j12 == 65536 && j13 == -65536 && j14 == 0) {
            i12 = 90;
        } else if (j11 == 0 && j12 == -65536 && j13 == 65536 && j14 == 0) {
            i12 = 270;
        } else if (j11 == -65536 && j12 == 0 && j13 == 0 && j14 == -65536) {
            i12 = 180;
        }
        return new f(j10, j3, i12);
    }

    private static boolean a(long[] jArr, long j3, long j10, long j11) {
        int length = jArr.length - 1;
        return jArr[0] <= j10 && j10 < jArr[yp.a(4, 0, length)] && jArr[yp.a(jArr.length - 4, 0, length)] < j11 && j11 <= j3;
    }

    private static float c(yg ygVar, int i10) {
        ygVar.f(i10 + 8);
        return ygVar.A() / ygVar.A();
    }

    private static byte[] c(yg ygVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            ygVar.f(i12);
            int j3 = ygVar.j();
            if (ygVar.j() == 1886547818) {
                return Arrays.copyOfRange(ygVar.c(), i12, j3 + i12);
            }
            i12 += j3;
        }
        return null;
    }

    private static we e(yg ygVar, int i10) {
        ygVar.g(8);
        a(ygVar);
        while (ygVar.d() < i10) {
            int d10 = ygVar.d();
            int j3 = ygVar.j();
            if (ygVar.j() == 1768715124) {
                ygVar.f(d10);
                return b(ygVar, d10 + j3);
            }
            ygVar.f(d10 + j3);
        }
        return null;
    }

    private static int a(yg ygVar, int i10, int i11) {
        int d10 = ygVar.d();
        while (d10 - i10 < i11) {
            ygVar.f(d10);
            int j3 = ygVar.j();
            l8.a(j3 > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1702061171) {
                return d10;
            }
            d10 += j3;
        }
        return -1;
    }

    private static Pair d(yg ygVar, int i10, int i11) {
        Pair b3;
        int d10 = ygVar.d();
        while (d10 - i10 < i11) {
            ygVar.f(d10);
            int j3 = ygVar.j();
            l8.a(j3 > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1936289382 && (b3 = b(ygVar, d10, j3)) != null) {
                return b3;
            }
            d10 += j3;
        }
        return null;
    }

    public static void a(yg ygVar) {
        int d10 = ygVar.d();
        ygVar.g(4);
        if (ygVar.j() != 1751411826) {
            d10 += 4;
        }
        ygVar.f(d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.applovin.impl.yg r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.impl.w6 r27, com.applovin.impl.j1.c r28, int r29) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j1.a(com.applovin.impl.yg, int, int, int, int, java.lang.String, boolean, com.applovin.impl.w6, com.applovin.impl.j1$c, int):void");
    }

    private static int b(yg ygVar) {
        int w10 = ygVar.w();
        int i10 = w10 & 127;
        while ((w10 & 128) == 128) {
            w10 = ygVar.w();
            i10 = (i10 << 7) | (w10 & 127);
        }
        return i10;
    }

    private static we d(yg ygVar, int i10) {
        ygVar.g(12);
        while (ygVar.d() < i10) {
            int d10 = ygVar.d();
            int j3 = ygVar.j();
            if (ygVar.j() == 1935766900) {
                if (j3 < 14) {
                    return null;
                }
                ygVar.g(5);
                int w10 = ygVar.w();
                if (w10 != 12 && w10 != 13) {
                    return null;
                }
                float f10 = w10 == 12 ? 240.0f : 120.0f;
                ygVar.g(1);
                return new we(new hk(f10, ygVar.w()));
            }
            ygVar.f(d10 + j3);
        }
        return null;
    }

    private static we b(yg ygVar, int i10) {
        ygVar.g(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar.d() < i10) {
            we.b b3 = cf.b(ygVar);
            if (b3 != null) {
                arrayList.add(b3);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    public static we b(i1.a aVar) {
        i1.b e2 = aVar.e(1751411826);
        i1.b e10 = aVar.e(1801812339);
        i1.b e11 = aVar.e(1768715124);
        if (e2 == null || e10 == null || e11 == null || c(e2.f5238b) != 1835299937) {
            return null;
        }
        yg ygVar = e10.f5238b;
        ygVar.f(12);
        int j3 = ygVar.j();
        String[] strArr = new String[j3];
        for (int i10 = 0; i10 < j3; i10++) {
            int j10 = ygVar.j();
            ygVar.g(4);
            strArr[i10] = ygVar.c(j10 - 8);
        }
        yg ygVar2 = e11.f5238b;
        ygVar2.f(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar2.a() > 8) {
            int d10 = ygVar2.d();
            int j11 = ygVar2.j();
            int j12 = ygVar2.j() - 1;
            if (j12 >= 0 && j12 < j3) {
                ad a10 = cf.a(ygVar2, d10 + j11, strArr[j12]);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            } else {
                a4.j.u("Skipped metadata with unknown key index: ", j12, "AtomParsers");
            }
            ygVar2.f(d10 + j11);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    private static Pair a(i1.a aVar) {
        i1.b e2 = aVar.e(1701606260);
        if (e2 == null) {
            return null;
        }
        yg ygVar = e2.f5238b;
        ygVar.f(8);
        int c10 = i1.c(ygVar.j());
        int A = ygVar.A();
        long[] jArr = new long[A];
        long[] jArr2 = new long[A];
        for (int i10 = 0; i10 < A; i10++) {
            jArr[i10] = c10 == 1 ? ygVar.B() : ygVar.y();
            jArr2[i10] = c10 == 1 ? ygVar.s() : ygVar.j();
            if (ygVar.u() == 1) {
                ygVar.g(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair a(yg ygVar, int i10) {
        ygVar.f(i10 + 12);
        ygVar.g(1);
        b(ygVar);
        ygVar.g(2);
        int w10 = ygVar.w();
        if ((w10 & 128) != 0) {
            ygVar.g(2);
        }
        if ((w10 & 64) != 0) {
            ygVar.g(ygVar.C());
        }
        if ((w10 & 32) != 0) {
            ygVar.g(2);
        }
        ygVar.g(1);
        b(ygVar);
        String a10 = df.a(ygVar.w());
        if (!MimeTypes.AUDIO_MPEG.equals(a10) && !MimeTypes.AUDIO_DTS.equals(a10) && !MimeTypes.AUDIO_DTS_HD.equals(a10)) {
            ygVar.g(12);
            ygVar.g(1);
            int b3 = b(ygVar);
            byte[] bArr = new byte[b3];
            ygVar.a(bArr, 0, b3);
            return Pair.create(a10, bArr);
        }
        return Pair.create(a10, null);
    }

    private static void a(yg ygVar, int i10, int i11, int i12, c cVar) {
        ygVar.f(i11 + 16);
        if (i10 == 1835365492) {
            ygVar.t();
            String t5 = ygVar.t();
            if (t5 != null) {
                cVar.f5423b = new d9.b().h(i12).f(t5).a();
            }
        }
    }

    private static no a(yg ygVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            ygVar.f(i14);
            int j3 = ygVar.j();
            if (ygVar.j() == 1952804451) {
                int c10 = i1.c(ygVar.j());
                ygVar.g(1);
                if (c10 == 0) {
                    ygVar.g(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int w10 = ygVar.w();
                    i12 = w10 & 15;
                    i13 = (w10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z10 = ygVar.w() == 1;
                int w11 = ygVar.w();
                byte[] bArr2 = new byte[16];
                ygVar.a(bArr2, 0, 16);
                if (z10 && w11 == 0) {
                    int w12 = ygVar.w();
                    bArr = new byte[w12];
                    ygVar.a(bArr, 0, w12);
                }
                return new no(z10, str, w11, bArr2, i13, i12, bArr);
            }
            i14 += j3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x040e A[EDGE_INSN: B:96:0x040e->B:97:0x040e BREAK  A[LOOP:2: B:76:0x03aa->B:92:0x0403], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x041d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.so a(com.applovin.impl.mo r36, com.applovin.impl.i1.a r37, com.applovin.impl.x9 r38) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j1.a(com.applovin.impl.mo, com.applovin.impl.i1$a, com.applovin.impl.x9):com.applovin.impl.so");
    }

    private static c a(yg ygVar, int i10, int i11, String str, w6 w6Var, boolean z10) {
        int i12;
        ygVar.f(12);
        int j3 = ygVar.j();
        c cVar = new c(j3);
        for (int i13 = 0; i13 < j3; i13++) {
            int d10 = ygVar.d();
            int j10 = ygVar.j();
            l8.a(j10 > 0, "childAtomSize must be positive");
            int j11 = ygVar.j();
            if (j11 == 1635148593 || j11 == 1635148595 || j11 == 1701733238 || j11 == 1831958048 || j11 == 1836070006 || j11 == 1752589105 || j11 == 1751479857 || j11 == 1932670515 || j11 == 1211250227 || j11 == 1987063864 || j11 == 1987063865 || j11 == 1635135537 || j11 == 1685479798 || j11 == 1685479729 || j11 == 1685481573 || j11 == 1685481521) {
                i12 = d10;
                a(ygVar, j11, i12, j10, i10, i11, w6Var, cVar, i13);
            } else if (j11 == 1836069985 || j11 == 1701733217 || j11 == 1633889587 || j11 == 1700998451 || j11 == 1633889588 || j11 == 1685353315 || j11 == 1685353317 || j11 == 1685353320 || j11 == 1685353324 || j11 == 1685353336 || j11 == 1935764850 || j11 == 1935767394 || j11 == 1819304813 || j11 == 1936684916 || j11 == 1953984371 || j11 == 778924082 || j11 == 778924083 || j11 == 1835557169 || j11 == 1835560241 || j11 == 1634492771 || j11 == 1634492791 || j11 == 1970037111 || j11 == 1332770163 || j11 == 1716281667) {
                i12 = d10;
                a(ygVar, j11, d10, j10, i10, str, z10, w6Var, cVar, i13);
            } else {
                if (j11 == 1414810956 || j11 == 1954034535 || j11 == 2004251764 || j11 == 1937010800 || j11 == 1664495672) {
                    a(ygVar, j11, d10, j10, i10, str, cVar);
                } else if (j11 == 1835365492) {
                    a(ygVar, j11, d10, i10, cVar);
                } else if (j11 == 1667329389) {
                    cVar.f5423b = new d9.b().h(i10).f(MimeTypes.APPLICATION_CAMERA_MOTION).a();
                }
                i12 = d10;
            }
            ygVar.f(i12 + j10);
        }
        return cVar;
    }

    private static void a(yg ygVar, int i10, int i11, int i12, int i13, String str, c cVar) {
        ygVar.f(i11 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ab abVar = null;
        long j3 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                ygVar.a(bArr, 0, i14);
                abVar = ab.a(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i10 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i10 == 1937010800) {
                j3 = 0;
            } else if (i10 == 1664495672) {
                cVar.f5425d = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f5423b = new d9.b().h(i13).f(str2).e(str).a(j3).a(abVar).a();
    }

    private static mo a(i1.a aVar, i1.b bVar, long j3, w6 w6Var, boolean z10, boolean z11) {
        i1.b bVar2;
        long j10;
        long[] jArr;
        long[] jArr2;
        i1.a d10;
        Pair a10;
        i1.a aVar2 = (i1.a) a1.a(aVar.d(1835297121));
        int a11 = a(c(((i1.b) a1.a(aVar2.e(1751411826))).f5238b));
        if (a11 == -1) {
            return null;
        }
        f f10 = f(((i1.b) a1.a(aVar.e(1953196132))).f5238b);
        long j11 = C.TIME_UNSET;
        if (j3 == C.TIME_UNSET) {
            bVar2 = bVar;
            j10 = f10.f5432b;
        } else {
            bVar2 = bVar;
            j10 = j3;
        }
        long e2 = e(bVar2.f5238b);
        if (j10 != C.TIME_UNSET) {
            j11 = yp.c(j10, 1000000L, e2);
        }
        long j12 = j11;
        i1.a aVar3 = (i1.a) a1.a(((i1.a) a1.a(aVar2.d(1835626086))).d(1937007212));
        Pair d11 = d(((i1.b) a1.a(aVar2.e(1835296868))).f5238b);
        c a12 = a(((i1.b) a1.a(aVar3.e(1937011556))).f5238b, f10.a, f10.f5433c, (String) d11.second, w6Var, z11);
        if (z10 || (d10 = aVar.d(1701082227)) == null || (a10 = a(d10)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) a10.first;
            jArr2 = (long[]) a10.second;
            jArr = jArr3;
        }
        if (a12.f5423b == null) {
            return null;
        }
        return new mo(f10.a, a11, ((Long) d11.first).longValue(), e2, j12, a12.f5423b, a12.f5425d, a12.a, a12.f5424c, jArr, jArr2);
    }

    public static Pair a(i1.b bVar) {
        yg ygVar = bVar.f5238b;
        ygVar.f(8);
        we weVar = null;
        we weVar2 = null;
        while (ygVar.a() >= 8) {
            int d10 = ygVar.d();
            int j3 = ygVar.j();
            int j10 = ygVar.j();
            if (j10 == 1835365473) {
                ygVar.f(d10);
                weVar = e(ygVar, d10 + j3);
            } else if (j10 == 1936553057) {
                ygVar.f(d10);
                weVar2 = d(ygVar, d10 + j3);
            }
            ygVar.f(d10 + j3);
        }
        return Pair.create(weVar, weVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018e, code lost:
    
        if (r1 != 3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.applovin.impl.yg r20, int r21, int r22, int r23, int r24, int r25, com.applovin.impl.w6 r26, com.applovin.impl.j1.c r27, int r28) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j1.a(com.applovin.impl.yg, int, int, int, int, int, com.applovin.impl.w6, com.applovin.impl.j1$c, int):void");
    }

    public static List a(i1.a aVar, x9 x9Var, long j3, w6 w6Var, boolean z10, boolean z11, Function function) {
        mo moVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar.f5237d.size(); i10++) {
            i1.a aVar2 = (i1.a) aVar.f5237d.get(i10);
            if (aVar2.a == 1953653099 && (moVar = (mo) function.apply(a(aVar2, (i1.b) a1.a(aVar.e(1836476516)), j3, w6Var, z10, z11))) != null) {
                arrayList.add(a(moVar, (i1.a) a1.a(((i1.a) a1.a(((i1.a) a1.a(aVar2.d(1835297121))).d(1835626086))).d(1937007212)), x9Var));
            }
        }
        return arrayList;
    }
}
