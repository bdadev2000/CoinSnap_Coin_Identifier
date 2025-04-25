package com.glority.android.picturexx.business.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.glority.android.picturexx.business.BR;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.LayoutSettingToolbarBinding;
import com.glority.base.widget.SettingItem;

/* loaded from: classes2.dex */
public class CustomFragmentSettingBindingImpl extends CustomFragmentSettingBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(33);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_setting_toolbar"}, new int[]{1}, new int[]{R.layout.layout_setting_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.member_ll, 2);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.vip_support_item, 3);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.membership_manage_item, 4);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.restore_item, 5);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.notesnap_item, 6);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.personalization_ll, 7);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.currency_item, 8);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.support_ll, 9);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.help_item, 10);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.suggestion_item, 11);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.account_ll, 12);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.account_item, 13);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.privacy_item, 14);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.term_item, 15);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.new_terms_of_use_item, 16);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.about_ll, 17);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.rate_item, 18);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.setting_share, 19);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.about_item, 20);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.testing_options, 21);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.setting_open_conversion_page, 22);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.setting_open_premium_center, 23);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.setting_open_premium_welcome, 24);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.setting_open_manage_membership, 25);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.setting_open_purchase_push_notice, 26);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.setting_open_nps, 27);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.enable_debug_tool, 28);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.tv_user_id, 29);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.tv_device_token, 30);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.et_device_info_input, 31);
        sparseIntArray.put(com.glority.android.picturexx.business.R.id.btn_confirm, 32);
    }

    public CustomFragmentSettingBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }

    private CustomFragmentSettingBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (SettingItem) bindings[20], (LinearLayout) bindings[17], (SettingItem) bindings[13], (LinearLayout) bindings[12], (AppCompatButton) bindings[32], (SettingItem) bindings[8], (SwitchCompat) bindings[28], (AppCompatEditText) bindings[31], (SettingItem) bindings[10], (LinearLayout) bindings[2], (SettingItem) bindings[4], (LayoutSettingToolbarBinding) bindings[1], (SettingItem) bindings[16], (SettingItem) bindings[6], (LinearLayout) bindings[7], (SettingItem) bindings[14], (SettingItem) bindings[18], (SettingItem) bindings[5], (SettingItem) bindings[22], (SettingItem) bindings[25], (SettingItem) bindings[27], (SettingItem) bindings[23], (SettingItem) bindings[24], (SettingItem) bindings[26], (SettingItem) bindings[19], (SettingItem) bindings[11], (LinearLayout) bindings[9], (SettingItem) bindings[15], (LinearLayout) bindings[21], (AppCompatTextView) bindings[30], (AppCompatTextView) bindings[29], (SettingItem) bindings[3]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.naviBar);
        setRootTag(root);
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return onChangeNaviBar((LayoutSettingToolbarBinding) object, fieldId);
    }

    private boolean onChangeNaviBar(LayoutSettingToolbarBinding NaviBar, int fieldId) {
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
        executeBindingsOn(this.naviBar);
    }
}
