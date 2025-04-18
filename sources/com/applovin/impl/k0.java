package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class k0 implements o7 {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f5562v = {73, 68, 51};
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final xg f5563b;

    /* renamed from: c, reason: collision with root package name */
    private final yg f5564c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5565d;

    /* renamed from: e, reason: collision with root package name */
    private String f5566e;

    /* renamed from: f, reason: collision with root package name */
    private ro f5567f;

    /* renamed from: g, reason: collision with root package name */
    private ro f5568g;

    /* renamed from: h, reason: collision with root package name */
    private int f5569h;

    /* renamed from: i, reason: collision with root package name */
    private int f5570i;

    /* renamed from: j, reason: collision with root package name */
    private int f5571j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5572k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5573l;

    /* renamed from: m, reason: collision with root package name */
    private int f5574m;

    /* renamed from: n, reason: collision with root package name */
    private int f5575n;

    /* renamed from: o, reason: collision with root package name */
    private int f5576o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5577p;

    /* renamed from: q, reason: collision with root package name */
    private long f5578q;

    /* renamed from: r, reason: collision with root package name */
    private int f5579r;

    /* renamed from: s, reason: collision with root package name */
    private long f5580s;

    /* renamed from: t, reason: collision with root package name */
    private ro f5581t;
    private long u;

    public k0(boolean z10) {
        this(z10, null);
    }

    public static boolean a(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void c() {
        a1.a(this.f5567f);
        yp.a(this.f5581t);
        yp.a(this.f5568g);
    }

    private void e() {
        this.f5563b.c(0);
        if (!this.f5577p) {
            int i10 = 2;
            int a = this.f5563b.a(2) + 1;
            if (a != 2) {
                kc.d("AdtsReader", "Detected audio object type: " + a + ", but assuming AAC LC.");
            } else {
                i10 = a;
            }
            this.f5563b.d(5);
            byte[] a10 = a.a(i10, this.f5575n, this.f5563b.a(3));
            a.b a11 = a.a(a10);
            d9 a12 = new d9.b().c(this.f5566e).f(MimeTypes.AUDIO_AAC).a(a11.f3565c).c(a11.f3564b).n(a11.a).a(Collections.singletonList(a10)).e(this.f5565d).a();
            this.f5578q = 1024000000 / a12.A;
            this.f5567f.a(a12);
            this.f5577p = true;
        } else {
            this.f5563b.d(10);
        }
        this.f5563b.d(4);
        int a13 = this.f5563b.a(13);
        int i11 = a13 - 7;
        if (this.f5572k) {
            i11 = a13 - 9;
        }
        a(this.f5567f, this.f5578q, 0, i11);
    }

    private void f() {
        this.f5568g.a(this.f5564c, 10);
        this.f5564c.f(6);
        a(this.f5568g, 0L, 10, this.f5564c.v() + 10);
    }

    private void g() {
        this.f5573l = false;
        i();
    }

    private void h() {
        this.f5569h = 1;
        this.f5570i = 0;
    }

    private void i() {
        this.f5569h = 0;
        this.f5570i = 0;
        this.f5571j = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    private void j() {
        this.f5569h = 3;
        this.f5570i = 0;
    }

    private void k() {
        this.f5569h = 2;
        this.f5570i = f5562v.length;
        this.f5579r = 0;
        this.f5564c.f(0);
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public long d() {
        return this.f5578q;
    }

    public k0(boolean z10, String str) {
        this.f5563b = new xg(new byte[7]);
        this.f5564c = new yg(Arrays.copyOf(f5562v, 10));
        i();
        this.f5574m = -1;
        this.f5575n = -1;
        this.f5578q = C.TIME_UNSET;
        this.f5580s = C.TIME_UNSET;
        this.a = z10;
        this.f5565d = str;
    }

    private boolean a(yg ygVar, int i10) {
        ygVar.f(i10 + 1);
        if (!b(ygVar, this.f5563b.a, 1)) {
            return false;
        }
        this.f5563b.c(4);
        int a = this.f5563b.a(1);
        int i11 = this.f5574m;
        if (i11 != -1 && a != i11) {
            return false;
        }
        if (this.f5575n != -1) {
            if (!b(ygVar, this.f5563b.a, 1)) {
                return true;
            }
            this.f5563b.c(2);
            if (this.f5563b.a(4) != this.f5575n) {
                return false;
            }
            ygVar.f(i10 + 2);
        }
        if (!b(ygVar, this.f5563b.a, 4)) {
            return true;
        }
        this.f5563b.c(14);
        int a10 = this.f5563b.a(13);
        if (a10 < 7) {
            return false;
        }
        byte[] c10 = ygVar.c();
        int e2 = ygVar.e();
        int i12 = i10 + a10;
        if (i12 >= e2) {
            return true;
        }
        byte b3 = c10[i12];
        if (b3 == -1) {
            int i13 = i12 + 1;
            if (i13 == e2) {
                return true;
            }
            return a((byte) -1, c10[i13]) && ((c10[i13] & 8) >> 3) == a;
        }
        if (b3 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == e2) {
            return true;
        }
        if (c10[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == e2 || c10[i15] == 51;
    }

    private void b(yg ygVar) {
        if (ygVar.a() == 0) {
            return;
        }
        this.f5563b.a[0] = ygVar.c()[ygVar.d()];
        this.f5563b.c(2);
        int a = this.f5563b.a(4);
        int i10 = this.f5575n;
        if (i10 != -1 && a != i10) {
            g();
            return;
        }
        if (!this.f5573l) {
            this.f5573l = true;
            this.f5574m = this.f5576o;
            this.f5575n = a;
        }
        j();
    }

    private void d(yg ygVar) {
        int min = Math.min(ygVar.a(), this.f5579r - this.f5570i);
        this.f5581t.a(ygVar, min);
        int i10 = this.f5570i + min;
        this.f5570i = i10;
        int i11 = this.f5579r;
        if (i10 == i11) {
            long j3 = this.f5580s;
            if (j3 != C.TIME_UNSET) {
                this.f5581t.a(j3, 1, i11, 0, null);
                this.f5580s += this.u;
            }
            i();
        }
    }

    private void c(yg ygVar) {
        byte[] c10 = ygVar.c();
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        while (d10 < e2) {
            int i10 = d10 + 1;
            byte b3 = c10[d10];
            int i11 = b3 & UByte.MAX_VALUE;
            if (this.f5571j == 512 && a((byte) -1, (byte) i11) && (this.f5573l || a(ygVar, d10 - 1))) {
                this.f5576o = (b3 & 8) >> 3;
                this.f5572k = (b3 & 1) == 0;
                if (!this.f5573l) {
                    h();
                } else {
                    j();
                }
                ygVar.f(i10);
                return;
            }
            int i12 = this.f5571j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f5571j = 768;
            } else if (i13 == 511) {
                this.f5571j = 512;
            } else if (i13 == 836) {
                this.f5571j = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else if (i13 == 1075) {
                k();
                ygVar.f(i10);
                return;
            } else if (i12 != 256) {
                this.f5571j = NotificationCompat.FLAG_LOCAL_ONLY;
            }
            d10 = i10;
        }
        ygVar.f(d10);
    }

    private boolean b(yg ygVar, byte[] bArr, int i10) {
        if (ygVar.a() < i10) {
            return false;
        }
        ygVar.a(bArr, 0, i10);
        return true;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int i10 = this.f5569h;
            if (i10 == 0) {
                c(ygVar);
            } else if (i10 == 1) {
                b(ygVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (a(ygVar, this.f5563b.a, this.f5572k ? 7 : 5)) {
                        e();
                    }
                } else if (i10 == 4) {
                    d(ygVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(ygVar, this.f5564c.c(), 10)) {
                f();
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f5570i);
        ygVar.a(bArr, this.f5570i, min);
        int i11 = this.f5570i + min;
        this.f5570i = i11;
        return i11 == i10;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f5566e = dVar.b();
        ro a = k8Var.a(dVar.c(), 1);
        this.f5567f = a;
        this.f5581t = a;
        if (this.a) {
            dVar.a();
            ro a10 = k8Var.a(dVar.c(), 5);
            this.f5568g = a10;
            a10.a(new d9.b().c(dVar.b()).f(MimeTypes.APPLICATION_ID3).a());
            return;
        }
        this.f5568g = new g7();
    }

    private boolean a(byte b3, byte b10) {
        return a(((b3 & UByte.MAX_VALUE) << 8) | (b10 & UByte.MAX_VALUE));
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f5580s = j3;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f5580s = C.TIME_UNSET;
        g();
    }

    private void a(ro roVar, long j3, int i10, int i11) {
        this.f5569h = 4;
        this.f5570i = i10;
        this.f5581t = roVar;
        this.u = j3;
        this.f5579r = i11;
    }
}
