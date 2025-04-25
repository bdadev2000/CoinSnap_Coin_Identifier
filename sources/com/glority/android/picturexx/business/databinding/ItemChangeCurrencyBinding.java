package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemChangeCurrencyBinding extends ViewDataBinding {
    public final ImageView checkIv;
    public final GlTextView nameTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemChangeCurrencyBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView checkIv, GlTextView nameTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.checkIv = checkIv;
        this.nameTv = nameTv;
    }

    public static ItemChangeCurrencyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemChangeCurrencyBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemChangeCurrencyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_change_currency, root, attachToRoot, component);
    }

    public static ItemChangeCurrencyBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemChangeCurrencyBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemChangeCurrencyBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_change_currency, null, false, component);
    }

    public static ItemChangeCurrencyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemChangeCurrencyBinding bind(View view, Object component) {
        return (ItemChangeCurrencyBinding) bind(component, view, R.layout.item_change_currency);
    }
}
