package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public class ViewRecognizeHeaderBindingImpl extends ViewRecognizeHeaderBinding {
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
        sparseIntArray.put(R.id.mutli_image_layout, 1);
        sparseIntArray.put(R.id.double_image_layout, 2);
        sparseIntArray.put(R.id.iv1, 3);
        sparseIntArray.put(R.id.iv2, 4);
        sparseIntArray.put(R.id.single_image_layout, 5);
        sparseIntArray.put(R.id.theme_big_iv, 6);
        sparseIntArray.put(R.id.theme_desc_tv, 7);
        sparseIntArray.put(R.id.photo_ll, 8);
        sparseIntArray.put(R.id.photo_mask_arrow, 9);
        sparseIntArray.put(R.id.photo1_iv, 10);
        sparseIntArray.put(R.id.photo2_iv, 11);
        sparseIntArray.put(R.id.photo_mask, 12);
        sparseIntArray.put(R.id.official_ll, 13);
        sparseIntArray.put(R.id.official_mask_arrow, 14);
        sparseIntArray.put(R.id.official1_iv, 15);
        sparseIntArray.put(R.id.official2_iv, 16);
        sparseIntArray.put(R.id.official_mask, 17);
        sparseIntArray.put(R.id.theme_ll, 18);
        sparseIntArray.put(R.id.theme_mask_arrow, 19);
        sparseIntArray.put(R.id.theme_iv, 20);
        sparseIntArray.put(R.id.theme_mask, 21);
        sparseIntArray.put(R.id.single_iv, 22);
    }

    public ViewRecognizeHeaderBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }

    private ViewRecognizeHeaderBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (FrameLayout) bindings[2], (ImageView) bindings[3], (ImageView) bindings[4], (LinearLayout) bindings[1], (ImageView) bindings[15], (ImageView) bindings[16], (LinearLayout) bindings[13], (GlTextView) bindings[17], (ImageView) bindings[14], (ImageView) bindings[10], (ImageView) bindings[11], (LinearLayout) bindings[8], (GlTextView) bindings[12], (ImageView) bindings[9], (LinearLayout) bindings[5], (ImageView) bindings[22], (ShapeableImageView) bindings[6], (GlTextView) bindings[7], (ShapeableImageView) bindings[20], (LinearLayout) bindings[18], (GlTextView) bindings[21], (ImageView) bindings[19]);
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
