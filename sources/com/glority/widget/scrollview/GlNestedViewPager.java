package com.glority.widget.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class GlNestedViewPager extends ViewPager implements GlNestedScroller {
    private int mAdjustHeight;

    public GlNestedViewPager(Context context) {
        super(context);
    }

    public GlNestedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (isAtNestedScrollViewParentBottom() && this.mAdjustHeight > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getDefaultSize(0, i2) - this.mAdjustHeight, View.MeasureSpec.getMode(i2)));
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (GlScrollUtils.isCoordinateScrollerChild(this)) {
            disableChildScroll(view);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipToPadding(false);
            }
        }
    }

    private void disableChildScroll(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        ViewCompat.setNestedScrollingEnabled(view, false);
    }

    private boolean isAtNestedScrollViewParentBottom() {
        ViewParent parent = getParent();
        if (!(parent instanceof GlNestedScrollView)) {
            return false;
        }
        GlNestedScrollView glNestedScrollView = (GlNestedScrollView) parent;
        return glNestedScrollView.indexOfChild(this) == glNestedScrollView.getChildCount() - 1;
    }

    public int getAdjustHeight() {
        return this.mAdjustHeight;
    }

    public void setAdjustHeight(int i) {
        if (this.mAdjustHeight != i) {
            this.mAdjustHeight = i;
            requestLayout();
        }
    }

    @Override // com.glority.widget.scrollview.GlNestedScroller
    public View getCurrentScrollerView() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getX() == getScrollX() + getPaddingLeft()) {
                return childAt;
            }
        }
        return this;
    }

    @Override // com.glority.widget.scrollview.GlNestedScroller
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                arrayList.add(getChildAt(i));
            }
        }
        return arrayList;
    }
}
