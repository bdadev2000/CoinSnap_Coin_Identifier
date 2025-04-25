package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: LazyGridMeasuredItem.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0004J\u001d\u0010G\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u000e\u0010K\u001a\u00020E2\u0006\u0010L\u001a\u00020MJ(\u0010N\u001a\u00020E2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004H\u0016J6\u0010N\u001a\u00020E2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010S\u001a\u00020E2\u0006\u0010+\u001a\u00020\u0004J+\u0010T\u001a\u00020\u0014*\u00020\u00142\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040VH\u0082\bø\u0001\u0000¢\u0006\u0004\bW\u0010XR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0018\u001a\u00020\u0019X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010(R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0014\u0010\u001a\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0014\u0010.\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u000e\u00100\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010(\"\u0004\b4\u00105R&\u00106\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b7\u0010\"R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010 R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010 R\u001c\u0010<\u001a\u00020=X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b>\u0010\"R\u0014\u0010\u001b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010 R\u0016\u0010\u0013\u001a\u00020\u0014X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010#R\u0018\u0010@\u001a\u00020\u0004*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0018\u0010,\u001a\u00020\u0004*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "index", "", "key", "", "isVertical", "", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeContentPadding", "afterContentPadding", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "contentType", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lane", TtmlNode.TAG_SPAN, "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "column", "getColumn", "()I", "getConstraints-msEJaDk", "()J", "J", "getContentType", "()Ljava/lang/Object;", "getCrossAxisSize", "getIndex", "()Z", "getKey", "getLane", "mainAxisLayoutSize", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "placeablesCount", "getPlaceablesCount", "row", "getRow", LogEventArguments.ARG_SIZE, "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "getSpan", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "getOffset", "getOffset-Bjo55l4", "(I)J", "getParentData", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "position", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "updateMainAxisLayoutSize", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, lazyLayoutItemAnimator, j2, i6, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends Placeable> list, long j, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j2, int i6, int i7) {
        long IntSize;
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.visualOffset = j;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j2;
        this.lane = i6;
        this.span = i7;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Placeable placeable = (Placeable) list.get(i9);
            i8 = Math.max(i8, getIsVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i8;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(i8 + i3, 0);
        if (getIsVertical()) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, i8);
        } else {
            IntSize = IntSizeKt.IntSize(i8, this.crossAxisSize);
        }
        this.size = IntSize;
        this.offset = IntOffset.INSTANCE.m7135getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: isVertical, reason: from getter */
    public boolean getIsVertical() {
        return this.isVertical;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public long mo1097getOffsetBjo55l4(int index) {
        return getOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight) {
        position(mainAxisOffset, crossAxisOffset, layoutWidth, layoutHeight, -1, -1);
    }

    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        long IntOffset;
        this.mainAxisLayoutSize = getIsVertical() ? layoutHeight : layoutWidth;
        if (!getIsVertical()) {
            layoutWidth = layoutHeight;
        }
        if (getIsVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        if (getIsVertical()) {
            IntOffset = IntOffsetKt.IntOffset(crossAxisOffset, mainAxisOffset);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mainAxisOffset, crossAxisOffset);
        }
        this.offset = IntOffset;
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void updateMainAxisLayoutSize(int mainAxisLayoutSize) {
        this.mainAxisLayoutSize = mainAxisLayoutSize;
        this.maxMainAxisOffset = mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void applyScrollDelta(int delta) {
        if (getNonScrollableItem()) {
            return;
        }
        long offset = getOffset();
        int m7125getXimpl = getIsVertical() ? IntOffset.m7125getXimpl(offset) : IntOffset.m7125getXimpl(offset) + delta;
        boolean isVertical = getIsVertical();
        int m7126getYimpl = IntOffset.m7126getYimpl(offset);
        if (isVertical) {
            m7126getYimpl += delta;
        }
        this.offset = IntOffsetKt.IntOffset(m7125getXimpl, m7126getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long rawOffset = animation.getRawOffset();
                int m7125getXimpl2 = getIsVertical() ? IntOffset.m7125getXimpl(rawOffset) : Integer.valueOf(IntOffset.m7125getXimpl(rawOffset) + delta).intValue();
                boolean isVertical2 = getIsVertical();
                int m7126getYimpl2 = IntOffset.m7126getYimpl(rawOffset);
                if (isVertical2) {
                    m7126getYimpl2 += delta;
                }
                animation.m1148setRawOffsetgyyYBs(IntOffsetKt.IntOffset(m7125getXimpl2, m7126getYimpl2));
            }
        }
    }

    public final void place(Placeable.PlacementScope scope) {
        GraphicsLayer graphicsLayer;
        int m7126getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long m7129plusqkQi6aY = IntOffset.m7129plusqkQi6aY(offset, animation.m1144getPlacementDeltanOccac());
                if ((m1128getMainAxisgyyYBs(offset) <= mainAxisSize && m1128getMainAxisgyyYBs(m7129plusqkQi6aY) <= mainAxisSize) || (m1128getMainAxisgyyYBs(offset) >= i2 && m1128getMainAxisgyyYBs(m7129plusqkQi6aY) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                graphicsLayer = animation.getLayer();
                offset = m7129plusqkQi6aY;
            } else {
                graphicsLayer = null;
            }
            if (this.reverseLayout) {
                int m7125getXimpl = getIsVertical() ? IntOffset.m7125getXimpl(offset) : (this.mainAxisLayoutSize - IntOffset.m7125getXimpl(offset)) - getMainAxisSize(placeable);
                if (getIsVertical()) {
                    m7126getYimpl = (this.mainAxisLayoutSize - IntOffset.m7126getYimpl(offset)) - getMainAxisSize(placeable);
                } else {
                    m7126getYimpl = IntOffset.m7126getYimpl(offset);
                }
                offset = IntOffsetKt.IntOffset(m7125getXimpl, m7126getYimpl);
            }
            long m7129plusqkQi6aY2 = IntOffset.m7129plusqkQi6aY(offset, this.visualOffset);
            if (animation != null) {
                animation.m1146setFinalOffsetgyyYBs(m7129plusqkQi6aY2);
            }
            if (getIsVertical()) {
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.m5920placeWithLayeraW9wM$default(scope, placeable, m7129plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m5919placeWithLayeraW9wM$default(scope, placeable, m7129plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
                }
            } else if (graphicsLayer != null) {
                Placeable.PlacementScope.m5918placeRelativeWithLayeraW9wM$default(scope, placeable, m7129plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m5917placeRelativeWithLayeraW9wM$default(scope, placeable, m7129plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m1128getMainAxisgyyYBs(long j) {
        return getIsVertical() ? IntOffset.m7126getYimpl(j) : IntOffset.m7125getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return getIsVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1127copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int m7125getXimpl = getIsVertical() ? IntOffset.m7125getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m7125getXimpl(j))).intValue();
        boolean isVertical = getIsVertical();
        int m7126getYimpl = IntOffset.m7126getYimpl(j);
        if (isVertical) {
            m7126getYimpl = function1.invoke(Integer.valueOf(m7126getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(m7125getXimpl, m7126getYimpl);
    }
}
