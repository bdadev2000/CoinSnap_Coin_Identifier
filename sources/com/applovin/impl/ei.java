package com.applovin.impl;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes.dex */
public final class ei implements i8 {
    public static final m8 l = new A0(3);

    /* renamed from: a */
    private final io f7426a;
    private final SparseArray b;

    /* renamed from: c */
    private final yg f7427c;

    /* renamed from: d */
    private final di f7428d;

    /* renamed from: e */
    private boolean f7429e;

    /* renamed from: f */
    private boolean f7430f;

    /* renamed from: g */
    private boolean f7431g;

    /* renamed from: h */
    private long f7432h;

    /* renamed from: i */
    private ci f7433i;

    /* renamed from: j */
    private k8 f7434j;

    /* renamed from: k */
    private boolean f7435k;

    public ei() {
        this(new io(0L));
    }

    public static /* synthetic */ i8[] b() {
        return new i8[]{new ei()};
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public ei(io ioVar) {
        this.f7426a = ioVar;
        this.f7427c = new yg(4096);
        this.b = new SparseArray();
        this.f7428d = new di();
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f7434j = k8Var;
    }

    private void a(long j7) {
        if (this.f7435k) {
            return;
        }
        this.f7435k = true;
        if (this.f7428d.a() != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            ci ciVar = new ci(this.f7428d.b(), this.f7428d.a(), j7);
            this.f7433i = ciVar;
            this.f7434j.a(ciVar.a());
            return;
        }
        this.f7434j.a(new ej.b(this.f7428d.a()));
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final o7 f7436a;
        private final io b;

        /* renamed from: c */
        private final xg f7437c = new xg(new byte[64]);

        /* renamed from: d */
        private boolean f7438d;

        /* renamed from: e */
        private boolean f7439e;

        /* renamed from: f */
        private boolean f7440f;

        /* renamed from: g */
        private int f7441g;

        /* renamed from: h */
        private long f7442h;

        public a(o7 o7Var, io ioVar) {
            this.f7436a = o7Var;
            this.b = ioVar;
        }

        private void b() {
            this.f7442h = 0L;
            if (this.f7438d) {
                this.f7437c.d(4);
                this.f7437c.d(1);
                this.f7437c.d(1);
                long a6 = (this.f7437c.a(3) << 30) | (this.f7437c.a(15) << 15) | this.f7437c.a(15);
                this.f7437c.d(1);
                if (!this.f7440f && this.f7439e) {
                    this.f7437c.d(4);
                    this.f7437c.d(1);
                    this.f7437c.d(1);
                    this.f7437c.d(1);
                    this.b.b((this.f7437c.a(3) << 30) | (this.f7437c.a(15) << 15) | this.f7437c.a(15));
                    this.f7440f = true;
                }
                this.f7442h = this.b.b(a6);
            }
        }

        public void a(yg ygVar) {
            ygVar.a(this.f7437c.f12177a, 0, 3);
            this.f7437c.c(0);
            a();
            ygVar.a(this.f7437c.f12177a, 0, this.f7441g);
            this.f7437c.c(0);
            b();
            this.f7436a.a(this.f7442h, 4);
            this.f7436a.a(ygVar);
            this.f7436a.b();
        }

        public void c() {
            this.f7440f = false;
            this.f7436a.a();
        }

        private void a() {
            this.f7437c.d(8);
            this.f7438d = this.f7437c.f();
            this.f7439e = this.f7437c.f();
            this.f7437c.d(6);
            this.f7441g = this.f7437c.a(8);
        }
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        o7 o7Var;
        AbstractC0669a1.b(this.f7434j);
        long a6 = j8Var.a();
        if (a6 != -1 && !this.f7428d.c()) {
            return this.f7428d.a(j8Var, qhVar);
        }
        a(a6);
        ci ciVar = this.f7433i;
        if (ciVar != null && ciVar.b()) {
            return this.f7433i.a(j8Var, qhVar);
        }
        j8Var.b();
        long d2 = a6 != -1 ? a6 - j8Var.d() : -1L;
        if ((d2 != -1 && d2 < 4) || !j8Var.b(this.f7427c.c(), 0, 4, true)) {
            return -1;
        }
        this.f7427c.f(0);
        int j7 = this.f7427c.j();
        if (j7 == 441) {
            return -1;
        }
        if (j7 == 442) {
            j8Var.c(this.f7427c.c(), 0, 10);
            this.f7427c.f(9);
            j8Var.a((this.f7427c.w() & 7) + 14);
            return 0;
        }
        if (j7 == 443) {
            j8Var.c(this.f7427c.c(), 0, 2);
            this.f7427c.f(0);
            j8Var.a(this.f7427c.C() + 6);
            return 0;
        }
        if (((j7 & (-256)) >> 8) != 1) {
            j8Var.a(1);
            return 0;
        }
        int i9 = j7 & 255;
        a aVar = (a) this.b.get(i9);
        if (!this.f7429e) {
            if (aVar == null) {
                if (i9 == 189) {
                    o7Var = new C0710j();
                    this.f7430f = true;
                    this.f7432h = j8Var.f();
                } else if ((j7 & 224) == 192) {
                    o7Var = new nf();
                    this.f7430f = true;
                    this.f7432h = j8Var.f();
                } else if ((j7 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    o7Var = new da();
                    this.f7431g = true;
                    this.f7432h = j8Var.f();
                } else {
                    o7Var = null;
                }
                if (o7Var != null) {
                    o7Var.a(this.f7434j, new ep.d(i9, NotificationCompat.FLAG_LOCAL_ONLY));
                    aVar = new a(o7Var, this.f7426a);
                    this.b.put(i9, aVar);
                }
            }
            if (j8Var.f() > ((this.f7430f && this.f7431g) ? this.f7432h + 8192 : 1048576L)) {
                this.f7429e = true;
                this.f7434j.c();
            }
        }
        j8Var.c(this.f7427c.c(), 0, 2);
        this.f7427c.f(0);
        int C8 = this.f7427c.C() + 6;
        if (aVar == null) {
            j8Var.a(C8);
        } else {
            this.f7427c.d(C8);
            j8Var.d(this.f7427c.c(), 0, C8);
            this.f7427c.f(6);
            aVar.a(this.f7427c);
            yg ygVar = this.f7427c;
            ygVar.e(ygVar.b());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 != r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r4.f7426a.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r5 != false) goto L40;
     */
    @Override // com.applovin.impl.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r5, long r7) {
        /*
            r4 = this;
            com.applovin.impl.io r5 = r4.f7426a
            long r5 = r5.c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = r6
        L13:
            if (r5 != 0) goto L2a
            com.applovin.impl.io r5 = r4.f7426a
            long r2 = r5.a()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r5 == 0) goto L31
        L2c:
            com.applovin.impl.io r5 = r4.f7426a
            r5.d(r7)
        L31:
            com.applovin.impl.ci r5 = r4.f7433i
            if (r5 == 0) goto L38
            r5.b(r7)
        L38:
            android.util.SparseArray r5 = r4.b
            int r5 = r5.size()
            if (r6 >= r5) goto L4e
            android.util.SparseArray r5 = r4.b
            java.lang.Object r5 = r5.valueAt(r6)
            com.applovin.impl.ei$a r5 = (com.applovin.impl.ei.a) r5
            r5.c()
            int r6 = r6 + 1
            goto L38
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ei.a(long, long):void");
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        byte[] bArr = new byte[14];
        j8Var.c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        j8Var.c(bArr[13] & 7);
        j8Var.c(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
