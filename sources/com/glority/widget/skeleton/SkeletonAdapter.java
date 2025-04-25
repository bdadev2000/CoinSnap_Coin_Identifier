package com.glority.widget.skeleton;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public class SkeletonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private int mColor;
    private int mItemCount;
    private int[] mLayoutArrayReferences;
    private int mLayoutReference;
    private boolean mShimmer;
    private int mShimmerAngle;
    private int mShimmerDuration;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (doesArrayOfLayoutsExist()) {
            this.mLayoutReference = i;
        }
        if (this.mShimmer) {
            return new ShimmerViewHolder(from, viewGroup, this.mLayoutReference);
        }
        return new RecyclerView.ViewHolder(from.inflate(this.mLayoutReference, viewGroup, false)) { // from class: com.glority.widget.skeleton.SkeletonAdapter.1
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (this.mShimmer) {
            ShimmerLayout shimmerLayout = (ShimmerLayout) viewHolder.itemView;
            shimmerLayout.setShimmerAnimationDuration(this.mShimmerDuration);
            shimmerLayout.setShimmerAngle(this.mShimmerAngle);
            shimmerLayout.setShimmerColor(this.mColor);
            shimmerLayout.startShimmerAnimation();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (doesArrayOfLayoutsExist()) {
            return getCorrectLayoutItem(i);
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mItemCount;
    }

    public void setLayoutReference(int i) {
        this.mLayoutReference = i;
    }

    public void setArrayOfLayoutReferences(int[] iArr) {
        this.mLayoutArrayReferences = iArr;
    }

    public void setItemCount(int i) {
        this.mItemCount = i;
    }

    public void setShimmerColor(int i) {
        this.mColor = i;
    }

    public void shimmer(boolean z) {
        this.mShimmer = z;
    }

    public void setShimmerDuration(int i) {
        this.mShimmerDuration = i;
    }

    public void setShimmerAngle(int i) {
        this.mShimmerAngle = i;
    }

    public int getCorrectLayoutItem(int i) {
        if (doesArrayOfLayoutsExist()) {
            int[] iArr = this.mLayoutArrayReferences;
            return iArr[i % iArr.length];
        }
        return this.mLayoutReference;
    }

    private boolean doesArrayOfLayoutsExist() {
        int[] iArr = this.mLayoutArrayReferences;
        return (iArr == null || iArr.length == 0) ? false : true;
    }
}
