package com.applovin.impl;

import com.applovin.impl.wd;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class lh {

    /* renamed from: t, reason: collision with root package name */
    private static final wd.a f5863t = new wd.a(new Object());
    public final go a;

    /* renamed from: b, reason: collision with root package name */
    public final wd.a f5864b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5865c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5866d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5867e;

    /* renamed from: f, reason: collision with root package name */
    public final y7 f5868f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5869g;

    /* renamed from: h, reason: collision with root package name */
    public final qo f5870h;

    /* renamed from: i, reason: collision with root package name */
    public final xo f5871i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5872j;

    /* renamed from: k, reason: collision with root package name */
    public final wd.a f5873k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5874l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5875m;

    /* renamed from: n, reason: collision with root package name */
    public final mh f5876n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5877o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5878p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f5879q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f5880r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f5881s;

    public lh(go goVar, wd.a aVar, long j3, long j10, int i10, y7 y7Var, boolean z10, qo qoVar, xo xoVar, List list, wd.a aVar2, boolean z11, int i11, mh mhVar, long j11, long j12, long j13, boolean z12, boolean z13) {
        this.a = goVar;
        this.f5864b = aVar;
        this.f5865c = j3;
        this.f5866d = j10;
        this.f5867e = i10;
        this.f5868f = y7Var;
        this.f5869g = z10;
        this.f5870h = qoVar;
        this.f5871i = xoVar;
        this.f5872j = list;
        this.f5873k = aVar2;
        this.f5874l = z11;
        this.f5875m = i11;
        this.f5876n = mhVar;
        this.f5879q = j11;
        this.f5880r = j12;
        this.f5881s = j13;
        this.f5877o = z12;
        this.f5878p = z13;
    }

    public static lh a(xo xoVar) {
        go goVar = go.a;
        wd.a aVar = f5863t;
        return new lh(goVar, aVar, C.TIME_UNSET, 0L, 1, null, false, qo.f7276d, xoVar, ab.h(), aVar, false, 0, mh.f6271d, 0L, 0L, 0L, false, false);
    }

    public lh b(boolean z10) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, this.f5869g, this.f5870h, this.f5871i, this.f5872j, this.f5873k, this.f5874l, this.f5875m, this.f5876n, this.f5879q, this.f5880r, this.f5881s, z10, this.f5878p);
    }

    public lh c(boolean z10) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, this.f5869g, this.f5870h, this.f5871i, this.f5872j, this.f5873k, this.f5874l, this.f5875m, this.f5876n, this.f5879q, this.f5880r, this.f5881s, this.f5877o, z10);
    }

    public static wd.a a() {
        return f5863t;
    }

    public lh a(wd.a aVar, long j3, long j10, long j11, long j12, qo qoVar, xo xoVar, List list) {
        return new lh(this.a, aVar, j10, j11, this.f5867e, this.f5868f, this.f5869g, qoVar, xoVar, list, this.f5873k, this.f5874l, this.f5875m, this.f5876n, this.f5879q, j12, j3, this.f5877o, this.f5878p);
    }

    public lh a(go goVar) {
        return new lh(goVar, this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, this.f5869g, this.f5870h, this.f5871i, this.f5872j, this.f5873k, this.f5874l, this.f5875m, this.f5876n, this.f5879q, this.f5880r, this.f5881s, this.f5877o, this.f5878p);
    }

    public lh a(int i10) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, i10, this.f5868f, this.f5869g, this.f5870h, this.f5871i, this.f5872j, this.f5873k, this.f5874l, this.f5875m, this.f5876n, this.f5879q, this.f5880r, this.f5881s, this.f5877o, this.f5878p);
    }

    public lh a(y7 y7Var) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, this.f5867e, y7Var, this.f5869g, this.f5870h, this.f5871i, this.f5872j, this.f5873k, this.f5874l, this.f5875m, this.f5876n, this.f5879q, this.f5880r, this.f5881s, this.f5877o, this.f5878p);
    }

    public lh a(boolean z10) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, z10, this.f5870h, this.f5871i, this.f5872j, this.f5873k, this.f5874l, this.f5875m, this.f5876n, this.f5879q, this.f5880r, this.f5881s, this.f5877o, this.f5878p);
    }

    public lh a(wd.a aVar) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, this.f5869g, this.f5870h, this.f5871i, this.f5872j, aVar, this.f5874l, this.f5875m, this.f5876n, this.f5879q, this.f5880r, this.f5881s, this.f5877o, this.f5878p);
    }

    public lh a(boolean z10, int i10) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, this.f5869g, this.f5870h, this.f5871i, this.f5872j, this.f5873k, z10, i10, this.f5876n, this.f5879q, this.f5880r, this.f5881s, this.f5877o, this.f5878p);
    }

    public lh a(mh mhVar) {
        return new lh(this.a, this.f5864b, this.f5865c, this.f5866d, this.f5867e, this.f5868f, this.f5869g, this.f5870h, this.f5871i, this.f5872j, this.f5873k, this.f5874l, this.f5875m, mhVar, this.f5879q, this.f5880r, this.f5881s, this.f5877o, this.f5878p);
    }
}
