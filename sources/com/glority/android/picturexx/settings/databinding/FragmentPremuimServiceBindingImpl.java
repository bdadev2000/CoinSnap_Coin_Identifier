package com.glority.android.picturexx.settings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.settings.BR;
import com.glority.base.R;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes5.dex */
public class FragmentPremuimServiceBindingImpl extends FragmentPremuimServiceBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_toolbar", "item_vipcard", "item_unvipcard"}, new int[]{1, 2, 3}, new int[]{R.layout.layout_toolbar, com.glority.android.picturexx.settings.R.layout.item_vipcard, com.glority.android.picturexx.settings.R.layout.item_unvipcard});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(com.glority.android.picturexx.settings.R.id.premium_title, 4);
        sparseIntArray.put(com.glority.android.picturexx.settings.R.id.container_v, 5);
    }

    public FragmentPremuimServiceBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private FragmentPremuimServiceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (LinearLayout) objArr[5], (LayoutToolbarBinding) objArr[1], (LinearLayout) objArr[4], (ItemUnvipcardBinding) objArr[3], (ItemVipcardBinding) objArr[2]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.layoutToolbar);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.unvipCard);
        setContainedBinding(this.vipCard);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8L;
        }
        this.layoutToolbar.invalidateAll();
        this.vipCard.invalidateAll();
        this.unvipCard.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.layoutToolbar.hasPendingBindings() || this.vipCard.hasPendingBindings() || this.unvipCard.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.layoutToolbar.setLifecycleOwner(lifecycleOwner);
        this.vipCard.setLifecycleOwner(lifecycleOwner);
        this.unvipCard.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeUnvipCard((ItemUnvipcardBinding) obj, i2);
        }
        if (i == 1) {
            return onChangeLayoutToolbar((LayoutToolbarBinding) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return onChangeVipCard((ItemVipcardBinding) obj, i2);
    }

    private boolean onChangeUnvipCard(ItemUnvipcardBinding itemUnvipcardBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeLayoutToolbar(LayoutToolbarBinding layoutToolbarBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVipCard(ItemVipcardBinding itemVipcardBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        executeBindingsOn(this.layoutToolbar);
        executeBindingsOn(this.vipCard);
        executeBindingsOn(this.unvipCard);
    }
}
