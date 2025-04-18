package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes4.dex */
final class SegmentedButtonKt$interactionZIndex$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f11147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11148b;

    /* renamed from: androidx.compose.material3.SegmentedButtonKt$interactionZIndex$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State f11149a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f11150b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Placeable f11151c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State state, boolean z2, Placeable placeable) {
            super(1);
            this.f11149a = state;
            this.f11150b = z2;
            this.f11151c = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).e(this.f11151c, 0, 0, ((Number) this.f11149a.getValue()).floatValue() + (this.f11150b ? 5.0f : 0.0f));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$interactionZIndex$1(MutableIntState mutableIntState, boolean z2) {
        super(3);
        this.f11147a = mutableIntState;
        this.f11148b = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Placeable V = ((Measurable) obj2).V(((Constraints) obj3).f17480a);
        return ((MeasureScope) obj).T(V.f15825a, V.f15826b, x.f30219a, new AnonymousClass1(this.f11147a, this.f11148b, V));
    }
}
