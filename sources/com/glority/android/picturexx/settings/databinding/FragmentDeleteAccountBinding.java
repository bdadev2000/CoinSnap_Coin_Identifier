package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes5.dex */
public abstract class FragmentDeleteAccountBinding extends ViewDataBinding {
    public final ImageView ivChecked;
    public final LinearLayout llConfirmContainer;
    public final LayoutToolbarBinding naviBar;
    public final TextView tvCancel;
    public final TextView tvDelete;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentDeleteAccountBinding(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, LayoutToolbarBinding layoutToolbarBinding, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivChecked = imageView;
        this.llConfirmContainer = linearLayout;
        this.naviBar = layoutToolbarBinding;
        this.tvCancel = textView;
        this.tvDelete = textView2;
    }

    public static FragmentDeleteAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDeleteAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentDeleteAccountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_delete_account, viewGroup, z, obj);
    }

    public static FragmentDeleteAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDeleteAccountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentDeleteAccountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_delete_account, null, false, obj);
    }

    public static FragmentDeleteAccountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDeleteAccountBinding bind(View view, Object obj) {
        return (FragmentDeleteAccountBinding) bind(obj, view, R.layout.fragment_delete_account);
    }
}
