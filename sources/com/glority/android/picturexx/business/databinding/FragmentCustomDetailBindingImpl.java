package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.widget.ChatbotView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public class FragmentCustomDetailBindingImpl extends FragmentCustomDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(15);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"item_add_collection_notice"}, new int[]{1}, new int[]{R.layout.item_add_collection_notice});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.coordinator_layout, 2);
        sparseIntArray.put(R.id.appbar, 3);
        sparseIntArray.put(R.id.collapsing_toolbar, 4);
        sparseIntArray.put(R.id.cms_view, 5);
        sparseIntArray.put(R.id.iv_close, 6);
        sparseIntArray.put(R.id.iv_share, 7);
        sparseIntArray.put(R.id.app_bar_layout, 8);
        sparseIntArray.put(R.id.iv_close2, 9);
        sparseIntArray.put(R.id.toolbar_title, 10);
        sparseIntArray.put(R.id.iv_share2, 11);
        sparseIntArray.put(R.id.bottom_bar, 12);
        sparseIntArray.put(R.id.chatbot_view, 13);
        sparseIntArray.put(R.id.progress_fl, 14);
    }

    public FragmentCustomDetailBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }

    private FragmentCustomDetailBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ItemAddCollectionNoticeBinding) bindings[1], (LinearLayout) bindings[8], (AppBarLayout) bindings[3], (FrameLayout) bindings[12], (ChatbotView) bindings[13], (CmsView) bindings[5], (CollapsingToolbarLayout) bindings[4], (CoordinatorLayout) bindings[2], (ImageView) bindings[6], (ImageView) bindings[9], (ImageView) bindings[7], (ImageView) bindings[11], (FrameLayout) bindings[14], (AppCompatTextView) bindings[10]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.addCollectionNoticeLl);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.addCollectionNoticeLl.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.addCollectionNoticeLl.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.addCollectionNoticeLl.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeAddCollectionNoticeLl((ItemAddCollectionNoticeBinding) object, fieldId);
    }

    private boolean onChangeAddCollectionNoticeLl(ItemAddCollectionNoticeBinding AddCollectionNoticeLl, int fieldId) {
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
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        executeBindingsOn(this.addCollectionNoticeLl);
    }
}
