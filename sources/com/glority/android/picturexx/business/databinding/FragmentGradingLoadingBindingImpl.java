package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.picturexx.business.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes2.dex */
public class FragmentGradingLoadingBindingImpl extends FragmentGradingLoadingBinding {
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
        sparseIntArray.put(R.id.close_iv, 1);
        sparseIntArray.put(R.id.iv_anim, 2);
        sparseIntArray.put(R.id.pd, 3);
        sparseIntArray.put(R.id.iv1, 4);
        sparseIntArray.put(R.id.pb1, 5);
        sparseIntArray.put(R.id.iv2, 6);
        sparseIntArray.put(R.id.pb2, 7);
        sparseIntArray.put(R.id.iv3, 8);
        sparseIntArray.put(R.id.pb3, 9);
        sparseIntArray.put(R.id.iv4, 10);
        sparseIntArray.put(R.id.pb4, 11);
    }

    public FragmentGradingLoadingBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }

    private FragmentGradingLoadingBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (ImageView) bindings[4], (ImageView) bindings[6], (ImageView) bindings[8], (ImageView) bindings[10], (LottieAnimationView) bindings[2], (ProgressBar) bindings[5], (ProgressBar) bindings[7], (ProgressBar) bindings[9], (ProgressBar) bindings[11], (CircularProgressIndicator) bindings[3]);
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
