package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.glority.widget.purchase.policy.GlPolicyView1;

/* loaded from: classes2.dex */
public class ActivityPurchase10004bBindingImpl extends ActivityPurchase10004bBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final FrameLayout mboundView0;

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
        sparseIntArray.put(R.id.sv, 1);
        sparseIntArray.put(R.id.content_tv, 2);
        sparseIntArray.put(R.id.price_tv, 3);
        sparseIntArray.put(R.id.info_tv, 4);
        sparseIntArray.put(R.id.purchase_tv, 5);
        sparseIntArray.put(R.id.gpv1, 6);
        sparseIntArray.put(R.id.tv_restore, 7);
        sparseIntArray.put(R.id.tv_cancel, 8);
    }

    public ActivityPurchase10004bBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private ActivityPurchase10004bBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (GlTextView) bindings[2], (GlPolicyView1) bindings[6], (GlTextView) bindings[4], (GlTextView) bindings[3], (TextView) bindings[5], (ScrollView) bindings[1], (ImageView) bindings[8], (TextView) bindings[7]);
        this.mDirtyFlags = -1L;
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
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
