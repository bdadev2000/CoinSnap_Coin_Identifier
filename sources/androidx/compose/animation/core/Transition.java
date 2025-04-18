package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import b1.d0;
import q0.l;

@Stable
/* loaded from: classes.dex */
public final class Transition<S> {

    /* renamed from: a, reason: collision with root package name */
    public final TransitionState f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final Transition f2268b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2269c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableLongState f2270f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableLongState f2271g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2272h;

    /* renamed from: i, reason: collision with root package name */
    public final SnapshotStateList f2273i;

    /* renamed from: j, reason: collision with root package name */
    public final SnapshotStateList f2274j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2275k;

    /* renamed from: l, reason: collision with root package name */
    public long f2276l;

    /* renamed from: m, reason: collision with root package name */
    public final State f2277m;

    @RestrictTo
    /* loaded from: classes.dex */
    public final class DeferredAnimation<T, V extends AnimationVector> {

        /* renamed from: a, reason: collision with root package name */
        public final TwoWayConverter f2278a;

        /* renamed from: b, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f2279b;

        /* loaded from: classes.dex */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            /* renamed from: a, reason: collision with root package name */
            public final TransitionAnimationState f2281a;

            /* renamed from: b, reason: collision with root package name */
            public l f2282b;

            /* renamed from: c, reason: collision with root package name */
            public l f2283c;

            public DeferredAnimationData(TransitionAnimationState transitionAnimationState, l lVar, l lVar2) {
                this.f2281a = transitionAnimationState;
                this.f2282b = lVar;
                this.f2283c = lVar2;
            }

            public final void a(Segment segment) {
                Object invoke = this.f2283c.invoke(segment.a());
                boolean g2 = Transition.this.g();
                TransitionAnimationState transitionAnimationState = this.f2281a;
                if (g2) {
                    transitionAnimationState.t(this.f2283c.invoke(segment.c()), invoke, (FiniteAnimationSpec) this.f2282b.invoke(segment));
                } else {
                    transitionAnimationState.u(invoke, (FiniteAnimationSpec) this.f2282b.invoke(segment));
                }
            }

            @Override // androidx.compose.runtime.State
            public final Object getValue() {
                a(Transition.this.f());
                return this.f2281a.f2294k.getValue();
            }
        }

        public DeferredAnimation(TwoWayConverter twoWayConverter, String str) {
            ParcelableSnapshotMutableState f2;
            this.f2278a = twoWayConverter;
            f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
            this.f2279b = f2;
        }

        public final DeferredAnimationData a(l lVar, l lVar2) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f2279b;
            DeferredAnimationData deferredAnimationData = (DeferredAnimationData) parcelableSnapshotMutableState.getValue();
            Transition transition = Transition.this;
            if (deferredAnimationData == null) {
                Object invoke = lVar2.invoke(transition.f2267a.a());
                Object invoke2 = lVar2.invoke(transition.f2267a.a());
                TwoWayConverter twoWayConverter = this.f2278a;
                AnimationVector animationVector = (AnimationVector) twoWayConverter.a().invoke(invoke2);
                animationVector.d();
                TransitionAnimationState transitionAnimationState = new TransitionAnimationState(invoke, animationVector, twoWayConverter);
                deferredAnimationData = new DeferredAnimationData(transitionAnimationState, lVar, lVar2);
                parcelableSnapshotMutableState.setValue(deferredAnimationData);
                transition.f2273i.add(transitionAnimationState);
            }
            deferredAnimationData.f2283c = lVar2;
            deferredAnimationData.f2282b = lVar;
            deferredAnimationData.a(transition.f());
            return deferredAnimationData;
        }
    }

    /* loaded from: classes.dex */
    public interface Segment<S> {

        /* loaded from: classes.dex */
        public static final class DefaultImpls {
        }

        Object a();

        Object c();

        default boolean d(Object obj, Object obj2) {
            return p0.a.g(obj, c()) && p0.a.g(obj2, a());
        }
    }

    /* loaded from: classes.dex */
    public static final class SegmentImpl<S> implements Segment<S> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2284a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f2285b;

        public SegmentImpl(Object obj, Object obj2) {
            this.f2284a = obj;
            this.f2285b = obj2;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final Object a() {
            return this.f2285b;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final Object c() {
            return this.f2284a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (p0.a.g(this.f2284a, segment.c())) {
                    if (p0.a.g(this.f2285b, segment.a())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f2284a;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.f2285b;
            return hashCode + (obj2 != null ? obj2.hashCode() : 0);
        }
    }

    @Stable
    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* renamed from: a, reason: collision with root package name */
        public final TwoWayConverter f2286a;

        /* renamed from: b, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f2287b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f2288c;
        public final ParcelableSnapshotMutableState d;

        /* renamed from: f, reason: collision with root package name */
        public SeekableTransitionState.SeekingAnimationState f2289f;

        /* renamed from: g, reason: collision with root package name */
        public TargetBasedAnimation f2290g;

        /* renamed from: h, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f2291h;

        /* renamed from: i, reason: collision with root package name */
        public final ParcelableSnapshotMutableFloatState f2292i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2293j;

        /* renamed from: k, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f2294k;

        /* renamed from: l, reason: collision with root package name */
        public AnimationVector f2295l;

        /* renamed from: m, reason: collision with root package name */
        public final ParcelableSnapshotMutableLongState f2296m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f2297n;

        /* renamed from: o, reason: collision with root package name */
        public final SpringSpec f2298o;

        public TransitionAnimationState(Object obj, AnimationVector animationVector, TwoWayConverter twoWayConverter) {
            ParcelableSnapshotMutableState f2;
            ParcelableSnapshotMutableState f3;
            ParcelableSnapshotMutableState f4;
            ParcelableSnapshotMutableState f5;
            ParcelableSnapshotMutableState f6;
            this.f2286a = twoWayConverter;
            f2 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
            this.f2287b = f2;
            Object obj2 = null;
            f3 = SnapshotStateKt.f(AnimationSpecKt.c(0.0f, 0.0f, null, 7), StructuralEqualityPolicy.f14078a);
            this.f2288c = f3;
            f4 = SnapshotStateKt.f(new TargetBasedAnimation((FiniteAnimationSpec) f3.getValue(), twoWayConverter, obj, f2.getValue(), animationVector), StructuralEqualityPolicy.f14078a);
            this.d = f4;
            f5 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
            this.f2291h = f5;
            this.f2292i = PrimitiveSnapshotStateKt.a(-1.0f);
            f6 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
            this.f2294k = f6;
            this.f2295l = animationVector;
            this.f2296m = SnapshotLongStateKt.a(a().d());
            Float f7 = (Float) VisibilityThresholdsKt.f2405b.get(twoWayConverter);
            if (f7 != null) {
                float floatValue = f7.floatValue();
                AnimationVector animationVector2 = (AnimationVector) twoWayConverter.a().invoke(obj);
                int b2 = animationVector2.b();
                for (int i2 = 0; i2 < b2; i2++) {
                    animationVector2.e(floatValue, i2);
                }
                obj2 = this.f2286a.b().invoke(animationVector2);
            }
            this.f2298o = AnimationSpecKt.c(0.0f, 0.0f, obj2, 3);
        }

        public final TargetBasedAnimation a() {
            return (TargetBasedAnimation) this.d.getValue();
        }

        @Override // androidx.compose.runtime.State
        public final Object getValue() {
            return this.f2294k.getValue();
        }

        public final void p(long j2) {
            if (this.f2292i.c() == -1.0f) {
                this.f2297n = true;
                if (p0.a.g(a().f2262c, a().d)) {
                    q(a().f2262c);
                } else {
                    q(a().f(j2));
                    this.f2295l = a().b(j2);
                }
            }
        }

        public final void q(Object obj) {
            this.f2294k.setValue(obj);
        }

        public final void r(Object obj, boolean z2) {
            TargetBasedAnimation targetBasedAnimation = this.f2290g;
            Object obj2 = targetBasedAnimation != null ? targetBasedAnimation.f2262c : null;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f2287b;
            boolean g2 = p0.a.g(obj2, parcelableSnapshotMutableState.getValue());
            FiniteAnimationSpec finiteAnimationSpec = this.f2298o;
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f2296m;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.d;
            if (g2) {
                TwoWayConverter twoWayConverter = this.f2286a;
                AnimationVector c2 = this.f2295l.c();
                p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
                parcelableSnapshotMutableState2.setValue(new TargetBasedAnimation(finiteAnimationSpec, twoWayConverter, obj, obj, c2));
                this.f2293j = true;
                parcelableSnapshotMutableLongState.o(a().d());
                return;
            }
            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.f2288c;
            if (!z2 || this.f2297n) {
                finiteAnimationSpec = (FiniteAnimationSpec) parcelableSnapshotMutableState3.getValue();
            } else if (((FiniteAnimationSpec) parcelableSnapshotMutableState3.getValue()) instanceof SpringSpec) {
                finiteAnimationSpec = (FiniteAnimationSpec) parcelableSnapshotMutableState3.getValue();
            }
            Transition transition = Transition.this;
            long j2 = 0;
            parcelableSnapshotMutableState2.setValue(new TargetBasedAnimation(transition.e() <= 0 ? finiteAnimationSpec : new StartDelayAnimationSpec(finiteAnimationSpec, transition.e()), this.f2286a, obj, parcelableSnapshotMutableState.getValue(), this.f2295l));
            parcelableSnapshotMutableLongState.o(a().d());
            this.f2293j = false;
            Boolean bool = Boolean.TRUE;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = transition.f2272h;
            parcelableSnapshotMutableState4.setValue(bool);
            if (transition.g()) {
                SnapshotStateList snapshotStateList = transition.f2273i;
                int size = snapshotStateList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
                    j2 = Math.max(j2, transitionAnimationState.f2296m.d());
                    transitionAnimationState.p(transition.f2276l);
                }
                parcelableSnapshotMutableState4.setValue(Boolean.FALSE);
            }
        }

        public final void t(Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec) {
            this.f2287b.setValue(obj2);
            this.f2288c.setValue(finiteAnimationSpec);
            if (p0.a.g(a().d, obj) && p0.a.g(a().f2262c, obj2)) {
                return;
            }
            r(obj, false);
        }

        public final String toString() {
            return "current value: " + this.f2294k.getValue() + ", target: " + this.f2287b.getValue() + ", spec: " + ((FiniteAnimationSpec) this.f2288c.getValue());
        }

        public final void u(Object obj, FiniteAnimationSpec finiteAnimationSpec) {
            if (this.f2293j) {
                TargetBasedAnimation targetBasedAnimation = this.f2290g;
                if (p0.a.g(obj, targetBasedAnimation != null ? targetBasedAnimation.f2262c : null)) {
                    return;
                }
            }
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f2287b;
            boolean g2 = p0.a.g(parcelableSnapshotMutableState.getValue(), obj);
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f2292i;
            if (g2 && parcelableSnapshotMutableFloatState.c() == -1.0f) {
                return;
            }
            parcelableSnapshotMutableState.setValue(obj);
            this.f2288c.setValue(finiteAnimationSpec);
            Object value = parcelableSnapshotMutableFloatState.c() == -3.0f ? obj : this.f2294k.getValue();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f2291h;
            r(value, !((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue());
            parcelableSnapshotMutableState2.setValue(Boolean.valueOf(parcelableSnapshotMutableFloatState.c() == -3.0f));
            if (parcelableSnapshotMutableFloatState.c() >= 0.0f) {
                q(a().f(parcelableSnapshotMutableFloatState.c() * ((float) a().d())));
            } else if (parcelableSnapshotMutableFloatState.c() == -3.0f) {
                q(obj);
            }
            this.f2293j = false;
            parcelableSnapshotMutableFloatState.n(-1.0f);
        }
    }

    public Transition(TransitionState transitionState, Transition transition, String str) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        this.f2267a = transitionState;
        this.f2268b = transition;
        this.f2269c = str;
        f2 = SnapshotStateKt.f(transitionState.a(), StructuralEqualityPolicy.f14078a);
        this.d = f2;
        f3 = SnapshotStateKt.f(new SegmentImpl(transitionState.a(), transitionState.a()), StructuralEqualityPolicy.f14078a);
        this.e = f3;
        this.f2270f = SnapshotLongStateKt.a(0L);
        this.f2271g = SnapshotLongStateKt.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        f4 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f2272h = f4;
        this.f2273i = new SnapshotStateList();
        this.f2274j = new SnapshotStateList();
        f5 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f2275k = f5;
        this.f2277m = SnapshotStateKt.e(new Transition$totalDurationNanos$2(this));
        transitionState.d(this);
    }

    public final void a(Object obj, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1493585151);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g2.I(obj) : g2.w(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else if (g()) {
            g2.J(1823992347);
            g2.V(false);
        } else {
            g2.J(1822507602);
            q(obj);
            if (p0.a.g(obj, this.f2267a.a()) && this.f2271g.d() == Long.MIN_VALUE && !((Boolean) this.f2272h.getValue()).booleanValue()) {
                g2.J(1823982427);
                g2.V(false);
            } else {
                g2.J(1822738893);
                Object u2 = g2.u();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                if (u2 == composer$Companion$Empty$1) {
                    u2 = d.h(EffectsKt.g(g2), g2);
                }
                d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
                boolean w = ((i3 & 112) == 32) | g2.w(d0Var);
                Object u3 = g2.u();
                if (w || u3 == composer$Companion$Empty$1) {
                    u3 = new Transition$animateTo$1$1(d0Var, this);
                    g2.o(u3);
                }
                EffectsKt.b(d0Var, this, (l) u3, g2);
                g2.V(false);
            }
            g2.V(false);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new Transition$animateTo$2(this, obj, i2);
        }
    }

    public final long b() {
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, ((TransitionAnimationState) snapshotStateList.get(i2)).f2296m.d());
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j2 = Math.max(j2, ((Transition) snapshotStateList2.get(i3)).b());
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
            transitionAnimationState.f2290g = null;
            transitionAnimationState.f2289f = null;
            transitionAnimationState.f2293j = false;
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r5 = this;
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = r5.f2273i
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            androidx.compose.animation.core.Transition$TransitionAnimationState r4 = (androidx.compose.animation.core.Transition.TransitionAnimationState) r4
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r4 = r4.f2289f
            if (r4 == 0) goto L15
            goto L2d
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = r5.f2274j
            int r1 = r0.size()
            r3 = r2
        L1f:
            if (r3 >= r1) goto L32
            java.lang.Object r4 = r0.get(r3)
            androidx.compose.animation.core.Transition r4 = (androidx.compose.animation.core.Transition) r4
            boolean r4 = r4.d()
            if (r4 == 0) goto L2f
        L2d:
            r2 = 1
            goto L32
        L2f:
            int r3 = r3 + 1
            goto L1f
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.Transition.d():boolean");
    }

    public final long e() {
        Transition transition = this.f2268b;
        return transition != null ? transition.e() : this.f2270f.d();
    }

    public final Segment f() {
        return (Segment) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f2275k.getValue()).booleanValue();
    }

    public final void h(long j2, boolean z2) {
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f2271g;
        long d = parcelableSnapshotMutableLongState.d();
        TransitionState transitionState = this.f2267a;
        if (d == Long.MIN_VALUE) {
            parcelableSnapshotMutableLongState.o(j2);
            transitionState.f2334a.setValue(Boolean.TRUE);
        } else if (!((Boolean) transitionState.f2334a.getValue()).booleanValue()) {
            transitionState.f2334a.setValue(Boolean.TRUE);
        }
        this.f2272h.setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        boolean z3 = true;
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
            boolean booleanValue = ((Boolean) transitionAnimationState.f2291h.getValue()).booleanValue();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = transitionAnimationState.f2291h;
            if (!booleanValue) {
                long d2 = z2 ? transitionAnimationState.a().d() : j2;
                transitionAnimationState.q(transitionAnimationState.a().f(d2));
                transitionAnimationState.f2295l = transitionAnimationState.a().b(d2);
                if (transitionAnimationState.a().c(d2)) {
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                z3 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition transition = (Transition) snapshotStateList2.get(i3);
            Object value = transition.d.getValue();
            TransitionState transitionState2 = transition.f2267a;
            if (!p0.a.g(value, transitionState2.a())) {
                transition.h(j2, z2);
            }
            if (!p0.a.g(transition.d.getValue(), transitionState2.a())) {
                z3 = false;
            }
        }
        if (z3) {
            i();
        }
    }

    public final void i() {
        this.f2271g.o(Long.MIN_VALUE);
        TransitionState transitionState = this.f2267a;
        if (transitionState instanceof MutableTransitionState) {
            transitionState.c(this.d.getValue());
        }
        o(0L);
        transitionState.f2334a.setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f2274j;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) snapshotStateList.get(i2)).i();
        }
    }

    public final void j(float f2) {
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
            transitionAnimationState.getClass();
            if (f2 == -4.0f || f2 == -5.0f) {
                TargetBasedAnimation targetBasedAnimation = transitionAnimationState.f2290g;
                if (targetBasedAnimation != null) {
                    transitionAnimationState.a().h(targetBasedAnimation.f2262c);
                    transitionAnimationState.f2289f = null;
                    transitionAnimationState.f2290g = null;
                }
                Object obj = f2 == -4.0f ? transitionAnimationState.a().d : transitionAnimationState.a().f2262c;
                transitionAnimationState.a().h(obj);
                transitionAnimationState.a().i(obj);
                transitionAnimationState.q(obj);
                transitionAnimationState.f2296m.o(transitionAnimationState.a().d());
            } else {
                transitionAnimationState.f2292i.n(f2);
            }
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).j(f2);
        }
    }

    public final void k() {
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).f2292i.n(-2.0f);
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).k();
        }
    }

    public final void l(Object obj, long j2, Object obj2) {
        this.f2271g.o(Long.MIN_VALUE);
        TransitionState transitionState = this.f2267a;
        transitionState.f2334a.setValue(Boolean.FALSE);
        boolean g2 = g();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.d;
        if (!g2 || !p0.a.g(transitionState.a(), obj) || !p0.a.g(parcelableSnapshotMutableState.getValue(), obj2)) {
            if (!p0.a.g(transitionState.a(), obj) && (transitionState instanceof MutableTransitionState)) {
                transitionState.c(obj);
            }
            parcelableSnapshotMutableState.setValue(obj2);
            this.f2275k.setValue(Boolean.TRUE);
            this.e.setValue(new SegmentImpl(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f2274j;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = (Transition) snapshotStateList.get(i2);
            p0.a.q(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.g()) {
                transition.l(transition.f2267a.a(), j2, transition.d.getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.f2273i;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((TransitionAnimationState) snapshotStateList2.get(i3)).p(j2);
        }
        this.f2276l = j2;
    }

    public final void m(long j2) {
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f2271g;
        if (parcelableSnapshotMutableLongState.d() == Long.MIN_VALUE) {
            parcelableSnapshotMutableLongState.o(j2);
        }
        o(j2);
        this.f2272h.setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).p(j2);
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition transition = (Transition) snapshotStateList2.get(i3);
            if (!p0.a.g(transition.d.getValue(), transition.f2267a.a())) {
                transition.m(j2);
            }
        }
    }

    public final void n(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
            if (!p0.a.g(transitionAnimationState.a().f2262c, transitionAnimationState.a().d)) {
                transitionAnimationState.f2290g = transitionAnimationState.a();
                transitionAnimationState.f2289f = seekingAnimationState;
            }
            SpringSpec springSpec = transitionAnimationState.f2298o;
            TwoWayConverter twoWayConverter = transitionAnimationState.f2286a;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = transitionAnimationState.f2294k;
            Object value = parcelableSnapshotMutableState.getValue();
            Object value2 = parcelableSnapshotMutableState.getValue();
            AnimationVector c2 = transitionAnimationState.f2295l.c();
            p0.a.q(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
            transitionAnimationState.d.setValue(new TargetBasedAnimation(springSpec, twoWayConverter, value, value2, c2));
            transitionAnimationState.f2296m.o(transitionAnimationState.a().d());
            transitionAnimationState.f2293j = true;
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).n(seekingAnimationState);
        }
    }

    public final void o(long j2) {
        if (this.f2268b == null) {
            this.f2270f.o(j2);
        }
    }

    public final void p() {
        TargetBasedAnimation targetBasedAnimation;
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = transitionAnimationState.f2289f;
            if (seekingAnimationState != null && (targetBasedAnimation = transitionAnimationState.f2290g) != null) {
                long u02 = p0.a.u0(seekingAnimationState.f2183g * seekingAnimationState.d);
                Object f2 = targetBasedAnimation.f(u02);
                if (transitionAnimationState.f2293j) {
                    transitionAnimationState.a().i(f2);
                }
                transitionAnimationState.a().h(f2);
                transitionAnimationState.f2296m.o(transitionAnimationState.a().d());
                if (transitionAnimationState.f2292i.c() == -2.0f || transitionAnimationState.f2293j) {
                    transitionAnimationState.q(f2);
                } else {
                    transitionAnimationState.p(Transition.this.e());
                }
                if (u02 >= seekingAnimationState.f2183g) {
                    transitionAnimationState.f2289f = null;
                    transitionAnimationState.f2290g = null;
                } else {
                    seekingAnimationState.f2181c = false;
                }
            }
        }
        SnapshotStateList snapshotStateList2 = this.f2274j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).p();
        }
    }

    public final void q(Object obj) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.d;
        if (p0.a.g(parcelableSnapshotMutableState.getValue(), obj)) {
            return;
        }
        this.e.setValue(new SegmentImpl(parcelableSnapshotMutableState.getValue(), obj));
        TransitionState transitionState = this.f2267a;
        if (!p0.a.g(transitionState.a(), parcelableSnapshotMutableState.getValue())) {
            transitionState.c(parcelableSnapshotMutableState.getValue());
        }
        parcelableSnapshotMutableState.setValue(obj);
        if (this.f2271g.d() == Long.MIN_VALUE) {
            this.f2272h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.f2273i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < size; i2++) {
            str = str + ((TransitionAnimationState) snapshotStateList.get(i2)) + ", ";
        }
        return str;
    }
}
