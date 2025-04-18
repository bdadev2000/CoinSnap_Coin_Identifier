package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import com.applovin.impl.n;

/* loaded from: classes2.dex */
public final class m implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final ah f25161a;

    /* renamed from: b, reason: collision with root package name */
    private final bh f25162b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25163c;
    private String d;
    private qo e;

    /* renamed from: f, reason: collision with root package name */
    private int f25164f;

    /* renamed from: g, reason: collision with root package name */
    private int f25165g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25166h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25167i;

    /* renamed from: j, reason: collision with root package name */
    private long f25168j;

    /* renamed from: k, reason: collision with root package name */
    private f9 f25169k;

    /* renamed from: l, reason: collision with root package name */
    private int f25170l;

    /* renamed from: m, reason: collision with root package name */
    private long f25171m;

    public m() {
        this(null);
    }

    private void c() {
        this.f25161a.c(0);
        n.b a2 = n.a(this.f25161a);
        f9 f9Var = this.f25169k;
        if (f9Var == null || a2.f25624c != f9Var.f23851z || a2.f25623b != f9Var.A || !"audio/ac4".equals(f9Var.f23840m)) {
            f9 a3 = new f9.b().c(this.d).f("audio/ac4").c(a2.f25624c).n(a2.f25623b).e(this.f25163c).a();
            this.f25169k = a3;
            this.e.a(a3);
        }
        this.f25170l = a2.d;
        this.f25168j = (a2.e * 1000000) / this.f25169k.A;
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f25164f = 0;
        this.f25165g = 0;
        this.f25166h = false;
        this.f25167i = false;
        this.f25171m = -9223372036854775807L;
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    public m(String str) {
        ah ahVar = new ah(new byte[16]);
        this.f25161a = ahVar;
        this.f25162b = new bh(ahVar.f22849a);
        this.f25164f = 0;
        this.f25165g = 0;
        this.f25166h = false;
        this.f25167i = false;
        this.f25171m = -9223372036854775807L;
        this.f25163c = str;
    }

    private boolean b(bh bhVar) {
        int w;
        while (true) {
            if (bhVar.a() <= 0) {
                return false;
            }
            if (!this.f25166h) {
                this.f25166h = bhVar.w() == 172;
            } else {
                w = bhVar.w();
                this.f25166h = w == 172;
                if (w == 64 || w == 65) {
                    break;
                }
            }
        }
        this.f25167i = w == 65;
        return true;
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f25171m = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        b1.b(this.e);
        while (bhVar.a() > 0) {
            int i2 = this.f25164f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(bhVar.a(), this.f25170l - this.f25165g);
                        this.e.a(bhVar, min);
                        int i3 = this.f25165g + min;
                        this.f25165g = i3;
                        int i4 = this.f25170l;
                        if (i3 == i4) {
                            long j2 = this.f25171m;
                            if (j2 != -9223372036854775807L) {
                                this.e.a(j2, 1, i4, 0, null);
                                this.f25171m += this.f25168j;
                            }
                            this.f25164f = 0;
                        }
                    }
                } else if (a(bhVar, this.f25162b.c(), 16)) {
                    c();
                    this.f25162b.f(0);
                    this.e.a(this.f25162b, 16);
                    this.f25164f = 2;
                }
            } else if (b(bhVar)) {
                this.f25164f = 1;
                this.f25162b.c()[0] = -84;
                this.f25162b.c()[1] = (byte) (this.f25167i ? 65 : 64);
                this.f25165g = 2;
            }
        }
    }

    private boolean a(bh bhVar, byte[] bArr, int i2) {
        int min = Math.min(bhVar.a(), i2 - this.f25165g);
        bhVar.a(bArr, this.f25165g, min);
        int i3 = this.f25165g + min;
        this.f25165g = i3;
        return i3 == i2;
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = m8Var.a(dVar.c(), 1);
    }
}
