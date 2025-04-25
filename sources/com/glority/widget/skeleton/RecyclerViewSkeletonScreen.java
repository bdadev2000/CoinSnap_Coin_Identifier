package com.glority.widget.skeleton;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public class RecyclerViewSkeletonScreen implements SkeletonScreen {
    private final RecyclerView.Adapter mActualAdapter;
    private final RecyclerView mRecyclerView;
    private final boolean mRecyclerViewFrozen;
    private final SkeletonAdapter mSkeletonAdapter;

    private RecyclerViewSkeletonScreen(Builder builder) {
        this.mRecyclerView = builder.mRecyclerView;
        this.mActualAdapter = builder.mActualAdapter;
        SkeletonAdapter skeletonAdapter = new SkeletonAdapter();
        this.mSkeletonAdapter = skeletonAdapter;
        skeletonAdapter.setItemCount(builder.mItemCount);
        skeletonAdapter.setLayoutReference(builder.mItemResID);
        skeletonAdapter.setArrayOfLayoutReferences(builder.mItemsResIDArray);
        skeletonAdapter.shimmer(builder.mShimmer);
        skeletonAdapter.setShimmerColor(builder.mShimmerColor);
        skeletonAdapter.setShimmerAngle(builder.mShimmerAngle);
        skeletonAdapter.setShimmerDuration(builder.mShimmerDuration);
        this.mRecyclerViewFrozen = builder.mFrozen;
    }

    @Override // com.glority.widget.skeleton.SkeletonScreen
    public void show() {
        this.mRecyclerView.setAdapter(this.mSkeletonAdapter);
        if (this.mRecyclerView.isComputingLayout() || !this.mRecyclerViewFrozen) {
            return;
        }
        this.mRecyclerView.setLayoutFrozen(true);
    }

    @Override // com.glority.widget.skeleton.SkeletonScreen
    public void hide() {
        this.mRecyclerView.setAdapter(this.mActualAdapter);
    }

    /* loaded from: classes12.dex */
    public static class Builder {
        private RecyclerView.Adapter mActualAdapter;
        private int[] mItemsResIDArray;
        private final RecyclerView mRecyclerView;
        private int mShimmerColor;
        private boolean mShimmer = true;
        private int mItemCount = 10;
        private int mItemResID = R.layout.gl_skeleton_text_image_small;
        private int mShimmerDuration = 1000;
        private int mShimmerAngle = 20;
        private boolean mFrozen = true;

        public Builder(RecyclerView recyclerView) {
            this.mRecyclerView = recyclerView;
            this.mShimmerColor = ContextCompat.getColor(recyclerView.getContext(), R.color.gl_shimmer_color);
        }

        public Builder adapter(RecyclerView.Adapter adapter) {
            this.mActualAdapter = adapter;
            return this;
        }

        public Builder count(int i) {
            this.mItemCount = i;
            return this;
        }

        public Builder shimmer(boolean z) {
            this.mShimmer = z;
            return this;
        }

        public Builder duration(int i) {
            this.mShimmerDuration = i;
            return this;
        }

        public Builder color(int i) {
            this.mShimmerColor = ContextCompat.getColor(this.mRecyclerView.getContext(), i);
            return this;
        }

        public Builder angle(int i) {
            this.mShimmerAngle = i;
            return this;
        }

        public Builder load(int i) {
            this.mItemResID = i;
            return this;
        }

        public Builder loadArrayOfLayouts(int[] iArr) {
            this.mItemsResIDArray = iArr;
            return this;
        }

        public Builder frozen(boolean z) {
            this.mFrozen = z;
            return this;
        }

        public RecyclerViewSkeletonScreen show() {
            RecyclerViewSkeletonScreen recyclerViewSkeletonScreen = new RecyclerViewSkeletonScreen(this);
            recyclerViewSkeletonScreen.show();
            return recyclerViewSkeletonScreen;
        }
    }
}
