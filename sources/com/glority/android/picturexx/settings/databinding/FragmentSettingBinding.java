package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.glority.base.widget.SettingItem;

/* loaded from: classes5.dex */
public abstract class FragmentSettingBinding extends ViewDataBinding {
    public final SettingItem aboutItem;
    public final LinearLayout aboutLl;
    public final SettingItem accountItem;
    public final LinearLayout accountLl;
    public final SwitchCompat enableDebugTool;
    public final LinearLayout memberLl;
    public final SettingItem membershipManageItem;
    public final LayoutSettingToolbarBinding naviBar;
    public final SettingItem newTermsOfUseItem;
    public final SettingItem privacyItem;
    public final SettingItem rateItem;
    public final SettingItem restoreItem;
    public final SettingItem settingOpenConversionPage;
    public final SettingItem settingOpenManageMembership;
    public final SettingItem settingOpenNps;
    public final SettingItem settingOpenPremiumCenter;
    public final SettingItem settingOpenPremiumWelcome;
    public final SettingItem settingShare;
    public final SettingItem suggestionItem;
    public final LinearLayout supportLl;
    public final SettingItem termItem;
    public final LinearLayout testingOptions;
    public final SettingItem vipSupportItem;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSettingBinding(Object obj, View view, int i, SettingItem settingItem, LinearLayout linearLayout, SettingItem settingItem2, LinearLayout linearLayout2, SwitchCompat switchCompat, LinearLayout linearLayout3, SettingItem settingItem3, LayoutSettingToolbarBinding layoutSettingToolbarBinding, SettingItem settingItem4, SettingItem settingItem5, SettingItem settingItem6, SettingItem settingItem7, SettingItem settingItem8, SettingItem settingItem9, SettingItem settingItem10, SettingItem settingItem11, SettingItem settingItem12, SettingItem settingItem13, SettingItem settingItem14, LinearLayout linearLayout4, SettingItem settingItem15, LinearLayout linearLayout5, SettingItem settingItem16) {
        super(obj, view, i);
        this.aboutItem = settingItem;
        this.aboutLl = linearLayout;
        this.accountItem = settingItem2;
        this.accountLl = linearLayout2;
        this.enableDebugTool = switchCompat;
        this.memberLl = linearLayout3;
        this.membershipManageItem = settingItem3;
        this.naviBar = layoutSettingToolbarBinding;
        this.newTermsOfUseItem = settingItem4;
        this.privacyItem = settingItem5;
        this.rateItem = settingItem6;
        this.restoreItem = settingItem7;
        this.settingOpenConversionPage = settingItem8;
        this.settingOpenManageMembership = settingItem9;
        this.settingOpenNps = settingItem10;
        this.settingOpenPremiumCenter = settingItem11;
        this.settingOpenPremiumWelcome = settingItem12;
        this.settingShare = settingItem13;
        this.suggestionItem = settingItem14;
        this.supportLl = linearLayout4;
        this.termItem = settingItem15;
        this.testingOptions = linearLayout5;
        this.vipSupportItem = settingItem16;
    }

    public static FragmentSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSettingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_setting, viewGroup, z, obj);
    }

    public static FragmentSettingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSettingBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_setting, null, false, obj);
    }

    public static FragmentSettingBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSettingBinding bind(View view, Object obj) {
        return (FragmentSettingBinding) bind(obj, view, R.layout.fragment_setting);
    }
}
