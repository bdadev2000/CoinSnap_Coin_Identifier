package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class DialogChooseCustomSeriesBinding extends ViewDataBinding {
    public final ImageView cancelIv;
    public final MaterialButton createBt;
    public final GlTextView doneBt;
    public final DialogChooseCustomSeriesEmptyBinding emptyLayout;
    public final GlTextView filterTv;
    public final LinearLayout fullDataLayout;
    public final RecyclerView rv;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogChooseCustomSeriesBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView cancelIv, MaterialButton createBt, GlTextView doneBt, DialogChooseCustomSeriesEmptyBinding emptyLayout, GlTextView filterTv, LinearLayout fullDataLayout, RecyclerView rv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cancelIv = cancelIv;
        this.createBt = createBt;
        this.doneBt = doneBt;
        this.emptyLayout = emptyLayout;
        this.filterTv = filterTv;
        this.fullDataLayout = fullDataLayout;
        this.rv = rv;
    }

    public static DialogChooseCustomSeriesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChooseCustomSeriesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogChooseCustomSeriesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_choose_custom_series, root, attachToRoot, component);
    }

    public static DialogChooseCustomSeriesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChooseCustomSeriesBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogChooseCustomSeriesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_choose_custom_series, null, false, component);
    }

    public static DialogChooseCustomSeriesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChooseCustomSeriesBinding bind(View view, Object component) {
        return (DialogChooseCustomSeriesBinding) bind(component, view, R.layout.dialog_choose_custom_series);
    }
}
