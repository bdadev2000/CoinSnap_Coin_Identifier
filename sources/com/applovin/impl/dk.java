package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.go;
import com.applovin.impl.od;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class dk extends go {

    /* renamed from: q, reason: collision with root package name */
    private static final Object f4316q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private static final od f4317r = new od.c().b("SinglePeriodTimeline").a(Uri.EMPTY).a();

    /* renamed from: c, reason: collision with root package name */
    private final long f4318c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4319d;

    /* renamed from: f, reason: collision with root package name */
    private final long f4320f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4321g;

    /* renamed from: h, reason: collision with root package name */
    private final long f4322h;

    /* renamed from: i, reason: collision with root package name */
    private final long f4323i;

    /* renamed from: j, reason: collision with root package name */
    private final long f4324j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f4325k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f4326l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f4327m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f4328n;

    /* renamed from: o, reason: collision with root package name */
    private final od f4329o;

    /* renamed from: p, reason: collision with root package name */
    private final od.f f4330p;

    public dk(long j3, long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, Object obj, od odVar, od.f fVar) {
        this.f4318c = j3;
        this.f4319d = j10;
        this.f4320f = j11;
        this.f4321g = j12;
        this.f4322h = j13;
        this.f4323i = j14;
        this.f4324j = j15;
        this.f4325k = z10;
        this.f4326l = z11;
        this.f4327m = z12;
        this.f4328n = obj;
        this.f4329o = (od) a1.a(odVar);
        this.f4330p = fVar;
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
    public go.b a(int i10, go.b bVar, boolean z10) {
        a1.a(i10, 0, 1);
        return bVar.a(null, z10 ? f4316q : null, 0, this.f4321g, -this.f4323i);
    }

    @Override // com.applovin.impl.go
    public Object b(int i10) {
        a1.a(i10, 0, 1);
        return f4316q;
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
            com.applovin.impl.a1.a(r3, r1, r2)
            long r1 = r0.f4324j
            boolean r14 = r0.f4326l
            if (r14 == 0) goto L2e
            boolean r3 = r0.f4327m
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f4322h
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
            java.lang.Object r4 = com.applovin.impl.go.d.f4967s
            com.applovin.impl.od r5 = r0.f4329o
            java.lang.Object r6 = r0.f4328n
            long r7 = r0.f4318c
            long r9 = r0.f4319d
            long r11 = r0.f4320f
            boolean r13 = r0.f4325k
            com.applovin.impl.od$f r15 = r0.f4330p
            long r1 = r0.f4322h
            r18 = r1
            long r1 = r0.f4323i
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
        return f4316q.equals(obj) ? 0 : -1;
    }

    public dk(long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, Object obj, od odVar) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j3, j10, j11, j12, z10, z11, false, obj, odVar, z12 ? odVar.f6478c : null);
    }

    public dk(long j3, boolean z10, boolean z11, boolean z12, Object obj, od odVar) {
        this(j3, j3, 0L, 0L, z10, z11, z12, obj, odVar);
    }
}
