package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: PagerSnapLayoutInfoProvider.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u001a8\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0017\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b\u001a\f\u0010\u0014\u001a\u00020\b*\u00020\u0003H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0003H\u0002¨\u0006\u0018"}, d2 = {"SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "calculateFinalSnappingBound", "Lkotlin/Function3;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "dragGestureDelta", "isLtrDragging", "", "isScrollingForward", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PagerSnapLayoutInfoProviderKt {
    private static final void debugLog(Function0<String> function0) {
    }

    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final Function3<? super Float, ? super Float, ? super Float, Float> function3) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            public final boolean isValidDistance(float f) {
                return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return PagerState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float velocity) {
                Pair<Float, Float> searchForSnappingBounds = searchForSnappingBounds(PagerState.this.getLayoutInfo().getSnapPosition());
                float floatValue = searchForSnappingBounds.component1().floatValue();
                float floatValue2 = searchForSnappingBounds.component2().floatValue();
                float floatValue3 = function3.invoke(Float.valueOf(velocity), Float.valueOf(floatValue), Float.valueOf(floatValue2)).floatValue();
                if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
                    throw new IllegalStateException(("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0").toString());
                }
                if (isValidDistance(floatValue3)) {
                    return floatValue3;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float velocity, float decayOffset) {
                int firstVisiblePage;
                int pageSize$foundation_release = PagerState.this.getPageSize$foundation_release() + PagerState.this.getPageSpacing$foundation_release();
                if (pageSize$foundation_release == 0) {
                    return 0.0f;
                }
                if (velocity < 0.0f) {
                    firstVisiblePage = PagerState.this.getFirstVisiblePage() + 1;
                } else {
                    firstVisiblePage = PagerState.this.getFirstVisiblePage();
                }
                int coerceAtLeast = RangesKt.coerceAtLeast(Math.abs((RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(firstVisiblePage, RangesKt.coerceIn(((int) (decayOffset / pageSize$foundation_release)) + firstVisiblePage, 0, PagerState.this.getPageCount()), velocity, PagerState.this.getPageSize$foundation_release(), PagerState.this.getPageSpacing$foundation_release()), 0, PagerState.this.getPageCount()) - firstVisiblePage) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                if (coerceAtLeast == 0) {
                    return coerceAtLeast;
                }
                return Math.signum(velocity) * coerceAtLeast;
            }

            private final Pair<Float, Float> searchForSnappingBounds(SnapPosition snapPosition) {
                float f;
                float dragGestureDelta;
                boolean isScrollingForward;
                boolean isScrollingForward2;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                PagerState pagerState2 = PagerState.this;
                int size = visiblePagesInfo.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                int i = 0;
                while (true) {
                    f = 0.0f;
                    if (i >= size) {
                        break;
                    }
                    PageInfo pageInfo = visiblePagesInfo.get(i);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f2) {
                        f2 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f3) {
                        f3 = calculateDistanceToDesiredSnapPosition;
                    }
                    i++;
                }
                if (f2 == Float.NEGATIVE_INFINITY) {
                    f2 = f3;
                }
                if (f3 == Float.POSITIVE_INFINITY) {
                    f3 = f2;
                }
                dragGestureDelta = PagerSnapLayoutInfoProviderKt.dragGestureDelta(PagerState.this);
                boolean z = !(dragGestureDelta == 0.0f);
                if (!PagerState.this.getCanScrollForward()) {
                    if (z) {
                        isScrollingForward2 = PagerSnapLayoutInfoProviderKt.isScrollingForward(PagerState.this);
                        if (isScrollingForward2) {
                            f2 = 0.0f;
                            f3 = 0.0f;
                        }
                    }
                    f3 = 0.0f;
                }
                if (PagerState.this.getCanScrollBackward()) {
                    f = f2;
                } else if (z) {
                    isScrollingForward = PagerSnapLayoutInfoProviderKt.isScrollingForward(PagerState.this);
                    if (!isScrollingForward) {
                        f3 = 0.0f;
                    }
                }
                return TuplesKt.to(Float.valueOf(f), Float.valueOf(f3));
            }
        };
    }

    private static final boolean isLtrDragging(PagerState pagerState) {
        return dragGestureDelta(pagerState) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        return (isLtrDragging(pagerState) && reverseLayout) || !(isLtrDragging(pagerState) || reverseLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(PagerState pagerState) {
        if (pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal) {
            return Offset.m4274getXimpl(pagerState.m1233getUpDownDifferenceF1C5BW0$foundation_release());
        }
        return Offset.m4275getYimpl(pagerState.m1233getUpDownDifferenceF1C5BW0$foundation_release());
    }

    public static final float calculateFinalSnappingBound(PagerState pagerState, LayoutDirection layoutDirection, float f, float f2, float f3, float f4) {
        boolean z;
        if (pagerState.getLayoutInfo().getOrientation() == Orientation.Vertical) {
            z = isScrollingForward(pagerState);
        } else if (layoutDirection == LayoutDirection.Ltr) {
            z = isScrollingForward(pagerState);
        } else {
            z = !isScrollingForward(pagerState);
        }
        int pageSize = pagerState.getLayoutInfo().getPageSize();
        float dragGestureDelta = pageSize == 0 ? 0.0f : dragGestureDelta(pagerState) / pageSize;
        float f5 = dragGestureDelta - ((int) dragGestureDelta);
        int calculateFinalSnappingItem = LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(pagerState.getDensity(), f2);
        if (FinalSnappingItem.m824equalsimpl0(calculateFinalSnappingItem, FinalSnappingItem.INSTANCE.m828getClosestItembbeMdSM())) {
            if (Math.abs(f5) > f) {
                if (!z) {
                    return f3;
                }
            } else if (Math.abs(dragGestureDelta) >= Math.abs(pagerState.getPositionThresholdFraction$foundation_release())) {
                if (z) {
                    return f3;
                }
            } else if (Math.abs(f3) < Math.abs(f4)) {
                return f3;
            }
        } else if (!FinalSnappingItem.m824equalsimpl0(calculateFinalSnappingItem, FinalSnappingItem.INSTANCE.m829getNextItembbeMdSM())) {
            if (FinalSnappingItem.m824equalsimpl0(calculateFinalSnappingItem, FinalSnappingItem.INSTANCE.m830getPreviousItembbeMdSM())) {
                return f3;
            }
            return 0.0f;
        }
        return f4;
    }
}
