package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class ItemCustomSeriesCardBindingImpl extends ItemCustomSeriesCardBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"view_series_collection_folder_layout"}, new int[]{2}, new int[]{R.layout.view_series_collection_folder_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tv_me_series_name, 3);
        sparseIntArray.put(R.id.count_tv, 4);
        sparseIntArray.put(R.id.update_tv, 5);
        sparseIntArray.put(R.id.iv_me_series_more, 6);
    }

    public ItemCustomSeriesCardBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    private ItemCustomSeriesCardBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (CardView) bindings[0], (AppCompatTextView) bindings[4], (ViewSeriesCollectionFolderLayoutBinding) bindings[2], (FrameLayout) bindings[6], (AppCompatTextView) bindings[3], (AppCompatTextView) bindings[5]);
        this.mDirtyFlags = -1L;
        this.cardView.setTag(null);
        setContainedBinding(this.icSeriesFolder);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[1];
        this.mboundView1 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.icSeriesFolder.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.icSeriesFolder.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.icSeriesFolder.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeIcSeriesFolder((ViewSeriesCollectionFolderLayoutBinding) object, fieldId);
    }

    private boolean onChangeIcSeriesFolder(ViewSeriesCollectionFolderLayoutBinding IcSeriesFolder, int fieldId) {
        if (fieldId != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        executeBindingsOn(this.icSeriesFolder);
    }
}
