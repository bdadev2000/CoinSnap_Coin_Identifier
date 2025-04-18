package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.f0;
import d0.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class FlowKt$Flow$1$measure$1 extends r implements l {
    final /* synthetic */ FlowCrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ List<Integer> $crossAxisSizes;
    final /* synthetic */ MainAxisAlignment $lastLineMainAxisAlignment;
    final /* synthetic */ MainAxisAlignment $mainAxisAlignment;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ LayoutOrientation $orientation;
    final /* synthetic */ List<List<Placeable>> $sequences;
    final /* synthetic */ MeasureScope $this_Layout;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowCrossAxisAlignment.values().length];
            iArr[FlowCrossAxisAlignment.Start.ordinal()] = 1;
            iArr[FlowCrossAxisAlignment.End.ordinal()] = 2;
            iArr[FlowCrossAxisAlignment.Center.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$Flow$1$measure$1(List<List<Placeable>> list, MeasureScope measureScope, float f2, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, LayoutOrientation layoutOrientation, int i2, FlowCrossAxisAlignment flowCrossAxisAlignment, List<Integer> list2, List<Integer> list3) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = measureScope;
        this.$mainAxisSpacing = f2;
        this.$mainAxisAlignment = mainAxisAlignment;
        this.$lastLineMainAxisAlignment = mainAxisAlignment2;
        this.$orientation = layoutOrientation;
        this.$mainAxisLayoutSize = i2;
        this.$crossAxisAlignment = flowCrossAxisAlignment;
        this.$crossAxisSizes = list2;
        this.$crossAxisPositions = list3;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
        Arrangement.Vertical arrangement$flowlayout_release;
        MeasureScope measureScope;
        float f2;
        int i2;
        List<Integer> list;
        MeasureScope measureScope2;
        int Flow_F4y8cZ0$crossAxisSize;
        int Flow_F4y8cZ0$crossAxisSize2;
        int Flow_F4y8cZ0$mainAxisSize;
        a.s(placementScope, "$this$layout");
        List<List<Placeable>> list2 = this.$sequences;
        MeasureScope measureScope3 = this.$this_Layout;
        float f3 = this.$mainAxisSpacing;
        MainAxisAlignment mainAxisAlignment = this.$mainAxisAlignment;
        MainAxisAlignment mainAxisAlignment2 = this.$lastLineMainAxisAlignment;
        LayoutOrientation layoutOrientation = this.$orientation;
        int i3 = this.$mainAxisLayoutSize;
        FlowCrossAxisAlignment flowCrossAxisAlignment = this.$crossAxisAlignment;
        List<Integer> list3 = this.$crossAxisSizes;
        List<Integer> list4 = this.$crossAxisPositions;
        Iterator it = list2.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 >= 0) {
                List list5 = (List) next;
                int size = list5.size();
                int[] iArr = new int[size];
                Iterator it2 = it;
                int i6 = 0;
                while (i6 < size) {
                    Flow_F4y8cZ0$mainAxisSize = FlowKt.Flow_F4y8cZ0$mainAxisSize((Placeable) list5.get(i6), layoutOrientation);
                    List<Integer> list6 = list4;
                    iArr[i6] = Flow_F4y8cZ0$mainAxisSize + (i6 < f0.p(list5) ? measureScope3.F0(f3) : 0);
                    i6++;
                    list4 = list6;
                }
                List<Integer> list7 = list4;
                if (i4 < f0.p(list2)) {
                    arrangement$flowlayout_release = mainAxisAlignment.getArrangement$flowlayout_release();
                } else {
                    arrangement$flowlayout_release = mainAxisAlignment2.getArrangement$flowlayout_release();
                }
                int[] iArr2 = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr2[i7] = 0;
                }
                arrangement$flowlayout_release.b(measureScope3, i3, iArr, iArr2);
                Iterator it3 = list5.iterator();
                int i8 = 0;
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    int i9 = i8 + 1;
                    if (i8 >= 0) {
                        Placeable placeable = (Placeable) next2;
                        int i10 = WhenMappings.$EnumSwitchMapping$0[flowCrossAxisAlignment.ordinal()];
                        Iterator it4 = it3;
                        if (i10 == 1) {
                            measureScope = measureScope3;
                            f2 = f3;
                            i2 = 0;
                        } else if (i10 == 2) {
                            measureScope = measureScope3;
                            f2 = f3;
                            int intValue = list3.get(i4).intValue();
                            Flow_F4y8cZ0$crossAxisSize = FlowKt.Flow_F4y8cZ0$crossAxisSize(placeable, layoutOrientation);
                            i2 = intValue - Flow_F4y8cZ0$crossAxisSize;
                        } else if (i10 == 3) {
                            BiasAlignment biasAlignment = Alignment.Companion.e;
                            int intValue2 = list3.get(i4).intValue();
                            Flow_F4y8cZ0$crossAxisSize2 = FlowKt.Flow_F4y8cZ0$crossAxisSize(placeable, layoutOrientation);
                            long a2 = biasAlignment.a(0L, IntSizeKt.a(0, intValue2 - Flow_F4y8cZ0$crossAxisSize2), LayoutDirection.f17494a);
                            measureScope = measureScope3;
                            f2 = f3;
                            i2 = (int) (a2 & 4294967295L);
                        } else {
                            throw new RuntimeException();
                        }
                        if (layoutOrientation == LayoutOrientation.Horizontal) {
                            list = list7;
                            measureScope2 = measureScope;
                            placementScope.e(placeable, iArr2[i8], list.get(i4).intValue() + i2, 0.0f);
                        } else {
                            list = list7;
                            measureScope2 = measureScope;
                            placementScope.e(placeable, list.get(i4).intValue() + i2, iArr2[i8], 0.0f);
                        }
                        i8 = i9;
                        measureScope3 = measureScope2;
                        it3 = it4;
                        list7 = list;
                        f3 = f2;
                    } else {
                        f0.D();
                        throw null;
                    }
                }
                list4 = list7;
                i4 = i5;
                f3 = f3;
                it = it2;
            } else {
                f0.D();
                throw null;
            }
        }
    }
}
