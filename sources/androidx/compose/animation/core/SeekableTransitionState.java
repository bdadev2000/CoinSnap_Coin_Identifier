package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.navigation.NavBackStackEntry;
import b1.k;
import d0.b0;
import e0.q;
import h0.g;
import i1.d;
import i1.e;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {

    /* renamed from: r, reason: collision with root package name */
    public static final AnimationVector1D f2163r = new AnimationVector1D(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final AnimationVector1D f2164s = new AnimationVector1D(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2165b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2166c;
    public Object d;
    public Transition e;

    /* renamed from: f, reason: collision with root package name */
    public long f2167f;

    /* renamed from: g, reason: collision with root package name */
    public final q0.a f2168g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f2169h;

    /* renamed from: i, reason: collision with root package name */
    public k f2170i;

    /* renamed from: j, reason: collision with root package name */
    public final d f2171j;

    /* renamed from: k, reason: collision with root package name */
    public final MutatorMutex f2172k;

    /* renamed from: l, reason: collision with root package name */
    public long f2173l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableObjectList f2174m;

    /* renamed from: n, reason: collision with root package name */
    public SeekingAnimationState f2175n;

    /* renamed from: o, reason: collision with root package name */
    public final l f2176o;

    /* renamed from: p, reason: collision with root package name */
    public float f2177p;

    /* renamed from: q, reason: collision with root package name */
    public final l f2178q;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class SeekingAnimationState {

        /* renamed from: a, reason: collision with root package name */
        public long f2179a;

        /* renamed from: b, reason: collision with root package name */
        public VectorizedAnimationSpec f2180b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2181c;
        public float d;
        public final AnimationVector1D e = new AnimationVector1D(0.0f);

        /* renamed from: f, reason: collision with root package name */
        public AnimationVector1D f2182f;

        /* renamed from: g, reason: collision with root package name */
        public long f2183g;

        /* renamed from: h, reason: collision with root package name */
        public long f2184h;

        public final String toString() {
            return "progress nanos: " + this.f2179a + ", animationSpec: " + this.f2180b + ", isComplete: " + this.f2181c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f2182f + ", durationNanos: " + this.f2183g + ", animationSpecDuration: " + this.f2184h;
        }
    }

    public SeekableTransitionState(NavBackStackEntry navBackStackEntry) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        f2 = SnapshotStateKt.f(navBackStackEntry, StructuralEqualityPolicy.f14078a);
        this.f2165b = f2;
        f3 = SnapshotStateKt.f(navBackStackEntry, StructuralEqualityPolicy.f14078a);
        this.f2166c = f3;
        this.d = navBackStackEntry;
        this.f2168g = new SeekableTransitionState$recalculateTotalDurationNanos$1(this);
        this.f2169h = PrimitiveSnapshotStateKt.a(0.0f);
        this.f2171j = e.a();
        this.f2172k = new MutatorMutex();
        this.f2173l = Long.MIN_VALUE;
        this.f2174m = new MutableObjectList();
        this.f2176o = new SeekableTransitionState$firstFrameLambda$1(this);
        this.f2178q = new SeekableTransitionState$animateOneFrameLambda$1(this);
    }

    public static final void f(SeekableTransitionState seekableTransitionState) {
        Transition transition = seekableTransitionState.e;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = seekableTransitionState.f2175n;
        if (seekingAnimationState == null) {
            if (seekableTransitionState.f2167f > 0) {
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = seekableTransitionState.f2169h;
                if (parcelableSnapshotMutableFloatState.c() != 1.0f && !p0.a.g(seekableTransitionState.f2166c.getValue(), seekableTransitionState.f2165b.getValue())) {
                    SeekingAnimationState seekingAnimationState2 = new SeekingAnimationState();
                    seekingAnimationState2.d = parcelableSnapshotMutableFloatState.c();
                    long j2 = seekableTransitionState.f2167f;
                    seekingAnimationState2.f2183g = j2;
                    seekingAnimationState2.f2184h = p0.a.u0((1.0d - parcelableSnapshotMutableFloatState.c()) * j2);
                    seekingAnimationState2.e.e(parcelableSnapshotMutableFloatState.c(), 0);
                    seekingAnimationState = seekingAnimationState2;
                }
            }
            seekingAnimationState = null;
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.f2183g = seekableTransitionState.f2167f;
            seekableTransitionState.f2174m.b(seekingAnimationState);
            transition.n(seekingAnimationState);
        }
        seekableTransitionState.f2175n = null;
    }

    public static final void g(SeekableTransitionState seekableTransitionState, SeekingAnimationState seekingAnimationState, long j2) {
        seekableTransitionState.getClass();
        long j3 = seekingAnimationState.f2179a + j2;
        seekingAnimationState.f2179a = j3;
        long j4 = seekingAnimationState.f2184h;
        if (j3 >= j4) {
            seekingAnimationState.d = 1.0f;
            return;
        }
        VectorizedAnimationSpec vectorizedAnimationSpec = seekingAnimationState.f2180b;
        if (vectorizedAnimationSpec == null) {
            float a2 = seekingAnimationState.e.a(0);
            float f2 = ((float) j3) / ((float) j4);
            TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
            seekingAnimationState.d = (1.0f * f2) + ((1 - f2) * a2);
            return;
        }
        AnimationVector1D animationVector1D = seekingAnimationState.e;
        AnimationVector1D animationVector1D2 = f2164s;
        AnimationVector1D animationVector1D3 = seekingAnimationState.f2182f;
        if (animationVector1D3 == null) {
            animationVector1D3 = f2163r;
        }
        seekingAnimationState.d = p0.a.z(((AnimationVector1D) vectorizedAnimationSpec.g(j3, animationVector1D, animationVector1D2, animationVector1D3)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(androidx.compose.animation.core.SeekableTransitionState r10, h0.g r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            if (r0 == 0) goto L16
            r0 = r11
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f2199b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            d0.b0 r3 = d0.b0.f30125a
            r4 = 2
            r5 = 1
            r6 = -9223372036854775808
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            goto L36
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            androidx.compose.animation.core.SeekableTransitionState r10 = r0.f2198a
            kotlin.jvm.internal.q.m(r11)
            goto L79
        L3c:
            kotlin.jvm.internal.q.m(r11)
            androidx.collection.MutableObjectList r11 = r10.f2174m
            int r11 = r11.f1550b
            if (r11 != 0) goto L4b
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r11 = r10.f2175n
            if (r11 != 0) goto L4b
        L49:
            r1 = r3
            goto L92
        L4b:
            h0.l r11 = r0.getContext()
            float r11 = androidx.compose.animation.core.SuspendAnimationKt.i(r11)
            r2 = 0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L5e
            r10.m()
            r10.f2173l = r6
            goto L49
        L5e:
            long r8 = r10.f2173l
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 != 0) goto L79
            q0.l r11 = r10.f2176o
            r0.f2198a = r10
            r0.d = r5
            h0.l r2 = r0.getContext()
            androidx.compose.runtime.MonotonicFrameClock r2 = androidx.compose.runtime.MonotonicFrameClockKt.a(r2)
            java.lang.Object r11 = r2.b0(r11, r0)
            if (r11 != r1) goto L79
            goto L92
        L79:
            androidx.collection.MutableObjectList r11 = r10.f2174m
            int r11 = r11.f1550b
            if (r11 == 0) goto L80
            goto L84
        L80:
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r11 = r10.f2175n
            if (r11 == 0) goto L8f
        L84:
            r0.f2198a = r10
            r0.d = r4
            java.lang.Object r11 = r10.k(r0)
            if (r11 != r1) goto L79
            goto L92
        L8f:
            r10.f2173l = r6
            goto L49
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.h(androidx.compose.animation.core.SeekableTransitionState, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(androidx.compose.animation.core.SeekableTransitionState r7, h0.g r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) r0
            int r1 = r0.f2220f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2220f = r1
            goto L1b
        L16:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f2219c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f2220f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f2218b
            androidx.compose.animation.core.SeekableTransitionState r0 = r0.f2217a
            kotlin.jvm.internal.q.m(r8)
            goto L80
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.f2218b
            androidx.compose.animation.core.SeekableTransitionState r2 = r0.f2217a
            kotlin.jvm.internal.q.m(r8)
            r8 = r7
            r7 = r2
            goto L5c
        L43:
            kotlin.jvm.internal.q.m(r8)
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r7.f2165b
            java.lang.Object r8 = r8.getValue()
            r0.f2217a = r7
            r0.f2218b = r8
            r0.f2220f = r4
            r2 = 0
            i1.d r5 = r7.f2171j
            java.lang.Object r2 = r5.d(r2, r0)
            if (r2 != r1) goto L5c
            goto L88
        L5c:
            r0.f2217a = r7
            r0.f2218b = r8
            r0.f2220f = r3
            b1.l r2 = new b1.l
            h0.g r0 = b1.f0.r(r0)
            r2.<init>(r4, r0)
            r2.p()
            r7.f2170i = r2
            i1.d r0 = r7.f2171j
            e1.t0.D(r0)
            java.lang.Object r0 = r2.o()
            if (r0 != r1) goto L7c
            goto L88
        L7c:
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r6
        L80:
            boolean r7 = p0.a.g(r8, r7)
            if (r7 == 0) goto L89
            d0.b0 r1 = d0.b0.f30125a
        L88:
            return r1
        L89:
            r7 = -9223372036854775808
            r0.f2173l = r7
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "targetState while waiting for composition"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.i(androidx.compose.animation.core.SeekableTransitionState, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(androidx.compose.animation.core.SeekableTransitionState r6, h0.g r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            if (r0 == 0) goto L16
            r0 = r7
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) r0
            int r1 = r0.f2224f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2224f = r1
            goto L1b
        L16:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f2223c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f2224f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f2222b
            androidx.compose.animation.core.SeekableTransitionState r0 = r0.f2221a
            kotlin.jvm.internal.q.m(r7)
            goto L89
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.f2222b
            androidx.compose.animation.core.SeekableTransitionState r2 = r0.f2221a
            kotlin.jvm.internal.q.m(r7)
            goto L5c
        L41:
            kotlin.jvm.internal.q.m(r7)
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r6.f2165b
            java.lang.Object r7 = r7.getValue()
            r0.f2221a = r6
            r0.f2222b = r7
            r0.f2224f = r4
            r2 = 0
            i1.d r5 = r6.f2171j
            java.lang.Object r2 = r5.d(r2, r0)
            if (r2 != r1) goto L5a
            goto L91
        L5a:
            r2 = r6
            r6 = r7
        L5c:
            java.lang.Object r7 = r2.d
            boolean r7 = p0.a.g(r6, r7)
            i1.d r5 = r2.f2171j
            if (r7 == 0) goto L6a
            e1.t0.D(r5)
            goto L8f
        L6a:
            r0.f2221a = r2
            r0.f2222b = r6
            r0.f2224f = r3
            b1.l r7 = new b1.l
            h0.g r0 = b1.f0.r(r0)
            r7.<init>(r4, r0)
            r7.p()
            r2.f2170i = r7
            e1.t0.D(r5)
            java.lang.Object r7 = r7.o()
            if (r7 != r1) goto L88
            goto L91
        L88:
            r0 = r2
        L89:
            boolean r1 = p0.a.g(r7, r6)
            if (r1 == 0) goto L92
        L8f:
            d0.b0 r1 = d0.b0.f30125a
        L91:
            return r1
        L92:
            r1 = -9223372036854775808
            r0.f2173l = r1
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " instead of "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.j(androidx.compose.animation.core.SeekableTransitionState, h0.g):java.lang.Object");
    }

    public static Object l(SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry, g gVar) {
        Transition transition = seekableTransitionState.e;
        b0 b0Var = b0.f30125a;
        if (transition == null) {
            return b0Var;
        }
        Object b2 = MutatorMutex.b(seekableTransitionState.f2172k, new SeekableTransitionState$animateTo$2(null, seekableTransitionState, transition, navBackStackEntry, null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0Var;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object a() {
        return this.f2166c.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object b() {
        return this.f2165b.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void c(Object obj) {
        this.f2166c.setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void d(Transition transition) {
        Transition transition2 = this.e;
        if (transition2 == null || p0.a.g(transition, transition2)) {
            this.e = transition;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + transition);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void e() {
        this.e = null;
        ((SnapshotStateObserver) TransitionKt.f2311a.getValue()).c(this);
    }

    public final Object k(g gVar) {
        float i2 = SuspendAnimationKt.i(gVar.getContext());
        b0 b0Var = b0.f30125a;
        if (i2 <= 0.0f) {
            m();
            return b0Var;
        }
        this.f2177p = i2;
        Object b02 = MonotonicFrameClockKt.a(gVar.getContext()).b0(this.f2178q, gVar);
        return b02 == i0.a.f30806a ? b02 : b0Var;
    }

    public final void m() {
        Transition transition = this.e;
        if (transition != null) {
            transition.c();
        }
        MutableObjectList mutableObjectList = this.f2174m;
        q.W(0, mutableObjectList.f1550b, mutableObjectList.f1549a);
        mutableObjectList.f1550b = 0;
        if (this.f2175n != null) {
            this.f2175n = null;
            p(1.0f);
            o();
        }
    }

    public final Object n(float f2, Object obj, g gVar) {
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f2);
        }
        Transition transition = this.e;
        b0 b0Var = b0.f30125a;
        if (transition == null) {
            return b0Var;
        }
        Object b2 = MutatorMutex.b(this.f2172k, new SeekableTransitionState$seekTo$3(obj, this.f2165b.getValue(), this, transition, f2, null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0Var;
    }

    public final void o() {
        Transition transition = this.e;
        if (transition == null) {
            return;
        }
        transition.m(p0.a.u0(this.f2169h.c() * ((Number) transition.f2277m.getValue()).longValue()));
    }

    public final void p(float f2) {
        this.f2169h.n(f2);
    }

    public final Object q(NavBackStackEntry navBackStackEntry, g gVar) {
        Transition transition = this.e;
        b0 b0Var = b0.f30125a;
        if (transition == null) {
            return b0Var;
        }
        if (p0.a.g(this.f2166c.getValue(), navBackStackEntry) && p0.a.g(this.f2165b.getValue(), navBackStackEntry)) {
            return b0Var;
        }
        Object b2 = MutatorMutex.b(this.f2172k, new SeekableTransitionState$snapTo$2(this, navBackStackEntry, transition, null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0Var;
    }
}
