package com.applovin.impl;

import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class fh implements ep {

    /* renamed from: a, reason: collision with root package name */
    private final o7 f7699a;
    private final xg b = new xg(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f7700c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f7701d;

    /* renamed from: e, reason: collision with root package name */
    private io f7702e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7703f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7704g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7705h;

    /* renamed from: i, reason: collision with root package name */
    private int f7706i;

    /* renamed from: j, reason: collision with root package name */
    private int f7707j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7708k;
    private long l;

    public fh(o7 o7Var) {
        this.f7699a = o7Var;
    }

    private boolean b() {
        this.b.c(0);
        int a6 = this.b.a(24);
        if (a6 != 1) {
            L.p(a6, "Unexpected start code prefix: ", "PesReader");
            this.f7707j = -1;
            return false;
        }
        this.b.d(8);
        int a9 = this.b.a(16);
        this.b.d(5);
        this.f7708k = this.b.f();
        this.b.d(2);
        this.f7703f = this.b.f();
        this.f7704g = this.b.f();
        this.b.d(6);
        int a10 = this.b.a(8);
        this.f7706i = a10;
        if (a9 == 0) {
            this.f7707j = -1;
        } else {
            int i9 = (a9 - 3) - a10;
            this.f7707j = i9;
            if (i9 < 0) {
                kc.d("PesReader", "Found negative packet payload size: " + this.f7707j);
                this.f7707j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.b.c(0);
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (this.f7703f) {
            this.b.d(4);
            this.b.d(1);
            this.b.d(1);
            long a6 = (this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15);
            this.b.d(1);
            if (!this.f7705h && this.f7704g) {
                this.b.d(4);
                this.b.d(1);
                this.b.d(1);
                this.b.d(1);
                this.f7702e.b((this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15));
                this.f7705h = true;
            }
            this.l = this.f7702e.b(a6);
        }
    }

    @Override // com.applovin.impl.ep
    public final void a(yg ygVar, int i9) {
        AbstractC0669a1.b(this.f7702e);
        if ((i9 & 1) != 0) {
            int i10 = this.f7700c;
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2) {
                    kc.d("PesReader", "Unexpected start indicator reading extended header");
                } else if (i10 == 3) {
                    if (this.f7707j != -1) {
                        kc.d("PesReader", "Unexpected start indicator: expected " + this.f7707j + " more bytes");
                    }
                    this.f7699a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        while (ygVar.a() > 0) {
            int i11 = this.f7700c;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (a(ygVar, this.b.f12177a, Math.min(10, this.f7706i)) && a(ygVar, (byte[]) null, this.f7706i)) {
                            c();
                            i9 |= this.f7708k ? 4 : 0;
                            this.f7699a.a(this.l, i9);
                            a(3);
                        }
                    } else if (i11 == 3) {
                        int a6 = ygVar.a();
                        int i12 = this.f7707j;
                        int i13 = i12 != -1 ? a6 - i12 : 0;
                        if (i13 > 0) {
                            a6 -= i13;
                            ygVar.e(ygVar.d() + a6);
                        }
                        this.f7699a.a(ygVar);
                        int i14 = this.f7707j;
                        if (i14 != -1) {
                            int i15 = i14 - a6;
                            this.f7707j = i15;
                            if (i15 == 0) {
                                this.f7699a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(ygVar, this.b.f12177a, 9)) {
                    a(b() ? 2 : 0);
                }
            } else {
                ygVar.g(ygVar.a());
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i9) {
        int min = Math.min(ygVar.a(), i9 - this.f7701d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ygVar.g(min);
        } else {
            ygVar.a(bArr, this.f7701d, min);
        }
        int i10 = this.f7701d + min;
        this.f7701d = i10;
        return i10 == i9;
    }

    @Override // com.applovin.impl.ep
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f7702e = ioVar;
        this.f7699a.a(k8Var, dVar);
    }

    @Override // com.applovin.impl.ep
    public final void a() {
        this.f7700c = 0;
        this.f7701d = 0;
        this.f7705h = false;
        this.f7699a.a();
    }

    private void a(int i9) {
        this.f7700c = i9;
        this.f7701d = 0;
    }
}
