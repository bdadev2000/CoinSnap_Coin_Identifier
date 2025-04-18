package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.common.api.Api;
import e0.u;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    public static int a(IntrinsicMeasureScope intrinsicMeasureScope, ArrayList arrayList, int i2, p pVar) {
        int i3;
        int i4;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int F0 = i2 == Integer.MAX_VALUE ? i2 : i2 - intrinsicMeasureScope.F0(ListItemKt.f9663c + ListItemKt.d);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) u.F0(list4);
        if (intrinsicMeasurable != null) {
            i3 = ((Number) pVar.invoke(intrinsicMeasurable, Integer.valueOf(F0))).intValue();
            int S = intrinsicMeasurable.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (F0 != Integer.MAX_VALUE) {
                F0 -= S;
            }
        } else {
            i3 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) u.F0(list5);
        if (intrinsicMeasurable2 != null) {
            i4 = ((Number) pVar.invoke(intrinsicMeasurable2, Integer.valueOf(F0))).intValue();
            int S2 = intrinsicMeasurable2.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (F0 != Integer.MAX_VALUE) {
                F0 -= S2;
            }
        } else {
            i4 = 0;
        }
        Object obj = (IntrinsicMeasurable) u.F0(list2);
        int intValue = obj != null ? ((Number) pVar.invoke(obj, Integer.valueOf(F0))).intValue() : 0;
        Object obj2 = (IntrinsicMeasurable) u.F0(list3);
        int intValue2 = obj2 != null ? ((Number) pVar.invoke(obj2, Integer.valueOf(F0))).intValue() : 0;
        int a2 = ListItemType.Companion.a(intValue > 0, intValue2 > 0, intValue2 > intrinsicMeasureScope.C1(TextUnitKt.b(30)));
        Object obj3 = (IntrinsicMeasurable) u.F0(list);
        return ListItemKt.c(intrinsicMeasureScope, i3, i4, obj3 != null ? ((Number) pVar.invoke(obj3, Integer.valueOf(i2))).intValue() : 0, intValue, intValue2, a2, intrinsicMeasureScope.F0((a2 == 3 ? ListItemKt.f9662b : ListItemKt.f9661a) * 2), ConstraintsKt.b(0, 0, 15));
    }

    public static int b(IntrinsicMeasureScope intrinsicMeasureScope, ArrayList arrayList, int i2, p pVar) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) u.F0(list4);
        int intValue = intrinsicMeasurable != null ? ((Number) pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) u.F0(list5);
        int intValue2 = intrinsicMeasurable2 != null ? ((Number) pVar.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) u.F0(list);
        int intValue3 = intrinsicMeasurable3 != null ? ((Number) pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) u.F0(list2);
        int intValue4 = intrinsicMeasurable4 != null ? ((Number) pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) u.F0(list3);
        int intValue5 = intrinsicMeasurable5 != null ? ((Number) pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue() : 0;
        int F0 = intrinsicMeasureScope.F0(ListItemKt.f9663c + ListItemKt.d);
        long b2 = ConstraintsKt.b(0, 0, 15);
        if (Constraints.e(b2)) {
            return Constraints.i(b2);
        }
        return F0 + intValue + Math.max(intValue3, Math.max(intValue4, intValue5)) + intValue2;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, (ArrayList) list, i2, ListItemMeasurePolicy$maxIntrinsicHeight$1.f9708a);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return b(intrinsicMeasureScope, (ArrayList) list, i2, ListItemMeasurePolicy$maxIntrinsicWidth$1.f9709a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        int i2;
        Placeable placeable;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long b2 = Constraints.b(j2, 0, 0, 0, 0, 10);
        float f2 = ListItemKt.f9663c;
        float f3 = ListItemKt.d;
        int F0 = measureScope.F0(f2 + f3);
        Measurable measurable = (Measurable) u.F0(list5);
        int R = measurable != null ? measurable.R(Constraints.h(j2)) : 0;
        Measurable measurable2 = (Measurable) u.F0(list6);
        int R2 = measurable2 != null ? measurable2.R(Constraints.h(j2)) : 0;
        int i3 = Constraints.i(b2);
        int i4 = R + R2 + F0;
        if (i3 != Integer.MAX_VALUE) {
            i3 -= i4;
        }
        Measurable measurable3 = (Measurable) u.F0(list4);
        float f4 = 2;
        long k2 = ConstraintsKt.k(-F0, -measureScope.F0((ListItemType.Companion.a(u.F0(list3) != null, u.F0(list4) != null, (measurable3 != null ? measurable3.K(i3) : 0) > measureScope.C1(TextUnitKt.b(30))) == 3 ? ListItemKt.f9662b : ListItemKt.f9661a) * f4), b2);
        Measurable measurable4 = (Measurable) u.F0(list5);
        Placeable V = measurable4 != null ? measurable4.V(k2) : null;
        int j3 = TextFieldImplKt.j(V);
        Measurable measurable5 = (Measurable) u.F0(list6);
        if (measurable5 != null) {
            i2 = 0;
            placeable = measurable5.V(ConstraintsKt.l(-j3, 0, k2, 2));
        } else {
            i2 = 0;
            placeable = null;
        }
        int j4 = TextFieldImplKt.j(placeable) + j3;
        Measurable measurable6 = (Measurable) u.F0(list2);
        Placeable V2 = measurable6 != null ? measurable6.V(ConstraintsKt.l(-j4, i2, k2, 2)) : null;
        int h2 = TextFieldImplKt.h(V2);
        Measurable measurable7 = (Measurable) u.F0(list4);
        Placeable V3 = measurable7 != null ? measurable7.V(ConstraintsKt.k(-j4, -h2, k2)) : null;
        int h3 = TextFieldImplKt.h(V3) + h2;
        boolean z2 = (V3 == null || V3.Z(AlignmentLineKt.f15692a) == V3.Z(AlignmentLineKt.f15693b)) ? i2 : 1;
        Measurable measurable8 = (Measurable) u.F0(list3);
        Placeable V4 = measurable8 != null ? measurable8.V(ConstraintsKt.k(-j4, -h3, k2)) : null;
        int a2 = ListItemType.Companion.a(V4 != null ? 1 : i2, V3 != null ? 1 : i2, z2);
        float f5 = a2 == 3 ? ListItemKt.f9662b : ListItemKt.f9661a;
        float f6 = f4 * f5;
        int i5 = Constraints.e(j2) ? Constraints.i(j2) : F0 + TextFieldImplKt.j(V) + Math.max(TextFieldImplKt.j(V2), Math.max(TextFieldImplKt.j(V4), TextFieldImplKt.j(V3))) + TextFieldImplKt.j(placeable);
        int c2 = ListItemKt.c(measureScope, TextFieldImplKt.h(V), TextFieldImplKt.h(placeable), TextFieldImplKt.h(V2), TextFieldImplKt.h(V4), TextFieldImplKt.h(V3), a2, measureScope.F0(f6), j2);
        return measureScope.T(i5, c2, x.f30219a, new ListItemKt$place$1(V, placeable, measureScope.F0(f2), a2 == 3, measureScope.F0(f5), V2, V4, V3, c2, i5, measureScope.F0(f3)));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, (ArrayList) list, i2, ListItemMeasurePolicy$minIntrinsicHeight$1.f9710a);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return b(intrinsicMeasureScope, (ArrayList) list, i2, ListItemMeasurePolicy$minIntrinsicWidth$1.f9711a);
    }
}
