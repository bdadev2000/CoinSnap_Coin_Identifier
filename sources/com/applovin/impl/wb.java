package com.applovin.impl;

import com.applovin.impl.a;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class wb implements o7 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final yg f8747b;

    /* renamed from: c, reason: collision with root package name */
    private final xg f8748c;

    /* renamed from: d, reason: collision with root package name */
    private ro f8749d;

    /* renamed from: e, reason: collision with root package name */
    private String f8750e;

    /* renamed from: f, reason: collision with root package name */
    private d9 f8751f;

    /* renamed from: g, reason: collision with root package name */
    private int f8752g;

    /* renamed from: h, reason: collision with root package name */
    private int f8753h;

    /* renamed from: i, reason: collision with root package name */
    private int f8754i;

    /* renamed from: j, reason: collision with root package name */
    private int f8755j;

    /* renamed from: k, reason: collision with root package name */
    private long f8756k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8757l;

    /* renamed from: m, reason: collision with root package name */
    private int f8758m;

    /* renamed from: n, reason: collision with root package name */
    private int f8759n;

    /* renamed from: o, reason: collision with root package name */
    private int f8760o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8761p;

    /* renamed from: q, reason: collision with root package name */
    private long f8762q;

    /* renamed from: r, reason: collision with root package name */
    private int f8763r;

    /* renamed from: s, reason: collision with root package name */
    private long f8764s;

    /* renamed from: t, reason: collision with root package name */
    private int f8765t;
    private String u;

    public wb(String str) {
        this.a = str;
        yg ygVar = new yg(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        this.f8747b = ygVar;
        this.f8748c = new xg(ygVar.c());
        this.f8756k = C.TIME_UNSET;
    }

    private int c(xg xgVar) {
        int b3 = xgVar.b();
        a.b a = a.a(xgVar, true);
        this.u = a.f3565c;
        this.f8763r = a.a;
        this.f8765t = a.f3564b;
        return b3 - xgVar.b();
    }

    private void d(xg xgVar) {
        int a = xgVar.a(3);
        this.f8760o = a;
        if (a != 0) {
            if (a != 1) {
                if (a != 3 && a != 4 && a != 5) {
                    if (a != 6 && a != 7) {
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
        int a;
        if (this.f8760o == 0) {
            int i10 = 0;
            do {
                a = xgVar.a(8);
                i10 += a;
            } while (a == 255);
            return i10;
        }
        throw ah.a(null, null);
    }

    private void f(xg xgVar) {
        int i10;
        boolean f10;
        int a = xgVar.a(1);
        if (a == 1) {
            i10 = xgVar.a(1);
        } else {
            i10 = 0;
        }
        this.f8758m = i10;
        if (i10 == 0) {
            if (a == 1) {
                a(xgVar);
            }
            if (xgVar.f()) {
                this.f8759n = xgVar.a(6);
                int a10 = xgVar.a(4);
                int a11 = xgVar.a(3);
                if (a10 == 0 && a11 == 0) {
                    if (a == 0) {
                        int e2 = xgVar.e();
                        int c10 = c(xgVar);
                        xgVar.c(e2);
                        byte[] bArr = new byte[(c10 + 7) / 8];
                        xgVar.a(bArr, 0, c10);
                        d9 a12 = new d9.b().c(this.f8750e).f(MimeTypes.AUDIO_AAC).a(this.u).c(this.f8765t).n(this.f8763r).a(Collections.singletonList(bArr)).e(this.a).a();
                        if (!a12.equals(this.f8751f)) {
                            this.f8751f = a12;
                            this.f8764s = 1024000000 / a12.A;
                            this.f8749d.a(a12);
                        }
                    } else {
                        xgVar.d(((int) a(xgVar)) - c(xgVar));
                    }
                    d(xgVar);
                    boolean f11 = xgVar.f();
                    this.f8761p = f11;
                    this.f8762q = 0L;
                    if (f11) {
                        if (a == 1) {
                            this.f8762q = a(xgVar);
                        }
                        do {
                            f10 = xgVar.f();
                            this.f8762q = (this.f8762q << 8) + xgVar.a(8);
                        } while (f10);
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
        a1.b(this.f8749d);
        while (ygVar.a() > 0) {
            int i10 = this.f8752g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int w10 = ygVar.w();
                    if ((w10 & 224) == 224) {
                        this.f8755j = w10;
                        this.f8752g = 2;
                    } else if (w10 != 86) {
                        this.f8752g = 0;
                    }
                } else if (i10 == 2) {
                    int w11 = ((this.f8755j & (-225)) << 8) | ygVar.w();
                    this.f8754i = w11;
                    if (w11 > this.f8747b.c().length) {
                        a(this.f8754i);
                    }
                    this.f8753h = 0;
                    this.f8752g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(ygVar.a(), this.f8754i - this.f8753h);
                    ygVar.a(this.f8748c.a, this.f8753h, min);
                    int i11 = this.f8753h + min;
                    this.f8753h = i11;
                    if (i11 == this.f8754i) {
                        this.f8748c.c(0);
                        b(this.f8748c);
                        this.f8752g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (ygVar.w() == 86) {
                this.f8752g = 1;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    private void b(xg xgVar) {
        if (!xgVar.f()) {
            this.f8757l = true;
            f(xgVar);
        } else if (!this.f8757l) {
            return;
        }
        if (this.f8758m == 0) {
            if (this.f8759n == 0) {
                a(xgVar, e(xgVar));
                if (this.f8761p) {
                    xgVar.d((int) this.f8762q);
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
        this.f8749d = k8Var.a(dVar.c(), 1);
        this.f8750e = dVar.b();
    }

    private static long a(xg xgVar) {
        return xgVar.a((xgVar.a(2) + 1) * 8);
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f8756k = j3;
        }
    }

    private void a(xg xgVar, int i10) {
        int e2 = xgVar.e();
        if ((e2 & 7) == 0) {
            this.f8747b.f(e2 >> 3);
        } else {
            xgVar.a(this.f8747b.c(), 0, i10 * 8);
            this.f8747b.f(0);
        }
        this.f8749d.a(this.f8747b, i10);
        long j3 = this.f8756k;
        if (j3 != C.TIME_UNSET) {
            this.f8749d.a(j3, 1, i10, 0, null);
            this.f8756k += this.f8764s;
        }
    }

    private void a(int i10) {
        this.f8747b.d(i10);
        this.f8748c.a(this.f8747b.c());
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f8752g = 0;
        this.f8756k = C.TIME_UNSET;
        this.f8757l = false;
    }
}
