package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.BR;
import com.glority.base.R;
import com.glority.base.databinding.LayoutToolbarBinding;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public class ActivitySuggestAddBindingImpl extends ActivitySuggestAddBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_toolbar"}, new int[]{1}, new int[]{R.layout.layout_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.botanical_name_title, 2);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.botanical_name_input, 3);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.common_name_title, 4);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.common_name_recyclerview, 5);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.common_name_add, 6);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.upload_image_number, 7);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.upload_image_recyclerview, 8);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.sendLayout, 9);
    }

    public ActivitySuggestAddBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    private ActivitySuggestAddBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (EditText) bindings[3], (GlTextView) bindings[2], (LinearLayout) bindings[6], (RecyclerView) bindings[5], (GlTextView) bindings[4], (MaterialButton) bindings[9], (LayoutToolbarBinding) bindings[1], (GlTextView) bindings[7], (RecyclerView) bindings[8]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.toolBar);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.toolBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.toolBar.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.toolBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeToolBar((LayoutToolbarBinding) object, fieldId);
    }

    private boolean onChangeToolBar(LayoutToolbarBinding ToolBar, int fieldId) {
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
        executeBindingsOn(this.toolBar);
    }
}
