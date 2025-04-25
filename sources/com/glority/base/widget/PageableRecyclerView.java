package com.glority.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class PageableRecyclerView extends RecyclerView {
    private LinearLayoutManager layoutManager;
    private OnPageSelectedListener onPageSelectedListener;
    private int orientation;
    private PagerSnapHelper pagerSnapHelper;
    private int selectedPosition;

    /* loaded from: classes6.dex */
    public interface OnPageSelectedListener {
        void onPageSelected(int i);
    }

    public PageableRecyclerView(Context context) {
        super(context);
        this.selectedPosition = 0;
        this.orientation = -1;
        this.pagerSnapHelper = new PagerSnapHelper();
        init();
    }

    public PageableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.selectedPosition = 0;
        this.orientation = -1;
        this.pagerSnapHelper = new PagerSnapHelper();
        init();
    }

    public PageableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectedPosition = 0;
        this.orientation = -1;
        this.pagerSnapHelper = new PagerSnapHelper();
        init();
    }

    private void init() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.layoutManager = linearLayoutManager;
        super.setLayoutManager(linearLayoutManager);
        this.pagerSnapHelper.attachToRecyclerView(this);
        initListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (this.orientation != -1 || (display = ViewCompat.getDisplay(this)) == null) {
            return;
        }
        int rotation = display.getRotation();
        this.layoutManager.setOrientation((rotation == 0 || rotation == 2) ? 0 : 1);
    }

    private void initListener() {
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.glority.base.widget.PageableRecyclerView.1
            int state;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                View findSnapView;
                super.onScrolled(recyclerView, i, i2);
                int i3 = this.state;
                if ((i3 == 2 || i3 == 0) && (findSnapView = PageableRecyclerView.this.pagerSnapHelper.findSnapView(PageableRecyclerView.this.layoutManager)) != null) {
                    PageableRecyclerView pageableRecyclerView = PageableRecyclerView.this;
                    pageableRecyclerView.selectedPosition = pageableRecyclerView.layoutManager.getPosition(findSnapView);
                    PageableRecyclerView.this.notifyChangeSelectedPosition();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                this.state = i;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        throw new IllegalStateException("Setting layoutManager is forbidden");
    }

    public void setOrientation(int i) {
        this.orientation = i;
        this.layoutManager.setOrientation(i);
    }

    public void setReverseLayout(boolean z) {
        this.layoutManager.setReverseLayout(z);
    }

    public void setOnPageSelectedListener(OnPageSelectedListener onPageSelectedListener) {
        this.onPageSelectedListener = onPageSelectedListener;
    }

    public int getSelectedPosition() {
        return this.selectedPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        super.scrollToPosition(i);
        this.selectedPosition = i;
        notifyChangeSelectedPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyChangeSelectedPosition() {
        OnPageSelectedListener onPageSelectedListener = this.onPageSelectedListener;
        if (onPageSelectedListener != null) {
            onPageSelectedListener.onPageSelected(this.selectedPosition);
        }
    }
}
