package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public class ItemMeCollectionCardBindingImpl extends ItemMeCollectionCardBinding {
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
        sparseIntArray.put(R.id.iv_me_collection_picture, 1);
        sparseIntArray.put(R.id.iv_me_collection_coin_toe, 2);
        sparseIntArray.put(R.id.iv_me_collection_coin_header, 3);
        sparseIntArray.put(R.id.num_tv, 4);
        sparseIntArray.put(R.id.tv_me_collection_name, 5);
        sparseIntArray.put(R.id.ll_grade_info_container, 6);
        sparseIntArray.put(R.id.grade_tv, 7);
        sparseIntArray.put(R.id.price_tv, 8);
        sparseIntArray.put(R.id.iv_me_collection_more, 9);
    }

    public ItemMeCollectionCardBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }

    private ItemMeCollectionCardBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (AppCompatTextView) bindings[7], (AppCompatImageView) bindings[3], (AppCompatImageView) bindings[2], (FrameLayout) bindings[9], (LinearLayout) bindings[1], (LinearLayout) bindings[6], (TextView) bindings[4], (AppCompatTextView) bindings[8], (AppCompatTextView) bindings[5]);
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
