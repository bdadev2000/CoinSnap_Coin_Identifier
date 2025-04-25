package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ItemCustomSeriesEmptyBinding extends ViewDataBinding {
    public final MaterialButton createBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCustomSeriesEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton createBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.createBt = createBt;
    }

    public static ItemCustomSeriesEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCustomSeriesEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_empty, root, attachToRoot, component);
    }

    public static ItemCustomSeriesEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCustomSeriesEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_empty, null, false, component);
    }

    public static ItemCustomSeriesEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesEmptyBinding bind(View view, Object component) {
        return (ItemCustomSeriesEmptyBinding) bind(component, view, R.layout.item_custom_series_empty);
    }
}
