package com.applovin.impl;

import com.applovin.impl.dp;

/* loaded from: classes.dex */
public final class ih implements dp {

    /* renamed from: a, reason: collision with root package name */
    private final q7 f24471a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f24472b = new ah(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f24473c = 0;
    private int d;
    private ho e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24474f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24475g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24476h;

    /* renamed from: i, reason: collision with root package name */
    private int f24477i;

    /* renamed from: j, reason: collision with root package name */
    private int f24478j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24479k;

    /* renamed from: l, reason: collision with root package name */
    private long f24480l;

    public ih(q7 q7Var) {
        this.f24471a = q7Var;
    }

    private void a(int i2) {
        this.f24473c = i2;
        this.d = 0;
    }

    private boolean b() {
        this.f24472b.c(0);
        int a2 = this.f24472b.a(24);
        if (a2 != 1) {
            com.applovin.impl.adview.t.u("Unexpected start code prefix: ", a2, "PesReader");
            this.f24478j = -1;
            return false;
        }
        this.f24472b.d(8);
        int a3 = this.f24472b.a(16);
        this.f24472b.d(5);
        this.f24479k = this.f24472b.f();
        this.f24472b.d(2);
        this.f24474f = this.f24472b.f();
        this.f24475g = this.f24472b.f();
        this.f24472b.d(6);
        int a4 = this.f24472b.a(8);
        this.f24477i = a4;
        if (a3 == 0) {
            this.f24478j = -1;
        } else {
            int i2 = (a3 - 3) - a4;
            this.f24478j = i2;
            if (i2 < 0) {
                pc.d("PesReader", "Found negative packet payload size: " + this.f24478j);
                this.f24478j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.f24472b.c(0);
        this.f24480l = -9223372036854775807L;
        if (this.f24474f) {
            this.f24472b.d(4);
            this.f24472b.d(1);
            this.f24472b.d(1);
            long a2 = (this.f24472b.a(3) << 30) | (this.f24472b.a(15) << 15) | this.f24472b.a(15);
            this.f24472b.d(1);
            if (!this.f24476h && this.f24475g) {
                this.f24472b.d(4);
                this.f24472b.d(1);
                this.f24472b.d(1);
                this.f24472b.d(1);
                this.e.b((this.f24472b.a(3) << 30) | (this.f24472b.a(15) << 15) | this.f24472b.a(15));
                this.f24476h = true;
            }
            this.f24480l = this.e.b(a2);
        }
    }

    @Override // com.applovin.impl.dp
    public final void a(bh bhVar, int i2) {
        b1.b(this.e);
        if ((i2 & 1) != 0) {
            int i3 = this.f24473c;
            if (i3 != 0 && i3 != 1) {
                if (i3 == 2) {
                    pc.d("PesReader", "Unexpected start indicator reading extended header");
                } else if (i3 == 3) {
                    if (this.f24478j != -1) {
                        pc.d("PesReader", "Unexpected start indicator: expected " + this.f24478j + " more bytes");
                    }
                    this.f24471a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        while (bhVar.a() > 0) {
            int i4 = this.f24473c;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (a(bhVar, this.f24472b.f22849a, Math.min(10, this.f24477i)) && a(bhVar, (byte[]) null, this.f24477i)) {
                            c();
                            i2 |= this.f24479k ? 4 : 0;
                            this.f24471a.a(this.f24480l, i2);
                            a(3);
                        }
                    } else if (i4 == 3) {
                        int a2 = bhVar.a();
                        int i5 = this.f24478j;
                        int i6 = i5 != -1 ? a2 - i5 : 0;
                        if (i6 > 0) {
                            a2 -= i6;
                            bhVar.e(bhVar.d() + a2);
                        }
                        this.f24471a.a(bhVar);
                        int i7 = this.f24478j;
                        if (i7 != -1) {
                            int i8 = i7 - a2;
                            this.f24478j = i8;
                            if (i8 == 0) {
                                this.f24471a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(bhVar, this.f24472b.f22849a, 9)) {
                    a(b() ? 2 : 0);
                }
            } else {
                bhVar.g(bhVar.a());
            }
        }
    }

    private boolean a(bh bhVar, byte[] bArr, int i2) {
        int min = Math.min(bhVar.a(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            bhVar.g(min);
        } else {
            bhVar.a(bArr, this.d, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }

    @Override // com.applovin.impl.dp
    public void a(ho hoVar, m8 m8Var, dp.d dVar) {
        this.e = hoVar;
        this.f24471a.a(m8Var, dVar);
    }

    @Override // com.applovin.impl.dp
    public final void a() {
        this.f24473c = 0;
        this.d = 0;
        this.f24476h = false;
        this.f24471a.a();
    }
}
