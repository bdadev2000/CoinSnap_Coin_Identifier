package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public PaddingValues f4080o;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        float f2 = 0;
        if (Float.compare(this.f4080o.b(measureScope.getLayoutDirection()), f2) < 0 || Float.compare(this.f4080o.d(), f2) < 0 || Float.compare(this.f4080o.c(measureScope.getLayoutDirection()), f2) < 0 || Float.compare(this.f4080o.a(), f2) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int F0 = measureScope.F0(this.f4080o.c(measureScope.getLayoutDirection())) + measureScope.F0(this.f4080o.b(measureScope.getLayoutDirection()));
        int F02 = measureScope.F0(this.f4080o.a()) + measureScope.F0(this.f4080o.d());
        Placeable V = measurable.V(ConstraintsKt.k(-F0, -F02, j2));
        return measureScope.T(ConstraintsKt.h(V.f15825a + F0, j2), ConstraintsKt.g(V.f15826b + F02, j2), x.f30219a, new PaddingValuesModifier$measure$2(V, measureScope, this));
    }
}
