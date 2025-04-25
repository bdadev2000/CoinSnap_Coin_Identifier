package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class DialogEmptyComposeLayoutBinding extends ViewDataBinding {
    public final ComposeView composeView;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogEmptyComposeLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, ComposeView composeView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.composeView = composeView;
    }

    public static DialogEmptyComposeLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogEmptyComposeLayoutBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (DialogEmptyComposeLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_empty_compose_layout, root, attachToRoot, component);
    }

    public static DialogEmptyComposeLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogEmptyComposeLayoutBinding inflate(LayoutInflater inflater, Object component) {
        return (DialogEmptyComposeLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.dialog_empty_compose_layout, null, false, component);
    }

    public static DialogEmptyComposeLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogEmptyComposeLayoutBinding bind(View view, Object component) {
        return (DialogEmptyComposeLayoutBinding) bind(component, view, R.layout.dialog_empty_compose_layout);
    }
}
