package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.AbstractC0708i1;
import com.applovin.impl.d9;
import com.applovin.impl.we;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0712j1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8369a = yp.c("OpusHead");

    /* renamed from: com.applovin.impl.j1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8370a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f8371c;

        /* renamed from: d, reason: collision with root package name */
        public long f8372d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f8373e;

        /* renamed from: f, reason: collision with root package name */
        private final yg f8374f;

        /* renamed from: g, reason: collision with root package name */
        private final yg f8375g;

        /* renamed from: h, reason: collision with root package name */
        private int f8376h;

        /* renamed from: i, reason: collision with root package name */
        private int f8377i;

        public a(yg ygVar, yg ygVar2, boolean z8) {
            this.f8375g = ygVar;
            this.f8374f = ygVar2;
            this.f8373e = z8;
            ygVar2.f(12);
            this.f8370a = ygVar2.A();
            ygVar.f(12);
            this.f8377i = ygVar.A();
            l8.a(ygVar.j() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            long y4;
            int i9;
            int i10 = this.b + 1;
            this.b = i10;
            if (i10 == this.f8370a) {
                return false;
            }
            if (this.f8373e) {
                y4 = this.f8374f.B();
            } else {
                y4 = this.f8374f.y();
            }
            this.f8372d = y4;
            if (this.b == this.f8376h) {
                this.f8371c = this.f8375g.A();
                this.f8375g.g(4);
                int i11 = this.f8377i - 1;
                this.f8377i = i11;
                if (i11 > 0) {
                    i9 = this.f8375g.A() - 1;
                } else {
                    i9 = -1;
                }
                this.f8376h = i9;
            }
            return true;
        }
    }

    /* renamed from: com.applovin.impl.j1$b */
    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b();

        int c();
    }

    /* renamed from: com.applovin.impl.j1$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final no[] f8378a;
        public d9 b;

        /* renamed from: c, reason: collision with root package name */
        public int f8379c;

        /* renamed from: d, reason: collision with root package name */
        public int f8380d = 0;

        public c(int i9) {
            this.f8378a = new no[i9];
        }
    }

    /* renamed from: com.applovin.impl.j1$d */
    /* loaded from: classes.dex */
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final int f8381a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final yg f8382c;

        public d(AbstractC0708i1.b bVar, d9 d9Var) {
            yg ygVar = bVar.b;
            this.f8382c = ygVar;
            ygVar.f(12);
            int A8 = ygVar.A();
            if (MimeTypes.AUDIO_RAW.equals(d9Var.m)) {
                int b = yp.b(d9Var.f7196B, d9Var.f7223z);
                if (A8 == 0 || A8 % b != 0) {
                    kc.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + b + ", stsz sample size: " + A8);
                    A8 = b;
                }
            }
            this.f8381a = A8 == 0 ? -1 : A8;
            this.b = ygVar.A();
        }

        @Override // com.applovin.impl.AbstractC0712j1.b
        public int a() {
            return this.f8381a;
        }

        @Override // com.applovin.impl.AbstractC0712j1.b
        public int b() {
            return this.b;
        }

        @Override // com.applovin.impl.AbstractC0712j1.b
        public int c() {
            int i9 = this.f8381a;
            if (i9 == -1) {
                return this.f8382c.A();
            }
            return i9;
        }
    }

    /* renamed from: com.applovin.impl.j1$e */
    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final yg f8383a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8384c;

        /* renamed from: d, reason: collision with root package name */
        private int f8385d;

        /* renamed from: e, reason: collision with root package name */
        private int f8386e;

        public e(AbstractC0708i1.b bVar) {
            yg ygVar = bVar.b;
            this.f8383a = ygVar;
            ygVar.f(12);
            this.f8384c = ygVar.A() & 255;
            this.b = ygVar.A();
        }

        @Override // com.applovin.impl.AbstractC0712j1.b
        public int a() {
            return -1;
        }

        @Override // com.applovin.impl.AbstractC0712j1.b
        public int b() {
            return this.b;
        }

        @Override // com.applovin.impl.AbstractC0712j1.b
        public int c() {
            int i9 = this.f8384c;
            if (i9 == 8) {
                return this.f8383a.w();
            }
            if (i9 == 16) {
                return this.f8383a.C();
            }
            int i10 = this.f8385d;
            this.f8385d = i10 + 1;
            if (i10 % 2 == 0) {
                int w2 = this.f8383a.w();
                this.f8386e = w2;
                return (w2 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.f8386e & 15;
        }
    }

    /* renamed from: com.applovin.impl.j1$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f8387a;
        private final long b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8388c;

        public f(int i9, long j7, int i10) {
            this.f8387a = i9;
            this.b = j7;
            this.f8388c = i10;
        }
    }

    private static int a(int i9) {
        if (i9 == 1936684398) {
            return 1;
        }
        if (i9 == 1986618469) {
            return 2;
        }
        if (i9 == 1952807028 || i9 == 1935832172 || i9 == 1937072756 || i9 == 1668047728) {
            return 3;
        }
        return i9 == 1835365473 ? 5 : -1;
    }

    public static Pair b(yg ygVar, int i9, int i10) {
        int i11 = i9 + 8;
        int i12 = -1;
        int i13 = 0;
        String str = null;
        Integer num = null;
        while (i11 - i9 < i10) {
            ygVar.f(i11);
            int j7 = ygVar.j();
            int j9 = ygVar.j();
            if (j9 == 1718775137) {
                num = Integer.valueOf(ygVar.j());
            } else if (j9 == 1935894637) {
                ygVar.g(4);
                str = ygVar.c(4);
            } else if (j9 == 1935894633) {
                i12 = i11;
                i13 = j7;
            }
            i11 += j7;
        }
        if (!com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc.equals(str) && !com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbc1.equals(str) && !com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cens.equals(str) && !com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        l8.a(num != null, "frma atom is mandatory");
        l8.a(i12 != -1, "schi atom is mandatory");
        no a6 = a(ygVar, i12, i13, str);
        l8.a(a6 != null, "tenc atom is mandatory");
        return Pair.create(num, (no) yp.a(a6));
    }

    private static int c(yg ygVar) {
        ygVar.f(16);
        return ygVar.j();
    }

    private static Pair d(yg ygVar) {
        ygVar.f(8);
        int c9 = AbstractC0708i1.c(ygVar.j());
        ygVar.g(c9 == 0 ? 8 : 16);
        long y4 = ygVar.y();
        ygVar.g(c9 == 0 ? 4 : 8);
        int C8 = ygVar.C();
        return Pair.create(Long.valueOf(y4), "" + ((char) (((C8 >> 10) & 31) + 96)) + ((char) (((C8 >> 5) & 31) + 96)) + ((char) ((C8 & 31) + 96)));
    }

    private static long e(yg ygVar) {
        ygVar.f(8);
        ygVar.g(AbstractC0708i1.c(ygVar.j()) != 0 ? 16 : 8);
        return ygVar.y();
    }

    private static f f(yg ygVar) {
        int i9;
        long j7;
        long B5;
        int i10 = 8;
        ygVar.f(8);
        int c9 = AbstractC0708i1.c(ygVar.j());
        if (c9 == 0) {
            i9 = 8;
        } else {
            i9 = 16;
        }
        ygVar.g(i9);
        int j9 = ygVar.j();
        ygVar.g(4);
        int d2 = ygVar.d();
        if (c9 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            if (i12 < i10) {
                if (ygVar.c()[d2 + i12] != -1) {
                    if (c9 == 0) {
                        B5 = ygVar.y();
                    } else {
                        B5 = ygVar.B();
                    }
                    if (B5 != 0) {
                        j7 = B5;
                    }
                } else {
                    i12++;
                }
            } else {
                ygVar.g(i10);
                break;
            }
        }
        ygVar.g(16);
        int j10 = ygVar.j();
        int j11 = ygVar.j();
        ygVar.g(4);
        int j12 = ygVar.j();
        int j13 = ygVar.j();
        if (j10 == 0 && j11 == 65536 && j12 == -65536 && j13 == 0) {
            i11 = 90;
        } else if (j10 == 0 && j11 == -65536 && j12 == 65536 && j13 == 0) {
            i11 = 270;
        } else if (j10 == -65536 && j11 == 0 && j12 == 0 && j13 == -65536) {
            i11 = 180;
        }
        return new f(j9, j7, i11);
    }

    private static boolean a(long[] jArr, long j7, long j9, long j10) {
        int length = jArr.length - 1;
        return jArr[0] <= j9 && j9 < jArr[yp.a(4, 0, length)] && jArr[yp.a(jArr.length - 4, 0, length)] < j10 && j10 <= j7;
    }

    private static float c(yg ygVar, int i9) {
        ygVar.f(i9 + 8);
        return ygVar.A() / ygVar.A();
    }

    private static byte[] c(yg ygVar, int i9, int i10) {
        int i11 = i9 + 8;
        while (i11 - i9 < i10) {
            ygVar.f(i11);
            int j7 = ygVar.j();
            if (ygVar.j() == 1886547818) {
                return Arrays.copyOfRange(ygVar.c(), i11, j7 + i11);
            }
            i11 += j7;
        }
        return null;
    }

    private static we e(yg ygVar, int i9) {
        ygVar.g(8);
        a(ygVar);
        while (ygVar.d() < i9) {
            int d2 = ygVar.d();
            int j7 = ygVar.j();
            if (ygVar.j() == 1768715124) {
                ygVar.f(d2);
                return b(ygVar, d2 + j7);
            }
            ygVar.f(d2 + j7);
        }
        return null;
    }

    private static int a(yg ygVar, int i9, int i10) {
        int d2 = ygVar.d();
        while (d2 - i9 < i10) {
            ygVar.f(d2);
            int j7 = ygVar.j();
            l8.a(j7 > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1702061171) {
                return d2;
            }
            d2 += j7;
        }
        return -1;
    }

    private static Pair d(yg ygVar, int i9, int i10) {
        Pair b8;
        int d2 = ygVar.d();
        while (d2 - i9 < i10) {
            ygVar.f(d2);
            int j7 = ygVar.j();
            l8.a(j7 > 0, "childAtomSize must be positive");
            if (ygVar.j() == 1936289382 && (b8 = b(ygVar, d2, j7)) != null) {
                return b8;
            }
            d2 += j7;
        }
        return null;
    }

    public static void a(yg ygVar) {
        int d2 = ygVar.d();
        ygVar.g(4);
        if (ygVar.j() != 1751411826) {
            d2 += 4;
        }
        ygVar.f(d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.applovin.impl.yg r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.impl.w6 r27, com.applovin.impl.AbstractC0712j1.c r28, int r29) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC0712j1.a(com.applovin.impl.yg, int, int, int, int, java.lang.String, boolean, com.applovin.impl.w6, com.applovin.impl.j1$c, int):void");
    }

    private static int b(yg ygVar) {
        int w2 = ygVar.w();
        int i9 = w2 & 127;
        while ((w2 & 128) == 128) {
            w2 = ygVar.w();
            i9 = (i9 << 7) | (w2 & 127);
        }
        return i9;
    }

    private static we d(yg ygVar, int i9) {
        ygVar.g(12);
        while (ygVar.d() < i9) {
            int d2 = ygVar.d();
            int j7 = ygVar.j();
            if (ygVar.j() == 1935766900) {
                if (j7 < 14) {
                    return null;
                }
                ygVar.g(5);
                int w2 = ygVar.w();
                if (w2 != 12 && w2 != 13) {
                    return null;
                }
                float f9 = w2 == 12 ? 240.0f : 120.0f;
                ygVar.g(1);
                return new we(new hk(f9, ygVar.w()));
            }
            ygVar.f(d2 + j7);
        }
        return null;
    }

    private static we b(yg ygVar, int i9) {
        ygVar.g(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar.d() < i9) {
            we.b b8 = cf.b(ygVar);
            if (b8 != null) {
                arrayList.add(b8);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    public static we b(AbstractC0708i1.a aVar) {
        AbstractC0708i1.b e4 = aVar.e(1751411826);
        AbstractC0708i1.b e9 = aVar.e(1801812339);
        AbstractC0708i1.b e10 = aVar.e(1768715124);
        if (e4 == null || e9 == null || e10 == null || c(e4.b) != 1835299937) {
            return null;
        }
        yg ygVar = e9.b;
        ygVar.f(12);
        int j7 = ygVar.j();
        String[] strArr = new String[j7];
        for (int i9 = 0; i9 < j7; i9++) {
            int j9 = ygVar.j();
            ygVar.g(4);
            strArr[i9] = ygVar.c(j9 - 8);
        }
        yg ygVar2 = e10.b;
        ygVar2.f(8);
        ArrayList arrayList = new ArrayList();
        while (ygVar2.a() > 8) {
            int d2 = ygVar2.d();
            int j10 = ygVar2.j();
            int j11 = ygVar2.j() - 1;
            if (j11 >= 0 && j11 < j7) {
                ad a6 = cf.a(ygVar2, d2 + j10, strArr[j11]);
                if (a6 != null) {
                    arrayList.add(a6);
                }
            } else {
                L.p(j11, "Skipped metadata with unknown key index: ", "AtomParsers");
            }
            ygVar2.f(d2 + j10);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }

    private static Pair a(AbstractC0708i1.a aVar) {
        AbstractC0708i1.b e4 = aVar.e(1701606260);
        if (e4 == null) {
            return null;
        }
        yg ygVar = e4.b;
        ygVar.f(8);
        int c9 = AbstractC0708i1.c(ygVar.j());
        int A8 = ygVar.A();
        long[] jArr = new long[A8];
        long[] jArr2 = new long[A8];
        for (int i9 = 0; i9 < A8; i9++) {
            jArr[i9] = c9 == 1 ? ygVar.B() : ygVar.y();
            jArr2[i9] = c9 == 1 ? ygVar.s() : ygVar.j();
            if (ygVar.u() == 1) {
                ygVar.g(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair a(yg ygVar, int i9) {
        ygVar.f(i9 + 12);
        ygVar.g(1);
        b(ygVar);
        ygVar.g(2);
        int w2 = ygVar.w();
        if ((w2 & 128) != 0) {
            ygVar.g(2);
        }
        if ((w2 & 64) != 0) {
            ygVar.g(ygVar.C());
        }
        if ((w2 & 32) != 0) {
            ygVar.g(2);
        }
        ygVar.g(1);
        b(ygVar);
        String a6 = df.a(ygVar.w());
        if (!MimeTypes.AUDIO_MPEG.equals(a6) && !MimeTypes.AUDIO_DTS.equals(a6) && !MimeTypes.AUDIO_DTS_HD.equals(a6)) {
            ygVar.g(12);
            ygVar.g(1);
            int b8 = b(ygVar);
            byte[] bArr = new byte[b8];
            ygVar.a(bArr, 0, b8);
            return Pair.create(a6, bArr);
        }
        return Pair.create(a6, null);
    }

    private static void a(yg ygVar, int i9, int i10, int i11, c cVar) {
        ygVar.f(i10 + 16);
        if (i9 == 1835365492) {
            ygVar.t();
            String t9 = ygVar.t();
            if (t9 != null) {
                cVar.b = new d9.b().h(i11).f(t9).a();
            }
        }
    }

    private static no a(yg ygVar, int i9, int i10, String str) {
        int i11;
        int i12;
        int i13 = i9 + 8;
        while (true) {
            byte[] bArr = null;
            if (i13 - i9 >= i10) {
                return null;
            }
            ygVar.f(i13);
            int j7 = ygVar.j();
            if (ygVar.j() == 1952804451) {
                int c9 = AbstractC0708i1.c(ygVar.j());
                ygVar.g(1);
                if (c9 == 0) {
                    ygVar.g(1);
                    i12 = 0;
                    i11 = 0;
                } else {
                    int w2 = ygVar.w();
                    i11 = w2 & 15;
                    i12 = (w2 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z8 = ygVar.w() == 1;
                int w9 = ygVar.w();
                byte[] bArr2 = new byte[16];
                ygVar.a(bArr2, 0, 16);
                if (z8 && w9 == 0) {
                    int w10 = ygVar.w();
                    bArr = new byte[w10];
                    ygVar.a(bArr, 0, w10);
                }
                return new no(z8, str, w9, bArr2, i12, i11, bArr);
            }
            i13 += j7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0424 A[EDGE_INSN: B:97:0x0424->B:98:0x0424 BREAK  A[LOOP:2: B:76:0x03bd->B:92:0x041b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.so a(com.applovin.impl.mo r38, com.applovin.impl.AbstractC0708i1.a r39, com.applovin.impl.x9 r40) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC0712j1.a(com.applovin.impl.mo, com.applovin.impl.i1$a, com.applovin.impl.x9):com.applovin.impl.so");
    }

    private static c a(yg ygVar, int i9, int i10, String str, w6 w6Var, boolean z8) {
        int i11;
        ygVar.f(12);
        int j7 = ygVar.j();
        c cVar = new c(j7);
        for (int i12 = 0; i12 < j7; i12++) {
            int d2 = ygVar.d();
            int j9 = ygVar.j();
            l8.a(j9 > 0, "childAtomSize must be positive");
            int j10 = ygVar.j();
            if (j10 == 1635148593 || j10 == 1635148595 || j10 == 1701733238 || j10 == 1831958048 || j10 == 1836070006 || j10 == 1752589105 || j10 == 1751479857 || j10 == 1932670515 || j10 == 1211250227 || j10 == 1987063864 || j10 == 1987063865 || j10 == 1635135537 || j10 == 1685479798 || j10 == 1685479729 || j10 == 1685481573 || j10 == 1685481521) {
                i11 = d2;
                a(ygVar, j10, i11, j9, i9, i10, w6Var, cVar, i12);
            } else if (j10 == 1836069985 || j10 == 1701733217 || j10 == 1633889587 || j10 == 1700998451 || j10 == 1633889588 || j10 == 1685353315 || j10 == 1685353317 || j10 == 1685353320 || j10 == 1685353324 || j10 == 1685353336 || j10 == 1935764850 || j10 == 1935767394 || j10 == 1819304813 || j10 == 1936684916 || j10 == 1953984371 || j10 == 778924082 || j10 == 778924083 || j10 == 1835557169 || j10 == 1835560241 || j10 == 1634492771 || j10 == 1634492791 || j10 == 1970037111 || j10 == 1332770163 || j10 == 1716281667) {
                i11 = d2;
                a(ygVar, j10, d2, j9, i9, str, z8, w6Var, cVar, i12);
            } else {
                if (j10 == 1414810956 || j10 == 1954034535 || j10 == 2004251764 || j10 == 1937010800 || j10 == 1664495672) {
                    a(ygVar, j10, d2, j9, i9, str, cVar);
                } else if (j10 == 1835365492) {
                    a(ygVar, j10, d2, i9, cVar);
                } else if (j10 == 1667329389) {
                    cVar.b = new d9.b().h(i9).f(MimeTypes.APPLICATION_CAMERA_MOTION).a();
                }
                i11 = d2;
            }
            ygVar.f(i11 + j9);
        }
        return cVar;
    }

    private static void a(yg ygVar, int i9, int i10, int i11, int i12, String str, c cVar) {
        ygVar.f(i10 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ab abVar = null;
        long j7 = Long.MAX_VALUE;
        if (i9 != 1414810956) {
            if (i9 == 1954034535) {
                int i13 = i11 - 16;
                byte[] bArr = new byte[i13];
                ygVar.a(bArr, 0, i13);
                abVar = ab.a(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i9 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i9 == 1937010800) {
                j7 = 0;
            } else if (i9 == 1664495672) {
                cVar.f8380d = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.b = new d9.b().h(i12).f(str2).e(str).a(j7).a(abVar).a();
    }

    private static mo a(AbstractC0708i1.a aVar, AbstractC0708i1.b bVar, long j7, w6 w6Var, boolean z8, boolean z9) {
        AbstractC0708i1.b bVar2;
        long j9;
        long[] jArr;
        long[] jArr2;
        AbstractC0708i1.a d2;
        Pair a6;
        AbstractC0708i1.a aVar2 = (AbstractC0708i1.a) AbstractC0669a1.a(aVar.d(1835297121));
        int a9 = a(c(((AbstractC0708i1.b) AbstractC0669a1.a(aVar2.e(1751411826))).b));
        if (a9 == -1) {
            return null;
        }
        f f9 = f(((AbstractC0708i1.b) AbstractC0669a1.a(aVar.e(1953196132))).b);
        long j10 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bVar2 = bVar;
            j9 = f9.b;
        } else {
            bVar2 = bVar;
            j9 = j7;
        }
        long e4 = e(bVar2.b);
        if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j10 = yp.c(j9, 1000000L, e4);
        }
        long j11 = j10;
        AbstractC0708i1.a aVar3 = (AbstractC0708i1.a) AbstractC0669a1.a(((AbstractC0708i1.a) AbstractC0669a1.a(aVar2.d(1835626086))).d(1937007212));
        Pair d9 = d(((AbstractC0708i1.b) AbstractC0669a1.a(aVar2.e(1835296868))).b);
        c a10 = a(((AbstractC0708i1.b) AbstractC0669a1.a(aVar3.e(1937011556))).b, f9.f8387a, f9.f8388c, (String) d9.second, w6Var, z9);
        if (z8 || (d2 = aVar.d(1701082227)) == null || (a6 = a(d2)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) a6.first;
            jArr2 = (long[]) a6.second;
            jArr = jArr3;
        }
        if (a10.b == null) {
            return null;
        }
        return new mo(f9.f8387a, a9, ((Long) d9.first).longValue(), e4, j11, a10.b, a10.f8380d, a10.f8378a, a10.f8379c, jArr, jArr2);
    }

    public static Pair a(AbstractC0708i1.b bVar) {
        yg ygVar = bVar.b;
        ygVar.f(8);
        we weVar = null;
        we weVar2 = null;
        while (ygVar.a() >= 8) {
            int d2 = ygVar.d();
            int j7 = ygVar.j();
            int j9 = ygVar.j();
            if (j9 == 1835365473) {
                ygVar.f(d2);
                weVar = e(ygVar, d2 + j7);
            } else if (j9 == 1936553057) {
                ygVar.f(d2);
                weVar2 = d(ygVar, d2 + j7);
            }
            ygVar.f(d2 + j7);
        }
        return Pair.create(weVar, weVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0190, code lost:
    
        if (r1 != 3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.applovin.impl.yg r20, int r21, int r22, int r23, int r24, int r25, com.applovin.impl.w6 r26, com.applovin.impl.AbstractC0712j1.c r27, int r28) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC0712j1.a(com.applovin.impl.yg, int, int, int, int, int, com.applovin.impl.w6, com.applovin.impl.j1$c, int):void");
    }

    public static List a(AbstractC0708i1.a aVar, x9 x9Var, long j7, w6 w6Var, boolean z8, boolean z9, Function function) {
        mo moVar;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < aVar.f8202d.size(); i9++) {
            AbstractC0708i1.a aVar2 = (AbstractC0708i1.a) aVar.f8202d.get(i9);
            if (aVar2.f8200a == 1953653099 && (moVar = (mo) function.apply(a(aVar2, (AbstractC0708i1.b) AbstractC0669a1.a(aVar.e(1836476516)), j7, w6Var, z8, z9))) != null) {
                arrayList.add(a(moVar, (AbstractC0708i1.a) AbstractC0669a1.a(((AbstractC0708i1.a) AbstractC0669a1.a(((AbstractC0708i1.a) AbstractC0669a1.a(aVar2.d(1835297121))).d(1835626086))).d(1937007212)), x9Var));
            }
        }
        return arrayList;
    }
}
