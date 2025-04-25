package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemCustomSeriesTopBarNewBinding extends ViewDataBinding {
    public final LinearLayout createBt;
    public final AppCompatTextView filterTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCustomSeriesTopBarNewBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout createBt, AppCompatTextView filterTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.createBt = createBt;
        this.filterTv = filterTv;
    }

    public static ItemCustomSeriesTopBarNewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesTopBarNewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCustomSeriesTopBarNewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_top_bar_new, root, attachToRoot, component);
    }

    public static ItemCustomSeriesTopBarNewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesTopBarNewBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCustomSeriesTopBarNewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_top_bar_new, null, false, component);
    }

    public static ItemCustomSeriesTopBarNewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesTopBarNewBinding bind(View view, Object component) {
        return (ItemCustomSeriesTopBarNewBinding) bind(component, view, R.layout.item_custom_series_top_bar_new);
    }
}
