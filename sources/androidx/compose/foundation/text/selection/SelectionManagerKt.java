package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u001a\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H 0\u0011\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u0011H\u0002\u001a\f\u0010!\u001a\u00020\u0001*\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"invertedInfiniteRect", "Landroidx/compose/ui/geometry/Rect;", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getMagnifierCenter", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getMagnifierCenter-JVtK1S4", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "getSelectedRegionRect", "selectableSubSelectionPairs", "", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/foundation/text/selection/Selection;", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "merge", "lhs", "rhs", "containsInclusive", "", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "firstAndLast", ExifInterface.GPS_DIRECTION_TRUE, "visibleBounds", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : CollectionsKt.listOf(CollectionsKt.first((List) list), CollectionsKt.last((List) list));
    }

    public static final Rect getSelectedRegionRect(List<? extends Pair<? extends Selectable, Selection>> list, LayoutCoordinates layoutCoordinates) {
        int i;
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        if (list.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Pair<? extends Selectable, Selection> pair = list.get(i2);
            Selectable component1 = pair.component1();
            Selection component2 = pair.component2();
            int offset = component2.getStart().getOffset();
            int offset2 = component2.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates2 = component1.getLayoutCoordinates()) == null) {
                i = size;
            } else {
                int min = Math.min(offset, offset2);
                int max = Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[]{min};
                } else {
                    iArr = new int[]{min, max};
                }
                Rect rect2 = invertedInfiniteRect;
                float left2 = rect2.getLeft();
                float top2 = rect2.getTop();
                float right2 = rect2.getRight();
                float bottom2 = rect2.getBottom();
                int length = iArr.length;
                i = size;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    Rect boundingBox = component1.getBoundingBox(iArr[i3]);
                    left2 = Math.min(left2, boundingBox.getLeft());
                    top2 = Math.min(top2, boundingBox.getTop());
                    right2 = Math.max(right2, boundingBox.getRight());
                    bottom2 = Math.max(bottom2, boundingBox.getBottom());
                    i3++;
                    length = i4;
                }
                long Offset = OffsetKt.Offset(left2, top2);
                long Offset2 = OffsetKt.Offset(right2, bottom2);
                long mo5860localPositionOfR5De75A = layoutCoordinates.mo5860localPositionOfR5De75A(layoutCoordinates2, Offset);
                long mo5860localPositionOfR5De75A2 = layoutCoordinates.mo5860localPositionOfR5De75A(layoutCoordinates2, Offset2);
                left = Math.min(left, Offset.m4274getXimpl(mo5860localPositionOfR5De75A));
                top = Math.min(top, Offset.m4275getYimpl(mo5860localPositionOfR5De75A));
                right = Math.max(right, Offset.m4274getXimpl(mo5860localPositionOfR5De75A2));
                bottom = Math.max(bottom, Offset.m4275getYimpl(mo5860localPositionOfR5De75A2));
            }
            i2++;
            size = i;
        }
        return new Rect(left, top, right, bottom);
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1683calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m1685getMagnifierCenterJVtK1S4(selectionManager, j, selection.getStart());
        }
        if (i == 2) {
            return m1685getMagnifierCenterJVtK1S4(selectionManager, j, selection.getEnd());
        }
        if (i == 3) {
            throw new IllegalStateException("SelectionContainer does not support cursor".toString());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1685getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo) {
        LayoutCoordinates containerLayoutCoordinates;
        LayoutCoordinates layoutCoordinates;
        int offset;
        float coerceIn;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null && (offset = anchorInfo.getOffset()) <= anchorSelectable$foundation_release.getLastVisibleOffset()) {
            Offset m1672getCurrentDragPosition_m7T9E = selectionManager.m1672getCurrentDragPosition_m7T9E();
            Intrinsics.checkNotNull(m1672getCurrentDragPosition_m7T9E);
            float m4274getXimpl = Offset.m4274getXimpl(layoutCoordinates.mo5860localPositionOfR5De75A(containerLayoutCoordinates, m1672getCurrentDragPosition_m7T9E.getPackedValue()));
            long mo1633getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo1633getRangeOfLineContainingjx7JFs(offset);
            if (TextRange.m6454getCollapsedimpl(mo1633getRangeOfLineContainingjx7JFs)) {
                coerceIn = anchorSelectable$foundation_release.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m6460getStartimpl(mo1633getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m6455getEndimpl(mo1633getRangeOfLineContainingjx7JFs) - 1);
                coerceIn = RangesKt.coerceIn(m4274getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
            }
            if (coerceIn == -1.0f) {
                return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
            }
            if (!IntSize.m7165equalsimpl0(j, IntSize.INSTANCE.m7172getZeroYbymL2g()) && Math.abs(m4274getXimpl - coerceIn) > IntSize.m7167getWidthimpl(j) / 2) {
                return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
            }
            float centerYForOffset = anchorSelectable$foundation_release.getCenterYForOffset(offset);
            if (centerYForOffset == -1.0f) {
                return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
            }
            return containerLayoutCoordinates.mo5860localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(coerceIn, centerYForOffset));
        }
        return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m4312Rect0a9Yr6o(layoutCoordinates.mo5868windowToLocalMKHz9U(boundsInWindow.m4309getTopLeftF1C5BW0()), layoutCoordinates.mo5868windowToLocalMKHz9U(boundsInWindow.m4303getBottomRightF1C5BW0()));
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1684containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float m4274getXimpl = Offset.m4274getXimpl(j);
        if (left <= m4274getXimpl && m4274getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float m4275getYimpl = Offset.m4275getYimpl(j);
            if (top <= m4275getYimpl && m4275getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }
}
