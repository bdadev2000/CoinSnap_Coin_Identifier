package androidx.compose.foundation.lazy;

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
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyListMeasure.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\\\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u001a4\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002\u001a£\u0002\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u00102\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u00010!2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092/\u0010:\u001a+\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<¢\u0006\u0002\b?\u0012\u0004\u0012\u00020@0;H\u0000ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", FirebaseAnalytics.Param.ITEMS, "", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "createItemsAfterList", "visibleItems", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "itemsCount", "beyondBoundsItemCount", "pinnedItems", "consumedScroll", "", "isLookingAhead", "lastPostLookaheadLayoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "createItemsBeforeList", "currentFirstItemIndex", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "constraints", "Landroidx/compose/ui/unit/Constraints;", "headerIndexes", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "hasLookaheadPassOccurred", "postLookaheadLayoutInfo", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", TtmlNode.TAG_LAYOUT, "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-x0Ok8Vo", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: measureLazyList-x0Ok8Vo, reason: not valid java name */
    public static final LazyListMeasureResult m1092measureLazyListx0Ok8Vo(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, List<Integer> list, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, int i8, List<Integer> list2, boolean z3, final boolean z4, LazyListLayoutInfo lazyListLayoutInfo, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        LazyListMeasuredItem lazyListMeasuredItem;
        int i17;
        List<Integer> list3;
        int i18;
        ArrayDeque arrayDeque;
        int i19;
        ArrayDeque arrayDeque2;
        float f2;
        LazyListMeasuredItem lazyListMeasuredItem2;
        List<LazyListMeasuredItem> list4;
        int i20;
        if (i3 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding".toString());
        }
        if (i <= 0) {
            int m6952getMinWidthimpl = Constraints.m6952getMinWidthimpl(j);
            int m6951getMinHeightimpl = Constraints.m6951getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m6952getMinWidthimpl, m6951getMinHeightimpl, new ArrayList(), lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, 0, 0, coroutineScope, graphicsContext);
            if (!z4) {
                long m1150getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1150getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m7165equalsimpl0(m1150getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                    m6952getMinWidthimpl = ConstraintsKt.m6967constrainWidthK40F9xA(j, IntSize.m7167getWidthimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g));
                    m6951getMinHeightimpl = ConstraintsKt.m6966constrainHeightK40F9xA(j, IntSize.m7166getHeightimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g));
                }
            }
            return new LazyListMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(m6952getMinWidthimpl), Integer.valueOf(m6951getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), 0.0f, false, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
        }
        int i21 = 0;
        int i22 = i6;
        if (i22 >= i) {
            i22 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int round = Math.round(f);
        int i23 = i9 - round;
        if (i22 != 0 || i23 >= 0) {
            i10 = round;
        } else {
            i10 = round + i23;
            i23 = 0;
        }
        ArrayDeque arrayDeque3 = new ArrayDeque();
        int i24 = -i3;
        int i25 = (i5 < 0 ? i5 : 0) + i24;
        int i26 = i23 + i25;
        int i27 = 0;
        while (i26 < 0 && i22 > 0) {
            int i28 = i22 - 1;
            ArrayDeque arrayDeque4 = arrayDeque3;
            LazyListMeasuredItem m1098getAndMeasure0kLqBqw$default = LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i28, 0L, 2, null);
            arrayDeque4.add(0, m1098getAndMeasure0kLqBqw$default);
            i27 = Math.max(i27, m1098getAndMeasure0kLqBqw$default.getCrossAxisSize());
            i26 += m1098getAndMeasure0kLqBqw$default.getMainAxisSizeWithSpacings();
            arrayDeque3 = arrayDeque4;
            i22 = i28;
            i25 = i25;
            i24 = i24;
        }
        int i29 = i25;
        int i30 = i24;
        ArrayDeque arrayDeque5 = arrayDeque3;
        int i31 = i27;
        if (i26 < i29) {
            i10 += i26;
            i26 = i29;
        }
        int i32 = i26 - i29;
        int i33 = i2 + i4;
        int coerceAtLeast = RangesKt.coerceAtLeast(i33, 0);
        int i34 = -i32;
        int i35 = i22;
        int i36 = i35;
        boolean z5 = false;
        while (i21 < arrayDeque5.size()) {
            if (i34 >= coerceAtLeast) {
                arrayDeque5.remove(i21);
                z5 = true;
            } else {
                i36++;
                i34 += ((LazyListMeasuredItem) arrayDeque5.get(i21)).getMainAxisSizeWithSpacings();
                i21++;
            }
        }
        int i37 = i35;
        boolean z6 = z5;
        int i38 = i34;
        int i39 = i36;
        int i40 = i32;
        int i41 = i31;
        while (i39 < i && (i38 < coerceAtLeast || i38 <= 0 || arrayDeque5.isEmpty())) {
            int i42 = i39;
            int i43 = i41;
            int i44 = coerceAtLeast;
            int i45 = i33;
            LazyListMeasuredItem m1098getAndMeasure0kLqBqw$default2 = LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i39, 0L, 2, null);
            i38 += m1098getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
            if (i38 <= i29) {
                i20 = i42;
                if (i20 != i - 1) {
                    i40 -= m1098getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
                    i37 = i20 + 1;
                    z6 = true;
                    i41 = i43;
                    i39 = i20 + 1;
                    coerceAtLeast = i44;
                    i33 = i45;
                }
            } else {
                i20 = i42;
            }
            int max = Math.max(i43, m1098getAndMeasure0kLqBqw$default2.getCrossAxisSize());
            arrayDeque5.add(m1098getAndMeasure0kLqBqw$default2);
            i41 = max;
            i39 = i20 + 1;
            coerceAtLeast = i44;
            i33 = i45;
        }
        int i46 = i33;
        int i47 = i39;
        if (i38 < i2) {
            int i48 = i2 - i38;
            int i49 = i38 + i48;
            int i50 = i37;
            int i51 = i40 - i48;
            int i52 = i41;
            while (i51 < i3 && i50 > 0) {
                int i53 = i50 - 1;
                LazyListMeasuredItem m1098getAndMeasure0kLqBqw$default3 = LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i53, 0L, 2, null);
                arrayDeque5.add(0, m1098getAndMeasure0kLqBqw$default3);
                i52 = Math.max(i52, m1098getAndMeasure0kLqBqw$default3.getCrossAxisSize());
                i51 += m1098getAndMeasure0kLqBqw$default3.getMainAxisSizeWithSpacings();
                i47 = i47;
                i50 = i53;
            }
            int i54 = i51;
            i11 = i47;
            int i55 = i48 + i10;
            if (i54 < 0) {
                i14 = 0;
                i41 = i52;
                i37 = i50;
                i13 = i55 + i54;
                i12 = i49 + i54;
            } else {
                i41 = i52;
                i14 = i54;
                i37 = i50;
                i13 = i55;
                i12 = i49;
            }
        } else {
            i11 = i47;
            i12 = i38;
            i13 = i10;
            i14 = i40;
        }
        float f3 = (MathKt.getSign(Math.round(f)) != MathKt.getSign(i13) || Math.abs(Math.round(f)) < Math.abs(i13)) ? f : i13;
        float f4 = f - f3;
        float f5 = (!z4 || i13 <= i10 || f4 > 0.0f) ? 0.0f : (i13 - i10) + f4;
        if (i14 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset".toString());
        }
        int i56 = -i14;
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) arrayDeque5.first();
        if (i3 > 0 || i5 < 0) {
            int size = arrayDeque5.size();
            LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem3;
            int i57 = 0;
            while (true) {
                if (i57 >= size) {
                    i15 = i56;
                    break;
                }
                i15 = i56;
                int mainAxisSizeWithSpacings = ((LazyListMeasuredItem) arrayDeque5.get(i57)).getMainAxisSizeWithSpacings();
                if (i14 == 0 || mainAxisSizeWithSpacings > i14) {
                    break;
                }
                i16 = i41;
                if (i57 == CollectionsKt.getLastIndex(arrayDeque5)) {
                    break;
                }
                i14 -= mainAxisSizeWithSpacings;
                i57++;
                i41 = i16;
                lazyListMeasuredItem4 = (LazyListMeasuredItem) arrayDeque5.get(i57);
                i56 = i15;
            }
            i16 = i41;
            lazyListMeasuredItem = lazyListMeasuredItem4;
            i17 = i8;
            list3 = list2;
            i18 = i14;
        } else {
            lazyListMeasuredItem = lazyListMeasuredItem3;
            i18 = i14;
            i15 = i56;
            i16 = i41;
            i17 = i8;
            list3 = list2;
        }
        List<LazyListMeasuredItem> createItemsBeforeList = createItemsBeforeList(i37, lazyListMeasuredItemProvider, i17, list3);
        int i58 = i16;
        int i59 = 0;
        for (int size2 = createItemsBeforeList.size(); i59 < size2; size2 = size2) {
            i58 = Math.max(i58, createItemsBeforeList.get(i59).getCrossAxisSize());
            i59++;
        }
        ArrayDeque arrayDeque6 = arrayDeque5;
        int i60 = i58;
        int i61 = i15;
        float f6 = f3;
        float f7 = f5;
        LazyListMeasuredItem lazyListMeasuredItem5 = lazyListMeasuredItem;
        List<LazyListMeasuredItem> createItemsAfterList = createItemsAfterList(arrayDeque6, lazyListMeasuredItemProvider, i, i8, list2, f6, z4, lazyListLayoutInfo);
        int size3 = createItemsAfterList.size();
        int i62 = i60;
        for (int i63 = 0; i63 < size3; i63++) {
            i62 = Math.max(i62, createItemsAfterList.get(i63).getCrossAxisSize());
        }
        boolean z7 = Intrinsics.areEqual(lazyListMeasuredItem5, arrayDeque5.first()) && createItemsBeforeList.isEmpty() && createItemsAfterList.isEmpty();
        if (z) {
            i19 = i62;
            arrayDeque = arrayDeque5;
        } else {
            arrayDeque = arrayDeque5;
            i19 = i12;
        }
        int m6967constrainWidthK40F9xA = ConstraintsKt.m6967constrainWidthK40F9xA(j, i19);
        if (z) {
            i62 = i12;
        }
        int m6966constrainHeightK40F9xA = ConstraintsKt.m6966constrainHeightK40F9xA(j, i62);
        final List<LazyListMeasuredItem> calculateItemsOffsets = calculateItemsOffsets(arrayDeque6, createItemsBeforeList, createItemsAfterList, m6967constrainWidthK40F9xA, m6966constrainHeightK40F9xA, i12, i2, i61, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f6, m6967constrainWidthK40F9xA, m6966constrainHeightK40F9xA, calculateItemsOffsets, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, i18, i12, coroutineScope, graphicsContext);
        if (z4) {
            arrayDeque2 = arrayDeque;
            f2 = f6;
            lazyListMeasuredItem2 = lazyListMeasuredItem5;
        } else {
            f2 = f6;
            lazyListMeasuredItem2 = lazyListMeasuredItem5;
            long m1150getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1150getMinSizeToFitDisappearingItemsYbymL2g();
            arrayDeque2 = arrayDeque;
            if (!IntSize.m7165equalsimpl0(m1150getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                int i64 = z ? m6966constrainHeightK40F9xA : m6967constrainWidthK40F9xA;
                m6967constrainWidthK40F9xA = ConstraintsKt.m6967constrainWidthK40F9xA(j, Math.max(m6967constrainWidthK40F9xA, IntSize.m7167getWidthimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g2)));
                m6966constrainHeightK40F9xA = ConstraintsKt.m6966constrainHeightK40F9xA(j, Math.max(m6966constrainHeightK40F9xA, IntSize.m7166getHeightimpl(m1150getMinSizeToFitDisappearingItemsYbymL2g2)));
                int i65 = z ? m6966constrainHeightK40F9xA : m6967constrainWidthK40F9xA;
                if (i65 != i64) {
                    int size4 = calculateItemsOffsets.size();
                    for (int i66 = 0; i66 < size4; i66++) {
                        calculateItemsOffsets.get(i66).updateMainAxisLayoutSize(i65);
                    }
                }
            }
        }
        int i67 = m6967constrainWidthK40F9xA;
        int i68 = m6966constrainHeightK40F9xA;
        final LazyListMeasuredItem findOrComposeLazyListHeader = list.isEmpty() ^ true ? LazyListHeadersKt.findOrComposeLazyListHeader(calculateItemsOffsets, lazyListMeasuredItemProvider, list, i3, i67, i68) : null;
        boolean z8 = i11 < i || i12 > i2;
        MeasureResult invoke = function3.invoke(Integer.valueOf(i67), Integer.valueOf(i68), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
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
                List<LazyListMeasuredItem> list5 = calculateItemsOffsets;
                LazyListMeasuredItem lazyListMeasuredItem6 = findOrComposeLazyListHeader;
                boolean z9 = z4;
                int size5 = list5.size();
                for (int i69 = 0; i69 < size5; i69++) {
                    LazyListMeasuredItem lazyListMeasuredItem7 = list5.get(i69);
                    if (lazyListMeasuredItem7 != lazyListMeasuredItem6) {
                        lazyListMeasuredItem7.place(placementScope, z9);
                    }
                }
                LazyListMeasuredItem lazyListMeasuredItem8 = findOrComposeLazyListHeader;
                if (lazyListMeasuredItem8 != null) {
                    lazyListMeasuredItem8.place(placementScope, z4);
                }
                ObservableScopeInvalidator.m1159attachToScopeimpl(mutableState);
            }
        });
        if (z7) {
            list4 = calculateItemsOffsets;
        } else {
            ArrayList arrayList = new ArrayList(calculateItemsOffsets.size());
            int size5 = calculateItemsOffsets.size();
            for (int i69 = 0; i69 < size5; i69++) {
                LazyListMeasuredItem lazyListMeasuredItem6 = calculateItemsOffsets.get(i69);
                LazyListMeasuredItem lazyListMeasuredItem7 = lazyListMeasuredItem6;
                if ((lazyListMeasuredItem7.getIndex() >= ((LazyListMeasuredItem) arrayDeque2.first()).getIndex() && lazyListMeasuredItem7.getIndex() <= ((LazyListMeasuredItem) arrayDeque2.last()).getIndex()) || lazyListMeasuredItem7 == findOrComposeLazyListHeader) {
                    arrayList.add(lazyListMeasuredItem6);
                }
            }
            list4 = arrayList;
        }
        return new LazyListMeasureResult(lazyListMeasuredItem2, i18, z8, f2, invoke, f7, z6, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), list4, i30, i46, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5, null);
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i2, List<Integer> list2, float f, boolean z, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        LazyListMeasuredItem lazyListMeasuredItem2;
        int mainAxisSizeWithSpacings;
        LazyListMeasuredItem lazyListMeasuredItem3;
        int index;
        int min;
        LazyListMeasuredItem lazyListMeasuredItem4;
        LazyListMeasuredItem lazyListMeasuredItem5;
        int i3 = i - 1;
        int min2 = Math.min(((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + i2, i3);
        int index2 = ((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= min2) {
            ArrayList arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList = arrayList2;
                arrayList.add(LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index2, 0L, 2, null));
                if (index2 == min2) {
                    break;
                }
                index2++;
                arrayList2 = arrayList;
            }
        } else {
            arrayList = null;
        }
        if (z && lazyListLayoutInfo != null && (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyListItemInfo = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() <= min2 || (size != 0 && visibleItemsInfo.get(size - 1).getIndex() > min2)) {
                }
            }
            lazyListItemInfo = visibleItemsInfo.get(size);
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (min = Math.min(lazyListItemInfo2.getIndex(), i3))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                            lazyListMeasuredItem5 = arrayList.get(i4);
                            if (lazyListMeasuredItem5.getIndex() == index) {
                                break;
                            }
                            i4++;
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index, 0L, 2, null));
                    }
                    if (index == min) {
                        break;
                    }
                    index++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i5 = 0;
                while (index3 < i && i5 < viewportEndOffset) {
                    if (index3 <= min2) {
                        int size3 = list.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                            lazyListMeasuredItem3 = list.get(i6);
                            if (lazyListMeasuredItem3.getIndex() == index3) {
                                break;
                            }
                            i6++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                            lazyListMeasuredItem2 = arrayList.get(i7);
                            if (lazyListMeasuredItem2.getIndex() == index3) {
                                break;
                            }
                            i7++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem2;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i5 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() > min2) {
            min2 = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i8 = 0; i8 < size5; i8++) {
            int intValue = list2.get(i8).intValue();
            if (intValue > min2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, intValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, List<Integer> list) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i3, 0L, 2, null));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m1098getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, intValue, 0L, 2, null));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = list.get(calculateItemsOffsets$reverseAware(i7, z2, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr2[i8] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
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
                    int i9 = iArr2[first];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(first, z2, size));
                    if (z2) {
                        i9 = (i6 - i9) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(i9, i, i2);
                    arrayList.add(lazyListMeasuredItem);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size2 = list2.size();
            int i10 = i5;
            for (int i11 = 0; i11 < size2; i11++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i11);
                i10 -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(i10, i, i2);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i13);
                lazyListMeasuredItem3.position(i12, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                i12 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i14 = 0; i14 < size4; i14++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i14);
                lazyListMeasuredItem4.position(i12, i, i2);
                arrayList.add(lazyListMeasuredItem4);
                i12 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }
}
