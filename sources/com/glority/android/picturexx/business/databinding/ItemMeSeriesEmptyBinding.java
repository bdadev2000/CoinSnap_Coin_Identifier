package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ItemMeSeriesEmptyBinding extends ViewDataBinding {
    public final MaterialButton cpBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemMeSeriesEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton cpBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cpBt = cpBt;
    }

    public static ItemMeSeriesEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeSeriesEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemMeSeriesEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_series_empty, root, attachToRoot, component);
    }

    public static ItemMeSeriesEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeSeriesEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemMeSeriesEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_me_series_empty, null, false, component);
    }

    public static ItemMeSeriesEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemMeSeriesEmptyBinding bind(View view, Object component) {
        return (ItemMeSeriesEmptyBinding) bind(component, view, R.layout.item_me_series_empty);
    }
}
