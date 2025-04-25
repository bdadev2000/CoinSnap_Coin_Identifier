package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemMeWishEmptyBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeWishEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static ItemMeWishEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeWishEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeWishEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_wish_empty, root, attachToRoot, component);
    }

    public static ItemMeWishEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeWishEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeWishEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_wish_empty, null, false, component);
    }

    public static ItemMeWishEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeWishEmptyBinding bind(View view, Object component) {
        return (ItemMeWishEmptyBinding) bind(component, view, R.layout.item_me_wish_empty);
    }
}
