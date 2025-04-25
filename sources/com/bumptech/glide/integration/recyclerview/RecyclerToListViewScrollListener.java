package com.bumptech.glide.integration.recyclerview;

import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public final class RecyclerToListViewScrollListener extends RecyclerView.OnScrollListener {
    public static final int UNKNOWN_SCROLL_STATE = Integer.MIN_VALUE;
    private final AbsListView.OnScrollListener scrollListener;
    private int lastFirstVisible = -1;
    private int lastVisibleCount = -1;
    private int lastItemCount = -1;

    public RecyclerToListViewScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.scrollListener = onScrollListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = Integer.MIN_VALUE;
                }
            }
        } else {
            i2 = 0;
        }
        this.scrollListener.onScrollStateChanged(null, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int abs = Math.abs(findFirstVisibleItemPosition - linearLayoutManager.findLastVisibleItemPosition());
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (findFirstVisibleItemPosition == this.lastFirstVisible && abs == this.lastVisibleCount && itemCount == this.lastItemCount) {
            return;
        }
        this.scrollListener.onScroll(null, findFirstVisibleItemPosition, abs, itemCount);
        this.lastFirstVisible = findFirstVisibleItemPosition;
        this.lastVisibleCount = abs;
        this.lastItemCount = itemCount;
    }
}
