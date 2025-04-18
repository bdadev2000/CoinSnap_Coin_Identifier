package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import e0.x;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {

    /* renamed from: a, reason: collision with root package name */
    public final Transition f1668a;

    /* renamed from: b, reason: collision with root package name */
    public Alignment f1669b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1670c;
    public final MutableScatterMap d;
    public State e;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class ChildData implements ParentDataModifier {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f1671a;

        public ChildData(boolean z2) {
            ParcelableSnapshotMutableState f2;
            f2 = SnapshotStateKt.f(Boolean.valueOf(z2), StructuralEqualityPolicy.f14078a);
            this.f1671a = f2;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object J(Density density, Object obj) {
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {

        /* renamed from: a, reason: collision with root package name */
        public final Transition.DeferredAnimation f1672a;

        /* renamed from: b, reason: collision with root package name */
        public final State f1673b;

        public SizeModifier(Transition.DeferredAnimation deferredAnimation, MutableState mutableState) {
            this.f1672a = deferredAnimation;
            this.f1673b = mutableState;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
            Placeable V = measurable.V(j2);
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = AnimatedContentTransitionScopeImpl.this;
            Transition.DeferredAnimation.DeferredAnimationData a2 = this.f1672a.a(new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(animatedContentTransitionScopeImpl, this), new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(animatedContentTransitionScopeImpl));
            animatedContentTransitionScopeImpl.e = a2;
            long a3 = measureScope.t0() ? IntSizeKt.a(V.f15825a, V.f15826b) : ((IntSize) a2.getValue()).f17493a;
            return measureScope.T((int) (a3 >> 32), (int) (4294967295L & a3), x.f30219a, new AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(animatedContentTransitionScopeImpl, V, a3));
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition transition, Alignment alignment) {
        ParcelableSnapshotMutableState f2;
        this.f1668a = transition;
        this.f1669b = alignment;
        f2 = SnapshotStateKt.f(new IntSize(0L), StructuralEqualityPolicy.f14078a);
        this.f1670c = f2;
        long[] jArr = ScatterMapKt.f1590a;
        this.d = new MutableScatterMap();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public final Object a() {
        return this.f1668a.f().a();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public final ContentTransform b(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.d = sizeTransform;
        return contentTransform;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public final Object c() {
        return this.f1668a.f().c();
    }
}
