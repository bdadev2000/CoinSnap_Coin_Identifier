package androidx.compose.material3;

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
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002JV\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002J(\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J2\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/ListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "()V", "calculateIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "calculateIntrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo933measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        int subtractConstraintSafely;
        boolean isSupportingMultilineHeuristic;
        float m2524verticalPaddingyh95HIg;
        float m2524verticalPaddingyh95HIg2;
        int m2523calculateWidthyeHjK3Y;
        int m2522calculateHeightN4Jib3Y;
        MeasureResult place;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        List<? extends Measurable> list6 = list.get(4);
        long m6941copyZbe2FdA$default = Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int i = measureScope.mo671roundToPx0680j_4(Dp.m6997constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) CollectionsKt.firstOrNull((List) list5);
        int minIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m6949getMaxHeightimpl(j)) : 0;
        Measurable measurable2 = (Measurable) CollectionsKt.firstOrNull((List) list6);
        subtractConstraintSafely = ListItemKt.subtractConstraintSafely(Constraints.m6950getMaxWidthimpl(m6941copyZbe2FdA$default), minIntrinsicWidth + (measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m6949getMaxHeightimpl(j)) : 0) + i);
        Measurable measurable3 = (Measurable) CollectionsKt.firstOrNull((List) list4);
        isSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(subtractConstraintSafely) : 0);
        m2524verticalPaddingyh95HIg = ListItemKt.m2524verticalPaddingyh95HIg(ListItemType.INSTANCE.m2537invokeZLSjz4$material3_release(CollectionsKt.firstOrNull((List) list3) != null, CollectionsKt.firstOrNull((List) list4) != null, isSupportingMultilineHeuristic));
        float f = 2;
        long m6969offsetNN6EwU = ConstraintsKt.m6969offsetNN6EwU(m6941copyZbe2FdA$default, -i, -measureScope.mo671roundToPx0680j_4(Dp.m6997constructorimpl(m2524verticalPaddingyh95HIg * f)));
        Measurable measurable4 = (Measurable) CollectionsKt.firstOrNull((List) list5);
        Placeable mo5851measureBRTryo0 = measurable4 != null ? measurable4.mo5851measureBRTryo0(m6969offsetNN6EwU) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo5851measureBRTryo0);
        Measurable measurable5 = (Measurable) CollectionsKt.firstOrNull((List) list6);
        Placeable mo5851measureBRTryo02 = measurable5 != null ? measurable5.mo5851measureBRTryo0(ConstraintsKt.m6970offsetNN6EwU$default(m6969offsetNN6EwU, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(mo5851measureBRTryo02);
        Measurable measurable6 = (Measurable) CollectionsKt.firstOrNull((List) list2);
        Placeable mo5851measureBRTryo03 = measurable6 != null ? measurable6.mo5851measureBRTryo0(ConstraintsKt.m6970offsetNN6EwU$default(m6969offsetNN6EwU, -widthOrZero2, 0, 2, null)) : null;
        int heightOrZero = TextFieldImplKt.heightOrZero(mo5851measureBRTryo03);
        Measurable measurable7 = (Measurable) CollectionsKt.firstOrNull((List) list4);
        Placeable mo5851measureBRTryo04 = measurable7 != null ? measurable7.mo5851measureBRTryo0(ConstraintsKt.m6969offsetNN6EwU(m6969offsetNN6EwU, -widthOrZero2, -heightOrZero)) : null;
        int heightOrZero2 = heightOrZero + TextFieldImplKt.heightOrZero(mo5851measureBRTryo04);
        boolean z = (mo5851measureBRTryo04 == null || mo5851measureBRTryo04.get(AlignmentLineKt.getFirstBaseline()) == mo5851measureBRTryo04.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) CollectionsKt.firstOrNull((List) list3);
        Placeable mo5851measureBRTryo05 = measurable8 != null ? measurable8.mo5851measureBRTryo0(ConstraintsKt.m6969offsetNN6EwU(m6969offsetNN6EwU, -widthOrZero2, -heightOrZero2)) : null;
        int m2537invokeZLSjz4$material3_release = ListItemType.INSTANCE.m2537invokeZLSjz4$material3_release(mo5851measureBRTryo05 != null, mo5851measureBRTryo04 != null, z);
        m2524verticalPaddingyh95HIg2 = ListItemKt.m2524verticalPaddingyh95HIg(m2537invokeZLSjz4$material3_release);
        float m6997constructorimpl = Dp.m6997constructorimpl(f * m2524verticalPaddingyh95HIg2);
        MeasureScope measureScope2 = measureScope;
        m2523calculateWidthyeHjK3Y = ListItemKt.m2523calculateWidthyeHjK3Y(measureScope2, TextFieldImplKt.widthOrZero(mo5851measureBRTryo0), TextFieldImplKt.widthOrZero(mo5851measureBRTryo02), TextFieldImplKt.widthOrZero(mo5851measureBRTryo03), TextFieldImplKt.widthOrZero(mo5851measureBRTryo05), TextFieldImplKt.widthOrZero(mo5851measureBRTryo04), i, j);
        m2522calculateHeightN4Jib3Y = ListItemKt.m2522calculateHeightN4Jib3Y(measureScope2, TextFieldImplKt.heightOrZero(mo5851measureBRTryo0), TextFieldImplKt.heightOrZero(mo5851measureBRTryo02), TextFieldImplKt.heightOrZero(mo5851measureBRTryo03), TextFieldImplKt.heightOrZero(mo5851measureBRTryo05), TextFieldImplKt.heightOrZero(mo5851measureBRTryo04), m2537invokeZLSjz4$material3_release, measureScope.mo671roundToPx0680j_4(m6997constructorimpl), j);
        place = ListItemKt.place(measureScope, m2523calculateWidthyeHjK3Y, m2522calculateHeightN4Jib3Y, mo5851measureBRTryo0, mo5851measureBRTryo02, mo5851measureBRTryo03, mo5851measureBRTryo05, mo5851measureBRTryo04, ListItemType.m2529equalsimpl0(m2537invokeZLSjz4$material3_release, ListItemType.INSTANCE.m2535getThreeLineAlXitO8()), measureScope.mo671roundToPx0680j_4(listItemStartPadding), measureScope.mo671roundToPx0680j_4(listItemEndPadding), measureScope.mo671roundToPx0680j_4(m2524verticalPaddingyh95HIg2));
        return place;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i, ListItemMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        int m2523calculateWidthyeHjK3Y;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        int intValue = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        int intValue2 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int intValue3 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int intValue4 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        m2523calculateWidthyeHjK3Y = ListItemKt.m2523calculateWidthyeHjK3Y(intrinsicMeasureScope, intValue, intValue2, intValue3, intValue4, intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue() : 0, intrinsicMeasureScope.mo671roundToPx0680j_4(Dp.m6997constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
        return m2523calculateWidthyeHjK3Y;
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        int subtractConstraintSafely;
        int i2;
        int i3;
        boolean isSupportingMultilineHeuristic;
        float m2524verticalPaddingyh95HIg;
        int m2522calculateHeightN4Jib3Y;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        subtractConstraintSafely = ListItemKt.subtractConstraintSafely(i, intrinsicMeasureScope.mo671roundToPx0680j_4(Dp.m6997constructorimpl(ListItemKt.getListItemStartPadding() + ListItemKt.getListItemEndPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        if (intrinsicMeasurable != null) {
            i2 = function2.invoke(intrinsicMeasurable, Integer.valueOf(subtractConstraintSafely)).intValue();
            subtractConstraintSafely = ListItemKt.subtractConstraintSafely(subtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        if (intrinsicMeasurable2 != null) {
            i3 = function2.invoke(intrinsicMeasurable2, Integer.valueOf(subtractConstraintSafely)).intValue();
            subtractConstraintSafely = ListItemKt.subtractConstraintSafely(subtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i3 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int intValue = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(subtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        int intValue2 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(subtractConstraintSafely)).intValue() : 0;
        isSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, intValue2);
        int m2537invokeZLSjz4$material3_release = ListItemType.INSTANCE.m2537invokeZLSjz4$material3_release(intValue > 0, intValue2 > 0, isSupportingMultilineHeuristic);
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int intValue3 = intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue() : 0;
        m2524verticalPaddingyh95HIg = ListItemKt.m2524verticalPaddingyh95HIg(m2537invokeZLSjz4$material3_release);
        m2522calculateHeightN4Jib3Y = ListItemKt.m2522calculateHeightN4Jib3Y(intrinsicMeasureScope, i2, i3, intValue3, intValue, intValue2, m2537invokeZLSjz4$material3_release, intrinsicMeasureScope.mo671roundToPx0680j_4(Dp.m6997constructorimpl(m2524verticalPaddingyh95HIg * 2)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
        return m2522calculateHeightN4Jib3Y;
    }
}
