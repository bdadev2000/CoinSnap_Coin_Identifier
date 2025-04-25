package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.cmsui2.databinding.CmsSeparatorBinding;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.ChatbotView;
import com.glority.base.abtest.CoinAbTestUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public class FragmentGradingDetailBindingImpl extends FragmentGradingDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final CmsSeparatorBinding mboundView1;
    private final LinearLayout mboundView2;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"cms_detail_bottom_bar3"}, new int[]{4}, new int[]{R.layout.cms_detail_bottom_bar3});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.coordinator_layout, 5);
        sparseIntArray.put(R.id.appbar, 6);
        sparseIntArray.put(R.id.collapsing_toolbar, 7);
        sparseIntArray.put(R.id.header_iv, 8);
        sparseIntArray.put(R.id.cl_name_container, 9);
        sparseIntArray.put(R.id.tv_name, 10);
        sparseIntArray.put(R.id.iv_name_arrow, 11);
        sparseIntArray.put(R.id.cms_view, 12);
        sparseIntArray.put(R.id.iv_close, 13);
        sparseIntArray.put(R.id.app_bar_layout, 14);
        sparseIntArray.put(R.id.iv_close2, 15);
        sparseIntArray.put(R.id.toolbar_title, 16);
        sparseIntArray.put(R.id.chatbot_view, 17);
        sparseIntArray.put(R.id.tv_cms_grading_report, 18);
    }

    public FragmentGradingDetailBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }

    private FragmentGradingDetailBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (LinearLayout) bindings[14], (AppBarLayout) bindings[6], (CmsDetailBottomBar3Binding) bindings[4], (ChatbotView) bindings[17], (ConstraintLayout) bindings[9], (CmsView) bindings[12], (CollapsingToolbarLayout) bindings[7], (CoordinatorLayout) bindings[5], (AppCompatImageView) bindings[8], (ImageView) bindings[13], (ImageView) bindings[15], (AppCompatImageView) bindings[11], (LinearLayout) bindings[1], (AppCompatTextView) bindings[16], (AppCompatTextView) bindings[18], (AppCompatTextView) bindings[10]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.bottomBar);
        this.llGradingMask.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        Object obj = bindings[3];
        this.mboundView1 = obj != null ? CmsSeparatorBinding.bind((View) obj) : null;
        LinearLayout linearLayout = (LinearLayout) bindings[2];
        this.mboundView2 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.bottomBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.bottomBar.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.bottomBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeBottomBar((CmsDetailBottomBar3Binding) object, fieldId);
    }

    private boolean onChangeBottomBar(CmsDetailBottomBar3Binding BottomBar, int fieldId) {
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
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        long j2 = j & 2;
        if (j2 != 0 && j2 != 0) {
            j |= CoinAbTestUtils.INSTANCE.enableCoinGradingReport() ? 8L : 4L;
        }
        if ((j & 2) != 0) {
            this.mboundView2.setVisibility(CoinAbTestUtils.INSTANCE.enableCoinGradingReport() ? 0 : 8);
        }
        executeBindingsOn(this.bottomBar);
    }
}
