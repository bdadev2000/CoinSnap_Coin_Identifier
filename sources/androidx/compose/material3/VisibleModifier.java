package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import e0.x;

/* loaded from: classes3.dex */
final class VisibleModifier extends InspectorValueInfo implements LayoutModifier {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12633a;

    public VisibleModifier(boolean z2) {
        this.f12633a = z2;
    }

    public final boolean equals(Object obj) {
        VisibleModifier visibleModifier = obj instanceof VisibleModifier ? (VisibleModifier) obj : null;
        return visibleModifier != null && this.f12633a == visibleModifier.f12633a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12633a);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        boolean z2 = this.f12633a;
        x xVar = x.f30219a;
        return !z2 ? measureScope.T(0, 0, xVar, VisibleModifier$measure$1.f12634a) : measureScope.T(V.f15825a, V.f15826b, xVar, new VisibleModifier$measure$2(V));
    }
}
