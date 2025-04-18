package g;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import e1.i1;
import e1.t0;

/* loaded from: classes3.dex */
public final class z implements r.h, LayoutModifier {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f30585a = t0.c(new Constraints(j0.f30545a));

    @Override // r.h
    public final Object c(f.l lVar) {
        return p0.a.e0(new s(this.f30585a, 1), lVar);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        this.f30585a.h(new Constraints(j2));
        Placeable V = measurable.V(j2);
        return measureScope.T(V.f15825a, V.f15826b, e0.x.f30219a, new x(V));
    }
}
