package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.f9;
import com.google.common.primitives.UnsignedBytes;
import okhttp3.internal.http.StatusLine;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class lr implements k8 {

    /* renamed from: f */
    public static final o8 f25127f = new dt(8);

    /* renamed from: a */
    private m8 f25128a;

    /* renamed from: b */
    private qo f25129b;

    /* renamed from: c */
    private b f25130c;
    private int d = -1;
    private long e = -1;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: m */
        private static final int[] f25131m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f25132n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Opcodes.FNEG, 130, Opcodes.D2L, 157, Opcodes.LRETURN, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final m8 f25133a;

        /* renamed from: b */
        private final qo f25134b;

        /* renamed from: c */
        private final mr f25135c;
        private final int d;
        private final byte[] e;

        /* renamed from: f */
        private final bh f25136f;

        /* renamed from: g */
        private final int f25137g;

        /* renamed from: h */
        private final f9 f25138h;

        /* renamed from: i */
        private int f25139i;

        /* renamed from: j */
        private long f25140j;

        /* renamed from: k */
        private int f25141k;

        /* renamed from: l */
        private long f25142l;

        public a(m8 m8Var, qo qoVar, mr mrVar) {
            this.f25133a = m8Var;
            this.f25134b = qoVar;
            this.f25135c = mrVar;
            int max = Math.max(1, mrVar.f25607c / 10);
            this.f25137g = max;
            bh bhVar = new bh(mrVar.f25609g);
            bhVar.r();
            int r2 = bhVar.r();
            this.d = r2;
            int i2 = mrVar.f25606b;
            int i3 = (((mrVar.e - (i2 * 4)) * 8) / (mrVar.f25608f * i2)) + 1;
            if (r2 != i3) {
                throw dh.a("Expected frames per block: " + i3 + "; got: " + r2, null);
            }
            int a2 = xp.a(max, r2);
            this.e = new byte[mrVar.e * a2];
            this.f25136f = new bh(a2 * a(r2, i2));
            int i4 = ((mrVar.f25607c * mrVar.e) * 8) / r2;
            this.f25138h = new f9.b().f("audio/raw").b(i4).k(i4).i(a(max, i2)).c(mrVar.f25606b).n(mrVar.f25607c).j(2).a();
        }

        private static int a(int i2, int i3) {
            return i2 * 2 * i3;
        }

        private int b(int i2) {
            return a(i2, this.f25135c.f25606b);
        }

        private void c(int i2) {
            long c2 = this.f25140j + xp.c(this.f25142l, 1000000L, this.f25135c.f25607c);
            int b2 = b(i2);
            this.f25134b.a(c2, 1, b2, this.f25141k - b2, null);
            this.f25142l += i2;
            this.f25141k -= b2;
        }

        @Override // com.applovin.impl.lr.b
        public void a(long j2) {
            this.f25139i = 0;
            this.f25140j = j2;
            this.f25141k = 0;
            this.f25142l = 0L;
        }

        private void a(byte[] bArr, int i2, bh bhVar) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < this.f25135c.f25606b; i4++) {
                    a(bArr, i3, i4, bhVar.c());
                }
            }
            int b2 = b(this.d * i2);
            bhVar.f(0);
            bhVar.e(b2);
        }

        private void a(byte[] bArr, int i2, int i3, byte[] bArr2) {
            mr mrVar = this.f25135c;
            int i4 = mrVar.e;
            int i5 = mrVar.f25606b;
            int i6 = (i3 * 4) + (i2 * i4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int i9 = (short) (((bArr[i6 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i6] & UnsignedBytes.MAX_VALUE));
            int min = Math.min(bArr[i6 + 2] & UnsignedBytes.MAX_VALUE, 88);
            int i10 = f25132n[min];
            int i11 = ((i2 * this.d * i5) + i3) * 2;
            bArr2[i11] = (byte) (i9 & 255);
            bArr2[i11 + 1] = (byte) (i9 >> 8);
            for (int i12 = 0; i12 < i8 * 2; i12++) {
                byte b2 = bArr[((i12 / 8) * i5 * 4) + i7 + ((i12 / 2) % 4)];
                int i13 = i12 % 2 == 0 ? b2 & 15 : (b2 & UnsignedBytes.MAX_VALUE) >> 4;
                int i14 = ((((i13 & 7) * 2) + 1) * i10) >> 3;
                if ((i13 & 8) != 0) {
                    i14 = -i14;
                }
                i9 = xp.a(i9 + i14, -32768, 32767);
                i11 += i5 * 2;
                bArr2[i11] = (byte) (i9 & 255);
                bArr2[i11 + 1] = (byte) (i9 >> 8);
                int i15 = min + f25131m[i13];
                int[] iArr = f25132n;
                min = xp.a(i15, 0, iArr.length - 1);
                i10 = iArr[min];
            }
        }

        @Override // com.applovin.impl.lr.b
        public void a(int i2, long j2) {
            this.f25133a.a(new or(this.f25135c, this.d, i2, j2));
            this.f25134b.a(this.f25138h);
        }

        private int a(int i2) {
            return i2 / (this.f25135c.f25606b * 2);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:4:0x0037). Please report as a decompilation issue!!! */
        @Override // com.applovin.impl.lr.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(com.applovin.impl.l8 r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f25137g
                int r1 = r6.f25141k
                int r1 = r6.a(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = com.applovin.impl.xp.a(r0, r1)
                com.applovin.impl.mr r1 = r6.f25135c
                int r1 = r1.e
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
                int r3 = r2.f25139i
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r2.e
                int r5 = r2.f25139i
                int r3 = r7.a(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L39
            L37:
                r1 = 1
                goto L1e
            L39:
                int r4 = r2.f25139i
                int r4 = r4 + r3
                r2.f25139i = r4
                goto L1e
            L3f:
                int r7 = r2.f25139i
                com.applovin.impl.mr r8 = r2.f25135c
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L76
                byte[] r8 = r2.e
                com.applovin.impl.bh r9 = r2.f25136f
                r2.a(r8, r7, r9)
                int r8 = r2.f25139i
                com.applovin.impl.mr r9 = r2.f25135c
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r2.f25139i = r8
                com.applovin.impl.bh r7 = r2.f25136f
                int r7 = r7.e()
                com.applovin.impl.qo r8 = r2.f25134b
                com.applovin.impl.bh r9 = r2.f25136f
                r8.a(r9, r7)
                int r8 = r2.f25141k
                int r8 = r8 + r7
                r2.f25141k = r8
                int r7 = r2.a(r8)
                int r8 = r2.f25137g
                if (r7 < r8) goto L76
                r2.c(r8)
            L76:
                if (r1 == 0) goto L83
                int r7 = r2.f25141k
                int r7 = r2.a(r7)
                if (r7 <= 0) goto L83
                r2.c(r7)
            L83:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.lr.a.a(com.applovin.impl.l8, long):boolean");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i2, long j2);

        void a(long j2);

        boolean a(l8 l8Var, long j2);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final m8 f25143a;

        /* renamed from: b */
        private final qo f25144b;

        /* renamed from: c */
        private final mr f25145c;
        private final f9 d;
        private final int e;

        /* renamed from: f */
        private long f25146f;

        /* renamed from: g */
        private int f25147g;

        /* renamed from: h */
        private long f25148h;

        public c(m8 m8Var, qo qoVar, mr mrVar, String str, int i2) {
            this.f25143a = m8Var;
            this.f25144b = qoVar;
            this.f25145c = mrVar;
            int i3 = (mrVar.f25606b * mrVar.f25608f) / 8;
            if (mrVar.e != i3) {
                StringBuilder t2 = android.support.v4.media.d.t("Expected block size: ", i3, "; got: ");
                t2.append(mrVar.e);
                throw dh.a(t2.toString(), null);
            }
            int i4 = mrVar.f25607c * i3;
            int i5 = i4 * 8;
            int max = Math.max(i3, i4 / 10);
            this.e = max;
            this.d = new f9.b().f(str).b(i5).k(i5).i(max).c(mrVar.f25606b).n(mrVar.f25607c).j(i2).a();
        }

        @Override // com.applovin.impl.lr.b
        public void a(long j2) {
            this.f25146f = j2;
            this.f25147g = 0;
            this.f25148h = 0L;
        }

        @Override // com.applovin.impl.lr.b
        public void a(int i2, long j2) {
            this.f25143a.a(new or(this.f25145c, 1, i2, j2));
            this.f25144b.a(this.d);
        }

        @Override // com.applovin.impl.lr.b
        public boolean a(l8 l8Var, long j2) {
            int i2;
            int i3;
            long j3 = j2;
            while (j3 > 0 && (i2 = this.f25147g) < (i3 = this.e)) {
                int a2 = this.f25144b.a((g5) l8Var, (int) Math.min(i3 - i2, j3), true);
                if (a2 == -1) {
                    j3 = 0;
                } else {
                    this.f25147g += a2;
                    j3 -= a2;
                }
            }
            int i4 = this.f25145c.e;
            int i5 = this.f25147g / i4;
            if (i5 > 0) {
                long c2 = this.f25146f + xp.c(this.f25148h, 1000000L, r1.f25607c);
                int i6 = i5 * i4;
                int i7 = this.f25147g - i6;
                this.f25144b.a(c2, 1, i6, i7, null);
                this.f25148h += i5;
                this.f25147g = i7;
            }
            return j3 <= 0;
        }
    }

    private void b() {
        b1.b(this.f25129b);
        xp.a(this.f25128a);
    }

    public static /* synthetic */ k8[] c() {
        return new k8[]{new lr()};
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f25128a = m8Var;
        this.f25129b = m8Var.a(0, 1);
        m8Var.c();
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        b();
        if (this.f25130c == null) {
            mr a2 = nr.a(l8Var);
            if (a2 != null) {
                int i2 = a2.f25605a;
                if (i2 == 17) {
                    this.f25130c = new a(this.f25128a, this.f25129b, a2);
                } else if (i2 == 6) {
                    this.f25130c = new c(this.f25128a, this.f25129b, a2, "audio/g711-alaw", -1);
                } else if (i2 == 7) {
                    this.f25130c = new c(this.f25128a, this.f25129b, a2, "audio/g711-mlaw", -1);
                } else {
                    int a3 = pr.a(i2, a2.f25608f);
                    if (a3 != 0) {
                        this.f25130c = new c(this.f25128a, this.f25129b, a2, "audio/raw", a3);
                    } else {
                        throw dh.a("Unsupported WAV format type: " + a2.f25605a);
                    }
                }
            } else {
                throw dh.a("Unsupported or unrecognized wav header.", null);
            }
        }
        if (this.d == -1) {
            Pair b2 = nr.b(l8Var);
            this.d = ((Long) b2.first).intValue();
            long longValue = ((Long) b2.second).longValue();
            this.e = longValue;
            this.f25130c.a(this.d, longValue);
        } else if (l8Var.f() == 0) {
            l8Var.a(this.d);
        }
        b1.b(this.e != -1);
        return this.f25130c.a(l8Var, this.e - l8Var.f()) ? -1 : 0;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        b bVar = this.f25130c;
        if (bVar != null) {
            bVar.a(j3);
        }
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        return nr.a(l8Var) != null;
    }
}
