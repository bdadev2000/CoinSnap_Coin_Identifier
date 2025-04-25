package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public class ItemCustomSeriesSelectedBindingImpl extends ItemCustomSeriesSelectedBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final CardView mboundView0;

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
        sparseIntArray.put(R.id.tv_me_series_name, 1);
        sparseIntArray.put(R.id.update_tv, 2);
        sparseIntArray.put(R.id.count_tv, 3);
        sparseIntArray.put(R.id.iv3, 4);
        sparseIntArray.put(R.id.iv2, 5);
        sparseIntArray.put(R.id.iv1, 6);
        sparseIntArray.put(R.id.iv_me_series_more, 7);
    }

    public ItemCustomSeriesSelectedBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private ItemCustomSeriesSelectedBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (GlTextView) bindings[3], (ShapeableImageView) bindings[6], (ShapeableImageView) bindings[5], (ShapeableImageView) bindings[4], (FrameLayout) bindings[7], (GlTextView) bindings[1], (GlTextView) bindings[2]);
        this.mDirtyFlags = -1L;
        CardView cardView = (CardView) bindings[0];
        this.mboundView0 = cardView;
        cardView.setTag(null);
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
