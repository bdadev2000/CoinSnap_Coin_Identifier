package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class DialogMeltPriceHintBinding extends ViewDataBinding {
    public final ComposeView composeView;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogMeltPriceHintBinding(Object _bindingComponent, View _root, int _localFieldCount, ComposeView composeView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.composeView = composeView;
    }

    public static DialogMeltPriceHintBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogMeltPriceHintBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogMeltPriceHintBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_melt_price_hint, root, attachToRoot, component);
    }

    public static DialogMeltPriceHintBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogMeltPriceHintBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogMeltPriceHintBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_melt_price_hint, null, false, component);
    }

    public static DialogMeltPriceHintBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogMeltPriceHintBinding bind(View view, Object component) {
        return (DialogMeltPriceHintBinding) bind(component, view, R.layout.dialog_melt_price_hint);
    }
}
