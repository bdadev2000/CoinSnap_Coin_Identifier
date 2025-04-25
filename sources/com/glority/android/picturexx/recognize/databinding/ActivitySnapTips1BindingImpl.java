package com.glority.android.picturexx.recognize.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes5.dex */
public class ActivitySnapTips1BindingImpl extends ActivitySnapTips1Binding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final FrameLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.gl_center, 1);
        sparseIntArray.put(R.id.img_top1, 2);
        sparseIntArray.put(R.id.img_top2, 3);
        sparseIntArray.put(R.id.img_bottom1, 4);
        sparseIntArray.put(R.id.img_bottom2, 5);
        sparseIntArray.put(R.id.img_bottom3, 6);
        sparseIntArray.put(R.id.tv_bottom1, 7);
        sparseIntArray.put(R.id.tv_bottom2, 8);
        sparseIntArray.put(R.id.tv_bottom3, 9);
        sparseIntArray.put(R.id.tv_continue, 10);
    }

    public ActivitySnapTips1BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    private ActivitySnapTips1BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[1], (ImageView) objArr[4], (ImageView) objArr[5], (ImageView) objArr[6], (ImageView) objArr[2], (ImageView) objArr[3], (GlTextView) objArr[7], (GlTextView) objArr[8], (GlTextView) objArr[9], (MaterialButton) objArr[10]);
        this.mDirtyFlags = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
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
