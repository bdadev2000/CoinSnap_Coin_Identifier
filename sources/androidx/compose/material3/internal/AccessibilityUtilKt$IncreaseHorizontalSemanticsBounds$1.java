package androidx.compose.material3.internal;

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
public final class AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1 f12778a = new r(3);

    /* renamed from: androidx.compose.material3.internal.AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f12779a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f12780b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable, int i2) {
            super(1);
            this.f12779a = placeable;
            this.f12780b = i2;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).e(this.f12779a, -this.f12780b, 0, 0.0f);
            return b0.f30125a;
        }
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        long j2 = ((Constraints) obj3).f17480a;
        int F0 = measureScope.F0(AccessibilityUtilKt.f12776a);
        int i2 = F0 * 2;
        Placeable V = ((Measurable) obj2).V(ConstraintsKt.k(i2, 0, j2));
        int i3 = V.f15826b;
        return measureScope.T(V.f15825a - i2, i3, x.f30219a, new AnonymousClass1(V, F0));
    }
}
