package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class ViewMeCollectionSummaryBestOfficialSetBindingImpl extends ViewMeCollectionSummaryBestOfficialSetBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final FrameLayout mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"layout_official_set_progress_base_view"}, new int[]{2}, new int[]{R.layout.layout_official_set_progress_base_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_more, 3);
        sparseIntArray.put(R.id.tv_set_percentage_summary, 4);
        sparseIntArray.put(R.id.tv_check_all_official_set, 5);
    }

    public ViewMeCollectionSummaryBestOfficialSetBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }

    private ViewMeCollectionSummaryBestOfficialSetBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (AppCompatImageView) bindings[3], (LayoutOfficialSetProgressBaseViewBinding) bindings[2], (AppCompatTextView) bindings[5], (AppCompatTextView) bindings[4]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[1];
        this.mboundView1 = frameLayout;
        frameLayout.setTag(null);
        setContainedBinding(this.officialSetProgressView);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.officialSetProgressView.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.officialSetProgressView.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.officialSetProgressView.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeOfficialSetProgressView((LayoutOfficialSetProgressBaseViewBinding) object, fieldId);
    }

    private boolean onChangeOfficialSetProgressView(LayoutOfficialSetProgressBaseViewBinding OfficialSetProgressView, int fieldId) {
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
        executeBindingsOn(this.officialSetProgressView);
    }
}
