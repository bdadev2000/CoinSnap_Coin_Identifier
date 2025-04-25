package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class DialogCreateSeriesBinding extends ViewDataBinding {
    public final ImageView cancelIv;
    public final GlTextView doneTv;
    public final EditText nameEt;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogCreateSeriesBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView cancelIv, GlTextView doneTv, EditText nameEt) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cancelIv = cancelIv;
        this.doneTv = doneTv;
        this.nameEt = nameEt;
    }

    public static DialogCreateSeriesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCreateSeriesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogCreateSeriesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_create_series, root, attachToRoot, component);
    }

    public static DialogCreateSeriesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCreateSeriesBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogCreateSeriesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_create_series, null, false, component);
    }

    public static DialogCreateSeriesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogCreateSeriesBinding bind(View view, Object component) {
        return (DialogCreateSeriesBinding) bind(component, view, R.layout.dialog_create_series);
    }
}
