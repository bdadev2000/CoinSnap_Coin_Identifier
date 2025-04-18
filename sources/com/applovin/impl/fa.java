package com.applovin.impl;

import com.applovin.impl.dp;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class fa implements q7 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f23874q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f23875a;

    /* renamed from: b, reason: collision with root package name */
    private qo f23876b;

    /* renamed from: c, reason: collision with root package name */
    private final vp f23877c;
    private final bh d;
    private final yf e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f23878f;

    /* renamed from: g, reason: collision with root package name */
    private final a f23879g;

    /* renamed from: h, reason: collision with root package name */
    private long f23880h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23881i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23882j;

    /* renamed from: k, reason: collision with root package name */
    private long f23883k;

    /* renamed from: l, reason: collision with root package name */
    private long f23884l;

    /* renamed from: m, reason: collision with root package name */
    private long f23885m;

    /* renamed from: n, reason: collision with root package name */
    private long f23886n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23887o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23888p;

    /* loaded from: classes3.dex */
    public static final class a {
        private static final byte[] e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f23889a;

        /* renamed from: b, reason: collision with root package name */
        public int f23890b;

        /* renamed from: c, reason: collision with root package name */
        public int f23891c;
        public byte[] d;

        public a(int i2) {
            this.d = new byte[i2];
        }

        public void a() {
            this.f23889a = false;
            this.f23890b = 0;
            this.f23891c = 0;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f23889a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i5 = this.f23890b + i4;
                if (length < i5) {
                    this.d = Arrays.copyOf(bArr2, i5 * 2);
                }
                System.arraycopy(bArr, i2, this.d, this.f23890b, i4);
                this.f23890b += i4;
            }
        }

        public boolean a(int i2, int i3) {
            if (this.f23889a) {
                int i4 = this.f23890b - i3;
                this.f23890b = i4;
                if (this.f23891c != 0 || i2 != 181) {
                    this.f23889a = false;
                    return true;
                }
                this.f23891c = i4;
            } else if (i2 == 179) {
                this.f23889a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }
    }

    public fa() {
        this(null);
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        this.f23884l = j2;
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    public fa(vp vpVar) {
        this.f23877c = vpVar;
        this.f23878f = new boolean[4];
        this.f23879g = new a(128);
        if (vpVar != null) {
            this.e = new yf(Opcodes.GETSTATIC, 128);
            this.d = new bh();
        } else {
            this.e = null;
            this.d = null;
        }
        this.f23884l = -9223372036854775807L;
        this.f23886n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // com.applovin.impl.q7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.bh r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fa.a(com.applovin.impl.bh):void");
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.f23875a = dVar.b();
        this.f23876b = m8Var.a(dVar.c(), 2);
        vp vpVar = this.f23877c;
        if (vpVar != null) {
            vpVar.a(m8Var, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair a(com.applovin.impl.fa.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.d
            int r1 = r8.f23890b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            com.applovin.impl.f9$b r6 = new com.applovin.impl.f9$b
            r6.<init>()
            com.applovin.impl.f9$b r9 = r6.c(r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.impl.f9$b r9 = r9.f(r6)
            com.applovin.impl.f9$b r9 = r9.q(r2)
            com.applovin.impl.f9$b r9 = r9.g(r4)
            com.applovin.impl.f9$b r9 = r9.b(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.impl.f9$b r9 = r9.a(r1)
            com.applovin.impl.f9 r9 = r9.a()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = com.applovin.impl.fa.f23874q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f23891c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fa.a(com.applovin.impl.fa$a, java.lang.String):android.util.Pair");
    }

    @Override // com.applovin.impl.q7
    public void a() {
        zf.a(this.f23878f);
        this.f23879g.a();
        yf yfVar = this.e;
        if (yfVar != null) {
            yfVar.b();
        }
        this.f23880h = 0L;
        this.f23881i = false;
        this.f23884l = -9223372036854775807L;
        this.f23886n = -9223372036854775807L;
    }
}
