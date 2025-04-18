package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.fo;
import com.applovin.impl.td;

/* loaded from: classes.dex */
public final class gk extends fo {

    /* renamed from: q, reason: collision with root package name */
    private static final Object f24110q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private static final td f24111r = new td.c().b("SinglePeriodTimeline").a(Uri.EMPTY).a();

    /* renamed from: c, reason: collision with root package name */
    private final long f24112c;
    private final long d;

    /* renamed from: f, reason: collision with root package name */
    private final long f24113f;

    /* renamed from: g, reason: collision with root package name */
    private final long f24114g;

    /* renamed from: h, reason: collision with root package name */
    private final long f24115h;

    /* renamed from: i, reason: collision with root package name */
    private final long f24116i;

    /* renamed from: j, reason: collision with root package name */
    private final long f24117j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f24118k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f24119l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f24120m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f24121n;

    /* renamed from: o, reason: collision with root package name */
    private final td f24122o;

    /* renamed from: p, reason: collision with root package name */
    private final td.f f24123p;

    public gk(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z2, boolean z3, boolean z4, Object obj, td tdVar, td.f fVar) {
        this.f24112c = j2;
        this.d = j3;
        this.f24113f = j4;
        this.f24114g = j5;
        this.f24115h = j6;
        this.f24116i = j7;
        this.f24117j = j8;
        this.f24118k = z2;
        this.f24119l = z3;
        this.f24120m = z4;
        this.f24121n = obj;
        this.f24122o = (td) b1.a(tdVar);
        this.f24123p = fVar;
    }

    @Override // com.applovin.impl.fo
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.fo
    public int b() {
        return 1;
    }

    @Override // com.applovin.impl.fo
    public fo.b a(int i2, fo.b bVar, boolean z2) {
        b1.a(i2, 0, 1);
        return bVar.a(null, z2 ? f24110q : null, 0, this.f24114g, -this.f24116i);
    }

    @Override // com.applovin.impl.fo
    public Object b(int i2) {
        b1.a(i2, 0, 1);
        return f24110q;
    }

    public gk(long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4, Object obj, td tdVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z2, z3, false, obj, tdVar, z4 ? tdVar.f27059c : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1 > r3) goto L13;
     */
    @Override // com.applovin.impl.fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.impl.fo.d a(int r25, com.applovin.impl.fo.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.applovin.impl.b1.a(r3, r1, r2)
            long r1 = r0.f24117j
            boolean r14 = r0.f24119l
            if (r14 == 0) goto L2e
            boolean r3 = r0.f24120m
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f24115h
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
            java.lang.Object r4 = com.applovin.impl.fo.d.f23957s
            com.applovin.impl.td r5 = r0.f24122o
            java.lang.Object r6 = r0.f24121n
            long r7 = r0.f24112c
            long r9 = r0.d
            long r11 = r0.f24113f
            boolean r13 = r0.f24118k
            com.applovin.impl.td$f r15 = r0.f24123p
            long r1 = r0.f24115h
            r18 = r1
            long r1 = r0.f24116i
            r22 = r1
            r20 = 0
            r21 = 0
            r3 = r26
            com.applovin.impl.fo$d r1 = r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gk.a(int, com.applovin.impl.fo$d, long):com.applovin.impl.fo$d");
    }

    public gk(long j2, boolean z2, boolean z3, boolean z4, Object obj, td tdVar) {
        this(j2, j2, 0L, 0L, z2, z3, z4, obj, tdVar);
    }

    @Override // com.applovin.impl.fo
    public int a(Object obj) {
        return f24110q.equals(obj) ? 0 : -1;
    }
}
