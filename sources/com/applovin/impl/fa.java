package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.uf;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fa implements o7 {
    private final jj a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4624b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4625c;

    /* renamed from: g, reason: collision with root package name */
    private long f4629g;

    /* renamed from: i, reason: collision with root package name */
    private String f4631i;

    /* renamed from: j, reason: collision with root package name */
    private ro f4632j;

    /* renamed from: k, reason: collision with root package name */
    private b f4633k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4634l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4636n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f4630h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final tf f4626d = new tf(7, 128);

    /* renamed from: e, reason: collision with root package name */
    private final tf f4627e = new tf(8, 128);

    /* renamed from: f, reason: collision with root package name */
    private final tf f4628f = new tf(6, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f4635m = C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    private final yg f4637o = new yg();

    public fa(jj jjVar, boolean z10, boolean z11) {
        this.a = jjVar;
        this.f4624b = z10;
        this.f4625c = z11;
    }

    private void c() {
        a1.b(this.f4632j);
        yp.a(this.f4633k);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        byte[] c10 = ygVar.c();
        this.f4629g += ygVar.a();
        this.f4632j.a(ygVar, ygVar.a());
        while (true) {
            int a10 = uf.a(c10, d10, e2, this.f4630h);
            if (a10 == e2) {
                a(c10, d10, e2);
                return;
            }
            int b3 = uf.b(c10, a10);
            int i10 = a10 - d10;
            if (i10 > 0) {
                a(c10, d10, a10);
            }
            int i11 = e2 - a10;
            long j3 = this.f4629g - i11;
            a(j3, i11, i10 < 0 ? -i10 : 0, this.f4635m);
            a(j3, b3, this.f4635m);
            d10 = a10 + 3;
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f4631i = dVar.b();
        ro a10 = k8Var.a(dVar.c(), 2);
        this.f4632j = a10;
        this.f4633k = new b(a10, this.f4624b, this.f4625c);
        this.a.a(k8Var, dVar);
    }

    private void a(long j3, int i10, int i11, long j10) {
        if (!this.f4634l || this.f4633k.a()) {
            this.f4626d.a(i11);
            this.f4627e.a(i11);
            if (!this.f4634l) {
                if (this.f4626d.a() && this.f4627e.a()) {
                    ArrayList arrayList = new ArrayList();
                    tf tfVar = this.f4626d;
                    arrayList.add(Arrays.copyOf(tfVar.f8269d, tfVar.f8270e));
                    tf tfVar2 = this.f4627e;
                    arrayList.add(Arrays.copyOf(tfVar2.f8269d, tfVar2.f8270e));
                    tf tfVar3 = this.f4626d;
                    uf.b c10 = uf.c(tfVar3.f8269d, 3, tfVar3.f8270e);
                    tf tfVar4 = this.f4627e;
                    uf.a b3 = uf.b(tfVar4.f8269d, 3, tfVar4.f8270e);
                    this.f4632j.a(new d9.b().c(this.f4631i).f(MimeTypes.VIDEO_H264).a(m3.a(c10.a, c10.f8380b, c10.f8381c)).q(c10.f8383e).g(c10.f8384f).b(c10.f8385g).a(arrayList).a());
                    this.f4634l = true;
                    this.f4633k.a(c10);
                    this.f4633k.a(b3);
                    this.f4626d.b();
                    this.f4627e.b();
                }
            } else if (this.f4626d.a()) {
                tf tfVar5 = this.f4626d;
                this.f4633k.a(uf.c(tfVar5.f8269d, 3, tfVar5.f8270e));
                this.f4626d.b();
            } else if (this.f4627e.a()) {
                tf tfVar6 = this.f4627e;
                this.f4633k.a(uf.b(tfVar6.f8269d, 3, tfVar6.f8270e));
                this.f4627e.b();
            }
        }
        if (this.f4628f.a(i11)) {
            tf tfVar7 = this.f4628f;
            this.f4637o.a(this.f4628f.f8269d, uf.c(tfVar7.f8269d, tfVar7.f8270e));
            this.f4637o.f(4);
            this.a.a(j10, this.f4637o);
        }
        if (this.f4633k.a(j3, i10, this.f4634l, this.f4636n)) {
            this.f4636n = false;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final ro a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f4638b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f4639c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray f4640d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray f4641e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        private final zg f4642f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f4643g;

        /* renamed from: h, reason: collision with root package name */
        private int f4644h;

        /* renamed from: i, reason: collision with root package name */
        private int f4645i;

        /* renamed from: j, reason: collision with root package name */
        private long f4646j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f4647k;

        /* renamed from: l, reason: collision with root package name */
        private long f4648l;

        /* renamed from: m, reason: collision with root package name */
        private a f4649m;

        /* renamed from: n, reason: collision with root package name */
        private a f4650n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f4651o;

        /* renamed from: p, reason: collision with root package name */
        private long f4652p;

        /* renamed from: q, reason: collision with root package name */
        private long f4653q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f4654r;

        /* loaded from: classes.dex */
        public static final class a {
            private boolean a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f4655b;

            /* renamed from: c, reason: collision with root package name */
            private uf.b f4656c;

            /* renamed from: d, reason: collision with root package name */
            private int f4657d;

            /* renamed from: e, reason: collision with root package name */
            private int f4658e;

            /* renamed from: f, reason: collision with root package name */
            private int f4659f;

            /* renamed from: g, reason: collision with root package name */
            private int f4660g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f4661h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f4662i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f4663j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f4664k;

            /* renamed from: l, reason: collision with root package name */
            private int f4665l;

            /* renamed from: m, reason: collision with root package name */
            private int f4666m;

            /* renamed from: n, reason: collision with root package name */
            private int f4667n;

            /* renamed from: o, reason: collision with root package name */
            private int f4668o;

            /* renamed from: p, reason: collision with root package name */
            private int f4669p;

            private a() {
            }

            public boolean b() {
                int i10;
                return this.f4655b && ((i10 = this.f4658e) == 7 || i10 == 2);
            }

            public void a() {
                this.f4655b = false;
                this.a = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.a) {
                    return false;
                }
                if (!aVar.a) {
                    return true;
                }
                uf.b bVar = (uf.b) a1.b(this.f4656c);
                uf.b bVar2 = (uf.b) a1.b(aVar.f4656c);
                return (this.f4659f == aVar.f4659f && this.f4660g == aVar.f4660g && this.f4661h == aVar.f4661h && (!this.f4662i || !aVar.f4662i || this.f4663j == aVar.f4663j) && (((i10 = this.f4657d) == (i11 = aVar.f4657d) || (i10 != 0 && i11 != 0)) && (((i12 = bVar.f8389k) != 0 || bVar2.f8389k != 0 || (this.f4666m == aVar.f4666m && this.f4667n == aVar.f4667n)) && ((i12 != 1 || bVar2.f8389k != 1 || (this.f4668o == aVar.f4668o && this.f4669p == aVar.f4669p)) && (z10 = this.f4664k) == aVar.f4664k && (!z10 || this.f4665l == aVar.f4665l))))) ? false : true;
            }

            public void a(uf.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f4656c = bVar;
                this.f4657d = i10;
                this.f4658e = i11;
                this.f4659f = i12;
                this.f4660g = i13;
                this.f4661h = z10;
                this.f4662i = z11;
                this.f4663j = z12;
                this.f4664k = z13;
                this.f4665l = i14;
                this.f4666m = i15;
                this.f4667n = i16;
                this.f4668o = i17;
                this.f4669p = i18;
                this.a = true;
                this.f4655b = true;
            }

            public void a(int i10) {
                this.f4658e = i10;
                this.f4655b = true;
            }
        }

        public b(ro roVar, boolean z10, boolean z11) {
            this.a = roVar;
            this.f4638b = z10;
            this.f4639c = z11;
            this.f4649m = new a();
            this.f4650n = new a();
            byte[] bArr = new byte[128];
            this.f4643g = bArr;
            this.f4642f = new zg(bArr, 0, 0);
            b();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fa.b.a(byte[], int, int):void");
        }

        public void b() {
            this.f4647k = false;
            this.f4651o = false;
            this.f4650n.a();
        }

        public boolean a(long j3, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f4645i == 9 || (this.f4639c && this.f4650n.a(this.f4649m))) {
                if (z10 && this.f4651o) {
                    a(i10 + ((int) (j3 - this.f4646j)));
                }
                this.f4652p = this.f4646j;
                this.f4653q = this.f4648l;
                this.f4654r = false;
                this.f4651o = true;
            }
            if (this.f4638b) {
                z11 = this.f4650n.b();
            }
            boolean z13 = this.f4654r;
            int i11 = this.f4645i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f4654r = z14;
            return z14;
        }

        public boolean a() {
            return this.f4639c;
        }

        private void a(int i10) {
            long j3 = this.f4653q;
            if (j3 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f4654r;
            this.a.a(j3, z10 ? 1 : 0, (int) (this.f4646j - this.f4652p), i10, null);
        }

        public void a(uf.a aVar) {
            this.f4641e.append(aVar.a, aVar);
        }

        public void a(uf.b bVar) {
            this.f4640d.append(bVar.f8382d, bVar);
        }

        public void a(long j3, int i10, long j10) {
            this.f4645i = i10;
            this.f4648l = j10;
            this.f4646j = j3;
            if (!this.f4638b || i10 != 1) {
                if (!this.f4639c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f4649m;
            this.f4649m = this.f4650n;
            this.f4650n = aVar;
            aVar.a();
            this.f4644h = 0;
            this.f4647k = true;
        }
    }

    private void a(byte[] bArr, int i10, int i11) {
        if (!this.f4634l || this.f4633k.a()) {
            this.f4626d.a(bArr, i10, i11);
            this.f4627e.a(bArr, i10, i11);
        }
        this.f4628f.a(bArr, i10, i11);
        this.f4633k.a(bArr, i10, i11);
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f4635m = j3;
        }
        this.f4636n |= (i10 & 2) != 0;
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f4629g = 0L;
        this.f4636n = false;
        this.f4635m = C.TIME_UNSET;
        uf.a(this.f4630h);
        this.f4626d.b();
        this.f4627e.b();
        this.f4628f.b();
        b bVar = this.f4633k;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void a(long j3, int i10, long j10) {
        if (!this.f4634l || this.f4633k.a()) {
            this.f4626d.b(i10);
            this.f4627e.b(i10);
        }
        this.f4628f.b(i10);
        this.f4633k.a(j3, i10, j10);
    }
}
