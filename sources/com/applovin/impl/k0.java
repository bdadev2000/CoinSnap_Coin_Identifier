package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.dp;
import com.applovin.impl.f9;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class k0 implements q7 {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f24763v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24764a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f24765b;

    /* renamed from: c, reason: collision with root package name */
    private final bh f24766c;
    private final String d;
    private String e;

    /* renamed from: f, reason: collision with root package name */
    private qo f24767f;

    /* renamed from: g, reason: collision with root package name */
    private qo f24768g;

    /* renamed from: h, reason: collision with root package name */
    private int f24769h;

    /* renamed from: i, reason: collision with root package name */
    private int f24770i;

    /* renamed from: j, reason: collision with root package name */
    private int f24771j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24772k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24773l;

    /* renamed from: m, reason: collision with root package name */
    private int f24774m;

    /* renamed from: n, reason: collision with root package name */
    private int f24775n;

    /* renamed from: o, reason: collision with root package name */
    private int f24776o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f24777p;

    /* renamed from: q, reason: collision with root package name */
    private long f24778q;

    /* renamed from: r, reason: collision with root package name */
    private int f24779r;

    /* renamed from: s, reason: collision with root package name */
    private long f24780s;

    /* renamed from: t, reason: collision with root package name */
    private qo f24781t;

    /* renamed from: u, reason: collision with root package name */
    private long f24782u;

    public k0(boolean z2) {
        this(z2, null);
    }

    private void c() {
        b1.a(this.f24767f);
        xp.a(this.f24781t);
        xp.a(this.f24768g);
    }

    private void e() {
        this.f24765b.c(0);
        if (this.f24777p) {
            this.f24765b.d(10);
        } else {
            int i2 = 2;
            int a2 = this.f24765b.a(2) + 1;
            if (a2 != 2) {
                pc.d("AdtsReader", "Detected audio object type: " + a2 + ", but assuming AAC LC.");
            } else {
                i2 = a2;
            }
            this.f24765b.d(5);
            byte[] a3 = a.a(i2, this.f24775n, this.f24765b.a(3));
            a.b a4 = a.a(a3);
            f9 a5 = new f9.b().c(this.e).f("audio/mp4a-latm").a(a4.f22663c).c(a4.f22662b).n(a4.f22661a).a(Collections.singletonList(a3)).e(this.d).a();
            this.f24778q = 1024000000 / a5.A;
            this.f24767f.a(a5);
            this.f24777p = true;
        }
        this.f24765b.d(4);
        int a6 = this.f24765b.a(13);
        int i3 = a6 - 7;
        if (this.f24772k) {
            i3 = a6 - 9;
        }
        a(this.f24767f, this.f24778q, 0, i3);
    }

    private void f() {
        this.f24768g.a(this.f24766c, 10);
        this.f24766c.f(6);
        a(this.f24768g, 0L, 10, this.f24766c.v() + 10);
    }

    private void g() {
        this.f24773l = false;
        i();
    }

    private void h() {
        this.f24769h = 1;
        this.f24770i = 0;
    }

    private void i() {
        this.f24769h = 0;
        this.f24770i = 0;
        this.f24771j = 256;
    }

    private void j() {
        this.f24769h = 3;
        this.f24770i = 0;
    }

    private void k() {
        this.f24769h = 2;
        this.f24770i = f24763v.length;
        this.f24779r = 0;
        this.f24766c.f(0);
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f24780s = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    public long d() {
        return this.f24778q;
    }

    public k0(boolean z2, String str) {
        this.f24765b = new ah(new byte[7]);
        this.f24766c = new bh(Arrays.copyOf(f24763v, 10));
        i();
        this.f24774m = -1;
        this.f24775n = -1;
        this.f24778q = -9223372036854775807L;
        this.f24780s = -9223372036854775807L;
        this.f24764a = z2;
        this.d = str;
    }

    private void a(qo qoVar, long j2, int i2, int i3) {
        this.f24769h = 4;
        this.f24770i = i2;
        this.f24781t = qoVar;
        this.f24782u = j2;
        this.f24779r = i3;
    }

    private void b(bh bhVar) {
        if (bhVar.a() == 0) {
            return;
        }
        this.f24765b.f22849a[0] = bhVar.c()[bhVar.d()];
        this.f24765b.c(2);
        int a2 = this.f24765b.a(4);
        int i2 = this.f24775n;
        if (i2 != -1 && a2 != i2) {
            g();
            return;
        }
        if (!this.f24773l) {
            this.f24773l = true;
            this.f24774m = this.f24776o;
            this.f24775n = a2;
        }
        j();
    }

    private void d(bh bhVar) {
        int min = Math.min(bhVar.a(), this.f24779r - this.f24770i);
        this.f24781t.a(bhVar, min);
        int i2 = this.f24770i + min;
        this.f24770i = i2;
        int i3 = this.f24779r;
        if (i2 == i3) {
            long j2 = this.f24780s;
            if (j2 != -9223372036854775807L) {
                this.f24781t.a(j2, 1, i3, 0, null);
                this.f24780s += this.f24782u;
            }
            i();
        }
    }

    public static boolean a(int i2) {
        return (i2 & 65526) == 65520;
    }

    private boolean a(bh bhVar, int i2) {
        bhVar.f(i2 + 1);
        if (!b(bhVar, this.f24765b.f22849a, 1)) {
            return false;
        }
        this.f24765b.c(4);
        int a2 = this.f24765b.a(1);
        int i3 = this.f24774m;
        if (i3 != -1 && a2 != i3) {
            return false;
        }
        if (this.f24775n != -1) {
            if (!b(bhVar, this.f24765b.f22849a, 1)) {
                return true;
            }
            this.f24765b.c(2);
            if (this.f24765b.a(4) != this.f24775n) {
                return false;
            }
            bhVar.f(i2 + 2);
        }
        if (!b(bhVar, this.f24765b.f22849a, 4)) {
            return true;
        }
        this.f24765b.c(14);
        int a3 = this.f24765b.a(13);
        if (a3 < 7) {
            return false;
        }
        byte[] c2 = bhVar.c();
        int e = bhVar.e();
        int i4 = i2 + a3;
        if (i4 >= e) {
            return true;
        }
        byte b2 = c2[i4];
        if (b2 == -1) {
            int i5 = i4 + 1;
            if (i5 == e) {
                return true;
            }
            return a((byte) -1, c2[i5]) && ((c2[i5] & 8) >> 3) == a2;
        }
        if (b2 != 73) {
            return false;
        }
        int i6 = i4 + 1;
        if (i6 == e) {
            return true;
        }
        if (c2[i6] != 68) {
            return false;
        }
        int i7 = i4 + 2;
        return i7 == e || c2[i7] == 51;
    }

    private void c(bh bhVar) {
        byte[] c2 = bhVar.c();
        int d = bhVar.d();
        int e = bhVar.e();
        while (d < e) {
            int i2 = d + 1;
            byte b2 = c2[d];
            int i3 = b2 & UnsignedBytes.MAX_VALUE;
            if (this.f24771j == 512 && a((byte) -1, (byte) i3) && (this.f24773l || a(bhVar, d - 1))) {
                this.f24776o = (b2 & 8) >> 3;
                this.f24772k = (b2 & 1) == 0;
                if (!this.f24773l) {
                    h();
                } else {
                    j();
                }
                bhVar.f(i2);
                return;
            }
            int i4 = this.f24771j;
            int i5 = i3 | i4;
            if (i5 == 329) {
                this.f24771j = ViewUtils.EDGE_TO_EDGE_FLAGS;
            } else if (i5 == 511) {
                this.f24771j = 512;
            } else if (i5 == 836) {
                this.f24771j = 1024;
            } else if (i5 == 1075) {
                k();
                bhVar.f(i2);
                return;
            } else if (i4 != 256) {
                this.f24771j = 256;
            }
            d = i2;
        }
        bhVar.f(d);
    }

    private boolean b(bh bhVar, byte[] bArr, int i2) {
        if (bhVar.a() < i2) {
            return false;
        }
        bhVar.a(bArr, 0, i2);
        return true;
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        c();
        while (bhVar.a() > 0) {
            int i2 = this.f24769h;
            if (i2 == 0) {
                c(bhVar);
            } else if (i2 == 1) {
                b(bhVar);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (a(bhVar, this.f24765b.f22849a, this.f24772k ? 7 : 5)) {
                        e();
                    }
                } else if (i2 == 4) {
                    d(bhVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (a(bhVar, this.f24766c.c(), 10)) {
                f();
            }
        }
    }

    private boolean a(bh bhVar, byte[] bArr, int i2) {
        int min = Math.min(bhVar.a(), i2 - this.f24770i);
        bhVar.a(bArr, this.f24770i, min);
        int i3 = this.f24770i + min;
        this.f24770i = i3;
        return i3 == i2;
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.e = dVar.b();
        qo a2 = m8Var.a(dVar.c(), 1);
        this.f24767f = a2;
        this.f24781t = a2;
        if (this.f24764a) {
            dVar.a();
            qo a3 = m8Var.a(dVar.c(), 5);
            this.f24768g = a3;
            a3.a(new f9.b().c(dVar.b()).f("application/id3").a());
            return;
        }
        this.f24768g = new i7();
    }

    private boolean a(byte b2, byte b3) {
        return a(((b2 & UnsignedBytes.MAX_VALUE) << 8) | (b3 & UnsignedBytes.MAX_VALUE));
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f24780s = -9223372036854775807L;
        g();
    }
}
