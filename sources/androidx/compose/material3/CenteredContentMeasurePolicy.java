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
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList;
        int i2 = Constraints.i(j2);
        int j3 = Constraints.j(j2);
        int size = list.size();
        x xVar = x.f30219a;
        if (size < 1) {
            return measureScope.T(i2, j3, xVar, CenteredContentMeasurePolicy$measure$1.f8184a);
        }
        ?? obj = new Object();
        int i3 = 0;
        if (Constraints.e(j2)) {
            int i4 = i2 / size;
            float f2 = ExpressiveNavigationBarKt.f9386a;
            int t02 = size > 6 ? 0 : p0.a.t0((((100 - ((size + 3) * 10)) / 2.0f) / 100) * i2);
            obj.f30925a = t02;
            int i5 = (i2 - (t02 * 2)) / size;
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                int s2 = ((Measurable) list.get(i6)).s(i5);
                if (j3 < s2) {
                    int h2 = Constraints.h(j2);
                    if (s2 > h2) {
                        s2 = h2;
                    }
                    j3 = s2;
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i3 < size3) {
                Measurable measurable = (Measurable) list.get(i3);
                int S = measurable.S(Constraints.j(j2));
                if (i5 < S) {
                    if (S > i4) {
                        S = i4;
                    }
                    obj.f30925a -= (S - i5) / 2;
                } else {
                    S = i5;
                }
                arrayList.add(measurable.V(ConstraintsKt.f(j2, Constraints.Companion.c(S, j3))));
                i3++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i3 < size4) {
                arrayList.add(((Measurable) list.get(i3)).V(ConstraintsKt.f(j2, Constraints.Companion.d(j3))));
                i3++;
            }
        }
        return measureScope.T(i2, j3, xVar, new CenteredContentMeasurePolicy$measure$5(obj, arrayList));
    }
}
