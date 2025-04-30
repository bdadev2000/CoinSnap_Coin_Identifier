package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractC0667a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.applovin.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715k0 implements o7 {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f8510v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8511a;
    private final xg b;

    /* renamed from: c, reason: collision with root package name */
    private final yg f8512c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8513d;

    /* renamed from: e, reason: collision with root package name */
    private String f8514e;

    /* renamed from: f, reason: collision with root package name */
    private ro f8515f;

    /* renamed from: g, reason: collision with root package name */
    private ro f8516g;

    /* renamed from: h, reason: collision with root package name */
    private int f8517h;

    /* renamed from: i, reason: collision with root package name */
    private int f8518i;

    /* renamed from: j, reason: collision with root package name */
    private int f8519j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8520k;
    private boolean l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private int f8521n;

    /* renamed from: o, reason: collision with root package name */
    private int f8522o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8523p;

    /* renamed from: q, reason: collision with root package name */
    private long f8524q;

    /* renamed from: r, reason: collision with root package name */
    private int f8525r;

    /* renamed from: s, reason: collision with root package name */
    private long f8526s;

    /* renamed from: t, reason: collision with root package name */
    private ro f8527t;

    /* renamed from: u, reason: collision with root package name */
    private long f8528u;

    public C0715k0(boolean z8) {
        this(z8, null);
    }

    public static boolean a(int i9) {
        return (i9 & 65526) == 65520;
    }

    private void c() {
        AbstractC0669a1.a(this.f8515f);
        yp.a(this.f8527t);
        yp.a(this.f8516g);
    }

    private void e() {
        this.b.c(0);
        if (!this.f8523p) {
            int i9 = 2;
            int a6 = this.b.a(2) + 1;
            if (a6 != 2) {
                kc.d("AdtsReader", "Detected audio object type: " + a6 + ", but assuming AAC LC.");
            } else {
                i9 = a6;
            }
            this.b.d(5);
            byte[] a9 = AbstractC0667a.a(i9, this.f8521n, this.b.a(3));
            AbstractC0667a.b a10 = AbstractC0667a.a(a9);
            d9 a11 = new d9.b().c(this.f8514e).f(MimeTypes.AUDIO_AAC).a(a10.f6543c).c(a10.b).n(a10.f6542a).a(Collections.singletonList(a9)).e(this.f8513d).a();
            this.f8524q = 1024000000 / a11.f7195A;
            this.f8515f.a(a11);
            this.f8523p = true;
        } else {
            this.b.d(10);
        }
        this.b.d(4);
        int a12 = this.b.a(13);
        int i10 = a12 - 7;
        if (this.f8520k) {
            i10 = a12 - 9;
        }
        a(this.f8515f, this.f8524q, 0, i10);
    }

    private void f() {
        this.f8516g.a(this.f8512c, 10);
        this.f8512c.f(6);
        a(this.f8516g, 0L, 10, this.f8512c.v() + 10);
    }

    private void g() {
        this.l = false;
        i();
    }

    private void h() {
        this.f8517h = 1;
        this.f8518i = 0;
    }

    private void i() {
        this.f8517h = 0;
        this.f8518i = 0;
        this.f8519j = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    private void j() {
        this.f8517h = 3;
        this.f8518i = 0;
    }

    private void k() {
        this.f8517h = 2;
        this.f8518i = f8510v.length;
        this.f8525r = 0;
        this.f8512c.f(0);
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public long d() {
        return this.f8524q;
    }

    public C0715k0(boolean z8, String str) {
        this.b = new xg(new byte[7]);
        this.f8512c = new yg(Arrays.copyOf(f8510v, 10));
        i();
        this.m = -1;
        this.f8521n = -1;
        this.f8524q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8526s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8511a = z8;
        this.f8513d = str;
    }

    private boolean a(yg ygVar, int i9) {
        ygVar.f(i9 + 1);
        if (!b(ygVar, this.b.f12177a, 1)) {
            return false;
        }
        this.b.c(4);
        int a6 = this.b.a(1);
        int i10 = this.m;
        if (i10 != -1 && a6 != i10) {
            return false;
        }
        if (this.f8521n != -1) {
            if (!b(ygVar, this.b.f12177a, 1)) {
                return true;
            }
            this.b.c(2);
            if (this.b.a(4) != this.f8521n) {
                return false;
            }
            ygVar.f(i9 + 2);
        }
        if (!b(ygVar, this.b.f12177a, 4)) {
            return true;
        }
        this.b.c(14);
        int a9 = this.b.a(13);
        if (a9 < 7) {
            return false;
        }
        byte[] c9 = ygVar.c();
        int e4 = ygVar.e();
        int i11 = i9 + a9;
        if (i11 >= e4) {
            return true;
        }
        byte b = c9[i11];
        if (b == -1) {
            int i12 = i11 + 1;
            if (i12 == e4) {
                return true;
            }
            return a((byte) -1, c9[i12]) && ((c9[i12] & 8) >> 3) == a6;
        }
        if (b != 73) {
            return false;
        }
        int i13 = i11 + 1;
        if (i13 == e4) {
            return true;
        }
        if (c9[i13] != 68) {
            return false;
        }
        int i14 = i11 + 2;
        return i14 == e4 || c9[i14] == 51;
    }

    private void b(yg ygVar) {
        if (ygVar.a() == 0) {
            return;
        }
        this.b.f12177a[0] = ygVar.c()[ygVar.d()];
        this.b.c(2);
        int a6 = this.b.a(4);
        int i9 = this.f8521n;
        if (i9 != -1 && a6 != i9) {
            g();
            return;
        }
        if (!this.l) {
            this.l = true;
            this.m = this.f8522o;
            this.f8521n = a6;
        }
        j();
    }

    private void d(yg ygVar) {
        int min = Math.min(ygVar.a(), this.f8525r - this.f8518i);
        this.f8527t.a(ygVar, min);
        int i9 = this.f8518i + min;
        this.f8518i = i9;
        int i10 = this.f8525r;
        if (i9 == i10) {
            long j7 = this.f8526s;
            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.f8527t.a(j7, 1, i10, 0, null);
                this.f8526s += this.f8528u;
            }
            i();
        }
    }

    private void c(yg ygVar) {
        byte[] c9 = ygVar.c();
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        while (d2 < e4) {
            int i9 = d2 + 1;
            byte b = c9[d2];
            int i10 = b & 255;
            if (this.f8519j == 512 && a((byte) -1, (byte) i10) && (this.l || a(ygVar, d2 - 1))) {
                this.f8522o = (b & 8) >> 3;
                this.f8520k = (b & 1) == 0;
                if (!this.l) {
                    h();
                } else {
                    j();
                }
                ygVar.f(i9);
                return;
            }
            int i11 = this.f8519j;
            int i12 = i10 | i11;
            if (i12 == 329) {
                this.f8519j = 768;
            } else if (i12 == 511) {
                this.f8519j = 512;
            } else if (i12 == 836) {
                this.f8519j = 1024;
            } else if (i12 == 1075) {
                k();
                ygVar.f(i9);
                return;
            } else if (i11 != 256) {
                this.f8519j = NotificationCompat.FLAG_LOCAL_ONLY;
            }
            d2 = i9;
        }
        ygVar.f(d2);
    }

    private boolean b(yg ygVar, byte[] bArr, int i9) {
        if (ygVar.a() < i9) {
            return false;
        }
        ygVar.a(bArr, 0, i9);
        return true;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int i9 = this.f8517h;
            if (i9 == 0) {
                c(ygVar);
            } else if (i9 == 1) {
                b(ygVar);
            } else if (i9 != 2) {
                if (i9 == 3) {
                    if (a(ygVar, this.b.f12177a, this.f8520k ? 7 : 5)) {
                        e();
                    }
                } else if (i9 == 4) {
                    d(ygVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(ygVar, this.f8512c.c(), 10)) {
                f();
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i9) {
        int min = Math.min(ygVar.a(), i9 - this.f8518i);
        ygVar.a(bArr, this.f8518i, min);
        int i10 = this.f8518i + min;
        this.f8518i = i10;
        return i10 == i9;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f8514e = dVar.b();
        ro a6 = k8Var.a(dVar.c(), 1);
        this.f8515f = a6;
        this.f8527t = a6;
        if (this.f8511a) {
            dVar.a();
            ro a9 = k8Var.a(dVar.c(), 5);
            this.f8516g = a9;
            a9.a(new d9.b().c(dVar.b()).f(MimeTypes.APPLICATION_ID3).a());
            return;
        }
        this.f8516g = new g7();
    }

    private boolean a(byte b, byte b8) {
        return a(((b & 255) << 8) | (b8 & 255));
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f8526s = j7;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f8526s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        g();
    }

    private void a(ro roVar, long j7, int i9, int i10) {
        this.f8517h = 4;
        this.f8518i = i9;
        this.f8527t = roVar;
        this.f8528u = j7;
        this.f8525r = i10;
    }
}
