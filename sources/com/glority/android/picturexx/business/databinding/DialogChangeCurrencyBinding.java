package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class DialogChangeCurrencyBinding extends ViewDataBinding {
    public final EditText et;
    public final RecyclerView rv;
    public final GlTextView tvCancel;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogChangeCurrencyBinding(Object _bindingComponent, View _root, int _localFieldCount, EditText et, RecyclerView rv, GlTextView tvCancel) {
        super(_bindingComponent, _root, _localFieldCount);
        this.et = et;
        this.rv = rv;
        this.tvCancel = tvCancel;
    }

    public static DialogChangeCurrencyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChangeCurrencyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogChangeCurrencyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_change_currency, root, attachToRoot, component);
    }

    public static DialogChangeCurrencyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChangeCurrencyBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogChangeCurrencyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_change_currency, null, false, component);
    }

    public static DialogChangeCurrencyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogChangeCurrencyBinding bind(View view, Object component) {
        return (DialogChangeCurrencyBinding) bind(component, view, R.layout.dialog_change_currency);
    }
}
