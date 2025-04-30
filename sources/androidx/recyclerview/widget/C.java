package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class C extends OrientationHelper {
    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedEnd(View view) {
        return this.mLayoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((X) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurement(View view) {
        X x9 = (X) view.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) x9).leftMargin + ((ViewGroup.MarginLayoutParams) x9).rightMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurementInOther(View view) {
        X x9 = (X) view.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) x9).topMargin + ((ViewGroup.MarginLayoutParams) x9).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedStart(View view) {
        return this.mLayoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((X) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getEnd() {
        return this.mLayoutManager.getWidth();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getEndAfterPadding() {
        return this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getEndPadding() {
        return this.mLayoutManager.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getMode() {
        return this.mLayoutManager.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getModeInOther() {
        return this.mLayoutManager.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getStartAfterPadding() {
        return this.mLayoutManager.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getTotalSpace() {
        return (this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingLeft()) - this.mLayoutManager.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedEndWithDecoration(View view) {
        this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
        return this.mTmpRect.right;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedStartWithDecoration(View view) {
        this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
        return this.mTmpRect.left;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChild(View view, int i9) {
        view.offsetLeftAndRight(i9);
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChildren(int i9) {
        this.mLayoutManager.offsetChildrenHorizontal(i9);
    }
}
