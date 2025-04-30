package com.applovin.impl;

import com.applovin.impl.wd;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class lh {

    /* renamed from: t, reason: collision with root package name */
    private static final wd.a f8831t = new wd.a(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final go f8832a;
    public final wd.a b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8833c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8834d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8835e;

    /* renamed from: f, reason: collision with root package name */
    public final y7 f8836f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8837g;

    /* renamed from: h, reason: collision with root package name */
    public final qo f8838h;

    /* renamed from: i, reason: collision with root package name */
    public final xo f8839i;

    /* renamed from: j, reason: collision with root package name */
    public final List f8840j;

    /* renamed from: k, reason: collision with root package name */
    public final wd.a f8841k;
    public final boolean l;
    public final int m;

    /* renamed from: n, reason: collision with root package name */
    public final mh f8842n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8843o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8844p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f8845q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f8846r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f8847s;

    public lh(go goVar, wd.a aVar, long j7, long j9, int i9, y7 y7Var, boolean z8, qo qoVar, xo xoVar, List list, wd.a aVar2, boolean z9, int i10, mh mhVar, long j10, long j11, long j12, boolean z10, boolean z11) {
        this.f8832a = goVar;
        this.b = aVar;
        this.f8833c = j7;
        this.f8834d = j9;
        this.f8835e = i9;
        this.f8836f = y7Var;
        this.f8837g = z8;
        this.f8838h = qoVar;
        this.f8839i = xoVar;
        this.f8840j = list;
        this.f8841k = aVar2;
        this.l = z9;
        this.m = i10;
        this.f8842n = mhVar;
        this.f8845q = j10;
        this.f8846r = j11;
        this.f8847s = j12;
        this.f8843o = z10;
        this.f8844p = z11;
    }

    public static lh a(xo xoVar) {
        go goVar = go.f7931a;
        wd.a aVar = f8831t;
        return new lh(goVar, aVar, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0L, 1, null, false, qo.f10419d, xoVar, ab.h(), aVar, false, 0, mh.f9206d, 0L, 0L, 0L, false, false);
    }

    public lh b(boolean z8) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, this.f8835e, this.f8836f, this.f8837g, this.f8838h, this.f8839i, this.f8840j, this.f8841k, this.l, this.m, this.f8842n, this.f8845q, this.f8846r, this.f8847s, z8, this.f8844p);
    }

    public lh c(boolean z8) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, this.f8835e, this.f8836f, this.f8837g, this.f8838h, this.f8839i, this.f8840j, this.f8841k, this.l, this.m, this.f8842n, this.f8845q, this.f8846r, this.f8847s, this.f8843o, z8);
    }

    public static wd.a a() {
        return f8831t;
    }

    public lh a(wd.a aVar, long j7, long j9, long j10, long j11, qo qoVar, xo xoVar, List list) {
        return new lh(this.f8832a, aVar, j9, j10, this.f8835e, this.f8836f, this.f8837g, qoVar, xoVar, list, this.f8841k, this.l, this.m, this.f8842n, this.f8845q, j11, j7, this.f8843o, this.f8844p);
    }

    public lh a(go goVar) {
        return new lh(goVar, this.b, this.f8833c, this.f8834d, this.f8835e, this.f8836f, this.f8837g, this.f8838h, this.f8839i, this.f8840j, this.f8841k, this.l, this.m, this.f8842n, this.f8845q, this.f8846r, this.f8847s, this.f8843o, this.f8844p);
    }

    public lh a(int i9) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, i9, this.f8836f, this.f8837g, this.f8838h, this.f8839i, this.f8840j, this.f8841k, this.l, this.m, this.f8842n, this.f8845q, this.f8846r, this.f8847s, this.f8843o, this.f8844p);
    }

    public lh a(y7 y7Var) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, this.f8835e, y7Var, this.f8837g, this.f8838h, this.f8839i, this.f8840j, this.f8841k, this.l, this.m, this.f8842n, this.f8845q, this.f8846r, this.f8847s, this.f8843o, this.f8844p);
    }

    public lh a(boolean z8) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, this.f8835e, this.f8836f, z8, this.f8838h, this.f8839i, this.f8840j, this.f8841k, this.l, this.m, this.f8842n, this.f8845q, this.f8846r, this.f8847s, this.f8843o, this.f8844p);
    }

    public lh a(wd.a aVar) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, this.f8835e, this.f8836f, this.f8837g, this.f8838h, this.f8839i, this.f8840j, aVar, this.l, this.m, this.f8842n, this.f8845q, this.f8846r, this.f8847s, this.f8843o, this.f8844p);
    }

    public lh a(boolean z8, int i9) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, this.f8835e, this.f8836f, this.f8837g, this.f8838h, this.f8839i, this.f8840j, this.f8841k, z8, i9, this.f8842n, this.f8845q, this.f8846r, this.f8847s, this.f8843o, this.f8844p);
    }

    public lh a(mh mhVar) {
        return new lh(this.f8832a, this.b, this.f8833c, this.f8834d, this.f8835e, this.f8836f, this.f8837g, this.f8838h, this.f8839i, this.f8840j, this.f8841k, this.l, this.m, mhVar, this.f8845q, this.f8846r, this.f8847s, this.f8843o, this.f8844p);
    }
}
