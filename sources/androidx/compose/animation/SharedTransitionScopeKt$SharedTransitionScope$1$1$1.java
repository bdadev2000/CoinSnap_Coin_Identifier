package androidx.compose.animation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes3.dex */
final class SharedTransitionScopeKt$SharedTransitionScope$1$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f1935a;

    /* renamed from: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f1936a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedTransitionScopeImpl f1937b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Placeable f1938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MeasureScope measureScope, SharedTransitionScopeImpl sharedTransitionScopeImpl, Placeable placeable) {
            super(1);
            this.f1936a = measureScope;
            this.f1937b = sharedTransitionScopeImpl;
            this.f1938c = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            LayoutCoordinates b2 = placementScope.b();
            if (b2 != null) {
                boolean t02 = this.f1936a.t0();
                SharedTransitionScopeImpl sharedTransitionScopeImpl = this.f1937b;
                if (t02) {
                    sharedTransitionScopeImpl.f1919h = b2;
                } else {
                    sharedTransitionScopeImpl.f1918g = b2;
                }
            }
            placementScope.e(this.f1938c, 0, 0, 0.0f);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1$1$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(3);
        this.f1935a = sharedTransitionScopeImpl;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        Placeable V = ((Measurable) obj2).V(((Constraints) obj3).f17480a);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new AnonymousClass1(measureScope, this.f1935a, V));
    }
}
