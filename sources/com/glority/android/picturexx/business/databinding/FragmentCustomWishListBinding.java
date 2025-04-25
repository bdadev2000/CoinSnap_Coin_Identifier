package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.base.databinding.LayoutToolbarBinding;

/* loaded from: classes2.dex */
public abstract class FragmentCustomWishListBinding extends ViewDataBinding {
    public final RecyclerView rv;
    public final LayoutToolbarBinding toolBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentCustomWishListBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView rv, LayoutToolbarBinding toolBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.rv = rv;
        this.toolBar = toolBar;
    }

    public static FragmentCustomWishListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomWishListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentCustomWishListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_wish_list, root, attachToRoot, component);
    }

    public static FragmentCustomWishListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomWishListBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentCustomWishListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_custom_wish_list, null, false, component);
    }

    public static FragmentCustomWishListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCustomWishListBinding bind(View view, Object component) {
        return (FragmentCustomWishListBinding) bind(component, view, R.layout.fragment_custom_wish_list);
    }
}
