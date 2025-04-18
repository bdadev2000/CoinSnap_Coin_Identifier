package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class c0 extends OrientationHelper {
    public c0(v0 v0Var) {
        super(v0Var, null);
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedEnd(View view) {
        return this.mLayoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurement(View view) {
        w0 w0Var = (w0) view.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurementInOther(View view) {
        w0 w0Var = (w0) view.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedStart(View view) {
        return this.mLayoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).leftMargin;
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
    public final void offsetChild(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChildren(int i10) {
        this.mLayoutManager.offsetChildrenHorizontal(i10);
    }
}
