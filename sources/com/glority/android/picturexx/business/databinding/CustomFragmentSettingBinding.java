package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.settings.databinding.LayoutSettingToolbarBinding;
import com.glority.base.widget.SettingItem;

/* loaded from: classes2.dex */
public abstract class CustomFragmentSettingBinding extends ViewDataBinding {
    public final SettingItem aboutItem;
    public final LinearLayout aboutLl;
    public final SettingItem accountItem;
    public final LinearLayout accountLl;
    public final AppCompatButton btnConfirm;
    public final SettingItem currencyItem;
    public final SwitchCompat enableDebugTool;
    public final AppCompatEditText etDeviceInfoInput;
    public final SettingItem helpItem;
    public final LinearLayout memberLl;
    public final SettingItem membershipManageItem;
    public final LayoutSettingToolbarBinding naviBar;
    public final SettingItem newTermsOfUseItem;
    public final SettingItem notesnapItem;
    public final LinearLayout personalizationLl;
    public final SettingItem privacyItem;
    public final SettingItem rateItem;
    public final SettingItem restoreItem;
    public final SettingItem settingOpenConversionPage;
    public final SettingItem settingOpenManageMembership;
    public final SettingItem settingOpenNps;
    public final SettingItem settingOpenPremiumCenter;
    public final SettingItem settingOpenPremiumWelcome;
    public final SettingItem settingOpenPurchasePushNotice;
    public final SettingItem settingShare;
    public final SettingItem suggestionItem;
    public final LinearLayout supportLl;
    public final SettingItem termItem;
    public final LinearLayout testingOptions;
    public final AppCompatTextView tvDeviceToken;
    public final AppCompatTextView tvUserId;
    public final SettingItem vipSupportItem;

    /* JADX INFO: Access modifiers changed from: protected */
    public CustomFragmentSettingBinding(Object _bindingComponent, View _root, int _localFieldCount, SettingItem aboutItem, LinearLayout aboutLl, SettingItem accountItem, LinearLayout accountLl, AppCompatButton btnConfirm, SettingItem currencyItem, SwitchCompat enableDebugTool, AppCompatEditText etDeviceInfoInput, SettingItem helpItem, LinearLayout memberLl, SettingItem membershipManageItem, LayoutSettingToolbarBinding naviBar, SettingItem newTermsOfUseItem, SettingItem notesnapItem, LinearLayout personalizationLl, SettingItem privacyItem, SettingItem rateItem, SettingItem restoreItem, SettingItem settingOpenConversionPage, SettingItem settingOpenManageMembership, SettingItem settingOpenNps, SettingItem settingOpenPremiumCenter, SettingItem settingOpenPremiumWelcome, SettingItem settingOpenPurchasePushNotice, SettingItem settingShare, SettingItem suggestionItem, LinearLayout supportLl, SettingItem termItem, LinearLayout testingOptions, AppCompatTextView tvDeviceToken, AppCompatTextView tvUserId, SettingItem vipSupportItem) {
        super(_bindingComponent, _root, _localFieldCount);
        this.aboutItem = aboutItem;
        this.aboutLl = aboutLl;
        this.accountItem = accountItem;
        this.accountLl = accountLl;
        this.btnConfirm = btnConfirm;
        this.currencyItem = currencyItem;
        this.enableDebugTool = enableDebugTool;
        this.etDeviceInfoInput = etDeviceInfoInput;
        this.helpItem = helpItem;
        this.memberLl = memberLl;
        this.membershipManageItem = membershipManageItem;
        this.naviBar = naviBar;
        this.newTermsOfUseItem = newTermsOfUseItem;
        this.notesnapItem = notesnapItem;
        this.personalizationLl = personalizationLl;
        this.privacyItem = privacyItem;
        this.rateItem = rateItem;
        this.restoreItem = restoreItem;
        this.settingOpenConversionPage = settingOpenConversionPage;
        this.settingOpenManageMembership = settingOpenManageMembership;
        this.settingOpenNps = settingOpenNps;
        this.settingOpenPremiumCenter = settingOpenPremiumCenter;
        this.settingOpenPremiumWelcome = settingOpenPremiumWelcome;
        this.settingOpenPurchasePushNotice = settingOpenPurchasePushNotice;
        this.settingShare = settingShare;
        this.suggestionItem = suggestionItem;
        this.supportLl = supportLl;
        this.termItem = termItem;
        this.testingOptions = testingOptions;
        this.tvDeviceToken = tvDeviceToken;
        this.tvUserId = tvUserId;
        this.vipSupportItem = vipSupportItem;
    }

    public static CustomFragmentSettingBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomFragmentSettingBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CustomFragmentSettingBinding) ViewDataBinding.inflateInternal(inflater, R.layout.custom_fragment_setting, root, attachToRoot, component);
    }

    public static CustomFragmentSettingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomFragmentSettingBinding inflate(LayoutInflater inflater, Object component) {
        return (CustomFragmentSettingBinding) ViewDataBinding.inflateInternal(inflater, R.layout.custom_fragment_setting, null, false, component);
    }

    public static CustomFragmentSettingBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CustomFragmentSettingBinding bind(View view, Object component) {
        return (CustomFragmentSettingBinding) bind(component, view, R.layout.custom_fragment_setting);
    }
}
