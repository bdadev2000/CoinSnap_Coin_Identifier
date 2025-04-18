package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred
/* loaded from: classes3.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final RootMeasurePolicy f15833b = new LayoutNode.NoIntrinsicsMeasurePolicy("Undefined intrinsics block and it is required");

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        boolean isEmpty = list.isEmpty();
        x xVar = x.f30219a;
        if (isEmpty) {
            return measureScope.T(Constraints.k(j2), Constraints.j(j2), xVar, RootMeasurePolicy$measure$1.f15834a);
        }
        if (list.size() == 1) {
            Placeable V = ((Measurable) list.get(0)).V(j2);
            return measureScope.T(ConstraintsKt.h(V.f15825a, j2), ConstraintsKt.g(V.f15826b, j2), xVar, new RootMeasurePolicy$measure$2(V));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            i2 = d.e((Measurable) list.get(i2), j2, arrayList, i2, 1);
        }
        int size2 = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable = (Placeable) arrayList.get(i5);
            i3 = Math.max(placeable.f15825a, i3);
            i4 = Math.max(placeable.f15826b, i4);
        }
        return measureScope.T(ConstraintsKt.h(i3, j2), ConstraintsKt.g(i4, j2), xVar, new RootMeasurePolicy$measure$4(arrayList));
    }
}
