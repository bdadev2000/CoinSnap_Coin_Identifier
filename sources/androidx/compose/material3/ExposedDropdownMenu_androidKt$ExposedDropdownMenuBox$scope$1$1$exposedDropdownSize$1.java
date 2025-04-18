package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import d0.b0;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes3.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9367c;

    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f9368a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable) {
            super(1);
            this.f9368a = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).e(this.f9368a, 0, 0, 0.0f);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1(boolean z2, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        super(3);
        this.f9365a = z2;
        this.f9366b = mutableIntState;
        this.f9367c = mutableIntState2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        long j2 = ((Constraints) obj3).f17480a;
        float f2 = ExposedDropdownMenu_androidKt.f9345a;
        int h2 = ConstraintsKt.h(this.f9366b.g(), j2);
        int g2 = ConstraintsKt.g(this.f9367c.g(), j2);
        boolean z2 = this.f9365a;
        int k2 = z2 ? h2 : Constraints.k(j2);
        if (!z2) {
            h2 = Constraints.i(j2);
        }
        Placeable V = measurable.V(Constraints.b(j2, k2, h2, 0, g2, 4));
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new AnonymousClass1(V));
    }
}
