package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public class ItemHomeCollectionBindingImpl extends ItemHomeCollectionBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.collection_more_ll, 1);
        sparseIntArray.put(R.id.series_card, 2);
        sparseIntArray.put(R.id.tv_me_series_name, 3);
        sparseIntArray.put(R.id.update_tv, 4);
        sparseIntArray.put(R.id.count_tv, 5);
        sparseIntArray.put(R.id.iv3, 6);
        sparseIntArray.put(R.id.iv2, 7);
        sparseIntArray.put(R.id.iv1, 8);
    }

    public ItemHomeCollectionBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private ItemHomeCollectionBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[1], (GlTextView) bindings[5], (ShapeableImageView) bindings[8], (ShapeableImageView) bindings[7], (ShapeableImageView) bindings[6], (ConstraintLayout) bindings[2], (GlTextView) bindings[3], (GlTextView) bindings[4]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
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
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }
}
