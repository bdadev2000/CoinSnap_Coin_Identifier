package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.cmsui2.databinding.CmsSeparatorBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class LayoutCmsGradingReportBindingImpl extends LayoutCmsGradingReportBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;
    private final LinearLayout mboundView1;
    private final CmsSeparatorBinding mboundView11;

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
        sparseIntArray.put(R.id.tv_cms_grading_report, 3);
        sparseIntArray.put(R.id.lottie_anim_cms_grading_report, 4);
        sparseIntArray.put(R.id.iv_cms_grading_report_helpful, 5);
        sparseIntArray.put(R.id.iv_cms_grading_report_unhelpful, 6);
        sparseIntArray.put(R.id.iv_cms_grading_report_copy, 7);
    }

    public LayoutCmsGradingReportBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }

    private LayoutCmsGradingReportBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (AppCompatImageView) bindings[7], (AppCompatImageView) bindings[5], (AppCompatImageView) bindings[6], (LottieAnimationView) bindings[4], (AppCompatTextView) bindings[3]);
        this.mDirtyFlags = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) bindings[0];
        this.mboundView0 = nestedScrollView;
        nestedScrollView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) bindings[1];
        this.mboundView1 = linearLayout;
        linearLayout.setTag(null);
        Object obj = bindings[2];
        this.mboundView11 = obj != null ? CmsSeparatorBinding.bind((View) obj) : null;
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
