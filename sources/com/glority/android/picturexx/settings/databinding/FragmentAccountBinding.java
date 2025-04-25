package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class FragmentAccountBinding extends ViewDataBinding {
    public final ImageView btnBack;
    public final ImageView ivAccountIcon;
    public final TextView tvAccountName;
    public final TextView tvLogout;
    public final TextView tvNick;
    public final LayoutSettingVipPortraitBinding userPortrait;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentAccountBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, LayoutSettingVipPortraitBinding layoutSettingVipPortraitBinding) {
        super(obj, view, i);
        this.btnBack = imageView;
        this.ivAccountIcon = imageView2;
        this.tvAccountName = textView;
        this.tvLogout = textView2;
        this.tvNick = textView3;
        this.userPortrait = layoutSettingVipPortraitBinding;
    }

    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentAccountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_account, viewGroup, z, obj);
    }

    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentAccountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_account, null, false, obj);
    }

    public static FragmentAccountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAccountBinding bind(View view, Object obj) {
        return (FragmentAccountBinding) bind(obj, view, R.layout.fragment_account);
    }
}
