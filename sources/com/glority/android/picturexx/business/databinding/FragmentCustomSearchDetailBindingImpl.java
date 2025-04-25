package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class FragmentCustomSearchDetailBindingImpl extends FragmentCustomSearchDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

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
        sparseIntArray.put(R.id.cms_view, 1);
        sparseIntArray.put(R.id.iv_close, 2);
        sparseIntArray.put(R.id.iv_share, 3);
        sparseIntArray.put(R.id.app_bar_layout, 4);
        sparseIntArray.put(R.id.iv_close2, 5);
        sparseIntArray.put(R.id.toolbar_title, 6);
        sparseIntArray.put(R.id.iv_share2, 7);
        sparseIntArray.put(R.id.bottom_bar, 8);
        sparseIntArray.put(R.id.progress_fl, 9);
    }

    public FragmentCustomSearchDetailBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    private FragmentCustomSearchDetailBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[4], (FrameLayout) bindings[8], (CmsView) bindings[1], (ImageView) bindings[2], (ImageView) bindings[5], (ImageView) bindings[3], (ImageView) bindings[7], (FrameLayout) bindings[9], (AppCompatTextView) bindings[6]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
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
