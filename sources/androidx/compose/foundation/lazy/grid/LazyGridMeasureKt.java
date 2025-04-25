package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGridMeasure.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0083\b\u001a\u008c\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a¸\u0002\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010.\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020423\u00105\u001a/\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+090\u00010\n2/\u0010:\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0\n¢\u0006\u0002\b>\u0012\u0004\u0012\u00020?0;H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a+\u0010B\u001a\u00020=\"\u0004\b\u0000\u0010C*\b\u0012\u0004\u0012\u0002HC0\r2\f\u0010D\u001a\b\u0012\u0004\u0012\u0002HC0EH\u0002¢\u0006\u0002\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "filter", "Lkotlin/Function1;", "", "calculateItemsOffsets", "", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "slotsPerLine", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "prefetchInfoRetriever", "Lkotlin/ParameterName;", "name", "line", "Lkotlin/Pair;", TtmlNode.TAG_LAYOUT, "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-OZKpZRA", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "addAllFromArray", ExifInterface.GPS_DIRECTION_TRUE, "arr", "", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: measureLazyGrid-OZKpZRA, reason: not valid java name */
    public static final LazyGridMeasureResult m1126measureLazyGridOZKpZRA(int i, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        LazyGridMeasuredLine lazyGridMeasuredLine;
        int m6967constrainWidthK40F9xA;
        int m6949getMaxHeightimpl;
        int i14;
        int i15;
        List<LazyGridMeasuredItem> list2;
        int i16;
        int i17;
        int i18;
        int i19;
        float f2;
        int i20;
        int i21;
        int i22;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i23;
        int i24;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        if (i <= 0) {
            int m6952getMinWidthimpl = Constraints.m6952getMinWidthimpl(j);
            int m6951getMinHeightimpl = Constraints.m6951getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m6952getMinWidthimpl, m6951getMinHeightimpl, new ArrayList(), lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, false, i8, false, 0, 0, coroutineScope, graphicsContext);
            long m1150getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1150getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m7165equalsimpl0(m1150getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                m6952getMinWidthimpl = ConstraintsKt.m6967constrainWidthK40F9xA(j, IntSize.m7167getWidthimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g));
                m6951getMinHeightimpl = ConstraintsKt.m6966constrainHeightK40F9xA(j, IntSize.m7166getHeightimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyGridMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(m6952getMinWidthimpl), Integer.valueOf(m6951getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, coroutineScope, density, i8, function1, CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int round = Math.round(f);
        int i25 = i7 - round;
        if (i6 == 0 && i25 < 0) {
            round += i25;
            i25 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i26 = -i3;
        int i27 = (i5 < 0 ? i5 : 0) + i26;
        int i28 = i25 + i27;
        int i29 = i6;
        while (i28 < 0 && i29 > 0) {
            i29--;
            LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i29);
            arrayDeque.add(0, andMeasure);
            i28 += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (i28 < i27) {
            round += i28;
            i28 = i27;
        }
        int i30 = i28 - i27;
        int i31 = i2 + i4;
        int i32 = i29;
        int coerceAtLeast = RangesKt.coerceAtLeast(i31, 0);
        int i33 = i32;
        int i34 = i30;
        int i35 = i26;
        int i36 = -i30;
        int i37 = 0;
        boolean z4 = false;
        while (true) {
            z3 = true;
            if (i37 >= arrayDeque.size()) {
                break;
            }
            if (i36 >= coerceAtLeast) {
                arrayDeque.remove(i37);
                z4 = true;
            } else {
                i33++;
                i36 += ((LazyGridMeasuredLine) arrayDeque.get(i37)).getMainAxisSizeWithSpacings();
                i37++;
            }
        }
        int i38 = i36;
        boolean z5 = z4;
        int i39 = i33;
        int i40 = i32;
        while (i39 < i && (i38 < coerceAtLeast || i38 <= 0 || arrayDeque.isEmpty())) {
            int i41 = coerceAtLeast;
            LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i39);
            if (andMeasure2.isEmpty()) {
                break;
            }
            i38 += andMeasure2.getMainAxisSizeWithSpacings();
            if (i38 <= i27) {
                i23 = i27;
                i24 = i40;
                if (((LazyGridMeasuredItem) ArraysKt.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    i34 -= andMeasure2.getMainAxisSizeWithSpacings();
                    i40 = i39 + 1;
                    z5 = true;
                    i39++;
                    coerceAtLeast = i41;
                    i27 = i23;
                }
            } else {
                i23 = i27;
                i24 = i40;
            }
            arrayDeque.add(andMeasure2);
            i40 = i24;
            i39++;
            coerceAtLeast = i41;
            i27 = i23;
        }
        int i42 = i40;
        if (i38 < i2) {
            int i43 = i2 - i38;
            int i44 = i38 + i43;
            int i45 = i42;
            int i46 = i34 - i43;
            while (i46 < i3 && i45 > 0) {
                int i47 = i45 - 1;
                LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i47);
                arrayDeque.add(0, andMeasure3);
                i46 += andMeasure3.getMainAxisSizeWithSpacings();
                i45 = i47;
            }
            round += i43;
            if (i46 < 0) {
                round += i46;
                i9 = i44 + i46;
                i10 = 0;
            } else {
                i9 = i44;
                i10 = i46;
            }
        } else {
            i9 = i38;
            i10 = i34;
        }
        float f3 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(round) || Math.abs(Math.round(f)) < Math.abs(round)) ? f : round;
        if (i10 < 0) {
            throw new IllegalArgumentException("negative initial offset".toString());
        }
        int i48 = -i10;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine2.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : 0;
        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
        if (lazyGridMeasuredLine3 == null || (items = lazyGridMeasuredLine3.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) {
            i11 = i48;
            i12 = 0;
        } else {
            i12 = lazyGridMeasuredItem.getIndex();
            i11 = i48;
        }
        int size = list.size();
        ArrayList arrayList = null;
        List list3 = null;
        int i49 = 0;
        while (i49 < size) {
            int i50 = size;
            int intValue = list.get(i49).intValue();
            if (intValue < 0 || intValue >= index) {
                i17 = i50;
                i18 = i12;
                i19 = index;
                f2 = f3;
                i20 = i31;
                i21 = i35;
                i22 = i10;
            } else {
                float f4 = f3;
                int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                i18 = i12;
                i19 = index;
                i17 = i50;
                f2 = f4;
                i20 = i31;
                i21 = i35;
                i22 = i10;
                LazyGridMeasuredItem mo1099getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo1099getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m1130childConstraintsJhjzzOo$foundation_release(0, spanOf));
                ArrayList arrayList2 = list3 == null ? new ArrayList() : list3;
                arrayList2.add(mo1099getAndMeasurehBUhpc);
                list3 = arrayList2;
            }
            i49++;
            i12 = i18;
            i10 = i22;
            size = i17;
            index = i19;
            f3 = f2;
            i35 = i21;
            i31 = i20;
        }
        int i51 = i12;
        int i52 = index;
        float f5 = f3;
        int i53 = i31;
        int i54 = i35;
        int i55 = i10;
        if (list3 == null) {
            list3 = CollectionsKt.emptyList();
        }
        List list4 = list3;
        int size2 = list.size();
        int i56 = 0;
        while (i56 < size2) {
            int intValue2 = list.get(i56).intValue();
            if (i51 + 1 > intValue2 || intValue2 >= i) {
                i16 = i56;
            } else {
                int spanOf2 = lazyGridMeasuredLineProvider.spanOf(intValue2);
                i16 = i56;
                LazyGridMeasuredItem mo1099getAndMeasurehBUhpc2 = lazyGridMeasuredItemProvider.mo1099getAndMeasurehBUhpc(intValue2, 0, spanOf2, lazyGridMeasuredLineProvider.m1130childConstraintsJhjzzOo$foundation_release(0, spanOf2));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List list5 = arrayList;
                list5.add(mo1099getAndMeasurehBUhpc2);
                arrayList = list5;
            }
            i56 = i16 + 1;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        List list6 = arrayList;
        if (i3 > 0 || i5 < 0) {
            int size3 = arrayDeque.size();
            int i57 = i55;
            int i58 = 0;
            while (i58 < size3) {
                int mainAxisSizeWithSpacings = ((LazyGridMeasuredLine) arrayDeque.get(i58)).getMainAxisSizeWithSpacings();
                if (i57 == 0 || mainAxisSizeWithSpacings > i57 || i58 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                i57 -= mainAxisSizeWithSpacings;
                i58++;
                lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.get(i58);
            }
            i13 = i57;
            lazyGridMeasuredLine = lazyGridMeasuredLine2;
        } else {
            lazyGridMeasuredLine = lazyGridMeasuredLine2;
            i13 = i55;
        }
        if (z) {
            m6967constrainWidthK40F9xA = Constraints.m6950getMaxWidthimpl(j);
        } else {
            m6967constrainWidthK40F9xA = ConstraintsKt.m6967constrainWidthK40F9xA(j, i9);
        }
        int i59 = m6967constrainWidthK40F9xA;
        if (z) {
            m6949getMaxHeightimpl = ConstraintsKt.m6966constrainHeightK40F9xA(j, i9);
        } else {
            m6949getMaxHeightimpl = Constraints.m6949getMaxHeightimpl(j);
        }
        int i60 = m6949getMaxHeightimpl;
        int i61 = i9;
        final List<LazyGridMeasuredItem> calculateItemsOffsets = calculateItemsOffsets(arrayDeque, list4, list6, i59, i60, i61, i2, i11, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f5, i59, i60, calculateItemsOffsets, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, false, i8, false, i13, i61, coroutineScope, graphicsContext);
        long m1150getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1150getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7165equalsimpl0(m1150getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
            i14 = i60;
            i15 = i59;
        } else {
            int i62 = z ? i60 : i59;
            int m6967constrainWidthK40F9xA2 = ConstraintsKt.m6967constrainWidthK40F9xA(j, Math.max(i59, IntSize.m7167getWidthimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g2)));
            i14 = ConstraintsKt.m6966constrainHeightK40F9xA(j, Math.max(i60, IntSize.m7166getHeightimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i63 = z ? i14 : m6967constrainWidthK40F9xA2;
            if (i63 != i62) {
                int size4 = calculateItemsOffsets.size();
                for (int i64 = 0; i64 < size4; i64++) {
                    calculateItemsOffsets.get(i64).updateMainAxisLayoutSize(i63);
                }
            }
            i15 = m6967constrainWidthK40F9xA2;
        }
        if (i51 == i - 1 && i61 <= i2) {
            z3 = false;
        }
        MeasureResult invoke = function3.invoke(Integer.valueOf(i15), Integer.valueOf(i14), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyGridMeasuredItem> list7 = calculateItemsOffsets;
                int size5 = list7.size();
                for (int i65 = 0; i65 < size5; i65++) {
                    list7.get(i65).place(placementScope);
                }
                ObservableScopeInvalidator.m1159attachToScopeimpl(mutableState);
            }
        });
        if (list4.isEmpty() && list6.isEmpty()) {
            list2 = calculateItemsOffsets;
        } else {
            ArrayList arrayList3 = new ArrayList(calculateItemsOffsets.size());
            int size5 = calculateItemsOffsets.size();
            int i65 = 0;
            while (i65 < size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem3 = calculateItemsOffsets.get(i65);
                int index2 = lazyGridMeasuredItem3.getIndex();
                int i66 = i52;
                if (i66 <= index2 && index2 <= i51) {
                    arrayList3.add(lazyGridMeasuredItem3);
                }
                i65++;
                i52 = i66;
            }
            list2 = arrayList3;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine, i13, z3, f5, invoke, z5, coroutineScope, density, i8, function1, list2, i54, i53, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr2[i10] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalArrangement".toString());
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i11 = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z2, size2));
                    if (z2) {
                        i11 = (i6 - i11) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(i11, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i12 = i5;
                while (true) {
                    int i13 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    i12 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(i12, 0, i, i2);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i13 < 0) {
                        break;
                    }
                    size3 = i13;
                }
            }
            int size4 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size4; i15++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i15);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(i14, i, i2));
                i14 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i16 = 0; i16 < size5; i16++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i16);
                lazyGridMeasuredItem2.position(i14, 0, i, i2);
                arrayList.add(lazyGridMeasuredItem2);
                i14 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, Function1<? super Integer, Boolean> function1) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int intValue = list.get(i).intValue();
            if (function1.invoke(Integer.valueOf(intValue)).booleanValue()) {
                int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                LazyGridMeasuredItem mo1099getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo1099getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m1130childConstraintsJhjzzOo$foundation_release(0, spanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(mo1099getAndMeasurehBUhpc);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
