package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.p2;

/* loaded from: classes3.dex */
public final class d implements w, v {

    /* renamed from: b, reason: collision with root package name */
    public final w f26085b;

    /* renamed from: c, reason: collision with root package name */
    public v f26086c;

    /* renamed from: d, reason: collision with root package name */
    public c[] f26087d = new c[0];

    /* renamed from: f, reason: collision with root package name */
    public long f26088f;

    /* renamed from: g, reason: collision with root package name */
    public long f26089g;

    /* renamed from: h, reason: collision with root package name */
    public long f26090h;

    /* renamed from: i, reason: collision with root package name */
    public f f26091i;

    public d(w wVar, boolean z10, long j3, long j10) {
        long j11;
        this.f26085b = wVar;
        if (z10) {
            j11 = j3;
        } else {
            j11 = C.TIME_UNSET;
        }
        this.f26088f = j11;
        this.f26089g = j3;
        this.f26090h = j10;
    }

    @Override // v8.v
    public final void a(w wVar) {
        if (this.f26091i != null) {
            return;
        }
        v vVar = this.f26086c;
        vVar.getClass();
        vVar.a(this);
    }

    @Override // v8.a1
    public final void b(b1 b1Var) {
        v vVar = this.f26086c;
        vVar.getClass();
        vVar.b(this);
    }

    public final boolean c() {
        return this.f26088f != C.TIME_UNSET;
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        return this.f26085b.continueLoading(j3);
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f26085b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j3 = this.f26090h;
            if (j3 == Long.MIN_VALUE || bufferedPositionUs < j3) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f26085b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j3 = this.f26090h;
            if (j3 == Long.MIN_VALUE || nextLoadPositionUs < j3) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // v8.w
    public final j1 getTrackGroups() {
        return this.f26085b.getTrackGroups();
    }

    @Override // v8.b1
    public final boolean isLoading() {
        return this.f26085b.isLoading();
    }

    @Override // v8.w
    public final void maybeThrowPrepareError() {
        f fVar = this.f26091i;
        if (fVar == null) {
            this.f26085b.maybeThrowPrepareError();
            return;
        }
        throw fVar;
    }

    @Override // v8.w
    public final void n(v vVar, long j3) {
        this.f26086c = vVar;
        this.f26085b.n(this, j3);
    }

    @Override // v8.w
    public final void o(long j3) {
        this.f26085b.o(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r1 > r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // v8.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r(k9.q[] r16, boolean[] r17, v8.z0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            v8.c[] r1 = new v8.c[r1]
            r0.f26087d = r1
            int r1 = r9.length
            v8.z0[] r10 = new v8.z0[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            v8.c[] r2 = r0.f26087d
            r3 = r9[r1]
            v8.c r3 = (v8.c) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            v8.z0 r12 = r3.f26079b
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            v8.w r1 = r0.f26085b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.r(r2, r3, r4, r5, r6)
            boolean r3 = r15.c()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.f26089g
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = r11
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            s7.r0 r6 = r6.getSelectedFormat()
            java.lang.String r7 = r6.f24723n
            java.lang.String r6 = r6.f24720k
            boolean r6 = n9.q.a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = r4
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = r11
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.f26088f = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.f26089g
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.f26090h
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = r11
        L85:
            v8.u0.m(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            v8.c[] r3 = r0.f26087d
            r3[r11] = r12
            goto La5
        L94:
            v8.c[] r4 = r0.f26087d
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            v8.z0 r5 = r5.f26079b
            if (r5 == r3) goto La5
        L9e:
            v8.c r5 = new v8.c
            r5.<init>(r15, r3)
            r4[r11] = r5
        La5:
            v8.c[] r3 = r0.f26087d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.d.r(k9.q[], boolean[], v8.z0[], boolean[], long):long");
    }

    @Override // v8.w
    public final long readDiscontinuity() {
        boolean z10;
        if (c()) {
            long j3 = this.f26088f;
            this.f26088f = C.TIME_UNSET;
            long readDiscontinuity = readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                return readDiscontinuity;
            }
            return j3;
        }
        long readDiscontinuity2 = this.f26085b.readDiscontinuity();
        if (readDiscontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z11 = true;
        if (readDiscontinuity2 >= this.f26089g) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        long j10 = this.f26090h;
        if (j10 != Long.MIN_VALUE && readDiscontinuity2 > j10) {
            z11 = false;
        }
        u0.m(z11);
        return readDiscontinuity2;
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
        this.f26085b.reevaluateBuffer(j3);
    }

    @Override // v8.w
    public final long s(long j3, p2 p2Var) {
        long j10;
        long j11 = this.f26089g;
        if (j3 == j11) {
            return j11;
        }
        long i10 = n9.h0.i(p2Var.a, 0L, j3 - j11);
        long j12 = p2Var.f24653b;
        long j13 = this.f26090h;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = n9.h0.i(j12, 0L, j10);
        if (i10 != p2Var.a || i11 != p2Var.f24653b) {
            p2Var = new p2(i10, i11);
        }
        return this.f26085b.s(j3, p2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // v8.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f26088f = r0
            v8.c[] r0 = r5.f26087d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f26080c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            v8.w r0 = r5.f26085b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f26089g
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f26090h
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            v8.u0.m(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.d.seekToUs(long):long");
    }
}
