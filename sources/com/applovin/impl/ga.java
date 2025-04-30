package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ga implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final jj f7799a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private ro f7800c;

    /* renamed from: d, reason: collision with root package name */
    private a f7801d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7802e;
    private long l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f7803f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final tf f7804g = new tf(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final tf f7805h = new tf(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final tf f7806i = new tf(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final tf f7807j = new tf(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final tf f7808k = new tf(40, 128);
    private long m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: n, reason: collision with root package name */
    private final yg f7809n = new yg();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ro f7810a;
        private long b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7811c;

        /* renamed from: d, reason: collision with root package name */
        private int f7812d;

        /* renamed from: e, reason: collision with root package name */
        private long f7813e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7814f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7815g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f7816h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f7817i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f7818j;

        /* renamed from: k, reason: collision with root package name */
        private long f7819k;
        private long l;
        private boolean m;

        public a(ro roVar) {
            this.f7810a = roVar;
        }

        private static boolean a(int i9) {
            return (32 <= i9 && i9 <= 35) || i9 == 39;
        }

        private static boolean b(int i9) {
            return i9 < 32 || i9 == 40;
        }

        private void c(int i9) {
            long j7 = this.l;
            if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return;
            }
            boolean z8 = this.m;
            this.f7810a.a(j7, z8 ? 1 : 0, (int) (this.b - this.f7819k), i9, null);
        }

        public void a(long j7, int i9, boolean z8) {
            if (this.f7818j && this.f7815g) {
                this.m = this.f7811c;
                this.f7818j = false;
            } else if (this.f7816h || this.f7815g) {
                if (z8 && this.f7817i) {
                    c(i9 + ((int) (j7 - this.b)));
                }
                this.f7819k = this.b;
                this.l = this.f7813e;
                this.m = this.f7811c;
                this.f7817i = true;
            }
        }

        public void a(byte[] bArr, int i9, int i10) {
            if (this.f7814f) {
                int i11 = this.f7812d;
                int i12 = (i9 + 2) - i11;
                if (i12 < i10) {
                    this.f7815g = (bArr[i12] & 128) != 0;
                    this.f7814f = false;
                } else {
                    this.f7812d = (i10 - i9) + i11;
                }
            }
        }

        public void a() {
            this.f7814f = false;
            this.f7815g = false;
            this.f7816h = false;
            this.f7817i = false;
            this.f7818j = false;
        }

        public void a(long j7, int i9, int i10, long j9, boolean z8) {
            this.f7815g = false;
            this.f7816h = false;
            this.f7813e = j9;
            this.f7812d = 0;
            this.b = j7;
            if (!b(i10)) {
                if (this.f7817i && !this.f7818j) {
                    if (z8) {
                        c(i9);
                    }
                    this.f7817i = false;
                }
                if (a(i10)) {
                    this.f7816h = !this.f7818j;
                    this.f7818j = true;
                }
            }
            boolean z9 = i10 >= 16 && i10 <= 21;
            this.f7811c = z9;
            this.f7814f = z9 || i10 <= 9;
        }
    }

    public ga(jj jjVar) {
        this.f7799a = jjVar;
    }

    private void c() {
        AbstractC0669a1.b(this.f7800c);
        yp.a(this.f7801d);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int d2 = ygVar.d();
            int e4 = ygVar.e();
            byte[] c9 = ygVar.c();
            this.l += ygVar.a();
            this.f7800c.a(ygVar, ygVar.a());
            while (d2 < e4) {
                int a6 = uf.a(c9, d2, e4, this.f7803f);
                if (a6 == e4) {
                    a(c9, d2, e4);
                    return;
                }
                int a9 = uf.a(c9, a6);
                int i9 = a6 - d2;
                if (i9 > 0) {
                    a(c9, d2, a6);
                }
                int i10 = e4 - a6;
                long j7 = this.l - i10;
                a(j7, i10, i9 < 0 ? -i9 : 0, this.m);
                b(j7, i10, a9, this.m);
                d2 = a6 + 3;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    private static void b(zg zgVar) {
        int f9 = zgVar.f();
        boolean z8 = false;
        int i9 = 0;
        for (int i10 = 0; i10 < f9; i10++) {
            if (i10 != 0) {
                z8 = zgVar.c();
            }
            if (z8) {
                zgVar.g();
                zgVar.f();
                for (int i11 = 0; i11 <= i9; i11++) {
                    if (zgVar.c()) {
                        zgVar.g();
                    }
                }
            } else {
                int f10 = zgVar.f();
                int f11 = zgVar.f();
                int i12 = f10 + f11;
                for (int i13 = 0; i13 < f10; i13++) {
                    zgVar.f();
                    zgVar.g();
                }
                for (int i14 = 0; i14 < f11; i14++) {
                    zgVar.f();
                    zgVar.g();
                }
                i9 = i12;
            }
        }
    }

    private void b(long j7, int i9, int i10, long j9) {
        this.f7801d.a(j7, i9, i10, j9, this.f7802e);
        if (!this.f7802e) {
            this.f7804g.b(i10);
            this.f7805h.b(i10);
            this.f7806i.b(i10);
        }
        this.f7807j.b(i10);
        this.f7808k.b(i10);
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.b = dVar.b();
        ro a6 = k8Var.a(dVar.c(), 2);
        this.f7800c = a6;
        this.f7801d = new a(a6);
        this.f7799a.a(k8Var, dVar);
    }

    private void a(long j7, int i9, int i10, long j9) {
        this.f7801d.a(j7, i9, this.f7802e);
        if (!this.f7802e) {
            this.f7804g.a(i10);
            this.f7805h.a(i10);
            this.f7806i.a(i10);
            if (this.f7804g.a() && this.f7805h.a() && this.f7806i.a()) {
                this.f7800c.a(a(this.b, this.f7804g, this.f7805h, this.f7806i));
                this.f7802e = true;
            }
        }
        if (this.f7807j.a(i10)) {
            tf tfVar = this.f7807j;
            this.f7809n.a(this.f7807j.f11484d, uf.c(tfVar.f11484d, tfVar.f11485e));
            this.f7809n.g(5);
            this.f7799a.a(j9, this.f7809n);
        }
        if (this.f7808k.a(i10)) {
            tf tfVar2 = this.f7808k;
            this.f7809n.a(this.f7808k.f11484d, uf.c(tfVar2.f11484d, tfVar2.f11485e));
            this.f7809n.g(5);
            this.f7799a.a(j9, this.f7809n);
        }
    }

    private void a(byte[] bArr, int i9, int i10) {
        this.f7801d.a(bArr, i9, i10);
        if (!this.f7802e) {
            this.f7804g.a(bArr, i9, i10);
            this.f7805h.a(bArr, i9, i10);
            this.f7806i.a(bArr, i9, i10);
        }
        this.f7807j.a(bArr, i9, i10);
        this.f7808k.a(bArr, i9, i10);
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.m = j7;
        }
    }

    private static d9 a(String str, tf tfVar, tf tfVar2, tf tfVar3) {
        int i9 = tfVar.f11485e;
        byte[] bArr = new byte[tfVar2.f11485e + i9 + tfVar3.f11485e];
        System.arraycopy(tfVar.f11484d, 0, bArr, 0, i9);
        System.arraycopy(tfVar2.f11484d, 0, bArr, tfVar.f11485e, tfVar2.f11485e);
        System.arraycopy(tfVar3.f11484d, 0, bArr, tfVar.f11485e + tfVar2.f11485e, tfVar3.f11485e);
        zg zgVar = new zg(tfVar2.f11484d, 0, tfVar2.f11485e);
        zgVar.d(44);
        int b = zgVar.b(3);
        zgVar.g();
        zgVar.d(88);
        zgVar.d(8);
        int i10 = 0;
        for (int i11 = 0; i11 < b; i11++) {
            if (zgVar.c()) {
                i10 += 89;
            }
            if (zgVar.c()) {
                i10 += 8;
            }
        }
        zgVar.d(i10);
        if (b > 0) {
            zgVar.d((8 - b) * 2);
        }
        zgVar.f();
        int f9 = zgVar.f();
        if (f9 == 3) {
            zgVar.g();
        }
        int f10 = zgVar.f();
        int f11 = zgVar.f();
        if (zgVar.c()) {
            int f12 = zgVar.f();
            int f13 = zgVar.f();
            int f14 = zgVar.f();
            int f15 = zgVar.f();
            f10 -= (f12 + f13) * ((f9 == 1 || f9 == 2) ? 2 : 1);
            f11 -= (f14 + f15) * (f9 == 1 ? 2 : 1);
        }
        zgVar.f();
        zgVar.f();
        int f16 = zgVar.f();
        for (int i12 = zgVar.c() ? 0 : b; i12 <= b; i12++) {
            zgVar.f();
            zgVar.f();
            zgVar.f();
        }
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        if (zgVar.c() && zgVar.c()) {
            a(zgVar);
        }
        zgVar.d(2);
        if (zgVar.c()) {
            zgVar.d(8);
            zgVar.f();
            zgVar.f();
            zgVar.g();
        }
        b(zgVar);
        if (zgVar.c()) {
            for (int i13 = 0; i13 < zgVar.f(); i13++) {
                zgVar.d(f16 + 5);
            }
        }
        zgVar.d(2);
        float f17 = 1.0f;
        if (zgVar.c()) {
            if (zgVar.c()) {
                int b8 = zgVar.b(8);
                if (b8 == 255) {
                    int b9 = zgVar.b(16);
                    int b10 = zgVar.b(16);
                    if (b9 != 0 && b10 != 0) {
                        f17 = b9 / b10;
                    }
                } else {
                    float[] fArr = uf.b;
                    if (b8 < fArr.length) {
                        f17 = fArr[b8];
                    } else {
                        L.p(b8, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                    }
                }
            }
            if (zgVar.c()) {
                zgVar.g();
            }
            if (zgVar.c()) {
                zgVar.d(4);
                if (zgVar.c()) {
                    zgVar.d(24);
                }
            }
            if (zgVar.c()) {
                zgVar.f();
                zgVar.f();
            }
            zgVar.g();
            if (zgVar.c()) {
                f11 *= 2;
            }
        }
        zgVar.a(tfVar2.f11484d, 0, tfVar2.f11485e);
        zgVar.d(24);
        return new d9.b().c(str).f(MimeTypes.VIDEO_H265).a(m3.a(zgVar)).q(f10).g(f11).b(f17).a(Collections.singletonList(bArr)).a();
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.l = 0L;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        uf.a(this.f7803f);
        this.f7804g.b();
        this.f7805h.b();
        this.f7806i.b();
        this.f7807j.b();
        this.f7808k.b();
        a aVar = this.f7801d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void a(zg zgVar) {
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = 0;
            while (i10 < 6) {
                int i11 = 1;
                if (!zgVar.c()) {
                    zgVar.f();
                } else {
                    int min = Math.min(64, 1 << ((i9 << 1) + 4));
                    if (i9 > 1) {
                        zgVar.e();
                    }
                    for (int i12 = 0; i12 < min; i12++) {
                        zgVar.e();
                    }
                }
                if (i9 == 3) {
                    i11 = 3;
                }
                i10 += i11;
            }
        }
    }
}
