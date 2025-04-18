package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList;
        int i2 = Constraints.i(j2);
        int j3 = Constraints.j(j2);
        int size = list.size();
        x xVar = x.f30219a;
        if (size < 1) {
            return measureScope.T(i2, j3, xVar, EqualWeightContentMeasurePolicy$measure$1.f9268a);
        }
        int i3 = 0;
        if (Constraints.e(j2)) {
            int i4 = i2 / size;
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                int s2 = ((Measurable) list.get(i5)).s(i4);
                if (j3 < s2) {
                    int h2 = Constraints.h(j2);
                    if (s2 > h2) {
                        s2 = h2;
                    }
                    j3 = s2;
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list.size();
            while (i3 < size3) {
                arrayList2.add(((Measurable) list.get(i3)).V(ConstraintsKt.f(j2, Constraints.Companion.c(i4, j3))));
                i3++;
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i3 < size4) {
                arrayList.add(((Measurable) list.get(i3)).V(ConstraintsKt.f(j2, Constraints.Companion.d(j3))));
                i3++;
            }
        }
        return measureScope.T(i2, j3, xVar, new EqualWeightContentMeasurePolicy$measure$5(arrayList));
    }
}
