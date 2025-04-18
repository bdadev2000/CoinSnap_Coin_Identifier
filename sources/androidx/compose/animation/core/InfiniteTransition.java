package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class InfiniteTransition {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f2098a = new MutableVector(new TransitionAnimationState[16]);

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2099b;

    /* renamed from: c, reason: collision with root package name */
    public long f2100c;
    public final ParcelableSnapshotMutableState d;

    /* loaded from: classes2.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f2101a;

        /* renamed from: b, reason: collision with root package name */
        public Object f2102b;

        /* renamed from: c, reason: collision with root package name */
        public final TwoWayConverter f2103c;
        public final ParcelableSnapshotMutableState d;

        /* renamed from: f, reason: collision with root package name */
        public AnimationSpec f2104f;

        /* renamed from: g, reason: collision with root package name */
        public TargetBasedAnimation f2105g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2106h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2107i;

        /* renamed from: j, reason: collision with root package name */
        public long f2108j;

        public TransitionAnimationState(Number number, Number number2, TwoWayConverter twoWayConverter, AnimationSpec animationSpec) {
            ParcelableSnapshotMutableState f2;
            this.f2101a = number;
            this.f2102b = number2;
            this.f2103c = twoWayConverter;
            f2 = SnapshotStateKt.f(number, StructuralEqualityPolicy.f14078a);
            this.d = f2;
            this.f2104f = animationSpec;
            this.f2105g = new TargetBasedAnimation(animationSpec, twoWayConverter, this.f2101a, this.f2102b, null);
        }

        @Override // androidx.compose.runtime.State
        public final Object getValue() {
            return this.d.getValue();
        }
    }

    public InfiniteTransition() {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f2099b = f2;
        this.f2100c = Long.MIN_VALUE;
        f3 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.d = f3;
    }

    public final void a(Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-318043801);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.f2099b.getValue()).booleanValue()) {
                g2.J(1719915818);
                boolean w = g2.w(this);
                Object u3 = g2.u();
                if (w || u3 == composer$Companion$Empty$1) {
                    u3 = new InfiniteTransition$run$1$1(mutableState, this, null);
                    g2.o(u3);
                }
                EffectsKt.f(this, (p) u3, g2);
                g2.V(false);
            } else {
                g2.J(1721436120);
                g2.V(false);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new InfiniteTransition$run$2(this, i2);
        }
    }
}
