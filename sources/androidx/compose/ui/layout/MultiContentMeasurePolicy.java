package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

@Stable
/* loaded from: classes2.dex */
public interface MultiContentMeasurePolicy {
    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.f15730b, IntrinsicWidthHeight.f15733b));
            }
            arrayList2.add(arrayList3);
        }
        return mo1measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList2, ConstraintsKt.b(i2, 0, 13)).getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.f15730b, IntrinsicWidthHeight.f15732a));
            }
            arrayList2.add(arrayList3);
        }
        return mo1measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList2, ConstraintsKt.b(0, i2, 7)).getWidth();
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo1measure3p2s80s(MeasureScope measureScope, List list, long j2);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.f15729a, IntrinsicWidthHeight.f15733b));
            }
            arrayList2.add(arrayList3);
        }
        return mo1measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList2, ConstraintsKt.b(i2, 0, 13)).getHeight();
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) arrayList.get(i3);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i4), IntrinsicMinMax.f15729a, IntrinsicWidthHeight.f15732a));
            }
            arrayList2.add(arrayList3);
        }
        return mo1measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList2, ConstraintsKt.b(0, i2, 7)).getWidth();
    }
}
