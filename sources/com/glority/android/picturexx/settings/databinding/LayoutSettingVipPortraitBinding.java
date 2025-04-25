package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class LayoutSettingVipPortraitBinding extends ViewDataBinding {
    public final Guideline glBottom;
    public final Guideline glEnd;
    public final Guideline glStart;
    public final Guideline glTop;
    public final ImageView ivAvatar;
    public final View vBackground;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutSettingVipPortraitBinding(Object obj, View view, int i, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ImageView imageView, View view2) {
        super(obj, view, i);
        this.glBottom = guideline;
        this.glEnd = guideline2;
        this.glStart = guideline3;
        this.glTop = guideline4;
        this.ivAvatar = imageView;
        this.vBackground = view2;
    }

    public static LayoutSettingVipPortraitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSettingVipPortraitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (LayoutSettingVipPortraitBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_setting_vip_portrait, viewGroup, z, obj);
    }

    public static LayoutSettingVipPortraitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSettingVipPortraitBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (LayoutSettingVipPortraitBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_setting_vip_portrait, null, false, obj);
    }

    public static LayoutSettingVipPortraitBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSettingVipPortraitBinding bind(View view, Object obj) {
        return (LayoutSettingVipPortraitBinding) bind(obj, view, R.layout.layout_setting_vip_portrait);
    }
}
