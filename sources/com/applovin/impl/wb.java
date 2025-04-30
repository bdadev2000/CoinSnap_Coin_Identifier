package com.applovin.impl;

import com.applovin.impl.AbstractC0667a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* loaded from: classes.dex */
public final class wb implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f11960a;
    private final yg b;

    /* renamed from: c, reason: collision with root package name */
    private final xg f11961c;

    /* renamed from: d, reason: collision with root package name */
    private ro f11962d;

    /* renamed from: e, reason: collision with root package name */
    private String f11963e;

    /* renamed from: f, reason: collision with root package name */
    private d9 f11964f;

    /* renamed from: g, reason: collision with root package name */
    private int f11965g;

    /* renamed from: h, reason: collision with root package name */
    private int f11966h;

    /* renamed from: i, reason: collision with root package name */
    private int f11967i;

    /* renamed from: j, reason: collision with root package name */
    private int f11968j;

    /* renamed from: k, reason: collision with root package name */
    private long f11969k;
    private boolean l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private int f11970n;

    /* renamed from: o, reason: collision with root package name */
    private int f11971o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11972p;

    /* renamed from: q, reason: collision with root package name */
    private long f11973q;

    /* renamed from: r, reason: collision with root package name */
    private int f11974r;

    /* renamed from: s, reason: collision with root package name */
    private long f11975s;

    /* renamed from: t, reason: collision with root package name */
    private int f11976t;

    /* renamed from: u, reason: collision with root package name */
    private String f11977u;

    public wb(String str) {
        this.f11960a = str;
        yg ygVar = new yg(1024);
        this.b = ygVar;
        this.f11961c = new xg(ygVar.c());
        this.f11969k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private int c(xg xgVar) {
        int b = xgVar.b();
        AbstractC0667a.b a6 = AbstractC0667a.a(xgVar, true);
        this.f11977u = a6.f6543c;
        this.f11974r = a6.f6542a;
        this.f11976t = a6.b;
        return b - xgVar.b();
    }

    private void d(xg xgVar) {
        int a6 = xgVar.a(3);
        this.f11971o = a6;
        if (a6 != 0) {
            if (a6 != 1) {
                if (a6 != 3 && a6 != 4 && a6 != 5) {
                    if (a6 != 6 && a6 != 7) {
                        throw new IllegalStateException();
                    }
                    xgVar.d(1);
                    return;
                }
                xgVar.d(6);
                return;
            }
            xgVar.d(9);
            return;
        }
        xgVar.d(8);
    }

    private int e(xg xgVar) {
        int a6;
        if (this.f11971o == 0) {
            int i9 = 0;
            do {
                a6 = xgVar.a(8);
                i9 += a6;
            } while (a6 == 255);
            return i9;
        }
        throw ah.a(null, null);
    }

    private void f(xg xgVar) {
        int i9;
        boolean f9;
        int a6 = xgVar.a(1);
        if (a6 == 1) {
            i9 = xgVar.a(1);
        } else {
            i9 = 0;
        }
        this.m = i9;
        if (i9 == 0) {
            if (a6 == 1) {
                a(xgVar);
            }
            if (xgVar.f()) {
                this.f11970n = xgVar.a(6);
                int a9 = xgVar.a(4);
                int a10 = xgVar.a(3);
                if (a9 == 0 && a10 == 0) {
                    if (a6 == 0) {
                        int e4 = xgVar.e();
                        int c9 = c(xgVar);
                        xgVar.c(e4);
                        byte[] bArr = new byte[(c9 + 7) / 8];
                        xgVar.a(bArr, 0, c9);
                        d9 a11 = new d9.b().c(this.f11963e).f(MimeTypes.AUDIO_AAC).a(this.f11977u).c(this.f11976t).n(this.f11974r).a(Collections.singletonList(bArr)).e(this.f11960a).a();
                        if (!a11.equals(this.f11964f)) {
                            this.f11964f = a11;
                            this.f11975s = 1024000000 / a11.f7195A;
                            this.f11962d.a(a11);
                        }
                    } else {
                        xgVar.d(((int) a(xgVar)) - c(xgVar));
                    }
                    d(xgVar);
                    boolean f10 = xgVar.f();
                    this.f11972p = f10;
                    this.f11973q = 0L;
                    if (f10) {
                        if (a6 == 1) {
                            this.f11973q = a(xgVar);
                        }
                        do {
                            f9 = xgVar.f();
                            this.f11973q = (this.f11973q << 8) + xgVar.a(8);
                        } while (f9);
                    }
                    if (xgVar.f()) {
                        xgVar.d(8);
                        return;
                    }
                    return;
                }
                throw ah.a(null, null);
            }
            throw ah.a(null, null);
        }
        throw ah.a(null, null);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        AbstractC0669a1.b(this.f11962d);
        while (ygVar.a() > 0) {
            int i9 = this.f11965g;
            if (i9 != 0) {
                if (i9 == 1) {
                    int w2 = ygVar.w();
                    if ((w2 & 224) == 224) {
                        this.f11968j = w2;
                        this.f11965g = 2;
                    } else if (w2 != 86) {
                        this.f11965g = 0;
                    }
                } else if (i9 == 2) {
                    int w9 = ((this.f11968j & (-225)) << 8) | ygVar.w();
                    this.f11967i = w9;
                    if (w9 > this.b.c().length) {
                        a(this.f11967i);
                    }
                    this.f11966h = 0;
                    this.f11965g = 3;
                } else if (i9 == 3) {
                    int min = Math.min(ygVar.a(), this.f11967i - this.f11966h);
                    ygVar.a(this.f11961c.f12177a, this.f11966h, min);
                    int i10 = this.f11966h + min;
                    this.f11966h = i10;
                    if (i10 == this.f11967i) {
                        this.f11961c.c(0);
                        b(this.f11961c);
                        this.f11965g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (ygVar.w() == 86) {
                this.f11965g = 1;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    private void b(xg xgVar) {
        if (!xgVar.f()) {
            this.l = true;
            f(xgVar);
        } else if (!this.l) {
            return;
        }
        if (this.m == 0) {
            if (this.f11970n == 0) {
                a(xgVar, e(xgVar));
                if (this.f11972p) {
                    xgVar.d((int) this.f11973q);
                    return;
                }
                return;
            }
            throw ah.a(null, null);
        }
        throw ah.a(null, null);
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f11962d = k8Var.a(dVar.c(), 1);
        this.f11963e = dVar.b();
    }

    private static long a(xg xgVar) {
        return xgVar.a((xgVar.a(2) + 1) * 8);
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f11969k = j7;
        }
    }

    private void a(xg xgVar, int i9) {
        int e4 = xgVar.e();
        if ((e4 & 7) == 0) {
            this.b.f(e4 >> 3);
        } else {
            xgVar.a(this.b.c(), 0, i9 * 8);
            this.b.f(0);
        }
        this.f11962d.a(this.b, i9);
        long j7 = this.f11969k;
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f11962d.a(j7, 1, i9, 0, null);
            this.f11969k += this.f11975s;
        }
    }

    private void a(int i9) {
        this.b.d(i9);
        this.f11961c.a(this.b.c());
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f11965g = 0;
        this.f11969k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.l = false;
    }
}
