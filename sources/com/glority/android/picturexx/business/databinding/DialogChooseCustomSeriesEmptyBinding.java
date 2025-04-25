package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogChooseCustomSeriesEmptyBinding extends ViewDataBinding {
    public final ImageView cancelIv;
    public final MaterialButton createBt;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogChooseCustomSeriesEmptyBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView cancelIv, MaterialButton createBt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cancelIv = cancelIv;
        this.createBt = createBt;
    }

    public static DialogChooseCustomSeriesEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChooseCustomSeriesEmptyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogChooseCustomSeriesEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_choose_custom_series_empty, root, attachToRoot, component);
    }

    public static DialogChooseCustomSeriesEmptyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChooseCustomSeriesEmptyBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogChooseCustomSeriesEmptyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_choose_custom_series_empty, null, false, component);
    }

    public static DialogChooseCustomSeriesEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChooseCustomSeriesEmptyBinding bind(View view, Object component) {
        return (DialogChooseCustomSeriesEmptyBinding) bind(component, view, R.layout.dialog_choose_custom_series_empty);
    }
}
