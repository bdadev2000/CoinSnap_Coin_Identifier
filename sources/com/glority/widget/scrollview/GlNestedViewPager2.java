package com.glority.widget.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.widget.scrollview.GlNestedScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class GlNestedViewPager2 extends FrameLayout implements GlNestedScroller {
    private static final int TAG_KEY = -123;
    private int mAdjustHeight;
    protected RecyclerView mRecyclerView;
    protected ViewPager2 mViewPager2;

    public GlNestedViewPager2(Context context) {
        super(context);
        initialize(context);
    }

    public GlNestedViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public GlNestedViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    private void initialize(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.mViewPager2 = viewPager2;
        addView(viewPager2, -1, -1);
        this.mRecyclerView = (RecyclerView) this.mViewPager2.getChildAt(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (isAtNestedScrollViewBottom() && this.mAdjustHeight > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getDefaultSize(0, i2) - this.mAdjustHeight, View.MeasureSpec.getMode(i2)));
        } else {
            super.onMeasure(i, i2);
        }
    }

    private boolean isAtNestedScrollViewBottom() {
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
        View view;
        int currentItem = getCurrentItem();
        RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (adapter == null || layoutManager == null || currentItem < 0 || currentItem >= adapter.getItemCount()) {
            view = null;
        } else {
            view = findScrolledItemView(layoutManager.findViewByPosition(currentItem));
            if (view != null) {
                setAttachListener(view);
            }
        }
        return view == null ? this.mRecyclerView : view;
    }

    private void setAttachListener(View view) {
        if (view.getTag(TAG_KEY) != null) {
            AttachListener attachListener = (AttachListener) view.getTag(TAG_KEY);
            if (attachListener.reference.get() == null) {
                view.removeOnAttachStateChangeListener(attachListener);
                view.setTag(TAG_KEY, null);
            }
        }
        if (view.getTag(TAG_KEY) == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((layoutParams instanceof GlNestedScrollView.LayoutParams) && ((GlNestedScrollView.LayoutParams) layoutParams).isCoordinate) {
                View.OnAttachStateChangeListener attachListener2 = new AttachListener(this, view);
                view.addOnAttachStateChangeListener(attachListener2);
                view.setTag(TAG_KEY, attachListener2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollChildContent(View view) {
        View findFirstVisibleView;
        if (view == null || !(getParent() instanceof GlNestedScrollView)) {
            return;
        }
        GlNestedScrollView glNestedScrollView = (GlNestedScrollView) getParent();
        int indexOfChild = glNestedScrollView.indexOfChild(this);
        if ((indexOfChild != glNestedScrollView.getChildCount() - 1 || getHeight() >= glNestedScrollView.getHeight() || glNestedScrollView.getScrollY() < glNestedScrollView.mScrollRange) && (findFirstVisibleView = glNestedScrollView.findFirstVisibleView()) != null) {
            int indexOfChild2 = glNestedScrollView.indexOfChild(findFirstVisibleView);
            if (indexOfChild < indexOfChild2) {
                glNestedScrollView.scrollChildContentToBottom(view);
            } else if (indexOfChild > indexOfChild2) {
                glNestedScrollView.scrollChildContentToTop(view);
            }
        }
    }

    @Override // com.glority.widget.scrollview.GlNestedScroller
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.mRecyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                arrayList.add(findScrolledItemView(this.mRecyclerView.getChildAt(i)));
            }
        }
        return arrayList;
    }

    protected View findScrolledItemView(View view) {
        if (!(this.mRecyclerView.getAdapter() instanceof FragmentStateAdapter) || !(view instanceof FrameLayout)) {
            return view;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return frameLayout.getChildCount() > 0 ? frameLayout.getChildAt(0) : view;
    }

    public ViewPager2 getViewPager2() {
        return this.mViewPager2;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        this.mViewPager2.setAdapter(adapter);
    }

    public RecyclerView.Adapter getAdapter() {
        return this.mViewPager2.getAdapter();
    }

    public void setOrientation(int i) {
        this.mViewPager2.setOrientation(i);
    }

    public int getOrientation() {
        return this.mViewPager2.getOrientation();
    }

    public void setCurrentItem(int i) {
        this.mViewPager2.setCurrentItem(i);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mViewPager2.setCurrentItem(i, z);
    }

    public int getCurrentItem() {
        return this.mViewPager2.getCurrentItem();
    }

    public void setOffscreenPageLimit(int i) {
        this.mViewPager2.setOffscreenPageLimit(i);
    }

    public int getOffscreenPageLimit() {
        return this.mViewPager2.getOffscreenPageLimit();
    }

    public void registerOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mViewPager2.registerOnPageChangeCallback(onPageChangeCallback);
    }

    public void unregisterOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mViewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.mViewPager2.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.mViewPager2.canScrollVertically(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public static class AttachListener implements View.OnAttachStateChangeListener {
        WeakReference<GlNestedViewPager2> reference;
        View view;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public AttachListener(GlNestedViewPager2 glNestedViewPager2, View view) {
            this.reference = new WeakReference<>(glNestedViewPager2);
            this.view = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (this.reference.get() != null) {
                this.reference.get().scrollChildContent(this.view);
            }
        }
    }
}
