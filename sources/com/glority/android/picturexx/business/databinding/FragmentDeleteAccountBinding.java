package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes2.dex */
public abstract class FragmentDeleteAccountBinding extends ViewDataBinding {
    public final ImageView ivChecked;
    public final LinearLayout llConfirmContainer;
    public final LayoutToolbarBinding naviBar;
    public final TextView tvCancel;
    public final TextView tvDelete;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentDeleteAccountBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivChecked, LinearLayout llConfirmContainer, LayoutToolbarBinding naviBar, TextView tvCancel, TextView tvDelete) {
        super(_bindingComponent, _root, _localFieldCount);
        this.ivChecked = ivChecked;
        this.llConfirmContainer = llConfirmContainer;
        this.naviBar = naviBar;
        this.tvCancel = tvCancel;
        this.tvDelete = tvDelete;
    }

    public static FragmentDeleteAccountBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDeleteAccountBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentDeleteAccountBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_delete_account, root, attachToRoot, component);
    }

    public static FragmentDeleteAccountBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDeleteAccountBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentDeleteAccountBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_delete_account, null, false, component);
    }

    public static FragmentDeleteAccountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentDeleteAccountBinding bind(View view, Object component) {
        return (FragmentDeleteAccountBinding) bind(component, view, R.layout.fragment_delete_account);
    }
}
