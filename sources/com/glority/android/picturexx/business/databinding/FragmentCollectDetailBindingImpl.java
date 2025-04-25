package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.ImageViewDataBindingKt;
import com.glority.android.picturexx.business.R;
import com.glority.base.abtest.CoinAbTestUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public class FragmentCollectDetailBindingImpl extends FragmentCollectDetailBinding {
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
        sparseIntArray.put(R.id.coordinator_layout, 2);
        sparseIntArray.put(R.id.appbar, 3);
        sparseIntArray.put(R.id.collapsing_toolbar, 4);
        sparseIntArray.put(R.id.header_iv, 5);
        sparseIntArray.put(R.id.cms_view, 6);
        sparseIntArray.put(R.id.iv_share, 7);
        sparseIntArray.put(R.id.app_bar_layout, 8);
        sparseIntArray.put(R.id.iv_close2, 9);
        sparseIntArray.put(R.id.toolbar_title, 10);
        sparseIntArray.put(R.id.iv_share2, 11);
        sparseIntArray.put(R.id.bottom_bar, 12);
        sparseIntArray.put(R.id.progress_fl, 13);
    }

    public FragmentCollectDetailBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }

    private FragmentCollectDetailBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[8], (AppBarLayout) bindings[3], (FrameLayout) bindings[12], (CmsView) bindings[6], (CollapsingToolbarLayout) bindings[4], (CoordinatorLayout) bindings[2], (ImageView) bindings[5], (AppCompatImageView) bindings[1], (ImageView) bindings[9], (ImageView) bindings[7], (ImageView) bindings[11], (FrameLayout) bindings[13], (AppCompatTextView) bindings[10]);
        this.mDirtyFlags = -1L;
        this.ivClose.setTag(null);
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
        long j;
        AppCompatImageView appCompatImageView;
        int i;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0 && j2 != 0) {
            j |= CoinAbTestUtils.INSTANCE.enableV4H5() ? 4L : 2L;
        }
        if ((j & 1) != 0) {
            AppCompatImageView appCompatImageView2 = this.ivClose;
            if (CoinAbTestUtils.INSTANCE.enableV4H5()) {
                appCompatImageView = this.ivClose;
                i = R.color.White;
            } else {
                appCompatImageView = this.ivClose;
                i = R.color.Black;
            }
            ImageViewDataBindingKt.setImageTint(appCompatImageView2, getColorFromResource(appCompatImageView, i));
        }
    }
}
