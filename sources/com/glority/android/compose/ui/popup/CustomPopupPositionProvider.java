package com.glority.android.compose.ui.popup;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Popup.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\u0002\u0010\u000eJ2\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JN\u0010\u001b\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003Jb\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032M\b\u0002\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fRV\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lcom/glority/android/compose/ui/popup/CustomPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "isShowTop", "", "sizeCallback", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", "name", "anchorBounds", "popupContentSize", "Lcom/glority/android/compose/ui/popup/VisiblePosition;", "visiblePosition", "", "(ZLkotlin/jvm/functions/Function3;)V", "()Z", "getSizeCallback", "()Lkotlin/jvm/functions/Function3;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
final /* data */ class CustomPopupPositionProvider implements PopupPositionProvider {
    private final boolean isShowTop;
    private final Function3<IntRect, IntRect, VisiblePosition, Unit> sizeCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomPopupPositionProvider copy$default(CustomPopupPositionProvider customPopupPositionProvider, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = customPopupPositionProvider.isShowTop;
        }
        if ((i & 2) != 0) {
            function3 = customPopupPositionProvider.sizeCallback;
        }
        return customPopupPositionProvider.copy(z, function3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsShowTop() {
        return this.isShowTop;
    }

    public final Function3<IntRect, IntRect, VisiblePosition, Unit> component2() {
        return this.sizeCallback;
    }

    public final CustomPopupPositionProvider copy(boolean isShowTop, Function3<? super IntRect, ? super IntRect, ? super VisiblePosition, Unit> sizeCallback) {
        Intrinsics.checkNotNullParameter(sizeCallback, "sizeCallback");
        return new CustomPopupPositionProvider(isShowTop, sizeCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomPopupPositionProvider)) {
            return false;
        }
        CustomPopupPositionProvider customPopupPositionProvider = (CustomPopupPositionProvider) other;
        return this.isShowTop == customPopupPositionProvider.isShowTop && Intrinsics.areEqual(this.sizeCallback, customPopupPositionProvider.sizeCallback);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isShowTop) * 31) + this.sizeCallback.hashCode();
    }

    public String toString() {
        return "CustomPopupPositionProvider(isShowTop=" + this.isShowTop + ", sizeCallback=" + this.sizeCallback + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomPopupPositionProvider(boolean z, Function3<? super IntRect, ? super IntRect, ? super VisiblePosition, Unit> sizeCallback) {
        Intrinsics.checkNotNullParameter(sizeCallback, "sizeCallback");
        this.isShowTop = z;
        this.sizeCallback = sizeCallback;
    }

    public final boolean isShowTop() {
        return this.isShowTop;
    }

    public final Function3<IntRect, IntRect, VisiblePosition, Unit> getSizeCallback() {
        return this.sizeCallback;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo649calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int min;
        VisiblePosition visiblePosition;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int right = anchorBounds.getRight();
        int left = anchorBounds.getLeft() + (anchorBounds.getWidth() / 2);
        int left2 = anchorBounds.getLeft() + (anchorBounds.getWidth() / 2);
        int m7167getWidthimpl = (IntSize.m7167getWidthimpl(windowSize) - anchorBounds.getRight()) + (anchorBounds.getWidth() / 2);
        if (IntSize.m7167getWidthimpl(popupContentSize) <= Math.min(left2, m7167getWidthimpl) * 2) {
            right = left - (IntSize.m7167getWidthimpl(popupContentSize) / 2);
        } else if (left2 < m7167getWidthimpl) {
            right = anchorBounds.getLeft() * (-1);
        } else if (left2 > m7167getWidthimpl) {
            right = IntSize.m7167getWidthimpl(windowSize) - IntSize.m7167getWidthimpl(popupContentSize);
        }
        boolean z = true;
        if (!this.isShowTop ? !(anchorBounds.getBottom() + IntSize.m7166getHeightimpl(popupContentSize) >= IntSize.m7166getHeightimpl(windowSize) && anchorBounds.getTop() - IntSize.m7166getHeightimpl(popupContentSize) > 0) : !(anchorBounds.getTop() - IntSize.m7166getHeightimpl(popupContentSize) > 0 || anchorBounds.getBottom() + IntSize.m7166getHeightimpl(popupContentSize) >= IntSize.m7166getHeightimpl(windowSize))) {
            z = false;
        }
        VisiblePosition visiblePosition2 = VisiblePosition.bottom;
        if (z) {
            visiblePosition = VisiblePosition.top;
            min = Math.max(anchorBounds.getTop() - IntSize.m7166getHeightimpl(popupContentSize), 0);
        } else {
            VisiblePosition visiblePosition3 = VisiblePosition.bottom;
            min = Math.min(anchorBounds.getBottom(), IntSize.m7166getHeightimpl(windowSize) - IntSize.m7166getHeightimpl(popupContentSize));
            visiblePosition = visiblePosition3;
        }
        this.sizeCallback.invoke(anchorBounds, new IntRect(right, min, IntSize.m7167getWidthimpl(popupContentSize) + right, IntSize.m7166getHeightimpl(popupContentSize) + min), visiblePosition);
        return IntOffsetKt.IntOffset(right, min);
    }
}
