package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class ItemSeriesCollectionEmptyBinding extends ViewDataBinding {
    public final LinearLayout toCameraLl;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemSeriesCollectionEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout toCameraLl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.toCameraLl = toCameraLl;
    }

    public static ItemSeriesCollectionEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSeriesCollectionEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemSeriesCollectionEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_series_collection_empty, root, attachToRoot, component);
    }

    public static ItemSeriesCollectionEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSeriesCollectionEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemSeriesCollectionEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_series_collection_empty, null, false, component);
    }

    public static ItemSeriesCollectionEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSeriesCollectionEmptyBinding bind(View view, Object component) {
        return (ItemSeriesCollectionEmptyBinding) bind(component, view, R.layout.item_series_collection_empty);
    }
}
