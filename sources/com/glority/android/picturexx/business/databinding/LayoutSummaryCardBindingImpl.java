package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public class LayoutSummaryCardBindingImpl extends LayoutSummaryCardBinding {
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
        sparseIntArray.put(R.id.count_tv, 1);
        sparseIntArray.put(R.id.count_label_tv, 2);
        sparseIntArray.put(R.id.price_tv, 3);
        sparseIntArray.put(R.id.price_label_tv, 4);
        sparseIntArray.put(R.id.counrty_tv, 5);
        sparseIntArray.put(R.id.country_label_tv, 6);
    }

    public LayoutSummaryCardBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }

    private LayoutSummaryCardBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (GlTextView) bindings[5], (GlTextView) bindings[2], (GlTextView) bindings[1], (GlTextView) bindings[6], (GlTextView) bindings[4], (GlTextView) bindings[3]);
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
