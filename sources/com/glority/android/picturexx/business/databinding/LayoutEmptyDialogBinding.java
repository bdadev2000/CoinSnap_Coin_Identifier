package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutEmptyDialogBinding extends ViewDataBinding {
    public final ComposeView composeView;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutEmptyDialogBinding(Object _bindingComponent, View _root, int _localFieldCount, ComposeView composeView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.composeView = composeView;
    }

    public static LayoutEmptyDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutEmptyDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutEmptyDialogBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_empty_dialog, root, attachToRoot, component);
    }

    public static LayoutEmptyDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutEmptyDialogBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutEmptyDialogBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_empty_dialog, null, false, component);
    }

    public static LayoutEmptyDialogBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutEmptyDialogBinding bind(View view, Object component) {
        return (LayoutEmptyDialogBinding) bind(component, view, R.layout.layout_empty_dialog);
    }
}
