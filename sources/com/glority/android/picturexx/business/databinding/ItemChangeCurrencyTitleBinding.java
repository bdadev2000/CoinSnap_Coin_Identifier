package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public abstract class ItemChangeCurrencyTitleBinding extends ViewDataBinding {
    public final GlTextView nameTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemChangeCurrencyTitleBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView nameTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.nameTv = nameTv;
    }

    public static ItemChangeCurrencyTitleBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemChangeCurrencyTitleBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemChangeCurrencyTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_change_currency_title, root, attachToRoot, component);
    }

    public static ItemChangeCurrencyTitleBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemChangeCurrencyTitleBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemChangeCurrencyTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_change_currency_title, null, false, component);
    }

    public static ItemChangeCurrencyTitleBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemChangeCurrencyTitleBinding bind(View view, Object component) {
        return (ItemChangeCurrencyTitleBinding) bind(component, view, R.layout.item_change_currency_title);
    }
}
