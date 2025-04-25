package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.glority.base.widget.ScrollControlViewPager;

/* loaded from: classes5.dex */
public abstract class FragmentResetPasswordBinding extends ViewDataBinding {
    public final ImageView ivBack;
    public final ScrollControlViewPager vp;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentResetPasswordBinding(Object obj, View view, int i, ImageView imageView, ScrollControlViewPager scrollControlViewPager) {
        super(obj, view, i);
        this.ivBack = imageView;
        this.vp = scrollControlViewPager;
    }

    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentResetPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_reset_password, viewGroup, z, obj);
    }

    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetPasswordBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentResetPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_reset_password, null, false, obj);
    }

    public static FragmentResetPasswordBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentResetPasswordBinding bind(View view, Object obj) {
        return (FragmentResetPasswordBinding) bind(obj, view, R.layout.fragment_reset_password);
    }
}
