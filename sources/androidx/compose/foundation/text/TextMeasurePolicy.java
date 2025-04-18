package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import d0.k;
import e0.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final q0.a f6236a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f6237b;

    public TextMeasurePolicy(q0.a aVar, q0.a aVar2) {
        this.f6236a = aVar;
        this.f6237b = aVar2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (!(((Measurable) obj).m() instanceof TextRangeLayoutModifier)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.f6237b.invoke();
        ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Rect rect = (Rect) list2.get(i3);
                k kVar = rect != null ? new k(((Measurable) arrayList.get(i3)).V(ConstraintsKt.b((int) Math.floor(rect.h()), (int) Math.floor(rect.e()), 5)), new IntOffset(IntOffsetKt.a(Math.round(rect.f14914a), Math.round(rect.f14915b)))) : null;
                if (kVar != null) {
                    arrayList3.add(kVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object obj2 = list.get(i4);
            if (((Measurable) obj2).m() instanceof TextRangeLayoutModifier) {
                arrayList4.add(obj2);
            }
        }
        return measureScope.T(Constraints.i(j2), Constraints.h(j2), x.f30219a, new TextMeasurePolicy$measure$1(arrayList2, BasicTextKt.d(arrayList4, this.f6236a)));
    }
}
