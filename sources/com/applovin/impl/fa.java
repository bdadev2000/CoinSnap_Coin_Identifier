package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.uf;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fa implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final jj f7578a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7579c;

    /* renamed from: g, reason: collision with root package name */
    private long f7583g;

    /* renamed from: i, reason: collision with root package name */
    private String f7585i;

    /* renamed from: j, reason: collision with root package name */
    private ro f7586j;

    /* renamed from: k, reason: collision with root package name */
    private b f7587k;
    private boolean l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f7588n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f7584h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final tf f7580d = new tf(7, 128);

    /* renamed from: e, reason: collision with root package name */
    private final tf f7581e = new tf(8, 128);

    /* renamed from: f, reason: collision with root package name */
    private final tf f7582f = new tf(6, 128);
    private long m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    private final yg f7589o = new yg();

    public fa(jj jjVar, boolean z8, boolean z9) {
        this.f7578a = jjVar;
        this.b = z8;
        this.f7579c = z9;
    }

    private void c() {
        AbstractC0669a1.b(this.f7586j);
        yp.a(this.f7587k);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        byte[] c9 = ygVar.c();
        this.f7583g += ygVar.a();
        this.f7586j.a(ygVar, ygVar.a());
        while (true) {
            int a6 = uf.a(c9, d2, e4, this.f7584h);
            if (a6 == e4) {
                a(c9, d2, e4);
                return;
            }
            int b8 = uf.b(c9, a6);
            int i9 = a6 - d2;
            if (i9 > 0) {
                a(c9, d2, a6);
            }
            int i10 = e4 - a6;
            long j7 = this.f7583g - i10;
            a(j7, i10, i9 < 0 ? -i9 : 0, this.m);
            a(j7, b8, this.m);
            d2 = a6 + 3;
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f7585i = dVar.b();
        ro a6 = k8Var.a(dVar.c(), 2);
        this.f7586j = a6;
        this.f7587k = new b(a6, this.b, this.f7579c);
        this.f7578a.a(k8Var, dVar);
    }

    private void a(long j7, int i9, int i10, long j9) {
        if (!this.l || this.f7587k.a()) {
            this.f7580d.a(i10);
            this.f7581e.a(i10);
            if (!this.l) {
                if (this.f7580d.a() && this.f7581e.a()) {
                    ArrayList arrayList = new ArrayList();
                    tf tfVar = this.f7580d;
                    arrayList.add(Arrays.copyOf(tfVar.f11484d, tfVar.f11485e));
                    tf tfVar2 = this.f7581e;
                    arrayList.add(Arrays.copyOf(tfVar2.f11484d, tfVar2.f11485e));
                    tf tfVar3 = this.f7580d;
                    uf.b c9 = uf.c(tfVar3.f11484d, 3, tfVar3.f11485e);
                    tf tfVar4 = this.f7581e;
                    uf.a b8 = uf.b(tfVar4.f11484d, 3, tfVar4.f11485e);
                    this.f7586j.a(new d9.b().c(this.f7585i).f(MimeTypes.VIDEO_H264).a(m3.a(c9.f11596a, c9.b, c9.f11597c)).q(c9.f11599e).g(c9.f11600f).b(c9.f11601g).a(arrayList).a());
                    this.l = true;
                    this.f7587k.a(c9);
                    this.f7587k.a(b8);
                    this.f7580d.b();
                    this.f7581e.b();
                }
            } else if (this.f7580d.a()) {
                tf tfVar5 = this.f7580d;
                this.f7587k.a(uf.c(tfVar5.f11484d, 3, tfVar5.f11485e));
                this.f7580d.b();
            } else if (this.f7581e.a()) {
                tf tfVar6 = this.f7581e;
                this.f7587k.a(uf.b(tfVar6.f11484d, 3, tfVar6.f11485e));
                this.f7581e.b();
            }
        }
        if (this.f7582f.a(i10)) {
            tf tfVar7 = this.f7582f;
            this.f7589o.a(this.f7582f.f11484d, uf.c(tfVar7.f11484d, tfVar7.f11485e));
            this.f7589o.f(4);
            this.f7578a.a(j9, this.f7589o);
        }
        if (this.f7587k.a(j7, i9, this.l, this.f7588n)) {
            this.f7588n = false;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ro f7590a;
        private final boolean b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f7591c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray f7592d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray f7593e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        private final zg f7594f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f7595g;

        /* renamed from: h, reason: collision with root package name */
        private int f7596h;

        /* renamed from: i, reason: collision with root package name */
        private int f7597i;

        /* renamed from: j, reason: collision with root package name */
        private long f7598j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f7599k;
        private long l;
        private a m;

        /* renamed from: n, reason: collision with root package name */
        private a f7600n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f7601o;

        /* renamed from: p, reason: collision with root package name */
        private long f7602p;

        /* renamed from: q, reason: collision with root package name */
        private long f7603q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f7604r;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f7605a;
            private boolean b;

            /* renamed from: c, reason: collision with root package name */
            private uf.b f7606c;

            /* renamed from: d, reason: collision with root package name */
            private int f7607d;

            /* renamed from: e, reason: collision with root package name */
            private int f7608e;

            /* renamed from: f, reason: collision with root package name */
            private int f7609f;

            /* renamed from: g, reason: collision with root package name */
            private int f7610g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f7611h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f7612i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f7613j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f7614k;
            private int l;
            private int m;

            /* renamed from: n, reason: collision with root package name */
            private int f7615n;

            /* renamed from: o, reason: collision with root package name */
            private int f7616o;

            /* renamed from: p, reason: collision with root package name */
            private int f7617p;

            private a() {
            }

            public boolean b() {
                int i9;
                if (this.b && ((i9 = this.f7608e) == 7 || i9 == 2)) {
                    return true;
                }
                return false;
            }

            public void a() {
                this.b = false;
                this.f7605a = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(a aVar) {
                int i9;
                int i10;
                int i11;
                boolean z8;
                if (!this.f7605a) {
                    return false;
                }
                if (!aVar.f7605a) {
                    return true;
                }
                uf.b bVar = (uf.b) AbstractC0669a1.b(this.f7606c);
                uf.b bVar2 = (uf.b) AbstractC0669a1.b(aVar.f7606c);
                return (this.f7609f == aVar.f7609f && this.f7610g == aVar.f7610g && this.f7611h == aVar.f7611h && (!this.f7612i || !aVar.f7612i || this.f7613j == aVar.f7613j) && (((i9 = this.f7607d) == (i10 = aVar.f7607d) || (i9 != 0 && i10 != 0)) && (((i11 = bVar.f11605k) != 0 || bVar2.f11605k != 0 || (this.m == aVar.m && this.f7615n == aVar.f7615n)) && ((i11 != 1 || bVar2.f11605k != 1 || (this.f7616o == aVar.f7616o && this.f7617p == aVar.f7617p)) && (z8 = this.f7614k) == aVar.f7614k && (!z8 || this.l == aVar.l))))) ? false : true;
            }

            public void a(uf.b bVar, int i9, int i10, int i11, int i12, boolean z8, boolean z9, boolean z10, boolean z11, int i13, int i14, int i15, int i16, int i17) {
                this.f7606c = bVar;
                this.f7607d = i9;
                this.f7608e = i10;
                this.f7609f = i11;
                this.f7610g = i12;
                this.f7611h = z8;
                this.f7612i = z9;
                this.f7613j = z10;
                this.f7614k = z11;
                this.l = i13;
                this.m = i14;
                this.f7615n = i15;
                this.f7616o = i16;
                this.f7617p = i17;
                this.f7605a = true;
                this.b = true;
            }

            public void a(int i9) {
                this.f7608e = i9;
                this.b = true;
            }
        }

        public b(ro roVar, boolean z8, boolean z9) {
            this.f7590a = roVar;
            this.b = z8;
            this.f7591c = z9;
            this.m = new a();
            this.f7600n = new a();
            byte[] bArr = new byte[128];
            this.f7595g = bArr;
            this.f7594f = new zg(bArr, 0, 0);
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 412
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fa.b.a(byte[], int, int):void");
        }

        public void b() {
            this.f7599k = false;
            this.f7601o = false;
            this.f7600n.a();
        }

        public boolean a(long j7, int i9, boolean z8, boolean z9) {
            boolean z10 = false;
            if (this.f7597i == 9 || (this.f7591c && this.f7600n.a(this.m))) {
                if (z8 && this.f7601o) {
                    a(i9 + ((int) (j7 - this.f7598j)));
                }
                this.f7602p = this.f7598j;
                this.f7603q = this.l;
                this.f7604r = false;
                this.f7601o = true;
            }
            if (this.b) {
                z9 = this.f7600n.b();
            }
            boolean z11 = this.f7604r;
            int i10 = this.f7597i;
            if (i10 == 5 || (z9 && i10 == 1)) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            this.f7604r = z12;
            return z12;
        }

        public boolean a() {
            return this.f7591c;
        }

        private void a(int i9) {
            long j7 = this.f7603q;
            if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return;
            }
            boolean z8 = this.f7604r;
            this.f7590a.a(j7, z8 ? 1 : 0, (int) (this.f7598j - this.f7602p), i9, null);
        }

        public void a(uf.a aVar) {
            this.f7593e.append(aVar.f11594a, aVar);
        }

        public void a(uf.b bVar) {
            this.f7592d.append(bVar.f11598d, bVar);
        }

        public void a(long j7, int i9, long j9) {
            this.f7597i = i9;
            this.l = j9;
            this.f7598j = j7;
            if (!this.b || i9 != 1) {
                if (!this.f7591c) {
                    return;
                }
                if (i9 != 5 && i9 != 1 && i9 != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.f7600n;
            this.f7600n = aVar;
            aVar.a();
            this.f7596h = 0;
            this.f7599k = true;
        }
    }

    private void a(byte[] bArr, int i9, int i10) {
        if (!this.l || this.f7587k.a()) {
            this.f7580d.a(bArr, i9, i10);
            this.f7581e.a(bArr, i9, i10);
        }
        this.f7582f.a(bArr, i9, i10);
        this.f7587k.a(bArr, i9, i10);
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.m = j7;
        }
        this.f7588n |= (i9 & 2) != 0;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f7583g = 0L;
        this.f7588n = false;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        uf.a(this.f7584h);
        this.f7580d.b();
        this.f7581e.b();
        this.f7582f.b();
        b bVar = this.f7587k;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void a(long j7, int i9, long j9) {
        if (!this.l || this.f7587k.a()) {
            this.f7580d.b(i9);
            this.f7581e.b(i9);
        }
        this.f7582f.b(i9);
        this.f7587k.a(j7, i9, j9);
    }
}
