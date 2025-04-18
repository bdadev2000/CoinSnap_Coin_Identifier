package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.d9;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class mr implements i8 {

    /* renamed from: f */
    public static final m8 f6293f = new ht(11);
    private k8 a;

    /* renamed from: b */
    private ro f6294b;

    /* renamed from: c */
    private b f6295c;

    /* renamed from: d */
    private int f6296d = -1;

    /* renamed from: e */
    private long f6297e = -1;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: m */
        private static final int[] f6298m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f6299n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final k8 a;

        /* renamed from: b */
        private final ro f6300b;

        /* renamed from: c */
        private final nr f6301c;

        /* renamed from: d */
        private final int f6302d;

        /* renamed from: e */
        private final byte[] f6303e;

        /* renamed from: f */
        private final yg f6304f;

        /* renamed from: g */
        private final int f6305g;

        /* renamed from: h */
        private final d9 f6306h;

        /* renamed from: i */
        private int f6307i;

        /* renamed from: j */
        private long f6308j;

        /* renamed from: k */
        private int f6309k;

        /* renamed from: l */
        private long f6310l;

        public a(k8 k8Var, ro roVar, nr nrVar) {
            this.a = k8Var;
            this.f6300b = roVar;
            this.f6301c = nrVar;
            int max = Math.max(1, nrVar.f6430c / 10);
            this.f6305g = max;
            yg ygVar = new yg(nrVar.f6434g);
            ygVar.r();
            int r6 = ygVar.r();
            this.f6302d = r6;
            int i10 = nrVar.f6429b;
            int i11 = (((nrVar.f6432e - (i10 * 4)) * 8) / (nrVar.f6433f * i10)) + 1;
            if (r6 == i11) {
                int a = yp.a(max, r6);
                this.f6303e = new byte[nrVar.f6432e * a];
                this.f6304f = new yg(a * a(r6, i10));
                int i12 = ((nrVar.f6430c * nrVar.f6432e) * 8) / r6;
                this.f6306h = new d9.b().f(MimeTypes.AUDIO_RAW).b(i12).k(i12).i(a(max, i10)).c(nrVar.f6429b).n(nrVar.f6430c).j(2).a();
                return;
            }
            throw ah.a("Expected frames per block: " + i11 + "; got: " + r6, null);
        }

        private static int a(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private int b(int i10) {
            return a(i10, this.f6301c.f6429b);
        }

        private void c(int i10) {
            long c10 = this.f6308j + yp.c(this.f6310l, 1000000L, this.f6301c.f6430c);
            int b3 = b(i10);
            this.f6300b.a(c10, 1, b3, this.f6309k - b3, null);
            this.f6310l += i10;
            this.f6309k -= b3;
        }

        private void a(byte[] bArr, int i10, yg ygVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f6301c.f6429b; i12++) {
                    a(bArr, i11, i12, ygVar.c());
                }
            }
            int b3 = b(this.f6302d * i10);
            ygVar.f(0);
            ygVar.e(b3);
        }

        private void a(byte[] bArr, int i10, int i11, byte[] bArr2) {
            nr nrVar = this.f6301c;
            int i12 = nrVar.f6432e;
            int i13 = nrVar.f6429b;
            int i14 = (i11 * 4) + (i10 * i12);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i14] & UByte.MAX_VALUE));
            int min = Math.min(bArr[i14 + 2] & UByte.MAX_VALUE, 88);
            int i18 = f6299n[min];
            int i19 = ((i10 * this.f6302d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                byte b3 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)];
                int i21 = i20 % 2 == 0 ? b3 & Ascii.SI : (b3 & UByte.MAX_VALUE) >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i18) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                i17 = yp.a(i17 + i22, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i23 = min + f6298m[i21];
                int[] iArr = f6299n;
                min = yp.a(i23, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        @Override // com.applovin.impl.mr.b
        public void a(int i10, long j3) {
            this.a.a(new pr(this.f6301c, this.f6302d, i10, j3));
            this.f6300b.a(this.f6306h);
        }

        private int a(int i10) {
            return i10 / (this.f6301c.f6429b * 2);
        }

        @Override // com.applovin.impl.mr.b
        public void a(long j3) {
            this.f6307i = 0;
            this.f6308j = j3;
            this.f6309k = 0;
            this.f6310l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:4:0x0037). Please report as a decompilation issue!!! */
        @Override // com.applovin.impl.mr.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(com.applovin.impl.j8 r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f6305g
                int r1 = r6.f6309k
                int r1 = r6.a(r1)
                int r0 = r0 - r1
                int r1 = r6.f6302d
                int r0 = com.applovin.impl.yp.a(r0, r1)
                com.applovin.impl.nr r1 = r6.f6301c
                int r1 = r1.f6432e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r1 != 0) goto L1c
                r2 = r6
                goto L37
            L1c:
                r1 = 0
                r2 = r6
            L1e:
                if (r1 != 0) goto L3f
                int r3 = r2.f6307i
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r2.f6303e
                int r5 = r2.f6307i
                int r3 = r7.a(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L39
            L37:
                r1 = 1
                goto L1e
            L39:
                int r4 = r2.f6307i
                int r4 = r4 + r3
                r2.f6307i = r4
                goto L1e
            L3f:
                int r7 = r2.f6307i
                com.applovin.impl.nr r8 = r2.f6301c
                int r8 = r8.f6432e
                int r7 = r7 / r8
                if (r7 <= 0) goto L76
                byte[] r8 = r2.f6303e
                com.applovin.impl.yg r9 = r2.f6304f
                r2.a(r8, r7, r9)
                int r8 = r2.f6307i
                com.applovin.impl.nr r9 = r2.f6301c
                int r9 = r9.f6432e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r2.f6307i = r8
                com.applovin.impl.yg r7 = r2.f6304f
                int r7 = r7.e()
                com.applovin.impl.ro r8 = r2.f6300b
                com.applovin.impl.yg r9 = r2.f6304f
                r8.a(r9, r7)
                int r8 = r2.f6309k
                int r8 = r8 + r7
                r2.f6309k = r8
                int r7 = r2.a(r8)
                int r8 = r2.f6305g
                if (r7 < r8) goto L76
                r2.c(r8)
            L76:
                if (r1 == 0) goto L83
                int r7 = r2.f6309k
                int r7 = r2.a(r7)
                if (r7 <= 0) goto L83
                r2.c(r7)
            L83:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mr.a.a(com.applovin.impl.j8, long):boolean");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, long j3);

        void a(long j3);

        boolean a(j8 j8Var, long j3);
    }

    private void b() {
        a1.b(this.f6294b);
        yp.a(this.a);
    }

    public static /* synthetic */ i8[] c() {
        return new i8[]{new mr()};
    }

    public static /* synthetic */ i8[] d() {
        return c();
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {
        private final k8 a;

        /* renamed from: b */
        private final ro f6311b;

        /* renamed from: c */
        private final nr f6312c;

        /* renamed from: d */
        private final d9 f6313d;

        /* renamed from: e */
        private final int f6314e;

        /* renamed from: f */
        private long f6315f;

        /* renamed from: g */
        private int f6316g;

        /* renamed from: h */
        private long f6317h;

        public c(k8 k8Var, ro roVar, nr nrVar, String str, int i10) {
            this.a = k8Var;
            this.f6311b = roVar;
            this.f6312c = nrVar;
            int i11 = (nrVar.f6429b * nrVar.f6433f) / 8;
            if (nrVar.f6432e == i11) {
                int i12 = nrVar.f6430c * i11;
                int i13 = i12 * 8;
                int max = Math.max(i11, i12 / 10);
                this.f6314e = max;
                this.f6313d = new d9.b().f(str).b(i13).k(i13).i(max).c(nrVar.f6429b).n(nrVar.f6430c).j(i10).a();
                return;
            }
            StringBuilder m10 = a4.j.m("Expected block size: ", i11, "; got: ");
            m10.append(nrVar.f6432e);
            throw ah.a(m10.toString(), null);
        }

        @Override // com.applovin.impl.mr.b
        public void a(int i10, long j3) {
            this.a.a(new pr(this.f6312c, 1, i10, j3));
            this.f6311b.a(this.f6313d);
        }

        @Override // com.applovin.impl.mr.b
        public void a(long j3) {
            this.f6315f = j3;
            this.f6316g = 0;
            this.f6317h = 0L;
        }

        @Override // com.applovin.impl.mr.b
        public boolean a(j8 j8Var, long j3) {
            int i10;
            int i11;
            long j10 = j3;
            while (j10 > 0 && (i10 = this.f6316g) < (i11 = this.f6314e)) {
                int a = this.f6311b.a((e5) j8Var, (int) Math.min(i11 - i10, j10), true);
                if (a == -1) {
                    j10 = 0;
                } else {
                    this.f6316g += a;
                    j10 -= a;
                }
            }
            int i12 = this.f6312c.f6432e;
            int i13 = this.f6316g / i12;
            if (i13 > 0) {
                long c10 = this.f6315f + yp.c(this.f6317h, 1000000L, r1.f6430c);
                int i14 = i13 * i12;
                int i15 = this.f6316g - i14;
                this.f6311b.a(c10, 1, i14, i15, null);
                this.f6317h += i13;
                this.f6316g = i15;
            }
            return j10 <= 0;
        }
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.a = k8Var;
        this.f6294b = k8Var.a(0, 1);
        k8Var.c();
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        b();
        if (this.f6295c == null) {
            nr a10 = or.a(j8Var);
            if (a10 != null) {
                int i10 = a10.a;
                if (i10 == 17) {
                    this.f6295c = new a(this.a, this.f6294b, a10);
                } else if (i10 == 6) {
                    this.f6295c = new c(this.a, this.f6294b, a10, MimeTypes.AUDIO_ALAW, -1);
                } else if (i10 == 7) {
                    this.f6295c = new c(this.a, this.f6294b, a10, MimeTypes.AUDIO_MLAW, -1);
                } else {
                    int a11 = qr.a(i10, a10.f6433f);
                    if (a11 != 0) {
                        this.f6295c = new c(this.a, this.f6294b, a10, MimeTypes.AUDIO_RAW, a11);
                    } else {
                        throw ah.a("Unsupported WAV format type: " + a10.a);
                    }
                }
            } else {
                throw ah.a("Unsupported or unrecognized wav header.", null);
            }
        }
        if (this.f6296d == -1) {
            Pair b3 = or.b(j8Var);
            this.f6296d = ((Long) b3.first).intValue();
            long longValue = ((Long) b3.second).longValue();
            this.f6297e = longValue;
            this.f6295c.a(this.f6296d, longValue);
        } else if (j8Var.f() == 0) {
            j8Var.a(this.f6296d);
        }
        a1.b(this.f6297e != -1);
        return this.f6295c.a(j8Var, this.f6297e - j8Var.f()) ? -1 : 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        b bVar = this.f6295c;
        if (bVar != null) {
            bVar.a(j10);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return or.a(j8Var) != null;
    }
}
