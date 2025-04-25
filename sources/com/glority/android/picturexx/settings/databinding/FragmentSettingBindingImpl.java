package com.glority.android.picturexx.settings.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.settings.BR;
import com.glority.android.picturexx.settings.R;
import com.glority.base.widget.SettingItem;

/* loaded from: classes5.dex */
public class FragmentSettingBindingImpl extends FragmentSettingBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(24);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_setting_toolbar"}, new int[]{1}, new int[]{R.layout.layout_setting_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.member_ll, 2);
        sparseIntArray.put(R.id.vip_support_item, 3);
        sparseIntArray.put(R.id.membership_manage_item, 4);
        sparseIntArray.put(R.id.restore_item, 5);
        sparseIntArray.put(R.id.support_ll, 6);
        sparseIntArray.put(R.id.suggestion_item, 7);
        sparseIntArray.put(R.id.account_ll, 8);
        sparseIntArray.put(R.id.account_item, 9);
        sparseIntArray.put(R.id.privacy_item, 10);
        sparseIntArray.put(R.id.term_item, 11);
        sparseIntArray.put(R.id.new_terms_of_use_item, 12);
        sparseIntArray.put(R.id.about_ll, 13);
        sparseIntArray.put(R.id.rate_item, 14);
        sparseIntArray.put(R.id.setting_share, 15);
        sparseIntArray.put(R.id.about_item, 16);
        sparseIntArray.put(R.id.testing_options, 17);
        sparseIntArray.put(R.id.setting_open_conversion_page, 18);
        sparseIntArray.put(R.id.setting_open_premium_center, 19);
        sparseIntArray.put(R.id.setting_open_premium_welcome, 20);
        sparseIntArray.put(R.id.setting_open_manage_membership, 21);
        sparseIntArray.put(R.id.setting_open_nps, 22);
        sparseIntArray.put(R.id.enable_debug_tool, 23);
    }

    public FragmentSettingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 24, sIncludes, sViewsWithIds));
    }

    private FragmentSettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (SettingItem) objArr[16], (LinearLayout) objArr[13], (SettingItem) objArr[9], (LinearLayout) objArr[8], (SwitchCompat) objArr[23], (LinearLayout) objArr[2], (SettingItem) objArr[4], (LayoutSettingToolbarBinding) objArr[1], (SettingItem) objArr[12], (SettingItem) objArr[10], (SettingItem) objArr[14], (SettingItem) objArr[5], (SettingItem) objArr[18], (SettingItem) objArr[21], (SettingItem) objArr[22], (SettingItem) objArr[19], (SettingItem) objArr[20], (SettingItem) objArr[15], (SettingItem) objArr[7], (LinearLayout) objArr[6], (SettingItem) objArr[11], (LinearLayout) objArr[17], (SettingItem) objArr[3]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.naviBar);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.naviBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return this.naviBar.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.naviBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeNaviBar((LayoutSettingToolbarBinding) obj, i2);
    }

    private boolean onChangeNaviBar(LayoutSettingToolbarBinding layoutSettingToolbarBinding, int i) {
        if (i != BR._all) {
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
        executeBindingsOn(this.naviBar);
    }
}
