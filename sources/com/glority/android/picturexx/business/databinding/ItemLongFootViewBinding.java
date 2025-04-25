package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemLongFootViewBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public ItemLongFootViewBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static ItemLongFootViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLongFootViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemLongFootViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_long_foot_view, root, attachToRoot, component);
    }

    public static ItemLongFootViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLongFootViewBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemLongFootViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_long_foot_view, null, false, component);
    }

    public static ItemLongFootViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLongFootViewBinding bind(View view, Object component) {
        return (ItemLongFootViewBinding) bind(component, view, R.layout.item_long_foot_view);
    }
}
