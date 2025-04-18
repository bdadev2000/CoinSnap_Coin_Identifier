package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d0 extends OrientationHelper {
    public d0(v0 v0Var) {
        super(v0Var, null);
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedEnd(View view) {
        return this.mLayoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurement(View view) {
        w0 w0Var = (w0) view.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedMeasurementInOther(View view) {
        w0 w0Var = (w0) view.getLayoutParams();
        return this.mLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getDecoratedStart(View view) {
        return this.mLayoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getEnd() {
        return this.mLayoutManager.getHeight();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getEndAfterPadding() {
        return this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getEndPadding() {
        return this.mLayoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getMode() {
        return this.mLayoutManager.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getModeInOther() {
        return this.mLayoutManager.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getStartAfterPadding() {
        return this.mLayoutManager.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getTotalSpace() {
        return (this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingTop()) - this.mLayoutManager.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedEndWithDecoration(View view) {
        this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
        return this.mTmpRect.bottom;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final int getTransformedStartWithDecoration(View view) {
        this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
        return this.mTmpRect.top;
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChild(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    @Override // androidx.recyclerview.widget.OrientationHelper
    public final void offsetChildren(int i10) {
        this.mLayoutManager.offsetChildrenVertical(i10);
    }
}
