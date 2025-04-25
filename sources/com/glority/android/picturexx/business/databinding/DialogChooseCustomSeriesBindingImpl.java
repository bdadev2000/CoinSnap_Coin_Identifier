package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public class DialogChooseCustomSeriesBindingImpl extends DialogChooseCustomSeriesBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final FrameLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"dialog_choose_custom_series_empty"}, new int[]{1}, new int[]{R.layout.dialog_choose_custom_series_empty});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.full_data_layout, 2);
        sparseIntArray.put(R.id.cancel_iv, 3);
        sparseIntArray.put(R.id.done_bt, 4);
        sparseIntArray.put(R.id.filter_tv, 5);
        sparseIntArray.put(R.id.create_bt, 6);
        sparseIntArray.put(R.id.rv, 7);
    }

    public DialogChooseCustomSeriesBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private DialogChooseCustomSeriesBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ImageView) bindings[3], (MaterialButton) bindings[6], (GlTextView) bindings[4], (DialogChooseCustomSeriesEmptyBinding) bindings[1], (GlTextView) bindings[5], (LinearLayout) bindings[2], (RecyclerView) bindings[7]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.emptyLayout);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.emptyLayout.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.emptyLayout.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.emptyLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeEmptyLayout((DialogChooseCustomSeriesEmptyBinding) object, fieldId);
    }

    private boolean onChangeEmptyLayout(DialogChooseCustomSeriesEmptyBinding EmptyLayout, int fieldId) {
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
        executeBindingsOn(this.emptyLayout);
    }
}
