package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class LayoutOfficialSetPageItemViewBindingImpl extends LayoutOfficialSetPageItemViewBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView1;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"layout_official_set_progress_base_view"}, new int[]{2}, new int[]{R.layout.layout_official_set_progress_base_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_more, 3);
    }

    public LayoutOfficialSetPageItemViewBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }

    private LayoutOfficialSetPageItemViewBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (CardView) bindings[0], (AppCompatImageView) bindings[3], (LayoutOfficialSetProgressBaseViewBinding) bindings[2]);
        this.mDirtyFlags = -1L;
        this.cvOfficialSetCard.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[1];
        this.mboundView1 = constraintLayout;
        constraintLayout.setTag(null);
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
