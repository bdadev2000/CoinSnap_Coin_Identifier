package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import h0.j;
import h0.k;
import h0.l;
import kotlin.jvm.internal.q;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {

    /* renamed from: a, reason: collision with root package name */
    public final MonotonicFrameClock f13844a;

    /* renamed from: b, reason: collision with root package name */
    public final Latch f13845b = new Latch();

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.f13844a = monotonicFrameClock;
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a A[PHI: r8
      0x008a: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0087, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b0(q0.l r7, h0.g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.f13849f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13849f = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13848c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f13849f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.jvm.internal.q.m(r8)
            goto L8a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            q0.l r7 = r0.f13847b
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = r0.f13846a
            kotlin.jvm.internal.q.m(r8)
            goto L7a
        L3a:
            kotlin.jvm.internal.q.m(r8)
            androidx.compose.runtime.Latch r8 = r6.f13845b
            r0.f13846a = r6
            r0.f13847b = r7
            r0.f13849f = r4
            java.lang.Object r2 = r8.f13821a
            monitor-enter(r2)
            boolean r5 = r8.d     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r2)
            if (r5 == 0) goto L50
            d0.b0 r8 = d0.b0.f30125a
            goto L76
        L50:
            b1.l r2 = new b1.l
            h0.g r5 = b1.f0.r(r0)
            r2.<init>(r4, r5)
            r2.p()
            java.lang.Object r4 = r8.f13821a
            monitor-enter(r4)
            java.util.List r5 = r8.f13822b     // Catch: java.lang.Throwable -> L8b
            r5.add(r2)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r4)
            androidx.compose.runtime.Latch$await$2$2 r4 = new androidx.compose.runtime.Latch$await$2$2
            r4.<init>(r8, r2)
            r2.z(r4)
            java.lang.Object r8 = r2.o()
            if (r8 != r1) goto L74
            goto L76
        L74:
            d0.b0 r8 = d0.b0.f30125a
        L76:
            if (r8 != r1) goto L79
            return r1
        L79:
            r2 = r6
        L7a:
            androidx.compose.runtime.MonotonicFrameClock r8 = r2.f13844a
            r2 = 0
            r0.f13846a = r2
            r0.f13847b = r2
            r0.f13849f = r3
            java.lang.Object r8 = r8.b0(r7, r0)
            if (r8 != r1) goto L8a
            return r1
        L8a:
            return r8
        L8b:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L8e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.b0(q0.l, h0.g):java.lang.Object");
    }

    @Override // h0.l
    public final j i(k kVar) {
        return q.e(this, kVar);
    }

    @Override // h0.l
    public final l s(k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final l u(l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}
