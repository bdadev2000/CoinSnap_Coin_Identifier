package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.d9;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class mr implements i8 {

    /* renamed from: f */
    public static final m8 f9230f = new A0(11);

    /* renamed from: a */
    private k8 f9231a;
    private ro b;

    /* renamed from: c */
    private b f9232c;

    /* renamed from: d */
    private int f9233d = -1;

    /* renamed from: e */
    private long f9234e = -1;

    /* loaded from: classes.dex */
    public static final class a implements b {
        private static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f9235n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final k8 f9236a;
        private final ro b;

        /* renamed from: c */
        private final nr f9237c;

        /* renamed from: d */
        private final int f9238d;

        /* renamed from: e */
        private final byte[] f9239e;

        /* renamed from: f */
        private final yg f9240f;

        /* renamed from: g */
        private final int f9241g;

        /* renamed from: h */
        private final d9 f9242h;

        /* renamed from: i */
        private int f9243i;

        /* renamed from: j */
        private long f9244j;

        /* renamed from: k */
        private int f9245k;
        private long l;

        public a(k8 k8Var, ro roVar, nr nrVar) {
            this.f9236a = k8Var;
            this.b = roVar;
            this.f9237c = nrVar;
            int max = Math.max(1, nrVar.f9368c / 10);
            this.f9241g = max;
            yg ygVar = new yg(nrVar.f9372g);
            ygVar.r();
            int r9 = ygVar.r();
            this.f9238d = r9;
            int i9 = nrVar.b;
            int i10 = (((nrVar.f9370e - (i9 * 4)) * 8) / (nrVar.f9371f * i9)) + 1;
            if (r9 == i10) {
                int a6 = yp.a(max, r9);
                this.f9239e = new byte[nrVar.f9370e * a6];
                this.f9240f = new yg(a6 * a(r9, i9));
                int i11 = ((nrVar.f9368c * nrVar.f9370e) * 8) / r9;
                this.f9242h = new d9.b().f(MimeTypes.AUDIO_RAW).b(i11).k(i11).i(a(max, i9)).c(nrVar.b).n(nrVar.f9368c).j(2).a();
                return;
            }
            throw ah.a("Expected frames per block: " + i10 + "; got: " + r9, null);
        }

        private static int a(int i9, int i10) {
            return i9 * 2 * i10;
        }

        private int b(int i9) {
            return a(i9, this.f9237c.b);
        }

        private void c(int i9) {
            long c9 = this.f9244j + yp.c(this.l, 1000000L, this.f9237c.f9368c);
            int b = b(i9);
            this.b.a(c9, 1, b, this.f9245k - b, null);
            this.l += i9;
            this.f9245k -= b;
        }

        private void a(byte[] bArr, int i9, yg ygVar) {
            for (int i10 = 0; i10 < i9; i10++) {
                for (int i11 = 0; i11 < this.f9237c.b; i11++) {
                    a(bArr, i10, i11, ygVar.c());
                }
            }
            int b = b(this.f9238d * i9);
            ygVar.f(0);
            ygVar.e(b);
        }

        private void a(byte[] bArr, int i9, int i10, byte[] bArr2) {
            nr nrVar = this.f9237c;
            int i11 = nrVar.f9370e;
            int i12 = nrVar.b;
            int i13 = (i10 * 4) + (i9 * i11);
            int i14 = (i12 * 4) + i13;
            int i15 = (i11 / i12) - 4;
            int i16 = (short) (((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255));
            int min = Math.min(bArr[i13 + 2] & 255, 88);
            int i17 = f9235n[min];
            int i18 = ((i9 * this.f9238d * i12) + i10) * 2;
            bArr2[i18] = (byte) (i16 & 255);
            bArr2[i18 + 1] = (byte) (i16 >> 8);
            for (int i19 = 0; i19 < i15 * 2; i19++) {
                byte b = bArr[((i19 / 8) * i12 * 4) + i14 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b & Ascii.SI : (b & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                i16 = yp.a(i16 + i21, -32768, 32767);
                i18 += i12 * 2;
                bArr2[i18] = (byte) (i16 & 255);
                bArr2[i18 + 1] = (byte) (i16 >> 8);
                int i22 = min + m[i20];
                int[] iArr = f9235n;
                min = yp.a(i22, 0, iArr.length - 1);
                i17 = iArr[min];
            }
        }

        @Override // com.applovin.impl.mr.b
        public void a(int i9, long j7) {
            this.f9236a.a(new pr(this.f9237c, this.f9238d, i9, j7));
            this.b.a(this.f9242h);
        }

        private int a(int i9) {
            return i9 / (this.f9237c.b * 2);
        }

        @Override // com.applovin.impl.mr.b
        public void a(long j7) {
            this.f9243i = 0;
            this.f9244j = j7;
            this.f9245k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x001c, code lost:
        
            r1 = true;
         */
        @Override // com.applovin.impl.mr.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(com.applovin.impl.j8 r6, long r7) {
            /*
                r5 = this;
                int r0 = r5.f9241g
                int r1 = r5.f9245k
                int r1 = r5.a(r1)
                int r0 = r0 - r1
                int r1 = r5.f9238d
                int r0 = com.applovin.impl.yp.a(r0, r1)
                com.applovin.impl.nr r1 = r5.f9237c
                int r1 = r1.f9370e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 != 0) goto L1b
                goto L35
            L1b:
                r1 = 0
            L1c:
                if (r1 != 0) goto L3d
                int r2 = r5.f9243i
                if (r2 >= r0) goto L3d
                int r2 = r0 - r2
                long r2 = (long) r2
                long r2 = java.lang.Math.min(r2, r7)
                int r2 = (int) r2
                byte[] r3 = r5.f9239e
                int r4 = r5.f9243i
                int r2 = r6.a(r3, r4, r2)
                r3 = -1
                if (r2 != r3) goto L37
            L35:
                r1 = 1
                goto L1c
            L37:
                int r3 = r5.f9243i
                int r3 = r3 + r2
                r5.f9243i = r3
                goto L1c
            L3d:
                int r6 = r5.f9243i
                com.applovin.impl.nr r7 = r5.f9237c
                int r7 = r7.f9370e
                int r6 = r6 / r7
                if (r6 <= 0) goto L74
                byte[] r7 = r5.f9239e
                com.applovin.impl.yg r8 = r5.f9240f
                r5.a(r7, r6, r8)
                int r7 = r5.f9243i
                com.applovin.impl.nr r8 = r5.f9237c
                int r8 = r8.f9370e
                int r6 = r6 * r8
                int r7 = r7 - r6
                r5.f9243i = r7
                com.applovin.impl.yg r6 = r5.f9240f
                int r6 = r6.e()
                com.applovin.impl.ro r7 = r5.b
                com.applovin.impl.yg r8 = r5.f9240f
                r7.a(r8, r6)
                int r7 = r5.f9245k
                int r7 = r7 + r6
                r5.f9245k = r7
                int r6 = r5.a(r7)
                int r7 = r5.f9241g
                if (r6 < r7) goto L74
                r5.c(r7)
            L74:
                if (r1 == 0) goto L81
                int r6 = r5.f9245k
                int r6 = r5.a(r6)
                if (r6 <= 0) goto L81
                r5.c(r6)
            L81:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mr.a.a(com.applovin.impl.j8, long):boolean");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i9, long j7);

        void a(long j7);

        boolean a(j8 j8Var, long j7);
    }

    private void b() {
        AbstractC0669a1.b(this.b);
        yp.a(this.f9231a);
    }

    public static /* synthetic */ i8[] c() {
        return new i8[]{new mr()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final k8 f9246a;
        private final ro b;

        /* renamed from: c */
        private final nr f9247c;

        /* renamed from: d */
        private final d9 f9248d;

        /* renamed from: e */
        private final int f9249e;

        /* renamed from: f */
        private long f9250f;

        /* renamed from: g */
        private int f9251g;

        /* renamed from: h */
        private long f9252h;

        public c(k8 k8Var, ro roVar, nr nrVar, String str, int i9) {
            this.f9246a = k8Var;
            this.b = roVar;
            this.f9247c = nrVar;
            int i10 = (nrVar.b * nrVar.f9371f) / 8;
            if (nrVar.f9370e == i10) {
                int i11 = nrVar.f9368c * i10;
                int i12 = i11 * 8;
                int max = Math.max(i10, i11 / 10);
                this.f9249e = max;
                this.f9248d = new d9.b().f(str).b(i12).k(i12).i(max).c(nrVar.b).n(nrVar.f9368c).j(i9).a();
                return;
            }
            StringBuilder p2 = Q7.n0.p(i10, "Expected block size: ", "; got: ");
            p2.append(nrVar.f9370e);
            throw ah.a(p2.toString(), null);
        }

        @Override // com.applovin.impl.mr.b
        public void a(int i9, long j7) {
            this.f9246a.a(new pr(this.f9247c, 1, i9, j7));
            this.b.a(this.f9248d);
        }

        @Override // com.applovin.impl.mr.b
        public void a(long j7) {
            this.f9250f = j7;
            this.f9251g = 0;
            this.f9252h = 0L;
        }

        @Override // com.applovin.impl.mr.b
        public boolean a(j8 j8Var, long j7) {
            int i9;
            int i10;
            long j9 = j7;
            while (j9 > 0 && (i9 = this.f9251g) < (i10 = this.f9249e)) {
                int a6 = this.b.a((e5) j8Var, (int) Math.min(i10 - i9, j9), true);
                if (a6 == -1) {
                    j9 = 0;
                } else {
                    this.f9251g += a6;
                    j9 -= a6;
                }
            }
            int i11 = this.f9247c.f9370e;
            int i12 = this.f9251g / i11;
            if (i12 > 0) {
                long c9 = this.f9250f + yp.c(this.f9252h, 1000000L, r1.f9368c);
                int i13 = i12 * i11;
                int i14 = this.f9251g - i13;
                this.b.a(c9, 1, i13, i14, null);
                this.f9252h += i12;
                this.f9251g = i14;
            }
            return j9 <= 0;
        }
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f9231a = k8Var;
        this.b = k8Var.a(0, 1);
        k8Var.c();
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        b();
        if (this.f9232c == null) {
            nr a6 = or.a(j8Var);
            if (a6 != null) {
                int i9 = a6.f9367a;
                if (i9 == 17) {
                    this.f9232c = new a(this.f9231a, this.b, a6);
                } else if (i9 == 6) {
                    this.f9232c = new c(this.f9231a, this.b, a6, MimeTypes.AUDIO_ALAW, -1);
                } else if (i9 == 7) {
                    this.f9232c = new c(this.f9231a, this.b, a6, MimeTypes.AUDIO_MLAW, -1);
                } else {
                    int a9 = qr.a(i9, a6.f9371f);
                    if (a9 != 0) {
                        this.f9232c = new c(this.f9231a, this.b, a6, MimeTypes.AUDIO_RAW, a9);
                    } else {
                        throw ah.a("Unsupported WAV format type: " + a6.f9367a);
                    }
                }
            } else {
                throw ah.a("Unsupported or unrecognized wav header.", null);
            }
        }
        if (this.f9233d == -1) {
            Pair b8 = or.b(j8Var);
            this.f9233d = ((Long) b8.first).intValue();
            long longValue = ((Long) b8.second).longValue();
            this.f9234e = longValue;
            this.f9232c.a(this.f9233d, longValue);
        } else if (j8Var.f() == 0) {
            j8Var.a(this.f9233d);
        }
        AbstractC0669a1.b(this.f9234e != -1);
        return this.f9232c.a(j8Var, this.f9234e - j8Var.f()) ? -1 : 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        b bVar = this.f9232c;
        if (bVar != null) {
            bVar.a(j9);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return or.a(j8Var) != null;
    }
}
