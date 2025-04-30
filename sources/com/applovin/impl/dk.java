package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.go;
import com.applovin.impl.od;

/* loaded from: classes.dex */
public final class dk extends go {

    /* renamed from: q, reason: collision with root package name */
    private static final Object f7310q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private static final od f7311r = new od.c().b("SinglePeriodTimeline").a(Uri.EMPTY).a();

    /* renamed from: c, reason: collision with root package name */
    private final long f7312c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7313d;

    /* renamed from: f, reason: collision with root package name */
    private final long f7314f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7315g;

    /* renamed from: h, reason: collision with root package name */
    private final long f7316h;

    /* renamed from: i, reason: collision with root package name */
    private final long f7317i;

    /* renamed from: j, reason: collision with root package name */
    private final long f7318j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f7319k;
    private final boolean l;
    private final boolean m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f7320n;

    /* renamed from: o, reason: collision with root package name */
    private final od f7321o;

    /* renamed from: p, reason: collision with root package name */
    private final od.f f7322p;

    public dk(long j7, long j9, long j10, long j11, long j12, long j13, long j14, boolean z8, boolean z9, boolean z10, Object obj, od odVar, od.f fVar) {
        this.f7312c = j7;
        this.f7313d = j9;
        this.f7314f = j10;
        this.f7315g = j11;
        this.f7316h = j12;
        this.f7317i = j13;
        this.f7318j = j14;
        this.f7319k = z8;
        this.l = z9;
        this.m = z10;
        this.f7320n = obj;
        this.f7321o = (od) AbstractC0669a1.a(odVar);
        this.f7322p = fVar;
    }

    @Override // com.applovin.impl.go
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.go
    public int b() {
        return 1;
    }

    @Override // com.applovin.impl.go
    public go.b a(int i9, go.b bVar, boolean z8) {
        AbstractC0669a1.a(i9, 0, 1);
        return bVar.a(null, z8 ? f7310q : null, 0, this.f7315g, -this.f7317i);
    }

    @Override // com.applovin.impl.go
    public Object b(int i9) {
        AbstractC0669a1.a(i9, 0, 1);
        return f7310q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1 > r3) goto L13;
     */
    @Override // com.applovin.impl.go
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.go.d a(int r25, com.applovin.impl.go.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.applovin.impl.AbstractC0669a1.a(r3, r1, r2)
            long r1 = r0.f7318j
            boolean r14 = r0.l
            if (r14 == 0) goto L2e
            boolean r3 = r0.m
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f7316h
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
            goto L2b
        L25:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
        L2b:
            r16 = r5
            goto L30
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.applovin.impl.go.d.f7943s
            com.applovin.impl.od r5 = r0.f7321o
            java.lang.Object r6 = r0.f7320n
            long r7 = r0.f7312c
            long r9 = r0.f7313d
            long r11 = r0.f7314f
            boolean r13 = r0.f7319k
            com.applovin.impl.od$f r15 = r0.f7322p
            long r1 = r0.f7316h
            r18 = r1
            long r1 = r0.f7317i
            r22 = r1
            r20 = 0
            r21 = 0
            r3 = r26
            com.applovin.impl.go$d r1 = r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.dk.a(int, com.applovin.impl.go$d, long):com.applovin.impl.go$d");
    }

    @Override // com.applovin.impl.go
    public int a(Object obj) {
        return f7310q.equals(obj) ? 0 : -1;
    }

    public dk(long j7, long j9, long j10, long j11, boolean z8, boolean z9, boolean z10, Object obj, od odVar) {
        this(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, j7, j9, j10, j11, z8, z9, false, obj, odVar, z10 ? odVar.f9413c : null);
    }

    public dk(long j7, boolean z8, boolean z9, boolean z10, Object obj, od odVar) {
        this(j7, j7, 0L, 0L, z8, z9, z10, obj, odVar);
    }
}
