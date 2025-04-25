package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class ViewMeCollectionFunctionZoneBindingImpl extends ViewMeCollectionFunctionZoneBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final AppCompatImageView mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_me_collection_search, 2);
        sparseIntArray.put(R.id.iv_me_collection_wish, 3);
        sparseIntArray.put(R.id.iv_me_collection_history, 4);
        sparseIntArray.put(R.id.iv_me_collection_settings, 5);
    }

    public ViewMeCollectionFunctionZoneBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private ViewMeCollectionFunctionZoneBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (AppCompatImageView) bindings[4], (AppCompatImageView) bindings[2], (AppCompatImageView) bindings[5], (AppCompatImageView) bindings[3]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) bindings[1];
        this.mboundView1 = appCompatImageView;
        appCompatImageView.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        if (BR.redDotVisible != variableId) {
            return false;
        }
        setRedDotVisible((Boolean) variable);
        return true;
    }

    @Override // com.glority.android.picturexx.business.databinding.ViewMeCollectionFunctionZoneBinding
    public void setRedDotVisible(Boolean RedDotVisible) {
        this.mRedDotVisible = RedDotVisible;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(BR.redDotVisible);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Boolean bool = this.mRedDotVisible;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j2 != 0) {
                j |= safeUnbox ? 8L : 4L;
            }
            if (!safeUnbox) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.mboundView1.setVisibility(i);
        }
    }
}
