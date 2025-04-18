package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import i1.d;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f3397a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3398b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3399c;
    public final d d = new d(false);

    public PressGestureScopeImpl(Density density) {
        this.f3397a = density;
    }

    @Override // androidx.compose.ui.unit.Density
    public final int C1(long j2) {
        return this.f3397a.C1(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int F0(float f2) {
        return this.f3397a.F0(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float H(int i2) {
        return this.f3397a.H(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float I(float f2) {
        return this.f3397a.I(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float J0(long j2) {
        return this.f3397a.J0(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long L(long j2) {
        return this.f3397a.L(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f3397a.getDensity();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3404b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r0.f3403a
            kotlin.jvm.internal.q.m(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.jvm.internal.q.m(r5)
            r0.f3403a = r4
            r0.d = r3
            r5 = 0
            i1.d r2 = r4.d
            java.lang.Object r5 = r2.d(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r0 = r4
        L43:
            r5 = 0
            r0.f3398b = r5
            r0.f3399c = r5
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.m(h0.g):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long o(float f2) {
        return this.f3397a.o(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j2) {
        return this.f3397a.p(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j2) {
        return this.f3397a.r(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long u(float f2) {
        return this.f3397a.u(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f3397a.x1();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y0(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3407b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r0.f3406a
            kotlin.jvm.internal.q.m(r5)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.jvm.internal.q.m(r5)
            boolean r5 = r4.f3398b
            if (r5 != 0) goto L51
            boolean r5 = r4.f3399c
            if (r5 != 0) goto L51
            r0.f3406a = r4
            r0.d = r3
            r5 = 0
            i1.d r2 = r4.d
            java.lang.Object r5 = r2.d(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            i1.d r5 = r0.d
            e1.t0.D(r5)
            goto L52
        L51:
            r0 = r4
        L52:
            boolean r5 = r0.f3398b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.y0(h0.g):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    public final float y1(float f2) {
        return this.f3397a.y1(f2);
    }
}
