package k9;

import android.os.SystemClock;
import com.google.common.collect.m0;
import com.google.common.collect.r0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import n9.c0;
import n9.h0;
import v8.i1;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final m9.e f20385g;

    /* renamed from: h, reason: collision with root package name */
    public final long f20386h;

    /* renamed from: i, reason: collision with root package name */
    public final long f20387i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20388j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20389k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20390l;

    /* renamed from: m, reason: collision with root package name */
    public final float f20391m;

    /* renamed from: n, reason: collision with root package name */
    public final float f20392n;

    /* renamed from: o, reason: collision with root package name */
    public final r0 f20393o;

    /* renamed from: p, reason: collision with root package name */
    public final n9.a f20394p;

    /* renamed from: q, reason: collision with root package name */
    public float f20395q;

    /* renamed from: r, reason: collision with root package name */
    public int f20396r;

    /* renamed from: s, reason: collision with root package name */
    public int f20397s;

    /* renamed from: t, reason: collision with root package name */
    public long f20398t;
    public x8.a u;

    public b(i1 i1Var, int[] iArr, int i10, m9.e eVar, long j3, long j10, long j11, int i11, int i12, float f10, float f11, r0 r0Var, n9.a aVar) {
        super(i1Var, iArr);
        m9.e eVar2;
        long j12;
        if (j11 < j3) {
            n9.o.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            eVar2 = eVar;
            j12 = j3;
        } else {
            eVar2 = eVar;
            j12 = j11;
        }
        this.f20385g = eVar2;
        this.f20386h = j3 * 1000;
        this.f20387i = j10 * 1000;
        this.f20388j = j12 * 1000;
        this.f20389k = i11;
        this.f20390l = i12;
        this.f20391m = f10;
        this.f20392n = f11;
        this.f20393o = r0.i(r0Var);
        this.f20394p = aVar;
        this.f20395q = 1.0f;
        this.f20397s = 0;
        this.f20398t = C.TIME_UNSET;
    }

    public static void i(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j10 : jArr) {
            j3 += j10;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m0 m0Var = (m0) arrayList.get(i10);
            if (m0Var != null) {
                m0Var.u(new a(j3, jArr[i10]));
            }
        }
    }

    public static long k(List list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        x8.a aVar = (x8.a) c6.k.p(list);
        long j3 = aVar.f27527i;
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j10 = aVar.f27528j;
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return j10 - j3;
    }

    @Override // k9.c, k9.q
    public final void disable() {
        this.u = null;
    }

    @Override // k9.c, k9.q
    public final void enable() {
        this.f20398t = C.TIME_UNSET;
        this.u = null;
    }

    @Override // k9.c, k9.q
    public final int evaluateQueueSize(long j3, List list) {
        boolean z10;
        x8.a aVar;
        int i10;
        int i11;
        ((c0) this.f20394p).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f20398t;
        if (j10 != C.TIME_UNSET && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((x8.a) c6.k.p(list)).equals(this.u))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return list.size();
        }
        this.f20398t = elapsedRealtime;
        if (list.isEmpty()) {
            aVar = null;
        } else {
            aVar = (x8.a) c6.k.p(list);
        }
        this.u = aVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long u = h0.u(((x8.a) list.get(size - 1)).f27527i - j3, this.f20395q);
        long j11 = this.f20388j;
        if (u < j11) {
            return size;
        }
        k(list);
        s7.r0 r0Var = this.f20401d[j(elapsedRealtime)];
        for (int i12 = 0; i12 < size; i12++) {
            x8.a aVar2 = (x8.a) list.get(i12);
            s7.r0 r0Var2 = aVar2.f27524f;
            if (h0.u(aVar2.f27527i - j3, this.f20395q) >= j11 && r0Var2.f24719j < r0Var.f24719j && (i10 = r0Var2.f24729t) != -1 && i10 <= this.f20390l && (i11 = r0Var2.f24728s) != -1 && i11 <= this.f20389k && i10 < r0Var.f24729t) {
                return i12;
            }
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // k9.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r14, long r16, long r18, java.util.List r20, x8.m[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            n9.a r2 = r0.f20394p
            n9.c0 r2 = (n9.c0) r2
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f20396r
            int r5 = r1.length
            if (r4 >= r5) goto L28
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L28
            int r4 = r0.f20396r
            r1 = r1[r4]
            long r4 = r1.d()
            long r6 = r1.b()
            goto L3c
        L28:
            int r4 = r1.length
            r5 = 0
        L2a:
            if (r5 >= r4) goto L41
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3e
            long r4 = r6.d()
            long r6 = r6.b()
        L3c:
            long r4 = r4 - r6
            goto L45
        L3e:
            int r5 = r5 + 1
            goto L2a
        L41:
            long r4 = k(r20)
        L45:
            int r1 = r0.f20397s
            if (r1 != 0) goto L53
            r1 = 1
            r0.f20397s = r1
            int r1 = r13.j(r2)
            r0.f20396r = r1
            return
        L53:
            int r6 = r0.f20396r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5e
            r7 = r8
            goto L6a
        L5e:
            java.lang.Object r7 = c6.k.p(r20)
            x8.a r7 = (x8.a) r7
            s7.r0 r7 = r7.f27524f
            int r7 = r13.b(r7)
        L6a:
            if (r7 == r8) goto L75
            java.lang.Object r1 = c6.k.p(r20)
            x8.a r1 = (x8.a) r1
            int r1 = r1.f27525g
            r6 = r7
        L75:
            int r7 = r13.j(r2)
            boolean r2 = r13.a(r6, r2)
            if (r2 != 0) goto Lb7
            s7.r0[] r2 = r0.f20401d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f20386h
            if (r10 != 0) goto L91
            goto La3
        L91:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f20392n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.f24719j
            int r3 = r3.f24719j
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.f20387i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb7
        Lb6:
            r7 = r6
        Lb7:
            if (r7 != r6) goto Lba
            goto Lbb
        Lba:
            r1 = 3
        Lbb:
            r0.f20397s = r1
            r0.f20396r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.f(long, long, long, java.util.List, x8.m[]):void");
    }

    @Override // k9.q
    public final int getSelectedIndex() {
        return this.f20396r;
    }

    @Override // k9.q
    public final Object getSelectionData() {
        return null;
    }

    @Override // k9.q
    public final int getSelectionReason() {
        return this.f20397s;
    }

    public final int j(long j3) {
        long j10;
        boolean z10;
        m9.t tVar = (m9.t) this.f20385g;
        synchronized (tVar) {
            j10 = tVar.f21754l;
        }
        long j11 = ((float) j10) * this.f20391m;
        this.f20385g.getClass();
        long j12 = ((float) j11) / this.f20395q;
        if (!this.f20393o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f20393o.size() - 1 && ((a) this.f20393o.get(i10)).a < j12) {
                i10++;
            }
            a aVar = (a) this.f20393o.get(i10 - 1);
            a aVar2 = (a) this.f20393o.get(i10);
            long j13 = aVar.a;
            float f10 = ((float) (j12 - j13)) / ((float) (aVar2.a - j13));
            j12 = (f10 * ((float) (aVar2.f20384b - r4))) + aVar.f20384b;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f20399b; i12++) {
            if (j3 == Long.MIN_VALUE || !a(i12, j3)) {
                if (this.f20401d[i12].f24719j <= j12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // k9.c, k9.q
    public final void onPlaybackSpeed(float f10) {
        this.f20395q = f10;
    }
}
