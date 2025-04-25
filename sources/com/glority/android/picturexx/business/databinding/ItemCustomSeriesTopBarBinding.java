package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ItemCustomSeriesTopBarBinding extends ViewDataBinding {
    public final MaterialButton createBt;
    public final GlTextView filterTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCustomSeriesTopBarBinding(Object _bindingComponent, View _root, int _localFieldCount, MaterialButton createBt, GlTextView filterTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.createBt = createBt;
        this.filterTv = filterTv;
    }

    public static ItemCustomSeriesTopBarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesTopBarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemCustomSeriesTopBarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_top_bar, root, attachToRoot, component);
    }

    public static ItemCustomSeriesTopBarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesTopBarBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemCustomSeriesTopBarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_custom_series_top_bar, null, false, component);
    }

    public static ItemCustomSeriesTopBarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCustomSeriesTopBarBinding bind(View view, Object component) {
        return (ItemCustomSeriesTopBarBinding) bind(component, view, R.layout.item_custom_series_top_bar);
    }
}
