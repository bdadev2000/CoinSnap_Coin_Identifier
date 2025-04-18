package com.applovin.impl;

import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class fh implements ep {
    private final o7 a;

    /* renamed from: b, reason: collision with root package name */
    private final xg f4742b = new xg(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f4743c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f4744d;

    /* renamed from: e, reason: collision with root package name */
    private io f4745e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4746f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4747g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4748h;

    /* renamed from: i, reason: collision with root package name */
    private int f4749i;

    /* renamed from: j, reason: collision with root package name */
    private int f4750j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4751k;

    /* renamed from: l, reason: collision with root package name */
    private long f4752l;

    public fh(o7 o7Var) {
        this.a = o7Var;
    }

    private boolean b() {
        this.f4742b.c(0);
        int a = this.f4742b.a(24);
        if (a != 1) {
            a4.j.u("Unexpected start code prefix: ", a, "PesReader");
            this.f4750j = -1;
            return false;
        }
        this.f4742b.d(8);
        int a10 = this.f4742b.a(16);
        this.f4742b.d(5);
        this.f4751k = this.f4742b.f();
        this.f4742b.d(2);
        this.f4746f = this.f4742b.f();
        this.f4747g = this.f4742b.f();
        this.f4742b.d(6);
        int a11 = this.f4742b.a(8);
        this.f4749i = a11;
        if (a10 == 0) {
            this.f4750j = -1;
        } else {
            int i10 = (a10 - 3) - a11;
            this.f4750j = i10;
            if (i10 < 0) {
                kc.d("PesReader", "Found negative packet payload size: " + this.f4750j);
                this.f4750j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.f4742b.c(0);
        this.f4752l = C.TIME_UNSET;
        if (this.f4746f) {
            this.f4742b.d(4);
            this.f4742b.d(1);
            this.f4742b.d(1);
            long a = (this.f4742b.a(3) << 30) | (this.f4742b.a(15) << 15) | this.f4742b.a(15);
            this.f4742b.d(1);
            if (!this.f4748h && this.f4747g) {
                this.f4742b.d(4);
                this.f4742b.d(1);
                this.f4742b.d(1);
                this.f4742b.d(1);
                this.f4745e.b((this.f4742b.a(3) << 30) | (this.f4742b.a(15) << 15) | this.f4742b.a(15));
                this.f4748h = true;
            }
            this.f4752l = this.f4745e.b(a);
        }
    }

    @Override // com.applovin.impl.ep
    public final void a(yg ygVar, int i10) {
        a1.b(this.f4745e);
        if ((i10 & 1) != 0) {
            int i11 = this.f4743c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    kc.d("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.f4750j != -1) {
                        kc.d("PesReader", "Unexpected start indicator: expected " + this.f4750j + " more bytes");
                    }
                    this.a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        while (ygVar.a() > 0) {
            int i12 = this.f4743c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (a(ygVar, this.f4742b.a, Math.min(10, this.f4749i)) && a(ygVar, (byte[]) null, this.f4749i)) {
                            c();
                            i10 |= this.f4751k ? 4 : 0;
                            this.a.a(this.f4752l, i10);
                            a(3);
                        }
                    } else if (i12 == 3) {
                        int a = ygVar.a();
                        int i13 = this.f4750j;
                        int i14 = i13 != -1 ? a - i13 : 0;
                        if (i14 > 0) {
                            a -= i14;
                            ygVar.e(ygVar.d() + a);
                        }
                        this.a.a(ygVar);
                        int i15 = this.f4750j;
                        if (i15 != -1) {
                            int i16 = i15 - a;
                            this.f4750j = i16;
                            if (i16 == 0) {
                                this.a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(ygVar, this.f4742b.a, 9)) {
                    a(b() ? 2 : 0);
                }
            } else {
                ygVar.g(ygVar.a());
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f4744d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ygVar.g(min);
        } else {
            ygVar.a(bArr, this.f4744d, min);
        }
        int i11 = this.f4744d + min;
        this.f4744d = i11;
        return i11 == i10;
    }

    @Override // com.applovin.impl.ep
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f4745e = ioVar;
        this.a.a(k8Var, dVar);
    }

    @Override // com.applovin.impl.ep
    public final void a() {
        this.f4743c = 0;
        this.f4744d = 0;
        this.f4748h = false;
        this.a.a();
    }

    private void a(int i10) {
        this.f4743c = i10;
        this.f4744d = 0;
    }
}
